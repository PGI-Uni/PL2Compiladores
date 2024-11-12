/* 
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
   public Main() {
   }

   public static void main(String[] args) throws Exception {
      // Crear un Scanner para leer la entrada del usuario
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingresa una consulta: ");

      // Leer la entrada del usuario
      String inputText;
      while ((inputText = scanner.nextLine()) == null || inputText.trim().isEmpty()) {
         System.out.print("Ingresa una consulta válida: ");
      }
      scanner.close();

      // Convertir la entrada en un flujo de caracteres para ANTLR
      ByteArrayInputStream inputStream = new ByteArrayInputStream(inputText.getBytes());
      CharStream charStream = CharStreams.fromStream(inputStream);
      
      // Crear el lexer y parser generados por ANTLR
      EjemploLexer lexer = new EjemploLexer(charStream);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      EjemploParser parser = new EjemploParser(tokens);

      // Ejecutar el análisis sintáctico usando la regla inicial 'prog' definida en la gramática
      EjemploParser.ProgContext tree = parser.prog();

      // Imprimir el AST en formato de texto
      System.out.println("AST generado:");
      System.out.println(tree.toStringTree(parser));
   }
}
*/