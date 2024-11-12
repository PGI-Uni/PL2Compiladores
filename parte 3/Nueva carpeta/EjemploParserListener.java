// Generated from c:/Users/Karimlk/Desktop/parte 3/Nueva carpeta/EjemploParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EjemploParser}.
 */
public interface EjemploParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EjemploParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EjemploParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EjemploParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EjemploParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EjemploParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EjemploParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EjemploParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EjemploParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EjemploParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(EjemploParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(EjemploParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EjemploParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EjemploParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(EjemploParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(EjemploParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(EjemploParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(EjemploParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(EjemploParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#repeatLoop}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(EjemploParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(EjemploParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(EjemploParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EjemploParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EjemploParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(EjemploParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(EjemploParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(EjemploParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(EjemploParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EjemploParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EjemploParser.ExprContext ctx);
}