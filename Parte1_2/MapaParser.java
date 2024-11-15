// Generated from MapaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MapaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAPA=1, TE_DA=2, TE_QUITA=3, ENTERRADO_EN=4, OCULTO=5, PUNTOS=6, COMA=7, 
		NOMBRE_BARCO=8, NUMERO=9, NOMBRE_PELIGRO=10, WS=11;
	public static final int
		RULE_mapa = 0, RULE_barcoInfo = 1, RULE_posicionInfo = 2, RULE_criaturaInfo = 3, 
		RULE_peligroInfo = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapa", "barcoInfo", "posicionInfo", "criaturaInfo", "peligroInfo"
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

	@Override
	public String getGrammarFileName() { return "MapaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapaContext extends ParserRuleContext {
		public TerminalNode MAPA() { return getToken(MapaParser.MAPA, 0); }
		public TerminalNode EOF() { return getToken(MapaParser.EOF, 0); }
		public List<BarcoInfoContext> barcoInfo() {
			return getRuleContexts(BarcoInfoContext.class);
		}
		public BarcoInfoContext barcoInfo(int i) {
			return getRuleContext(BarcoInfoContext.class,i);
		}
		public List<CriaturaInfoContext> criaturaInfo() {
			return getRuleContexts(CriaturaInfoContext.class);
		}
		public CriaturaInfoContext criaturaInfo(int i) {
			return getRuleContext(CriaturaInfoContext.class,i);
		}
		public List<PosicionInfoContext> posicionInfo() {
			return getRuleContexts(PosicionInfoContext.class);
		}
		public PosicionInfoContext posicionInfo(int i) {
			return getRuleContext(PosicionInfoContext.class,i);
		}
		public List<PeligroInfoContext> peligroInfo() {
			return getRuleContexts(PeligroInfoContext.class);
		}
		public PeligroInfoContext peligroInfo(int i) {
			return getRuleContext(PeligroInfoContext.class,i);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitMapa(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(MAPA);
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE_BARCO) {
				{
				setState(15);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(11);
					barcoInfo();
					}
					break;
				case 2:
					{
					setState(12);
					criaturaInfo();
					}
					break;
				case 3:
					{
					setState(13);
					posicionInfo();
					}
					break;
				case 4:
					{
					setState(14);
					peligroInfo();
					}
					break;
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BarcoInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode TE_DA() { return getToken(MapaParser.TE_DA, 0); }
		public TerminalNode NUMERO() { return getToken(MapaParser.NUMERO, 0); }
		public TerminalNode PUNTOS() { return getToken(MapaParser.PUNTOS, 0); }
		public BarcoInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barcoInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterBarcoInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitBarcoInfo(this);
		}
	}

	public final BarcoInfoContext barcoInfo() throws RecognitionException {
		BarcoInfoContext _localctx = new BarcoInfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_barcoInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(NOMBRE_BARCO);
			setState(23);
			match(TE_DA);
			setState(24);
			match(NUMERO);
			setState(25);
			match(PUNTOS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PosicionInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode ENTERRADO_EN() { return getToken(MapaParser.ENTERRADO_EN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(MapaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(MapaParser.NUMERO, i);
		}
		public TerminalNode COMA() { return getToken(MapaParser.COMA, 0); }
		public PosicionInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicionInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterPosicionInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitPosicionInfo(this);
		}
	}

	public final PosicionInfoContext posicionInfo() throws RecognitionException {
		PosicionInfoContext _localctx = new PosicionInfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_posicionInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(NOMBRE_BARCO);
			setState(28);
			match(ENTERRADO_EN);
			setState(29);
			match(NUMERO);
			setState(30);
			match(COMA);
			setState(31);
			match(NUMERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CriaturaInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode TE_QUITA() { return getToken(MapaParser.TE_QUITA, 0); }
		public TerminalNode NUMERO() { return getToken(MapaParser.NUMERO, 0); }
		public TerminalNode PUNTOS() { return getToken(MapaParser.PUNTOS, 0); }
		public CriaturaInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criaturaInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterCriaturaInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitCriaturaInfo(this);
		}
	}

	public final CriaturaInfoContext criaturaInfo() throws RecognitionException {
		CriaturaInfoContext _localctx = new CriaturaInfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_criaturaInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(NOMBRE_BARCO);
			setState(34);
			match(TE_QUITA);
			setState(35);
			match(NUMERO);
			setState(36);
			match(PUNTOS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PeligroInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode OCULTO() { return getToken(MapaParser.OCULTO, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(MapaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(MapaParser.NUMERO, i);
		}
		public TerminalNode COMA() { return getToken(MapaParser.COMA, 0); }
		public PeligroInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peligroInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterPeligroInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitPeligroInfo(this);
		}
	}

	public final PeligroInfoContext peligroInfo() throws RecognitionException {
		PeligroInfoContext _localctx = new PeligroInfoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_peligroInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NOMBRE_BARCO);
			setState(39);
			match(OCULTO);
			setState(40);
			match(NUMERO);
			setState(41);
			match(COMA);
			setState(42);
			match(NUMERO);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000+\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\u0016\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006"+
		"!\u0001\u0000\u0000\u0000\b&\u0001\u0000\u0000\u0000\n\u0011\u0005\u0001"+
		"\u0000\u0000\u000b\u0010\u0003\u0002\u0001\u0000\f\u0010\u0003\u0006\u0003"+
		"\u0000\r\u0010\u0003\u0004\u0002\u0000\u000e\u0010\u0003\b\u0004\u0000"+
		"\u000f\u000b\u0001\u0000\u0000\u0000\u000f\f\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\b\u0000\u0000\u0017\u0018\u0005"+
		"\u0002\u0000\u0000\u0018\u0019\u0005\t\u0000\u0000\u0019\u001a\u0005\u0006"+
		"\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\b\u0000"+
		"\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0005\t\u0000\u0000"+
		"\u001e\u001f\u0005\u0007\u0000\u0000\u001f \u0005\t\u0000\u0000 \u0005"+
		"\u0001\u0000\u0000\u0000!\"\u0005\b\u0000\u0000\"#\u0005\u0003\u0000\u0000"+
		"#$\u0005\t\u0000\u0000$%\u0005\u0006\u0000\u0000%\u0007\u0001\u0000\u0000"+
		"\u0000&\'\u0005\b\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0005\t\u0000"+
		"\u0000)*\u0005\u0007\u0000\u0000*+\u0005\t\u0000\u0000+\t\u0001\u0000"+
		"\u0000\u0000\u0002\u000f\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}