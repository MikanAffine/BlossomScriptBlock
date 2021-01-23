// Generated from Blossom.g4 by ANTLR 4.9

package me.koneko.blossom.parse;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlossomLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Var", "If", "Else", "While", "Continue", "Break", "Digit", "Letter", 
			"Char", "Sign", "Identifier", "Float", "Integer", "String", "Comma", 
			"LParen", "RParen", "LBrace", "RBrace", "Assign", "RelatOp", "EQ", "GTR", 
			"LSS", "LEQ", "GEQ", "NEQ", "CalcOp0", "ADD", "SUB", "CalcOp1", "MUL", 
			"DIV", "MOD", "SEMI", "Whitespace", "Comment", "LineComment"
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


	public BlossomLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Blossom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\5\f{\n\f\3\f\3\f\3\f\7\f\u0080\n\f\f\f\16\f\u0083\13\f\3\r\5"+
		"\r\u0086\n\r\3\r\6\r\u0089\n\r\r\r\16\r\u008a\3\r\3\r\7\r\u008f\n\r\f"+
		"\r\16\r\u0092\13\r\3\16\5\16\u0095\n\16\3\16\6\16\u0098\n\16\r\16\16\16"+
		"\u0099\3\17\3\17\6\17\u009e\n\17\r\17\16\17\u009f\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00b6\n\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u00ca\n\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \5 \u00d3\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\7&\u00e5\n&\f&\16&\u00e8\13&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\7\'\u00f3\n\'\f\'\16\'\u00f6\13\'\3\'\3\'\3\u00e6\2(\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\2\21\2\23\2\25\2\27\t\31\n\33\13\35\f\37\r!\16#\17%\20"+
		"\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37"+
		"E G!I\"K#M$\3\2\t\3\2\62;\4\2C\\c|\6\2\f\f\17\17$$^^\4\2--//\4\2&&aa\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\t[\3\2\2\2\13"+
		"a\3\2\2\2\rj\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27"+
		"z\3\2\2\2\31\u0085\3\2\2\2\33\u0094\3\2\2\2\35\u009b\3\2\2\2\37\u00a3"+
		"\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2"+
		")\u00ad\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00ba\3\2\2\2\61\u00bc"+
		"\3\2\2\2\63\u00be\3\2\2\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00c9\3\2"+
		"\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00d2\3\2\2\2A\u00d4\3\2\2\2C\u00d6"+
		"\3\2\2\2E\u00d8\3\2\2\2G\u00da\3\2\2\2I\u00dc\3\2\2\2K\u00e0\3\2\2\2M"+
		"\u00ee\3\2\2\2OP\7x\2\2PQ\7c\2\2QR\7t\2\2R\4\3\2\2\2ST\7k\2\2TU\7h\2\2"+
		"U\6\3\2\2\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\b\3\2\2\2[\\\7y\2\2\\"+
		"]\7j\2\2]^\7k\2\2^_\7n\2\2_`\7g\2\2`\n\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7p"+
		"\2\2de\7v\2\2ef\7k\2\2fg\7p\2\2gh\7w\2\2hi\7g\2\2i\f\3\2\2\2jk\7d\2\2"+
		"kl\7t\2\2lm\7g\2\2mn\7c\2\2no\7m\2\2o\16\3\2\2\2pq\t\2\2\2q\20\3\2\2\2"+
		"rs\t\3\2\2s\22\3\2\2\2tu\n\4\2\2u\24\3\2\2\2vw\t\5\2\2w\26\3\2\2\2x{\5"+
		"\21\t\2y{\t\6\2\2zx\3\2\2\2zy\3\2\2\2{\u0081\3\2\2\2|\u0080\5\21\t\2}"+
		"\u0080\5\17\b\2~\u0080\t\6\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\30\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\25\13\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\17\b\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0090\7\60\2\2\u008d\u008f\5\17\b\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\25\13\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\17\b\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\34\3\2\2\2\u009b\u009d\7$\2\2\u009c\u009e\5\23\n\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7.\2\2"+
		"\u00a4 \3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7+\2\2"+
		"\u00a8$\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7\177\2"+
		"\2\u00ac(\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae*\3\2\2\2\u00af\u00b6\5/\30"+
		"\2\u00b0\u00b6\5\61\31\2\u00b1\u00b6\5-\27\2\u00b2\u00b6\5\63\32\2\u00b3"+
		"\u00b6\5\65\33\2\u00b4\u00b6\5\67\34\2\u00b5\u00af\3\2\2\2\u00b5\u00b0"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		".\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd"+
		"\62\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0\64\3\2\2\2\u00c1"+
		"\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c68\3\2\2\2\u00c7\u00ca\5;\36\2\u00c8\u00ca\5=\37\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc"+
		"<\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce>\3\2\2\2\u00cf\u00d3\5A!\2\u00d0\u00d3"+
		"\5C\"\2\u00d1\u00d3\5E#\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5B\3\2\2\2\u00d6"+
		"\u00d7\7\61\2\2\u00d7D\3\2\2\2\u00d8\u00d9\7\'\2\2\u00d9F\3\2\2\2\u00da"+
		"\u00db\7=\2\2\u00dbH\3\2\2\2\u00dc\u00dd\t\7\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b%\2\2\u00dfJ\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7,\2\2\u00e2"+
		"\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b&\2\2\u00edL\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\n\b\2\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\'\2\2\u00f8N\3\2\2\2\21\2z"+
		"\177\u0081\u0085\u008a\u0090\u0094\u0099\u009f\u00b5\u00c9\u00d2\u00e6"+
		"\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}