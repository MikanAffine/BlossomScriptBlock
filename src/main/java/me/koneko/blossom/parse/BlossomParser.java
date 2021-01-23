// Generated from Blossom.g4 by ANTLR 4.9

package me.koneko.blossom.parse;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlossomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, If=2, Else=3, While=4, Continue=5, Break=6, Identifier=7, Float=8, 
		Integer=9, String=10, Comma=11, LParen=12, RParen=13, LBrace=14, RBrace=15, 
		Assign=16, RelatOp=17, EQ=18, GTR=19, LSS=20, LEQ=21, GEQ=22, NEQ=23, 
		CalcOp0=24, ADD=25, SUB=26, CalcOp1=27, MUL=28, DIV=29, MOD=30, SEMI=31, 
		Whitespace=32, Comment=33, LineComment=34;
	public static final int
		RULE_file = 0, RULE_stmt = 1, RULE_varDeclare = 2, RULE_blockStmt = 3, 
		RULE_ifStmt = 4, RULE_whileStmt = 5, RULE_breakStmt = 6, RULE_continueStmt = 7, 
		RULE_list = 8, RULE_cond = 9, RULE_expr = 10, RULE_term = 11, RULE_factor = 12, 
		RULE_literal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "stmt", "varDeclare", "blockStmt", "ifStmt", "whileStmt", "breakStmt", 
			"continueStmt", "list", "cond", "expr", "term", "factor", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'if'", "'else'", "'while'", "'continue'", "'break'", 
			null, null, null, null, "','", "'('", "')'", "'{'", "'}'", "'='", null, 
			"'=='", "'>'", "'<'", "'<='", "'>='", "'!='", null, "'+'", "'-'", null, 
			"'*'", "'/'", "'%'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "If", "Else", "While", "Continue", "Break", "Identifier", 
			"Float", "Integer", "String", "Comma", "LParen", "RParen", "LBrace", 
			"RBrace", "Assign", "RelatOp", "EQ", "GTR", "LSS", "LEQ", "GEQ", "NEQ", 
			"CalcOp0", "ADD", "SUB", "CalcOp1", "MUL", "DIV", "MOD", "SEMI", "Whitespace", 
			"Comment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Blossom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BlossomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BlossomParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << If) | (1L << While) | (1L << Continue) | (1L << Break) | (1L << Identifier) | (1L << Float) | (1L << Integer) | (1L << String) | (1L << LParen) | (1L << LBrace))) != 0)) {
				{
				{
				setState(28);
				stmt();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BlossomParser.SEMI, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				varDeclare();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				ifStmt();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				whileStmt();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				breakStmt();
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				continueStmt();
				}
				break;
			case LBrace:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				blockStmt();
				}
				break;
			case Identifier:
			case Float:
			case Integer:
			case String:
			case LParen:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				expr();
				setState(43);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclareContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(BlossomParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(BlossomParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(BlossomParser.SEMI, 0); }
		public TerminalNode Assign() { return getToken(BlossomParser.Assign, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(Var);
			setState(48);
			match(Identifier);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(49);
				match(Assign);
				setState(50);
				cond();
				}
			}

			setState(53);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(BlossomParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(BlossomParser.RBrace, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LBrace);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << If) | (1L << While) | (1L << Continue) | (1L << Break) | (1L << Identifier) | (1L << Float) | (1L << Integer) | (1L << String) | (1L << LParen) | (1L << LBrace))) != 0)) {
				{
				{
				setState(56);
				stmt();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(BlossomParser.If, 0); }
		public TerminalNode LParen() { return getToken(BlossomParser.LParen, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RParen() { return getToken(BlossomParser.RParen, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(BlossomParser.Else, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(If);
			setState(65);
			match(LParen);
			setState(66);
			cond();
			setState(67);
			match(RParen);
			setState(68);
			stmt();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				match(Else);
				setState(70);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(BlossomParser.While, 0); }
		public TerminalNode LParen() { return getToken(BlossomParser.LParen, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RParen() { return getToken(BlossomParser.RParen, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(While);
			setState(74);
			match(LParen);
			setState(75);
			cond();
			setState(76);
			match(RParen);
			setState(77);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(BlossomParser.Break, 0); }
		public TerminalNode SEMI() { return getToken(BlossomParser.SEMI, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Break);
			setState(80);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(BlossomParser.Continue, 0); }
		public TerminalNode SEMI() { return getToken(BlossomParser.SEMI, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Continue);
			setState(83);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BlossomParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BlossomParser.Comma, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			cond();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(86);
				match(Comma);
				setState(87);
				cond();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RelatOp() { return getToken(BlossomParser.RelatOp, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expr();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RelatOp) {
				{
				setState(94);
				match(RelatOp);
				setState(95);
				cond();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode CalcOp0() { return getToken(BlossomParser.CalcOp0, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			term();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CalcOp0) {
				{
				setState(99);
				match(CalcOp0);
				setState(100);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode CalcOp1() { return getToken(BlossomParser.CalcOp1, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			factor();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CalcOp1) {
				{
				setState(104);
				match(CalcOp1);
				setState(105);
				term();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(BlossomParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(BlossomParser.RParen, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlossomParser.Identifier, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LParen);
				setState(109);
				expr();
				setState(110);
				match(RParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(Identifier);
				setState(115);
				match(LParen);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Float) | (1L << Integer) | (1L << String) | (1L << LParen))) != 0)) {
					{
					setState(116);
					list();
					}
				}

				setState(119);
				match(RParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(BlossomParser.Float, 0); }
		public TerminalNode Integer() { return getToken(BlossomParser.Integer, 0); }
		public TerminalNode String() { return getToken(BlossomParser.String, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlossomVisitor ) return ((BlossomVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Float) | (1L << Integer) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\13\3\13\3\13\5\13c\n\13\3\f\3"+
		"\f\3\f\5\fh\n\f\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16x\n\16\3\16\5\16{\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\3\3\2\n\f\2\u0082\2!\3\2\2\2\4/\3\2\2\2\6"+
		"\61\3\2\2\2\b9\3\2\2\2\nB\3\2\2\2\fK\3\2\2\2\16Q\3\2\2\2\20T\3\2\2\2\22"+
		"W\3\2\2\2\24_\3\2\2\2\26d\3\2\2\2\30i\3\2\2\2\32z\3\2\2\2\34|\3\2\2\2"+
		"\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2"+
		"#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&\60\5\6\4\2\'\60\5\n\6\2(\60\5\f\7\2)"+
		"\60\5\16\b\2*\60\5\20\t\2+\60\5\b\5\2,-\5\26\f\2-.\7!\2\2.\60\3\2\2\2"+
		"/&\3\2\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2"+
		"\2\60\5\3\2\2\2\61\62\7\3\2\2\62\65\7\t\2\2\63\64\7\22\2\2\64\66\5\24"+
		"\13\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7!\2\28\7\3\2\2\2"+
		"9=\7\20\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2"+
		"\2?=\3\2\2\2@A\7\21\2\2A\t\3\2\2\2BC\7\4\2\2CD\7\16\2\2DE\5\24\13\2EF"+
		"\7\17\2\2FI\5\4\3\2GH\7\5\2\2HJ\5\4\3\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2"+
		"\2KL\7\6\2\2LM\7\16\2\2MN\5\24\13\2NO\7\17\2\2OP\5\4\3\2P\r\3\2\2\2QR"+
		"\7\b\2\2RS\7!\2\2S\17\3\2\2\2TU\7\7\2\2UV\7!\2\2V\21\3\2\2\2W\\\5\24\13"+
		"\2XY\7\r\2\2Y[\5\24\13\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\23"+
		"\3\2\2\2^\\\3\2\2\2_b\5\26\f\2`a\7\23\2\2ac\5\24\13\2b`\3\2\2\2bc\3\2"+
		"\2\2c\25\3\2\2\2dg\5\30\r\2ef\7\32\2\2fh\5\26\f\2ge\3\2\2\2gh\3\2\2\2"+
		"h\27\3\2\2\2il\5\32\16\2jk\7\35\2\2km\5\30\r\2lj\3\2\2\2lm\3\2\2\2m\31"+
		"\3\2\2\2no\7\16\2\2op\5\26\f\2pq\7\17\2\2q{\3\2\2\2r{\5\34\17\2s{\7\t"+
		"\2\2tu\7\t\2\2uw\7\16\2\2vx\5\22\n\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7"+
		"\17\2\2zn\3\2\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2{\33\3\2\2\2|}\t\2\2\2"+
		"}\35\3\2\2\2\r!/\65=I\\bglwz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}