package eu.coresense.requirements.parser.antlr.internal;

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
import eu.coresense.requirements.services.RequirementsModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRequirementsModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "':'", "'SHALL'", "'('", "')'", "'EVENTUALLY'", "'THIS'", "'UNTIL'", "'BEFORE'", "'AFTER'", "'IN'", "'AS'", "'EARLY'", "'LATE'", "'MANY'", "'FEW'", "'POSSIBLE'", "'CLOSE'", "'TO'", "'MAY'", "'OR'", "'-'", "'hr'", "'min'", "'s'", "'ms'", "'ns'", "'Functional suitability'", "'Performance efficiency'", "'Compatibility'", "'Interaction capability'", "'Reliability'", "'Security'", "'Maintainability'", "'Flexibility'", "'Safety'", "'<'", "'>'", "'=='", "'<>'", "'&&'", "'||'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRequirementsModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRequirementsModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRequirementsModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRequirementsModel.g"; }



     	private RequirementsModelGrammarAccess grammarAccess;

        public InternalRequirementsModelParser(TokenStream input, RequirementsModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RequirementsModel";
       	}

       	@Override
       	protected RequirementsModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequirementsModel"
    // InternalRequirementsModel.g:65:1: entryRuleRequirementsModel returns [EObject current=null] : iv_ruleRequirementsModel= ruleRequirementsModel EOF ;
    public final EObject entryRuleRequirementsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsModel = null;


        try {
            // InternalRequirementsModel.g:65:58: (iv_ruleRequirementsModel= ruleRequirementsModel EOF )
            // InternalRequirementsModel.g:66:2: iv_ruleRequirementsModel= ruleRequirementsModel EOF
            {
             newCompositeNode(grammarAccess.getRequirementsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementsModel=ruleRequirementsModel();

            state._fsp--;

             current =iv_ruleRequirementsModel; 
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
    // $ANTLR end "entryRuleRequirementsModel"


    // $ANTLR start "ruleRequirementsModel"
    // InternalRequirementsModel.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( (lv_requirements_0_0= ruleRequirement ) )* ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_0_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:78:2: ( ( (lv_requirements_0_0= ruleRequirement ) )* )
            // InternalRequirementsModel.g:79:2: ( (lv_requirements_0_0= ruleRequirement ) )*
            {
            // InternalRequirementsModel.g:79:2: ( (lv_requirements_0_0= ruleRequirement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRequirementsModel.g:80:3: (lv_requirements_0_0= ruleRequirement )
            	    {
            	    // InternalRequirementsModel.g:80:3: (lv_requirements_0_0= ruleRequirement )
            	    // InternalRequirementsModel.g:81:4: lv_requirements_0_0= ruleRequirement
            	    {

            	    				newCompositeNode(grammarAccess.getRequirementsModelAccess().getRequirementsRequirementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_requirements_0_0=ruleRequirement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"requirements",
            	    					lv_requirements_0_0,
            	    					"eu.coresense.requirements.RequirementsModel.Requirement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleRequirementsModel"


    // $ANTLR start "entryRuleRequirement"
    // InternalRequirementsModel.g:101:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRequirementsModel.g:101:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRequirementsModel.g:102:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalRequirementsModel.g:108:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_natural_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_rule_6_0= ruleStatement ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_natural_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_qa_2_0 = null;

        EObject lv_rule_6_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:114:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_natural_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_rule_6_0= ruleStatement ) ) ) )
            // InternalRequirementsModel.g:115:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_natural_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_rule_6_0= ruleStatement ) ) )
            {
            // InternalRequirementsModel.g:115:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_natural_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_rule_6_0= ruleStatement ) ) )
            // InternalRequirementsModel.g:116:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_natural_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_rule_6_0= ruleStatement ) )
            {
            // InternalRequirementsModel.g:116:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRequirementsModel.g:117:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRequirementsModel.g:117:4: (lv_name_0_0= RULE_ID )
            // InternalRequirementsModel.g:118:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getCommaKeyword_1());
            		
            // InternalRequirementsModel.g:138:3: ( (lv_qa_2_0= ruleQualityAttribute ) )
            // InternalRequirementsModel.g:139:4: (lv_qa_2_0= ruleQualityAttribute )
            {
            // InternalRequirementsModel.g:139:4: (lv_qa_2_0= ruleQualityAttribute )
            // InternalRequirementsModel.g:140:5: lv_qa_2_0= ruleQualityAttribute
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getQaQualityAttributeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_qa_2_0=ruleQualityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"qa",
            						lv_qa_2_0,
            						"eu.coresense.requirements.RequirementsModel.QualityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getColonKeyword_3());
            		
            // InternalRequirementsModel.g:161:3: ( (lv_natural_4_0= RULE_STRING ) )
            // InternalRequirementsModel.g:162:4: (lv_natural_4_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:162:4: (lv_natural_4_0= RULE_STRING )
            // InternalRequirementsModel.g:163:5: lv_natural_4_0= RULE_STRING
            {
            lv_natural_4_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_natural_4_0, grammarAccess.getRequirementAccess().getNaturalSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"natural",
            						lv_natural_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCommaKeyword_5());
            		
            // InternalRequirementsModel.g:183:3: ( (lv_rule_6_0= ruleStatement ) )
            // InternalRequirementsModel.g:184:4: (lv_rule_6_0= ruleStatement )
            {
            // InternalRequirementsModel.g:184:4: (lv_rule_6_0= ruleStatement )
            // InternalRequirementsModel.g:185:5: lv_rule_6_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getRuleStatementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_6_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_6_0,
            						"eu.coresense.requirements.RequirementsModel.Statement");
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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleCondition"
    // InternalRequirementsModel.g:206:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRequirementsModel.g:206:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRequirementsModel.g:207:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalRequirementsModel.g:213:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:219:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // InternalRequirementsModel.g:220:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // InternalRequirementsModel.g:220:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // InternalRequirementsModel.g:221:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // InternalRequirementsModel.g:221:3: ( (otherlv_0= RULE_ID ) )
            // InternalRequirementsModel.g:222:4: (otherlv_0= RULE_ID )
            {
            // InternalRequirementsModel.g:222:4: (otherlv_0= RULE_ID )
            // InternalRequirementsModel.g:223:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementContextVarCrossReference_0_0());
            				

            }


            }

            // InternalRequirementsModel.g:234:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalRequirementsModel.g:235:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalRequirementsModel.g:235:4: (lv_operator_1_0= ruleMathOperator )
            // InternalRequirementsModel.g:236:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_operator_1_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"eu.coresense.requirements.RequirementsModel.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsModel.g:253:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalRequirementsModel.g:254:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalRequirementsModel.g:254:4: (lv_value_2_0= ruleLiteral )
            // InternalRequirementsModel.g:255:5: lv_value_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValueLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_value_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"eu.coresense.requirements.RequirementsModel.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsModel.g:272:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=53 && LA2_0<=54)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRequirementsModel.g:273:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // InternalRequirementsModel.g:273:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalRequirementsModel.g:274:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalRequirementsModel.g:274:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalRequirementsModel.g:275:6: lv_logicalOp_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_logicalOp_3_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_3_0,
                    							"eu.coresense.requirements.RequirementsModel.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsModel.g:292:4: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // InternalRequirementsModel.g:293:5: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // InternalRequirementsModel.g:293:5: (lv_secondTerm_4_0= ruleCondition )
                    // InternalRequirementsModel.g:294:6: lv_secondTerm_4_0= ruleCondition
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
                    							"eu.coresense.requirements.RequirementsModel.Condition");
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


    // $ANTLR start "entryRuleProposition"
    // InternalRequirementsModel.g:316:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalRequirementsModel.g:316:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalRequirementsModel.g:317:2: iv_ruleProposition= ruleProposition EOF
            {
             newCompositeNode(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposition=ruleProposition();

            state._fsp--;

             current =iv_ruleProposition; 
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
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalRequirementsModel.g:323:1: ruleProposition returns [EObject current=null] : this_Condition_0= ruleCondition ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:329:2: (this_Condition_0= ruleCondition )
            // InternalRequirementsModel.g:330:2: this_Condition_0= ruleCondition
            {

            		newCompositeNode(grammarAccess.getPropositionAccess().getConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Condition_0=ruleCondition();

            state._fsp--;


            		current = this_Condition_0;
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
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleStatement"
    // InternalRequirementsModel.g:341:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRequirementsModel.g:341:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRequirementsModel.g:342:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRequirementsModel.g:348:1: ruleStatement returns [EObject current=null] : ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) | ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) ) | (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' ) | this_MayStatement_8= ruleMayStatement | (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' ) | (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' ) | (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' ) | (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) ) | this_AsCloseFreq_29= ruleAsCloseFreq | this_AsCloseLit_30= ruleAsCloseLit | (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_BOOLEAN_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_proposition_2_0 = null;

        EObject lv_quantifiableStatement_3_0 = null;

        EObject lv_statement_6_0 = null;

        EObject this_MayStatement_8 = null;

        EObject lv_statement_11_0 = null;

        EObject lv_first_statement_14_0 = null;

        EObject lv_second_statement_16_0 = null;

        AntlrDatatypeRuleToken lv_event_18_0 = null;

        EObject lv_statement_20_0 = null;

        AntlrDatatypeRuleToken lv_event_23_0 = null;

        EObject lv_statement_25_0 = null;

        EObject lv_t_28_0 = null;

        EObject this_AsCloseFreq_29 = null;

        EObject this_AsCloseLit_30 = null;

        EObject lv_statement_39_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:354:2: ( ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) | ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) ) | (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' ) | this_MayStatement_8= ruleMayStatement | (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' ) | (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' ) | (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' ) | (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) ) | this_AsCloseFreq_29= ruleAsCloseFreq | this_AsCloseLit_30= ruleAsCloseLit | (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' ) ) )
            // InternalRequirementsModel.g:355:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) | ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) ) | (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' ) | this_MayStatement_8= ruleMayStatement | (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' ) | (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' ) | (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' ) | (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) ) | this_AsCloseFreq_29= ruleAsCloseFreq | this_AsCloseLit_30= ruleAsCloseLit | (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' ) )
            {
            // InternalRequirementsModel.g:355:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) | ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) ) | (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' ) | this_MayStatement_8= ruleMayStatement | (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' ) | (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' ) | (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' ) | (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) ) | this_AsCloseFreq_29= ruleAsCloseFreq | this_AsCloseLit_30= ruleAsCloseLit | (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' ) )
            int alt4=12;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRequirementsModel.g:356:3: ( () this_BOOLEAN_1= RULE_BOOLEAN )
                    {
                    // InternalRequirementsModel.g:356:3: ( () this_BOOLEAN_1= RULE_BOOLEAN )
                    // InternalRequirementsModel.g:357:4: () this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    // InternalRequirementsModel.g:357:4: ()
                    // InternalRequirementsModel.g:358:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_0_0(),
                    						current);
                    				

                    }

                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    				newLeafNode(this_BOOLEAN_1, grammarAccess.getStatementAccess().getBOOLEANTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:370:3: ( (lv_proposition_2_0= ruleProposition ) )
                    {
                    // InternalRequirementsModel.g:370:3: ( (lv_proposition_2_0= ruleProposition ) )
                    // InternalRequirementsModel.g:371:4: (lv_proposition_2_0= ruleProposition )
                    {
                    // InternalRequirementsModel.g:371:4: (lv_proposition_2_0= ruleProposition )
                    // InternalRequirementsModel.g:372:5: lv_proposition_2_0= ruleProposition
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPropositionPropositionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_proposition_2_0=ruleProposition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"proposition",
                    						lv_proposition_2_0,
                    						"eu.coresense.requirements.RequirementsModel.Proposition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:390:3: ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) )
                    {
                    // InternalRequirementsModel.g:390:3: ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) )
                    // InternalRequirementsModel.g:391:4: (lv_quantifiableStatement_3_0= ruleQuantifiable )
                    {
                    // InternalRequirementsModel.g:391:4: (lv_quantifiableStatement_3_0= ruleQuantifiable )
                    // InternalRequirementsModel.g:392:5: lv_quantifiableStatement_3_0= ruleQuantifiable
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getQuantifiableStatementQuantifiableParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_quantifiableStatement_3_0=ruleQuantifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"quantifiableStatement",
                    						lv_quantifiableStatement_3_0,
                    						"eu.coresense.requirements.RequirementsModel.Quantifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:410:3: (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' )
                    {
                    // InternalRequirementsModel.g:410:3: (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' )
                    // InternalRequirementsModel.g:411:4: otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getSHALLKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRequirementsModel.g:419:4: ( (lv_statement_6_0= ruleStatement ) )
                    // InternalRequirementsModel.g:420:5: (lv_statement_6_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:420:5: (lv_statement_6_0= ruleStatement )
                    // InternalRequirementsModel.g:421:6: lv_statement_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_6_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_6_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:444:3: this_MayStatement_8= ruleMayStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMayStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MayStatement_8=ruleMayStatement();

                    state._fsp--;


                    			current = this_MayStatement_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRequirementsModel.g:453:3: (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' )
                    {
                    // InternalRequirementsModel.g:453:3: (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' )
                    // InternalRequirementsModel.g:454:4: otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getEVENTUALLYKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRequirementsModel.g:462:4: ( (lv_statement_11_0= ruleStatement ) )
                    // InternalRequirementsModel.g:463:5: (lv_statement_11_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:463:5: (lv_statement_11_0= ruleStatement )
                    // InternalRequirementsModel.g:464:6: lv_statement_11_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_11_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_11_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRequirementsModel.g:487:3: (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' )
                    {
                    // InternalRequirementsModel.g:487:3: (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' )
                    // InternalRequirementsModel.g:488:4: otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getTHISKeyword_6_0());
                    			
                    // InternalRequirementsModel.g:492:4: ( (lv_first_statement_14_0= ruleStatement ) )
                    // InternalRequirementsModel.g:493:5: (lv_first_statement_14_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:493:5: (lv_first_statement_14_0= ruleStatement )
                    // InternalRequirementsModel.g:494:6: lv_first_statement_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirst_statementStatementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_first_statement_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"first_statement",
                    							lv_first_statement_14_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getUNTILKeyword_6_2());
                    			
                    // InternalRequirementsModel.g:515:4: ( (lv_second_statement_16_0= ruleStatement ) )
                    // InternalRequirementsModel.g:516:5: (lv_second_statement_16_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:516:5: (lv_second_statement_16_0= ruleStatement )
                    // InternalRequirementsModel.g:517:6: lv_second_statement_16_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSecond_statementStatementParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_second_statement_16_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"second_statement",
                    							lv_second_statement_16_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getBEFOREKeyword_6_4());
                    			
                    // InternalRequirementsModel.g:538:4: ( (lv_event_18_0= ruleEvent ) )
                    // InternalRequirementsModel.g:539:5: (lv_event_18_0= ruleEvent )
                    {
                    // InternalRequirementsModel.g:539:5: (lv_event_18_0= ruleEvent )
                    // InternalRequirementsModel.g:540:6: lv_event_18_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_event_18_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_18_0,
                    							"eu.coresense.requirements.RequirementsModel.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_6_6());
                    			
                    // InternalRequirementsModel.g:561:4: ( (lv_statement_20_0= ruleStatement ) )
                    // InternalRequirementsModel.g:562:5: (lv_statement_20_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:562:5: (lv_statement_20_0= ruleStatement )
                    // InternalRequirementsModel.g:563:6: lv_statement_20_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_6_7_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_20_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_20_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getRightParenthesisKeyword_6_8());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRequirementsModel.g:586:3: (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' )
                    {
                    // InternalRequirementsModel.g:586:3: (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' )
                    // InternalRequirementsModel.g:587:4: otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')'
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getAFTERKeyword_7_0());
                    			
                    // InternalRequirementsModel.g:591:4: ( (lv_event_23_0= ruleEvent ) )
                    // InternalRequirementsModel.g:592:5: (lv_event_23_0= ruleEvent )
                    {
                    // InternalRequirementsModel.g:592:5: (lv_event_23_0= ruleEvent )
                    // InternalRequirementsModel.g:593:6: lv_event_23_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_event_23_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_23_0,
                    							"eu.coresense.requirements.RequirementsModel.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_7_2());
                    			
                    // InternalRequirementsModel.g:614:4: ( (lv_statement_25_0= ruleStatement ) )
                    // InternalRequirementsModel.g:615:5: (lv_statement_25_0= ruleStatement )
                    {
                    // InternalRequirementsModel.g:615:5: (lv_statement_25_0= ruleStatement )
                    // InternalRequirementsModel.g:616:6: lv_statement_25_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_25_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_25_0,
                    							"eu.coresense.requirements.RequirementsModel.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getRightParenthesisKeyword_7_4());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRequirementsModel.g:639:3: (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) )
                    {
                    // InternalRequirementsModel.g:639:3: (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) )
                    // InternalRequirementsModel.g:640:4: otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) )
                    {
                    otherlv_27=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getINKeyword_8_0());
                    			
                    // InternalRequirementsModel.g:644:4: ( (lv_t_28_0= ruleTimeInterval ) )
                    // InternalRequirementsModel.g:645:5: (lv_t_28_0= ruleTimeInterval )
                    {
                    // InternalRequirementsModel.g:645:5: (lv_t_28_0= ruleTimeInterval )
                    // InternalRequirementsModel.g:646:6: lv_t_28_0= ruleTimeInterval
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getTTimeIntervalParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_28_0=ruleTimeInterval();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_28_0,
                    							"eu.coresense.requirements.RequirementsModel.TimeInterval");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalRequirementsModel.g:665:3: this_AsCloseFreq_29= ruleAsCloseFreq
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAsCloseFreqParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsCloseFreq_29=ruleAsCloseFreq();

                    state._fsp--;


                    			current = this_AsCloseFreq_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRequirementsModel.g:674:3: this_AsCloseLit_30= ruleAsCloseLit
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAsCloseLitParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsCloseLit_30=ruleAsCloseLit();

                    state._fsp--;


                    			current = this_AsCloseLit_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRequirementsModel.g:683:3: (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' )
                    {
                    // InternalRequirementsModel.g:683:3: (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' )
                    // InternalRequirementsModel.g:684:4: otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')'
                    {
                    otherlv_31=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getStatementAccess().getASKeyword_11_0());
                    			
                    // InternalRequirementsModel.g:688:4: (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' )
                    int alt3=4;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt3=1;
                        }
                        break;
                    case 26:
                        {
                        alt3=2;
                        }
                        break;
                    case 27:
                        {
                        alt3=3;
                        }
                        break;
                    case 28:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // InternalRequirementsModel.g:689:5: otherlv_32= 'EARLY'
                            {
                            otherlv_32=(Token)match(input,25,FOLLOW_19); 

                            					newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getEARLYKeyword_11_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRequirementsModel.g:694:5: otherlv_33= 'LATE'
                            {
                            otherlv_33=(Token)match(input,26,FOLLOW_19); 

                            					newLeafNode(otherlv_33, grammarAccess.getStatementAccess().getLATEKeyword_11_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalRequirementsModel.g:699:5: otherlv_34= 'MANY'
                            {
                            otherlv_34=(Token)match(input,27,FOLLOW_19); 

                            					newLeafNode(otherlv_34, grammarAccess.getStatementAccess().getMANYKeyword_11_1_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalRequirementsModel.g:704:5: otherlv_35= 'FEW'
                            {
                            otherlv_35=(Token)match(input,28,FOLLOW_19); 

                            					newLeafNode(otherlv_35, grammarAccess.getStatementAccess().getFEWKeyword_11_1_3());
                            				

                            }
                            break;

                    }

                    otherlv_36=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_36, grammarAccess.getStatementAccess().getASKeyword_11_2());
                    			
                    otherlv_37=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_37, grammarAccess.getStatementAccess().getPOSSIBLEKeyword_11_3());
                    			
                    otherlv_38=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_38, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_11_4());
                    			
                    // InternalRequirementsModel.g:721:4: ( (lv_statement_39_0= ruleQuantifiable ) )
                    // InternalRequirementsModel.g:722:5: (lv_statement_39_0= ruleQuantifiable )
                    {
                    // InternalRequirementsModel.g:722:5: (lv_statement_39_0= ruleQuantifiable )
                    // InternalRequirementsModel.g:723:6: lv_statement_39_0= ruleQuantifiable
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementQuantifiableParserRuleCall_11_5_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_39_0=ruleQuantifiable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_39_0,
                    							"eu.coresense.requirements.RequirementsModel.Quantifiable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getStatementAccess().getRightParenthesisKeyword_11_6());
                    			

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAsCloseFreq"
    // InternalRequirementsModel.g:749:1: entryRuleAsCloseFreq returns [EObject current=null] : iv_ruleAsCloseFreq= ruleAsCloseFreq EOF ;
    public final EObject entryRuleAsCloseFreq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseFreq = null;


        try {
            // InternalRequirementsModel.g:749:52: (iv_ruleAsCloseFreq= ruleAsCloseFreq EOF )
            // InternalRequirementsModel.g:750:2: iv_ruleAsCloseFreq= ruleAsCloseFreq EOF
            {
             newCompositeNode(grammarAccess.getAsCloseFreqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsCloseFreq=ruleAsCloseFreq();

            state._fsp--;

             current =iv_ruleAsCloseFreq; 
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
    // $ANTLR end "entryRuleAsCloseFreq"


    // $ANTLR start "ruleAsCloseFreq"
    // InternalRequirementsModel.g:756:1: ruleAsCloseFreq returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_f_6_0= ruleTime ) ) ( (lv_statement_7_0= ruleStatement ) ) otherlv_8= ')' ) ;
    public final EObject ruleAsCloseFreq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_f_6_0 = null;

        EObject lv_statement_7_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:762:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_f_6_0= ruleTime ) ) ( (lv_statement_7_0= ruleStatement ) ) otherlv_8= ')' ) )
            // InternalRequirementsModel.g:763:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_f_6_0= ruleTime ) ) ( (lv_statement_7_0= ruleStatement ) ) otherlv_8= ')' )
            {
            // InternalRequirementsModel.g:763:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_f_6_0= ruleTime ) ) ( (lv_statement_7_0= ruleStatement ) ) otherlv_8= ')' )
            // InternalRequirementsModel.g:764:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_f_6_0= ruleTime ) ) ( (lv_statement_7_0= ruleStatement ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseFreqAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseFreqAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseFreqAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseFreqAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseFreqAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseFreqAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:788:3: ( (lv_f_6_0= ruleTime ) )
            // InternalRequirementsModel.g:789:4: (lv_f_6_0= ruleTime )
            {
            // InternalRequirementsModel.g:789:4: (lv_f_6_0= ruleTime )
            // InternalRequirementsModel.g:790:5: lv_f_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getFTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_f_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseFreqRule());
            					}
            					set(
            						current,
            						"f",
            						lv_f_6_0,
            						"eu.coresense.requirements.RequirementsModel.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsModel.g:807:3: ( (lv_statement_7_0= ruleStatement ) )
            // InternalRequirementsModel.g:808:4: (lv_statement_7_0= ruleStatement )
            {
            // InternalRequirementsModel.g:808:4: (lv_statement_7_0= ruleStatement )
            // InternalRequirementsModel.g:809:5: lv_statement_7_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getStatementStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_statement_7_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseFreqRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_7_0,
            						"eu.coresense.requirements.RequirementsModel.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAsCloseFreqAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleAsCloseFreq"


    // $ANTLR start "entryRuleAsCloseLit"
    // InternalRequirementsModel.g:834:1: entryRuleAsCloseLit returns [EObject current=null] : iv_ruleAsCloseLit= ruleAsCloseLit EOF ;
    public final EObject entryRuleAsCloseLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseLit = null;


        try {
            // InternalRequirementsModel.g:834:51: (iv_ruleAsCloseLit= ruleAsCloseLit EOF )
            // InternalRequirementsModel.g:835:2: iv_ruleAsCloseLit= ruleAsCloseLit EOF
            {
             newCompositeNode(grammarAccess.getAsCloseLitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsCloseLit=ruleAsCloseLit();

            state._fsp--;

             current =iv_ruleAsCloseLit; 
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
    // $ANTLR end "entryRuleAsCloseLit"


    // $ANTLR start "ruleAsCloseLit"
    // InternalRequirementsModel.g:841:1: ruleAsCloseLit returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_q_6_0= ruleLiteral ) ) ( (lv_comparator_7_0= ruleQuantifiable ) ) otherlv_8= ')' ) ;
    public final EObject ruleAsCloseLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_q_6_0 = null;

        EObject lv_comparator_7_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:847:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_q_6_0= ruleLiteral ) ) ( (lv_comparator_7_0= ruleQuantifiable ) ) otherlv_8= ')' ) )
            // InternalRequirementsModel.g:848:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_q_6_0= ruleLiteral ) ) ( (lv_comparator_7_0= ruleQuantifiable ) ) otherlv_8= ')' )
            {
            // InternalRequirementsModel.g:848:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_q_6_0= ruleLiteral ) ) ( (lv_comparator_7_0= ruleQuantifiable ) ) otherlv_8= ')' )
            // InternalRequirementsModel.g:849:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_q_6_0= ruleLiteral ) ) ( (lv_comparator_7_0= ruleQuantifiable ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseLitAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseLitAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseLitAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseLitAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseLitAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseLitAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:873:3: ( (lv_q_6_0= ruleLiteral ) )
            // InternalRequirementsModel.g:874:4: (lv_q_6_0= ruleLiteral )
            {
            // InternalRequirementsModel.g:874:4: (lv_q_6_0= ruleLiteral )
            // InternalRequirementsModel.g:875:5: lv_q_6_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getQLiteralParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_q_6_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseLitRule());
            					}
            					set(
            						current,
            						"q",
            						lv_q_6_0,
            						"eu.coresense.requirements.RequirementsModel.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsModel.g:892:3: ( (lv_comparator_7_0= ruleQuantifiable ) )
            // InternalRequirementsModel.g:893:4: (lv_comparator_7_0= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:893:4: (lv_comparator_7_0= ruleQuantifiable )
            // InternalRequirementsModel.g:894:5: lv_comparator_7_0= ruleQuantifiable
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getComparatorQuantifiableParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_comparator_7_0=ruleQuantifiable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseLitRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_7_0,
            						"eu.coresense.requirements.RequirementsModel.Quantifiable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAsCloseLitAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleAsCloseLit"


    // $ANTLR start "entryRuleQuantifiable"
    // InternalRequirementsModel.g:919:1: entryRuleQuantifiable returns [EObject current=null] : iv_ruleQuantifiable= ruleQuantifiable EOF ;
    public final EObject entryRuleQuantifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiable = null;


        try {
            // InternalRequirementsModel.g:919:53: (iv_ruleQuantifiable= ruleQuantifiable EOF )
            // InternalRequirementsModel.g:920:2: iv_ruleQuantifiable= ruleQuantifiable EOF
            {
             newCompositeNode(grammarAccess.getQuantifiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantifiable=ruleQuantifiable();

            state._fsp--;

             current =iv_ruleQuantifiable; 
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
    // $ANTLR end "entryRuleQuantifiable"


    // $ANTLR start "ruleQuantifiable"
    // InternalRequirementsModel.g:926:1: ruleQuantifiable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleQuantifiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:932:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRequirementsModel.g:933:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRequirementsModel.g:933:2: ( (otherlv_0= RULE_ID ) )
            // InternalRequirementsModel.g:934:3: (otherlv_0= RULE_ID )
            {
            // InternalRequirementsModel.g:934:3: (otherlv_0= RULE_ID )
            // InternalRequirementsModel.g:935:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQuantifiableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getQuantifiableAccess().getVarContextVarCrossReference_0());
            			

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
    // $ANTLR end "ruleQuantifiable"


    // $ANTLR start "entryRuleMayStatement"
    // InternalRequirementsModel.g:949:1: entryRuleMayStatement returns [EObject current=null] : iv_ruleMayStatement= ruleMayStatement EOF ;
    public final EObject entryRuleMayStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMayStatement = null;


        try {
            // InternalRequirementsModel.g:949:53: (iv_ruleMayStatement= ruleMayStatement EOF )
            // InternalRequirementsModel.g:950:2: iv_ruleMayStatement= ruleMayStatement EOF
            {
             newCompositeNode(grammarAccess.getMayStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMayStatement=ruleMayStatement();

            state._fsp--;

             current =iv_ruleMayStatement; 
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
    // $ANTLR end "entryRuleMayStatement"


    // $ANTLR start "ruleMayStatement"
    // InternalRequirementsModel.g:956:1: ruleMayStatement returns [EObject current=null] : (otherlv_0= 'MAY' ( (lv_statements_1_0= ruleAtomicStatement ) ) (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+ ) ;
    public final EObject ruleMayStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_statements_1_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:962:2: ( (otherlv_0= 'MAY' ( (lv_statements_1_0= ruleAtomicStatement ) ) (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+ ) )
            // InternalRequirementsModel.g:963:2: (otherlv_0= 'MAY' ( (lv_statements_1_0= ruleAtomicStatement ) ) (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+ )
            {
            // InternalRequirementsModel.g:963:2: (otherlv_0= 'MAY' ( (lv_statements_1_0= ruleAtomicStatement ) ) (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+ )
            // InternalRequirementsModel.g:964:3: otherlv_0= 'MAY' ( (lv_statements_1_0= ruleAtomicStatement ) ) (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMayStatementAccess().getMAYKeyword_0());
            		
            // InternalRequirementsModel.g:968:3: ( (lv_statements_1_0= ruleAtomicStatement ) )
            // InternalRequirementsModel.g:969:4: (lv_statements_1_0= ruleAtomicStatement )
            {
            // InternalRequirementsModel.g:969:4: (lv_statements_1_0= ruleAtomicStatement )
            // InternalRequirementsModel.g:970:5: lv_statements_1_0= ruleAtomicStatement
            {

            					newCompositeNode(grammarAccess.getMayStatementAccess().getStatementsAtomicStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_statements_1_0=ruleAtomicStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMayStatementRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_1_0,
            						"eu.coresense.requirements.RequirementsModel.AtomicStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsModel.g:987:3: (otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRequirementsModel.g:988:4: otherlv_2= 'OR' otherlv_3= 'MAY' ( (lv_statements_4_0= ruleAtomicStatement ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMayStatementAccess().getORKeyword_2_0());
            	    			
            	    otherlv_3=(Token)match(input,32,FOLLOW_23); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMayStatementAccess().getMAYKeyword_2_1());
            	    			
            	    // InternalRequirementsModel.g:996:4: ( (lv_statements_4_0= ruleAtomicStatement ) )
            	    // InternalRequirementsModel.g:997:5: (lv_statements_4_0= ruleAtomicStatement )
            	    {
            	    // InternalRequirementsModel.g:997:5: (lv_statements_4_0= ruleAtomicStatement )
            	    // InternalRequirementsModel.g:998:6: lv_statements_4_0= ruleAtomicStatement
            	    {

            	    						newCompositeNode(grammarAccess.getMayStatementAccess().getStatementsAtomicStatementParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_statements_4_0=ruleAtomicStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMayStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_4_0,
            	    							"eu.coresense.requirements.RequirementsModel.AtomicStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleMayStatement"


    // $ANTLR start "entryRuleAtomicStatement"
    // InternalRequirementsModel.g:1020:1: entryRuleAtomicStatement returns [EObject current=null] : iv_ruleAtomicStatement= ruleAtomicStatement EOF ;
    public final EObject entryRuleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStatement = null;


        try {
            // InternalRequirementsModel.g:1020:56: (iv_ruleAtomicStatement= ruleAtomicStatement EOF )
            // InternalRequirementsModel.g:1021:2: iv_ruleAtomicStatement= ruleAtomicStatement EOF
            {
             newCompositeNode(grammarAccess.getAtomicStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicStatement=ruleAtomicStatement();

            state._fsp--;

             current =iv_ruleAtomicStatement; 
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
    // $ANTLR end "entryRuleAtomicStatement"


    // $ANTLR start "ruleAtomicStatement"
    // InternalRequirementsModel.g:1027:1: ruleAtomicStatement returns [EObject current=null] : ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) ) ;
    public final EObject ruleAtomicStatement() throws RecognitionException {
        EObject current = null;

        Token this_BOOLEAN_1=null;
        EObject lv_proposition_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1033:2: ( ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) ) )
            // InternalRequirementsModel.g:1034:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) )
            {
            // InternalRequirementsModel.g:1034:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BOOLEAN) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRequirementsModel.g:1035:3: ( () this_BOOLEAN_1= RULE_BOOLEAN )
                    {
                    // InternalRequirementsModel.g:1035:3: ( () this_BOOLEAN_1= RULE_BOOLEAN )
                    // InternalRequirementsModel.g:1036:4: () this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    // InternalRequirementsModel.g:1036:4: ()
                    // InternalRequirementsModel.g:1037:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicStatementAccess().getStatementAction_0_0(),
                    						current);
                    				

                    }

                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    				newLeafNode(this_BOOLEAN_1, grammarAccess.getAtomicStatementAccess().getBOOLEANTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1049:3: ( (lv_proposition_2_0= ruleProposition ) )
                    {
                    // InternalRequirementsModel.g:1049:3: ( (lv_proposition_2_0= ruleProposition ) )
                    // InternalRequirementsModel.g:1050:4: (lv_proposition_2_0= ruleProposition )
                    {
                    // InternalRequirementsModel.g:1050:4: (lv_proposition_2_0= ruleProposition )
                    // InternalRequirementsModel.g:1051:5: lv_proposition_2_0= ruleProposition
                    {

                    					newCompositeNode(grammarAccess.getAtomicStatementAccess().getPropositionPropositionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_proposition_2_0=ruleProposition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomicStatementRule());
                    					}
                    					set(
                    						current,
                    						"proposition",
                    						lv_proposition_2_0,
                    						"eu.coresense.requirements.RequirementsModel.Proposition");
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
    // $ANTLR end "ruleAtomicStatement"


    // $ANTLR start "entryRuleEvent"
    // InternalRequirementsModel.g:1072:1: entryRuleEvent returns [String current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final String entryRuleEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEvent = null;


        try {
            // InternalRequirementsModel.g:1072:45: (iv_ruleEvent= ruleEvent EOF )
            // InternalRequirementsModel.g:1073:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent.getText(); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRequirementsModel.g:1079:1: ruleEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1085:2: (this_STRING_0= RULE_STRING )
            // InternalRequirementsModel.g:1086:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEventAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalRequirementsModel.g:1096:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalRequirementsModel.g:1096:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalRequirementsModel.g:1097:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalRequirementsModel.g:1103:1: ruleTimeInterval returns [EObject current=null] : ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_after_0_0 = null;

        EObject lv_before_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1109:2: ( ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) )
            // InternalRequirementsModel.g:1110:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            {
            // InternalRequirementsModel.g:1110:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            // InternalRequirementsModel.g:1111:3: ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) )
            {
            // InternalRequirementsModel.g:1111:3: ( (lv_after_0_0= ruleTime ) )
            // InternalRequirementsModel.g:1112:4: (lv_after_0_0= ruleTime )
            {
            // InternalRequirementsModel.g:1112:4: (lv_after_0_0= ruleTime )
            // InternalRequirementsModel.g:1113:5: lv_after_0_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getAfterTimeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_after_0_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
            					}
            					set(
            						current,
            						"after",
            						lv_after_0_0,
            						"eu.coresense.requirements.RequirementsModel.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getHyphenMinusKeyword_1());
            		
            // InternalRequirementsModel.g:1134:3: ( (lv_before_2_0= ruleTime ) )
            // InternalRequirementsModel.g:1135:4: (lv_before_2_0= ruleTime )
            {
            // InternalRequirementsModel.g:1135:4: (lv_before_2_0= ruleTime )
            // InternalRequirementsModel.g:1136:5: lv_before_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getBeforeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_before_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
            					}
            					set(
            						current,
            						"before",
            						lv_before_2_0,
            						"eu.coresense.requirements.RequirementsModel.Time");
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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleTime"
    // InternalRequirementsModel.g:1157:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRequirementsModel.g:1157:45: (iv_ruleTime= ruleTime EOF )
            // InternalRequirementsModel.g:1158:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalRequirementsModel.g:1164:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1170:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) )
            // InternalRequirementsModel.g:1171:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            {
            // InternalRequirementsModel.g:1171:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            // InternalRequirementsModel.g:1172:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            {
            // InternalRequirementsModel.g:1172:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:1173:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:1173:4: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:1174:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTimeAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRequirementsModel.g:1190:3: (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRequirementsModel.g:1191:4: otherlv_1= 'hr'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getHrKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1196:4: otherlv_2= 'min'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getMinKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1201:4: otherlv_3= 's'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getSKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1206:4: otherlv_4= 'ms'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getMsKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:1211:4: otherlv_5= 'ns'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeAccess().getNsKeyword_1_4());
                    			

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleLiteral"
    // InternalRequirementsModel.g:1220:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRequirementsModel.g:1220:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRequirementsModel.g:1221:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalRequirementsModel.g:1227:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1233:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalRequirementsModel.g:1234:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalRequirementsModel.g:1234:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRequirementsModel.g:1235:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalRequirementsModel.g:1244:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalRequirementsModel.g:1253:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalRequirementsModel.g:1262:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalRequirementsModel.g:1274:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalRequirementsModel.g:1274:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalRequirementsModel.g:1275:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalRequirementsModel.g:1281:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1287:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRequirementsModel.g:1288:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRequirementsModel.g:1288:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:1289:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:1289:3: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:1290:4: lv_value_0_0= RULE_INT
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
    // InternalRequirementsModel.g:1309:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalRequirementsModel.g:1309:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalRequirementsModel.g:1310:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalRequirementsModel.g:1316:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1322:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalRequirementsModel.g:1323:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalRequirementsModel.g:1323:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1324:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1324:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1325:4: lv_value_0_0= RULE_DECIMAL
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
            					"eu.coresense.requirements.RequirementsModel.DECIMAL");
            			

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
    // InternalRequirementsModel.g:1344:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalRequirementsModel.g:1344:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalRequirementsModel.g:1345:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalRequirementsModel.g:1351:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1357:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRequirementsModel.g:1358:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRequirementsModel.g:1358:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRequirementsModel.g:1359:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:1359:3: (lv_value_0_0= RULE_STRING )
            // InternalRequirementsModel.g:1360:4: lv_value_0_0= RULE_STRING
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
    // InternalRequirementsModel.g:1379:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalRequirementsModel.g:1379:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalRequirementsModel.g:1380:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalRequirementsModel.g:1386:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1392:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRequirementsModel.g:1393:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRequirementsModel.g:1393:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRequirementsModel.g:1394:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRequirementsModel.g:1394:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRequirementsModel.g:1395:4: lv_value_0_0= RULE_BOOLEAN
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
            					"eu.coresense.requirements.RequirementsModel.BOOLEAN");
            			

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


    // $ANTLR start "ruleQualityAttribute"
    // InternalRequirementsModel.g:1414:1: ruleQualityAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) ;
    public final Enumerator ruleQualityAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1420:2: ( ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) )
            // InternalRequirementsModel.g:1421:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            {
            // InternalRequirementsModel.g:1421:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            case 45:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 47:
                {
                alt9=8;
                }
                break;
            case 48:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRequirementsModel.g:1422:3: (enumLiteral_0= 'Functional suitability' )
                    {
                    // InternalRequirementsModel.g:1422:3: (enumLiteral_0= 'Functional suitability' )
                    // InternalRequirementsModel.g:1423:4: enumLiteral_0= 'Functional suitability'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1430:3: (enumLiteral_1= 'Performance efficiency' )
                    {
                    // InternalRequirementsModel.g:1430:3: (enumLiteral_1= 'Performance efficiency' )
                    // InternalRequirementsModel.g:1431:4: enumLiteral_1= 'Performance efficiency'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1438:3: (enumLiteral_2= 'Compatibility' )
                    {
                    // InternalRequirementsModel.g:1438:3: (enumLiteral_2= 'Compatibility' )
                    // InternalRequirementsModel.g:1439:4: enumLiteral_2= 'Compatibility'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1446:3: (enumLiteral_3= 'Interaction capability' )
                    {
                    // InternalRequirementsModel.g:1446:3: (enumLiteral_3= 'Interaction capability' )
                    // InternalRequirementsModel.g:1447:4: enumLiteral_3= 'Interaction capability'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:1454:3: (enumLiteral_4= 'Reliability' )
                    {
                    // InternalRequirementsModel.g:1454:3: (enumLiteral_4= 'Reliability' )
                    // InternalRequirementsModel.g:1455:4: enumLiteral_4= 'Reliability'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRequirementsModel.g:1462:3: (enumLiteral_5= 'Security' )
                    {
                    // InternalRequirementsModel.g:1462:3: (enumLiteral_5= 'Security' )
                    // InternalRequirementsModel.g:1463:4: enumLiteral_5= 'Security'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRequirementsModel.g:1470:3: (enumLiteral_6= 'Maintainability' )
                    {
                    // InternalRequirementsModel.g:1470:3: (enumLiteral_6= 'Maintainability' )
                    // InternalRequirementsModel.g:1471:4: enumLiteral_6= 'Maintainability'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRequirementsModel.g:1478:3: (enumLiteral_7= 'Flexibility' )
                    {
                    // InternalRequirementsModel.g:1478:3: (enumLiteral_7= 'Flexibility' )
                    // InternalRequirementsModel.g:1479:4: enumLiteral_7= 'Flexibility'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRequirementsModel.g:1486:3: (enumLiteral_8= 'Safety' )
                    {
                    // InternalRequirementsModel.g:1486:3: (enumLiteral_8= 'Safety' )
                    // InternalRequirementsModel.g:1487:4: enumLiteral_8= 'Safety'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getSAFETYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getQualityAttributeAccess().getSAFETYEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleQualityAttribute"


    // $ANTLR start "ruleMathOperator"
    // InternalRequirementsModel.g:1497:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1503:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // InternalRequirementsModel.g:1504:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // InternalRequirementsModel.g:1504:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRequirementsModel.g:1505:3: (enumLiteral_0= '<' )
                    {
                    // InternalRequirementsModel.g:1505:3: (enumLiteral_0= '<' )
                    // InternalRequirementsModel.g:1506:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1513:3: (enumLiteral_1= '>' )
                    {
                    // InternalRequirementsModel.g:1513:3: (enumLiteral_1= '>' )
                    // InternalRequirementsModel.g:1514:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1521:3: (enumLiteral_2= '==' )
                    {
                    // InternalRequirementsModel.g:1521:3: (enumLiteral_2= '==' )
                    // InternalRequirementsModel.g:1522:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1529:3: (enumLiteral_3= '<>' )
                    {
                    // InternalRequirementsModel.g:1529:3: (enumLiteral_3= '<>' )
                    // InternalRequirementsModel.g:1530:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

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
    // InternalRequirementsModel.g:1540:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1546:2: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalRequirementsModel.g:1547:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalRequirementsModel.g:1547:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==54) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRequirementsModel.g:1548:3: (enumLiteral_0= '&&' )
                    {
                    // InternalRequirementsModel.g:1548:3: (enumLiteral_0= '&&' )
                    // InternalRequirementsModel.g:1549:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1556:3: (enumLiteral_1= '||' )
                    {
                    // InternalRequirementsModel.g:1556:3: (enumLiteral_1= '||' )
                    // InternalRequirementsModel.g:1557:4: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\2\uffff\1\13\22\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\6\uffff\1\31\3\uffff\1\30\1\35\1\37\1\20\1\5\1\4\2\uffff";
    static final String dfa_4s = "\1\40\1\uffff\1\64\6\uffff\1\36\3\uffff\1\30\1\35\1\37\1\20\1\10\1\47\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\2\1\3\1\14\6\uffff\1\13\1\12";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\1\10\uffff\1\3\2\uffff\1\5\1\6\2\uffff\1\7\1\10\1\11\7\uffff\1\4",
            "",
            "\1\13\14\uffff\1\13\2\uffff\2\13\33\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\14\1\uffff\1\15",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\2\23\1\22\1\23",
            "\1\23\36\uffff\5\24",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "355:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) | ( (lv_proposition_2_0= ruleProposition ) ) | ( (lv_quantifiableStatement_3_0= ruleQuantifiable ) ) | (otherlv_4= 'SHALL' otherlv_5= '(' ( (lv_statement_6_0= ruleStatement ) ) otherlv_7= ')' ) | this_MayStatement_8= ruleMayStatement | (otherlv_9= 'EVENTUALLY' otherlv_10= '(' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= ')' ) | (otherlv_13= 'THIS' ( (lv_first_statement_14_0= ruleStatement ) ) otherlv_15= 'UNTIL' ( (lv_second_statement_16_0= ruleStatement ) ) otherlv_17= 'BEFORE' ( (lv_event_18_0= ruleEvent ) ) otherlv_19= '(' ( (lv_statement_20_0= ruleStatement ) ) otherlv_21= ')' ) | (otherlv_22= 'AFTER' ( (lv_event_23_0= ruleEvent ) ) otherlv_24= '(' ( (lv_statement_25_0= ruleStatement ) ) otherlv_26= ')' ) | (otherlv_27= 'IN' ( (lv_t_28_0= ruleTimeInterval ) ) ) | this_AsCloseFreq_29= ruleAsCloseFreq | this_AsCloseLit_30= ruleAsCloseLit | (otherlv_31= 'AS' (otherlv_32= 'EARLY' | otherlv_33= 'LATE' | otherlv_34= 'MANY' | otherlv_35= 'FEW' ) otherlv_36= 'AS' otherlv_37= 'POSSIBLE' otherlv_38= '(' ( (lv_statement_39_0= ruleQuantifiable ) ) otherlv_40= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000101CC8050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000F800000000L});

}