// Generated from MapaLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MapaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAPA=1, TE_DA=2, TE_QUITA=3, ENTERRADO_EN=4, OCULTO=5, PUNTOS=6, COMA=7, 
		NOMBRE_BARCO=8, NUMERO=9, NOMBRE_PELIGRO=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAPA", "TE_DA", "TE_QUITA", "ENTERRADO_EN", "OCULTO", "PUNTOS", "COMA", 
			"NOMBRE_BARCO", "NUMERO", "NOMBRE_PELIGRO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"Mapa de pruebas\"'", "'te da'", "'te quita'", null, "'esta oculto en'", 
			"'puntos'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAPA", "TE_DA", "TE_QUITA", "ENTERRADO_EN", "OCULTO", "PUNTOS", 
			"COMA", "NOMBRE_BARCO", "NUMERO", "NOMBRE_PELIGRO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MapaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MapaLexer.g4"; }

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
		"\u0004\u0000\u000b\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\\\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b\u0081\b\b\u000b\b\f\b\u0082\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\t\u0001\t\u0001\n\u0004\n"+
		"\u0090\b\n\u000b\n\f\n\u0091\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0004\u0001\u0000AZ\u0003\u0000"+
		"  AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0099\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0017\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005"+
		"/\u0001\u0000\u0000\u0000\u0007[\u0001\u0000\u0000\u0000\t]\u0001\u0000"+
		"\u0000\u0000\u000bl\u0001\u0000\u0000\u0000\rs\u0001\u0000\u0000\u0000"+
		"\u000fu\u0001\u0000\u0000\u0000\u0011\u0080\u0001\u0000\u0000\u0000\u0013"+
		"\u0084\u0001\u0000\u0000\u0000\u0015\u008f\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\"\u0000\u0000\u0018\u0019\u0005M\u0000\u0000\u0019\u001a"+
		"\u0005a\u0000\u0000\u001a\u001b\u0005p\u0000\u0000\u001b\u001c\u0005a"+
		"\u0000\u0000\u001c\u001d\u0005 \u0000\u0000\u001d\u001e\u0005d\u0000\u0000"+
		"\u001e\u001f\u0005e\u0000\u0000\u001f \u0005 \u0000\u0000 !\u0005p\u0000"+
		"\u0000!\"\u0005r\u0000\u0000\"#\u0005u\u0000\u0000#$\u0005e\u0000\u0000"+
		"$%\u0005b\u0000\u0000%&\u0005a\u0000\u0000&\'\u0005s\u0000\u0000\'(\u0005"+
		"\"\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005t\u0000\u0000*+\u0005"+
		"e\u0000\u0000+,\u0005 \u0000\u0000,-\u0005d\u0000\u0000-.\u0005a\u0000"+
		"\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005t\u0000\u000001\u0005e\u0000"+
		"\u000012\u0005 \u0000\u000023\u0005q\u0000\u000034\u0005u\u0000\u0000"+
		"45\u0005i\u0000\u000056\u0005t\u0000\u000067\u0005a\u0000\u00007\u0006"+
		"\u0001\u0000\u0000\u000089\u0005e\u0000\u00009:\u0005s\u0000\u0000:;\u0005"+
		"t\u0000\u0000;<\u0005a\u0000\u0000<=\u0005 \u0000\u0000=>\u0005e\u0000"+
		"\u0000>?\u0005n\u0000\u0000?@\u0005t\u0000\u0000@A\u0005e\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005r\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"d\u0000\u0000EF\u0005o\u0000\u0000FG\u0005 \u0000\u0000GH\u0005e\u0000"+
		"\u0000H\\\u0005n\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005s\u0000\u0000"+
		"KL\u0005t\u0000\u0000LM\u0005\u00c3\u0000\u0000MN\u0005\u00a1\u0000\u0000"+
		"NO\u0005 \u0000\u0000OP\u0005e\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005"+
		"t\u0000\u0000RS\u0005e\u0000\u0000ST\u0005r\u0000\u0000TU\u0005r\u0000"+
		"\u0000UV\u0005a\u0000\u0000VW\u0005d\u0000\u0000WX\u0005o\u0000\u0000"+
		"XY\u0005 \u0000\u0000YZ\u0005e\u0000\u0000Z\\\u0005n\u0000\u0000[8\u0001"+
		"\u0000\u0000\u0000[I\u0001\u0000\u0000\u0000\\\b\u0001\u0000\u0000\u0000"+
		"]^\u0005e\u0000\u0000^_\u0005s\u0000\u0000_`\u0005t\u0000\u0000`a\u0005"+
		"a\u0000\u0000ab\u0005 \u0000\u0000bc\u0005o\u0000\u0000cd\u0005c\u0000"+
		"\u0000de\u0005u\u0000\u0000ef\u0005l\u0000\u0000fg\u0005t\u0000\u0000"+
		"gh\u0005o\u0000\u0000hi\u0005 \u0000\u0000ij\u0005e\u0000\u0000jk\u0005"+
		"n\u0000\u0000k\n\u0001\u0000\u0000\u0000lm\u0005p\u0000\u0000mn\u0005"+
		"u\u0000\u0000no\u0005n\u0000\u0000op\u0005t\u0000\u0000pq\u0005o\u0000"+
		"\u0000qr\u0005s\u0000\u0000r\f\u0001\u0000\u0000\u0000st\u0005,\u0000"+
		"\u0000t\u000e\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000vz\u0007\u0000"+
		"\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\"\u0000\u0000"+
		"~\u0010\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0002\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0012\u0001\u0000\u0000\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085\u0089"+
		"\u0007\u0000\u0000\u0000\u0086\u0088\u0007\u0001\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\"\u0000\u0000\u008d\u0014\u0001\u0000\u0000\u0000\u008e\u0090\u0007"+
		"\u0003\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0006"+
		"\n\u0000\u0000\u0094\u0016\u0001\u0000\u0000\u0000\u0006\u0000[z\u0082"+
		"\u0089\u0091\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}