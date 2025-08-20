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

                if ( (LA1_0==18) ) {
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

                if ( (LA2_0==11) ) {
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
    // InternalContextModel.g:128:1: ruleContextVar returns [EObject current=null] : (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'function_name:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleContextVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_source_3_0 = null;



        	enterRule();

        try {
            // InternalContextModel.g:134:2: ( (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'function_name:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalContextModel.g:135:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'function_name:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalContextModel.g:135:2: (otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'function_name:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalContextModel.g:136:3: otherlv_0= 'ContextVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= 'function_name:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getContextVarAccess().getFunction_nameKeyword_4());
            		
            // InternalContextModel.g:185:3: ( (otherlv_5= RULE_ID ) )
            // InternalContextModel.g:186:4: (otherlv_5= RULE_ID )
            {
            // InternalContextModel.g:186:4: (otherlv_5= RULE_ID )
            // InternalContextModel.g:187:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getContextVarAccess().getFunctionPythonFunctionCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalContextModel.g:206:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalContextModel.g:206:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalContextModel.g:207:2: iv_ruleDataSource= ruleDataSource EOF
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
    // InternalContextModel.g:213:1: ruleDataSource returns [EObject current=null] : ( (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalContextModel.g:219:2: ( ( (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalContextModel.g:220:2: ( (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalContextModel.g:220:2: ( (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalContextModel.g:221:3: (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalContextModel.g:221:3: (otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) ) )
                    // InternalContextModel.g:222:4: otherlv_0= 'topic:' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getTopicKeyword_0_0());
                    			
                    // InternalContextModel.g:226:4: ( (otherlv_1= RULE_ID ) )
                    // InternalContextModel.g:227:5: (otherlv_1= RULE_ID )
                    {
                    // InternalContextModel.g:227:5: (otherlv_1= RULE_ID )
                    // InternalContextModel.g:228:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getTopicTopicSpecCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalContextModel.g:241:3: (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalContextModel.g:241:3: (otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) ) )
                    // InternalContextModel.g:242:4: otherlv_2= 'service:' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getServiceKeyword_1_0());
                    			
                    // InternalContextModel.g:246:4: ( (otherlv_3= RULE_ID ) )
                    // InternalContextModel.g:247:5: (otherlv_3= RULE_ID )
                    {
                    // InternalContextModel.g:247:5: (otherlv_3= RULE_ID )
                    // InternalContextModel.g:248:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getServiceServiceSpecCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalContextModel.g:261:3: (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalContextModel.g:261:3: (otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) ) )
                    // InternalContextModel.g:262:4: otherlv_4= 'action:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getActionKeyword_2_0());
                    			
                    // InternalContextModel.g:266:4: ( (otherlv_5= RULE_ID ) )
                    // InternalContextModel.g:267:5: (otherlv_5= RULE_ID )
                    {
                    // InternalContextModel.g:267:5: (otherlv_5= RULE_ID )
                    // InternalContextModel.g:268:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getDataSourceAccess().getActionActionSpecCrossReference_2_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleImport"
    // InternalContextModel.g:284:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalContextModel.g:284:47: (iv_ruleImport= ruleImport EOF )
            // InternalContextModel.g:285:2: iv_ruleImport= ruleImport EOF
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
    // InternalContextModel.g:291:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModel.g:297:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalContextModel.g:298:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalContextModel.g:298:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalContextModel.g:299:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalContextModel.g:303:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalContextModel.g:304:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalContextModel.g:304:4: (lv_importURI_1_0= RULE_STRING )
            // InternalContextModel.g:305:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}