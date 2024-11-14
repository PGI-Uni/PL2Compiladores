import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//import java.nio.file.Files;
//import java.nio.file.Paths;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    //Metodo de ejecucion
    public static void main(String[] args) throws Exception {
    //Conectamos los datos    
        //Inicializar entrada de datos
        String inputFile = null;
        if (args.length > 0) inputFile = args[0]; //Si indican el nombre del fichero que queremos analizar, se asigna a este

        //Inicializar el stream de datos
        InputStream is = System.in; //Forzar que la entrada de datos sea por terminal
        if (inputFile != null) is = new FileInputStream(inputFile); //Si hay un archivo indicado, nos conectamos a este

        //Inicializar ANTLR con el fichero o los datos por consola
        ANTLRInputStream input = new ANTLRInputStream(is);
    
    //Conectamos con el Lexer
        MapaLexer lexer = new MapaLexer(input); //Damos al lexer el fichero a analizar

        //Inicializar el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer); //Creamos la comunicacion entre lexer y parser

    //Inicializar el parser
        MapaParser parser = new MapaParser(tokens); //Damos al parser los tokens

        //Generar arbol con el parser a partir de la raiz
        ParseTree arbol = parser.mapa();

        //Mostrar arbol en consola
        System.out.print(arbol.toStringTree(parser));

/*
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
    
    */
    }
}
