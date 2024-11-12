import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Leer el archivo de entrada
        CharStream input = CharStreams.fromFileName("mapa.field");
        
        // Crear el lexer y el parser
        MapaLexer lexer = new MapaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MapaParser parser = new MapaParser(tokens);
        
        // Obtener el árbol de análisis sintáctico
        ParseTree tree = parser.mapa();

        // Crear una instancia del listener personalizado
        MapaParserBaseListener listener = new MapaParserBaseListener();
        
        // Ejecutar el listener sobre el árbol de análisis
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        // Imprimir el AST en formato de texto plano
        System.out.println(listener.getAstRepresentation());
    }
}
