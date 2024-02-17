// Generated from c:\Users\Suraj_Kentura\Desktop\ProjectsToSolveDailyIssues\DiffR\DiffR.Logic\Antlr\DiffRHelper.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiffRHelperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, ID=6, NUM=7, COMMA=8, DOT=9, QUOTE=10, 
		WS=11;
	public static final int
		RULE_message = 0, RULE_line = 1, RULE_text = 2, RULE_jsonObj = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"message", "line", "text", "jsonObj"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", null, null, null, "','", "'.'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INT", "ID", "NUM", "COMMA", "DOT", "QUOTE", 
			"WS"
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
	public String getGrammarFileName() { return "DiffRHelper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiffRHelperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DiffRHelperParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_message);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				line();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << ID) | (1L << NUM) | (1L << COMMA) | (1L << DOT) | (1L << QUOTE))) != 0) );
			setState(13);
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

	public static class LineContext extends ParserRuleContext {
		public List<JsonObjContext> jsonObj() {
			return getRuleContexts(JsonObjContext.class);
		}
		public JsonObjContext jsonObj(int i) {
			return getRuleContext(JsonObjContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				text();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << ID) | (1L << NUM) | (1L << COMMA) | (1L << DOT) | (1L << QUOTE))) != 0) );
			setState(20);
			jsonObj();
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				text();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << ID) | (1L << NUM) | (1L << COMMA) | (1L << DOT) | (1L << QUOTE))) != 0) );
			setState(26);
			jsonObj();
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(27);
					text();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DiffRHelperParser.ID, 0); }
		public TerminalNode NUM() { return getToken(DiffRHelperParser.NUM, 0); }
		public TerminalNode COMMA() { return getToken(DiffRHelperParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(DiffRHelperParser.INT, 0); }
		public TerminalNode DOT() { return getToken(DiffRHelperParser.DOT, 0); }
		public TerminalNode QUOTE() { return getToken(DiffRHelperParser.QUOTE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(NUM);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(COMMA);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(INT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(ID);
				setState(38);
				match(INT);
				setState(39);
				match(T__1);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(DOT);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				match(QUOTE);
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

	public static class JsonObjContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public JsonObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObj; }
	}

	public final JsonObjContext jsonObj() throws RecognitionException {
		JsonObjContext _localctx = new JsonObjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jsonObj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			text();
			setState(46);
			match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\6\3\23\n\3\r"+
		"\3\16\3\24\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\6\3\37\n\3\r\3\16\3"+
		" \3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\2\2\6\2\4\6\b\2\2\28\2\13\3\2\2\2\4\22\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2"+
		"\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17"+
		"\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\23\5\6\4\2\22\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\30\5\b\5\2\27\31"+
		"\5\6\4\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34"+
		"\3\2\2\2\34\36\5\b\5\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\5\3\2\2\2\"-\7\b\2\2#-\7\t\2\2$-\7\n\2\2%-\7\7\2\2&\'"+
		"\7\3\2\2\'(\7\b\2\2()\7\7\2\2)-\7\4\2\2*-\7\13\2\2+-\7\f\2\2,\"\3\2\2"+
		"\2,#\3\2\2\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\7\3\2"+
		"\2\2./\7\5\2\2/\60\5\6\4\2\60\61\7\6\2\2\61\t\3\2\2\2\7\r\24\32 ,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}