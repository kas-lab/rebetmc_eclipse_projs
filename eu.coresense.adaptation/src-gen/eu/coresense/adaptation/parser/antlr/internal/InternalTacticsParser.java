package eu.coresense.adaptation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.adaptation.services.TacticsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTacticsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'resolution_model'", "'import'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'action'", "'AND'", "'condition'", "'if'", "'('", "')'", "'else'", "'effect'", "'select_variant'", "'unselect_variant'", "'.'", "'<'", "'>'", "'=='", "'<>'", "'OR'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTacticsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTacticsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTacticsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTactics.g"; }



     	private TacticsGrammarAccess grammarAccess;

        public InternalTacticsParser(TokenStream input, TacticsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TacticsModel";
       	}

       	@Override
       	protected TacticsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTacticsModel"
    // InternalTactics.g:65:1: entryRuleTacticsModel returns [EObject current=null] : iv_ruleTacticsModel= ruleTacticsModel EOF ;
    public final EObject entryRuleTacticsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTacticsModel = null;


        try {
            // InternalTactics.g:65:53: (iv_ruleTacticsModel= ruleTacticsModel EOF )
            // InternalTactics.g:66:2: iv_ruleTacticsModel= ruleTacticsModel EOF
            {
             newCompositeNode(grammarAccess.getTacticsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTacticsModel=ruleTacticsModel();

            state._fsp--;

             current =iv_ruleTacticsModel; 
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
    // $ANTLR end "entryRuleTacticsModel"


    // $ANTLR start "ruleTacticsModel"
    // InternalTactics.g:72:1: ruleTacticsModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= 'resolution_model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* ) ;
    public final EObject ruleTacticsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_imports_3_0 = null;

        EObject lv_adaptationRules_7_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:78:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= 'resolution_model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* ) )
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= 'resolution_model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* )
            {
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= 'resolution_model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )* )
            // InternalTactics.g:80:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= 'resolution_model' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTacticsModelAccess().getNameKeyword_0());
            		
            // InternalTactics.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTacticsModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTacticsModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTacticsModelAccess().getSemicolonKeyword_2());
            		
            // InternalTactics.g:106:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTactics.g:107:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalTactics.g:107:4: (lv_imports_3_0= ruleImport )
            	    // InternalTactics.g:108:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getTacticsModelAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTacticsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"eu.coresense.adaptation.Tactics.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTacticsModelAccess().getResolution_modelKeyword_4());
            		
            // InternalTactics.g:129:3: ( (otherlv_5= RULE_ID ) )
            // InternalTactics.g:130:4: (otherlv_5= RULE_ID )
            {
            // InternalTactics.g:130:4: (otherlv_5= RULE_ID )
            // InternalTactics.g:131:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTacticsModelRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_5, grammarAccess.getTacticsModelAccess().getResolutionModelResolutionModelCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getTacticsModelAccess().getSemicolonKeyword_6());
            		
            // InternalTactics.g:146:3: ( (lv_adaptationRules_7_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTactics.g:147:4: (lv_adaptationRules_7_0= ruleAdaptationRule )
            	    {
            	    // InternalTactics.g:147:4: (lv_adaptationRules_7_0= ruleAdaptationRule )
            	    // InternalTactics.g:148:5: lv_adaptationRules_7_0= ruleAdaptationRule
            	    {

            	    					newCompositeNode(grammarAccess.getTacticsModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_adaptationRules_7_0=ruleAdaptationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTacticsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"adaptationRules",
            	    						lv_adaptationRules_7_0,
            	    						"eu.coresense.adaptation.Tactics.AdaptationRule");
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
    // $ANTLR end "ruleTacticsModel"


    // $ANTLR start "entryRuleImport"
    // InternalTactics.g:169:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTactics.g:169:47: (iv_ruleImport= ruleImport EOF )
            // InternalTactics.g:170:2: iv_ruleImport= ruleImport EOF
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
    // InternalTactics.g:176:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:182:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalTactics.g:183:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalTactics.g:183:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalTactics.g:184:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTactics.g:188:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalTactics.g:189:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalTactics.g:189:4: (lv_importURI_1_0= RULE_STRING )
            // InternalTactics.g:190:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAdaptationRule"
    // InternalTactics.g:214:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // InternalTactics.g:214:55: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // InternalTactics.g:215:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
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
    // $ANTLR end "entryRuleAdaptationRule"


    // $ANTLR start "ruleAdaptationRule"
    // InternalTactics.g:221:1: ruleAdaptationRule returns [EObject current=null] : (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRule_0 = null;

        EObject this_RuleSet_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:227:2: ( (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) )
            // InternalTactics.g:228:2: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            {
            // InternalTactics.g:228:2: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTactics.g:229:3: this_AtomicRule_0= ruleAtomicRule
                    {

                    			newCompositeNode(grammarAccess.getAdaptationRuleAccess().getAtomicRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicRule_0=ruleAtomicRule();

                    state._fsp--;


                    			current = this_AtomicRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:238:3: this_RuleSet_1= ruleRuleSet
                    {

                    			newCompositeNode(grammarAccess.getAdaptationRuleAccess().getRuleSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleSet_1=ruleRuleSet();

                    state._fsp--;


                    			current = this_RuleSet_1;
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
    // $ANTLR end "ruleAdaptationRule"


    // $ANTLR start "entryRuleAtomicRule"
    // InternalTactics.g:250:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // InternalTactics.g:250:51: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // InternalTactics.g:251:2: iv_ruleAtomicRule= ruleAtomicRule EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicRule=ruleAtomicRule();

            state._fsp--;

             current =iv_ruleAtomicRule; 
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
    // $ANTLR end "entryRuleAtomicRule"


    // $ANTLR start "ruleAtomicRule"
    // InternalTactics.g:257:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleAtomicRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_ruleBody_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:263:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTactics.g:264:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTactics.g:264:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            // InternalTactics.g:265:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
            		
            // InternalTactics.g:269:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:270:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:270:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:271:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:291:3: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // InternalTactics.g:292:4: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // InternalTactics.g:292:4: (lv_ruleBody_3_0= ruleRuleBody )
            // InternalTactics.g:293:5: lv_ruleBody_3_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_ruleBody_3_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRuleRule());
            					}
            					set(
            						current,
            						"ruleBody",
            						lv_ruleBody_3_0,
            						"eu.coresense.adaptation.Tactics.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAtomicRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAtomicRule"


    // $ANTLR start "entryRuleRuleSet"
    // InternalTactics.g:322:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalTactics.g:322:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalTactics.g:323:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalTactics.g:329:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_atomicRules_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:335:2: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTactics.g:336:2: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTactics.g:336:2: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalTactics.g:337:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
            		
            // InternalTactics.g:341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:342:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:363:3: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTactics.g:364:4: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    {
            	    // InternalTactics.g:364:4: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    // InternalTactics.g:365:5: lv_atomicRules_3_0= ruleAtomicRuleWithPriority
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getAtomicRulesAtomicRuleWithPriorityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_atomicRules_3_0=ruleAtomicRuleWithPriority();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atomicRules",
            	    						lv_atomicRules_3_0,
            	    						"eu.coresense.adaptation.Tactics.AtomicRuleWithPriority");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleAtomicRuleWithPriority"
    // InternalTactics.g:394:1: entryRuleAtomicRuleWithPriority returns [EObject current=null] : iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF ;
    public final EObject entryRuleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRuleWithPriority = null;


        try {
            // InternalTactics.g:394:63: (iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF )
            // InternalTactics.g:395:2: iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleWithPriorityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicRuleWithPriority=ruleAtomicRuleWithPriority();

            state._fsp--;

             current =iv_ruleAtomicRuleWithPriority; 
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
    // $ANTLR end "entryRuleAtomicRuleWithPriority"


    // $ANTLR start "ruleAtomicRuleWithPriority"
    // InternalTactics.g:401:1: ruleAtomicRuleWithPriority returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) ;
    public final EObject ruleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_priorityValue_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ruleBody_5_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:407:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) )
            // InternalTactics.g:408:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            {
            // InternalTactics.g:408:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            // InternalTactics.g:409:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
            		
            // InternalTactics.g:413:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:414:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:414:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:415:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtomicRuleWithPriorityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
            		
            // InternalTactics.g:435:3: ( (lv_priorityValue_3_0= RULE_INT ) )
            // InternalTactics.g:436:4: (lv_priorityValue_3_0= RULE_INT )
            {
            // InternalTactics.g:436:4: (lv_priorityValue_3_0= RULE_INT )
            // InternalTactics.g:437:5: lv_priorityValue_3_0= RULE_INT
            {
            lv_priorityValue_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_priorityValue_3_0, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRuleWithPriorityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priorityValue",
            						lv_priorityValue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTactics.g:457:3: ( (lv_ruleBody_5_0= ruleRuleBody ) )
            // InternalTactics.g:458:4: (lv_ruleBody_5_0= ruleRuleBody )
            {
            // InternalTactics.g:458:4: (lv_ruleBody_5_0= ruleRuleBody )
            // InternalTactics.g:459:5: lv_ruleBody_5_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_ruleBody_5_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRuleWithPriorityRule());
            					}
            					set(
            						current,
            						"ruleBody",
            						lv_ruleBody_5_0,
            						"eu.coresense.adaptation.Tactics.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomicRuleWithPriorityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAtomicRuleWithPriority"


    // $ANTLR start "entryRuleAtomicAction"
    // InternalTactics.g:484:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // InternalTactics.g:484:53: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // InternalTactics.g:485:2: iv_ruleAtomicAction= ruleAtomicAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicAction=ruleAtomicAction();

            state._fsp--;

             current =iv_ruleAtomicAction; 
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
    // $ANTLR end "entryRuleAtomicAction"


    // $ANTLR start "ruleAtomicAction"
    // InternalTactics.g:491:1: ruleAtomicAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleAtomicAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actions_2_0 = null;

        EObject lv_actions_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:497:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' ) )
            // InternalTactics.g:498:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' )
            {
            // InternalTactics.g:498:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' )
            // InternalTactics.g:499:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:507:3: ( (lv_actions_2_0= ruleAtomicSimpleAction ) )
            // InternalTactics.g:508:4: (lv_actions_2_0= ruleAtomicSimpleAction )
            {
            // InternalTactics.g:508:4: (lv_actions_2_0= ruleAtomicSimpleAction )
            // InternalTactics.g:509:5: lv_actions_2_0= ruleAtomicSimpleAction
            {

            					newCompositeNode(grammarAccess.getAtomicActionAccess().getActionsAtomicSimpleActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_actions_2_0=ruleAtomicSimpleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicActionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"eu.coresense.adaptation.Tactics.AtomicSimpleAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:526:3: (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTactics.g:527:4: otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAtomicActionAccess().getANDKeyword_3_0());
            	    			
            	    // InternalTactics.g:531:4: ( (lv_actions_4_0= ruleAtomicSimpleAction ) )
            	    // InternalTactics.g:532:5: (lv_actions_4_0= ruleAtomicSimpleAction )
            	    {
            	    // InternalTactics.g:532:5: (lv_actions_4_0= ruleAtomicSimpleAction )
            	    // InternalTactics.g:533:6: lv_actions_4_0= ruleAtomicSimpleAction
            	    {

            	    						newCompositeNode(grammarAccess.getAtomicActionAccess().getActionsAtomicSimpleActionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_actions_4_0=ruleAtomicSimpleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAtomicActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_4_0,
            	    							"eu.coresense.adaptation.Tactics.AtomicSimpleAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAtomicActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAtomicAction"


    // $ANTLR start "entryRuleAtomicSimpleAction"
    // InternalTactics.g:559:1: entryRuleAtomicSimpleAction returns [EObject current=null] : iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF ;
    public final EObject entryRuleAtomicSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicSimpleAction = null;


        try {
            // InternalTactics.g:559:59: (iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF )
            // InternalTactics.g:560:2: iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF
            {
             newCompositeNode(grammarAccess.getAtomicSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicSimpleAction=ruleAtomicSimpleAction();

            state._fsp--;

             current =iv_ruleAtomicSimpleAction; 
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
    // $ANTLR end "entryRuleAtomicSimpleAction"


    // $ANTLR start "ruleAtomicSimpleAction"
    // InternalTactics.g:566:1: ruleAtomicSimpleAction returns [EObject current=null] : (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature ) ;
    public final EObject ruleAtomicSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicActionSelectFeature_0 = null;

        EObject this_AtomicActionDeselectFeature_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:572:2: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature ) )
            // InternalTactics.g:573:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature )
            {
            // InternalTactics.g:573:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTactics.g:574:3: this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature
                    {

                    			newCompositeNode(grammarAccess.getAtomicSimpleActionAccess().getAtomicActionSelectFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicActionSelectFeature_0=ruleAtomicActionSelectFeature();

                    state._fsp--;


                    			current = this_AtomicActionSelectFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:583:3: this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature
                    {

                    			newCompositeNode(grammarAccess.getAtomicSimpleActionAccess().getAtomicActionDeselectFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicActionDeselectFeature_1=ruleAtomicActionDeselectFeature();

                    state._fsp--;


                    			current = this_AtomicActionDeselectFeature_1;
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
    // $ANTLR end "ruleAtomicSimpleAction"


    // $ANTLR start "entryRuleRuleBody"
    // InternalTactics.g:595:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalTactics.g:595:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalTactics.g:596:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalTactics.g:602:1: ruleRuleBody returns [EObject current=null] : ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;

        EObject lv_effect_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:608:2: ( ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) ) )
            // InternalTactics.g:609:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) )
            {
            // InternalTactics.g:609:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) )
            // InternalTactics.g:610:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) )
            {
            // InternalTactics.g:610:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTactics.g:611:4: this_PureAction_0= rulePureAction
                    {

                    				newCompositeNode(grammarAccess.getRuleBodyAccess().getPureActionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_PureAction_0=rulePureAction();

                    state._fsp--;


                    				current = this_PureAction_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTactics.g:620:4: this_ConditionAction_1= ruleConditionAction
                    {

                    				newCompositeNode(grammarAccess.getRuleBodyAccess().getConditionActionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_ConditionAction_1=ruleConditionAction();

                    state._fsp--;


                    				current = this_ConditionAction_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTactics.g:629:3: ( (lv_effect_2_0= ruleEffect ) )
            // InternalTactics.g:630:4: (lv_effect_2_0= ruleEffect )
            {
            // InternalTactics.g:630:4: (lv_effect_2_0= ruleEffect )
            // InternalTactics.g:631:5: lv_effect_2_0= ruleEffect
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getEffectEffectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_effect_2_0=ruleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"effect",
            						lv_effect_2_0,
            						"eu.coresense.adaptation.Tactics.Effect");
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRulePureAction"
    // InternalTactics.g:652:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // InternalTactics.g:652:51: (iv_rulePureAction= rulePureAction EOF )
            // InternalTactics.g:653:2: iv_rulePureAction= rulePureAction EOF
            {
             newCompositeNode(grammarAccess.getPureActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureAction=rulePureAction();

            state._fsp--;

             current =iv_rulePureAction; 
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
    // $ANTLR end "entryRulePureAction"


    // $ANTLR start "rulePureAction"
    // InternalTactics.g:659:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:665:2: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // InternalTactics.g:666:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // InternalTactics.g:666:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // InternalTactics.g:667:3: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // InternalTactics.g:667:3: (lv_atomicAction_0_0= ruleAtomicAction )
            // InternalTactics.g:668:4: lv_atomicAction_0_0= ruleAtomicAction
            {

            				newCompositeNode(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_atomicAction_0_0=ruleAtomicAction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPureActionRule());
            				}
            				set(
            					current,
            					"atomicAction",
            					lv_atomicAction_0_0,
            					"eu.coresense.adaptation.Tactics.AtomicAction");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulePureAction"


    // $ANTLR start "entryRuleConditionAction"
    // InternalTactics.g:688:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // InternalTactics.g:688:56: (iv_ruleConditionAction= ruleConditionAction EOF )
            // InternalTactics.g:689:2: iv_ruleConditionAction= ruleConditionAction EOF
            {
             newCompositeNode(grammarAccess.getConditionActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionAction=ruleConditionAction();

            state._fsp--;

             current =iv_ruleConditionAction; 
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
    // $ANTLR end "entryRuleConditionAction"


    // $ANTLR start "ruleConditionAction"
    // InternalTactics.g:695:1: ruleConditionAction returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? ) ;
    public final EObject ruleConditionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_condition_4_0 = null;

        EObject lv_atomicAction_7_0 = null;

        EObject lv_else_11_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:701:2: ( (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? ) )
            // InternalTactics.g:702:2: (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? )
            {
            // InternalTactics.g:702:2: (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? )
            // InternalTactics.g:703:3: otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:711:3: (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' )
            // InternalTactics.g:712:4: otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')'
            {
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            				newLeafNode(otherlv_2, grammarAccess.getConditionActionAccess().getIfKeyword_2_0());
            			
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_2_1());
            			
            // InternalTactics.g:720:4: ( (lv_condition_4_0= ruleCondition ) )
            // InternalTactics.g:721:5: (lv_condition_4_0= ruleCondition )
            {
            // InternalTactics.g:721:5: (lv_condition_4_0= ruleCondition )
            // InternalTactics.g:722:6: lv_condition_4_0= ruleCondition
            {

            						newCompositeNode(grammarAccess.getConditionActionAccess().getConditionConditionParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_20);
            lv_condition_4_0=ruleCondition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionActionRule());
            						}
            						set(
            							current,
            							"condition",
            							lv_condition_4_0,
            							"eu.coresense.adaptation.Tactics.Condition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_8); 

            				newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_6=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTactics.g:748:3: ( (lv_atomicAction_7_0= ruleAtomicAction ) )
            // InternalTactics.g:749:4: (lv_atomicAction_7_0= ruleAtomicAction )
            {
            // InternalTactics.g:749:4: (lv_atomicAction_7_0= ruleAtomicAction )
            // InternalTactics.g:750:5: lv_atomicAction_7_0= ruleAtomicAction
            {

            					newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_atomicAction_7_0=ruleAtomicAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionActionRule());
            					}
            					set(
            						current,
            						"atomicAction",
            						lv_atomicAction_7_0,
            						"eu.coresense.adaptation.Tactics.AtomicAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionActionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalTactics.g:771:3: (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTactics.g:772:4: otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionActionAccess().getElseKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTactics.g:780:4: ( (lv_else_11_0= ruleRuleBody ) )
                    // InternalTactics.g:781:5: (lv_else_11_0= ruleRuleBody )
                    {
                    // InternalTactics.g:781:5: (lv_else_11_0= ruleRuleBody )
                    // InternalTactics.g:782:6: lv_else_11_0= ruleRuleBody
                    {

                    						newCompositeNode(grammarAccess.getConditionActionAccess().getElseRuleBodyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_else_11_0=ruleRuleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionActionRule());
                    						}
                    						set(
                    							current,
                    							"else",
                    							lv_else_11_0,
                    							"eu.coresense.adaptation.Tactics.RuleBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionActionAccess().getRightCurlyBracketKeyword_6_3());
                    			

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
    // $ANTLR end "ruleConditionAction"


    // $ANTLR start "entryRuleEffect"
    // InternalTactics.g:808:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalTactics.g:808:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalTactics.g:809:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalTactics.g:815:1: ruleEffect returns [EObject current=null] : ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:821:2: ( ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' ) )
            // InternalTactics.g:822:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' )
            {
            // InternalTactics.g:822:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' )
            // InternalTactics.g:823:3: () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}'
            {
            // InternalTactics.g:823:3: ()
            // InternalTactics.g:824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectAccess().getEffectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectAccess().getEffectKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:838:3: ( (lv_condition_3_0= ruleCondition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTactics.g:839:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalTactics.g:839:4: (lv_condition_3_0= ruleCondition )
                    // InternalTactics.g:840:5: lv_condition_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getEffectAccess().getConditionConditionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEffectRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_3_0,
                    						"eu.coresense.adaptation.Tactics.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleCondition"
    // InternalTactics.g:865:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTactics.g:865:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTactics.g:866:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalTactics.g:872:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:878:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // InternalTactics.g:879:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // InternalTactics.g:879:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // InternalTactics.g:880:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // InternalTactics.g:880:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:881:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:881:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:882:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementContextVarCrossReference_0_0());
            				

            }


            }

            // InternalTactics.g:893:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalTactics.g:894:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalTactics.g:894:4: (lv_operator_1_0= ruleMathOperator )
            // InternalTactics.g:895:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"eu.coresense.adaptation.Tactics.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:912:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalTactics.g:913:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalTactics.g:913:4: (lv_value_2_0= ruleLiteral )
            // InternalTactics.g:914:5: lv_value_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValueLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_value_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"eu.coresense.adaptation.Tactics.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:931:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23||LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTactics.g:932:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // InternalTactics.g:932:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalTactics.g:933:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalTactics.g:933:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalTactics.g:934:6: lv_logicalOp_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_logicalOp_3_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_3_0,
                    							"eu.coresense.adaptation.Tactics.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTactics.g:951:4: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // InternalTactics.g:952:5: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // InternalTactics.g:952:5: (lv_secondTerm_4_0= ruleCondition )
                    // InternalTactics.g:953:6: lv_secondTerm_4_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getSecondTermConditionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secondTerm_4_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"secondTerm",
                    							lv_secondTerm_4_0,
                    							"eu.coresense.adaptation.Tactics.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAtomicActionSelectFeature"
    // InternalTactics.g:975:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // InternalTactics.g:975:66: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // InternalTactics.g:976:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionSelectFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicActionSelectFeature=ruleAtomicActionSelectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionSelectFeature; 
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
    // $ANTLR end "entryRuleAtomicActionSelectFeature"


    // $ANTLR start "ruleAtomicActionSelectFeature"
    // InternalTactics.g:982:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:988:2: ( (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:989:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:989:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:990:3: otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getSelect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:998:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:999:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:999:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1000:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicActionSelectFeatureRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicActionSelectFeatureAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleAtomicActionSelectFeature"


    // $ANTLR start "entryRuleAtomicActionDeselectFeature"
    // InternalTactics.g:1025:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // InternalTactics.g:1025:68: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // InternalTactics.g:1026:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicActionDeselectFeature=ruleAtomicActionDeselectFeature();

            state._fsp--;

             current =iv_ruleAtomicActionDeselectFeature; 
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
    // $ANTLR end "entryRuleAtomicActionDeselectFeature"


    // $ANTLR start "ruleAtomicActionDeselectFeature"
    // InternalTactics.g:1032:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1038:2: ( (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1039:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1039:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1040:3: otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getUnselect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1048:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1049:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1049:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1050:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicActionDeselectFeatureRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicActionDeselectFeatureAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleAtomicActionDeselectFeature"


    // $ANTLR start "entryRuleQualifiedFeatureRef"
    // InternalTactics.g:1075:1: entryRuleQualifiedFeatureRef returns [EObject current=null] : iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF ;
    public final EObject entryRuleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedFeatureRef = null;


        try {
            // InternalTactics.g:1075:60: (iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF )
            // InternalTactics.g:1076:2: iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedFeatureRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedFeatureRef=ruleQualifiedFeatureRef();

            state._fsp--;

             current =iv_ruleQualifiedFeatureRef; 
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
    // $ANTLR end "entryRuleQualifiedFeatureRef"


    // $ANTLR start "ruleQualifiedFeatureRef"
    // InternalTactics.g:1082:1: ruleQualifiedFeatureRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:1088:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTactics.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTactics.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalTactics.g:1090:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalTactics.g:1090:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:1091:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:1091:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:1092:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedFeatureRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1());
            		
            // InternalTactics.g:1107:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:1108:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:1108:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:1109:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedFeatureRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedFeatureRefAccess().getFeatureFeatureCrossReference_2_0());
            				

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
    // $ANTLR end "ruleQualifiedFeatureRef"


    // $ANTLR start "entryRuleLiteral"
    // InternalTactics.g:1124:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTactics.g:1124:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTactics.g:1125:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTactics.g:1131:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalTactics.g:1137:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalTactics.g:1138:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalTactics.g:1138:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTactics.g:1139:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:1148:3: this_DecimalLiteral_1= ruleDecimalLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getDecimalLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecimalLiteral_1=ruleDecimalLiteral();

                    state._fsp--;


                    			current = this_DecimalLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTactics.g:1157:3: this_StringLiteral_2= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTactics.g:1166:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_3;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTactics.g:1178:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTactics.g:1178:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTactics.g:1179:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTactics.g:1185:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1191:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTactics.g:1192:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTactics.g:1192:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTactics.g:1193:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTactics.g:1193:3: (lv_value_0_0= RULE_INT )
            // InternalTactics.g:1194:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // InternalTactics.g:1213:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTactics.g:1213:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTactics.g:1214:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
            {
             newCompositeNode(grammarAccess.getDecimalLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimalLiteral=ruleDecimalLiteral();

            state._fsp--;

             current =iv_ruleDecimalLiteral; 
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
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // InternalTactics.g:1220:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1226:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTactics.g:1227:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTactics.g:1227:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTactics.g:1228:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTactics.g:1228:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTactics.g:1229:4: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDecimalLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"eu.coresense.adaptation.Tactics.DECIMAL");
            			

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
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalTactics.g:1248:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTactics.g:1248:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTactics.g:1249:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalTactics.g:1255:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1261:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTactics.g:1262:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTactics.g:1262:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTactics.g:1263:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTactics.g:1263:3: (lv_value_0_0= RULE_STRING )
            // InternalTactics.g:1264:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalTactics.g:1283:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalTactics.g:1283:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalTactics.g:1284:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalTactics.g:1290:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1296:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalTactics.g:1297:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalTactics.g:1297:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalTactics.g:1298:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalTactics.g:1298:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalTactics.g:1299:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"eu.coresense.adaptation.Tactics.BOOLEAN");
            			

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "ruleMathOperator"
    // InternalTactics.g:1318:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTactics.g:1324:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // InternalTactics.g:1325:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // InternalTactics.g:1325:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTactics.g:1326:3: (enumLiteral_0= '<' )
                    {
                    // InternalTactics.g:1326:3: (enumLiteral_0= '<' )
                    // InternalTactics.g:1327:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1334:3: (enumLiteral_1= '>' )
                    {
                    // InternalTactics.g:1334:3: (enumLiteral_1= '>' )
                    // InternalTactics.g:1335:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:1342:3: (enumLiteral_2= '==' )
                    {
                    // InternalTactics.g:1342:3: (enumLiteral_2= '==' )
                    // InternalTactics.g:1343:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:1350:3: (enumLiteral_3= '<>' )
                    {
                    // InternalTactics.g:1350:3: (enumLiteral_3= '<>' )
                    // InternalTactics.g:1351:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalTactics.g:1361:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTactics.g:1367:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalTactics.g:1368:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalTactics.g:1368:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTactics.g:1369:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalTactics.g:1369:3: (enumLiteral_0= 'AND' )
                    // InternalTactics.g:1370:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1377:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalTactics.g:1377:3: (enumLiteral_1= 'OR' )
                    // InternalTactics.g:1378:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLogicalOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});

}