// Generated from parser/TinyPiS.g4 by ANTLR 4.7
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
public class TinyPiSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OROP=11, ANDOP=12, ADDOP=13, SUBOP=14, MULOP=15, UNARYOP=16, 
		IDENTIFIER=17, VALUE=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_varDecls = 1, RULE_stmt = 2, RULE_expr = 3, RULE_orExpr = 4, 
		RULE_andExpr = 5, RULE_addExpr = 6, RULE_mulExpr = 7, RULE_unaryExpr = 8;
	public static final String[] ruleNames = {
		"prog", "varDecls", "stmt", "expr", "orExpr", "andExpr", "addExpr", "mulExpr", 
		"unaryExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
		"'while'", "'|'", "'&'", "'+'", "'-'", null, "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "OROP", 
		"ANDOP", "ADDOP", "SUBOP", "MULOP", "UNARYOP", "IDENTIFIER", "VALUE", 
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
	public String getGrammarFileName() { return "TinyPiS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyPiSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public VarDeclsContext varDecls() {
			return getRuleContext(VarDeclsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			varDecls();
			setState(19);
			stmt();
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TinyPiSParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TinyPiSParser.IDENTIFIER, i);
		}
		public VarDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecls; }
	}

	public final VarDeclsContext varDecls() throws RecognitionException {
		VarDeclsContext _localctx = new VarDeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				match(T__0);
				setState(22);
				match(IDENTIFIER);
				setState(23);
				match(T__1);
				}
				}
				setState(28);
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
	public static class WhileStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		public TerminalNode IDENTIFIER() { return getToken(TinyPiSParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CompoundStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__2);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(30);
					stmt();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IDENTIFIER);
				setState(38);
				match(T__4);
				setState(39);
				expr();
				setState(40);
				match(T__1);
				}
				break;
			case T__5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__5);
				setState(43);
				match(T__6);
				setState(44);
				expr();
				setState(45);
				match(T__7);
				setState(46);
				stmt();
				setState(47);
				match(T__8);
				setState(48);
				stmt();
				}
				break;
			case T__9:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(T__9);
				setState(51);
				match(T__6);
				setState(52);
				expr();
				setState(53);
				match(T__7);
				setState(54);
				stmt();
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
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			orExpr(0);
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

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode OROP() { return getToken(TinyPiSParser.OROP, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					match(OROP);
					setState(65);
					andExpr(0);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode ANDOP() { return getToken(TinyPiSParser.ANDOP, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(74);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(75);
					match(ANDOP);
					setState(76);
					addExpr(0);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode ADDOP() { return getToken(TinyPiSParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(TinyPiSParser.SUBOP, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(83);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(85);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(86);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(87);
					mulExpr(0);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode MULOP() { return getToken(TinyPiSParser.MULOP, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_mulExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpr);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(97);
					match(MULOP);
					setState(98);
					unaryExpr();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode IDENTIFIER() { return getToken(TinyPiSParser.IDENTIFIER, 0); }
		public VarExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends UnaryExprContext {
		public TerminalNode VALUE() { return getToken(TinyPiSParser.VALUE, 0); }
		public LiteralExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnExprContext extends UnaryExprContext {
		public TerminalNode SUBOP() { return getToken(TinyPiSParser.SUBOP, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode UNARYOP() { return getToken(TinyPiSParser.UNARYOP, 0); }
		public UnExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends UnaryExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpr);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(VALUE);
				}
				break;
			case SUBOP:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(SUBOP);
				setState(106);
				unaryExpr();
				}
				break;
			case UNARYOP:
				_localctx = new UnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(UNARYOP);
				setState(108);
				unaryExpr();
				}
				break;
			case IDENTIFIER:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(IDENTIFIER);
				}
				break;
			case T__6:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__6);
				setState(111);
				expr();
				setState(112);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 5:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 6:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 7:
			return mulExpr_sempred((MulExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpr_sempred(MulExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\7\4\"\n\4\f\4\16\4%\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6E\n\6\f\6\16"+
		"\6H\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tf\n\t\f"+
		"\t\16\ti\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\n\2\6"+
		"\n\f\16\20\13\2\4\6\b\n\f\16\20\22\2\3\3\2\17\20\2z\2\24\3\2\2\2\4\34"+
		"\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fI\3\2\2\2\16T\3\2\2\2\20_\3"+
		"\2\2\2\22t\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\3\3\2\2\2\27\30\7\3"+
		"\2\2\30\31\7\23\2\2\31\33\7\4\2\2\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3"+
		"\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36\34\3\2\2\2\37#\7\5\2\2 \"\5\6\4\2"+
		"! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&;\7\6\2"+
		"\2\'(\7\23\2\2()\7\7\2\2)*\5\b\5\2*+\7\4\2\2+;\3\2\2\2,-\7\b\2\2-.\7\t"+
		"\2\2./\5\b\5\2/\60\7\n\2\2\60\61\5\6\4\2\61\62\7\13\2\2\62\63\5\6\4\2"+
		"\63;\3\2\2\2\64\65\7\f\2\2\65\66\7\t\2\2\66\67\5\b\5\2\678\7\n\2\289\5"+
		"\6\4\29;\3\2\2\2:\37\3\2\2\2:\'\3\2\2\2:,\3\2\2\2:\64\3\2\2\2;\7\3\2\2"+
		"\2<=\5\n\6\2=\t\3\2\2\2>?\b\6\1\2?@\5\f\7\2@F\3\2\2\2AB\f\4\2\2BC\7\r"+
		"\2\2CE\5\f\7\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3"+
		"\2\2\2IJ\b\7\1\2JK\5\16\b\2KQ\3\2\2\2LM\f\4\2\2MN\7\16\2\2NP\5\16\b\2"+
		"OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\b\b\1"+
		"\2UV\5\20\t\2V\\\3\2\2\2WX\f\4\2\2XY\t\2\2\2Y[\5\20\t\2ZW\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^\\\3\2\2\2_`\b\t\1\2`a\5\22\n"+
		"\2ag\3\2\2\2bc\f\4\2\2cd\7\21\2\2df\5\22\n\2eb\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2h\21\3\2\2\2ig\3\2\2\2ju\7\24\2\2kl\7\20\2\2lu\5\22\n\2"+
		"mn\7\22\2\2nu\5\22\n\2ou\7\23\2\2pq\7\t\2\2qr\5\b\5\2rs\7\n\2\2su\3\2"+
		"\2\2tj\3\2\2\2tk\3\2\2\2tm\3\2\2\2to\3\2\2\2tp\3\2\2\2u\23\3\2\2\2\n\34"+
		"#:FQ\\gt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}