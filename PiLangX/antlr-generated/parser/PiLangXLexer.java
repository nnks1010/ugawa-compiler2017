// Generated from parser/PiLangX.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiLangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BREAKOP=15, LOROP=16, 
		LANDOP=17, OROP=18, ANDOP=19, EQUOP=20, CMPOP=21, ADDOP=22, SUBOP=23, 
		MULOP=24, UNARYOP=25, IDENTIFIER=26, VALUE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BREAKOP", "LOROP", "LANDOP", 
		"OROP", "ANDOP", "EQUOP", "CMPOP", "ADDOP", "SUBOP", "MULOP", "UNARYOP", 
		"IDENTIFIER", "VALUE", "WS"
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


	public PiLangXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PiLangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0087\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u008f\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\7\33\u009b\n\33\f\33\16\33\u009e\13\33\3\34\3\34\3\34\6\34\u00a3"+
		"\n\34\r\34\16\34\u00a4\5\34\u00a7\n\34\3\35\3\35\3\35\3\35\2\2\36\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\t\4"+
		"\2,,\61\61\4\2##\u0080\u0080\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\63"+
		";\5\2\13\f\17\17\"\"\2\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13"+
		"J\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27"+
		"Y\3\2\2\2\31^\3\2\2\2\33d\3\2\2\2\35j\3\2\2\2\37q\3\2\2\2!x\3\2\2\2#{"+
		"\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0086\3\2\2\2+\u008e\3\2\2\2-\u0090"+
		"\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\u0096\3\2\2\2\65\u0098\3\2"+
		"\2\2\67\u00a6\3\2\2\29\u00a8\3\2\2\2;<\7h\2\2<=\7w\2\2=>\7p\2\2>?\7e\2"+
		"\2?@\7v\2\2@A\7k\2\2AB\7q\2\2BC\7p\2\2C\4\3\2\2\2DE\7*\2\2E\6\3\2\2\2"+
		"FG\7+\2\2G\b\3\2\2\2HI\7}\2\2I\n\3\2\2\2JK\7\177\2\2K\f\3\2\2\2LM\7.\2"+
		"\2M\16\3\2\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2Q\20\3\2\2\2RS\7=\2\2S\22\3\2"+
		"\2\2TU\7?\2\2U\24\3\2\2\2VW\7k\2\2WX\7h\2\2X\26\3\2\2\2YZ\7g\2\2Z[\7n"+
		"\2\2[\\\7u\2\2\\]\7g\2\2]\30\3\2\2\2^_\7y\2\2_`\7j\2\2`a\7k\2\2ab\7n\2"+
		"\2bc\7g\2\2c\32\3\2\2\2de\7r\2\2ef\7t\2\2fg\7k\2\2gh\7p\2\2hi\7v\2\2i"+
		"\34\3\2\2\2jk\7t\2\2kl\7g\2\2lm\7v\2\2mn\7w\2\2no\7t\2\2op\7p\2\2p\36"+
		"\3\2\2\2qr\7d\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7m\2\2vw\7=\2\2w \3\2\2"+
		"\2xy\7~\2\2yz\7~\2\2z\"\3\2\2\2{|\7(\2\2|}\7(\2\2}$\3\2\2\2~\177\7~\2"+
		"\2\177&\3\2\2\2\u0080\u0081\7(\2\2\u0081(\3\2\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0087\7?\2\2\u0084\u0085\7#\2\2\u0085\u0087\7?\2\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087*\3\2\2\2\u0088\u008f\7>\2\2\u0089\u008a\7"+
		">\2\2\u008a\u008f\7?\2\2\u008b\u008f\7@\2\2\u008c\u008d\7@\2\2\u008d\u008f"+
		"\7?\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f,\3\2\2\2\u0090\u0091\7-\2\2\u0091.\3\2\2\2\u0092"+
		"\u0093\7/\2\2\u0093\60\3\2\2\2\u0094\u0095\t\2\2\2\u0095\62\3\2\2\2\u0096"+
		"\u0097\t\3\2\2\u0097\64\3\2\2\2\u0098\u009c\t\4\2\2\u0099\u009b\t\5\2"+
		"\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\66\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a7\t\6\2\2\u00a0"+
		"\u00a2\t\7\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a78\3\2\2\2\u00a8\u00a9\t\b\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\35\2\2\u00ab:\3\2\2\2\b\2\u0086\u008e"+
		"\u009c\u00a4\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}