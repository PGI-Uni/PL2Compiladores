// Generated from c:/Users/pegar/Desktop/CPL2/Trabajo/PL2Compiladores/prueba/gramatica/MapaLexer.g4 by ANTLR 4.13.1
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
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
			null, "'\"Mapa de pruebas\"'", "'te da'", "'te quita'", "'esta enterrado en'", 
			"'esta oculto en'", "'puntos'", "','"
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
		"\u0004\u0000\u000b\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007f\b\u0007\n\u0007\f\u0007i\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\bn\b\b\u000b\b\f\bo\u0001\t\u0001\t\u0001\t\u0005\tu\b\t\n\t"+
		"\f\tx\t\t\u0001\t\u0001\t\u0001\n\u0004\n}\b\n\u000b\n\f\n~\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000"+
		"\u0004\u0001\u0000AZ\u0003\u0000  AZaz\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00078"+
		"\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bY\u0001\u0000"+
		"\u0000\u0000\r`\u0001\u0000\u0000\u0000\u000fb\u0001\u0000\u0000\u0000"+
		"\u0011m\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000\u0015|"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\"\u0000\u0000\u0018\u0019\u0005"+
		"M\u0000\u0000\u0019\u001a\u0005a\u0000\u0000\u001a\u001b\u0005p\u0000"+
		"\u0000\u001b\u001c\u0005a\u0000\u0000\u001c\u001d\u0005 \u0000\u0000\u001d"+
		"\u001e\u0005d\u0000\u0000\u001e\u001f\u0005e\u0000\u0000\u001f \u0005"+
		" \u0000\u0000 !\u0005p\u0000\u0000!\"\u0005r\u0000\u0000\"#\u0005u\u0000"+
		"\u0000#$\u0005e\u0000\u0000$%\u0005b\u0000\u0000%&\u0005a\u0000\u0000"+
		"&\'\u0005s\u0000\u0000\'(\u0005\"\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005t\u0000\u0000*+\u0005e\u0000\u0000+,\u0005 \u0000\u0000"+
		",-\u0005d\u0000\u0000-.\u0005a\u0000\u0000.\u0004\u0001\u0000\u0000\u0000"+
		"/0\u0005t\u0000\u000001\u0005e\u0000\u000012\u0005 \u0000\u000023\u0005"+
		"q\u0000\u000034\u0005u\u0000\u000045\u0005i\u0000\u000056\u0005t\u0000"+
		"\u000067\u0005a\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005e\u0000"+
		"\u00009:\u0005s\u0000\u0000:;\u0005t\u0000\u0000;<\u0005a\u0000\u0000"+
		"<=\u0005 \u0000\u0000=>\u0005e\u0000\u0000>?\u0005n\u0000\u0000?@\u0005"+
		"t\u0000\u0000@A\u0005e\u0000\u0000AB\u0005r\u0000\u0000BC\u0005r\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005d\u0000\u0000EF\u0005o\u0000\u0000"+
		"FG\u0005 \u0000\u0000GH\u0005e\u0000\u0000HI\u0005n\u0000\u0000I\b\u0001"+
		"\u0000\u0000\u0000JK\u0005e\u0000\u0000KL\u0005s\u0000\u0000LM\u0005t"+
		"\u0000\u0000MN\u0005a\u0000\u0000NO\u0005 \u0000\u0000OP\u0005o\u0000"+
		"\u0000PQ\u0005c\u0000\u0000QR\u0005u\u0000\u0000RS\u0005l\u0000\u0000"+
		"ST\u0005t\u0000\u0000TU\u0005o\u0000\u0000UV\u0005 \u0000\u0000VW\u0005"+
		"e\u0000\u0000WX\u0005n\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005"+
		"p\u0000\u0000Z[\u0005u\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005t\u0000"+
		"\u0000]^\u0005o\u0000\u0000^_\u0005s\u0000\u0000_\f\u0001\u0000\u0000"+
		"\u0000`a\u0005,\u0000\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0005\"\u0000"+
		"\u0000cg\u0007\u0000\u0000\u0000df\u0007\u0001\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jk\u0005\"\u0000\u0000k\u0010\u0001\u0000\u0000\u0000ln\u0007\u0002\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u0012\u0001\u0000\u0000\u0000"+
		"qr\u0005\"\u0000\u0000rv\u0007\u0000\u0000\u0000su\u0007\u0001\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000yz\u0005\"\u0000\u0000z\u0014\u0001\u0000\u0000\u0000{}\u0007"+
		"\u0003\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0006\n\u0000\u0000\u0081\u0016\u0001"+
		"\u0000\u0000\u0000\u0005\u0000gov~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}