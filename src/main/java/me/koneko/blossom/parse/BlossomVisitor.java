// Generated from Blossom.g4 by ANTLR 4.9

package me.koneko.blossom.parse;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BlossomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BlossomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BlossomParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(BlossomParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BlossomParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(BlossomParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(BlossomParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(BlossomParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(BlossomParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(BlossomParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(BlossomParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(BlossomParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(BlossomParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BlossomParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BlossomParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BlossomParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlossomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BlossomParser.LiteralContext ctx);
}