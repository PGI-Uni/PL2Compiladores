import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        int opcion = 0;
        while(opcion != 3){
            // Menu eleccion
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija una opcion:");
            System.out.println("1. Analizar un archivo");
            System.out.println("2. Iniciar el juego");
            System.out.println("3. Salir");
            // Elegir opcion
            opcion = scanner.nextInt();
            scanner.nextLine();

            //Opciones
            switch(opcion){
                //Opcion Analizar archivo
                case 1:
                    System.out.print("Ingrese el archivo a analizar: ");
                    String inputFile = scanner.nextLine();

                    // Inicializar el stream de entrada (puede ser un archivo o entrada estándar)
                    InputStream is = System.in;
                    if (inputFile != null) is = new FileInputStream(inputFile);

                    // Inicializar el lexer y parser
                    ANTLRInputStream input = new ANTLRInputStream(is);
                    MapaLexer lexer = new MapaLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    MapaParser parser = new MapaParser(tokens);

                    // Obtener el árbol de parseo
                    ParseTree tree = parser.mapa();

                    // Crear el caminante (ParseTreeWalker) y el escuchador personalizado
                    ParseTreeWalker walker = new ParseTreeWalker();
                    Escuchador escuchador = new Escuchador();

                    // Recorrer el árbol usando el escuchador para imprimir texto plano
                    walker.walk(escuchador, tree);

                    // Luego de recorrer el árbol, imprimimos el árbol sintáctico
                    System.out.println("\nArbol sintactico:");
                    System.out.println(prettyPrint(tree, parser));

                    // Fin del análisis
                    System.out.println("\nFin del analisis.\n\n");
                    break;

                //Opcion para iniciar el juego
                case 2:
                    //Introducir mapa de juego
                    System.out.print("Ingrese la ruta del archivo para configurar el juego: ");
                    String archivoJuego = scanner.nextLine();

                    // Leer el archivo y analizarlo
                    InputStream juegoInputStream = new FileInputStream(archivoJuego);
                    ANTLRInputStream juegoInput = new ANTLRInputStream(juegoInputStream);
                    MapaLexer juegoLexer = new MapaLexer(juegoInput);
                    CommonTokenStream juegoTokens = new CommonTokenStream(juegoLexer);
                    MapaParser juegoParser = new MapaParser(juegoTokens);

                    // Obtener el árbol de parseo y usar el escuchador para recolectar datos
                    ParseTree juegoTree = juegoParser.mapa();
                    Escuchador juegoEscuchador = new Escuchador();
                    ParseTreeWalker juegoWalker = new ParseTreeWalker();
                    juegoWalker.walk(juegoEscuchador, juegoTree);

                    // Obtener las posiciones y barcos recolectados
                    List<MapaParser.PosicionInfoContext> posiciones = juegoEscuchador.getPosiciones();
                    List<MapaParser.BarcoInfoContext> barcos = juegoEscuchador.getBarcos();

                    // Crear una instancia del juego con la información recolectada
                    Juego juego = new Juego(posiciones, barcos);

                    // Lógica del juego 
                    while (true) {
                        System.out.print("Ingrese coordenadas (x,y) o 'salir' para terminar: ");
                        String entrada = scanner.nextLine();
                        //Escoge salir
                        if (entrada.equalsIgnoreCase("salir")) {
                            break;
                        }
                        
                        //Entrada de coordenadas valida
                        String[] partes = entrada.split(",");
                        int x = Integer.parseInt(partes[0].trim()) - 1;
                        int y = Integer.parseInt(partes[1].trim()) - 1;

                        // Realizar la acción de bucear y mostrar el resultado
                        System.out.println(juego.bucear(x, y));
                        System.out.println("Puntuacion acumulada: " + juego.getPuntuacion());
                    }

                    System.out.println("Fin del juego.");
                    break;
                
                //Salir
                case 3:
                    break;
                //Si introduce una opcion no valida
                default: System.out.println("Opción no válida.");
            }   
        }
    }

    public static String prettyPrint(ParseTree tree, Parser parser) {
        StringBuilder sb = new StringBuilder();
        prettyPrintHelper(tree, parser, sb, 0);
        return sb.toString();
    }

    private static void prettyPrintHelper(ParseTree tree, Parser parser, StringBuilder sb, int level) {
        String indent = "  ".repeat(level);
        if (tree instanceof TerminalNode) {
            sb.append(indent).append(tree.getText()).append(System.lineSeparator());
        } else {
            RuleContext ruleContext = (RuleContext) tree;
            String ruleName = parser.getRuleNames()[ruleContext.getRuleIndex()];
            sb.append(indent).append(ruleName).append(System.lineSeparator());
            for (int i = 0; i < tree.getChildCount(); i++) {
                prettyPrintHelper(tree.getChild(i), parser, sb, level + 1);
            }
        }
    }
}
