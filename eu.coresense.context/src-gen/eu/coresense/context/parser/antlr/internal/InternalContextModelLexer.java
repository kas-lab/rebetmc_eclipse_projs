package eu.coresense.context.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextModelLexer extends Lexer {
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalContextModelLexer() {;} 
    public InternalContextModelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalContextModelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalContextModel.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:11:7: ( 'ContextVariable' )
            // InternalContextModel.g:11:9: 'ContextVariable'
            {
            match("ContextVariable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:12:7: ( '{' )
            // InternalContextModel.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:13:7: ( 'efferent:' )
            // InternalContextModel.g:13:9: 'efferent:'
            {
            match("efferent:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:14:7: ( 'cache?' )
            // InternalContextModel.g:14:9: 'cache?'
            {
            match("cache?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:15:7: ( 'cache' )
            // InternalContextModel.g:15:9: 'cache'
            {
            match("cache"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:16:7: ( 'length' )
            // InternalContextModel.g:16:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:17:7: ( 's' )
            // InternalContextModel.g:17:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:18:7: ( 'period' )
            // InternalContextModel.g:18:9: 'period'
            {
            match("period"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:19:7: ( 'ns' )
            // InternalContextModel.g:19:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:20:7: ( 'function_name' )
            // InternalContextModel.g:20:9: 'function_name'
            {
            match("function_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:21:7: ( 'function_lib' )
            // InternalContextModel.g:21:9: 'function_lib'
            {
            match("function_lib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:22:7: ( '}' )
            // InternalContextModel.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:23:7: ( 'afferent:' )
            // InternalContextModel.g:23:9: 'afferent:'
            {
            match("afferent:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:24:7: ( 'publisher:' )
            // InternalContextModel.g:24:9: 'publisher:'
            {
            match("publisher:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:25:7: ( 'service:' )
            // InternalContextModel.g:25:9: 'service:'
            {
            match("service:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:26:7: ( 'action:' )
            // InternalContextModel.g:26:9: 'action:'
            {
            match("action:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:27:7: ( '.' )
            // InternalContextModel.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:28:7: ( 'import' )
            // InternalContextModel.g:28:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:29:7: ( ';' )
            // InternalContextModel.g:29:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:30:7: ( 'contextModelNode' )
            // InternalContextModel.g:30:9: 'contextModelNode'
            {
            match("contextModelNode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:655:14: ( ( 'true' | 'false' ) )
            // InternalContextModel.g:655:16: ( 'true' | 'false' )
            {
            // InternalContextModel.g:655:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalContextModel.g:655:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:655:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:657:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalContextModel.g:657:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalContextModel.g:657:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalContextModel.g:657:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalContextModel.g:657:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalContextModel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:659:10: ( ( '0' .. '9' )+ )
            // InternalContextModel.g:659:12: ( '0' .. '9' )+
            {
            // InternalContextModel.g:659:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalContextModel.g:659:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:661:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalContextModel.g:661:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalContextModel.g:661:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalContextModel.g:661:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalContextModel.g:661:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalContextModel.g:661:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalContextModel.g:661:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalContextModel.g:661:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalContextModel.g:661:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalContextModel.g:661:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalContextModel.g:661:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:663:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalContextModel.g:663:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalContextModel.g:663:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalContextModel.g:663:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:665:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalContextModel.g:665:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalContextModel.g:665:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalContextModel.g:665:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalContextModel.g:665:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalContextModel.g:665:41: ( '\\r' )? '\\n'
                    {
                    // InternalContextModel.g:665:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalContextModel.g:665:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:667:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalContextModel.g:667:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalContextModel.g:667:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalContextModel.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:669:16: ( . )
            // InternalContextModel.g:669:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalContextModel.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=28;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalContextModel.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalContextModel.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalContextModel.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalContextModel.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalContextModel.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalContextModel.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalContextModel.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalContextModel.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalContextModel.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalContextModel.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalContextModel.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalContextModel.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalContextModel.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalContextModel.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalContextModel.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalContextModel.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalContextModel.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalContextModel.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalContextModel.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalContextModel.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalContextModel.g:1:130: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 22 :
                // InternalContextModel.g:1:143: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalContextModel.g:1:151: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalContextModel.g:1:160: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalContextModel.g:1:172: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalContextModel.g:1:188: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalContextModel.g:1:204: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalContextModel.g:1:212: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\31\1\uffff\3\31\1\40\3\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\27\2\uffff\3\27\2\uffff\1\31\2\uffff\5\31\1\uffff\2\31\1\72\2\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\31\5\uffff\10\31\1\uffff\23\31\1\134\2\31\1\140\6\31\1\134\3\31\1\uffff\2\31\2\uffff\1\31\1\155\1\31\1\157\4\31\1\164\3\31\1\uffff\1\31\1\uffff\3\31\2\uffff\3\31\1\uffff\4\31\1\uffff\3\31\1\uffff\2\31\1\uffff\11\31\1\u0092\2\31\1\u0095\1\uffff\2\31\1\uffff\1\u0098\1\31\1\uffff\1\u009a\1\uffff";
    static final String DFA13_eofS =
        "\u009b\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\1\uffff\1\146\1\141\1\145\1\60\1\145\1\163\1\141\1\uffff\1\143\1\uffff\1\155\1\uffff\1\162\1\101\2\uffff\2\0\1\52\2\uffff\1\156\2\uffff\1\146\1\143\2\156\1\162\1\uffff\1\162\1\142\1\60\1\156\1\154\1\uffff\1\146\1\164\1\uffff\1\160\1\uffff\1\165\5\uffff\1\164\1\145\1\150\1\164\1\147\1\166\1\151\1\154\1\uffff\1\143\1\163\1\145\1\151\1\157\2\145\1\162\2\145\1\164\1\151\1\157\1\151\1\164\1\145\1\162\1\157\1\162\1\60\1\170\1\145\1\60\1\170\1\150\1\143\1\144\1\163\1\151\1\60\1\145\1\156\1\164\1\uffff\1\164\1\156\2\uffff\1\164\1\60\1\145\1\60\1\150\1\157\1\156\1\72\1\60\1\126\1\164\1\115\1\uffff\1\72\1\uffff\1\145\1\156\1\164\2\uffff\1\141\1\72\1\157\1\uffff\1\162\1\137\1\72\1\162\1\uffff\1\144\1\72\1\154\1\uffff\1\151\1\145\1\uffff\1\141\1\151\1\141\1\154\1\155\2\142\1\116\1\145\1\60\1\154\1\157\1\60\1\uffff\1\145\1\144\1\uffff\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\uffff\1\146\1\157\1\145\1\172\1\165\1\163\1\165\1\uffff\1\146\1\uffff\1\155\1\uffff\1\162\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\2\uffff\1\146\1\143\2\156\1\162\1\uffff\1\162\1\142\1\172\1\156\1\154\1\uffff\1\146\1\164\1\uffff\1\160\1\uffff\1\165\5\uffff\1\164\1\145\1\150\1\164\1\147\1\166\1\151\1\154\1\uffff\1\143\1\163\1\145\1\151\1\157\2\145\1\162\2\145\1\164\1\151\1\157\1\151\1\164\1\145\1\162\1\157\1\162\1\172\1\170\1\145\1\172\1\170\1\150\1\143\1\144\1\163\1\151\1\172\1\145\1\156\1\164\1\uffff\1\164\1\156\2\uffff\1\164\1\172\1\145\1\172\1\150\1\157\1\156\1\72\1\172\1\126\1\164\1\115\1\uffff\1\72\1\uffff\1\145\1\156\1\164\2\uffff\1\141\1\72\1\157\1\uffff\1\162\1\137\1\72\1\162\1\uffff\1\144\1\72\1\156\1\uffff\1\151\1\145\1\uffff\1\141\1\151\1\141\1\154\1\155\2\142\1\116\1\145\1\172\1\154\1\157\1\172\1\uffff\1\145\1\144\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\7\uffff\1\14\1\uffff\1\21\1\uffff\1\23\2\uffff\1\26\1\27\3\uffff\1\33\1\34\1\uffff\1\26\1\2\5\uffff\1\7\5\uffff\1\14\2\uffff\1\21\1\uffff\1\23\1\uffff\1\27\1\30\1\31\1\32\1\33\10\uffff\1\11\41\uffff\1\25\2\uffff\1\4\1\5\14\uffff\1\6\1\uffff\1\10\3\uffff\1\20\1\22\3\uffff\1\17\4\uffff\1\3\3\uffff\1\15\2\uffff\1\16\15\uffff\1\13\2\uffff\1\12\2\uffff\1\1\1\uffff\1\24";
    static final String DFA13_specialS =
        "\1\1\22\uffff\1\0\1\2\u0086\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\6\27\1\14\1\25\12\22\1\27\1\16\5\27\2\21\1\1\27\21\3\27\1\20\1\21\1\27\1\13\1\21\1\4\1\21\1\3\1\11\2\21\1\15\2\21\1\5\1\21\1\10\1\21\1\7\2\21\1\6\1\17\6\21\1\2\1\27\1\12\uff82\27",
            "\1\30",
            "",
            "\1\33",
            "\1\34\15\uffff\1\35",
            "\1\36",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\37\25\31",
            "\1\41\17\uffff\1\42",
            "\1\43",
            "\1\45\23\uffff\1\44",
            "",
            "\1\50\2\uffff\1\47",
            "",
            "\1\52",
            "",
            "\1\54",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\73",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\135",
            "\1\136",
            "\12\31\5\uffff\1\137\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\156",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0086\1\uffff\1\u0085",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0093",
            "\1\u0094",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0099",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='C') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='e') ) {s = 3;}

                        else if ( (LA13_0=='c') ) {s = 4;}

                        else if ( (LA13_0=='l') ) {s = 5;}

                        else if ( (LA13_0=='s') ) {s = 6;}

                        else if ( (LA13_0=='p') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( (LA13_0=='f') ) {s = 9;}

                        else if ( (LA13_0=='}') ) {s = 10;}

                        else if ( (LA13_0=='a') ) {s = 11;}

                        else if ( (LA13_0=='.') ) {s = 12;}

                        else if ( (LA13_0=='i') ) {s = 13;}

                        else if ( (LA13_0==';') ) {s = 14;}

                        else if ( (LA13_0=='t') ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='D' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||LA13_0=='o'||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='z')) ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}