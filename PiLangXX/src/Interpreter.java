import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangXXLexer;
import parser.PiLangXXParser;

public class Interpreter extends InterpreterBase {
	static class ReturnValue {
		ReturnValue(int value) {
			this.value = value;
		}
		int value;
	}
	
	Environment globalEnv;
	ASTProgNode prog;
	boolean breakFlag;
	boolean continueFlag;
	ASTFunctionNode lookupFunction(String name) {
		for (ASTFunctionNode func: prog.funcDecls)
			if (func.name.equals(name))
				return func;
		throw new Error("undefined functin: "+name);
	}

	int evalFunction(ASTFunctionNode nd, ArrayList<Integer> args) {
		Environment env = new Environment();
		for (int i = 0; i < nd.params.size(); i++) {
			String name = nd.params.get(i);
			Variable var = new Variable(name);
			int arg = args.get(i);
			var.set(arg);
			env.push(var);
		}

		for (int i = 0; i < nd.varDecls.size(); i++) {
			String name = nd.varDecls.get(i);
			Variable var = new Variable(name);
			var.set(0);
			env.push(var);
		}

		for (ASTNode stmt: nd.stmts) {
			ReturnValue retval = evalStmt(stmt, env);
			if (retval != null)
				return retval.value;
		}
		return 0;
	}

	ReturnValue evalStmt(ASTNode ndx, Environment env) {
		ReturnValue returnValue = null;
		if (breakFlag)
			return returnValue;
		if (continueFlag)
			return returnValue;
		if (ndx instanceof ASTCompoundStmtNode) {
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			for (ASTNode child: nd.stmts) {
				returnValue = evalStmt(child, env);
				if (returnValue != null)
					return returnValue;
			}
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
			Variable var = env.lookup(nd.var);
			if (var == null)
				var = globalEnv.lookup(nd.var);
			if (var == null)
				throw new Error("Undefined variable: "+nd.var);
			int value = evalExpr(nd.expr, env);
			var.set(value);
		} else if (ndx instanceof ASTIfStmtNode) {
			ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
			if (evalExpr(nd.cond, env) != 0)
				returnValue = evalStmt(nd.thenClause, env);
			else
				returnValue = evalStmt(nd.elseClause, env);
			if (returnValue != null)
				return returnValue;
		} else if (ndx instanceof ASTWhileStmtNode) {
			ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			if (evalExpr(nd.cond, env) != 0) {
				returnValue = evalStmt(nd.stmt, env);
				if (returnValue != null)
					return returnValue;
				returnValue = evalStmt(nd, env);
				if (returnValue != null)
					return returnValue;
			}
			if (continueFlag) {
				continueFlag = false;
				returnValue = evalStmt(nd, env);
			}
			breakFlag = false;
		} else if (ndx instanceof ASTReturnStmtNode) {
			ASTReturnStmtNode nd = (ASTReturnStmtNode) ndx;
			int value = evalExpr(nd.expr, env);
			return new ReturnValue(value);
		} else if (ndx instanceof ASTPrintStmtNode) {
			ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			System.out.println(String.format("%08X", evalExpr(nd.expr, env)));
		} else if (ndx instanceof ASTBreakStmtNode) {
			breakFlag = true;
		} else if (ndx instanceof ASTContinueStmtNode) {
			continueFlag = true;
		} else {
			throw new Error("Unknown statement: "+ndx);
		}
		return null;
	}

	int evalExpr(ASTNode ndx, Environment env) {
		if (ndx instanceof ASTBinaryExprNode) {
			ASTBinaryExprNode nd = (ASTBinaryExprNode) ndx;
			int lhsValue = evalExpr(nd.lhs, env);
			int rhsValue = evalExpr(nd.rhs, env);
			boolean lhsBool = lhsValue != 0;
			boolean rhsBool = rhsValue != 0;
			if (nd.op.equals("||"))
				return lhsBool || rhsBool? 1:0;
			else if (nd.op.equals("&&"))
				return lhsBool && rhsBool? 1:0;
			else if (nd.op.equals("|"))
				return lhsValue | rhsValue;
			else if (nd.op.equals("&"))
				return lhsValue & rhsValue;
			else if (nd.op.equals("=="))
				return lhsValue == rhsValue? 1 : 0;
			else if (nd.op.equals("!="))
				return lhsValue != rhsValue? 1 : 0;
			else if (nd.op.equals("<"))
				return lhsValue < rhsValue? 1 : 0;
			else if (nd.op.equals("<="))
				return lhsValue <= rhsValue? 1 : 0;
			else if (nd.op.equals(">"))
				return lhsValue > rhsValue? 1 : 0;
			else if (nd.op.equals(">="))
				return lhsValue >= rhsValue? 1 : 0;
			else if (nd.op.equals("+"))
				return lhsValue + rhsValue;
			else if (nd.op.equals("-"))
				return lhsValue - rhsValue;
			else if (nd.op.equals("*"))
				return lhsValue * rhsValue;
			else if (nd.op.equals("/"))
				return lhsValue / rhsValue;
			else
				throw new Error("Unknwon operator: "+nd.op);
		} else if (ndx instanceof ASTUnaryExprNode) {
			ASTUnaryExprNode nd = (ASTUnaryExprNode) ndx;
			int operand = evalExpr(nd.operand, env);
			if (nd.op.equals("-"))
				return -1 * operand;
			else if (nd.op.equals("~"))
				return ~operand;
			else if (nd.op.equals("!"))
				return operand == 0? 1:0;
			else
				throw new Error("Unknown operator: " + nd.op);
		} else if (ndx instanceof ASTNumberNode) {
			ASTNumberNode nd = (ASTNumberNode) ndx;
			return nd.value;
		} else if (ndx instanceof ASTVarRefNode) {
			ASTVarRefNode nd = (ASTVarRefNode) ndx;
			Variable var = env.lookup(nd.varName);
			if (var == null)
				var = globalEnv.lookup(nd.varName);
			if (var == null)
				throw new Error("Undefined variable: "+nd.varName);
			return var.get();
		} else if (ndx instanceof ASTCallNode) {
			ASTCallNode nd = (ASTCallNode) ndx;
			ASTFunctionNode func = lookupFunction(nd.name);
			ArrayList<Integer> args = new ArrayList<Integer>();
			for (ASTNode argNode: nd.args) {
				int arg = evalExpr(argNode, env);
				args.add(arg);
			}
			return evalFunction(func, args);
		} else {
			throw new Error("Unknown expression: "+ndx);
		}
	}
	
	public int eval(ASTNode ast) {
		globalEnv = new Environment();
		prog = (ASTProgNode) ast;
		breakFlag = false;
		continueFlag = false;
		for (String varName: prog.varDecls) {
			if (globalEnv.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			addGlobalVariable(globalEnv, varName, 0);
		}
		
		ASTFunctionNode mainFunc = lookupFunction("main");
		ArrayList<Integer> args = new ArrayList<Integer>();
		int answer = evalFunction(mainFunc, args);
		return answer;
	}

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PiLangXXLexer lexer = new PiLangXXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		PiLangXXParser parser = new PiLangXXParser(token);
		ParseTree tree = parser.prog();
		ASTGenerator astgen = new ASTGenerator();
		ASTNode ast = astgen.translate(tree);
		Interpreter interp = new Interpreter();
		int answer = interp.eval(ast);
		System.out.println(answer);
	}
}
