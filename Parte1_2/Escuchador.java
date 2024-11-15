import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.*;

public class Escuchador extends MapaParserBaseListener {
    private List<MapaParser.PosicionInfoContext> posiciones = new ArrayList<>();
    private List<MapaParser.BarcoInfoContext> barcos = new ArrayList<>();
    private List<MapaParser.CriaturaInfoContext> criaturas = new ArrayList<>();
    private List<MapaParser.PeligroInfoContext> peligros = new ArrayList<>();

    // Método que devuelve las posiciones recolectadas
    public List<MapaParser.PosicionInfoContext> getPosiciones() {
        return posiciones;
    }

    // Método que devuelve los barcos recolectados
    public List<MapaParser.BarcoInfoContext> getBarcos() {
        return barcos;
    }

    @Override
    public void enterBarcoInfo(MapaParser.BarcoInfoContext ctx) {
        barcos.add(ctx); // Guardamos la información del barco
        //Añadir de su ultimo terminal los puntosal total posible de puntos
    }

    @Override
    public void enterPosicionInfo(MapaParser.PosicionInfoContext ctx) {
        posiciones.add(ctx); // Guardamos la información de la posición
    }

    @Override 
    public void enterCriaturaInfo(MapaParser.CriaturaInfoContext ctx) {
        criaturas.add(ctx); // Guardamos la informacion de las criaturas
    }

    @Override 
    public void enterPeligroInfo(MapaParser.PeligroInfoContext ctx) { 
        peligros.add(ctx); // Guardamos la inforamcion de los peligros
    }

}
