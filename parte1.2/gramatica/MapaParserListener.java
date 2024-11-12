// Generated from c:/Users/Karimlk/Desktop/prueba 2/gramatica/MapaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapaParser}.
 */
public interface MapaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapaParser#mapa}.
	 * @param ctx the parse tree
	 */
	void enterMapa(MapaParser.MapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapaParser#mapa}.
	 * @param ctx the parse tree
	 */
	void exitMapa(MapaParser.MapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapaParser#barcoInfo}.
	 * @param ctx the parse tree
	 */
	void enterBarcoInfo(MapaParser.BarcoInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapaParser#barcoInfo}.
	 * @param ctx the parse tree
	 */
	void exitBarcoInfo(MapaParser.BarcoInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapaParser#posicionInfo}.
	 * @param ctx the parse tree
	 */
	void enterPosicionInfo(MapaParser.PosicionInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapaParser#posicionInfo}.
	 * @param ctx the parse tree
	 */
	void exitPosicionInfo(MapaParser.PosicionInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapaParser#criaturaInfo}.
	 * @param ctx the parse tree
	 */
	void enterCriaturaInfo(MapaParser.CriaturaInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapaParser#criaturaInfo}.
	 * @param ctx the parse tree
	 */
	void exitCriaturaInfo(MapaParser.CriaturaInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapaParser#peligroInfo}.
	 * @param ctx the parse tree
	 */
	void enterPeligroInfo(MapaParser.PeligroInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapaParser#peligroInfo}.
	 * @param ctx the parse tree
	 */
	void exitPeligroInfo(MapaParser.PeligroInfoContext ctx);
}