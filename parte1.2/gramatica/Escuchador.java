import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Escuchador extends MapaParserBaseListener{
    @Override
    public void visitTerminal(TerminalNode node){
        System.out.print(node);
    }
}