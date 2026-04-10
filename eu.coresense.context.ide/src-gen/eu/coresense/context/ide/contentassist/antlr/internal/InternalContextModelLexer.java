package eu.coresense.context.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextModelLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=10;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_BINARY=9;
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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:13:7: ( 'cache?' )
            // InternalContextModel.g:13:9: 'cache?'
            {
            match("cache?"); 


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
            // InternalContextModel.g:14:7: ( 'function_name' )
            // InternalContextModel.g:14:9: 'function_name'
            {
            match("function_name"); 


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
            // InternalContextModel.g:15:7: ( '}' )
            // InternalContextModel.g:15:9: '}'
            {
            match('}'); 

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
            // InternalContextModel.g:16:7: ( 'cache' )
            // InternalContextModel.g:16:9: 'cache'
            {
            match("cache"); 


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
            // InternalContextModel.g:17:7: ( 'length' )
            // InternalContextModel.g:17:9: 'length'
            {
            match("length"); 


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
            // InternalContextModel.g:18:7: ( 's' )
            // InternalContextModel.g:18:9: 's'
            {
            match('s'); 

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
            // InternalContextModel.g:19:7: ( 'period' )
            // InternalContextModel.g:19:9: 'period'
            {
            match("period"); 


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
            // InternalContextModel.g:20:7: ( 'ns' )
            // InternalContextModel.g:20:9: 'ns'
            {
            match("ns"); 


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
            // InternalContextModel.g:21:7: ( 'proxy' )
            // InternalContextModel.g:21:9: 'proxy'
            {
            match("proxy"); 


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
            // InternalContextModel.g:22:7: ( 'function_lib' )
            // InternalContextModel.g:22:9: 'function_lib'
            {
            match("function_lib"); 


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
            // InternalContextModel.g:23:7: ( 'source:' )
            // InternalContextModel.g:23:9: 'source:'
            {
            match("source:"); 


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
            // InternalContextModel.g:24:7: ( 'origin:' )
            // InternalContextModel.g:24:9: 'origin:'
            {
            match("origin:"); 


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
            // InternalContextModel.g:25:7: ( 'publisher:' )
            // InternalContextModel.g:25:9: 'publisher:'
            {
            match("publisher:"); 


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
            // InternalContextModel.g:26:7: ( '.' )
            // InternalContextModel.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:27:7: ( 'service:' )
            // InternalContextModel.g:27:9: 'service:'
            {
            match("service:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:28:7: ( 'request_kwargs' )
            // InternalContextModel.g:28:9: 'request_kwargs'
            {
            match("request_kwargs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:29:7: ( 'action:' )
            // InternalContextModel.g:29:9: 'action:'
            {
            match("action:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:30:7: ( 'goal_kwargs' )
            // InternalContextModel.g:30:9: 'goal_kwargs'
            {
            match("goal_kwargs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:31:7: ( 'import' )
            // InternalContextModel.g:31:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:32:7: ( ';' )
            // InternalContextModel.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalContextModel.g:2139:21: ( '0' .. '9' )
            // InternalContextModel.g:2139:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:2141:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalContextModel.g:2141:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalContextModel.g:2141:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalContextModel.g:2141:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2141:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalContextModel.g:2141:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContextModel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:2143:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalContextModel.g:2143:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalContextModel.g:2143:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.'||(LA5_0>='0' && LA5_0<='9')||LA5_0=='E'||LA5_0=='e') ) {
                alt5=1;
            }
            else if ( (LA5_0=='-') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalContextModel.g:2143:16: ( RULE_DIGIT )*
                    {
                    // InternalContextModel.g:2143:16: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalContextModel.g:2143:16: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2143:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalContextModel.g:2143:32: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalContextModel.g:2143:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalContextModel.g:2143:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalContextModel.g:2143:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalContextModel.g:2143:50: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalContextModel.g:2143:50: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2143:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalContextModel.g:2143:63: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalContextModel.g:2143:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalContextModel.g:2143:68: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalContextModel.g:2143:68: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalContextModel.g:2143:92: ( '-' | '+' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalContextModel.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalContextModel.g:2143:103: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalContextModel.g:2143:103: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            // InternalContextModel.g:2145:22: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalContextModel.g:2145:24: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalContextModel.g:2145:24: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt14=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt14=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt14=2;
                }
                break;
            case '-':
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalContextModel.g:2145:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2145:29: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalContextModel.g:2145:38: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalContextModel.g:2145:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalContextModel.g:2145:50: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalContextModel.g:2145:63: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalContextModel.g:2145:63: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalContextModel.g:2147:14: ( ( 'true' | 'false' ) )
            // InternalContextModel.g:2147:16: ( 'true' | 'false' )
            {
            // InternalContextModel.g:2147:16: ( 'true' | 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='t') ) {
                alt15=1;
            }
            else if ( (LA15_0=='f') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalContextModel.g:2147:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2147:24: 'false'
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
            // InternalContextModel.g:2149:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalContextModel.g:2149:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalContextModel.g:2149:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalContextModel.g:2149:11: '^'
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

            // InternalContextModel.g:2149:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    break loop17;
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
            // InternalContextModel.g:2151:10: ( ( '0' .. '9' )+ )
            // InternalContextModel.g:2151:12: ( '0' .. '9' )+
            {
            // InternalContextModel.g:2151:12: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalContextModel.g:2151:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalContextModel.g:2153:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalContextModel.g:2153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalContextModel.g:2153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalContextModel.g:2153:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalContextModel.g:2153:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalContextModel.g:2153:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalContextModel.g:2153:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop19;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalContextModel.g:2153:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalContextModel.g:2153:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalContextModel.g:2153:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalContextModel.g:2153:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop20;
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
            // InternalContextModel.g:2155:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalContextModel.g:2155:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalContextModel.g:2155:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalContextModel.g:2155:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalContextModel.g:2157:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalContextModel.g:2157:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalContextModel.g:2157:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalContextModel.g:2157:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop23;
                }
            } while (true);

            // InternalContextModel.g:2157:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalContextModel.g:2157:41: ( '\\r' )? '\\n'
                    {
                    // InternalContextModel.g:2157:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalContextModel.g:2157:41: '\\r'
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
            // InternalContextModel.g:2159:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalContextModel.g:2159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalContextModel.g:2159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalContextModel.g:2161:16: ( . )
            // InternalContextModel.g:2161:18: .
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
        // InternalContextModel.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_BINARY | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=32;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalContextModel.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalContextModel.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalContextModel.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalContextModel.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalContextModel.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalContextModel.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalContextModel.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalContextModel.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalContextModel.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalContextModel.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalContextModel.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalContextModel.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalContextModel.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalContextModel.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalContextModel.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalContextModel.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalContextModel.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalContextModel.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalContextModel.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalContextModel.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalContextModel.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalContextModel.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalContextModel.g:1:142: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 24 :
                // InternalContextModel.g:1:154: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 25 :
                // InternalContextModel.g:1:166: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 26 :
                // InternalContextModel.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalContextModel.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalContextModel.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalContextModel.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalContextModel.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalContextModel.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalContextModel.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA11_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA11_eofS =
        "\10\uffff";
    static final String DFA11_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA11_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA11_specialS =
        "\10\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "2143:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA27_eotS =
        "\1\uffff\1\36\1\uffff\2\36\1\uffff\1\36\1\47\3\36\1\55\4\36\1\uffff\2\65\1\56\1\34\1\36\1\34\1\uffff\3\34\2\uffff\1\36\2\uffff\3\36\1\uffff\3\36\1\uffff\3\36\1\107\1\36\2\uffff\4\36\3\uffff\1\65\1\56\1\36\4\uffff\12\36\1\uffff\25\36\1\155\1\36\1\160\1\36\1\155\4\36\1\166\6\36\1\uffff\1\36\2\uffff\1\36\1\177\2\36\1\u0082\1\uffff\5\36\1\u0088\2\36\2\uffff\1\36\1\uffff\1\36\1\uffff\1\36\1\uffff\1\36\1\uffff\2\36\1\uffff\13\36\1\uffff\6\36\1\u00a3\2\36\1\u00a6\1\36\1\uffff\1\36\1\u00a9\1\uffff\2\36\1\uffff\1\u00ac\1\u00ad\2\uffff";
    static final String DFA27_eofS =
        "\u00ae\uffff";
    static final String DFA27_minS =
        "\1\0\1\157\1\uffff\2\141\1\uffff\1\145\1\60\1\145\1\163\1\162\1\55\1\145\1\143\1\157\1\155\1\uffff\2\56\1\60\1\56\1\162\1\101\1\uffff\2\0\1\52\2\uffff\1\156\2\uffff\1\143\1\156\1\154\1\uffff\1\156\1\165\1\162\1\uffff\1\162\1\157\1\142\1\60\1\151\2\uffff\1\161\1\164\1\141\1\160\3\uffff\1\56\1\60\1\165\4\uffff\1\164\1\150\1\143\1\163\1\147\1\162\1\166\1\151\1\170\1\154\1\uffff\1\147\1\165\1\151\1\154\1\157\3\145\1\164\1\145\1\164\1\143\1\151\1\157\1\171\2\151\1\145\1\157\1\137\1\162\1\60\1\170\1\60\1\151\1\60\1\150\1\145\1\143\1\144\1\60\1\163\1\156\1\163\1\156\1\153\1\164\1\uffff\1\164\2\uffff\1\157\1\60\1\72\1\145\1\60\1\uffff\1\150\1\72\1\164\1\72\1\167\1\60\1\126\1\156\2\uffff\1\72\1\uffff\1\145\1\uffff\1\137\1\uffff\1\141\1\uffff\1\141\1\137\1\uffff\1\162\1\153\2\162\1\154\1\72\1\167\1\147\1\151\1\141\1\151\1\uffff\1\141\1\163\1\141\1\155\1\142\1\162\1\60\1\142\1\145\1\60\1\147\1\uffff\1\154\1\60\1\uffff\1\163\1\145\1\uffff\2\60\2\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\157\1\uffff\1\141\1\165\1\uffff\1\145\1\172\1\165\1\163\1\162\2\145\1\143\1\157\1\155\1\uffff\2\145\1\172\1\145\1\162\1\172\1\uffff\2\uffff\1\57\2\uffff\1\156\2\uffff\1\143\1\156\1\154\1\uffff\1\156\1\165\1\162\1\uffff\1\162\1\157\1\142\1\172\1\151\2\uffff\1\161\1\164\1\141\1\160\3\uffff\1\145\1\172\1\165\4\uffff\1\164\1\150\1\143\1\163\1\147\1\162\1\166\1\151\1\170\1\154\1\uffff\1\147\1\165\1\151\1\154\1\157\3\145\1\164\1\145\1\164\1\143\1\151\1\157\1\171\2\151\1\145\1\157\1\137\1\162\1\172\1\170\1\172\1\151\1\172\1\150\1\145\1\143\1\144\1\172\1\163\1\156\1\163\1\156\1\153\1\164\1\uffff\1\164\2\uffff\1\157\1\172\1\72\1\145\1\172\1\uffff\1\150\1\72\1\164\1\72\1\167\1\172\1\126\1\156\2\uffff\1\72\1\uffff\1\145\1\uffff\1\137\1\uffff\1\141\1\uffff\1\141\1\137\1\uffff\1\162\1\153\2\162\1\156\1\72\1\167\1\147\1\151\1\141\1\151\1\uffff\1\141\1\163\1\141\1\155\1\142\1\162\1\172\1\142\1\145\1\172\1\147\1\uffff\1\154\1\172\1\uffff\1\163\1\145\1\uffff\2\172\2\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\12\uffff\1\26\6\uffff\1\32\3\uffff\1\37\1\40\1\uffff\1\32\1\2\3\uffff\1\5\3\uffff\1\10\5\uffff\1\20\1\30\4\uffff\1\26\1\27\1\33\3\uffff\1\34\1\35\1\36\1\37\12\uffff\1\12\45\uffff\1\31\1\uffff\1\3\1\6\5\uffff\1\13\10\uffff\1\7\1\15\1\uffff\1\11\1\uffff\1\16\1\uffff\1\23\1\uffff\1\25\2\uffff\1\21\13\uffff\1\17\13\uffff\1\24\2\uffff\1\14\2\uffff\1\4\2\uffff\1\22\1\1";
    static final String DFA27_specialS =
        "\1\1\27\uffff\1\2\1\0\u0094\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\5\34\1\24\1\13\1\32\1\21\11\22\1\34\1\20\5\34\2\27\1\1\1\27\1\23\25\27\3\34\1\26\1\27\1\34\1\15\1\27\1\3\1\27\1\23\1\4\1\16\1\27\1\17\2\27\1\6\1\27\1\11\1\12\1\10\1\27\1\14\1\7\1\25\6\27\1\2\1\34\1\5\uff82\34",
            "\1\35",
            "",
            "\1\40",
            "\1\42\23\uffff\1\41",
            "",
            "\1\44",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\46\11\36\1\45\13\36",
            "\1\50\14\uffff\1\51\2\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\56\2\uffff\12\56\13\uffff\1\56\37\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\56\1\uffff\12\66\10\uffff\1\64\2\uffff\1\56\34\uffff\1\64\2\uffff\1\56",
            "\1\56\1\uffff\12\66\13\uffff\1\56\37\uffff\1\56",
            "\12\67\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\56\1\uffff\12\56\13\uffff\1\56\37\uffff\1\56",
            "\1\70",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "\1\56\1\uffff\12\66\13\uffff\1\56\37\uffff\1\56",
            "\12\67\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\115",
            "",
            "",
            "",
            "",
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
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\156",
            "\12\36\5\uffff\1\157\1\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "",
            "\1\176",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0080",
            "\1\u0081",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "",
            "\1\u008c",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0096\1\uffff\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a4",
            "\1\u00a5",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_BINARY | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_25 = input.LA(1);

                        s = -1;
                        if ( ((LA27_25>='\u0000' && LA27_25<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='C') ) {s = 1;}

                        else if ( (LA27_0=='{') ) {s = 2;}

                        else if ( (LA27_0=='c') ) {s = 3;}

                        else if ( (LA27_0=='f') ) {s = 4;}

                        else if ( (LA27_0=='}') ) {s = 5;}

                        else if ( (LA27_0=='l') ) {s = 6;}

                        else if ( (LA27_0=='s') ) {s = 7;}

                        else if ( (LA27_0=='p') ) {s = 8;}

                        else if ( (LA27_0=='n') ) {s = 9;}

                        else if ( (LA27_0=='o') ) {s = 10;}

                        else if ( (LA27_0=='.') ) {s = 11;}

                        else if ( (LA27_0=='r') ) {s = 12;}

                        else if ( (LA27_0=='a') ) {s = 13;}

                        else if ( (LA27_0=='g') ) {s = 14;}

                        else if ( (LA27_0=='i') ) {s = 15;}

                        else if ( (LA27_0==';') ) {s = 16;}

                        else if ( (LA27_0=='0') ) {s = 17;}

                        else if ( ((LA27_0>='1' && LA27_0<='9')) ) {s = 18;}

                        else if ( (LA27_0=='E'||LA27_0=='e') ) {s = 19;}

                        else if ( (LA27_0=='-') ) {s = 20;}

                        else if ( (LA27_0=='t') ) {s = 21;}

                        else if ( (LA27_0=='^') ) {s = 22;}

                        else if ( ((LA27_0>='A' && LA27_0<='B')||LA27_0=='D'||(LA27_0>='F' && LA27_0<='Z')||LA27_0=='_'||LA27_0=='b'||LA27_0=='d'||LA27_0=='h'||(LA27_0>='j' && LA27_0<='k')||LA27_0=='m'||LA27_0=='q'||(LA27_0>='u' && LA27_0<='z')) ) {s = 23;}

                        else if ( (LA27_0=='\"') ) {s = 24;}

                        else if ( (LA27_0=='\'') ) {s = 25;}

                        else if ( (LA27_0=='/') ) {s = 26;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 27;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='#' && LA27_0<='&')||(LA27_0>='(' && LA27_0<=',')||LA27_0==':'||(LA27_0>='<' && LA27_0<='@')||(LA27_0>='[' && LA27_0<=']')||LA27_0=='`'||LA27_0=='|'||(LA27_0>='~' && LA27_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_24 = input.LA(1);

                        s = -1;
                        if ( ((LA27_24>='\u0000' && LA27_24<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}