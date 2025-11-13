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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'import'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'action'", "'AND'", "'condition'", "'if'", "'('", "')'", "'else'", "'effect'", "'select_variant'", "'unselect_variant'", "'.'", "'<'", "'>'", "'=='", "'<>'", "'OR'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
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
    // InternalTactics.g:72:1: ruleTacticsModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )* ) ;
    public final EObject ruleTacticsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_imports_3_0 = null;

        EObject lv_adaptationRules_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:78:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )* ) )
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )* )
            {
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )* )
            // InternalTactics.g:80:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )*
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

                if ( (LA1_0==15) ) {
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

            // InternalTactics.g:125:3: ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTactics.g:126:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    {
            	    // InternalTactics.g:126:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    // InternalTactics.g:127:5: lv_adaptationRules_4_0= ruleAdaptationRule
            	    {

            	    					newCompositeNode(grammarAccess.getTacticsModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_adaptationRules_4_0=ruleAdaptationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTacticsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"adaptationRules",
            	    						lv_adaptationRules_4_0,
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
    // InternalTactics.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTactics.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalTactics.g:149:2: iv_ruleImport= ruleImport EOF
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
    // InternalTactics.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:161:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalTactics.g:162:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalTactics.g:162:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalTactics.g:163:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTactics.g:167:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalTactics.g:168:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalTactics.g:168:4: (lv_importURI_1_0= RULE_STRING )
            // InternalTactics.g:169:5: lv_importURI_1_0= RULE_STRING
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
    // InternalTactics.g:193:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // InternalTactics.g:193:55: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // InternalTactics.g:194:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
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
    // InternalTactics.g:200:1: ruleAdaptationRule returns [EObject current=null] : (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRule_0 = null;

        EObject this_RuleSet_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:206:2: ( (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet ) )
            // InternalTactics.g:207:2: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            {
            // InternalTactics.g:207:2: (this_AtomicRule_0= ruleAtomicRule | this_RuleSet_1= ruleRuleSet )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTactics.g:208:3: this_AtomicRule_0= ruleAtomicRule
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
                    // InternalTactics.g:217:3: this_RuleSet_1= ruleRuleSet
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
    // InternalTactics.g:229:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // InternalTactics.g:229:51: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // InternalTactics.g:230:2: iv_ruleAtomicRule= ruleAtomicRule EOF
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
    // InternalTactics.g:236:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) ;
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
            // InternalTactics.g:242:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTactics.g:243:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTactics.g:243:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';' )
            // InternalTactics.g:244:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getRuleKeyword_0());
            		
            // InternalTactics.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:250:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:270:3: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // InternalTactics.g:271:4: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // InternalTactics.g:271:4: (lv_ruleBody_3_0= ruleRuleBody )
            // InternalTactics.g:272:5: lv_ruleBody_3_0= ruleRuleBody
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

            otherlv_4=(Token)match(input,18,FOLLOW_4); 

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
    // InternalTactics.g:301:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalTactics.g:301:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalTactics.g:302:2: iv_ruleRuleSet= ruleRuleSet EOF
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
    // InternalTactics.g:308:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
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
            // InternalTactics.g:314:2: ( (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTactics.g:315:2: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTactics.g:315:2: (otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalTactics.g:316:3: otherlv_0= 'rule_set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRule_setKeyword_0());
            		
            // InternalTactics.g:320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:321:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:322:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:342:3: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTactics.g:343:4: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    {
            	    // InternalTactics.g:343:4: (lv_atomicRules_3_0= ruleAtomicRuleWithPriority )
            	    // InternalTactics.g:344:5: lv_atomicRules_3_0= ruleAtomicRuleWithPriority
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

            otherlv_4=(Token)match(input,18,FOLLOW_4); 

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
    // InternalTactics.g:373:1: entryRuleAtomicRuleWithPriority returns [EObject current=null] : iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF ;
    public final EObject entryRuleAtomicRuleWithPriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRuleWithPriority = null;


        try {
            // InternalTactics.g:373:63: (iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF )
            // InternalTactics.g:374:2: iv_ruleAtomicRuleWithPriority= ruleAtomicRuleWithPriority EOF
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
    // InternalTactics.g:380:1: ruleAtomicRuleWithPriority returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) ;
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
            // InternalTactics.g:386:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' ) )
            // InternalTactics.g:387:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            {
            // InternalTactics.g:387:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}' )
            // InternalTactics.g:388:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_priorityValue_3_0= RULE_INT ) ) otherlv_4= '{' ( (lv_ruleBody_5_0= ruleRuleBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicRuleWithPriorityAccess().getRuleKeyword_0());
            		
            // InternalTactics.g:392:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTactics.g:393:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTactics.g:393:4: (lv_name_1_0= RULE_ID )
            // InternalTactics.g:394:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityKeyword_2());
            		
            // InternalTactics.g:414:3: ( (lv_priorityValue_3_0= RULE_INT ) )
            // InternalTactics.g:415:4: (lv_priorityValue_3_0= RULE_INT )
            {
            // InternalTactics.g:415:4: (lv_priorityValue_3_0= RULE_INT )
            // InternalTactics.g:416:5: lv_priorityValue_3_0= RULE_INT
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

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicRuleWithPriorityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTactics.g:436:3: ( (lv_ruleBody_5_0= ruleRuleBody ) )
            // InternalTactics.g:437:4: (lv_ruleBody_5_0= ruleRuleBody )
            {
            // InternalTactics.g:437:4: (lv_ruleBody_5_0= ruleRuleBody )
            // InternalTactics.g:438:5: lv_ruleBody_5_0= ruleRuleBody
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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTactics.g:463:1: entryRuleAtomicAction returns [EObject current=null] : iv_ruleAtomicAction= ruleAtomicAction EOF ;
    public final EObject entryRuleAtomicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicAction = null;


        try {
            // InternalTactics.g:463:53: (iv_ruleAtomicAction= ruleAtomicAction EOF )
            // InternalTactics.g:464:2: iv_ruleAtomicAction= ruleAtomicAction EOF
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
    // InternalTactics.g:470:1: ruleAtomicAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' ) ;
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
            // InternalTactics.g:476:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' ) )
            // InternalTactics.g:477:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' )
            {
            // InternalTactics.g:477:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}' )
            // InternalTactics.g:478:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleAtomicSimpleAction ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:486:3: ( (lv_actions_2_0= ruleAtomicSimpleAction ) )
            // InternalTactics.g:487:4: (lv_actions_2_0= ruleAtomicSimpleAction )
            {
            // InternalTactics.g:487:4: (lv_actions_2_0= ruleAtomicSimpleAction )
            // InternalTactics.g:488:5: lv_actions_2_0= ruleAtomicSimpleAction
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

            // InternalTactics.g:505:3: (otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTactics.g:506:4: otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAtomicActionAccess().getANDKeyword_3_0());
            	    			
            	    // InternalTactics.g:510:4: ( (lv_actions_4_0= ruleAtomicSimpleAction ) )
            	    // InternalTactics.g:511:5: (lv_actions_4_0= ruleAtomicSimpleAction )
            	    {
            	    // InternalTactics.g:511:5: (lv_actions_4_0= ruleAtomicSimpleAction )
            	    // InternalTactics.g:512:6: lv_actions_4_0= ruleAtomicSimpleAction
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTactics.g:538:1: entryRuleAtomicSimpleAction returns [EObject current=null] : iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF ;
    public final EObject entryRuleAtomicSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicSimpleAction = null;


        try {
            // InternalTactics.g:538:59: (iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF )
            // InternalTactics.g:539:2: iv_ruleAtomicSimpleAction= ruleAtomicSimpleAction EOF
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
    // InternalTactics.g:545:1: ruleAtomicSimpleAction returns [EObject current=null] : (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature ) ;
    public final EObject ruleAtomicSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicActionSelectFeature_0 = null;

        EObject this_AtomicActionDeselectFeature_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:551:2: ( (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature ) )
            // InternalTactics.g:552:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature )
            {
            // InternalTactics.g:552:2: (this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature | this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTactics.g:553:3: this_AtomicActionSelectFeature_0= ruleAtomicActionSelectFeature
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
                    // InternalTactics.g:562:3: this_AtomicActionDeselectFeature_1= ruleAtomicActionDeselectFeature
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
    // InternalTactics.g:574:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalTactics.g:574:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalTactics.g:575:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalTactics.g:581:1: ruleRuleBody returns [EObject current=null] : ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;

        EObject lv_effect_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:587:2: ( ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) ) )
            // InternalTactics.g:588:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) )
            {
            // InternalTactics.g:588:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) ) )
            // InternalTactics.g:589:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffect ) )
            {
            // InternalTactics.g:589:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTactics.g:590:4: this_PureAction_0= rulePureAction
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
                    // InternalTactics.g:599:4: this_ConditionAction_1= ruleConditionAction
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

            // InternalTactics.g:608:3: ( (lv_effect_2_0= ruleEffect ) )
            // InternalTactics.g:609:4: (lv_effect_2_0= ruleEffect )
            {
            // InternalTactics.g:609:4: (lv_effect_2_0= ruleEffect )
            // InternalTactics.g:610:5: lv_effect_2_0= ruleEffect
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
    // InternalTactics.g:631:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // InternalTactics.g:631:51: (iv_rulePureAction= rulePureAction EOF )
            // InternalTactics.g:632:2: iv_rulePureAction= rulePureAction EOF
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
    // InternalTactics.g:638:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:644:2: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // InternalTactics.g:645:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // InternalTactics.g:645:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // InternalTactics.g:646:3: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // InternalTactics.g:646:3: (lv_atomicAction_0_0= ruleAtomicAction )
            // InternalTactics.g:647:4: lv_atomicAction_0_0= ruleAtomicAction
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
    // InternalTactics.g:667:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // InternalTactics.g:667:56: (iv_ruleConditionAction= ruleConditionAction EOF )
            // InternalTactics.g:668:2: iv_ruleConditionAction= ruleConditionAction EOF
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
    // InternalTactics.g:674:1: ruleConditionAction returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? ) ;
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
            // InternalTactics.g:680:2: ( (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? ) )
            // InternalTactics.g:681:2: (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? )
            {
            // InternalTactics.g:681:2: (otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )? )
            // InternalTactics.g:682:3: otherlv_0= 'condition' otherlv_1= '{' (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' ) otherlv_6= '{' ( (lv_atomicAction_7_0= ruleAtomicAction ) ) otherlv_8= '}' (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:690:3: (otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')' )
            // InternalTactics.g:691:4: otherlv_2= 'if' otherlv_3= '(' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ')'
            {
            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            				newLeafNode(otherlv_2, grammarAccess.getConditionActionAccess().getIfKeyword_2_0());
            			
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getLeftParenthesisKeyword_2_1());
            			
            // InternalTactics.g:699:4: ( (lv_condition_4_0= ruleCondition ) )
            // InternalTactics.g:700:5: (lv_condition_4_0= ruleCondition )
            {
            // InternalTactics.g:700:5: (lv_condition_4_0= ruleCondition )
            // InternalTactics.g:701:6: lv_condition_4_0= ruleCondition
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

            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            				newLeafNode(otherlv_5, grammarAccess.getConditionActionAccess().getRightParenthesisKeyword_2_3());
            			

            }

            otherlv_6=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTactics.g:727:3: ( (lv_atomicAction_7_0= ruleAtomicAction ) )
            // InternalTactics.g:728:4: (lv_atomicAction_7_0= ruleAtomicAction )
            {
            // InternalTactics.g:728:4: (lv_atomicAction_7_0= ruleAtomicAction )
            // InternalTactics.g:729:5: lv_atomicAction_7_0= ruleAtomicAction
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

            otherlv_8=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionActionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalTactics.g:750:3: (otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTactics.g:751:4: otherlv_9= 'else' otherlv_10= '{' ( (lv_else_11_0= ruleRuleBody ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionActionAccess().getElseKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTactics.g:759:4: ( (lv_else_11_0= ruleRuleBody ) )
                    // InternalTactics.g:760:5: (lv_else_11_0= ruleRuleBody )
                    {
                    // InternalTactics.g:760:5: (lv_else_11_0= ruleRuleBody )
                    // InternalTactics.g:761:6: lv_else_11_0= ruleRuleBody
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

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTactics.g:787:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalTactics.g:787:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalTactics.g:788:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalTactics.g:794:1: ruleEffect returns [EObject current=null] : ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:800:2: ( ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' ) )
            // InternalTactics.g:801:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' )
            {
            // InternalTactics.g:801:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}' )
            // InternalTactics.g:802:3: () otherlv_1= 'effect' otherlv_2= '{' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= '}'
            {
            // InternalTactics.g:802:3: ()
            // InternalTactics.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectAccess().getEffectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectAccess().getEffectKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:817:3: ( (lv_condition_3_0= ruleCondition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTactics.g:818:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalTactics.g:818:4: (lv_condition_3_0= ruleCondition )
                    // InternalTactics.g:819:5: lv_condition_3_0= ruleCondition
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTactics.g:844:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTactics.g:844:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTactics.g:845:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalTactics.g:851:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:857:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // InternalTactics.g:858:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // InternalTactics.g:858:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // InternalTactics.g:859:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // InternalTactics.g:859:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:860:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:860:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:861:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementContextVarCrossReference_0_0());
            				

            }


            }

            // InternalTactics.g:872:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalTactics.g:873:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalTactics.g:873:4: (lv_operator_1_0= ruleMathOperator )
            // InternalTactics.g:874:5: lv_operator_1_0= ruleMathOperator
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

            // InternalTactics.g:891:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalTactics.g:892:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalTactics.g:892:4: (lv_value_2_0= ruleLiteral )
            // InternalTactics.g:893:5: lv_value_2_0= ruleLiteral
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

            // InternalTactics.g:910:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22||LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTactics.g:911:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // InternalTactics.g:911:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalTactics.g:912:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalTactics.g:912:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalTactics.g:913:6: lv_logicalOp_3_0= ruleLogicalOperator
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

                    // InternalTactics.g:930:4: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // InternalTactics.g:931:5: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // InternalTactics.g:931:5: (lv_secondTerm_4_0= ruleCondition )
                    // InternalTactics.g:932:6: lv_secondTerm_4_0= ruleCondition
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
    // InternalTactics.g:954:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // InternalTactics.g:954:66: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // InternalTactics.g:955:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
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
    // InternalTactics.g:961:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:967:2: ( (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:968:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:968:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:969:3: otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getSelect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:977:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:978:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:978:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:979:5: lv_variant_2_0= ruleQualifiedFeatureRef
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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalTactics.g:1004:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // InternalTactics.g:1004:68: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // InternalTactics.g:1005:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
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
    // InternalTactics.g:1011:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1017:2: ( (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1018:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1018:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1019:3: otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getUnselect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1027:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1028:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1028:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1029:5: lv_variant_2_0= ruleQualifiedFeatureRef
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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalTactics.g:1054:1: entryRuleQualifiedFeatureRef returns [EObject current=null] : iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF ;
    public final EObject entryRuleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedFeatureRef = null;


        try {
            // InternalTactics.g:1054:60: (iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF )
            // InternalTactics.g:1055:2: iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF
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
    // InternalTactics.g:1061:1: ruleQualifiedFeatureRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:1067:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTactics.g:1068:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTactics.g:1068:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalTactics.g:1069:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalTactics.g:1069:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:1070:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:1070:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:1071:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedFeatureRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1());
            		
            // InternalTactics.g:1086:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:1087:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:1087:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:1088:5: otherlv_2= RULE_ID
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
    // InternalTactics.g:1103:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTactics.g:1103:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTactics.g:1104:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalTactics.g:1110:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalTactics.g:1116:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalTactics.g:1117:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalTactics.g:1117:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
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
                    // InternalTactics.g:1118:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalTactics.g:1127:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalTactics.g:1136:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalTactics.g:1145:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalTactics.g:1157:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTactics.g:1157:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTactics.g:1158:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalTactics.g:1164:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1170:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTactics.g:1171:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTactics.g:1171:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTactics.g:1172:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTactics.g:1172:3: (lv_value_0_0= RULE_INT )
            // InternalTactics.g:1173:4: lv_value_0_0= RULE_INT
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
    // InternalTactics.g:1192:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTactics.g:1192:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTactics.g:1193:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalTactics.g:1199:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1205:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTactics.g:1206:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTactics.g:1206:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTactics.g:1207:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTactics.g:1207:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTactics.g:1208:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalTactics.g:1227:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTactics.g:1227:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTactics.g:1228:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalTactics.g:1234:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1240:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTactics.g:1241:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTactics.g:1241:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTactics.g:1242:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTactics.g:1242:3: (lv_value_0_0= RULE_STRING )
            // InternalTactics.g:1243:4: lv_value_0_0= RULE_STRING
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
    // InternalTactics.g:1262:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalTactics.g:1262:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalTactics.g:1263:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalTactics.g:1269:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1275:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalTactics.g:1276:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalTactics.g:1276:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalTactics.g:1277:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalTactics.g:1277:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalTactics.g:1278:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalTactics.g:1297:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTactics.g:1303:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // InternalTactics.g:1304:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // InternalTactics.g:1304:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
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
                    // InternalTactics.g:1305:3: (enumLiteral_0= '<' )
                    {
                    // InternalTactics.g:1305:3: (enumLiteral_0= '<' )
                    // InternalTactics.g:1306:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1313:3: (enumLiteral_1= '>' )
                    {
                    // InternalTactics.g:1313:3: (enumLiteral_1= '>' )
                    // InternalTactics.g:1314:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:1321:3: (enumLiteral_2= '==' )
                    {
                    // InternalTactics.g:1321:3: (enumLiteral_2= '==' )
                    // InternalTactics.g:1322:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:1329:3: (enumLiteral_3= '<>' )
                    {
                    // InternalTactics.g:1329:3: (enumLiteral_3= '<>' )
                    // InternalTactics.g:1330:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

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
    // InternalTactics.g:1340:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTactics.g:1346:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalTactics.g:1347:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalTactics.g:1347:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTactics.g:1348:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalTactics.g:1348:3: (enumLiteral_0= 'AND' )
                    // InternalTactics.g:1349:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1356:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalTactics.g:1356:3: (enumLiteral_1= 'OR' )
                    // InternalTactics.g:1357:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000098002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000400002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});

}