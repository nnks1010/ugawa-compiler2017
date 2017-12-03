// Generated from parser/PiLangXX.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiLangXXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LOROP=17, 
		LANDOP=18, OROP=19, ANDOP=20, EQUOP=21, CMPOP=22, ADDOP=23, SUBOP=24, 
		MULOP=25, UNARYOP=26, IDENTIFIER=27, VALUE=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_funcDecl = 1, RULE_params = 2, RULE_varDecls = 3, 
		RULE_stmt = 4, RULE_whileChildStmt = 5, RULE_expr = 6, RULE_lorExpr = 7, 
		RULE_landExpr = 8, RULE_orExpr = 9, RULE_andExpr = 10, RULE_equExpr = 11, 
		RULE_cmpExpr = 12, RULE_addExpr = 13, RULE_mulExpr = 14, RULE_unaryExpr = 15, 
		RULE_args = 16;
	public static final String[] ruleNames = {
		"prog", "funcDecl", "params", "varDecls", "stmt", "whileChildStmt", "expr", 
		"lorExpr", "landExpr", "orExpr", "andExpr", "equExpr", "cmpExpr", "addExpr", 
		"mulExpr", "unaryExpr", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "';'", 
		"'='", "'if'", "'else'", "'while'", "'print'", "'return'", "'break;'", 
		"'continue;'", "'||'", "'&&'", "'|'", "'&'", null, null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "LOROP", "LANDOP", "OROP", "ANDOP", "EQUOP", 
		"CMPOP", "ADDOP", "SUBOP", "MULOP", "UNARYOP", "IDENTIFIER", "VALUE", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PiLangXX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PiLangXXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public VarDeclsContext varDecls() {
			return getRuleContext(VarDeclsContext.class,0);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			varDecls();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				funcDecl();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public VarDeclsContext varDecls() {
			return getRuleContext(VarDeclsContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(IDENTIFIER);
			setState(43);
			match(T__1);
			setState(44);
			params();
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			varDecls();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(48);
				stmt();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXXParser.IDENTIFIER, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IDENTIFIER);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(58);
					match(T__5);
					setState(59);
					match(IDENTIFIER);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXXParser.IDENTIFIER, i);
		}
		public VarDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecls; }
	}

	public final VarDeclsContext varDecls() throws RecognitionException {
		VarDeclsContext _localctx = new VarDeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(67);
				match(T__6);
				setState(68);
				match(IDENTIFIER);
				setState(69);
				match(T__7);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileChildStmtContext whileChildStmt() {
			return getRuleContext(WhileChildStmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class CompoundStmtContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public CompoundStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new CompoundStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__3);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(76);
					stmt();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(T__4);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(T__8);
				setState(85);
				expr();
				setState(86);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__9);
				setState(89);
				match(T__1);
				setState(90);
				expr();
				setState(91);
				match(T__2);
				setState(92);
				stmt();
				setState(93);
				match(T__10);
				setState(94);
				stmt();
				}
				break;
			case T__11:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__11);
				setState(97);
				match(T__1);
				setState(98);
				expr();
				setState(99);
				match(T__2);
				setState(100);
				whileChildStmt();
				}
				break;
			case T__12:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(T__12);
				setState(103);
				expr();
				setState(104);
				match(T__7);
				}
				break;
			case T__13:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(T__13);
				setState(107);
				expr();
				setState(108);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileChildStmtContext extends ParserRuleContext {
		public WhileChildStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileChildStmt; }
	 
		public WhileChildStmtContext() { }
		public void copyFrom(WhileChildStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileCompoundStmtContext extends WhileChildStmtContext {
		public List<WhileChildStmtContext> whileChildStmt() {
			return getRuleContexts(WhileChildStmtContext.class);
		}
		public WhileChildStmtContext whileChildStmt(int i) {
			return getRuleContext(WhileChildStmtContext.class,i);
		}
		public WhileCompoundStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileInWhileStmtContext extends WhileChildStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileChildStmtContext whileChildStmt() {
			return getRuleContext(WhileChildStmtContext.class,0);
		}
		public WhileInWhileStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileIfStmtContext extends WhileChildStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<WhileChildStmtContext> whileChildStmt() {
			return getRuleContexts(WhileChildStmtContext.class);
		}
		public WhileChildStmtContext whileChildStmt(int i) {
			return getRuleContext(WhileChildStmtContext.class,i);
		}
		public WhileIfStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStmtContext extends WhileChildStmtContext {
		public BreakStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileAssignStmtContext extends WhileChildStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileAssignStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStmtContext extends WhileChildStmtContext {
		public ContinueStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileReturnStmtContext extends WhileChildStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileReturnStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhilePrintStmtContext extends WhileChildStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhilePrintStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}

	public final WhileChildStmtContext whileChildStmt() throws RecognitionException {
		WhileChildStmtContext _localctx = new WhileChildStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileChildStmt);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new WhileCompoundStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__3);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(113);
					whileChildStmt();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__4);
				}
				break;
			case IDENTIFIER:
				_localctx = new WhileAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IDENTIFIER);
				setState(121);
				match(T__8);
				setState(122);
				expr();
				setState(123);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new WhileIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__9);
				setState(126);
				match(T__1);
				setState(127);
				expr();
				setState(128);
				match(T__2);
				setState(129);
				whileChildStmt();
				setState(130);
				match(T__10);
				setState(131);
				whileChildStmt();
				}
				break;
			case T__11:
				_localctx = new WhileInWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__11);
				setState(134);
				match(T__1);
				setState(135);
				expr();
				setState(136);
				match(T__2);
				setState(137);
				whileChildStmt();
				}
				break;
			case T__12:
				_localctx = new WhilePrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__12);
				setState(140);
				expr();
				setState(141);
				match(T__7);
				}
				break;
			case T__13:
				_localctx = new WhileReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(T__13);
				setState(144);
				expr();
				setState(145);
				match(T__7);
				}
				break;
			case T__14:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LorExprContext lorExpr() {
			return getRuleContext(LorExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			lorExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LorExprContext extends ParserRuleContext {
		public LandExprContext landExpr() {
			return getRuleContext(LandExprContext.class,0);
		}
		public LorExprContext lorExpr() {
			return getRuleContext(LorExprContext.class,0);
		}
		public TerminalNode LOROP() { return getToken(PiLangXXParser.LOROP, 0); }
		public LorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lorExpr; }
	}

	public final LorExprContext lorExpr() throws RecognitionException {
		return lorExpr(0);
	}

	private LorExprContext lorExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LorExprContext _localctx = new LorExprContext(_ctx, _parentState);
		LorExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_lorExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(154);
			landExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LorExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lorExpr);
					setState(156);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(157);
					match(LOROP);
					setState(158);
					landExpr(0);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LandExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public LandExprContext landExpr() {
			return getRuleContext(LandExprContext.class,0);
		}
		public TerminalNode LANDOP() { return getToken(PiLangXXParser.LANDOP, 0); }
		public LandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landExpr; }
	}

	public final LandExprContext landExpr() throws RecognitionException {
		return landExpr(0);
	}

	private LandExprContext landExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LandExprContext _localctx = new LandExprContext(_ctx, _parentState);
		LandExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_landExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			orExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LandExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_landExpr);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					match(LANDOP);
					setState(169);
					orExpr(0);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode OROP() { return getToken(PiLangXXParser.OROP, 0); }
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		return orExpr(0);
	}

	private OrExprContext orExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExprContext _localctx = new OrExprContext(_ctx, _parentState);
		OrExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(179);
					match(OROP);
					setState(180);
					andExpr(0);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public EquExprContext equExpr() {
			return getRuleContext(EquExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode ANDOP() { return getToken(PiLangXXParser.ANDOP, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187);
			equExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(189);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(190);
					match(ANDOP);
					setState(191);
					equExpr(0);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EquExprContext extends ParserRuleContext {
		public CmpExprContext cmpExpr() {
			return getRuleContext(CmpExprContext.class,0);
		}
		public EquExprContext equExpr() {
			return getRuleContext(EquExprContext.class,0);
		}
		public TerminalNode EQUOP() { return getToken(PiLangXXParser.EQUOP, 0); }
		public EquExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equExpr; }
	}

	public final EquExprContext equExpr() throws RecognitionException {
		return equExpr(0);
	}

	private EquExprContext equExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EquExprContext _localctx = new EquExprContext(_ctx, _parentState);
		EquExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_equExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			cmpExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EquExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equExpr);
					setState(200);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(201);
					match(EQUOP);
					setState(202);
					cmpExpr(0);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CmpExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public CmpExprContext cmpExpr() {
			return getRuleContext(CmpExprContext.class,0);
		}
		public TerminalNode CMPOP() { return getToken(PiLangXXParser.CMPOP, 0); }
		public CmpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpExpr; }
	}

	public final CmpExprContext cmpExpr() throws RecognitionException {
		return cmpExpr(0);
	}

	private CmpExprContext cmpExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmpExprContext _localctx = new CmpExprContext(_ctx, _parentState);
		CmpExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_cmpExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CmpExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmpExpr);
					setState(211);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(212);
					match(CMPOP);
					setState(213);
					addExpr(0);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(PiLangXXParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXXParser.SUBOP, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(224);
					mulExpr(0);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(PiLangXXParser.MULOP, 0); }
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		return mulExpr(0);
	}

	private MulExprContext mulExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExprContext _localctx = new MulExprContext(_ctx, _parentState);
		MulExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_mulExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpr);
					setState(233);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(234);
					match(MULOP);
					setState(235);
					unaryExpr();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public VarExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends UnaryExprContext {
		public TerminalNode VALUE() { return getToken(PiLangXXParser.VALUE, 0); }
		public LiteralExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnExprContext extends UnaryExprContext {
		public TerminalNode SUBOP() { return getToken(PiLangXXParser.SUBOP, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode UNARYOP() { return getToken(PiLangXXParser.UNARYOP, 0); }
		public UnExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends UnaryExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryExpr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(VALUE);
				}
				break;
			case 2:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(SUBOP);
				setState(243);
				unaryExpr();
				}
				break;
			case 3:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(UNARYOP);
				setState(245);
				unaryExpr();
				}
				break;
			case 4:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(T__1);
				setState(248);
				expr();
				setState(249);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(IDENTIFIER);
				setState(252);
				match(T__1);
				setState(253);
				args();
				setState(254);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case SUBOP:
			case UNARYOP:
			case IDENTIFIER:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				expr();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(260);
					match(T__5);
					setState(261);
					expr();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return lorExpr_sempred((LorExprContext)_localctx, predIndex);
		case 8:
			return landExpr_sempred((LandExprContext)_localctx, predIndex);
		case 9:
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 10:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 11:
			return equExpr_sempred((EquExprContext)_localctx, predIndex);
		case 12:
			return cmpExpr_sempred((CmpExprContext)_localctx, predIndex);
		case 13:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 14:
			return mulExpr_sempred((MulExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lorExpr_sempred(LorExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean landExpr_sempred(LandExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equExpr_sempred(EquExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmpExpr_sempred(CmpExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpr_sempred(MulExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\5\4D\n\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\7"+
		"\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0098\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16"+
		"\t\u00a5\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ad\n\n\f\n\16\n\u00b0\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00ce\n\r\f\r\16\r\u00d1\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\22"+
		"\3\22\3\22\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\5\22\u010e\n\22"+
		"\3\22\2\n\20\22\24\26\30\32\34\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\3\3\2\31\32\2\u0120\2$\3\2\2\2\4+\3\2\2\2\6C\3\2\2\2\bJ\3"+
		"\2\2\2\np\3\2\2\2\f\u0097\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22"+
		"\u00a6\3\2\2\2\24\u00b1\3\2\2\2\26\u00bc\3\2\2\2\30\u00c7\3\2\2\2\32\u00d2"+
		"\3\2\2\2\34\u00dd\3\2\2\2\36\u00e8\3\2\2\2 \u0102\3\2\2\2\"\u010d\3\2"+
		"\2\2$(\5\b\5\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3"+
		"\3\2\2\2*(\3\2\2\2+,\7\3\2\2,-\7\35\2\2-.\7\4\2\2./\5\6\4\2/\60\7\5\2"+
		"\2\60\61\7\6\2\2\61\65\5\b\5\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\7\2\29\5"+
		"\3\2\2\2:D\3\2\2\2;@\7\35\2\2<=\7\b\2\2=?\7\35\2\2><\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C:\3\2\2\2C;\3\2\2\2D\7\3\2\2"+
		"\2EF\7\t\2\2FG\7\35\2\2GI\7\n\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2K\t\3\2\2\2LJ\3\2\2\2MQ\7\6\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2Tq\7\7\2\2UV\7\35\2\2VW\7\13\2\2W"+
		"X\5\16\b\2XY\7\n\2\2Yq\3\2\2\2Z[\7\f\2\2[\\\7\4\2\2\\]\5\16\b\2]^\7\5"+
		"\2\2^_\5\n\6\2_`\7\r\2\2`a\5\n\6\2aq\3\2\2\2bc\7\16\2\2cd\7\4\2\2de\5"+
		"\16\b\2ef\7\5\2\2fg\5\f\7\2gq\3\2\2\2hi\7\17\2\2ij\5\16\b\2jk\7\n\2\2"+
		"kq\3\2\2\2lm\7\20\2\2mn\5\16\b\2no\7\n\2\2oq\3\2\2\2pM\3\2\2\2pU\3\2\2"+
		"\2pZ\3\2\2\2pb\3\2\2\2ph\3\2\2\2pl\3\2\2\2q\13\3\2\2\2rv\7\6\2\2su\5\f"+
		"\7\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u0098"+
		"\7\7\2\2z{\7\35\2\2{|\7\13\2\2|}\5\16\b\2}~\7\n\2\2~\u0098\3\2\2\2\177"+
		"\u0080\7\f\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7"+
		"\5\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\r\2\2\u0085\u0086\5\f\7\2\u0086"+
		"\u0098\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5"+
		"\16\b\2\u008a\u008b\7\5\2\2\u008b\u008c\5\f\7\2\u008c\u0098\3\2\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\5\16\b\2\u008f\u0090\7\n\2\2\u0090\u0098\3"+
		"\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\5\16\b\2\u0093\u0094\7\n\2\2\u0094"+
		"\u0098\3\2\2\2\u0095\u0098\7\21\2\2\u0096\u0098\7\22\2\2\u0097r\3\2\2"+
		"\2\u0097z\3\2\2\2\u0097\177\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u008d\3"+
		"\2\2\2\u0097\u0091\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\r\3\2\2\2\u0099\u009a\5\20\t\2\u009a\17\3\2\2\2\u009b\u009c\b\t\1\2\u009c"+
		"\u009d\5\22\n\2\u009d\u00a3\3\2\2\2\u009e\u009f\f\4\2\2\u009f\u00a0\7"+
		"\23\2\2\u00a0\u00a2\5\22\n\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a7\b\n\1\2\u00a7\u00a8\5\24\13\2\u00a8\u00ae\3\2\2\2\u00a9"+
		"\u00aa\f\4\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00a9"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\23\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\b\13\1\2\u00b2\u00b3\5\26"+
		"\f\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\f\4\2\2\u00b5\u00b6\7\25\2\2\u00b6"+
		"\u00b8\5\26\f\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\b\f\1\2\u00bd\u00be\5\30\r\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\f"+
		"\4\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\r\1\2\u00c8\u00c9\5\32\16\2\u00c9"+
		"\u00cf\3\2\2\2\u00ca\u00cb\f\4\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00ce\5"+
		"\32\16\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\16\1"+
		"\2\u00d3\u00d4\5\34\17\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6"+
		"\u00d7\7\30\2\2\u00d7\u00d9\5\34\17\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\33\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\b\17\1\2\u00de\u00df\5\36\20\2\u00df\u00e5"+
		"\3\2\2\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2\t\2\2\2\u00e2\u00e4\5\36\20\2"+
		"\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b\20\1\2\u00e9"+
		"\u00ea\5 \21\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\f\4\2\2\u00ec\u00ed\7\33"+
		"\2\2\u00ed\u00ef\5 \21\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u0103\7\36\2\2\u00f4\u00f5\7\32\2\2\u00f5\u0103\5 \21\2\u00f6"+
		"\u00f7\7\34\2\2\u00f7\u0103\5 \21\2\u00f8\u0103\7\35\2\2\u00f9\u00fa\7"+
		"\4\2\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc\7\5\2\2\u00fc\u0103\3\2\2\2\u00fd"+
		"\u00fe\7\35\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\7"+
		"\5\2\2\u0101\u0103\3\2\2\2\u0102\u00f3\3\2\2\2\u0102\u00f4\3\2\2\2\u0102"+
		"\u00f6\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fd\3\2"+
		"\2\2\u0103!\3\2\2\2\u0104\u010e\3\2\2\2\u0105\u010a\5\16\b\2\u0106\u0107"+
		"\7\b\2\2\u0107\u0109\5\16\b\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010e#\3\2\2\2\26(\65"+
		"@CJQpv\u0097\u00a3\u00ae\u00b9\u00c4\u00cf\u00da\u00e5\u00f0\u0102\u010a"+
		"\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}