import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.TinyPiSXLexer;
import parser.TinyPiSXParser;

public class Interpreter extends InterpreterBase {
	void evalStmt(ASTNode ndx, Environment env) {
		if (ndx instanceof ASTCompoundStmtNode) {
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			for (ASTNode child: nd.stmts)
				evalStmt(child, env);
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
			Variable var = env.lookup(nd.var);
			if (var == null)
				throw new Error("Undefined variable: "+nd.var);
			int value = evalExpr(nd.expr, env);
			var.set(value);
		} else if (ndx instanceof ASTIfStmtNode) {
			ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
			if (evalExpr(nd.cond, env) != 0)
				evalStmt(nd.thenClause, env);
			else
				evalStmt(nd.elseClause, env);
		} else if (ndx instanceof ASTWhileStmtNode) {
			ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			if (evalExpr(nd.cond, env) != 0) {
				evalStmt(nd.stmt, env);
				evalStmt(nd, env);
			}
		} else if (ndx instanceof ASTPrintStmtNode) {
			ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			System.out.println(String.format("%08X", evalExpr(nd.expr, env)));
		} else {
			throw new Error("Unknown statement: "+ndx);
		}
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
				throw new Error("Undefined variable: "+nd.varName);
			return var.get();
		} else {
			throw new Error("Unknown expression: "+ndx);
		}
	}

	public int eval(ASTNode ast) {
		Environment env = new Environment();
		ASTProgNode prog = (ASTProgNode) ast;
		for (String varName: prog.varDecls) {
			if (env.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			addGlobalVariable(env, varName, 0);
		}
		if (env.lookup("answer") == null)
			addGlobalVariable(env, "answer", 0);
		evalStmt(prog.stmt, env);
		Variable varAnswer = env.lookup("answer");
		return varAnswer.get();
	}

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		TinyPiSXLexer lexer = new TinyPiSXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
        TinyPiSXParser parser = new TinyPiSXParser(token);
        ParseTree tree = parser.prog();
        ASTGenerator astgen = new ASTGenerator();
        ASTNode ast = astgen.translate(tree);
        Interpreter interp = new Interpreter();
        int answer = interp.eval(ast);
        System.out.println(answer);
	}
}
