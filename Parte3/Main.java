import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        //Conexion de datos
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);

        CharStream input = CharStreams.fromStream(is);

        //Lexer y Parser
        EjemploLexer lexer = new EjemploLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EjemploParser parser = new EjemploParser(tokens);
        ParseTree tree = parser.prog();  // Parsear el programa

        //Usamos el walker y listener para recorrer el árbol
        ParseTreeWalker walker = new ParseTreeWalker();
        Escuchador escuchador = new Escuchador();
        walker.walk(escuchador, tree);  //Ejecutamos el listener

        //Imprimir el árbol de manera legible
        System.out.println(prettyPrint(tree, parser));
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
