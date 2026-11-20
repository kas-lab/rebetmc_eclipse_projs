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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "';'", "'{'", "'}'", "'import'", "'rule'", "'action'", "'AND'", "'guard'", "'context'", "'('", "')'", "'features'", "'!'", "'selected('", "'select_variant'", "'unselect_variant'", "'.'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'OR'"
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
    // InternalTactics.g:72:1: ruleTacticsModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_tactics_4_0= ruleTactic ) )* ) ;
    public final EObject ruleTacticsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_imports_3_0 = null;

        EObject lv_tactics_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:78:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_tactics_4_0= ruleTactic ) )* ) )
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_tactics_4_0= ruleTactic ) )* )
            {
            // InternalTactics.g:79:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_tactics_4_0= ruleTactic ) )* )
            // InternalTactics.g:80:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_tactics_4_0= ruleTactic ) )*
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

                if ( (LA1_0==17) ) {
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

            // InternalTactics.g:125:3: ( (lv_tactics_4_0= ruleTactic ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTactics.g:126:4: (lv_tactics_4_0= ruleTactic )
            	    {
            	    // InternalTactics.g:126:4: (lv_tactics_4_0= ruleTactic )
            	    // InternalTactics.g:127:5: lv_tactics_4_0= ruleTactic
            	    {

            	    					newCompositeNode(grammarAccess.getTacticsModelAccess().getTacticsTacticParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tactics_4_0=ruleTactic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTacticsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tactics",
            	    						lv_tactics_4_0,
            	    						"eu.coresense.adaptation.Tactics.Tactic");
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


    // $ANTLR start "entryRuleTactic"
    // InternalTactics.g:148:1: entryRuleTactic returns [EObject current=null] : iv_ruleTactic= ruleTactic EOF ;
    public final EObject entryRuleTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTactic = null;


        try {
            // InternalTactics.g:148:47: (iv_ruleTactic= ruleTactic EOF )
            // InternalTactics.g:149:2: iv_ruleTactic= ruleTactic EOF
            {
             newCompositeNode(grammarAccess.getTacticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTactic=ruleTactic();

            state._fsp--;

             current =iv_ruleTactic; 
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
    // $ANTLR end "entryRuleTactic"


    // $ANTLR start "ruleTactic"
    // InternalTactics.g:155:1: ruleTactic returns [EObject current=null] : (this_ActionTactics_0= ruleActionTactics | this_PureTactic_1= rulePureTactic ) ;
    public final EObject ruleTactic() throws RecognitionException {
        EObject current = null;

        EObject this_ActionTactics_0 = null;

        EObject this_PureTactic_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:161:2: ( (this_ActionTactics_0= ruleActionTactics | this_PureTactic_1= rulePureTactic ) )
            // InternalTactics.g:162:2: (this_ActionTactics_0= ruleActionTactics | this_PureTactic_1= rulePureTactic )
            {
            // InternalTactics.g:162:2: (this_ActionTactics_0= ruleActionTactics | this_PureTactic_1= rulePureTactic )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID||LA3_1==15) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTactics.g:163:3: this_ActionTactics_0= ruleActionTactics
                    {

                    			newCompositeNode(grammarAccess.getTacticAccess().getActionTacticsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionTactics_0=ruleActionTactics();

                    state._fsp--;


                    			current = this_ActionTactics_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:172:3: this_PureTactic_1= rulePureTactic
                    {

                    			newCompositeNode(grammarAccess.getTacticAccess().getPureTacticParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureTactic_1=rulePureTactic();

                    state._fsp--;


                    			current = this_PureTactic_1;
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
    // $ANTLR end "ruleTactic"


    // $ANTLR start "entryRuleActionTactics"
    // InternalTactics.g:184:1: entryRuleActionTactics returns [EObject current=null] : iv_ruleActionTactics= ruleActionTactics EOF ;
    public final EObject entryRuleActionTactics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionTactics = null;


        try {
            // InternalTactics.g:184:54: (iv_ruleActionTactics= ruleActionTactics EOF )
            // InternalTactics.g:185:2: iv_ruleActionTactics= ruleActionTactics EOF
            {
             newCompositeNode(grammarAccess.getActionTacticsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionTactics=ruleActionTactics();

            state._fsp--;

             current =iv_ruleActionTactics; 
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
    // $ANTLR end "entryRuleActionTactics"


    // $ANTLR start "ruleActionTactics"
    // InternalTactics.g:191:1: ruleActionTactics returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_tactics_3_0= rulePureTactic ) )* otherlv_4= '}' ) ;
    public final EObject ruleActionTactics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tactics_3_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:197:2: ( ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_tactics_3_0= rulePureTactic ) )* otherlv_4= '}' ) )
            // InternalTactics.g:198:2: ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_tactics_3_0= rulePureTactic ) )* otherlv_4= '}' )
            {
            // InternalTactics.g:198:2: ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_tactics_3_0= rulePureTactic ) )* otherlv_4= '}' )
            // InternalTactics.g:199:3: ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_tactics_3_0= rulePureTactic ) )* otherlv_4= '}'
            {
            // InternalTactics.g:199:3: ( (otherlv_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalTactics.g:200:4: (otherlv_0= RULE_ID )
                    {
                    // InternalTactics.g:200:4: (otherlv_0= RULE_ID )
                    // InternalTactics.g:201:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionTacticsRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getActionTacticsAccess().getRequirementRequirementCrossReference_0_0());
                    				

                    }


                    }
                    break;

            }

            // InternalTactics.g:212:3: ( (otherlv_1= RULE_ID ) )
            // InternalTactics.g:213:4: (otherlv_1= RULE_ID )
            {
            // InternalTactics.g:213:4: (otherlv_1= RULE_ID )
            // InternalTactics.g:214:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionTacticsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getActionTacticsAccess().getActionActionSpecCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionTacticsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTactics.g:229:3: ( (lv_tactics_3_0= rulePureTactic ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTactics.g:230:4: (lv_tactics_3_0= rulePureTactic )
            	    {
            	    // InternalTactics.g:230:4: (lv_tactics_3_0= rulePureTactic )
            	    // InternalTactics.g:231:5: lv_tactics_3_0= rulePureTactic
            	    {

            	    					newCompositeNode(grammarAccess.getActionTacticsAccess().getTacticsPureTacticParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_tactics_3_0=rulePureTactic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionTacticsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tactics",
            	    						lv_tactics_3_0,
            	    						"eu.coresense.adaptation.Tactics.PureTactic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActionTacticsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleActionTactics"


    // $ANTLR start "entryRuleImport"
    // InternalTactics.g:256:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTactics.g:256:47: (iv_ruleImport= ruleImport EOF )
            // InternalTactics.g:257:2: iv_ruleImport= ruleImport EOF
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
    // InternalTactics.g:263:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:269:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalTactics.g:270:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalTactics.g:270:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalTactics.g:271:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTactics.g:275:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalTactics.g:276:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalTactics.g:276:4: (lv_importURI_1_0= RULE_STRING )
            // InternalTactics.g:277:5: lv_importURI_1_0= RULE_STRING
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


    // $ANTLR start "entryRulePureTactic"
    // InternalTactics.g:301:1: entryRulePureTactic returns [EObject current=null] : iv_rulePureTactic= rulePureTactic EOF ;
    public final EObject entryRulePureTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureTactic = null;


        try {
            // InternalTactics.g:301:51: (iv_rulePureTactic= rulePureTactic EOF )
            // InternalTactics.g:302:2: iv_rulePureTactic= rulePureTactic EOF
            {
             newCompositeNode(grammarAccess.getPureTacticRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureTactic=rulePureTactic();

            state._fsp--;

             current =iv_rulePureTactic; 
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
    // $ANTLR end "entryRulePureTactic"


    // $ANTLR start "rulePureTactic"
    // InternalTactics.g:308:1: rulePureTactic returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_guard_4_0= ruleGuard ) )? ( (lv_action_5_0= ruleTacticAction ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject rulePureTactic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_guard_4_0 = null;

        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:314:2: ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_guard_4_0= ruleGuard ) )? ( (lv_action_5_0= ruleTacticAction ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTactics.g:315:2: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_guard_4_0= ruleGuard ) )? ( (lv_action_5_0= ruleTacticAction ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTactics.g:315:2: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_guard_4_0= ruleGuard ) )? ( (lv_action_5_0= ruleTacticAction ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalTactics.g:316:3: ( (otherlv_0= RULE_ID ) )? otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_guard_4_0= ruleGuard ) )? ( (lv_action_5_0= ruleTacticAction ) ) otherlv_6= '}' otherlv_7= ';'
            {
            // InternalTactics.g:316:3: ( (otherlv_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTactics.g:317:4: (otherlv_0= RULE_ID )
                    {
                    // InternalTactics.g:317:4: (otherlv_0= RULE_ID )
                    // InternalTactics.g:318:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPureTacticRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    					newLeafNode(otherlv_0, grammarAccess.getPureTacticAccess().getRequirementRequirementCrossReference_0_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPureTacticAccess().getRuleKeyword_1());
            		
            // InternalTactics.g:333:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTactics.g:334:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTactics.g:334:4: (lv_name_2_0= RULE_ID )
            // InternalTactics.g:335:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPureTacticAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureTacticRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPureTacticAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTactics.g:355:3: ( (lv_guard_4_0= ruleGuard ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTactics.g:356:4: (lv_guard_4_0= ruleGuard )
                    {
                    // InternalTactics.g:356:4: (lv_guard_4_0= ruleGuard )
                    // InternalTactics.g:357:5: lv_guard_4_0= ruleGuard
                    {

                    					newCompositeNode(grammarAccess.getPureTacticAccess().getGuardGuardParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_guard_4_0=ruleGuard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPureTacticRule());
                    					}
                    					set(
                    						current,
                    						"guard",
                    						lv_guard_4_0,
                    						"eu.coresense.adaptation.Tactics.Guard");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTactics.g:374:3: ( (lv_action_5_0= ruleTacticAction ) )
            // InternalTactics.g:375:4: (lv_action_5_0= ruleTacticAction )
            {
            // InternalTactics.g:375:4: (lv_action_5_0= ruleTacticAction )
            // InternalTactics.g:376:5: lv_action_5_0= ruleTacticAction
            {

            					newCompositeNode(grammarAccess.getPureTacticAccess().getActionTacticActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_action_5_0=ruleTacticAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureTacticRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"eu.coresense.adaptation.Tactics.TacticAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPureTacticAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPureTacticAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePureTactic"


    // $ANTLR start "entryRuleSelection"
    // InternalTactics.g:405:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalTactics.g:405:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalTactics.g:406:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalTactics.g:412:1: ruleSelection returns [EObject current=null] : (this_SelectVariant_0= ruleSelectVariant | this_DeselectVariant_1= ruleDeselectVariant ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        EObject this_SelectVariant_0 = null;

        EObject this_DeselectVariant_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:418:2: ( (this_SelectVariant_0= ruleSelectVariant | this_DeselectVariant_1= ruleDeselectVariant ) )
            // InternalTactics.g:419:2: (this_SelectVariant_0= ruleSelectVariant | this_DeselectVariant_1= ruleDeselectVariant )
            {
            // InternalTactics.g:419:2: (this_SelectVariant_0= ruleSelectVariant | this_DeselectVariant_1= ruleDeselectVariant )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTactics.g:420:3: this_SelectVariant_0= ruleSelectVariant
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getSelectVariantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectVariant_0=ruleSelectVariant();

                    state._fsp--;


                    			current = this_SelectVariant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:429:3: this_DeselectVariant_1= ruleDeselectVariant
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getDeselectVariantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeselectVariant_1=ruleDeselectVariant();

                    state._fsp--;


                    			current = this_DeselectVariant_1;
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleTacticAction"
    // InternalTactics.g:441:1: entryRuleTacticAction returns [EObject current=null] : iv_ruleTacticAction= ruleTacticAction EOF ;
    public final EObject entryRuleTacticAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTacticAction = null;


        try {
            // InternalTactics.g:441:53: (iv_ruleTacticAction= ruleTacticAction EOF )
            // InternalTactics.g:442:2: iv_ruleTacticAction= ruleTacticAction EOF
            {
             newCompositeNode(grammarAccess.getTacticActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTacticAction=ruleTacticAction();

            state._fsp--;

             current =iv_ruleTacticAction; 
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
    // $ANTLR end "entryRuleTacticAction"


    // $ANTLR start "ruleTacticAction"
    // InternalTactics.g:448:1: ruleTacticAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleSelection ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTacticAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actions_2_0 = null;

        EObject lv_actions_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:454:2: ( (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleSelection ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )* otherlv_5= '}' ) )
            // InternalTactics.g:455:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleSelection ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )* otherlv_5= '}' )
            {
            // InternalTactics.g:455:2: (otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleSelection ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )* otherlv_5= '}' )
            // InternalTactics.g:456:3: otherlv_0= 'action' otherlv_1= '{' ( (lv_actions_2_0= ruleSelection ) ) (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTacticActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTacticActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:464:3: ( (lv_actions_2_0= ruleSelection ) )
            // InternalTactics.g:465:4: (lv_actions_2_0= ruleSelection )
            {
            // InternalTactics.g:465:4: (lv_actions_2_0= ruleSelection )
            // InternalTactics.g:466:5: lv_actions_2_0= ruleSelection
            {

            					newCompositeNode(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_actions_2_0=ruleSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTacticActionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"eu.coresense.adaptation.Tactics.Selection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:483:3: (otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTactics.g:484:4: otherlv_3= 'AND' ( (lv_actions_4_0= ruleSelection ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTacticActionAccess().getANDKeyword_3_0());
            	    			
            	    // InternalTactics.g:488:4: ( (lv_actions_4_0= ruleSelection ) )
            	    // InternalTactics.g:489:5: (lv_actions_4_0= ruleSelection )
            	    {
            	    // InternalTactics.g:489:5: (lv_actions_4_0= ruleSelection )
            	    // InternalTactics.g:490:6: lv_actions_4_0= ruleSelection
            	    {

            	    						newCompositeNode(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_actions_4_0=ruleSelection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTacticActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_4_0,
            	    							"eu.coresense.adaptation.Tactics.Selection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTacticActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTacticAction"


    // $ANTLR start "entryRuleGuard"
    // InternalTactics.g:516:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalTactics.g:516:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalTactics.g:517:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalTactics.g:523:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'guard' otherlv_1= '{' ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) ) otherlv_6= '}' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_contextGuard_2_0 = null;

        EObject lv_featureGuard_3_0 = null;

        EObject lv_featureGuard_4_0 = null;

        EObject lv_contextGuard_5_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:529:2: ( (otherlv_0= 'guard' otherlv_1= '{' ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) ) otherlv_6= '}' ) )
            // InternalTactics.g:530:2: (otherlv_0= 'guard' otherlv_1= '{' ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) ) otherlv_6= '}' )
            {
            // InternalTactics.g:530:2: (otherlv_0= 'guard' otherlv_1= '{' ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) ) otherlv_6= '}' )
            // InternalTactics.g:531:3: otherlv_0= 'guard' otherlv_1= '{' ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getGuardKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTactics.g:539:3: ( ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? ) | ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTactics.g:540:4: ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? )
                    {
                    // InternalTactics.g:540:4: ( ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )? )
                    // InternalTactics.g:541:5: ( (lv_contextGuard_2_0= ruleContextGuard ) ) ( (lv_featureGuard_3_0= ruleFeatureGuard ) )?
                    {
                    // InternalTactics.g:541:5: ( (lv_contextGuard_2_0= ruleContextGuard ) )
                    // InternalTactics.g:542:6: (lv_contextGuard_2_0= ruleContextGuard )
                    {
                    // InternalTactics.g:542:6: (lv_contextGuard_2_0= ruleContextGuard )
                    // InternalTactics.g:543:7: lv_contextGuard_2_0= ruleContextGuard
                    {

                    							newCompositeNode(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_contextGuard_2_0=ruleContextGuard();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGuardRule());
                    							}
                    							set(
                    								current,
                    								"contextGuard",
                    								lv_contextGuard_2_0,
                    								"eu.coresense.adaptation.Tactics.ContextGuard");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTactics.g:560:5: ( (lv_featureGuard_3_0= ruleFeatureGuard ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTactics.g:561:6: (lv_featureGuard_3_0= ruleFeatureGuard )
                            {
                            // InternalTactics.g:561:6: (lv_featureGuard_3_0= ruleFeatureGuard )
                            // InternalTactics.g:562:7: lv_featureGuard_3_0= ruleFeatureGuard
                            {

                            							newCompositeNode(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_featureGuard_3_0=ruleFeatureGuard();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getGuardRule());
                            							}
                            							set(
                            								current,
                            								"featureGuard",
                            								lv_featureGuard_3_0,
                            								"eu.coresense.adaptation.Tactics.FeatureGuard");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:581:4: ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? )
                    {
                    // InternalTactics.g:581:4: ( ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )? )
                    // InternalTactics.g:582:5: ( (lv_featureGuard_4_0= ruleFeatureGuard ) ) ( (lv_contextGuard_5_0= ruleContextGuard ) )?
                    {
                    // InternalTactics.g:582:5: ( (lv_featureGuard_4_0= ruleFeatureGuard ) )
                    // InternalTactics.g:583:6: (lv_featureGuard_4_0= ruleFeatureGuard )
                    {
                    // InternalTactics.g:583:6: (lv_featureGuard_4_0= ruleFeatureGuard )
                    // InternalTactics.g:584:7: lv_featureGuard_4_0= ruleFeatureGuard
                    {

                    							newCompositeNode(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_featureGuard_4_0=ruleFeatureGuard();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGuardRule());
                    							}
                    							set(
                    								current,
                    								"featureGuard",
                    								lv_featureGuard_4_0,
                    								"eu.coresense.adaptation.Tactics.FeatureGuard");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTactics.g:601:5: ( (lv_contextGuard_5_0= ruleContextGuard ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTactics.g:602:6: (lv_contextGuard_5_0= ruleContextGuard )
                            {
                            // InternalTactics.g:602:6: (lv_contextGuard_5_0= ruleContextGuard )
                            // InternalTactics.g:603:7: lv_contextGuard_5_0= ruleContextGuard
                            {

                            							newCompositeNode(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_contextGuard_5_0=ruleContextGuard();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getGuardRule());
                            							}
                            							set(
                            								current,
                            								"contextGuard",
                            								lv_contextGuard_5_0,
                            								"eu.coresense.adaptation.Tactics.ContextGuard");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleContextGuard"
    // InternalTactics.g:630:1: entryRuleContextGuard returns [EObject current=null] : iv_ruleContextGuard= ruleContextGuard EOF ;
    public final EObject entryRuleContextGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextGuard = null;


        try {
            // InternalTactics.g:630:53: (iv_ruleContextGuard= ruleContextGuard EOF )
            // InternalTactics.g:631:2: iv_ruleContextGuard= ruleContextGuard EOF
            {
             newCompositeNode(grammarAccess.getContextGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextGuard=ruleContextGuard();

            state._fsp--;

             current =iv_ruleContextGuard; 
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
    // $ANTLR end "entryRuleContextGuard"


    // $ANTLR start "ruleContextGuard"
    // InternalTactics.g:637:1: ruleContextGuard returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= '(' ( (lv_contextCondition_2_0= ruleContextCondition ) ) otherlv_3= ')' ) ;
    public final EObject ruleContextGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contextCondition_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:643:2: ( (otherlv_0= 'context' otherlv_1= '(' ( (lv_contextCondition_2_0= ruleContextCondition ) ) otherlv_3= ')' ) )
            // InternalTactics.g:644:2: (otherlv_0= 'context' otherlv_1= '(' ( (lv_contextCondition_2_0= ruleContextCondition ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:644:2: (otherlv_0= 'context' otherlv_1= '(' ( (lv_contextCondition_2_0= ruleContextCondition ) ) otherlv_3= ')' )
            // InternalTactics.g:645:3: otherlv_0= 'context' otherlv_1= '(' ( (lv_contextCondition_2_0= ruleContextCondition ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getContextGuardAccess().getContextKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextGuardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:653:3: ( (lv_contextCondition_2_0= ruleContextCondition ) )
            // InternalTactics.g:654:4: (lv_contextCondition_2_0= ruleContextCondition )
            {
            // InternalTactics.g:654:4: (lv_contextCondition_2_0= ruleContextCondition )
            // InternalTactics.g:655:5: lv_contextCondition_2_0= ruleContextCondition
            {

            					newCompositeNode(grammarAccess.getContextGuardAccess().getContextConditionContextConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_contextCondition_2_0=ruleContextCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextGuardRule());
            					}
            					set(
            						current,
            						"contextCondition",
            						lv_contextCondition_2_0,
            						"eu.coresense.adaptation.Tactics.ContextCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContextGuardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleContextGuard"


    // $ANTLR start "entryRuleFeatureGuard"
    // InternalTactics.g:680:1: entryRuleFeatureGuard returns [EObject current=null] : iv_ruleFeatureGuard= ruleFeatureGuard EOF ;
    public final EObject entryRuleFeatureGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureGuard = null;


        try {
            // InternalTactics.g:680:53: (iv_ruleFeatureGuard= ruleFeatureGuard EOF )
            // InternalTactics.g:681:2: iv_ruleFeatureGuard= ruleFeatureGuard EOF
            {
             newCompositeNode(grammarAccess.getFeatureGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureGuard=ruleFeatureGuard();

            state._fsp--;

             current =iv_ruleFeatureGuard; 
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
    // $ANTLR end "entryRuleFeatureGuard"


    // $ANTLR start "ruleFeatureGuard"
    // InternalTactics.g:687:1: ruleFeatureGuard returns [EObject current=null] : (otherlv_0= 'features' otherlv_1= '(' ( (lv_featureCondition_2_0= ruleFeatureCondition ) ) otherlv_3= ')' ) ;
    public final EObject ruleFeatureGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_featureCondition_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:693:2: ( (otherlv_0= 'features' otherlv_1= '(' ( (lv_featureCondition_2_0= ruleFeatureCondition ) ) otherlv_3= ')' ) )
            // InternalTactics.g:694:2: (otherlv_0= 'features' otherlv_1= '(' ( (lv_featureCondition_2_0= ruleFeatureCondition ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:694:2: (otherlv_0= 'features' otherlv_1= '(' ( (lv_featureCondition_2_0= ruleFeatureCondition ) ) otherlv_3= ')' )
            // InternalTactics.g:695:3: otherlv_0= 'features' otherlv_1= '(' ( (lv_featureCondition_2_0= ruleFeatureCondition ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureGuardAccess().getFeaturesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureGuardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:703:3: ( (lv_featureCondition_2_0= ruleFeatureCondition ) )
            // InternalTactics.g:704:4: (lv_featureCondition_2_0= ruleFeatureCondition )
            {
            // InternalTactics.g:704:4: (lv_featureCondition_2_0= ruleFeatureCondition )
            // InternalTactics.g:705:5: lv_featureCondition_2_0= ruleFeatureCondition
            {

            					newCompositeNode(grammarAccess.getFeatureGuardAccess().getFeatureConditionFeatureConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_featureCondition_2_0=ruleFeatureCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureGuardRule());
            					}
            					set(
            						current,
            						"featureCondition",
            						lv_featureCondition_2_0,
            						"eu.coresense.adaptation.Tactics.FeatureCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureGuardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFeatureGuard"


    // $ANTLR start "entryRuleFeatureCondition"
    // InternalTactics.g:730:1: entryRuleFeatureCondition returns [EObject current=null] : iv_ruleFeatureCondition= ruleFeatureCondition EOF ;
    public final EObject entryRuleFeatureCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCondition = null;


        try {
            // InternalTactics.g:730:57: (iv_ruleFeatureCondition= ruleFeatureCondition EOF )
            // InternalTactics.g:731:2: iv_ruleFeatureCondition= ruleFeatureCondition EOF
            {
             newCompositeNode(grammarAccess.getFeatureConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCondition=ruleFeatureCondition();

            state._fsp--;

             current =iv_ruleFeatureCondition; 
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
    // $ANTLR end "entryRuleFeatureCondition"


    // $ANTLR start "ruleFeatureCondition"
    // InternalTactics.g:737:1: ruleFeatureCondition returns [EObject current=null] : ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )? ) ;
    public final EObject ruleFeatureCondition() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;

        Enumerator lv_logicalOp_4_0 = null;

        EObject lv_secondTerm_5_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:743:2: ( ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )? ) )
            // InternalTactics.g:744:2: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )? )
            {
            // InternalTactics.g:744:2: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )? )
            // InternalTactics.g:745:3: ( (lv_not_0_0= '!' ) )? otherlv_1= 'selected(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )?
            {
            // InternalTactics.g:745:3: ( (lv_not_0_0= '!' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTactics.g:746:4: (lv_not_0_0= '!' )
                    {
                    // InternalTactics.g:746:4: (lv_not_0_0= '!' )
                    // InternalTactics.g:747:5: lv_not_0_0= '!'
                    {
                    lv_not_0_0=(Token)match(input,26,FOLLOW_21); 

                    					newLeafNode(lv_not_0_0, grammarAccess.getFeatureConditionAccess().getNotExclamationMarkKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureConditionRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_0_0, "!");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureConditionAccess().getSelectedKeyword_1());
            		
            // InternalTactics.g:763:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:764:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:764:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:765:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getFeatureConditionAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureConditionRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureConditionAccess().getRightParenthesisKeyword_3());
            		
            // InternalTactics.g:786:3: ( ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20||LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTactics.g:787:4: ( (lv_logicalOp_4_0= ruleLogicalOperator ) ) ( (lv_secondTerm_5_0= ruleFeatureCondition ) )
                    {
                    // InternalTactics.g:787:4: ( (lv_logicalOp_4_0= ruleLogicalOperator ) )
                    // InternalTactics.g:788:5: (lv_logicalOp_4_0= ruleLogicalOperator )
                    {
                    // InternalTactics.g:788:5: (lv_logicalOp_4_0= ruleLogicalOperator )
                    // InternalTactics.g:789:6: lv_logicalOp_4_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getFeatureConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_logicalOp_4_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_4_0,
                    							"eu.coresense.adaptation.Tactics.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTactics.g:806:4: ( (lv_secondTerm_5_0= ruleFeatureCondition ) )
                    // InternalTactics.g:807:5: (lv_secondTerm_5_0= ruleFeatureCondition )
                    {
                    // InternalTactics.g:807:5: (lv_secondTerm_5_0= ruleFeatureCondition )
                    // InternalTactics.g:808:6: lv_secondTerm_5_0= ruleFeatureCondition
                    {

                    						newCompositeNode(grammarAccess.getFeatureConditionAccess().getSecondTermFeatureConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secondTerm_5_0=ruleFeatureCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureConditionRule());
                    						}
                    						set(
                    							current,
                    							"secondTerm",
                    							lv_secondTerm_5_0,
                    							"eu.coresense.adaptation.Tactics.FeatureCondition");
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
    // $ANTLR end "ruleFeatureCondition"


    // $ANTLR start "entryRuleContextCondition"
    // InternalTactics.g:830:1: entryRuleContextCondition returns [EObject current=null] : iv_ruleContextCondition= ruleContextCondition EOF ;
    public final EObject entryRuleContextCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextCondition = null;


        try {
            // InternalTactics.g:830:57: (iv_ruleContextCondition= ruleContextCondition EOF )
            // InternalTactics.g:831:2: iv_ruleContextCondition= ruleContextCondition EOF
            {
             newCompositeNode(grammarAccess.getContextConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextCondition=ruleContextCondition();

            state._fsp--;

             current =iv_ruleContextCondition; 
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
    // $ANTLR end "entryRuleContextCondition"


    // $ANTLR start "ruleContextCondition"
    // InternalTactics.g:837:1: ruleContextCondition returns [EObject current=null] : (this_ContextThresholdCondition_0= ruleContextThresholdCondition | this_ContextContextCondition_1= ruleContextContextCondition ) ;
    public final EObject ruleContextCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ContextThresholdCondition_0 = null;

        EObject this_ContextContextCondition_1 = null;



        	enterRule();

        try {
            // InternalTactics.g:843:2: ( (this_ContextThresholdCondition_0= ruleContextThresholdCondition | this_ContextContextCondition_1= ruleContextContextCondition ) )
            // InternalTactics.g:844:2: (this_ContextThresholdCondition_0= ruleContextThresholdCondition | this_ContextContextCondition_1= ruleContextContextCondition )
            {
            // InternalTactics.g:844:2: (this_ContextThresholdCondition_0= ruleContextThresholdCondition | this_ContextContextCondition_1= ruleContextContextCondition )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalTactics.g:845:3: this_ContextThresholdCondition_0= ruleContextThresholdCondition
                    {

                    			newCompositeNode(grammarAccess.getContextConditionAccess().getContextThresholdConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextThresholdCondition_0=ruleContextThresholdCondition();

                    state._fsp--;


                    			current = this_ContextThresholdCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTactics.g:854:3: this_ContextContextCondition_1= ruleContextContextCondition
                    {

                    			newCompositeNode(grammarAccess.getContextConditionAccess().getContextContextConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextContextCondition_1=ruleContextContextCondition();

                    state._fsp--;


                    			current = this_ContextContextCondition_1;
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
    // $ANTLR end "ruleContextCondition"


    // $ANTLR start "entryRuleContextThresholdCondition"
    // InternalTactics.g:866:1: entryRuleContextThresholdCondition returns [EObject current=null] : iv_ruleContextThresholdCondition= ruleContextThresholdCondition EOF ;
    public final EObject entryRuleContextThresholdCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextThresholdCondition = null;


        try {
            // InternalTactics.g:866:66: (iv_ruleContextThresholdCondition= ruleContextThresholdCondition EOF )
            // InternalTactics.g:867:2: iv_ruleContextThresholdCondition= ruleContextThresholdCondition EOF
            {
             newCompositeNode(grammarAccess.getContextThresholdConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextThresholdCondition=ruleContextThresholdCondition();

            state._fsp--;

             current =iv_ruleContextThresholdCondition; 
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
    // $ANTLR end "entryRuleContextThresholdCondition"


    // $ANTLR start "ruleContextThresholdCondition"
    // InternalTactics.g:873:1: ruleContextThresholdCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_thresholdValue_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? ) ;
    public final EObject ruleContextThresholdCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_thresholdValue_2_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:879:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_thresholdValue_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? ) )
            // InternalTactics.g:880:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_thresholdValue_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? )
            {
            // InternalTactics.g:880:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_thresholdValue_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? )
            // InternalTactics.g:881:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_thresholdValue_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )?
            {
            // InternalTactics.g:881:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:882:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:882:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:883:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextThresholdConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getContextThresholdConditionAccess().getContextVarContextVarCrossReference_0_0());
            				

            }


            }

            // InternalTactics.g:894:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalTactics.g:895:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalTactics.g:895:4: (lv_operator_1_0= ruleMathOperator )
            // InternalTactics.g:896:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getContextThresholdConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextThresholdConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"eu.coresense.adaptation.Tactics.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:913:3: ( (lv_thresholdValue_2_0= ruleLiteral ) )
            // InternalTactics.g:914:4: (lv_thresholdValue_2_0= ruleLiteral )
            {
            // InternalTactics.g:914:4: (lv_thresholdValue_2_0= ruleLiteral )
            // InternalTactics.g:915:5: lv_thresholdValue_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getContextThresholdConditionAccess().getThresholdValueLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_thresholdValue_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextThresholdConditionRule());
            					}
            					set(
            						current,
            						"thresholdValue",
            						lv_thresholdValue_2_0,
            						"eu.coresense.adaptation.Tactics.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:932:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20||LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTactics.g:933:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) )
                    {
                    // InternalTactics.g:933:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalTactics.g:934:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalTactics.g:934:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalTactics.g:935:6: lv_logicalOp_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getContextThresholdConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_logicalOp_3_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextThresholdConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_3_0,
                    							"eu.coresense.adaptation.Tactics.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTactics.g:952:4: ( (lv_secondTerm_4_0= ruleContextCondition ) )
                    // InternalTactics.g:953:5: (lv_secondTerm_4_0= ruleContextCondition )
                    {
                    // InternalTactics.g:953:5: (lv_secondTerm_4_0= ruleContextCondition )
                    // InternalTactics.g:954:6: lv_secondTerm_4_0= ruleContextCondition
                    {

                    						newCompositeNode(grammarAccess.getContextThresholdConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secondTerm_4_0=ruleContextCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextThresholdConditionRule());
                    						}
                    						set(
                    							current,
                    							"secondTerm",
                    							lv_secondTerm_4_0,
                    							"eu.coresense.adaptation.Tactics.ContextCondition");
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
    // $ANTLR end "ruleContextThresholdCondition"


    // $ANTLR start "entryRuleContextContextCondition"
    // InternalTactics.g:976:1: entryRuleContextContextCondition returns [EObject current=null] : iv_ruleContextContextCondition= ruleContextContextCondition EOF ;
    public final EObject entryRuleContextContextCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextContextCondition = null;


        try {
            // InternalTactics.g:976:64: (iv_ruleContextContextCondition= ruleContextContextCondition EOF )
            // InternalTactics.g:977:2: iv_ruleContextContextCondition= ruleContextContextCondition EOF
            {
             newCompositeNode(grammarAccess.getContextContextConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextContextCondition=ruleContextContextCondition();

            state._fsp--;

             current =iv_ruleContextContextCondition; 
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
    // $ANTLR end "entryRuleContextContextCondition"


    // $ANTLR start "ruleContextContextCondition"
    // InternalTactics.g:983:1: ruleContextContextCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (otherlv_2= RULE_ID ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? ) ;
    public final EObject ruleContextContextCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_operator_1_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:989:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (otherlv_2= RULE_ID ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? ) )
            // InternalTactics.g:990:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (otherlv_2= RULE_ID ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? )
            {
            // InternalTactics.g:990:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (otherlv_2= RULE_ID ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )? )
            // InternalTactics.g:991:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (otherlv_2= RULE_ID ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )?
            {
            // InternalTactics.g:991:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:992:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:992:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:993:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextContextConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getContextContextConditionAccess().getContextVarContextVarCrossReference_0_0());
            				

            }


            }

            // InternalTactics.g:1004:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalTactics.g:1005:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalTactics.g:1005:4: (lv_operator_1_0= ruleMathOperator )
            // InternalTactics.g:1006:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getContextContextConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextContextConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"eu.coresense.adaptation.Tactics.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTactics.g:1023:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:1024:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:1024:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:1025:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextContextConditionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getContextContextConditionAccess().getOtherContextVarContextVarCrossReference_2_0());
            				

            }


            }

            // InternalTactics.g:1036:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20||LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTactics.g:1037:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleContextCondition ) )
                    {
                    // InternalTactics.g:1037:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalTactics.g:1038:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalTactics.g:1038:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalTactics.g:1039:6: lv_logicalOp_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getContextContextConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_logicalOp_3_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextContextConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_3_0,
                    							"eu.coresense.adaptation.Tactics.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTactics.g:1056:4: ( (lv_secondTerm_4_0= ruleContextCondition ) )
                    // InternalTactics.g:1057:5: (lv_secondTerm_4_0= ruleContextCondition )
                    {
                    // InternalTactics.g:1057:5: (lv_secondTerm_4_0= ruleContextCondition )
                    // InternalTactics.g:1058:6: lv_secondTerm_4_0= ruleContextCondition
                    {

                    						newCompositeNode(grammarAccess.getContextContextConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secondTerm_4_0=ruleContextCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextContextConditionRule());
                    						}
                    						set(
                    							current,
                    							"secondTerm",
                    							lv_secondTerm_4_0,
                    							"eu.coresense.adaptation.Tactics.ContextCondition");
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
    // $ANTLR end "ruleContextContextCondition"


    // $ANTLR start "entryRuleSelectVariant"
    // InternalTactics.g:1080:1: entryRuleSelectVariant returns [EObject current=null] : iv_ruleSelectVariant= ruleSelectVariant EOF ;
    public final EObject entryRuleSelectVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectVariant = null;


        try {
            // InternalTactics.g:1080:54: (iv_ruleSelectVariant= ruleSelectVariant EOF )
            // InternalTactics.g:1081:2: iv_ruleSelectVariant= ruleSelectVariant EOF
            {
             newCompositeNode(grammarAccess.getSelectVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectVariant=ruleSelectVariant();

            state._fsp--;

             current =iv_ruleSelectVariant; 
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
    // $ANTLR end "entryRuleSelectVariant"


    // $ANTLR start "ruleSelectVariant"
    // InternalTactics.g:1087:1: ruleSelectVariant returns [EObject current=null] : (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleSelectVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1093:2: ( (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1094:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1094:2: (otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1095:3: otherlv_0= 'select_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectVariantAccess().getSelect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectVariantAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1103:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1104:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1104:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1105:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getSelectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectVariantRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectVariantAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSelectVariant"


    // $ANTLR start "entryRuleDeselectVariant"
    // InternalTactics.g:1130:1: entryRuleDeselectVariant returns [EObject current=null] : iv_ruleDeselectVariant= ruleDeselectVariant EOF ;
    public final EObject entryRuleDeselectVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeselectVariant = null;


        try {
            // InternalTactics.g:1130:56: (iv_ruleDeselectVariant= ruleDeselectVariant EOF )
            // InternalTactics.g:1131:2: iv_ruleDeselectVariant= ruleDeselectVariant EOF
            {
             newCompositeNode(grammarAccess.getDeselectVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeselectVariant=ruleDeselectVariant();

            state._fsp--;

             current =iv_ruleDeselectVariant; 
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
    // $ANTLR end "entryRuleDeselectVariant"


    // $ANTLR start "ruleDeselectVariant"
    // InternalTactics.g:1137:1: ruleDeselectVariant returns [EObject current=null] : (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleDeselectVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variant_2_0 = null;



        	enterRule();

        try {
            // InternalTactics.g:1143:2: ( (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' ) )
            // InternalTactics.g:1144:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            {
            // InternalTactics.g:1144:2: (otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')' )
            // InternalTactics.g:1145:3: otherlv_0= 'unselect_variant' otherlv_1= '(' ( (lv_variant_2_0= ruleQualifiedFeatureRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getDeselectVariantAccess().getUnselect_variantKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeselectVariantAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTactics.g:1153:3: ( (lv_variant_2_0= ruleQualifiedFeatureRef ) )
            // InternalTactics.g:1154:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:1154:4: (lv_variant_2_0= ruleQualifiedFeatureRef )
            // InternalTactics.g:1155:5: lv_variant_2_0= ruleQualifiedFeatureRef
            {

            					newCompositeNode(grammarAccess.getDeselectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_variant_2_0=ruleQualifiedFeatureRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeselectVariantRule());
            					}
            					set(
            						current,
            						"variant",
            						lv_variant_2_0,
            						"eu.coresense.adaptation.Tactics.QualifiedFeatureRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeselectVariantAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleDeselectVariant"


    // $ANTLR start "entryRuleQualifiedFeatureRef"
    // InternalTactics.g:1180:1: entryRuleQualifiedFeatureRef returns [EObject current=null] : iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF ;
    public final EObject entryRuleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedFeatureRef = null;


        try {
            // InternalTactics.g:1180:60: (iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF )
            // InternalTactics.g:1181:2: iv_ruleQualifiedFeatureRef= ruleQualifiedFeatureRef EOF
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
    // InternalTactics.g:1187:1: ruleQualifiedFeatureRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTactics.g:1193:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTactics.g:1194:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTactics.g:1194:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalTactics.g:1195:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalTactics.g:1195:3: ( (otherlv_0= RULE_ID ) )
            // InternalTactics.g:1196:4: (otherlv_0= RULE_ID )
            {
            // InternalTactics.g:1196:4: (otherlv_0= RULE_ID )
            // InternalTactics.g:1197:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedFeatureRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1());
            		
            // InternalTactics.g:1212:3: ( (otherlv_2= RULE_ID ) )
            // InternalTactics.g:1213:4: (otherlv_2= RULE_ID )
            {
            // InternalTactics.g:1213:4: (otherlv_2= RULE_ID )
            // InternalTactics.g:1214:5: otherlv_2= RULE_ID
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
    // InternalTactics.g:1229:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTactics.g:1229:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTactics.g:1230:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalTactics.g:1236:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalTactics.g:1242:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalTactics.g:1243:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalTactics.g:1243:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTactics.g:1244:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalTactics.g:1253:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalTactics.g:1262:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalTactics.g:1271:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalTactics.g:1283:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTactics.g:1283:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTactics.g:1284:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalTactics.g:1290:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1296:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTactics.g:1297:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTactics.g:1297:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTactics.g:1298:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTactics.g:1298:3: (lv_value_0_0= RULE_INT )
            // InternalTactics.g:1299:4: lv_value_0_0= RULE_INT
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
    // InternalTactics.g:1318:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTactics.g:1318:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTactics.g:1319:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalTactics.g:1325:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1331:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTactics.g:1332:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTactics.g:1332:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTactics.g:1333:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTactics.g:1333:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTactics.g:1334:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalTactics.g:1353:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTactics.g:1353:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTactics.g:1354:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalTactics.g:1360:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1366:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTactics.g:1367:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTactics.g:1367:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTactics.g:1368:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTactics.g:1368:3: (lv_value_0_0= RULE_STRING )
            // InternalTactics.g:1369:4: lv_value_0_0= RULE_STRING
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
    // InternalTactics.g:1388:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalTactics.g:1388:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalTactics.g:1389:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalTactics.g:1395:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTactics.g:1401:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalTactics.g:1402:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalTactics.g:1402:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalTactics.g:1403:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalTactics.g:1403:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalTactics.g:1404:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalTactics.g:1423:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
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
            // InternalTactics.g:1429:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // InternalTactics.g:1430:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // InternalTactics.g:1430:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            case 35:
                {
                alt19=5;
                }
                break;
            case 36:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTactics.g:1431:3: (enumLiteral_0= '<' )
                    {
                    // InternalTactics.g:1431:3: (enumLiteral_0= '<' )
                    // InternalTactics.g:1432:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1439:3: (enumLiteral_1= '>' )
                    {
                    // InternalTactics.g:1439:3: (enumLiteral_1= '>' )
                    // InternalTactics.g:1440:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:1447:3: (enumLiteral_2= '==' )
                    {
                    // InternalTactics.g:1447:3: (enumLiteral_2= '==' )
                    // InternalTactics.g:1448:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:1455:3: (enumLiteral_3= '!=' )
                    {
                    // InternalTactics.g:1455:3: (enumLiteral_3= '!=' )
                    // InternalTactics.g:1456:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTactics.g:1463:3: (enumLiteral_4= '>=' )
                    {
                    // InternalTactics.g:1463:3: (enumLiteral_4= '>=' )
                    // InternalTactics.g:1464:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTactics.g:1471:3: (enumLiteral_5= '<=' )
                    {
                    // InternalTactics.g:1471:3: (enumLiteral_5= '<=' )
                    // InternalTactics.g:1472:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "ruleLogicalOperator"
    // InternalTactics.g:1482:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTactics.g:1488:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalTactics.g:1489:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalTactics.g:1489:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTactics.g:1490:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalTactics.g:1490:3: (enumLiteral_0= 'AND' )
                    // InternalTactics.g:1491:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:1498:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalTactics.g:1498:3: (enumLiteral_1= 'OR' )
                    // InternalTactics.g:1499:4: enumLiteral_1= 'OR'
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\37\6\4\2\uffff";
    static final String dfa_3s = "\1\4\1\44\6\10\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\11\4\10",
            "\1\11\4\10",
            "\1\11\4\10",
            "\1\11\4\10",
            "\1\11\4\10",
            "\1\11\4\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "844:2: (this_ContextThresholdCondition_0= ruleContextThresholdCondition | this_ContextContextCondition_1= ruleContextContextCondition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002410000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});

}