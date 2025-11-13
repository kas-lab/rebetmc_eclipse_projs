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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContextVariable'", "'{'", "'efferent:'", "'cache?'", "'cache'", "'length'", "'s'", "'period'", "'ns'", "'function_name'", "'function_lib'", "'}'", "'afferent:'", "'publisher:'", "'service:'", "'action:'", "'.'", "'import'", "';'", "'contextModelNode'"
    };
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
    // InternalContextModel.g:71:1: ruleContextModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_model_node_1_0= ruleContextModelNode ) ) ( (lv_context_variables_2_0= ruleContextVar ) )* ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_context_model_node_1_0 = null;

        EObject lv_context_variables_2_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_model_node_1_0= ruleContextModelNode ) ) ( (lv_context_variables_2_0= ruleContextVar ) )* ) )
            // InternalContextModel.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_model_node_1_0= ruleContextModelNode ) ) ( (lv_context_variables_2_0= ruleContextVar ) )* )
            {
            // InternalContextModel.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_model_node_1_0= ruleContextModelNode ) ) ( (lv_context_variables_2_0= ruleContextVar ) )* )
            // InternalContextModel.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_context_model_node_1_0= ruleContextModelNode ) ) ( (lv_context_variables_2_0= ruleContextVar ) )*
            {
            // InternalContextModel.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
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

            // InternalContextModel.g:98:3: ( (lv_context_model_node_1_0= ruleContextModelNode ) )
            // InternalContextModel.g:99:4: (lv_context_model_node_1_0= ruleContextModelNode )
            {
            // InternalContextModel.g:99:4: (lv_context_model_node_1_0= ruleContextModelNode )
            // InternalContextModel.g:100:5: lv_context_model_node_1_0= ruleContextModelNode
            {

            					newCompositeNode(grammarAccess.getContextModelAccess().getContext_model_nodeContextModelNodeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_context_model_node_1_0=ruleContextModelNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextModelRule());
            					}
            					set(
            						current,
            						"context_model_node",
            						lv_context_model_node_1_0,
            						"eu.coresense.context.ContextModel.ContextModelNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModel.g:117:3: ( (lv_context_variables_2_0= ruleContextVar ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContextModel.g:118:4: (lv_context_variables_2_0= ruleContextVar )
            	    {
            	    // InternalContextModel.g:118:4: (lv_context_variables_2_0= ruleContextVar )
            	    // InternalContextModel.g:119:5: lv_context_variables_2_0= ruleContextVar
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getContext_variablesContextVarParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_context_variables_2_0=ruleContextVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"context_variables",
            	    						lv_context_variables_2_0,
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
    // InternalContextModel.g:140:1: entryRuleContextVar returns [EObject current=null] : iv_ruleContextVar= ruleContextVar EOF ;
    public final EObject entryRuleContextVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextVar = null;


        try {
            // InternalContextModel.g:140:51: (iv_ruleContextVar= ruleContextVar EOF )
            // InternalContextModel.g:141:2: iv_ruleContextVar= ruleContextVar EOF
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
    // InternalContextModel.g:147:1: ruleContextVar returns [EObject current=null] : (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'efferent:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'cache?' ( (lv_doCache_7_0= RULE_BOOLEAN ) ) (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )? (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleContextVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_doCache_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_length_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_period_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_functionName_16_0=null;
        Token otherlv_17=null;
        Token lv_functionLibrary_18_0=null;
        Token otherlv_19=null;
        EObject lv_source_3_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:153:2: ( (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'efferent:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'cache?' ( (lv_doCache_7_0= RULE_BOOLEAN ) ) (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )? (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) )
            // InternalContextModel.g:154:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'efferent:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'cache?' ( (lv_doCache_7_0= RULE_BOOLEAN ) ) (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )? (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            {
            // InternalContextModel.g:154:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'efferent:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'cache?' ( (lv_doCache_7_0= RULE_BOOLEAN ) ) (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )? (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            // InternalContextModel.g:155:3: otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'efferent:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'cache?' ( (lv_doCache_7_0= RULE_BOOLEAN ) ) (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )? (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )? otherlv_15= 'function_name' ( (lv_functionName_16_0= RULE_STRING ) ) (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getContextVarAccess().getContextVariableKeyword_0());
            		
            // InternalContextModel.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalContextModel.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalContextModel.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalContextModel.g:161:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getContextVarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalContextModel.g:181:3: ( (lv_source_3_0= ruleDataSource ) )
            // InternalContextModel.g:182:4: (lv_source_3_0= ruleDataSource )
            {
            // InternalContextModel.g:182:4: (lv_source_3_0= ruleDataSource )
            // InternalContextModel.g:183:5: lv_source_3_0= ruleDataSource
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

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getContextVarAccess().getEfferentKeyword_4());
            		
            // InternalContextModel.g:204:3: ( (otherlv_5= RULE_ID ) )
            // InternalContextModel.g:205:4: (otherlv_5= RULE_ID )
            {
            // InternalContextModel.g:205:4: (otherlv_5= RULE_ID )
            // InternalContextModel.g:206:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getContextVarAccess().getProcessed_sourcePublisherCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getContextVarAccess().getCacheKeyword_6());
            		
            // InternalContextModel.g:221:3: ( (lv_doCache_7_0= RULE_BOOLEAN ) )
            // InternalContextModel.g:222:4: (lv_doCache_7_0= RULE_BOOLEAN )
            {
            // InternalContextModel.g:222:4: (lv_doCache_7_0= RULE_BOOLEAN )
            // InternalContextModel.g:223:5: lv_doCache_7_0= RULE_BOOLEAN
            {
            lv_doCache_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_11); 

            					newLeafNode(lv_doCache_7_0, grammarAccess.getContextVarAccess().getDoCacheBOOLEANTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"doCache",
            						lv_doCache_7_0,
            						"eu.coresense.context.ContextModel.BOOLEAN");
            				

            }


            }

            // InternalContextModel.g:239:3: (otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalContextModel.g:240:4: otherlv_8= 'cache' otherlv_9= 'length' ( (lv_length_10_0= RULE_INT ) ) otherlv_11= 's'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextVarAccess().getCacheKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextVarAccess().getLengthKeyword_8_1());
                    			
                    // InternalContextModel.g:248:4: ( (lv_length_10_0= RULE_INT ) )
                    // InternalContextModel.g:249:5: (lv_length_10_0= RULE_INT )
                    {
                    // InternalContextModel.g:249:5: (lv_length_10_0= RULE_INT )
                    // InternalContextModel.g:250:6: lv_length_10_0= RULE_INT
                    {
                    lv_length_10_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_length_10_0, grammarAccess.getContextVarAccess().getLengthINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getContextVarAccess().getSKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalContextModel.g:271:3: (otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalContextModel.g:272:4: otherlv_12= 'period' ( (lv_period_13_0= RULE_INT ) ) otherlv_14= 'ns'
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getContextVarAccess().getPeriodKeyword_9_0());
                    			
                    // InternalContextModel.g:276:4: ( (lv_period_13_0= RULE_INT ) )
                    // InternalContextModel.g:277:5: (lv_period_13_0= RULE_INT )
                    {
                    // InternalContextModel.g:277:5: (lv_period_13_0= RULE_INT )
                    // InternalContextModel.g:278:6: lv_period_13_0= RULE_INT
                    {
                    lv_period_13_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_period_13_0, grammarAccess.getContextVarAccess().getPeriodINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"period",
                    							lv_period_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getContextVarAccess().getNsKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getContextVarAccess().getFunction_nameKeyword_10());
            		
            // InternalContextModel.g:303:3: ( (lv_functionName_16_0= RULE_STRING ) )
            // InternalContextModel.g:304:4: (lv_functionName_16_0= RULE_STRING )
            {
            // InternalContextModel.g:304:4: (lv_functionName_16_0= RULE_STRING )
            // InternalContextModel.g:305:5: lv_functionName_16_0= RULE_STRING
            {
            lv_functionName_16_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_functionName_16_0, grammarAccess.getContextVarAccess().getFunctionNameSTRINGTerminalRuleCall_11_0());
            				

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

            // InternalContextModel.g:321:3: (otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalContextModel.g:322:4: otherlv_17= 'function_lib' ( (lv_functionLibrary_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getContextVarAccess().getFunction_libKeyword_12_0());
                    			
                    // InternalContextModel.g:326:4: ( (lv_functionLibrary_18_0= RULE_STRING ) )
                    // InternalContextModel.g:327:5: (lv_functionLibrary_18_0= RULE_STRING )
                    {
                    // InternalContextModel.g:327:5: (lv_functionLibrary_18_0= RULE_STRING )
                    // InternalContextModel.g:328:6: lv_functionLibrary_18_0= RULE_STRING
                    {
                    lv_functionLibrary_18_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_functionLibrary_18_0, grammarAccess.getContextVarAccess().getFunctionLibrarySTRINGTerminalRuleCall_12_1_0());
                    					

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

            otherlv_19=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_13());
            		

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


    // $ANTLR start "entryRuleDataSource"
    // InternalContextModel.g:353:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalContextModel.g:353:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalContextModel.g:354:2: iv_ruleDataSource= ruleDataSource EOF
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
    // InternalContextModel.g:360:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'afferent:' ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) ) ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_QualifiedPublisherRef_2 = null;

        EObject this_QualifiedServiceServerRef_4 = null;

        EObject this_QualifiedActionServerRef_6 = null;



        	enterRule();

        try {
            // InternalContextModel.g:366:2: ( (otherlv_0= 'afferent:' ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) ) ) )
            // InternalContextModel.g:367:2: (otherlv_0= 'afferent:' ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) ) )
            {
            // InternalContextModel.g:367:2: (otherlv_0= 'afferent:' ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) ) )
            // InternalContextModel.g:368:3: otherlv_0= 'afferent:' ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getAfferentKeyword_0());
            		
            // InternalContextModel.g:372:3: ( (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef ) | (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef ) | (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalContextModel.g:373:4: (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef )
                    {
                    // InternalContextModel.g:373:4: (otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef )
                    // InternalContextModel.g:374:5: otherlv_1= 'publisher:' this_QualifiedPublisherRef_2= ruleQualifiedPublisherRef
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getPublisherKeyword_1_0_0());
                    				

                    					newCompositeNode(grammarAccess.getDataSourceAccess().getQualifiedPublisherRefParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_QualifiedPublisherRef_2=ruleQualifiedPublisherRef();

                    state._fsp--;


                    					current = this_QualifiedPublisherRef_2;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:388:4: (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef )
                    {
                    // InternalContextModel.g:388:4: (otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef )
                    // InternalContextModel.g:389:5: otherlv_3= 'service:' this_QualifiedServiceServerRef_4= ruleQualifiedServiceServerRef
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getServiceKeyword_1_1_0());
                    				

                    					newCompositeNode(grammarAccess.getDataSourceAccess().getQualifiedServiceServerRefParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_QualifiedServiceServerRef_4=ruleQualifiedServiceServerRef();

                    state._fsp--;


                    					current = this_QualifiedServiceServerRef_4;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalContextModel.g:403:4: (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef )
                    {
                    // InternalContextModel.g:403:4: (otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef )
                    // InternalContextModel.g:404:5: otherlv_5= 'action:' this_QualifiedActionServerRef_6= ruleQualifiedActionServerRef
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(otherlv_5, grammarAccess.getDataSourceAccess().getActionKeyword_1_2_0());
                    				

                    					newCompositeNode(grammarAccess.getDataSourceAccess().getQualifiedActionServerRefParserRuleCall_1_2_1());
                    				
                    pushFollow(FOLLOW_2);
                    this_QualifiedActionServerRef_6=ruleQualifiedActionServerRef();

                    state._fsp--;


                    					current = this_QualifiedActionServerRef_6;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleQualifiedPublisherRef"
    // InternalContextModel.g:422:1: entryRuleQualifiedPublisherRef returns [EObject current=null] : iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF ;
    public final EObject entryRuleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPublisherRef = null;


        try {
            // InternalContextModel.g:422:62: (iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF )
            // InternalContextModel.g:423:2: iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF
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
    // InternalContextModel.g:429:1: ruleQualifiedPublisherRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:435:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalContextModel.g:436:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalContextModel.g:436:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalContextModel.g:437:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalContextModel.g:437:3: ( (otherlv_0= RULE_ID ) )
            // InternalContextModel.g:438:4: (otherlv_0= RULE_ID )
            {
            // InternalContextModel.g:438:4: (otherlv_0= RULE_ID )
            // InternalContextModel.g:439:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedPublisherRefAccess().getNodeNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedPublisherRefAccess().getFullStopKeyword_1());
            		
            // InternalContextModel.g:454:3: ( (otherlv_2= RULE_ID ) )
            // InternalContextModel.g:455:4: (otherlv_2= RULE_ID )
            {
            // InternalContextModel.g:455:4: (otherlv_2= RULE_ID )
            // InternalContextModel.g:456:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedPublisherRefAccess().getPublisherPublisherCrossReference_2_0());
            				

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
    // InternalContextModel.g:471:1: entryRuleQualifiedServiceServerRef returns [EObject current=null] : iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF ;
    public final EObject entryRuleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedServiceServerRef = null;


        try {
            // InternalContextModel.g:471:66: (iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF )
            // InternalContextModel.g:472:2: iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF
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
    // InternalContextModel.g:478:1: ruleQualifiedServiceServerRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:484:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalContextModel.g:485:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalContextModel.g:485:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalContextModel.g:486:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalContextModel.g:486:3: ( (otherlv_0= RULE_ID ) )
            // InternalContextModel.g:487:4: (otherlv_0= RULE_ID )
            {
            // InternalContextModel.g:487:4: (otherlv_0= RULE_ID )
            // InternalContextModel.g:488:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedServiceServerRefAccess().getNodeNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedServiceServerRefAccess().getFullStopKeyword_1());
            		
            // InternalContextModel.g:503:3: ( (otherlv_2= RULE_ID ) )
            // InternalContextModel.g:504:4: (otherlv_2= RULE_ID )
            {
            // InternalContextModel.g:504:4: (otherlv_2= RULE_ID )
            // InternalContextModel.g:505:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedServiceServerRefAccess().getServiceServerServiceServerCrossReference_2_0());
            				

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
    // InternalContextModel.g:520:1: entryRuleQualifiedActionServerRef returns [EObject current=null] : iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF ;
    public final EObject entryRuleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedActionServerRef = null;


        try {
            // InternalContextModel.g:520:65: (iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF )
            // InternalContextModel.g:521:2: iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF
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
    // InternalContextModel.g:527:1: ruleQualifiedActionServerRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:533:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalContextModel.g:534:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalContextModel.g:534:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalContextModel.g:535:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalContextModel.g:535:3: ( (otherlv_0= RULE_ID ) )
            // InternalContextModel.g:536:4: (otherlv_0= RULE_ID )
            {
            // InternalContextModel.g:536:4: (otherlv_0= RULE_ID )
            // InternalContextModel.g:537:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedActionServerRefAccess().getNodeNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedActionServerRefAccess().getFullStopKeyword_1());
            		
            // InternalContextModel.g:552:3: ( (otherlv_2= RULE_ID ) )
            // InternalContextModel.g:553:4: (otherlv_2= RULE_ID )
            {
            // InternalContextModel.g:553:4: (otherlv_2= RULE_ID )
            // InternalContextModel.g:554:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedActionServerRefAccess().getActionServerActionServerCrossReference_2_0());
            				

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
    // InternalContextModel.g:569:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalContextModel.g:569:47: (iv_ruleImport= ruleImport EOF )
            // InternalContextModel.g:570:2: iv_ruleImport= ruleImport EOF
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
    // InternalContextModel.g:576:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:582:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalContextModel.g:583:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalContextModel.g:583:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalContextModel.g:584:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalContextModel.g:588:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalContextModel.g:589:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalContextModel.g:589:4: (lv_importURI_1_0= RULE_STRING )
            // InternalContextModel.g:590:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContextModelNode"
    // InternalContextModel.g:614:1: entryRuleContextModelNode returns [EObject current=null] : iv_ruleContextModelNode= ruleContextModelNode EOF ;
    public final EObject entryRuleContextModelNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModelNode = null;


        try {
            // InternalContextModel.g:614:57: (iv_ruleContextModelNode= ruleContextModelNode EOF )
            // InternalContextModel.g:615:2: iv_ruleContextModelNode= ruleContextModelNode EOF
            {
             newCompositeNode(grammarAccess.getContextModelNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModelNode=ruleContextModelNode();

            state._fsp--;

             current =iv_ruleContextModelNode; 
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
    // $ANTLR end "entryRuleContextModelNode"


    // $ANTLR start "ruleContextModelNode"
    // InternalContextModel.g:621:1: ruleContextModelNode returns [EObject current=null] : (otherlv_0= 'contextModelNode' ( (lv_node_import_1_0= ruleImport ) ) ) ;
    public final EObject ruleContextModelNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_import_1_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:627:2: ( (otherlv_0= 'contextModelNode' ( (lv_node_import_1_0= ruleImport ) ) ) )
            // InternalContextModel.g:628:2: (otherlv_0= 'contextModelNode' ( (lv_node_import_1_0= ruleImport ) ) )
            {
            // InternalContextModel.g:628:2: (otherlv_0= 'contextModelNode' ( (lv_node_import_1_0= ruleImport ) ) )
            // InternalContextModel.g:629:3: otherlv_0= 'contextModelNode' ( (lv_node_import_1_0= ruleImport ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelNodeAccess().getContextModelNodeKeyword_0());
            		
            // InternalContextModel.g:633:3: ( (lv_node_import_1_0= ruleImport ) )
            // InternalContextModel.g:634:4: (lv_node_import_1_0= ruleImport )
            {
            // InternalContextModel.g:634:4: (lv_node_import_1_0= ruleImport )
            // InternalContextModel.g:635:5: lv_node_import_1_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getContextModelNodeAccess().getNode_importImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_import_1_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextModelNodeRule());
            					}
            					set(
            						current,
            						"node_import",
            						lv_node_import_1_0,
            						"eu.coresense.context.ContextModel.Import");
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
    // $ANTLR end "ruleContextModelNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000290000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}