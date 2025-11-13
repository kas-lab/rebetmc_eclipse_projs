package eu.coresense.context.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import eu.coresense.context.services.ContextModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContextVariable'", "'{'", "'function_name:'", "'}'", "'topic:'", "'service:'", "'action:'", "'import'", "';'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalContextModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContextModel.g"; }


    	private ContextModelGrammarAccess grammarAccess;

    	public void setGrammarAccess(ContextModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleContextModel"
    // InternalContextModel.g:53:1: entryRuleContextModel : ruleContextModel EOF ;
    public final void entryRuleContextModel() throws RecognitionException {
        try {
            // InternalContextModel.g:54:1: ( ruleContextModel EOF )
            // InternalContextModel.g:55:1: ruleContextModel EOF
            {
             before(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            ruleContextModel();

            state._fsp--;

             after(grammarAccess.getContextModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalContextModel.g:62:1: ruleContextModel : ( ( rule__ContextModel__Group__0 ) ) ;
    public final void ruleContextModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:66:2: ( ( ( rule__ContextModel__Group__0 ) ) )
            // InternalContextModel.g:67:2: ( ( rule__ContextModel__Group__0 ) )
            {
            // InternalContextModel.g:67:2: ( ( rule__ContextModel__Group__0 ) )
            // InternalContextModel.g:68:3: ( rule__ContextModel__Group__0 )
            {
             before(grammarAccess.getContextModelAccess().getGroup()); 
            // InternalContextModel.g:69:3: ( rule__ContextModel__Group__0 )
            // InternalContextModel.g:69:4: rule__ContextModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContextVar"
    // InternalContextModel.g:78:1: entryRuleContextVar : ruleContextVar EOF ;
    public final void entryRuleContextVar() throws RecognitionException {
        try {
            // InternalContextModel.g:79:1: ( ruleContextVar EOF )
            // InternalContextModel.g:80:1: ruleContextVar EOF
            {
             before(grammarAccess.getContextVarRule()); 
            pushFollow(FOLLOW_1);
            ruleContextVar();

            state._fsp--;

             after(grammarAccess.getContextVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextVar"


    // $ANTLR start "ruleContextVar"
    // InternalContextModel.g:87:1: ruleContextVar : ( ( rule__ContextVar__Group__0 ) ) ;
    public final void ruleContextVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:91:2: ( ( ( rule__ContextVar__Group__0 ) ) )
            // InternalContextModel.g:92:2: ( ( rule__ContextVar__Group__0 ) )
            {
            // InternalContextModel.g:92:2: ( ( rule__ContextVar__Group__0 ) )
            // InternalContextModel.g:93:3: ( rule__ContextVar__Group__0 )
            {
             before(grammarAccess.getContextVarAccess().getGroup()); 
            // InternalContextModel.g:94:3: ( rule__ContextVar__Group__0 )
            // InternalContextModel.g:94:4: rule__ContextVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextVar"


    // $ANTLR start "entryRuleDataSource"
    // InternalContextModel.g:103:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // InternalContextModel.g:104:1: ( ruleDataSource EOF )
            // InternalContextModel.g:105:1: ruleDataSource EOF
            {
             before(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSource();

            state._fsp--;

             after(grammarAccess.getDataSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalContextModel.g:112:1: ruleDataSource : ( ( rule__DataSource__Alternatives ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:116:2: ( ( ( rule__DataSource__Alternatives ) ) )
            // InternalContextModel.g:117:2: ( ( rule__DataSource__Alternatives ) )
            {
            // InternalContextModel.g:117:2: ( ( rule__DataSource__Alternatives ) )
            // InternalContextModel.g:118:3: ( rule__DataSource__Alternatives )
            {
             before(grammarAccess.getDataSourceAccess().getAlternatives()); 
            // InternalContextModel.g:119:3: ( rule__DataSource__Alternatives )
            // InternalContextModel.g:119:4: rule__DataSource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleImport"
    // InternalContextModel.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalContextModel.g:129:1: ( ruleImport EOF )
            // InternalContextModel.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalContextModel.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalContextModel.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalContextModel.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalContextModel.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalContextModel.g:144:3: ( rule__Import__Group__0 )
            // InternalContextModel.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "rule__DataSource__Alternatives"
    // InternalContextModel.g:152:1: rule__DataSource__Alternatives : ( ( ( rule__DataSource__Group_0__0 ) ) | ( ( rule__DataSource__Group_1__0 ) ) | ( ( rule__DataSource__Group_2__0 ) ) );
    public final void rule__DataSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:156:1: ( ( ( rule__DataSource__Group_0__0 ) ) | ( ( rule__DataSource__Group_1__0 ) ) | ( ( rule__DataSource__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalContextModel.g:157:2: ( ( rule__DataSource__Group_0__0 ) )
                    {
                    // InternalContextModel.g:157:2: ( ( rule__DataSource__Group_0__0 ) )
                    // InternalContextModel.g:158:3: ( rule__DataSource__Group_0__0 )
                    {
                     before(grammarAccess.getDataSourceAccess().getGroup_0()); 
                    // InternalContextModel.g:159:3: ( rule__DataSource__Group_0__0 )
                    // InternalContextModel.g:159:4: rule__DataSource__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataSourceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:163:2: ( ( rule__DataSource__Group_1__0 ) )
                    {
                    // InternalContextModel.g:163:2: ( ( rule__DataSource__Group_1__0 ) )
                    // InternalContextModel.g:164:3: ( rule__DataSource__Group_1__0 )
                    {
                     before(grammarAccess.getDataSourceAccess().getGroup_1()); 
                    // InternalContextModel.g:165:3: ( rule__DataSource__Group_1__0 )
                    // InternalContextModel.g:165:4: rule__DataSource__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataSourceAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContextModel.g:169:2: ( ( rule__DataSource__Group_2__0 ) )
                    {
                    // InternalContextModel.g:169:2: ( ( rule__DataSource__Group_2__0 ) )
                    // InternalContextModel.g:170:3: ( rule__DataSource__Group_2__0 )
                    {
                     before(grammarAccess.getDataSourceAccess().getGroup_2()); 
                    // InternalContextModel.g:171:3: ( rule__DataSource__Group_2__0 )
                    // InternalContextModel.g:171:4: rule__DataSource__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataSourceAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Alternatives"


    // $ANTLR start "rule__ContextModel__Group__0"
    // InternalContextModel.g:179:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:183:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalContextModel.g:184:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__0"


    // $ANTLR start "rule__ContextModel__Group__0__Impl"
    // InternalContextModel.g:191:1: rule__ContextModel__Group__0__Impl : ( ( rule__ContextModel__ImportsAssignment_0 )* ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:195:1: ( ( ( rule__ContextModel__ImportsAssignment_0 )* ) )
            // InternalContextModel.g:196:1: ( ( rule__ContextModel__ImportsAssignment_0 )* )
            {
            // InternalContextModel.g:196:1: ( ( rule__ContextModel__ImportsAssignment_0 )* )
            // InternalContextModel.g:197:2: ( rule__ContextModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getContextModelAccess().getImportsAssignment_0()); 
            // InternalContextModel.g:198:2: ( rule__ContextModel__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContextModel.g:198:3: rule__ContextModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ContextModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__0__Impl"


    // $ANTLR start "rule__ContextModel__Group__1"
    // InternalContextModel.g:206:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:210:1: ( rule__ContextModel__Group__1__Impl )
            // InternalContextModel.g:211:2: rule__ContextModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__1"


    // $ANTLR start "rule__ContextModel__Group__1__Impl"
    // InternalContextModel.g:217:1: rule__ContextModel__Group__1__Impl : ( ( rule__ContextModel__Context_variablesAssignment_1 )* ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:221:1: ( ( ( rule__ContextModel__Context_variablesAssignment_1 )* ) )
            // InternalContextModel.g:222:1: ( ( rule__ContextModel__Context_variablesAssignment_1 )* )
            {
            // InternalContextModel.g:222:1: ( ( rule__ContextModel__Context_variablesAssignment_1 )* )
            // InternalContextModel.g:223:2: ( rule__ContextModel__Context_variablesAssignment_1 )*
            {
             before(grammarAccess.getContextModelAccess().getContext_variablesAssignment_1()); 
            // InternalContextModel.g:224:2: ( rule__ContextModel__Context_variablesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalContextModel.g:224:3: rule__ContextModel__Context_variablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ContextModel__Context_variablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getContext_variablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__1__Impl"


    // $ANTLR start "rule__ContextVar__Group__0"
    // InternalContextModel.g:233:1: rule__ContextVar__Group__0 : rule__ContextVar__Group__0__Impl rule__ContextVar__Group__1 ;
    public final void rule__ContextVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:237:1: ( rule__ContextVar__Group__0__Impl rule__ContextVar__Group__1 )
            // InternalContextModel.g:238:2: rule__ContextVar__Group__0__Impl rule__ContextVar__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ContextVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__0"


    // $ANTLR start "rule__ContextVar__Group__0__Impl"
    // InternalContextModel.g:245:1: rule__ContextVar__Group__0__Impl : ( 'ContextVariable' ) ;
    public final void rule__ContextVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:249:1: ( ( 'ContextVariable' ) )
            // InternalContextModel.g:250:1: ( 'ContextVariable' )
            {
            // InternalContextModel.g:250:1: ( 'ContextVariable' )
            // InternalContextModel.g:251:2: 'ContextVariable'
            {
             before(grammarAccess.getContextVarAccess().getContextVariableKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getContextVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__0__Impl"


    // $ANTLR start "rule__ContextVar__Group__1"
    // InternalContextModel.g:260:1: rule__ContextVar__Group__1 : rule__ContextVar__Group__1__Impl rule__ContextVar__Group__2 ;
    public final void rule__ContextVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:264:1: ( rule__ContextVar__Group__1__Impl rule__ContextVar__Group__2 )
            // InternalContextModel.g:265:2: rule__ContextVar__Group__1__Impl rule__ContextVar__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ContextVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__1"


    // $ANTLR start "rule__ContextVar__Group__1__Impl"
    // InternalContextModel.g:272:1: rule__ContextVar__Group__1__Impl : ( ( rule__ContextVar__NameAssignment_1 ) ) ;
    public final void rule__ContextVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:276:1: ( ( ( rule__ContextVar__NameAssignment_1 ) ) )
            // InternalContextModel.g:277:1: ( ( rule__ContextVar__NameAssignment_1 ) )
            {
            // InternalContextModel.g:277:1: ( ( rule__ContextVar__NameAssignment_1 ) )
            // InternalContextModel.g:278:2: ( rule__ContextVar__NameAssignment_1 )
            {
             before(grammarAccess.getContextVarAccess().getNameAssignment_1()); 
            // InternalContextModel.g:279:2: ( rule__ContextVar__NameAssignment_1 )
            // InternalContextModel.g:279:3: rule__ContextVar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextVar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextVarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__1__Impl"


    // $ANTLR start "rule__ContextVar__Group__2"
    // InternalContextModel.g:287:1: rule__ContextVar__Group__2 : rule__ContextVar__Group__2__Impl rule__ContextVar__Group__3 ;
    public final void rule__ContextVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:291:1: ( rule__ContextVar__Group__2__Impl rule__ContextVar__Group__3 )
            // InternalContextModel.g:292:2: rule__ContextVar__Group__2__Impl rule__ContextVar__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ContextVar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__2"


    // $ANTLR start "rule__ContextVar__Group__2__Impl"
    // InternalContextModel.g:299:1: rule__ContextVar__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:303:1: ( ( '{' ) )
            // InternalContextModel.g:304:1: ( '{' )
            {
            // InternalContextModel.g:304:1: ( '{' )
            // InternalContextModel.g:305:2: '{'
            {
             before(grammarAccess.getContextVarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__2__Impl"


    // $ANTLR start "rule__ContextVar__Group__3"
    // InternalContextModel.g:314:1: rule__ContextVar__Group__3 : rule__ContextVar__Group__3__Impl rule__ContextVar__Group__4 ;
    public final void rule__ContextVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:318:1: ( rule__ContextVar__Group__3__Impl rule__ContextVar__Group__4 )
            // InternalContextModel.g:319:2: rule__ContextVar__Group__3__Impl rule__ContextVar__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ContextVar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__3"


    // $ANTLR start "rule__ContextVar__Group__3__Impl"
    // InternalContextModel.g:326:1: rule__ContextVar__Group__3__Impl : ( ( rule__ContextVar__SourceAssignment_3 ) ) ;
    public final void rule__ContextVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:330:1: ( ( ( rule__ContextVar__SourceAssignment_3 ) ) )
            // InternalContextModel.g:331:1: ( ( rule__ContextVar__SourceAssignment_3 ) )
            {
            // InternalContextModel.g:331:1: ( ( rule__ContextVar__SourceAssignment_3 ) )
            // InternalContextModel.g:332:2: ( rule__ContextVar__SourceAssignment_3 )
            {
             before(grammarAccess.getContextVarAccess().getSourceAssignment_3()); 
            // InternalContextModel.g:333:2: ( rule__ContextVar__SourceAssignment_3 )
            // InternalContextModel.g:333:3: rule__ContextVar__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ContextVar__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContextVarAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__3__Impl"


    // $ANTLR start "rule__ContextVar__Group__4"
    // InternalContextModel.g:341:1: rule__ContextVar__Group__4 : rule__ContextVar__Group__4__Impl rule__ContextVar__Group__5 ;
    public final void rule__ContextVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:345:1: ( rule__ContextVar__Group__4__Impl rule__ContextVar__Group__5 )
            // InternalContextModel.g:346:2: rule__ContextVar__Group__4__Impl rule__ContextVar__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ContextVar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__4"


    // $ANTLR start "rule__ContextVar__Group__4__Impl"
    // InternalContextModel.g:353:1: rule__ContextVar__Group__4__Impl : ( 'function_name:' ) ;
    public final void rule__ContextVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:357:1: ( ( 'function_name:' ) )
            // InternalContextModel.g:358:1: ( 'function_name:' )
            {
            // InternalContextModel.g:358:1: ( 'function_name:' )
            // InternalContextModel.g:359:2: 'function_name:'
            {
             before(grammarAccess.getContextVarAccess().getFunction_nameKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getFunction_nameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__4__Impl"


    // $ANTLR start "rule__ContextVar__Group__5"
    // InternalContextModel.g:368:1: rule__ContextVar__Group__5 : rule__ContextVar__Group__5__Impl rule__ContextVar__Group__6 ;
    public final void rule__ContextVar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:372:1: ( rule__ContextVar__Group__5__Impl rule__ContextVar__Group__6 )
            // InternalContextModel.g:373:2: rule__ContextVar__Group__5__Impl rule__ContextVar__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__ContextVar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__5"


    // $ANTLR start "rule__ContextVar__Group__5__Impl"
    // InternalContextModel.g:380:1: rule__ContextVar__Group__5__Impl : ( ( rule__ContextVar__FunctionAssignment_5 ) ) ;
    public final void rule__ContextVar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:384:1: ( ( ( rule__ContextVar__FunctionAssignment_5 ) ) )
            // InternalContextModel.g:385:1: ( ( rule__ContextVar__FunctionAssignment_5 ) )
            {
            // InternalContextModel.g:385:1: ( ( rule__ContextVar__FunctionAssignment_5 ) )
            // InternalContextModel.g:386:2: ( rule__ContextVar__FunctionAssignment_5 )
            {
             before(grammarAccess.getContextVarAccess().getFunctionAssignment_5()); 
            // InternalContextModel.g:387:2: ( rule__ContextVar__FunctionAssignment_5 )
            // InternalContextModel.g:387:3: rule__ContextVar__FunctionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ContextVar__FunctionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContextVarAccess().getFunctionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__5__Impl"


    // $ANTLR start "rule__ContextVar__Group__6"
    // InternalContextModel.g:395:1: rule__ContextVar__Group__6 : rule__ContextVar__Group__6__Impl ;
    public final void rule__ContextVar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:399:1: ( rule__ContextVar__Group__6__Impl )
            // InternalContextModel.g:400:2: rule__ContextVar__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextVar__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__6"


    // $ANTLR start "rule__ContextVar__Group__6__Impl"
    // InternalContextModel.g:406:1: rule__ContextVar__Group__6__Impl : ( '}' ) ;
    public final void rule__ContextVar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:410:1: ( ( '}' ) )
            // InternalContextModel.g:411:1: ( '}' )
            {
            // InternalContextModel.g:411:1: ( '}' )
            // InternalContextModel.g:412:2: '}'
            {
             before(grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__Group__6__Impl"


    // $ANTLR start "rule__DataSource__Group_0__0"
    // InternalContextModel.g:422:1: rule__DataSource__Group_0__0 : rule__DataSource__Group_0__0__Impl rule__DataSource__Group_0__1 ;
    public final void rule__DataSource__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:426:1: ( rule__DataSource__Group_0__0__Impl rule__DataSource__Group_0__1 )
            // InternalContextModel.g:427:2: rule__DataSource__Group_0__0__Impl rule__DataSource__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__DataSource__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_0__0"


    // $ANTLR start "rule__DataSource__Group_0__0__Impl"
    // InternalContextModel.g:434:1: rule__DataSource__Group_0__0__Impl : ( 'topic:' ) ;
    public final void rule__DataSource__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:438:1: ( ( 'topic:' ) )
            // InternalContextModel.g:439:1: ( 'topic:' )
            {
            // InternalContextModel.g:439:1: ( 'topic:' )
            // InternalContextModel.g:440:2: 'topic:'
            {
             before(grammarAccess.getDataSourceAccess().getTopicKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getTopicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_0__0__Impl"


    // $ANTLR start "rule__DataSource__Group_0__1"
    // InternalContextModel.g:449:1: rule__DataSource__Group_0__1 : rule__DataSource__Group_0__1__Impl ;
    public final void rule__DataSource__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:453:1: ( rule__DataSource__Group_0__1__Impl )
            // InternalContextModel.g:454:2: rule__DataSource__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_0__1"


    // $ANTLR start "rule__DataSource__Group_0__1__Impl"
    // InternalContextModel.g:460:1: rule__DataSource__Group_0__1__Impl : ( ( rule__DataSource__TopicAssignment_0_1 ) ) ;
    public final void rule__DataSource__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:464:1: ( ( ( rule__DataSource__TopicAssignment_0_1 ) ) )
            // InternalContextModel.g:465:1: ( ( rule__DataSource__TopicAssignment_0_1 ) )
            {
            // InternalContextModel.g:465:1: ( ( rule__DataSource__TopicAssignment_0_1 ) )
            // InternalContextModel.g:466:2: ( rule__DataSource__TopicAssignment_0_1 )
            {
             before(grammarAccess.getDataSourceAccess().getTopicAssignment_0_1()); 
            // InternalContextModel.g:467:2: ( rule__DataSource__TopicAssignment_0_1 )
            // InternalContextModel.g:467:3: rule__DataSource__TopicAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__TopicAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getTopicAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_0__1__Impl"


    // $ANTLR start "rule__DataSource__Group_1__0"
    // InternalContextModel.g:476:1: rule__DataSource__Group_1__0 : rule__DataSource__Group_1__0__Impl rule__DataSource__Group_1__1 ;
    public final void rule__DataSource__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:480:1: ( rule__DataSource__Group_1__0__Impl rule__DataSource__Group_1__1 )
            // InternalContextModel.g:481:2: rule__DataSource__Group_1__0__Impl rule__DataSource__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DataSource__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_1__0"


    // $ANTLR start "rule__DataSource__Group_1__0__Impl"
    // InternalContextModel.g:488:1: rule__DataSource__Group_1__0__Impl : ( 'service:' ) ;
    public final void rule__DataSource__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:492:1: ( ( 'service:' ) )
            // InternalContextModel.g:493:1: ( 'service:' )
            {
            // InternalContextModel.g:493:1: ( 'service:' )
            // InternalContextModel.g:494:2: 'service:'
            {
             before(grammarAccess.getDataSourceAccess().getServiceKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getServiceKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_1__0__Impl"


    // $ANTLR start "rule__DataSource__Group_1__1"
    // InternalContextModel.g:503:1: rule__DataSource__Group_1__1 : rule__DataSource__Group_1__1__Impl ;
    public final void rule__DataSource__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:507:1: ( rule__DataSource__Group_1__1__Impl )
            // InternalContextModel.g:508:2: rule__DataSource__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_1__1"


    // $ANTLR start "rule__DataSource__Group_1__1__Impl"
    // InternalContextModel.g:514:1: rule__DataSource__Group_1__1__Impl : ( ( rule__DataSource__ServiceAssignment_1_1 ) ) ;
    public final void rule__DataSource__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:518:1: ( ( ( rule__DataSource__ServiceAssignment_1_1 ) ) )
            // InternalContextModel.g:519:1: ( ( rule__DataSource__ServiceAssignment_1_1 ) )
            {
            // InternalContextModel.g:519:1: ( ( rule__DataSource__ServiceAssignment_1_1 ) )
            // InternalContextModel.g:520:2: ( rule__DataSource__ServiceAssignment_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getServiceAssignment_1_1()); 
            // InternalContextModel.g:521:2: ( rule__DataSource__ServiceAssignment_1_1 )
            // InternalContextModel.g:521:3: rule__DataSource__ServiceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__ServiceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getServiceAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group_2__0"
    // InternalContextModel.g:530:1: rule__DataSource__Group_2__0 : rule__DataSource__Group_2__0__Impl rule__DataSource__Group_2__1 ;
    public final void rule__DataSource__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:534:1: ( rule__DataSource__Group_2__0__Impl rule__DataSource__Group_2__1 )
            // InternalContextModel.g:535:2: rule__DataSource__Group_2__0__Impl rule__DataSource__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__DataSource__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_2__0"


    // $ANTLR start "rule__DataSource__Group_2__0__Impl"
    // InternalContextModel.g:542:1: rule__DataSource__Group_2__0__Impl : ( 'action:' ) ;
    public final void rule__DataSource__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:546:1: ( ( 'action:' ) )
            // InternalContextModel.g:547:1: ( 'action:' )
            {
            // InternalContextModel.g:547:1: ( 'action:' )
            // InternalContextModel.g:548:2: 'action:'
            {
             before(grammarAccess.getDataSourceAccess().getActionKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getActionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_2__0__Impl"


    // $ANTLR start "rule__DataSource__Group_2__1"
    // InternalContextModel.g:557:1: rule__DataSource__Group_2__1 : rule__DataSource__Group_2__1__Impl ;
    public final void rule__DataSource__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:561:1: ( rule__DataSource__Group_2__1__Impl )
            // InternalContextModel.g:562:2: rule__DataSource__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_2__1"


    // $ANTLR start "rule__DataSource__Group_2__1__Impl"
    // InternalContextModel.g:568:1: rule__DataSource__Group_2__1__Impl : ( ( rule__DataSource__ActionAssignment_2_1 ) ) ;
    public final void rule__DataSource__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:572:1: ( ( ( rule__DataSource__ActionAssignment_2_1 ) ) )
            // InternalContextModel.g:573:1: ( ( rule__DataSource__ActionAssignment_2_1 ) )
            {
            // InternalContextModel.g:573:1: ( ( rule__DataSource__ActionAssignment_2_1 ) )
            // InternalContextModel.g:574:2: ( rule__DataSource__ActionAssignment_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getActionAssignment_2_1()); 
            // InternalContextModel.g:575:2: ( rule__DataSource__ActionAssignment_2_1 )
            // InternalContextModel.g:575:3: rule__DataSource__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__ActionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getActionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_2__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalContextModel.g:584:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:588:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalContextModel.g:589:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalContextModel.g:596:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:600:1: ( ( 'import' ) )
            // InternalContextModel.g:601:1: ( 'import' )
            {
            // InternalContextModel.g:601:1: ( 'import' )
            // InternalContextModel.g:602:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalContextModel.g:611:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:615:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalContextModel.g:616:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalContextModel.g:623:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:627:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalContextModel.g:628:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalContextModel.g:628:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalContextModel.g:629:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalContextModel.g:630:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalContextModel.g:630:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalContextModel.g:638:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:642:1: ( rule__Import__Group__2__Impl )
            // InternalContextModel.g:643:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalContextModel.g:649:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:653:1: ( ( ';' ) )
            // InternalContextModel.g:654:1: ( ';' )
            {
            // InternalContextModel.g:654:1: ( ';' )
            // InternalContextModel.g:655:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__ContextModel__ImportsAssignment_0"
    // InternalContextModel.g:665:1: rule__ContextModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__ContextModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:669:1: ( ( ruleImport ) )
            // InternalContextModel.g:670:2: ( ruleImport )
            {
            // InternalContextModel.g:670:2: ( ruleImport )
            // InternalContextModel.g:671:3: ruleImport
            {
             before(grammarAccess.getContextModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__ImportsAssignment_0"


    // $ANTLR start "rule__ContextModel__Context_variablesAssignment_1"
    // InternalContextModel.g:680:1: rule__ContextModel__Context_variablesAssignment_1 : ( ruleContextVar ) ;
    public final void rule__ContextModel__Context_variablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:684:1: ( ( ruleContextVar ) )
            // InternalContextModel.g:685:2: ( ruleContextVar )
            {
            // InternalContextModel.g:685:2: ( ruleContextVar )
            // InternalContextModel.g:686:3: ruleContextVar
            {
             before(grammarAccess.getContextModelAccess().getContext_variablesContextVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextVar();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getContext_variablesContextVarParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Context_variablesAssignment_1"


    // $ANTLR start "rule__ContextVar__NameAssignment_1"
    // InternalContextModel.g:695:1: rule__ContextVar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextVar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:699:1: ( ( RULE_ID ) )
            // InternalContextModel.g:700:2: ( RULE_ID )
            {
            // InternalContextModel.g:700:2: ( RULE_ID )
            // InternalContextModel.g:701:3: RULE_ID
            {
             before(grammarAccess.getContextVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__NameAssignment_1"


    // $ANTLR start "rule__ContextVar__SourceAssignment_3"
    // InternalContextModel.g:710:1: rule__ContextVar__SourceAssignment_3 : ( ruleDataSource ) ;
    public final void rule__ContextVar__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:714:1: ( ( ruleDataSource ) )
            // InternalContextModel.g:715:2: ( ruleDataSource )
            {
            // InternalContextModel.g:715:2: ( ruleDataSource )
            // InternalContextModel.g:716:3: ruleDataSource
            {
             before(grammarAccess.getContextVarAccess().getSourceDataSourceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSource();

            state._fsp--;

             after(grammarAccess.getContextVarAccess().getSourceDataSourceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__SourceAssignment_3"


    // $ANTLR start "rule__ContextVar__FunctionAssignment_5"
    // InternalContextModel.g:725:1: rule__ContextVar__FunctionAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContextVar__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:729:1: ( ( ( RULE_ID ) ) )
            // InternalContextModel.g:730:2: ( ( RULE_ID ) )
            {
            // InternalContextModel.g:730:2: ( ( RULE_ID ) )
            // InternalContextModel.g:731:3: ( RULE_ID )
            {
             before(grammarAccess.getContextVarAccess().getFunctionPythonFunctionCrossReference_5_0()); 
            // InternalContextModel.g:732:3: ( RULE_ID )
            // InternalContextModel.g:733:4: RULE_ID
            {
             before(grammarAccess.getContextVarAccess().getFunctionPythonFunctionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextVarAccess().getFunctionPythonFunctionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getContextVarAccess().getFunctionPythonFunctionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextVar__FunctionAssignment_5"


    // $ANTLR start "rule__DataSource__TopicAssignment_0_1"
    // InternalContextModel.g:744:1: rule__DataSource__TopicAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__TopicAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:748:1: ( ( ( RULE_ID ) ) )
            // InternalContextModel.g:749:2: ( ( RULE_ID ) )
            {
            // InternalContextModel.g:749:2: ( ( RULE_ID ) )
            // InternalContextModel.g:750:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getTopicTopicSpecCrossReference_0_1_0()); 
            // InternalContextModel.g:751:3: ( RULE_ID )
            // InternalContextModel.g:752:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getTopicTopicSpecIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getTopicTopicSpecIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getTopicTopicSpecCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__TopicAssignment_0_1"


    // $ANTLR start "rule__DataSource__ServiceAssignment_1_1"
    // InternalContextModel.g:763:1: rule__DataSource__ServiceAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__ServiceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:767:1: ( ( ( RULE_ID ) ) )
            // InternalContextModel.g:768:2: ( ( RULE_ID ) )
            {
            // InternalContextModel.g:768:2: ( ( RULE_ID ) )
            // InternalContextModel.g:769:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getServiceServiceSpecCrossReference_1_1_0()); 
            // InternalContextModel.g:770:3: ( RULE_ID )
            // InternalContextModel.g:771:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getServiceServiceSpecIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getServiceServiceSpecIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getServiceServiceSpecCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__ServiceAssignment_1_1"


    // $ANTLR start "rule__DataSource__ActionAssignment_2_1"
    // InternalContextModel.g:782:1: rule__DataSource__ActionAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:786:1: ( ( ( RULE_ID ) ) )
            // InternalContextModel.g:787:2: ( ( RULE_ID ) )
            {
            // InternalContextModel.g:787:2: ( ( RULE_ID ) )
            // InternalContextModel.g:788:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getActionActionSpecCrossReference_2_1_0()); 
            // InternalContextModel.g:789:3: ( RULE_ID )
            // InternalContextModel.g:790:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getActionActionSpecIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getActionActionSpecIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getActionActionSpecCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__ActionAssignment_2_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalContextModel.g:801:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContextModel.g:805:1: ( ( RULE_STRING ) )
            // InternalContextModel.g:806:2: ( RULE_STRING )
            {
            // InternalContextModel.g:806:2: ( RULE_STRING )
            // InternalContextModel.g:807:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}