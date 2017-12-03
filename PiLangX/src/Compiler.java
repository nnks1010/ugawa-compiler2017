import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangXLexer;
import parser.PiLangXParser;

public class Compiler extends CompilerBase {
	Environment globalEnv;
	
	void compileFunction(ASTFunctionNode nd) {
		Environment env = new Environment();
		String epilogueLabel = freshLabel();
		for (int i = 0; i < nd.params.size(); i++) {
			String name = nd.params.get(i);
			int offset = 4 * (i + 1);
			LocalVariable var = new LocalVariable(name, offset);
			env.push(var);
		}

		for (int i = 0; i < nd.varDecls.size(); i++) {
			String name = nd.varDecls.get(i);
			int offset = -4 * (i + 3);
			LocalVariable var = new LocalVariable(name, offset);
			env.push(var);
		}

		emitLabel(nd.name);
		System.out.println("\t@ prologue");
		emitPUSH(REG_FP);
		emitRR("mov", REG_FP, REG_SP);
		emitPUSH(REG_LR);
		emitPUSH(REG_R1);
		emitRRI("sub", REG_SP, REG_SP, nd.varDecls.size() * 4);
		for (ASTNode stmt: nd.stmts)
			compileStmt(stmt, epilogueLabel, env);
		emitRI("mov", REG_DST, 0);	// return がなかった場合の戻り値 0
		emitLabel(epilogueLabel);
		System.out.println("\t@ epilogue");
		emitRRI("add", REG_SP, REG_SP, nd.varDecls.size() * 4);
		emitPOP(REG_R1);
		emitPOP(REG_LR);
		emitPOP(REG_FP);
		emitRET();
	}
	
	void compileStmt(ASTNode ndx, String epilogueLabel, Environment env) {
	    if (ndx instanceof ASTCompoundStmtNode) {
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			for (ASTNode child: nd.stmts)
				compileStmt(child, epilogueLabel, env);
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
			Variable var = env.lookup(nd.var);
			if (var == null)
				var = globalEnv.lookup(nd.var);
			if (var == null)
				throw new Error("Undefined variable: "+nd.var);
			compileExpr(nd.expr, env);
		    if (var instanceof GlobalVariable) {
		    	GlobalVariable globalVar = (GlobalVariable) var;
		    	emitLDC(REG_R1, globalVar.getLabel());
		    	emitSTR(REG_DST, REG_R1, 0);
			} else {
				LocalVariable localVar = (LocalVariable) var;
				int offset = localVar.offset;
				emitSTR(REG_DST, REG_FP, offset);
			}
		} else if (ndx instanceof ASTIfStmtNode) {
			ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
			String elseLabel = freshLabel();
			String endLabel = freshLabel();
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", elseLabel);
			compileStmt(nd.thenClause, epilogueLabel, env);
			emitJMP("b", endLabel);
			emitLabel(elseLabel);
			compileStmt(nd.elseClause, epilogueLabel, env);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTWhileStmtNode) {
			ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			String loopLabel = freshLabel();
			String endLabel = freshLabel();
			emitLabel(loopLabel);
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", endLabel);
			compileStmt(nd.stmt, epilogueLabel,env);
			emitJMP("b", loopLabel);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTReturnStmtNode) {
			ASTReturnStmtNode nd = (ASTReturnStmtNode) ndx;
			compileExpr(nd.expr, env);
			emitJMP("b", epilogueLabel);
		} else if (ndx instanceof ASTPrintStmtNode) {
			ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			compileExpr(nd.expr, env);
			emitCALL("_print_r0");
		} else
			throw new Error("Unknown expression: "+ndx);
	}

	void compileExpr(ASTNode ndx, Environment env) {
		if (ndx instanceof ASTBinaryExprNode) {
			ASTBinaryExprNode nd = (ASTBinaryExprNode) ndx;
			compileExpr(nd.lhs, env);
			emitPUSH(REG_R1);
			emitRR("mov", REG_R1, REG_DST);
			compileExpr(nd.rhs, env);
			if (nd.op.equals("|"))
				emitRRR("orr", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("&"))
				emitRRR("and", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("==")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("moveq", REG_DST, 1);
				emitRI("movne", REG_DST, 0);
			} else if (nd.op.equals("!=")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("moveq", REG_DST, 0);
				emitRI("movne", REG_DST, 1);
			} else if (nd.op.equals("<")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("movmi", REG_DST, 1);
				emitRI("movge", REG_DST, 0);
			} else if (nd.op.equals("<=")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("movle", REG_DST, 1);
				emitRI("movgt", REG_DST, 0);
			} else if (nd.op.equals(">")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("movgt", REG_DST, 1);
				emitRI("movle", REG_DST, 0);
			} else if (nd.op.equals(">=")) {
				emitRR("cmp", REG_DST, REG_R1);
				emitRI("movge", REG_DST, 1);
				emitRI("movmi", REG_DST, 0);
			}
			else if (nd.op.equals("+"))
				emitRRR("add", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("-"))
				emitRRR("sub", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("*"))
				emitRRR("mul", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("/"))
				emitRRR("udiv", REG_DST, REG_R1, REG_DST);
			else
				throw new Error("Unknwon operator: "+nd.op);
			emitPOP(REG_R1);
		} else if (ndx instanceof ASTUnaryExprNode) {
			ASTUnaryExprNode nd = (ASTUnaryExprNode) ndx;
			compileExpr(nd.operand, env);
			if (nd.op.equals("-"))
				emitRRI("rsb", REG_DST, REG_DST, 0);
			else if (nd.op.equals("~"))
				emitRR("mvn", REG_DST, REG_DST);
			else
				throw new Error("Unknwon operator: "+nd.op);
		} else if (ndx instanceof ASTNumberNode) {
			ASTNumberNode nd = (ASTNumberNode) ndx;
			emitLDC(REG_DST, nd.value);
		} else if (ndx instanceof ASTVarRefNode) {
			ASTVarRefNode nd = (ASTVarRefNode) ndx;
			Variable var = env.lookup(nd.varName);
			if (var == null)
				var = globalEnv.lookup(nd.varName);
			if (var == null)
				throw new Error("Undefined variable: "+nd.varName);
			if (var instanceof GlobalVariable) {
				GlobalVariable globalVar = (GlobalVariable) var;
				emitLDC(REG_DST, globalVar.getLabel());
				emitLDR(REG_DST, REG_DST, 0);
			} else {
				LocalVariable localVar = (LocalVariable) var;
				int offset = localVar.offset;
				emitLDR(REG_DST, REG_FP, offset);
			}
		} else if (ndx instanceof ASTCallNode) {
			ASTCallNode nd = (ASTCallNode) ndx;
			for (ASTNode arg: nd.args) {
				compileExpr(arg, env);
				emitPUSH(REG_DST);
			}
			emitCALL(nd.name);
			emitRRI("add", REG_SP, REG_SP, 4 * nd.args.size());
		} else 
			throw new Error("Unknown expression: "+ndx);
	}
	
	void compile(ASTNode ast) {
		globalEnv = new Environment();
		ASTProgNode program = (ASTProgNode) ast;

		System.out.println("\t.section .data");
		System.out.println("\t@ 大域変数の定義");		
		for (String varName: program.varDecls) {
			if (globalEnv.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			GlobalVariable v = addGlobalVariable(globalEnv, varName);
			emitLabel(v.getLabel());
			System.out.println("\t.word 0");
		}
		System.out.println("hex:");
		System.out.println("\t.ascii \"00000000\\n\"");
		System.out.println("\t.equ hexlen, . - hex");

		System.out.println("\t.section .text");
		System.out.println("\t.global _start");
		System.out.println("_start:");
		System.out.println("\t@ main関数を呼出す．戻り値は r0 に入る");
		emitJMP("bl", "main");
		System.out.println("\t@ EXITシステムコール");
		emitRI("mov", REG_R7, 1);      // EXIT のシステムコール番号
		emitI("swi", 0);
		
		/* 関数定義 */
		for (ASTFunctionNode func: program.funcDecls)
			compileFunction(func);

		subroutinePrint();
	}

	public void subroutinePrint() {
		System.out.println("_print_r0:");
		emitPUSH(REG_DST);
		emitPUSH(REG_R1);
		emitPUSH(REG_R2);
		emitPUSH(REG_R7);

		String loopLabel = freshLabel();
		String endLoop = freshLabel();
		String elseLabel = freshLabel();
		String endIf = freshLabel();
		emitLDC(REG_R7, "hex");
		emitRRI("add", REG_R7, REG_R7, 7);
		emitLabel(loopLabel);
		emitRI("cmp", REG_DST, 0);
		emitJMP("beq", endLoop);
		emitRI("mov", REG_R2, 16);
		emitRRR("udiv", REG_R1, REG_DST, REG_R2);
		emitRRR("mul", REG_R2, REG_R1, REG_R2);
		emitRRR("sub", REG_DST, REG_DST, REG_R2);
		emitRI("cmp", REG_DST, 10);
		emitJMP("bpl", elseLabel);
		emitRRI("add", REG_DST, REG_DST, 48);
		emitJMP("b", endIf);
		emitLabel(elseLabel);
		emitRRI("add", REG_DST, REG_DST, 55);
		emitLabel(endIf);
		emitSTRB(REG_DST, REG_R7, -1, true);
		emitRR("mov", REG_DST, REG_R1);
		emitJMP("b", loopLabel);
		emitLabel(endLoop);
		emitRI("mov", REG_R7, 4);
		emitRI("mov", REG_DST, 1);
		emitLDC(REG_R1, "hex");
		emitLDC(REG_R2, "hexlen");
		emitI("swi", 0);

		// 文字列の初期化
		loopLabel = freshLabel();
		endLoop = freshLabel();
		emitRI("mov", REG_DST, 48);
		emitRI("mov", REG_R2, 8);
		emitLabel(loopLabel);
		emitRI("cmp", REG_R2, 0);
		emitJMP("beq", endLoop);
		emitRRI("sub", REG_R2, REG_R2, 1);
		emitSTRB(REG_DST, REG_R1, REG_R2);
		emitJMP("b", loopLabel);
		emitLabel(endLoop);

		emitPOP(REG_R7);
		emitPOP(REG_R2);
		emitPOP(REG_R1);
		emitPOP(REG_DST);
		emitRET();
	}

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PiLangXLexer lexer = new PiLangXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		PiLangXParser parser = new PiLangXParser(token);
		ParseTree tree = parser.prog();
		ASTGenerator astgen = new ASTGenerator();
		ASTNode ast = astgen.translate(tree);
		Compiler compiler = new Compiler();
		compiler.compile(ast);
	}
}
