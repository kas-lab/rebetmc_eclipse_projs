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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_INCDEC", "RULE_DECIMAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'import'", "'rule'", "'{'", "'}'", "'rule_set'", "'priority'", "'action'", "'AND'", "'effect'", "'guard'", "'('", "'OR'", "')'", "'!'", "'selected('", "'select_variant'", "'unselect_variant'", "'.'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int RULE_INCDEC=7;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
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
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

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

            // InternalTactics.g:125:3: ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20) ) {
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
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:342:3: ( (lv_atomicRules_3_0= ruleAtomicRuleWithPriority ) )+
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

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

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
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_15); 

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

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTactics.g:506:4: otherlv_3= 'AND' ( (lv_actions_4_0= ruleAtomicSimpleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_15); 

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

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
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
    // InternalTactics.g:581:1: ruleRuleBody returns [EObject current=null] : ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffectBlock ) )? ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject this_PureAction_0 = null;

        EObject this_ConditionAction_1 = null;

        EObject lv_effect_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:587:2: ( ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffectBlock ) )? ) )
            // InternalTactics.g:588:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffectBlock ) )? )
            {
            // InternalTactics.g:588:2: ( (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffectBlock ) )? )
            // InternalTactics.g:589:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction ) ( (lv_effect_2_0= ruleEffectBlock ) )?
            {
            // InternalTactics.g:589:3: (this_PureAction_0= rulePureAction | this_ConditionAction_1= ruleConditionAction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
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

            // InternalTactics.g:608:3: ( (lv_effect_2_0= ruleEffectBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTactics.g:609:4: (lv_effect_2_0= ruleEffectBlock )
                    {
                    // InternalTactics.g:609:4: (lv_effect_2_0= ruleEffectBlock )
                    // InternalTactics.g:610:5: lv_effect_2_0= ruleEffectBlock
                    {

                    					newCompositeNode(grammarAccess.getRuleBodyAccess().getEffectEffectBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_2_0=ruleEffectBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_2_0,
                    						"eu.coresense.adaptation.Tactics.EffectBlock");
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleEffectBlock"
    // InternalTactics.g:631:1: entryRuleEffectBlock returns [EObject current=null] : iv_ruleEffectBlock= ruleEffectBlock EOF ;
    public final EObject entryRuleEffectBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectBlock = null;


        try {
            // InternalTactics.g:631:52: (iv_ruleEffectBlock= ruleEffectBlock EOF )
            // InternalTactics.g:632:2: iv_ruleEffectBlock= ruleEffectBlock EOF
            {
             newCompositeNode(grammarAccess.getEffectBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectBlock=ruleEffectBlock();

            state._fsp--;

             current =iv_ruleEffectBlock; 
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
    // $ANTLR end "entryRuleEffectBlock"


    // $ANTLR start "ruleEffectBlock"
    // InternalTactics.g:638:1: ruleEffectBlock returns [EObject current=null] : ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_someEffect_3_0= ruleEffect ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_someEffect_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:644:2: ( ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_someEffect_3_0= ruleEffect ) ) otherlv_4= '}' ) )
            // InternalTactics.g:645:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_someEffect_3_0= ruleEffect ) ) otherlv_4= '}' )
            {
            // InternalTactics.g:645:2: ( () otherlv_1= 'effect' otherlv_2= '{' ( (lv_someEffect_3_0= ruleEffect ) ) otherlv_4= '}' )
            // InternalTactics.g:646:3: () otherlv_1= 'effect' otherlv_2= '{' ( (lv_someEffect_3_0= ruleEffect ) ) otherlv_4= '}'
            {
            // InternalTactics.g:646:3: ()
            // InternalTactics.g:647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectBlockAccess().getEffectBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectBlockAccess().getEffectKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:661:3: ( (lv_someEffect_3_0= ruleEffect ) )
            // InternalTactics.g:662:4: (lv_someEffect_3_0= ruleEffect )
            {
            // InternalTactics.g:662:4: (lv_someEffect_3_0= ruleEffect )
            // InternalTactics.g:663:5: lv_someEffect_3_0= ruleEffect
            {

            					newCompositeNode(grammarAccess.getEffectBlockAccess().getSomeEffectEffectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_someEffect_3_0=ruleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectBlockRule());
            					}
            					set(
            						current,
            						"someEffect",
            						lv_someEffect_3_0,
            						"eu.coresense.adaptation.Tactics.Effect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEffectBlock"


    // $ANTLR start "entryRuleEffect"
    // InternalTactics.g:688:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalTactics.g:688:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalTactics.g:689:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalTactics.g:695:1: ruleEffect returns [EObject current=null] : this_RelativeEffect_0= ruleRelativeEffect ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_RelativeEffect_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:701:2: (this_RelativeEffect_0= ruleRelativeEffect )
            // InternalTactics.g:702:2: this_RelativeEffect_0= ruleRelativeEffect
            {

            		newCompositeNode(grammarAccess.getEffectAccess().getRelativeEffectParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RelativeEffect_0=ruleRelativeEffect();

            state._fsp--;


            		current = this_RelativeEffect_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleRelativeEffect"
    // InternalTactics.g:713:1: entryRuleRelativeEffect returns [EObject current=null] : iv_ruleRelativeEffect= ruleRelativeEffect EOF ;
    public final EObject entryRuleRelativeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeEffect = null;


        try {
            // InternalTactics.g:713:55: (iv_ruleRelativeEffect= ruleRelativeEffect EOF )
            // InternalTactics.g:714:2: iv_ruleRelativeEffect= ruleRelativeEffect EOF
            {
             newCompositeNode(grammarAccess.getRelativeEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeEffect=ruleRelativeEffect();

            state._fsp--;

             current =iv_ruleRelativeEffect; 
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
    // $ANTLR end "entryRuleRelativeEffect"


    // $ANTLR start "ruleRelativeEffect"
    // InternalTactics.g:720:1: ruleRelativeEffect returns [EObject current=null] : ( ( (lv_sign_0_0= RULE_INCDEC ) ) ( (lv_effectValue_1_0= ruleLiteral ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRelativeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_0=null;
        Token otherlv_2=null;
        EObject lv_effectValue_1_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:726:2: ( ( ( (lv_sign_0_0= RULE_INCDEC ) ) ( (lv_effectValue_1_0= ruleLiteral ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTactics.g:727:2: ( ( (lv_sign_0_0= RULE_INCDEC ) ) ( (lv_effectValue_1_0= ruleLiteral ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTactics.g:727:2: ( ( (lv_sign_0_0= RULE_INCDEC ) ) ( (lv_effectValue_1_0= ruleLiteral ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalTactics.g:728:3: ( (lv_sign_0_0= RULE_INCDEC ) ) ( (lv_effectValue_1_0= ruleLiteral ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalTactics.g:728:3: ( (lv_sign_0_0= RULE_INCDEC ) )
            // InternalTactics.g:729:4: (lv_sign_0_0= RULE_INCDEC )
            {
            // InternalTactics.g:729:4: (lv_sign_0_0= RULE_INCDEC )
            // InternalTactics.g:730:5: lv_sign_0_0= RULE_INCDEC
            {
            lv_sign_0_0=(Token)match(input,RULE_INCDEC,FOLLOW_19); 

            					newLeafNode(lv_sign_0_0, grammarAccess.getRelativeEffectAccess().getSignINCDECTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeEffectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sign",
            						lv_sign_0_0,
            						"eu.coresense.adaptation.Tactics.INCDEC");
            				

            }


            }

            // InternalTactics.g:746:3: ( (lv_effectValue_1_0= ruleLiteral ) )
            // InternalTactics.g:747:4: (lv_effectValue_1_0= ruleLiteral )
            {
            // InternalTactics.g:747:4: (lv_effectValue_1_0= ruleLiteral )
            // InternalTactics.g:748:5: lv_effectValue_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getRelativeEffectAccess().getEffectValueLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_effectValue_1_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeEffectRule());
            					}
            					set(
            						current,
            						"effectValue",
            						lv_effectValue_1_0,
            						"eu.coresense.adaptation.Tactics.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:765:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:766:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:766:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:767:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRelativeEffectAccess().getMeasurementContextVarCrossReference_2_0());
            				

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
    // $ANTLR end "ruleRelativeEffect"


    // $ANTLR start "entryRulePureAction"
    // InternalTactics.g:782:1: entryRulePureAction returns [EObject current=null] : iv_rulePureAction= rulePureAction EOF ;
    public final EObject entryRulePureAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAction = null;


        try {
            // InternalTactics.g:782:51: (iv_rulePureAction= rulePureAction EOF )
            // InternalTactics.g:783:2: iv_rulePureAction= rulePureAction EOF
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
    // InternalTactics.g:789:1: rulePureAction returns [EObject current=null] : ( (lv_atomicAction_0_0= ruleAtomicAction ) ) ;
    public final EObject rulePureAction() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicAction_0_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:795:2: ( ( (lv_atomicAction_0_0= ruleAtomicAction ) ) )
            // InternalTactics.g:796:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            {
            // InternalTactics.g:796:2: ( (lv_atomicAction_0_0= ruleAtomicAction ) )
            // InternalTactics.g:797:3: (lv_atomicAction_0_0= ruleAtomicAction )
            {
            // InternalTactics.g:797:3: (lv_atomicAction_0_0= ruleAtomicAction )
            // InternalTactics.g:798:4: lv_atomicAction_0_0= ruleAtomicAction
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
    // InternalTactics.g:818:1: entryRuleConditionAction returns [EObject current=null] : iv_ruleConditionAction= ruleConditionAction EOF ;
    public final EObject entryRuleConditionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAction = null;


        try {
            // InternalTactics.g:818:56: (iv_ruleConditionAction= ruleConditionAction EOF )
            // InternalTactics.g:819:2: iv_ruleConditionAction= ruleConditionAction EOF
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
    // InternalTactics.g:825:1: ruleConditionAction returns [EObject current=null] : (otherlv_0= 'guard' otherlv_1= '{' ( (lv_guardCondition_2_0= ruleGuardCNF ) ) otherlv_3= '}' ( (lv_atomicAction_4_0= ruleAtomicAction ) ) ) ;
    public final EObject ruleConditionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_guardCondition_2_0 = null;

        EObject lv_atomicAction_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:831:2: ( (otherlv_0= 'guard' otherlv_1= '{' ( (lv_guardCondition_2_0= ruleGuardCNF ) ) otherlv_3= '}' ( (lv_atomicAction_4_0= ruleAtomicAction ) ) ) )
            // InternalTactics.g:832:2: (otherlv_0= 'guard' otherlv_1= '{' ( (lv_guardCondition_2_0= ruleGuardCNF ) ) otherlv_3= '}' ( (lv_atomicAction_4_0= ruleAtomicAction ) ) )
            {
            // InternalTactics.g:832:2: (otherlv_0= 'guard' otherlv_1= '{' ( (lv_guardCondition_2_0= ruleGuardCNF ) ) otherlv_3= '}' ( (lv_atomicAction_4_0= ruleAtomicAction ) ) )
            // InternalTactics.g:833:3: otherlv_0= 'guard' otherlv_1= '{' ( (lv_guardCondition_2_0= ruleGuardCNF ) ) otherlv_3= '}' ( (lv_atomicAction_4_0= ruleAtomicAction ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionActionAccess().getGuardKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:841:3: ( (lv_guardCondition_2_0= ruleGuardCNF ) )
            // InternalTactics.g:842:4: (lv_guardCondition_2_0= ruleGuardCNF )
            {
            // InternalTactics.g:842:4: (lv_guardCondition_2_0= ruleGuardCNF )
            // InternalTactics.g:843:5: lv_guardCondition_2_0= ruleGuardCNF
            {

            					newCompositeNode(grammarAccess.getConditionActionAccess().getGuardConditionGuardCNFParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_guardCondition_2_0=ruleGuardCNF();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionActionRule());
            					}
            					set(
            						current,
            						"guardCondition",
            						lv_guardCondition_2_0,
            						"eu.coresense.adaptation.Tactics.GuardCNF");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionActionAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalTactics.g:864:3: ( (lv_atomicAction_4_0= ruleAtomicAction ) )
            // InternalTactics.g:865:4: (lv_atomicAction_4_0= ruleAtomicAction )
            {
            // InternalTactics.g:865:4: (lv_atomicAction_4_0= ruleAtomicAction )
            // InternalTactics.g:866:5: lv_atomicAction_4_0= ruleAtomicAction
            {

            					newCompositeNode(grammarAccess.getConditionActionAccess().getAtomicActionAtomicActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_atomicAction_4_0=ruleAtomicAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionActionRule());
            					}
            					set(
            						current,
            						"atomicAction",
            						lv_atomicAction_4_0,
            						"eu.coresense.adaptation.Tactics.AtomicAction");
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
    // $ANTLR end "ruleConditionAction"


    // $ANTLR start "entryRuleGuardCNF"
    // InternalTactics.g:887:1: entryRuleGuardCNF returns [EObject current=null] : iv_ruleGuardCNF= ruleGuardCNF EOF ;
    public final EObject entryRuleGuardCNF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardCNF = null;


        try {
            // InternalTactics.g:887:49: (iv_ruleGuardCNF= ruleGuardCNF EOF )
            // InternalTactics.g:888:2: iv_ruleGuardCNF= ruleGuardCNF EOF
            {
             newCompositeNode(grammarAccess.getGuardCNFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardCNF=ruleGuardCNF();

            state._fsp--;

             current =iv_ruleGuardCNF; 
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
    // $ANTLR end "entryRuleGuardCNF"


    // $ANTLR start "ruleGuardCNF"
    // InternalTactics.g:894:1: ruleGuardCNF returns [EObject current=null] : ( ( (lv_clauses_0_0= ruleGuardDisjunct ) ) (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )* ) ;
    public final EObject ruleGuardCNF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_clauses_0_0 = null;

        EObject lv_clauses_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:900:2: ( ( ( (lv_clauses_0_0= ruleGuardDisjunct ) ) (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )* ) )
            // InternalTactics.g:901:2: ( ( (lv_clauses_0_0= ruleGuardDisjunct ) ) (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )* )
            {
            // InternalTactics.g:901:2: ( ( (lv_clauses_0_0= ruleGuardDisjunct ) ) (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )* )
            // InternalTactics.g:902:3: ( (lv_clauses_0_0= ruleGuardDisjunct ) ) (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )*
            {
            // InternalTactics.g:902:3: ( (lv_clauses_0_0= ruleGuardDisjunct ) )
            // InternalTactics.g:903:4: (lv_clauses_0_0= ruleGuardDisjunct )
            {
            // InternalTactics.g:903:4: (lv_clauses_0_0= ruleGuardDisjunct )
            // InternalTactics.g:904:5: lv_clauses_0_0= ruleGuardDisjunct
            {

            					newCompositeNode(grammarAccess.getGuardCNFAccess().getClausesGuardDisjunctParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_clauses_0_0=ruleGuardDisjunct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardCNFRule());
            					}
            					add(
            						current,
            						"clauses",
            						lv_clauses_0_0,
            						"eu.coresense.adaptation.Tactics.GuardDisjunct");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:921:3: (otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTactics.g:922:4: otherlv_1= 'AND' ( (lv_clauses_2_0= ruleGuardDisjunct ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getGuardCNFAccess().getANDKeyword_1_0());
            	    			
            	    // InternalTactics.g:926:4: ( (lv_clauses_2_0= ruleGuardDisjunct ) )
            	    // InternalTactics.g:927:5: (lv_clauses_2_0= ruleGuardDisjunct )
            	    {
            	    // InternalTactics.g:927:5: (lv_clauses_2_0= ruleGuardDisjunct )
            	    // InternalTactics.g:928:6: lv_clauses_2_0= ruleGuardDisjunct
            	    {

            	    						newCompositeNode(grammarAccess.getGuardCNFAccess().getClausesGuardDisjunctParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_clauses_2_0=ruleGuardDisjunct();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGuardCNFRule());
            	    						}
            	    						add(
            	    							current,
            	    							"clauses",
            	    							lv_clauses_2_0,
            	    							"eu.coresense.adaptation.Tactics.GuardDisjunct");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleGuardCNF"


    // $ANTLR start "entryRuleGuardDisjunct"
    // InternalTactics.g:950:1: entryRuleGuardDisjunct returns [EObject current=null] : iv_ruleGuardDisjunct= ruleGuardDisjunct EOF ;
    public final EObject entryRuleGuardDisjunct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardDisjunct = null;


        try {
            // InternalTactics.g:950:54: (iv_ruleGuardDisjunct= ruleGuardDisjunct EOF )
            // InternalTactics.g:951:2: iv_ruleGuardDisjunct= ruleGuardDisjunct EOF
            {
             newCompositeNode(grammarAccess.getGuardDisjunctRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardDisjunct=ruleGuardDisjunct();

            state._fsp--;

             current =iv_ruleGuardDisjunct; 
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
    // $ANTLR end "entryRuleGuardDisjunct"


    // $ANTLR start "ruleGuardDisjunct"
    // InternalTactics.g:957:1: ruleGuardDisjunct returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' ) | ( (lv_terms_5_0= ruleGuardAtom ) ) ) ;
    public final EObject ruleGuardDisjunct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_3_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:963:2: ( ( (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' ) | ( (lv_terms_5_0= ruleGuardAtom ) ) ) )
            // InternalTactics.g:964:2: ( (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' ) | ( (lv_terms_5_0= ruleGuardAtom ) ) )
            {
            // InternalTactics.g:964:2: ( (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' ) | ( (lv_terms_5_0= ruleGuardAtom ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=RULE_DECIMAL && LA11_0<=RULE_BOOLEAN)||(LA11_0>=29 && LA11_0<=30)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTactics.g:965:3: (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' )
                    {
                    // InternalTactics.g:965:3: (otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')' )
                    // InternalTactics.g:966:4: otherlv_0= '(' ( (lv_terms_1_0= ruleGuardAtom ) ) (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+ otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getGuardDisjunctAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalTactics.g:970:4: ( (lv_terms_1_0= ruleGuardAtom ) )
                    // InternalTactics.g:971:5: (lv_terms_1_0= ruleGuardAtom )
                    {
                    // InternalTactics.g:971:5: (lv_terms_1_0= ruleGuardAtom )
                    // InternalTactics.g:972:6: lv_terms_1_0= ruleGuardAtom
                    {

                    						newCompositeNode(grammarAccess.getGuardDisjunctAccess().getTermsGuardAtomParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_terms_1_0=ruleGuardAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGuardDisjunctRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_1_0,
                    							"eu.coresense.adaptation.Tactics.GuardAtom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTactics.g:989:4: (otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTactics.g:990:5: otherlv_2= 'OR' ( (lv_terms_3_0= ruleGuardAtom ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getGuardDisjunctAccess().getORKeyword_0_2_0());
                    	    				
                    	    // InternalTactics.g:994:5: ( (lv_terms_3_0= ruleGuardAtom ) )
                    	    // InternalTactics.g:995:6: (lv_terms_3_0= ruleGuardAtom )
                    	    {
                    	    // InternalTactics.g:995:6: (lv_terms_3_0= ruleGuardAtom )
                    	    // InternalTactics.g:996:7: lv_terms_3_0= ruleGuardAtom
                    	    {

                    	    							newCompositeNode(grammarAccess.getGuardDisjunctAccess().getTermsGuardAtomParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_terms_3_0=ruleGuardAtom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGuardDisjunctRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_3_0,
                    	    								"eu.coresense.adaptation.Tactics.GuardAtom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getGuardDisjunctAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1020:3: ( (lv_terms_5_0= ruleGuardAtom ) )
                    {
                    // InternalTactics.g:1020:3: ( (lv_terms_5_0= ruleGuardAtom ) )
                    // InternalTactics.g:1021:4: (lv_terms_5_0= ruleGuardAtom )
                    {
                    // InternalTactics.g:1021:4: (lv_terms_5_0= ruleGuardAtom )
                    // InternalTactics.g:1022:5: lv_terms_5_0= ruleGuardAtom
                    {

                    					newCompositeNode(grammarAccess.getGuardDisjunctAccess().getTermsGuardAtomParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_terms_5_0=ruleGuardAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGuardDisjunctRule());
                    					}
                    					add(
                    						current,
                    						"terms",
                    						lv_terms_5_0,
                    						"eu.coresense.adaptation.Tactics.GuardAtom");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleGuardDisjunct"


    // $ANTLR start "entryRuleGuardAtom"
    // InternalTactics.g:1043:1: entryRuleGuardAtom returns [EObject current=null] : iv_ruleGuardAtom= ruleGuardAtom EOF ;
    public final EObject entryRuleGuardAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardAtom = null;


        try {
            // InternalTactics.g:1043:50: (iv_ruleGuardAtom= ruleGuardAtom EOF )
            // InternalTactics.g:1044:2: iv_ruleGuardAtom= ruleGuardAtom EOF
            {
             newCompositeNode(grammarAccess.getGuardAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardAtom=ruleGuardAtom();

            state._fsp--;

             current =iv_ruleGuardAtom; 
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
    // $ANTLR end "entryRuleGuardAtom"


    // $ANTLR start "ruleGuardAtom"
    // InternalTactics.g:1050:1: ruleGuardAtom returns [EObject current=null] : (this_ContextComparison_0= ruleContextComparison | this_FeatureSelection_1= ruleFeatureSelection ) ;
    public final EObject ruleGuardAtom() throws RecognitionException {
        EObject current = null;

        EObject this_ContextComparison_0 = null;

        EObject this_FeatureSelection_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:1056:2: ( (this_ContextComparison_0= ruleContextComparison | this_FeatureSelection_1= ruleFeatureSelection ) )
            // InternalTactics.g:1057:2: (this_ContextComparison_0= ruleContextComparison | this_FeatureSelection_1= ruleFeatureSelection )
            {
            // InternalTactics.g:1057:2: (this_ContextComparison_0= ruleContextComparison | this_FeatureSelection_1= ruleFeatureSelection )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=RULE_DECIMAL && LA12_0<=RULE_BOOLEAN)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=29 && LA12_0<=30)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTactics.g:1058:3: this_ContextComparison_0= ruleContextComparison
                    {

                    			newCompositeNode(grammarAccess.getGuardAtomAccess().getContextComparisonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextComparison_0=ruleContextComparison();

                    state._fsp--;


                    			current = this_ContextComparison_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:1067:3: this_FeatureSelection_1= ruleFeatureSelection
                    {

                    			newCompositeNode(grammarAccess.getGuardAtomAccess().getFeatureSelectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureSelection_1=ruleFeatureSelection();

                    state._fsp--;


                    			current = this_FeatureSelection_1;
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
    // $ANTLR end "ruleGuardAtom"


    // $ANTLR start "entryRuleFeatureSelection"
    // InternalTactics.g:1079:1: entryRuleFeatureSelection returns [EObject current=null] : iv_ruleFeatureSelection= ruleFeatureSelection EOF ;
    public final EObject entryRuleFeatureSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureSelection = null;


        try {
            // InternalTactics.g:1079:57: (iv_ruleFeatureSelection= ruleFeatureSelection EOF )
            // InternalTactics.g:1080:2: iv_ruleFeatureSelection= ruleFeatureSelection EOF
            {
             newCompositeNode(grammarAccess.getFeatureSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureSelection=ruleFeatureSelection();

            state._fsp--;

             current =iv_ruleFeatureSelection; 
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
    // $ANTLR end "entryRuleFeatureSelection"


    // $ANTLR start "ruleFeatureSelection"
    // InternalTactics.g:1086:1: ruleFeatureSelection returns [EObject current=null] : ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleFeatureSelection() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1092:2: ( ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1093:2: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1093:2: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1094:3: ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            // InternalTactics.g:1094:3: ( (lv_not_0_0= '!' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTactics.g:1095:4: (lv_not_0_0= '!' )
                    {
                    // InternalTactics.g:1095:4: (lv_not_0_0= '!' )
                    // InternalTactics.g:1096:5: lv_not_0_0= '!'
                    {
                    lv_not_0_0=(Token)match(input,29,FOLLOW_25); 

                    					newLeafNode(lv_not_0_0, grammarAccess.getFeatureSelectionAccess().getNotExclamationMarkKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureSelectionRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_0_0, "!");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureSelectionAccess().getSelectedKeyword_1());
            		
            // InternalTactics.g:1112:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1113:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1113:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1114:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getFeatureSelectionAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureSelectionRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureSelectionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFeatureSelection"


    // $ANTLR start "entryRuleContextComparison"
    // InternalTactics.g:1139:1: entryRuleContextComparison returns [EObject current=null] : iv_ruleContextComparison= ruleContextComparison EOF ;
    public final EObject entryRuleContextComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextComparison = null;


        try {
            // InternalTactics.g:1139:58: (iv_ruleContextComparison= ruleContextComparison EOF )
            // InternalTactics.g:1140:2: iv_ruleContextComparison= ruleContextComparison EOF
            {
             newCompositeNode(grammarAccess.getContextComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextComparison=ruleContextComparison();

            state._fsp--;

             current =iv_ruleContextComparison; 
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
    // $ANTLR end "entryRuleContextComparison"


    // $ANTLR start "ruleContextComparison"
    // InternalTactics.g:1146:1: ruleContextComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleContextOperand ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_right_2_0= ruleContextOperand ) ) ) ;
    public final EObject ruleContextComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1152:2: ( ( ( (lv_left_0_0= ruleContextOperand ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_right_2_0= ruleContextOperand ) ) ) )
            // InternalTactics.g:1153:2: ( ( (lv_left_0_0= ruleContextOperand ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_right_2_0= ruleContextOperand ) ) )
            {
            // InternalTactics.g:1153:2: ( ( (lv_left_0_0= ruleContextOperand ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_right_2_0= ruleContextOperand ) ) )
            // InternalTactics.g:1154:3: ( (lv_left_0_0= ruleContextOperand ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_right_2_0= ruleContextOperand ) )
            {
            // InternalTactics.g:1154:3: ( (lv_left_0_0= ruleContextOperand ) )
            // InternalTactics.g:1155:4: (lv_left_0_0= ruleContextOperand )
            {
            // InternalTactics.g:1155:4: (lv_left_0_0= ruleContextOperand )
            // InternalTactics.g:1156:5: lv_left_0_0= ruleContextOperand
            {

            					newCompositeNode(grammarAccess.getContextComparisonAccess().getLeftContextOperandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_0_0=ruleContextOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextComparisonRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"eu.coresense.adaptation.Tactics.ContextOperand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:1173:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalTactics.g:1174:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalTactics.g:1174:4: (lv_operator_1_0= ruleMathOperator )
            // InternalTactics.g:1175:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getContextComparisonAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextComparisonRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"eu.coresense.adaptation.Tactics.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:1192:3: ( (lv_right_2_0= ruleContextOperand ) )
            // InternalTactics.g:1193:4: (lv_right_2_0= ruleContextOperand )
            {
            // InternalTactics.g:1193:4: (lv_right_2_0= ruleContextOperand )
            // InternalTactics.g:1194:5: lv_right_2_0= ruleContextOperand
            {

            					newCompositeNode(grammarAccess.getContextComparisonAccess().getRightContextOperandParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleContextOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextComparisonRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"eu.coresense.adaptation.Tactics.ContextOperand");
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
    // $ANTLR end "ruleContextComparison"


    // $ANTLR start "entryRuleContextOperand"
    // InternalTactics.g:1215:1: entryRuleContextOperand returns [EObject current=null] : iv_ruleContextOperand= ruleContextOperand EOF ;
    public final EObject entryRuleContextOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextOperand = null;


        try {
            // InternalTactics.g:1215:55: (iv_ruleContextOperand= ruleContextOperand EOF )
            // InternalTactics.g:1216:2: iv_ruleContextOperand= ruleContextOperand EOF
            {
             newCompositeNode(grammarAccess.getContextOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextOperand=ruleContextOperand();

            state._fsp--;

             current =iv_ruleContextOperand; 
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
    // $ANTLR end "entryRuleContextOperand"


    // $ANTLR start "ruleContextOperand"
    // InternalTactics.g:1222:1: ruleContextOperand returns [EObject current=null] : (this_ContextVariableOperand_0= ruleContextVariableOperand | this_LiteralOperand_1= ruleLiteralOperand ) ;
    public final EObject ruleContextOperand() throws RecognitionException {
        EObject current = null;

        EObject this_ContextVariableOperand_0 = null;

        EObject this_LiteralOperand_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:1228:2: ( (this_ContextVariableOperand_0= ruleContextVariableOperand | this_LiteralOperand_1= ruleLiteralOperand ) )
            // InternalTactics.g:1229:2: (this_ContextVariableOperand_0= ruleContextVariableOperand | this_LiteralOperand_1= ruleLiteralOperand )
            {
            // InternalTactics.g:1229:2: (this_ContextVariableOperand_0= ruleContextVariableOperand | this_LiteralOperand_1= ruleLiteralOperand )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_INT)||(LA14_0>=RULE_DECIMAL && LA14_0<=RULE_BOOLEAN)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTactics.g:1230:3: this_ContextVariableOperand_0= ruleContextVariableOperand
                    {

                    			newCompositeNode(grammarAccess.getContextOperandAccess().getContextVariableOperandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextVariableOperand_0=ruleContextVariableOperand();

                    state._fsp--;


                    			current = this_ContextVariableOperand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:1239:3: this_LiteralOperand_1= ruleLiteralOperand
                    {

                    			newCompositeNode(grammarAccess.getContextOperandAccess().getLiteralOperandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralOperand_1=ruleLiteralOperand();

                    state._fsp--;


                    			current = this_LiteralOperand_1;
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
    // $ANTLR end "ruleContextOperand"


    // $ANTLR start "entryRuleContextVariableOperand"
    // InternalTactics.g:1251:1: entryRuleContextVariableOperand returns [EObject current=null] : iv_ruleContextVariableOperand= ruleContextVariableOperand EOF ;
    public final EObject entryRuleContextVariableOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextVariableOperand = null;


        try {
            // InternalTactics.g:1251:63: (iv_ruleContextVariableOperand= ruleContextVariableOperand EOF )
            // InternalTactics.g:1252:2: iv_ruleContextVariableOperand= ruleContextVariableOperand EOF
            {
             newCompositeNode(grammarAccess.getContextVariableOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextVariableOperand=ruleContextVariableOperand();

            state._fsp--;

             current =iv_ruleContextVariableOperand; 
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
    // $ANTLR end "entryRuleContextVariableOperand"


    // $ANTLR start "ruleContextVariableOperand"
    // InternalTactics.g:1258:1: ruleContextVariableOperand returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContextVariableOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1264:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTactics.g:1265:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTactics.g:1265:2: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:1266:3: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:1266:3: (otherlv_0= RULE_ID )
            // InternalTactics.g:1267:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getContextVariableOperandRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getContextVariableOperandAccess().getVariableContextVarCrossReference_0());
            			

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
    // $ANTLR end "ruleContextVariableOperand"


    // $ANTLR start "entryRuleLiteralOperand"
    // InternalTactics.g:1281:1: entryRuleLiteralOperand returns [EObject current=null] : iv_ruleLiteralOperand= ruleLiteralOperand EOF ;
    public final EObject entryRuleLiteralOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOperand = null;


        try {
            // InternalTactics.g:1281:55: (iv_ruleLiteralOperand= ruleLiteralOperand EOF )
            // InternalTactics.g:1282:2: iv_ruleLiteralOperand= ruleLiteralOperand EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralOperand=ruleLiteralOperand();

            state._fsp--;

             current =iv_ruleLiteralOperand; 
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
    // $ANTLR end "entryRuleLiteralOperand"


    // $ANTLR start "ruleLiteralOperand"
    // InternalTactics.g:1288:1: ruleLiteralOperand returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleLiteralOperand() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1294:2: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // InternalTactics.g:1295:2: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // InternalTactics.g:1295:2: ( (lv_literal_0_0= ruleLiteral ) )
            // InternalTactics.g:1296:3: (lv_literal_0_0= ruleLiteral )
            {
            // InternalTactics.g:1296:3: (lv_literal_0_0= ruleLiteral )
            // InternalTactics.g:1297:4: lv_literal_0_0= ruleLiteral
            {

            				newCompositeNode(grammarAccess.getLiteralOperandAccess().getLiteralLiteralParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_literal_0_0=ruleLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralOperandRule());
            				}
            				set(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"eu.coresense.adaptation.Tactics.Literal");
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
    // $ANTLR end "ruleLiteralOperand"


    // $ANTLR start "entryRuleAtomicActionSelectFeature"
    // InternalTactics.g:1317:1: entryRuleAtomicActionSelectFeature returns [EObject current=null] : iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF ;
    public final EObject entryRuleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionSelectFeature = null;


        try {
            // InternalTactics.g:1317:66: (iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF )
            // InternalTactics.g:1318:2: iv_ruleAtomicActionSelectFeature= ruleAtomicActionSelectFeature EOF
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
    // InternalTactics.g:1324:1: ruleAtomicActionSelectFeature returns [EObject current=null] : (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionSelectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1330:2: ( (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1331:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1331:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1332:3: otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionSelectFeatureAccess().getSelect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionSelectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1340:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1341:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1341:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1342:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getAtomicActionSelectFeatureAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTactics.g:1367:1: entryRuleAtomicActionDeselectFeature returns [EObject current=null] : iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF ;
    public final EObject entryRuleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicActionDeselectFeature = null;


        try {
            // InternalTactics.g:1367:68: (iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF )
            // InternalTactics.g:1368:2: iv_ruleAtomicActionDeselectFeature= ruleAtomicActionDeselectFeature EOF
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
    // InternalTactics.g:1374:1: ruleAtomicActionDeselectFeature returns [EObject current=null] : (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtomicActionDeselectFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1380:2: ( (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1381:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1381:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1382:3: otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicActionDeselectFeatureAccess().getUnselect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicActionDeselectFeatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1390:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1391:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1391:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1392:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getAtomicActionDeselectFeatureAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTactics.g:1417:1: entryRuleQualifiedFeatureRef returns [EObject current=null] : iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF ;
    public final EObject entryRuleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedFeatureRef = null;


        try {
            // InternalTactics.g:1417:60: (iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF )
            // InternalTactics.g:1418:2: iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF
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
    // InternalTactics.g:1424:1: ruleQualifiedFeatureRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:1430:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTactics.g:1431:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTactics.g:1431:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalTactics.g:1432:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalTactics.g:1432:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:1433:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:1433:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:1434:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedFeatureRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1());
            		
            // InternalTactics.g:1449:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:1450:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:1450:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:1451:5: otherlv_2= RULE_ID
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
    // InternalTactics.g:1466:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTactics.g:1466:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTactics.g:1467:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalTactics.g:1473:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalTactics.g:1479:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalTactics.g:1480:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalTactics.g:1480:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTactics.g:1481:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalTactics.g:1490:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalTactics.g:1499:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalTactics.g:1508:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalTactics.g:1520:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTactics.g:1520:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTactics.g:1521:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalTactics.g:1527:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1533:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTactics.g:1534:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTactics.g:1534:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTactics.g:1535:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTactics.g:1535:3: (lv_value_0_0= RULE_INT )
            // InternalTactics.g:1536:4: lv_value_0_0= RULE_INT
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
    // InternalTactics.g:1555:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTactics.g:1555:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTactics.g:1556:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalTactics.g:1562:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1568:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTactics.g:1569:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTactics.g:1569:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTactics.g:1570:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTactics.g:1570:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTactics.g:1571:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalTactics.g:1590:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTactics.g:1590:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTactics.g:1591:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalTactics.g:1597:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1603:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTactics.g:1604:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTactics.g:1604:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTactics.g:1605:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTactics.g:1605:3: (lv_value_0_0= RULE_STRING )
            // InternalTactics.g:1606:4: lv_value_0_0= RULE_STRING
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
    // InternalTactics.g:1625:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalTactics.g:1625:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalTactics.g:1626:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalTactics.g:1632:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1638:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalTactics.g:1639:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalTactics.g:1639:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalTactics.g:1640:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalTactics.g:1640:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalTactics.g:1641:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalTactics.g:1660:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTactics.g:1666:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // InternalTactics.g:1667:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // InternalTactics.g:1667:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 38:
                {
                alt16=5;
                }
                break;
            case 39:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTactics.g:1668:3: (enumLiteral_0= '<' )
                    {
                    // InternalTactics.g:1668:3: (enumLiteral_0= '<' )
                    // InternalTactics.g:1669:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1676:3: (enumLiteral_1= '>' )
                    {
                    // InternalTactics.g:1676:3: (enumLiteral_1= '>' )
                    // InternalTactics.g:1677:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:1684:3: (enumLiteral_2= '==' )
                    {
                    // InternalTactics.g:1684:3: (enumLiteral_2= '==' )
                    // InternalTactics.g:1685:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:1692:3: (enumLiteral_3= '!=' )
                    {
                    // InternalTactics.g:1692:3: (enumLiteral_3= '!=' )
                    // InternalTactics.g:1693:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTactics.g:1700:3: (enumLiteral_4= '>=' )
                    {
                    // InternalTactics.g:1700:3: (enumLiteral_4= '>=' )
                    // InternalTactics.g:1701:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTactics.g:1708:3: (enumLiteral_5= '<=' )
                    {
                    // InternalTactics.g:1708:3: (enumLiteral_5= '<=' )
                    // InternalTactics.g:1709:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMathOperatorAccess().getLEQEnumLiteralDeclaration_5());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000360L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000064000370L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000370L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});

}