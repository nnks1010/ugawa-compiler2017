// Generated from parser/PiLangX.g4 by ANTLR 4.7
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
public class PiLangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BREAKOP=15, LOROP=16, 
		LANDOP=17, OROP=18, ANDOP=19, EQUOP=20, CMPOP=21, ADDOP=22, SUBOP=23, 
		MULOP=24, UNARYOP=25, IDENTIFIER=26, VALUE=27, WS=28;
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
		"'||'", "'&&'", "'|'", "'&'", null, null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BREAKOP", "LOROP", "LANDOP", "OROP", "ANDOP", "EQUOP", 
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
	public String getGrammarFileName() { return "PiLangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PiLangXParser(TokenStream input) {
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXParser.IDENTIFIER, i);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXParser.IDENTIFIER, i);
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
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
		public TerminalNode BREAKOP() { return getToken(PiLangXParser.BREAKOP, 0); }
		public BreakStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileAssignStmtContext extends WhileChildStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileAssignStmtContext(WhileChildStmtContext ctx) { copyFrom(ctx); }
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
			setState(148);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << BREAKOP) | (1L << IDENTIFIER))) != 0)) {
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
			case BREAKOP:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(BREAKOP);
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
			setState(150);
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
		public TerminalNode LOROP() { return getToken(PiLangXParser.LOROP, 0); }
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
			setState(153);
			landExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
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
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					match(LOROP);
					setState(157);
					landExpr(0);
					}
					} 
				}
				setState(162);
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
		public TerminalNode LANDOP() { return getToken(PiLangXParser.LANDOP, 0); }
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
			setState(164);
			orExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
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
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					match(LANDOP);
					setState(168);
					orExpr(0);
					}
					} 
				}
				setState(173);
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
		public TerminalNode OROP() { return getToken(PiLangXParser.OROP, 0); }
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
			setState(175);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
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
					setState(177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(178);
					match(OROP);
					setState(179);
					andExpr(0);
					}
					} 
				}
				setState(184);
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
		public TerminalNode ANDOP() { return getToken(PiLangXParser.ANDOP, 0); }
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
			setState(186);
			equExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
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
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					match(ANDOP);
					setState(190);
					equExpr(0);
					}
					} 
				}
				setState(195);
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
		public TerminalNode EQUOP() { return getToken(PiLangXParser.EQUOP, 0); }
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
			setState(197);
			cmpExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
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
					setState(199);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(200);
					match(EQUOP);
					setState(201);
					cmpExpr(0);
					}
					} 
				}
				setState(206);
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
		public TerminalNode CMPOP() { return getToken(PiLangXParser.CMPOP, 0); }
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
			setState(208);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
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
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					match(CMPOP);
					setState(212);
					addExpr(0);
					}
					} 
				}
				setState(217);
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
		public TerminalNode ADDOP() { return getToken(PiLangXParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXParser.SUBOP, 0); }
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
			setState(219);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
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
					setState(221);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(223);
					mulExpr(0);
					}
					} 
				}
				setState(228);
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
		public TerminalNode MULOP() { return getToken(PiLangXParser.MULOP, 0); }
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
			setState(230);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
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
					setState(232);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(233);
					match(MULOP);
					setState(234);
					unaryExpr();
					}
					} 
				}
				setState(239);
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
		public VarExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends UnaryExprContext {
		public TerminalNode VALUE() { return getToken(PiLangXParser.VALUE, 0); }
		public LiteralExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnExprContext extends UnaryExprContext {
		public TerminalNode SUBOP() { return getToken(PiLangXParser.SUBOP, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode UNARYOP() { return getToken(PiLangXParser.UNARYOP, 0); }
		public UnExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(VALUE);
				}
				break;
			case 2:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(SUBOP);
				setState(242);
				unaryExpr();
				}
				break;
			case 3:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(UNARYOP);
				setState(244);
				unaryExpr();
				}
				break;
			case 4:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(T__1);
				setState(247);
				expr();
				setState(248);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(IDENTIFIER);
				setState(251);
				match(T__1);
				setState(252);
				args();
				setState(253);
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
			setState(266);
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
				setState(258);
				expr();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(259);
					match(T__5);
					setState(260);
					expr();
					}
					}
					setState(265);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\5\4D\n\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\7"+
		"\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0097\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00b7\n\13\f\13\16\13\u00ba\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u00e3\n\17\f\17\16\17\u00e6\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0102\n\21\3\22\3\22"+
		"\3\22\3\22\7\22\u0108\n\22\f\22\16\22\u010b\13\22\5\22\u010d\n\22\3\22"+
		"\2\n\20\22\24\26\30\32\34\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\3\3\2\30\31\2\u011e\2$\3\2\2\2\4+\3\2\2\2\6C\3\2\2\2\bJ\3\2\2\2"+
		"\np\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u009a\3\2\2\2\22\u00a5"+
		"\3\2\2\2\24\u00b0\3\2\2\2\26\u00bb\3\2\2\2\30\u00c6\3\2\2\2\32\u00d1\3"+
		"\2\2\2\34\u00dc\3\2\2\2\36\u00e7\3\2\2\2 \u0101\3\2\2\2\"\u010c\3\2\2"+
		"\2$(\5\b\5\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3"+
		"\2\2\2*(\3\2\2\2+,\7\3\2\2,-\7\34\2\2-.\7\4\2\2./\5\6\4\2/\60\7\5\2\2"+
		"\60\61\7\6\2\2\61\65\5\b\5\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\7\2\29\5\3"+
		"\2\2\2:D\3\2\2\2;@\7\34\2\2<=\7\b\2\2=?\7\34\2\2><\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C:\3\2\2\2C;\3\2\2\2D\7\3\2\2\2"+
		"EF\7\t\2\2FG\7\34\2\2GI\7\n\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2"+
		"\2K\t\3\2\2\2LJ\3\2\2\2MQ\7\6\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2Tq\7\7\2\2UV\7\34\2\2VW\7\13\2\2WX\5"+
		"\16\b\2XY\7\n\2\2Yq\3\2\2\2Z[\7\f\2\2[\\\7\4\2\2\\]\5\16\b\2]^\7\5\2\2"+
		"^_\5\n\6\2_`\7\r\2\2`a\5\n\6\2aq\3\2\2\2bc\7\16\2\2cd\7\4\2\2de\5\16\b"+
		"\2ef\7\5\2\2fg\5\f\7\2gq\3\2\2\2hi\7\17\2\2ij\5\16\b\2jk\7\n\2\2kq\3\2"+
		"\2\2lm\7\20\2\2mn\5\16\b\2no\7\n\2\2oq\3\2\2\2pM\3\2\2\2pU\3\2\2\2pZ\3"+
		"\2\2\2pb\3\2\2\2ph\3\2\2\2pl\3\2\2\2q\13\3\2\2\2rv\7\6\2\2su\5\f\7\2t"+
		"s\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u0097\7\7"+
		"\2\2z{\7\34\2\2{|\7\13\2\2|}\5\16\b\2}~\7\n\2\2~\u0097\3\2\2\2\177\u0080"+
		"\7\f\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\5\2\2"+
		"\u0083\u0084\5\f\7\2\u0084\u0085\7\r\2\2\u0085\u0086\5\f\7\2\u0086\u0097"+
		"\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5\16\b\2"+
		"\u008a\u008b\7\5\2\2\u008b\u008c\5\f\7\2\u008c\u0097\3\2\2\2\u008d\u008e"+
		"\7\17\2\2\u008e\u008f\5\16\b\2\u008f\u0090\7\n\2\2\u0090\u0097\3\2\2\2"+
		"\u0091\u0092\7\20\2\2\u0092\u0093\5\16\b\2\u0093\u0094\7\n\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0097\7\21\2\2\u0096r\3\2\2\2\u0096z\3\2\2\2\u0096\177"+
		"\3\2\2\2\u0096\u0087\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0091\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\5\20\t\2\u0099\17\3\2\2\2\u009a"+
		"\u009b\b\t\1\2\u009b\u009c\5\22\n\2\u009c\u00a2\3\2\2\2\u009d\u009e\f"+
		"\4\2\2\u009e\u009f\7\22\2\2\u009f\u00a1\5\22\n\2\u00a0\u009d\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\n\1\2\u00a6\u00a7\5\24\13\2\u00a7"+
		"\u00ad\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\23\2\2\u00aa\u00ac\5"+
		"\24\13\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\13\1"+
		"\2\u00b1\u00b2\5\26\f\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\f\4\2\2\u00b4"+
		"\u00b5\7\24\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\b\f\1\2\u00bc\u00bd\5\30\r\2\u00bd\u00c3\3"+
		"\2\2\2\u00be\u00bf\f\4\2\2\u00bf\u00c0\7\25\2\2\u00c0\u00c2\5\30\r\2\u00c1"+
		"\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\r\1\2\u00c7\u00c8"+
		"\5\32\16\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\4\2\2\u00ca\u00cb\7\26\2"+
		"\2\u00cb\u00cd\5\32\16\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\b\16\1\2\u00d2\u00d3\5\34\17\2\u00d3\u00d9\3\2\2\2\u00d4"+
		"\u00d5\f\4\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d4"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\33\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\17\1\2\u00dd\u00de\5\36"+
		"\20\2\u00de\u00e4\3\2\2\2\u00df\u00e0\f\4\2\2\u00e0\u00e1\t\2\2\2\u00e1"+
		"\u00e3\5\36\20\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\35\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\b\20\1\2\u00e8\u00e9\5 \21\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\f"+
		"\4\2\2\u00eb\u00ec\7\32\2\2\u00ec\u00ee\5 \21\2\u00ed\u00ea\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\37\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f2\u0102\7\35\2\2\u00f3\u00f4\7\31\2\2\u00f4"+
		"\u0102\5 \21\2\u00f5\u00f6\7\33\2\2\u00f6\u0102\5 \21\2\u00f7\u0102\7"+
		"\34\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fa\5\16\b\2\u00fa\u00fb\7\5\2\2\u00fb"+
		"\u0102\3\2\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5"+
		"\"\22\2\u00ff\u0100\7\5\2\2\u0100\u0102\3\2\2\2\u0101\u00f2\3\2\2\2\u0101"+
		"\u00f3\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00f7\3\2\2\2\u0101\u00f8\3\2"+
		"\2\2\u0101\u00fc\3\2\2\2\u0102!\3\2\2\2\u0103\u010d\3\2\2\2\u0104\u0109"+
		"\5\16\b\2\u0105\u0106\7\b\2\2\u0106\u0108\5\16\b\2\u0107\u0105\3\2\2\2"+
		"\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0104\3\2\2\2\u010d"+
		"#\3\2\2\2\26(\65@CJQpv\u0096\u00a2\u00ad\u00b8\u00c3\u00ce\u00d9\u00e4"+
		"\u00ef\u0101\u0109\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}