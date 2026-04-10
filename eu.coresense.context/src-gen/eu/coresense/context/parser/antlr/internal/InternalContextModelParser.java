package eu.coresense.context.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.context.services.ContextModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_BINARY", "RULE_DECINT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContextVariable'", "'{'", "'cache?'", "'cache'", "'length'", "'s'", "'period'", "'ns'", "'proxy'", "'function_name'", "'function_lib'", "'}'", "'source:'", "'origin:'", "'publisher:'", "'.'", "'service:'", "'request_kwargs'", "'action:'", "'goal_kwargs'", "'import'", "';'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalContextModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContextModel.g"; }



     	private ContextModelGrammarAccess grammarAccess;

        public InternalContextModelParser(TokenStream input, ContextModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ContextModel";
       	}

       	@Override
       	protected ContextModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContextModel"
    // InternalContextModel.g:64:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalContextModel.g:64:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalContextModel.g:65:2: iv_ruleContextModel= ruleContextModel EOF
            {
             newCompositeNode(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModel=ruleContextModel();

            state._fsp--;

             current =iv_ruleContextModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalContextModel.g:71:1: ruleContextModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_variables_1_0= ruleContextVar ) )* ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_context_variables_1_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_variables_1_0= ruleContextVar ) )* ) )
            // InternalContextModel.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_variables_1_0= ruleContextVar ) )* )
            {
            // InternalContextModel.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_variables_1_0= ruleContextVar ) )* )
            // InternalContextModel.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_variables_1_0= ruleContextVar ) )*
            {
            // InternalContextModel.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalContextModel.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalContextModel.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalContextModel.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"eu.coresense.context.ContextModel.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalContextModel.g:98:3: ( (lv_context_variables_1_0= ruleContextVar ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContextModel.g:99:4: (lv_context_variables_1_0= ruleContextVar )
            	    {
            	    // InternalContextModel.g:99:4: (lv_context_variables_1_0= ruleContextVar )
            	    // InternalContextModel.g:100:5: lv_context_variables_1_0= ruleContextVar
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getContext_variablesContextVarParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_context_variables_1_0=ruleContextVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"context_variables",
            	    						lv_context_variables_1_0,
            	    						"eu.coresense.context.ContextModel.ContextVar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContextVar"
    // InternalContextModel.g:121:1: entryRuleContextVar returns [EObject current=null] : iv_ruleContextVar= ruleContextVar EOF ;
    public final EObject entryRuleContextVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextVar = null;


        try {
            // InternalContextModel.g:121:51: (iv_ruleContextVar= ruleContextVar EOF )
            // InternalContextModel.g:122:2: iv_ruleContextVar= ruleContextVar EOF
            {
             newCompositeNode(grammarAccess.getContextVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextVar=ruleContextVar();

            state._fsp--;

             current =iv_ruleContextVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextVar"


    // $ANTLR start "ruleContextVar"
    // InternalContextModel.g:128:1: ruleContextVar returns [EObject current=null] : (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'cache?' ( (lv_doCache_5_0= ruleDoCache ) ) (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )? (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )? (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleContextVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_length_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_period_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_functionName_16_0=null;
        Token otherlv_17=null;
        Token lv_functionLibrary_18_0=null;
        Token otherlv_19=null;
        EObject lv_source_3_0 = null;

        EObject lv_doCache_5_0 = null;

        EObject lv_doProxy_14_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:134:2: ( (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'cache?' ( (lv_doCache_5_0= ruleDoCache ) ) (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )? (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )? (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) )
            // InternalContextModel.g:135:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'cache?' ( (lv_doCache_5_0= ruleDoCache ) ) (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )? (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )? (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            {
            // InternalContextModel.g:135:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'cache?' ( (lv_doCache_5_0= ruleDoCache ) ) (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )? (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )? (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            // InternalContextModel.g:136:3: otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'cache?' ( (lv_doCache_5_0= ruleDoCache ) ) (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )? (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )? (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getContextVarAccess().getContextVariableKeyword_0());
            		
            // InternalContextModel.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalContextModel.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalContextModel.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalContextModel.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextVarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getContextVarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalContextModel.g:162:3: ( (lv_source_3_0= ruleDataSource ) )
            // InternalContextModel.g:163:4: (lv_source_3_0= ruleDataSource )
            {
            // InternalContextModel.g:163:4: (lv_source_3_0= ruleDataSource )
            // InternalContextModel.g:164:5: lv_source_3_0= ruleDataSource
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getSourceDataSourceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_source_3_0=ruleDataSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_3_0,
            						"eu.coresense.context.ContextModel.DataSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getContextVarAccess().getCacheKeyword_4());
            		
            // InternalContextModel.g:185:3: ( (lv_doCache_5_0= ruleDoCache ) )
            // InternalContextModel.g:186:4: (lv_doCache_5_0= ruleDoCache )
            {
            // InternalContextModel.g:186:4: (lv_doCache_5_0= ruleDoCache )
            // InternalContextModel.g:187:5: lv_doCache_5_0= ruleDoCache
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getDoCacheDoCacheParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_doCache_5_0=ruleDoCache();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"doCache",
            						lv_doCache_5_0,
            						"eu.coresense.context.ContextModel.DoCache");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModel.g:204:3: (otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalContextModel.g:205:4: otherlv_6= 'cache' otherlv_7= 'length' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= 's'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getContextVarAccess().getCacheKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getContextVarAccess().getLengthKeyword_6_1());
                    			
                    // InternalContextModel.g:213:4: ( (lv_length_8_0= RULE_INT ) )
                    // InternalContextModel.g:214:5: (lv_length_8_0= RULE_INT )
                    {
                    // InternalContextModel.g:214:5: (lv_length_8_0= RULE_INT )
                    // InternalContextModel.g:215:6: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_length_8_0, grammarAccess.getContextVarAccess().getLengthINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextVarAccess().getSKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalContextModel.g:236:3: (otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalContextModel.g:237:4: otherlv_10= 'period' ( (lv_period_11_0= RULE_INT ) ) otherlv_12= 'ns'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getContextVarAccess().getPeriodKeyword_7_0());
                    			
                    // InternalContextModel.g:241:4: ( (lv_period_11_0= RULE_INT ) )
                    // InternalContextModel.g:242:5: (lv_period_11_0= RULE_INT )
                    {
                    // InternalContextModel.g:242:5: (lv_period_11_0= RULE_INT )
                    // InternalContextModel.g:243:6: lv_period_11_0= RULE_INT
                    {
                    lv_period_11_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    						newLeafNode(lv_period_11_0, grammarAccess.getContextVarAccess().getPeriodINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"period",
                    							lv_period_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getContextVarAccess().getNsKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalContextModel.g:264:3: (otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalContextModel.g:265:4: otherlv_13= 'proxy' ( (lv_doProxy_14_0= ruleDoProxy ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getContextVarAccess().getProxyKeyword_8_0());
                    			
                    // InternalContextModel.g:269:4: ( (lv_doProxy_14_0= ruleDoProxy ) )
                    // InternalContextModel.g:270:5: (lv_doProxy_14_0= ruleDoProxy )
                    {
                    // InternalContextModel.g:270:5: (lv_doProxy_14_0= ruleDoProxy )
                    // InternalContextModel.g:271:6: lv_doProxy_14_0= ruleDoProxy
                    {

                    						newCompositeNode(grammarAccess.getContextVarAccess().getDoProxyDoProxyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_doProxy_14_0=ruleDoProxy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextVarRule());
                    						}
                    						set(
                    							current,
                    							"doProxy",
                    							lv_doProxy_14_0,
                    							"eu.coresense.context.ContextModel.DoProxy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getContextVarAccess().getFunction_nameKeyword_9());
            		
            // InternalContextModel.g:293:3: ( (lv_functionName_16_0= RULE_STRING ) )
            // InternalContextModel.g:294:4: (lv_functionName_16_0= RULE_STRING )
            {
            // InternalContextModel.g:294:4: (lv_functionName_16_0= RULE_STRING )
            // InternalContextModel.g:295:5: lv_functionName_16_0= RULE_STRING
            {
            lv_functionName_16_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_functionName_16_0, grammarAccess.getContextVarAccess().getFunctionNameSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"functionName",
            						lv_functionName_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalContextModel.g:311:3: (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalContextModel.g:312:4: otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getContextVarAccess().getFunction_libKeyword_11_0());
                    			
                    // InternalContextModel.g:316:4: ( (lv_functionLibrary_18_0= RULE_STRING ) )
                    // InternalContextModel.g:317:5: (lv_functionLibrary_18_0= RULE_STRING )
                    {
                    // InternalContextModel.g:317:5: (lv_functionLibrary_18_0= RULE_STRING )
                    // InternalContextModel.g:318:6: lv_functionLibrary_18_0= RULE_STRING
                    {
                    lv_functionLibrary_18_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_functionLibrary_18_0, grammarAccess.getContextVarAccess().getFunctionLibrarySTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functionLibrary",
                    							lv_functionLibrary_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextVar"


    // $ANTLR start "entryRuleDoCache"
    // InternalContextModel.g:343:1: entryRuleDoCache returns [EObject current=null] : iv_ruleDoCache= ruleDoCache EOF ;
    public final EObject entryRuleDoCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoCache = null;


        try {
            // InternalContextModel.g:343:48: (iv_ruleDoCache= ruleDoCache EOF )
            // InternalContextModel.g:344:2: iv_ruleDoCache= ruleDoCache EOF
            {
             newCompositeNode(grammarAccess.getDoCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoCache=ruleDoCache();

            state._fsp--;

             current =iv_ruleDoCache; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoCache"


    // $ANTLR start "ruleDoCache"
    // InternalContextModel.g:350:1: ruleDoCache returns [EObject current=null] : ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleDoCache() throws RecognitionException {
        EObject current = null;

        Token lv_do_1_0=null;


        	enterRule();

        try {
            // InternalContextModel.g:356:2: ( ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) ) )
            // InternalContextModel.g:357:2: ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalContextModel.g:357:2: ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) )
            // InternalContextModel.g:358:3: () ( (lv_do_1_0= RULE_BOOLEAN ) )
            {
            // InternalContextModel.g:358:3: ()
            // InternalContextModel.g:359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoCacheAccess().getDoCacheAction_0(),
            					current);
            			

            }

            // InternalContextModel.g:365:3: ( (lv_do_1_0= RULE_BOOLEAN ) )
            // InternalContextModel.g:366:4: (lv_do_1_0= RULE_BOOLEAN )
            {
            // InternalContextModel.g:366:4: (lv_do_1_0= RULE_BOOLEAN )
            // InternalContextModel.g:367:5: lv_do_1_0= RULE_BOOLEAN
            {
            lv_do_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_do_1_0, grammarAccess.getDoCacheAccess().getDoBOOLEANTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoCacheRule());
            					}
            					setWithLastConsumed(
            						current,
            						"do",
            						lv_do_1_0,
            						"eu.coresense.context.ContextModel.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoCache"


    // $ANTLR start "entryRuleDoProxy"
    // InternalContextModel.g:387:1: entryRuleDoProxy returns [EObject current=null] : iv_ruleDoProxy= ruleDoProxy EOF ;
    public final EObject entryRuleDoProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoProxy = null;


        try {
            // InternalContextModel.g:387:48: (iv_ruleDoProxy= ruleDoProxy EOF )
            // InternalContextModel.g:388:2: iv_ruleDoProxy= ruleDoProxy EOF
            {
             newCompositeNode(grammarAccess.getDoProxyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoProxy=ruleDoProxy();

            state._fsp--;

             current =iv_ruleDoProxy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoProxy"


    // $ANTLR start "ruleDoProxy"
    // InternalContextModel.g:394:1: ruleDoProxy returns [EObject current=null] : ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleDoProxy() throws RecognitionException {
        EObject current = null;

        Token lv_do_1_0=null;


        	enterRule();

        try {
            // InternalContextModel.g:400:2: ( ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) ) )
            // InternalContextModel.g:401:2: ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalContextModel.g:401:2: ( () ( (lv_do_1_0= RULE_BOOLEAN ) ) )
            // InternalContextModel.g:402:3: () ( (lv_do_1_0= RULE_BOOLEAN ) )
            {
            // InternalContextModel.g:402:3: ()
            // InternalContextModel.g:403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoProxyAccess().getDoProxyAction_0(),
            					current);
            			

            }

            // InternalContextModel.g:409:3: ( (lv_do_1_0= RULE_BOOLEAN ) )
            // InternalContextModel.g:410:4: (lv_do_1_0= RULE_BOOLEAN )
            {
            // InternalContextModel.g:410:4: (lv_do_1_0= RULE_BOOLEAN )
            // InternalContextModel.g:411:5: lv_do_1_0= RULE_BOOLEAN
            {
            lv_do_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_do_1_0, grammarAccess.getDoProxyAccess().getDoBOOLEANTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoProxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"do",
            						lv_do_1_0,
            						"eu.coresense.context.ContextModel.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoProxy"


    // $ANTLR start "entryRuleDataSource"
    // InternalContextModel.g:431:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalContextModel.g:431:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalContextModel.g:432:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalContextModel.g:438:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'source:' (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) ) ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:444:2: ( (otherlv_0= 'source:' (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) ) ) )
            // InternalContextModel.g:445:2: (otherlv_0= 'source:' (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) ) )
            {
            // InternalContextModel.g:445:2: (otherlv_0= 'source:' (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) ) )
            // InternalContextModel.g:446:3: otherlv_0= 'source:' (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getSourceKeyword_0());
            		
            // InternalContextModel.g:450:3: (otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) ) )
            // InternalContextModel.g:451:4: otherlv_1= 'origin:' ( (lv_ref_2_0= ruleQualifiedRef ) )
            {
            otherlv_1=(Token)match(input,29,FOLLOW_22); 

            				newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getOriginKeyword_1_0());
            			
            // InternalContextModel.g:455:4: ( (lv_ref_2_0= ruleQualifiedRef ) )
            // InternalContextModel.g:456:5: (lv_ref_2_0= ruleQualifiedRef )
            {
            // InternalContextModel.g:456:5: (lv_ref_2_0= ruleQualifiedRef )
            // InternalContextModel.g:457:6: lv_ref_2_0= ruleQualifiedRef
            {

            						newCompositeNode(grammarAccess.getDataSourceAccess().getRefQualifiedRefParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_ref_2_0=ruleQualifiedRef();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDataSourceRule());
            						}
            						set(
            							current,
            							"ref",
            							lv_ref_2_0,
            							"eu.coresense.context.ContextModel.QualifiedRef");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleKeyWordArguments"
    // InternalContextModel.g:479:1: entryRuleKeyWordArguments returns [String current=null] : iv_ruleKeyWordArguments= ruleKeyWordArguments EOF ;
    public final String entryRuleKeyWordArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyWordArguments = null;


        try {
            // InternalContextModel.g:479:56: (iv_ruleKeyWordArguments= ruleKeyWordArguments EOF )
            // InternalContextModel.g:480:2: iv_ruleKeyWordArguments= ruleKeyWordArguments EOF
            {
             newCompositeNode(grammarAccess.getKeyWordArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyWordArguments=ruleKeyWordArguments();

            state._fsp--;

             current =iv_ruleKeyWordArguments.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyWordArguments"


    // $ANTLR start "ruleKeyWordArguments"
    // InternalContextModel.g:486:1: ruleKeyWordArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleKeyWordArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalContextModel.g:492:2: (this_STRING_0= RULE_STRING )
            // InternalContextModel.g:493:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getKeyWordArgumentsAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyWordArguments"


    // $ANTLR start "entryRuleQualifiedRef"
    // InternalContextModel.g:503:1: entryRuleQualifiedRef returns [EObject current=null] : iv_ruleQualifiedRef= ruleQualifiedRef EOF ;
    public final EObject entryRuleQualifiedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedRef = null;


        try {
            // InternalContextModel.g:503:53: (iv_ruleQualifiedRef= ruleQualifiedRef EOF )
            // InternalContextModel.g:504:2: iv_ruleQualifiedRef= ruleQualifiedRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedRef=ruleQualifiedRef();

            state._fsp--;

             current =iv_ruleQualifiedRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedRef"


    // $ANTLR start "ruleQualifiedRef"
    // InternalContextModel.g:510:1: ruleQualifiedRef returns [EObject current=null] : (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef ) ;
    public final EObject ruleQualifiedRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPublisherRef_0 = null;

        EObject this_QualifiedServiceServerRef_1 = null;

        EObject this_QualifiedActionServerRef_2 = null;



        	enterRule();

        try {
            // InternalContextModel.g:516:2: ( (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef ) )
            // InternalContextModel.g:517:2: (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef )
            {
            // InternalContextModel.g:517:2: (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalContextModel.g:518:3: this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedPublisherRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedPublisherRef_0=ruleQualifiedPublisherRef();

                    state._fsp--;


                    			current = this_QualifiedPublisherRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModel.g:527:3: this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedServiceServerRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedServiceServerRef_1=ruleQualifiedServiceServerRef();

                    state._fsp--;


                    			current = this_QualifiedServiceServerRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModel.g:536:3: this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedActionServerRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedActionServerRef_2=ruleQualifiedActionServerRef();

                    state._fsp--;


                    			current = this_QualifiedActionServerRef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedRef"


    // $ANTLR start "entryRuleQualifiedPublisherRef"
    // InternalContextModel.g:548:1: entryRuleQualifiedPublisherRef returns [EObject current=null] : iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF ;
    public final EObject entryRuleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPublisherRef = null;


        try {
            // InternalContextModel.g:548:62: (iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF )
            // InternalContextModel.g:549:2: iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedPublisherRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPublisherRef=ruleQualifiedPublisherRef();

            state._fsp--;

             current =iv_ruleQualifiedPublisherRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedPublisherRef"


    // $ANTLR start "ruleQualifiedPublisherRef"
    // InternalContextModel.g:555:1: ruleQualifiedPublisherRef returns [EObject current=null] : (otherlv_0= 'publisher:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalContextModel.g:561:2: ( (otherlv_0= 'publisher:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalContextModel.g:562:2: (otherlv_0= 'publisher:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalContextModel.g:562:2: (otherlv_0= 'publisher:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalContextModel.g:563:3: otherlv_0= 'publisher:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedPublisherRefAccess().getPublisherKeyword_0());
            		
            // InternalContextModel.g:567:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModel.g:568:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModel.g:568:4: (otherlv_1= RULE_ID )
            // InternalContextModel.g:569:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedPublisherRefAccess().getNodeNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedPublisherRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModel.g:584:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModel.g:585:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModel.g:585:4: (otherlv_3= RULE_ID )
            // InternalContextModel.g:586:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedPublisherRefAccess().getPublisherPublisherCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPublisherRef"


    // $ANTLR start "entryRuleQualifiedServiceServerRef"
    // InternalContextModel.g:601:1: entryRuleQualifiedServiceServerRef returns [EObject current=null] : iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF ;
    public final EObject entryRuleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedServiceServerRef = null;


        try {
            // InternalContextModel.g:601:66: (iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF )
            // InternalContextModel.g:602:2: iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedServiceServerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedServiceServerRef=ruleQualifiedServiceServerRef();

            state._fsp--;

             current =iv_ruleQualifiedServiceServerRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedServiceServerRef"


    // $ANTLR start "ruleQualifiedServiceServerRef"
    // InternalContextModel.g:608:1: ruleQualifiedServiceServerRef returns [EObject current=null] : (otherlv_0= 'service:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'request_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) ;
    public final EObject ruleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_kwargs_5_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:614:2: ( (otherlv_0= 'service:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'request_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) )
            // InternalContextModel.g:615:2: (otherlv_0= 'service:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'request_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            {
            // InternalContextModel.g:615:2: (otherlv_0= 'service:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'request_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            // InternalContextModel.g:616:3: otherlv_0= 'service:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'request_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedServiceServerRefAccess().getServiceKeyword_0());
            		
            // InternalContextModel.g:620:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModel.g:621:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModel.g:621:4: (otherlv_1= RULE_ID )
            // InternalContextModel.g:622:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedServiceServerRefAccess().getNodeNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedServiceServerRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModel.g:637:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModel.g:638:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModel.g:638:4: (otherlv_3= RULE_ID )
            // InternalContextModel.g:639:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedServiceServerRefAccess().getServiceServerServiceServerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifiedServiceServerRefAccess().getRequest_kwargsKeyword_4());
            		
            // InternalContextModel.g:654:3: ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            // InternalContextModel.g:655:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            {
            // InternalContextModel.g:655:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            // InternalContextModel.g:656:5: lv_kwargs_5_0= ruleKeyWordArguments
            {

            					newCompositeNode(grammarAccess.getQualifiedServiceServerRefAccess().getKwargsKeyWordArgumentsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_kwargs_5_0=ruleKeyWordArguments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            					set(
            						current,
            						"kwargs",
            						lv_kwargs_5_0,
            						"eu.coresense.context.ContextModel.KeyWordArguments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedServiceServerRef"


    // $ANTLR start "entryRuleQualifiedActionServerRef"
    // InternalContextModel.g:677:1: entryRuleQualifiedActionServerRef returns [EObject current=null] : iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF ;
    public final EObject entryRuleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedActionServerRef = null;


        try {
            // InternalContextModel.g:677:65: (iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF )
            // InternalContextModel.g:678:2: iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedActionServerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedActionServerRef=ruleQualifiedActionServerRef();

            state._fsp--;

             current =iv_ruleQualifiedActionServerRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedActionServerRef"


    // $ANTLR start "ruleQualifiedActionServerRef"
    // InternalContextModel.g:684:1: ruleQualifiedActionServerRef returns [EObject current=null] : (otherlv_0= 'action:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'goal_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) ;
    public final EObject ruleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_kwargs_5_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:690:2: ( (otherlv_0= 'action:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'goal_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) )
            // InternalContextModel.g:691:2: (otherlv_0= 'action:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'goal_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            {
            // InternalContextModel.g:691:2: (otherlv_0= 'action:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'goal_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            // InternalContextModel.g:692:3: otherlv_0= 'action:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'goal_kwargs' ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedActionServerRefAccess().getActionKeyword_0());
            		
            // InternalContextModel.g:696:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModel.g:697:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModel.g:697:4: (otherlv_1= RULE_ID )
            // InternalContextModel.g:698:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedActionServerRefAccess().getNodeNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedActionServerRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModel.g:713:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModel.g:714:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModel.g:714:4: (otherlv_3= RULE_ID )
            // InternalContextModel.g:715:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedActionServerRefAccess().getActionServerActionServerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifiedActionServerRefAccess().getGoal_kwargsKeyword_4());
            		
            // InternalContextModel.g:730:3: ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            // InternalContextModel.g:731:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            {
            // InternalContextModel.g:731:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            // InternalContextModel.g:732:5: lv_kwargs_5_0= ruleKeyWordArguments
            {

            					newCompositeNode(grammarAccess.getQualifiedActionServerRefAccess().getKwargsKeyWordArgumentsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_kwargs_5_0=ruleKeyWordArguments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedActionServerRefRule());
            					}
            					set(
            						current,
            						"kwargs",
            						lv_kwargs_5_0,
            						"eu.coresense.context.ContextModel.KeyWordArguments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedActionServerRef"


    // $ANTLR start "entryRuleImport"
    // InternalContextModel.g:753:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalContextModel.g:753:47: (iv_ruleImport= ruleImport EOF )
            // InternalContextModel.g:754:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalContextModel.g:760:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:766:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalContextModel.g:767:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalContextModel.g:767:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalContextModel.g:768:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalContextModel.g:772:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalContextModel.g:773:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalContextModel.g:773:4: (lv_importURI_1_0= RULE_STRING )
            // InternalContextModel.g:774:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000540000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});

}