import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalizadorEjemploListener extends EjemploParserBaseListener {

    private Map<String, List<String>> symbolTable = new HashMap<>();

    @Override
    public void enterProg(EjemploParser.ProgContext ctx) {
        System.out.println("Inicio del programa.");
    }

    @Override
    public void exitProg(EjemploParser.ProgContext ctx) {
        System.out.println("\nTabla de símbolos:");
        for (Map.Entry<String, List<String>> entry : symbolTable.entrySet()) {
            String varName = entry.getKey();
            for (String value : entry.getValue()) {
                System.out.println(varName + " = " + value);
            }
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // Cuando llegamos a un terminal (un token), simplemente lo imprimimos.
        System.out.print(node.getText() + " ");
    }

    @Override
    public void enterLetExpr(EjemploParser.LetExprContext ctx) {
        String varName = ctx.IDENTIFICADOR().getText();
        String value = ctx.expr().getText();

        if (symbolTable.containsKey(varName)) {
            symbolTable.get(varName).add(value);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            symbolTable.put(varName, values);
        }
    }
}
