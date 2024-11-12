// Generated from MapaParser.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link MapaParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class MapaParserBaseListener implements MapaParserListener {
	private StringBuilder astRepresentation = new StringBuilder();
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	 @Override public void enterMapa(MapaParser.MapaContext ctx) {
		this.astRepresentation.append("Mapa de pruebas\n");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMapa(MapaParser.MapaContext ctx) {
		this.astRepresentation.append("Fin\n");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBarcoInfo(MapaParser.BarcoInfoContext ctx) {
		String var2 = ctx.NOMBRE_BARCO().getText();
        String var3 = ctx.NUMERO().getText();
        this.astRepresentation.append("  Barco: ").append(var2).append(" te da ").append(var3).append(" puntos\n");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBarcoInfo(MapaParser.BarcoInfoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPosicionInfo(MapaParser.PosicionInfoContext ctx) {
		String var2 = ctx.NOMBRE_BARCO().getText();
      String var3 = ctx.NUMERO(0).getText();
      String var4 = ctx.NUMERO(1).getText();
      this.astRepresentation.append("  Posici\u00f3n: ").append(var2).append(" esta enterrado en (").append(var3).append(", ").append(var4).append(")\n");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPosicionInfo(MapaParser.PosicionInfoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCriaturaInfo(MapaParser.CriaturaInfoContext ctx) {
		String var2 = ctx.NOMBRE_BARCO().getText();
      String var3 = ctx.NUMERO().getText();
      this.astRepresentation.append("  Barco: ").append(var2).append(" te quita ").append(var3).append(" puntos\n");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCriaturaInfo(MapaParser.CriaturaInfoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPeligroInfo(MapaParser.PeligroInfoContext ctx) {
			String var2 = ctx.NOMBRE_BARCO().getText();
			String var3 = ctx.NUMERO(0).getText();
			String var4 = ctx.NUMERO(1).getText();
			this.astRepresentation.append("  Posici\u00f3n: ").append(var2).append("esta oculto en(").append(var3).append(", ").append(var4).append(")\n");
	 }
	 public String getAstRepresentation() {
		return this.astRepresentation.toString();
	 }
	 /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPeligroInfo(MapaParser.PeligroInfoContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}