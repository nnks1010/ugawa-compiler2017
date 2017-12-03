import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.TinyPiSXParser.AndExprContext;
import parser.TinyPiSXParser.AssignStmtContext;
import parser.TinyPiSXParser.CmpExprContext;
import parser.TinyPiSXParser.CompoundStmtContext;
import parser.TinyPiSXParser.EquExprContext;
import parser.TinyPiSXParser.OrExprContext;
import parser.TinyPiSXParser.UnExprContext;
import parser.TinyPiSXParser.AddExprContext;
import parser.TinyPiSXParser.ExprContext;
import parser.TinyPiSXParser.IfStmtContext;
import parser.TinyPiSXParser.LandExprContext;
import parser.TinyPiSXParser.LiteralExprContext;
import parser.TinyPiSXParser.LorExprContext;
import parser.TinyPiSXParser.MulExprContext;
import parser.TinyPiSXParser.ParenExprContext;
import parser.TinyPiSXParser.PrintStmtContext;
import parser.TinyPiSXParser.ProgContext;
import parser.TinyPiSXParser.StmtContext;
import parser.TinyPiSXParser.VarExprContext;
import parser.TinyPiSXParser.WhileStmtContext;

public class ASTGenerator {	
	ASTNode translate(ParseTree ctxx) {
		if (ctxx instanceof ProgContext) {
			ProgContext ctx = (ProgContext) ctxx;
			ArrayList<String> varDecls = new ArrayList<String>();
			for (TerminalNode token: ctx.varDecls().IDENTIFIER())
				varDecls.add(token.getText());
			ASTNode stmt = translate(ctx.stmt());
			return new ASTProgNode(varDecls, stmt);
		} else if (ctxx instanceof CompoundStmtContext) {
			CompoundStmtContext ctx = (CompoundStmtContext) ctxx;
			ArrayList<ASTNode> stmts = new ArrayList<ASTNode>();
			for (StmtContext t: ctx.stmt()) {
				ASTNode n = translate(t);
				stmts.add(n);
			}
			return new ASTCompoundStmtNode(stmts);
		} else if (ctxx instanceof AssignStmtContext) {
			AssignStmtContext ctx = (AssignStmtContext) ctxx;
			String var = ctx.IDENTIFIER().getText();
			ASTNode expr = translate(ctx.expr());
			return new ASTAssignStmtNode(var, expr);
		} else if (ctxx instanceof IfStmtContext) {
			IfStmtContext ctx = (IfStmtContext) ctxx;
			ASTNode cond = translate(ctx.expr());
			ASTNode thenClause = translate(ctx.stmt(0));
			ASTNode elseClause = translate(ctx.stmt(1));
			return new ASTIfStmtNode(cond, thenClause, elseClause);
		} else if (ctxx instanceof WhileStmtContext) {
			WhileStmtContext ctx = (WhileStmtContext) ctxx;
			ASTNode cond = translate(ctx.expr());
			ASTNode stmt = translate(ctx.stmt());
			return new ASTWhileStmtNode(cond, stmt);
		} else if (ctxx instanceof PrintStmtContext) {
			PrintStmtContext ctx = (PrintStmtContext) ctxx;
			ASTNode expr = translate(ctx.expr());
			return new ASTPrintStmtNode(expr);
		} else if (ctxx instanceof ExprContext) {
			ExprContext ctx = (ExprContext) ctxx;
			return translate(ctx.lorExpr());
		} else if (ctxx instanceof LorExprContext) {
			LorExprContext ctx = (LorExprContext) ctxx;
			if (ctx.lorExpr() == null)
				return translate(ctx.landExpr());
			ASTNode lhs = translate(ctx.lorExpr());
			ASTNode rhs = translate(ctx.landExpr());
			return new ASTBinaryExprNode(ctx.LOROP().getText(), lhs, rhs);
		} else if (ctxx instanceof LandExprContext) {
			LandExprContext ctx = (LandExprContext) ctxx;
			if (ctx.landExpr() == null)
				return translate(ctx.orExpr());
			ASTNode lhs = translate(ctx.landExpr());
			ASTNode rhs = translate(ctx.orExpr());
			return new ASTBinaryExprNode(ctx.LANDOP().getText(), lhs, rhs);
		} else if (ctxx instanceof OrExprContext) {
			OrExprContext ctx = (OrExprContext) ctxx;
			if (ctx.orExpr() == null)
				return translate(ctx.andExpr());
			ASTNode lhs = translate(ctx.orExpr());
			ASTNode rhs = translate(ctx.andExpr());
			return new ASTBinaryExprNode(ctx.OROP().getText(), lhs, rhs);
		} else if (ctxx instanceof AndExprContext) {
			AndExprContext ctx = (AndExprContext) ctxx;
			if (ctx.andExpr() == null)
				return translate(ctx.equExpr());
			ASTNode lhs = translate(ctx.andExpr());
			ASTNode rhs = translate(ctx.equExpr());
			return new ASTBinaryExprNode(ctx.ANDOP().getText(), lhs, rhs);
		} else if (ctxx instanceof EquExprContext) {
			EquExprContext ctx = (EquExprContext) ctxx;
			if (ctx.equExpr() == null)
				return translate(ctx.cmpExpr());
			ASTNode lhs = translate(ctx.equExpr());
			ASTNode rhs = translate(ctx.cmpExpr());
			return new ASTBinaryExprNode(ctx.EQUOP().getText(), lhs, rhs);
		} else if (ctxx instanceof CmpExprContext) {
			CmpExprContext ctx = (CmpExprContext) ctxx;
			if (ctx.cmpExpr() == null)
				return translate(ctx.addExpr());
			ASTNode lhs = translate(ctx.cmpExpr());
			ASTNode rhs = translate(ctx.addExpr());
			return new ASTBinaryExprNode(ctx.CMPOP().getText(), lhs, rhs);
		} else if (ctxx instanceof AddExprContext) {
			AddExprContext ctx = (AddExprContext) ctxx;
			if (ctx.addExpr() == null)
				return translate(ctx.mulExpr());
			ASTNode lhs = translate(ctx.addExpr());
			ASTNode rhs = translate(ctx.mulExpr());
			if (ctx.ADDOP() != null)
				return new ASTBinaryExprNode(ctx.ADDOP().getText(), lhs, rhs);
			else
				return new ASTBinaryExprNode(ctx.SUBOP().getText(), lhs, rhs);
		} else if (ctxx instanceof MulExprContext) {
			MulExprContext ctx = (MulExprContext) ctxx;
			if (ctx.mulExpr() == null)
				return translate(ctx.unaryExpr());
			ASTNode lhs = translate(ctx.mulExpr());
			ASTNode rhs = translate(ctx.unaryExpr());
			return new ASTBinaryExprNode(ctx.MULOP().getText(), lhs, rhs);
		} else if (ctxx instanceof UnExprContext) {
			UnExprContext ctx = (UnExprContext) ctxx;
			ASTNode operand = translate(ctx.unaryExpr());
			if (ctx.SUBOP() != null)
				return new ASTUnaryExprNode(ctx.SUBOP().getText(), operand);
			else
				return new ASTUnaryExprNode(ctx.UNARYOP().getText(), operand);
		} else if (ctxx instanceof LiteralExprContext) {
			LiteralExprContext ctx = (LiteralExprContext) ctxx;
			int value = Integer.parseInt(ctx.VALUE().getText());
			return new ASTNumberNode(value);
		} else if (ctxx instanceof VarExprContext) {
			VarExprContext ctx = (VarExprContext) ctxx;
			String varName = ctx.IDENTIFIER().getText();
			return new ASTVarRefNode(varName);
		} else if (ctxx instanceof ParenExprContext) {
			ParenExprContext ctx = (ParenExprContext) ctxx;
			return translate(ctx.expr());
		}
		throw new Error("Unknown parse tree node: "+ctxx.getText());		
	}
}
