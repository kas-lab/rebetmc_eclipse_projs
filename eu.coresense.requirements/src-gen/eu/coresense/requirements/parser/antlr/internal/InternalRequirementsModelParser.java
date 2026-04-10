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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "':'", "'AND'", "'('", "')'", "'OR'", "'SHALL'", "'NOT'", "'EVENTUALLY'", "'THIS'", "'UNTIL'", "'BEFORE'", "'AFTER'", "'IN'", "'AS'", "'POSSIBLE'", "'CLOSE'", "'TO'", "'^'", "'MAY'", "'-'", "'hr'", "'min'", "'s'", "'ms'", "'ns'", "'Functional suitability'", "'Performance efficiency'", "'Compatibility'", "'Interaction capability'", "'Reliability'", "'Security'", "'Maintainability'", "'Flexibility'", "'Safety'", "'<'", "'>'", "'=='", "'<>'", "'&&'", "'||'", "'EARLY'", "'LATE'", "'MANY'", "'FEW'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
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
    // InternalRequirementsModel.g:108:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_naturalLanguageDescription_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_qa_2_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:114:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalRequirementsModel.g:115:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalRequirementsModel.g:115:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalRequirementsModel.g:116:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_qa_2_0= ruleQualityAttribute ) ) otherlv_3= ':' ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) )
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
            		
            // InternalRequirementsModel.g:161:3: ( (lv_naturalLanguageDescription_4_0= RULE_STRING ) )
            // InternalRequirementsModel.g:162:4: (lv_naturalLanguageDescription_4_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:162:4: (lv_naturalLanguageDescription_4_0= RULE_STRING )
            // InternalRequirementsModel.g:163:5: lv_naturalLanguageDescription_4_0= RULE_STRING
            {
            lv_naturalLanguageDescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_naturalLanguageDescription_4_0, grammarAccess.getRequirementAccess().getNaturalLanguageDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"naturalLanguageDescription",
            						lv_naturalLanguageDescription_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCommaKeyword_5());
            		
            // InternalRequirementsModel.g:183:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalRequirementsModel.g:184:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalRequirementsModel.g:184:4: (lv_expression_6_0= ruleExpression )
            // InternalRequirementsModel.g:185:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
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

            if ( ((LA2_0>=52 && LA2_0<=53)) ) {
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
    // InternalRequirementsModel.g:323:1: ruleProposition returns [EObject current=null] : ( (lv_condition_0_0= ruleCondition ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:329:2: ( ( (lv_condition_0_0= ruleCondition ) ) )
            // InternalRequirementsModel.g:330:2: ( (lv_condition_0_0= ruleCondition ) )
            {
            // InternalRequirementsModel.g:330:2: ( (lv_condition_0_0= ruleCondition ) )
            // InternalRequirementsModel.g:331:3: (lv_condition_0_0= ruleCondition )
            {
            // InternalRequirementsModel.g:331:3: (lv_condition_0_0= ruleCondition )
            // InternalRequirementsModel.g:332:4: lv_condition_0_0= ruleCondition
            {

            				newCompositeNode(grammarAccess.getPropositionAccess().getConditionConditionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPropositionRule());
            				}
            				set(
            					current,
            					"condition",
            					lv_condition_0_0,
            					"eu.coresense.requirements.RequirementsModel.Condition");
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
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleBooleanStatement"
    // InternalRequirementsModel.g:352:1: entryRuleBooleanStatement returns [EObject current=null] : iv_ruleBooleanStatement= ruleBooleanStatement EOF ;
    public final EObject entryRuleBooleanStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanStatement = null;


        try {
            // InternalRequirementsModel.g:352:57: (iv_ruleBooleanStatement= ruleBooleanStatement EOF )
            // InternalRequirementsModel.g:353:2: iv_ruleBooleanStatement= ruleBooleanStatement EOF
            {
             newCompositeNode(grammarAccess.getBooleanStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanStatement=ruleBooleanStatement();

            state._fsp--;

             current =iv_ruleBooleanStatement; 
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
    // $ANTLR end "entryRuleBooleanStatement"


    // $ANTLR start "ruleBooleanStatement"
    // InternalRequirementsModel.g:359:1: ruleBooleanStatement returns [EObject current=null] : ( (lv_booleanValue_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanStatement() throws RecognitionException {
        EObject current = null;

        Token lv_booleanValue_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:365:2: ( ( (lv_booleanValue_0_0= RULE_BOOLEAN ) ) )
            // InternalRequirementsModel.g:366:2: ( (lv_booleanValue_0_0= RULE_BOOLEAN ) )
            {
            // InternalRequirementsModel.g:366:2: ( (lv_booleanValue_0_0= RULE_BOOLEAN ) )
            // InternalRequirementsModel.g:367:3: (lv_booleanValue_0_0= RULE_BOOLEAN )
            {
            // InternalRequirementsModel.g:367:3: (lv_booleanValue_0_0= RULE_BOOLEAN )
            // InternalRequirementsModel.g:368:4: lv_booleanValue_0_0= RULE_BOOLEAN
            {
            lv_booleanValue_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_booleanValue_0_0, grammarAccess.getBooleanStatementAccess().getBooleanValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanStatementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"booleanValue",
            					lv_booleanValue_0_0,
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
    // $ANTLR end "ruleBooleanStatement"


    // $ANTLR start "entryRuleAnd"
    // InternalRequirementsModel.g:387:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRequirementsModel.g:387:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRequirementsModel.g:388:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalRequirementsModel.g:394:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_leftExpression_2_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:400:2: ( (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:401:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:401:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:402:3: otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getANDKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:410:3: ( (lv_leftExpression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:411:4: (lv_leftExpression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:411:4: (lv_leftExpression_2_0= ruleExpression )
            // InternalRequirementsModel.g:412:5: lv_leftExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_leftExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"leftExpression",
            						lv_leftExpression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAndAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:433:3: ( (lv_rightExpression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:434:4: (lv_rightExpression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:434:4: (lv_rightExpression_4_0= ruleExpression )
            // InternalRequirementsModel.g:435:5: lv_rightExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_rightExpression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"rightExpression",
            						lv_rightExpression_4_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAndAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalRequirementsModel.g:460:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRequirementsModel.g:460:43: (iv_ruleOr= ruleOr EOF )
            // InternalRequirementsModel.g:461:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalRequirementsModel.g:467:1: ruleOr returns [EObject current=null] : (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_leftExpression_2_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:473:2: ( (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:474:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:474:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:475:3: otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getORKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:483:3: ( (lv_leftExpression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:484:4: (lv_leftExpression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:484:4: (lv_leftExpression_2_0= ruleExpression )
            // InternalRequirementsModel.g:485:5: lv_leftExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getLeftExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_leftExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"leftExpression",
            						lv_leftExpression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getOrAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:506:3: ( (lv_rightExpression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:507:4: (lv_rightExpression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:507:4: (lv_rightExpression_4_0= ruleExpression )
            // InternalRequirementsModel.g:508:5: lv_rightExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getRightExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_rightExpression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"rightExpression",
            						lv_rightExpression_4_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOrAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleShall"
    // InternalRequirementsModel.g:533:1: entryRuleShall returns [EObject current=null] : iv_ruleShall= ruleShall EOF ;
    public final EObject entryRuleShall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShall = null;


        try {
            // InternalRequirementsModel.g:533:46: (iv_ruleShall= ruleShall EOF )
            // InternalRequirementsModel.g:534:2: iv_ruleShall= ruleShall EOF
            {
             newCompositeNode(grammarAccess.getShallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShall=ruleShall();

            state._fsp--;

             current =iv_ruleShall; 
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
    // $ANTLR end "entryRuleShall"


    // $ANTLR start "ruleShall"
    // InternalRequirementsModel.g:540:1: ruleShall returns [EObject current=null] : (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleShall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:546:2: ( (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:547:2: (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:547:2: (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:548:3: otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getShallAccess().getSHALLKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getShallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:556:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:557:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:557:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:558:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getShallAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShallRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getShallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleShall"


    // $ANTLR start "entryRuleNegation"
    // InternalRequirementsModel.g:583:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalRequirementsModel.g:583:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalRequirementsModel.g:584:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalRequirementsModel.g:590:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:596:2: ( (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:597:2: (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:597:2: (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:598:3: otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNOTKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:606:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:607:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:607:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:608:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNegationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleEventually"
    // InternalRequirementsModel.g:633:1: entryRuleEventually returns [EObject current=null] : iv_ruleEventually= ruleEventually EOF ;
    public final EObject entryRuleEventually() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventually = null;


        try {
            // InternalRequirementsModel.g:633:51: (iv_ruleEventually= ruleEventually EOF )
            // InternalRequirementsModel.g:634:2: iv_ruleEventually= ruleEventually EOF
            {
             newCompositeNode(grammarAccess.getEventuallyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventually=ruleEventually();

            state._fsp--;

             current =iv_ruleEventually; 
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
    // $ANTLR end "entryRuleEventually"


    // $ANTLR start "ruleEventually"
    // InternalRequirementsModel.g:640:1: ruleEventually returns [EObject current=null] : (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEventually() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:646:2: ( (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:647:2: (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:647:2: (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:648:3: otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEventuallyAccess().getEVENTUALLYKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEventuallyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:656:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:657:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:657:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:658:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEventuallyAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventuallyRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEventuallyAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEventually"


    // $ANTLR start "entryRuleThisUntil"
    // InternalRequirementsModel.g:683:1: entryRuleThisUntil returns [EObject current=null] : iv_ruleThisUntil= ruleThisUntil EOF ;
    public final EObject entryRuleThisUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisUntil = null;


        try {
            // InternalRequirementsModel.g:683:50: (iv_ruleThisUntil= ruleThisUntil EOF )
            // InternalRequirementsModel.g:684:2: iv_ruleThisUntil= ruleThisUntil EOF
            {
             newCompositeNode(grammarAccess.getThisUntilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThisUntil=ruleThisUntil();

            state._fsp--;

             current =iv_ruleThisUntil; 
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
    // $ANTLR end "entryRuleThisUntil"


    // $ANTLR start "ruleThisUntil"
    // InternalRequirementsModel.g:690:1: ruleThisUntil returns [EObject current=null] : (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleThisUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_leftExpression_1_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:696:2: ( (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) ) )
            // InternalRequirementsModel.g:697:2: (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) )
            {
            // InternalRequirementsModel.g:697:2: (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) )
            // InternalRequirementsModel.g:698:3: otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getThisUntilAccess().getTHISKeyword_0());
            		
            // InternalRequirementsModel.g:702:3: ( (lv_leftExpression_1_0= ruleExpression ) )
            // InternalRequirementsModel.g:703:4: (lv_leftExpression_1_0= ruleExpression )
            {
            // InternalRequirementsModel.g:703:4: (lv_leftExpression_1_0= ruleExpression )
            // InternalRequirementsModel.g:704:5: lv_leftExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getThisUntilAccess().getLeftExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_leftExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThisUntilRule());
            					}
            					set(
            						current,
            						"leftExpression",
            						lv_leftExpression_1_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getThisUntilAccess().getUNTILKeyword_2());
            		
            // InternalRequirementsModel.g:725:3: ( (lv_rightExpression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:726:4: (lv_rightExpression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:726:4: (lv_rightExpression_3_0= ruleExpression )
            // InternalRequirementsModel.g:727:5: lv_rightExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getThisUntilAccess().getRightExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThisUntilRule());
            					}
            					set(
            						current,
            						"rightExpression",
            						lv_rightExpression_3_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
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
    // $ANTLR end "ruleThisUntil"


    // $ANTLR start "entryRuleBefore"
    // InternalRequirementsModel.g:748:1: entryRuleBefore returns [EObject current=null] : iv_ruleBefore= ruleBefore EOF ;
    public final EObject entryRuleBefore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBefore = null;


        try {
            // InternalRequirementsModel.g:748:47: (iv_ruleBefore= ruleBefore EOF )
            // InternalRequirementsModel.g:749:2: iv_ruleBefore= ruleBefore EOF
            {
             newCompositeNode(grammarAccess.getBeforeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBefore=ruleBefore();

            state._fsp--;

             current =iv_ruleBefore; 
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
    // $ANTLR end "entryRuleBefore"


    // $ANTLR start "ruleBefore"
    // InternalRequirementsModel.g:755:1: ruleBefore returns [EObject current=null] : (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBefore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_event_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:761:2: ( (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalRequirementsModel.g:762:2: (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalRequirementsModel.g:762:2: (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalRequirementsModel.g:763:3: otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBeforeAccess().getBEFOREKeyword_0());
            		
            // InternalRequirementsModel.g:767:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalRequirementsModel.g:768:4: (lv_event_1_0= ruleEvent )
            {
            // InternalRequirementsModel.g:768:4: (lv_event_1_0= ruleEvent )
            // InternalRequirementsModel.g:769:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getBeforeAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_event_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeforeRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"eu.coresense.requirements.RequirementsModel.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBeforeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:790:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:791:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:791:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:792:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBeforeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeforeRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBeforeAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBefore"


    // $ANTLR start "entryRuleAfter"
    // InternalRequirementsModel.g:817:1: entryRuleAfter returns [EObject current=null] : iv_ruleAfter= ruleAfter EOF ;
    public final EObject entryRuleAfter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfter = null;


        try {
            // InternalRequirementsModel.g:817:46: (iv_ruleAfter= ruleAfter EOF )
            // InternalRequirementsModel.g:818:2: iv_ruleAfter= ruleAfter EOF
            {
             newCompositeNode(grammarAccess.getAfterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAfter=ruleAfter();

            state._fsp--;

             current =iv_ruleAfter; 
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
    // $ANTLR end "entryRuleAfter"


    // $ANTLR start "ruleAfter"
    // InternalRequirementsModel.g:824:1: ruleAfter returns [EObject current=null] : (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAfter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_event_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:830:2: ( (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalRequirementsModel.g:831:2: (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalRequirementsModel.g:831:2: (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalRequirementsModel.g:832:3: otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAfterAccess().getAFTERKeyword_0());
            		
            // InternalRequirementsModel.g:836:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalRequirementsModel.g:837:4: (lv_event_1_0= ruleEvent )
            {
            // InternalRequirementsModel.g:837:4: (lv_event_1_0= ruleEvent )
            // InternalRequirementsModel.g:838:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getAfterAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_event_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAfterRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"eu.coresense.requirements.RequirementsModel.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAfterAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:859:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:860:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:860:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:861:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAfterAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAfterRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAfterAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAfter"


    // $ANTLR start "entryRuleIn"
    // InternalRequirementsModel.g:886:1: entryRuleIn returns [EObject current=null] : iv_ruleIn= ruleIn EOF ;
    public final EObject entryRuleIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIn = null;


        try {
            // InternalRequirementsModel.g:886:43: (iv_ruleIn= ruleIn EOF )
            // InternalRequirementsModel.g:887:2: iv_ruleIn= ruleIn EOF
            {
             newCompositeNode(grammarAccess.getInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIn=ruleIn();

            state._fsp--;

             current =iv_ruleIn; 
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
    // $ANTLR end "entryRuleIn"


    // $ANTLR start "ruleIn"
    // InternalRequirementsModel.g:893:1: ruleIn returns [EObject current=null] : (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_deadline_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:899:2: ( (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:900:2: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:900:2: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:901:3: otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getInAccess().getINKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getInAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:909:3: ( (lv_deadline_2_0= ruleTimeInterval ) )
            // InternalRequirementsModel.g:910:4: (lv_deadline_2_0= ruleTimeInterval )
            {
            // InternalRequirementsModel.g:910:4: (lv_deadline_2_0= ruleTimeInterval )
            // InternalRequirementsModel.g:911:5: lv_deadline_2_0= ruleTimeInterval
            {

            					newCompositeNode(grammarAccess.getInAccess().getDeadlineTimeIntervalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_deadline_2_0=ruleTimeInterval();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInRule());
            					}
            					set(
            						current,
            						"deadline",
            						lv_deadline_2_0,
            						"eu.coresense.requirements.RequirementsModel.TimeInterval");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getInAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:932:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:933:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:933:4: (lv_expression_4_0= ruleExpression )
            // InternalRequirementsModel.g:934:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleIn"


    // $ANTLR start "entryRuleAsAsPossible"
    // InternalRequirementsModel.g:959:1: entryRuleAsAsPossible returns [EObject current=null] : iv_ruleAsAsPossible= ruleAsAsPossible EOF ;
    public final EObject entryRuleAsAsPossible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsAsPossible = null;


        try {
            // InternalRequirementsModel.g:959:53: (iv_ruleAsAsPossible= ruleAsAsPossible EOF )
            // InternalRequirementsModel.g:960:2: iv_ruleAsAsPossible= ruleAsAsPossible EOF
            {
             newCompositeNode(grammarAccess.getAsAsPossibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsAsPossible=ruleAsAsPossible();

            state._fsp--;

             current =iv_ruleAsAsPossible; 
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
    // $ANTLR end "entryRuleAsAsPossible"


    // $ANTLR start "ruleAsAsPossible"
    // InternalRequirementsModel.g:966:1: ruleAsAsPossible returns [EObject current=null] : (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ')' ) ;
    public final EObject ruleAsAsPossible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_timeFrequency_1_0 = null;

        EObject lv_quantity_5_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:972:2: ( (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ')' ) )
            // InternalRequirementsModel.g:973:2: (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ')' )
            {
            // InternalRequirementsModel.g:973:2: (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ')' )
            // InternalRequirementsModel.g:974:3: otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAsAsPossibleAccess().getASKeyword_0());
            		
            // InternalRequirementsModel.g:978:3: ( (lv_timeFrequency_1_0= ruleTimeliness ) )
            // InternalRequirementsModel.g:979:4: (lv_timeFrequency_1_0= ruleTimeliness )
            {
            // InternalRequirementsModel.g:979:4: (lv_timeFrequency_1_0= ruleTimeliness )
            // InternalRequirementsModel.g:980:5: lv_timeFrequency_1_0= ruleTimeliness
            {

            					newCompositeNode(grammarAccess.getAsAsPossibleAccess().getTimeFrequencyTimelinessEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_timeFrequency_1_0=ruleTimeliness();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsAsPossibleRule());
            					}
            					set(
            						current,
            						"timeFrequency",
            						lv_timeFrequency_1_0,
            						"eu.coresense.requirements.RequirementsModel.Timeliness");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAsAsPossibleAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAsAsPossibleAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getAsAsPossibleAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRequirementsModel.g:1009:3: ( (lv_quantity_5_0= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1010:4: (lv_quantity_5_0= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1010:4: (lv_quantity_5_0= ruleQuantifiable )
            // InternalRequirementsModel.g:1011:5: lv_quantity_5_0= ruleQuantifiable
            {

            					newCompositeNode(grammarAccess.getAsAsPossibleAccess().getQuantityQuantifiableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_quantity_5_0=ruleQuantifiable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsAsPossibleRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_5_0,
            						"eu.coresense.requirements.RequirementsModel.Quantifiable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAsAsPossibleAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleAsAsPossible"


    // $ANTLR start "entryRuleCompoundExpression"
    // InternalRequirementsModel.g:1036:1: entryRuleCompoundExpression returns [EObject current=null] : iv_ruleCompoundExpression= ruleCompoundExpression EOF ;
    public final EObject entryRuleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExpression = null;


        try {
            // InternalRequirementsModel.g:1036:59: (iv_ruleCompoundExpression= ruleCompoundExpression EOF )
            // InternalRequirementsModel.g:1037:2: iv_ruleCompoundExpression= ruleCompoundExpression EOF
            {
             newCompositeNode(grammarAccess.getCompoundExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundExpression=ruleCompoundExpression();

            state._fsp--;

             current =iv_ruleCompoundExpression; 
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
    // $ANTLR end "entryRuleCompoundExpression"


    // $ANTLR start "ruleCompoundExpression"
    // InternalRequirementsModel.g:1043:1: ruleCompoundExpression returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil ) ;
    public final EObject ruleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_ThisUntil_2 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1049:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil ) )
            // InternalRequirementsModel.g:1050:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil )
            {
            // InternalRequirementsModel.g:1050:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 22:
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
                    // InternalRequirementsModel.g:1051:3: this_And_0= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getCompoundExpressionAccess().getAndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;


                    			current = this_And_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1060:3: this_Or_1= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getCompoundExpressionAccess().getOrParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    			current = this_Or_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1069:3: this_ThisUntil_2= ruleThisUntil
                    {

                    			newCompositeNode(grammarAccess.getCompoundExpressionAccess().getThisUntilParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThisUntil_2=ruleThisUntil();

                    state._fsp--;


                    			current = this_ThisUntil_2;
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
    // $ANTLR end "ruleCompoundExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalRequirementsModel.g:1081:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRequirementsModel.g:1081:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRequirementsModel.g:1082:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRequirementsModel.g:1088:1: ruleStatement returns [EObject current=null] : (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanStatement_0 = null;

        EObject this_Proposition_1 = null;

        EObject this_Quantifiable_2 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1094:2: ( (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1095:2: (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1095:2: (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRequirementsModel.g:1096:3: this_BooleanStatement_0= ruleBooleanStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBooleanStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanStatement_0=ruleBooleanStatement();

                    state._fsp--;


                    			current = this_BooleanStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1105:3: this_Proposition_1= ruleProposition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPropositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Proposition_1=ruleProposition();

                    state._fsp--;


                    			current = this_Proposition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1114:3: this_Quantifiable_2= ruleQuantifiable
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQuantifiableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quantifiable_2=ruleQuantifiable();

                    state._fsp--;


                    			current = this_Quantifiable_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalRequirementsModel.g:1126:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRequirementsModel.g:1126:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRequirementsModel.g:1127:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRequirementsModel.g:1133:1: ruleExpression returns [EObject current=null] : (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Shall_0 = null;

        EObject this_Negation_1 = null;

        EObject this_May_2 = null;

        EObject this_Eventually_3 = null;

        EObject this_CompoundExpression_4 = null;

        EObject this_Before_5 = null;

        EObject this_After_6 = null;

        EObject this_In_7 = null;

        EObject this_AsCloseFreq_8 = null;

        EObject this_AsCloseLit_9 = null;

        EObject this_AsAsPossible_10 = null;

        EObject this_Statement_11 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1139:2: ( (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement ) )
            // InternalRequirementsModel.g:1140:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )
            {
            // InternalRequirementsModel.g:1140:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )
            int alt5=12;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRequirementsModel.g:1141:3: this_Shall_0= ruleShall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getShallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shall_0=ruleShall();

                    state._fsp--;


                    			current = this_Shall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1150:3: this_Negation_1= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNegationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_1=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1159:3: this_May_2= ruleMay
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_May_2=ruleMay();

                    state._fsp--;


                    			current = this_May_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1168:3: this_Eventually_3= ruleEventually
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEventuallyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eventually_3=ruleEventually();

                    state._fsp--;


                    			current = this_Eventually_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:1177:3: this_CompoundExpression_4= ruleCompoundExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCompoundExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExpression_4=ruleCompoundExpression();

                    state._fsp--;


                    			current = this_CompoundExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRequirementsModel.g:1186:3: this_Before_5= ruleBefore
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBeforeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Before_5=ruleBefore();

                    state._fsp--;


                    			current = this_Before_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRequirementsModel.g:1195:3: this_After_6= ruleAfter
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAfterParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_After_6=ruleAfter();

                    state._fsp--;


                    			current = this_After_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRequirementsModel.g:1204:3: this_In_7= ruleIn
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getInParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_In_7=ruleIn();

                    state._fsp--;


                    			current = this_In_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRequirementsModel.g:1213:3: this_AsCloseFreq_8= ruleAsCloseFreq
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAsCloseFreqParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsCloseFreq_8=ruleAsCloseFreq();

                    state._fsp--;


                    			current = this_AsCloseFreq_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRequirementsModel.g:1222:3: this_AsCloseLit_9= ruleAsCloseLit
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAsCloseLitParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsCloseLit_9=ruleAsCloseLit();

                    state._fsp--;


                    			current = this_AsCloseLit_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRequirementsModel.g:1231:3: this_AsAsPossible_10= ruleAsAsPossible
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAsAsPossibleParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsAsPossible_10=ruleAsAsPossible();

                    state._fsp--;


                    			current = this_AsAsPossible_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRequirementsModel.g:1240:3: this_Statement_11= ruleStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStatementParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Statement_11=ruleStatement();

                    state._fsp--;


                    			current = this_Statement_11;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAsCloseFreq"
    // InternalRequirementsModel.g:1252:1: entryRuleAsCloseFreq returns [EObject current=null] : iv_ruleAsCloseFreq= ruleAsCloseFreq EOF ;
    public final EObject entryRuleAsCloseFreq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseFreq = null;


        try {
            // InternalRequirementsModel.g:1252:52: (iv_ruleAsCloseFreq= ruleAsCloseFreq EOF )
            // InternalRequirementsModel.g:1253:2: iv_ruleAsCloseFreq= ruleAsCloseFreq EOF
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
    // InternalRequirementsModel.g:1259:1: ruleAsCloseFreq returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ) ;
    public final EObject ruleAsCloseFreq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_frequency_6_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1265:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            // InternalRequirementsModel.g:1266:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )
            {
            // InternalRequirementsModel.g:1266:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )
            // InternalRequirementsModel.g:1267:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseFreqAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseFreqAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseFreqAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseFreqAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseFreqAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseFreqAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:1291:3: ( (lv_frequency_6_0= ruleTime ) )
            // InternalRequirementsModel.g:1292:4: (lv_frequency_6_0= ruleTime )
            {
            // InternalRequirementsModel.g:1292:4: (lv_frequency_6_0= ruleTime )
            // InternalRequirementsModel.g:1293:5: lv_frequency_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getFrequencyTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_frequency_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseFreqRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_6_0,
            						"eu.coresense.requirements.RequirementsModel.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getAsCloseFreqAccess().getCommaKeyword_7());
            		
            // InternalRequirementsModel.g:1314:3: ( (lv_expression_8_0= ruleExpression ) )
            // InternalRequirementsModel.g:1315:4: (lv_expression_8_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1315:4: (lv_expression_8_0= ruleExpression )
            // InternalRequirementsModel.g:1316:5: lv_expression_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getExpressionExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseFreqRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_8_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAsCloseFreqAccess().getRightParenthesisKeyword_9());
            		

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
    // InternalRequirementsModel.g:1341:1: entryRuleAsCloseLit returns [EObject current=null] : iv_ruleAsCloseLit= ruleAsCloseLit EOF ;
    public final EObject entryRuleAsCloseLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseLit = null;


        try {
            // InternalRequirementsModel.g:1341:51: (iv_ruleAsCloseLit= ruleAsCloseLit EOF )
            // InternalRequirementsModel.g:1342:2: iv_ruleAsCloseLit= ruleAsCloseLit EOF
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
    // InternalRequirementsModel.g:1348:1: ruleAsCloseLit returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ')' ) ;
    public final EObject ruleAsCloseLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_quantity_6_0 = null;

        EObject lv_comparator_8_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1354:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ')' ) )
            // InternalRequirementsModel.g:1355:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ')' )
            {
            // InternalRequirementsModel.g:1355:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ')' )
            // InternalRequirementsModel.g:1356:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseLitAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseLitAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseLitAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseLitAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseLitAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseLitAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:1380:3: ( (lv_quantity_6_0= ruleLiteral ) )
            // InternalRequirementsModel.g:1381:4: (lv_quantity_6_0= ruleLiteral )
            {
            // InternalRequirementsModel.g:1381:4: (lv_quantity_6_0= ruleLiteral )
            // InternalRequirementsModel.g:1382:5: lv_quantity_6_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getQuantityLiteralParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_quantity_6_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseLitRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_6_0,
            						"eu.coresense.requirements.RequirementsModel.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getAsCloseLitAccess().getCommaKeyword_7());
            		
            // InternalRequirementsModel.g:1403:3: ( (lv_comparator_8_0= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1404:4: (lv_comparator_8_0= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1404:4: (lv_comparator_8_0= ruleQuantifiable )
            // InternalRequirementsModel.g:1405:5: lv_comparator_8_0= ruleQuantifiable
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getComparatorQuantifiableParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_comparator_8_0=ruleQuantifiable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseLitRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_8_0,
            						"eu.coresense.requirements.RequirementsModel.Quantifiable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAsCloseLitAccess().getRightParenthesisKeyword_9());
            		

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
    // InternalRequirementsModel.g:1430:1: entryRuleQuantifiable returns [EObject current=null] : iv_ruleQuantifiable= ruleQuantifiable EOF ;
    public final EObject entryRuleQuantifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiable = null;


        try {
            // InternalRequirementsModel.g:1430:53: (iv_ruleQuantifiable= ruleQuantifiable EOF )
            // InternalRequirementsModel.g:1431:2: iv_ruleQuantifiable= ruleQuantifiable EOF
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
    // InternalRequirementsModel.g:1437:1: ruleQuantifiable returns [EObject current=null] : (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleQuantifiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1443:2: ( (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRequirementsModel.g:1444:2: (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRequirementsModel.g:1444:2: (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) )
            // InternalRequirementsModel.g:1445:3: otherlv_0= '^' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantifiableAccess().getCircumflexAccentKeyword_0());
            		
            // InternalRequirementsModel.g:1449:3: ( (otherlv_1= RULE_ID ) )
            // InternalRequirementsModel.g:1450:4: (otherlv_1= RULE_ID )
            {
            // InternalRequirementsModel.g:1450:4: (otherlv_1= RULE_ID )
            // InternalRequirementsModel.g:1451:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantifiableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getQuantifiableAccess().getContextVariableContextVarCrossReference_1_0());
            				

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
    // $ANTLR end "ruleQuantifiable"


    // $ANTLR start "entryRuleMay"
    // InternalRequirementsModel.g:1466:1: entryRuleMay returns [EObject current=null] : iv_ruleMay= ruleMay EOF ;
    public final EObject entryRuleMay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMay = null;


        try {
            // InternalRequirementsModel.g:1466:44: (iv_ruleMay= ruleMay EOF )
            // InternalRequirementsModel.g:1467:2: iv_ruleMay= ruleMay EOF
            {
             newCompositeNode(grammarAccess.getMayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMay=ruleMay();

            state._fsp--;

             current =iv_ruleMay; 
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
    // $ANTLR end "entryRuleMay"


    // $ANTLR start "ruleMay"
    // InternalRequirementsModel.g:1473:1: ruleMay returns [EObject current=null] : (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' ) ;
    public final EObject ruleMay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_alternatives_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1479:2: ( (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' ) )
            // InternalRequirementsModel.g:1480:2: (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:1480:2: (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' )
            // InternalRequirementsModel.g:1481:3: otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMayAccess().getMAYKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:1489:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:1490:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1490:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:1491:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMayAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMayRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMayAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:1512:3: ( (lv_alternatives_4_0= ruleMayAlternative ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRequirementsModel.g:1513:4: (lv_alternatives_4_0= ruleMayAlternative )
            	    {
            	    // InternalRequirementsModel.g:1513:4: (lv_alternatives_4_0= ruleMayAlternative )
            	    // InternalRequirementsModel.g:1514:5: lv_alternatives_4_0= ruleMayAlternative
            	    {

            	    					newCompositeNode(grammarAccess.getMayAccess().getAlternativesMayAlternativeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_alternatives_4_0=ruleMayAlternative();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alternatives",
            	    						lv_alternatives_4_0,
            	    						"eu.coresense.requirements.RequirementsModel.MayAlternative");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMayAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMay"


    // $ANTLR start "entryRuleMayAlternative"
    // InternalRequirementsModel.g:1539:1: entryRuleMayAlternative returns [EObject current=null] : iv_ruleMayAlternative= ruleMayAlternative EOF ;
    public final EObject entryRuleMayAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMayAlternative = null;


        try {
            // InternalRequirementsModel.g:1539:55: (iv_ruleMayAlternative= ruleMayAlternative EOF )
            // InternalRequirementsModel.g:1540:2: iv_ruleMayAlternative= ruleMayAlternative EOF
            {
             newCompositeNode(grammarAccess.getMayAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMayAlternative=ruleMayAlternative();

            state._fsp--;

             current =iv_ruleMayAlternative; 
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
    // $ANTLR end "entryRuleMayAlternative"


    // $ANTLR start "ruleMayAlternative"
    // InternalRequirementsModel.g:1546:1: ruleMayAlternative returns [EObject current=null] : (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? ) ;
    public final EObject ruleMayAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1552:2: ( (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? ) )
            // InternalRequirementsModel.g:1553:2: (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? )
            {
            // InternalRequirementsModel.g:1553:2: (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? )
            // InternalRequirementsModel.g:1554:3: otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMayAlternativeAccess().getORKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMayAlternativeAccess().getMAYKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMayAlternativeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:1566:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:1567:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1567:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:1568:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMayAlternativeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMayAlternativeRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"eu.coresense.requirements.RequirementsModel.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getMayAlternativeAccess().getRightParenthesisKeyword_4());
            		
            // InternalRequirementsModel.g:1589:3: (otherlv_5= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRequirementsModel.g:1590:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getMayAlternativeAccess().getCommaKeyword_5());
                    			

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
    // $ANTLR end "ruleMayAlternative"


    // $ANTLR start "entryRuleEvent"
    // InternalRequirementsModel.g:1599:1: entryRuleEvent returns [String current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final String entryRuleEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEvent = null;


        try {
            // InternalRequirementsModel.g:1599:45: (iv_ruleEvent= ruleEvent EOF )
            // InternalRequirementsModel.g:1600:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRequirementsModel.g:1606:1: ruleEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1612:2: (this_STRING_0= RULE_STRING )
            // InternalRequirementsModel.g:1613:2: this_STRING_0= RULE_STRING
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
    // InternalRequirementsModel.g:1623:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalRequirementsModel.g:1623:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalRequirementsModel.g:1624:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalRequirementsModel.g:1630:1: ruleTimeInterval returns [EObject current=null] : ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_after_0_0 = null;

        EObject lv_before_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1636:2: ( ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) )
            // InternalRequirementsModel.g:1637:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            {
            // InternalRequirementsModel.g:1637:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            // InternalRequirementsModel.g:1638:3: ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) )
            {
            // InternalRequirementsModel.g:1638:3: ( (lv_after_0_0= ruleTime ) )
            // InternalRequirementsModel.g:1639:4: (lv_after_0_0= ruleTime )
            {
            // InternalRequirementsModel.g:1639:4: (lv_after_0_0= ruleTime )
            // InternalRequirementsModel.g:1640:5: lv_after_0_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getAfterTimeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getHyphenMinusKeyword_1());
            		
            // InternalRequirementsModel.g:1661:3: ( (lv_before_2_0= ruleTime ) )
            // InternalRequirementsModel.g:1662:4: (lv_before_2_0= ruleTime )
            {
            // InternalRequirementsModel.g:1662:4: (lv_before_2_0= ruleTime )
            // InternalRequirementsModel.g:1663:5: lv_before_2_0= ruleTime
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
    // InternalRequirementsModel.g:1684:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRequirementsModel.g:1684:45: (iv_ruleTime= ruleTime EOF )
            // InternalRequirementsModel.g:1685:2: iv_ruleTime= ruleTime EOF
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
    // InternalRequirementsModel.g:1691:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) ;
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
            // InternalRequirementsModel.g:1697:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) )
            // InternalRequirementsModel.g:1698:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            {
            // InternalRequirementsModel.g:1698:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            // InternalRequirementsModel.g:1699:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            {
            // InternalRequirementsModel.g:1699:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:1700:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:1700:4: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:1701:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalRequirementsModel.g:1717:3: (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            case 38:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRequirementsModel.g:1718:4: otherlv_1= 'hr'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getHrKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1723:4: otherlv_2= 'min'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getMinKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1728:4: otherlv_3= 's'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getSKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1733:4: otherlv_4= 'ms'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getMsKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:1738:4: otherlv_5= 'ns'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalRequirementsModel.g:1747:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRequirementsModel.g:1747:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRequirementsModel.g:1748:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalRequirementsModel.g:1754:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1760:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalRequirementsModel.g:1761:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalRequirementsModel.g:1761:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRequirementsModel.g:1762:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalRequirementsModel.g:1771:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalRequirementsModel.g:1780:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalRequirementsModel.g:1789:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalRequirementsModel.g:1801:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalRequirementsModel.g:1801:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalRequirementsModel.g:1802:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalRequirementsModel.g:1808:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1814:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRequirementsModel.g:1815:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRequirementsModel.g:1815:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:1816:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:1816:3: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:1817:4: lv_value_0_0= RULE_INT
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
    // InternalRequirementsModel.g:1836:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalRequirementsModel.g:1836:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalRequirementsModel.g:1837:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalRequirementsModel.g:1843:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1849:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalRequirementsModel.g:1850:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalRequirementsModel.g:1850:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1851:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1851:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1852:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalRequirementsModel.g:1871:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalRequirementsModel.g:1871:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalRequirementsModel.g:1872:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalRequirementsModel.g:1878:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1884:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRequirementsModel.g:1885:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRequirementsModel.g:1885:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRequirementsModel.g:1886:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:1886:3: (lv_value_0_0= RULE_STRING )
            // InternalRequirementsModel.g:1887:4: lv_value_0_0= RULE_STRING
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
    // InternalRequirementsModel.g:1906:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalRequirementsModel.g:1906:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalRequirementsModel.g:1907:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalRequirementsModel.g:1913:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1919:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRequirementsModel.g:1920:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRequirementsModel.g:1920:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRequirementsModel.g:1921:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRequirementsModel.g:1921:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRequirementsModel.g:1922:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalRequirementsModel.g:1941:1: ruleQualityAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) ;
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
            // InternalRequirementsModel.g:1947:2: ( ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) )
            // InternalRequirementsModel.g:1948:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            {
            // InternalRequirementsModel.g:1948:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            case 44:
                {
                alt10=6;
                }
                break;
            case 45:
                {
                alt10=7;
                }
                break;
            case 46:
                {
                alt10=8;
                }
                break;
            case 47:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRequirementsModel.g:1949:3: (enumLiteral_0= 'Functional suitability' )
                    {
                    // InternalRequirementsModel.g:1949:3: (enumLiteral_0= 'Functional suitability' )
                    // InternalRequirementsModel.g:1950:4: enumLiteral_0= 'Functional suitability'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1957:3: (enumLiteral_1= 'Performance efficiency' )
                    {
                    // InternalRequirementsModel.g:1957:3: (enumLiteral_1= 'Performance efficiency' )
                    // InternalRequirementsModel.g:1958:4: enumLiteral_1= 'Performance efficiency'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1965:3: (enumLiteral_2= 'Compatibility' )
                    {
                    // InternalRequirementsModel.g:1965:3: (enumLiteral_2= 'Compatibility' )
                    // InternalRequirementsModel.g:1966:4: enumLiteral_2= 'Compatibility'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:1973:3: (enumLiteral_3= 'Interaction capability' )
                    {
                    // InternalRequirementsModel.g:1973:3: (enumLiteral_3= 'Interaction capability' )
                    // InternalRequirementsModel.g:1974:4: enumLiteral_3= 'Interaction capability'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:1981:3: (enumLiteral_4= 'Reliability' )
                    {
                    // InternalRequirementsModel.g:1981:3: (enumLiteral_4= 'Reliability' )
                    // InternalRequirementsModel.g:1982:4: enumLiteral_4= 'Reliability'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRequirementsModel.g:1989:3: (enumLiteral_5= 'Security' )
                    {
                    // InternalRequirementsModel.g:1989:3: (enumLiteral_5= 'Security' )
                    // InternalRequirementsModel.g:1990:4: enumLiteral_5= 'Security'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRequirementsModel.g:1997:3: (enumLiteral_6= 'Maintainability' )
                    {
                    // InternalRequirementsModel.g:1997:3: (enumLiteral_6= 'Maintainability' )
                    // InternalRequirementsModel.g:1998:4: enumLiteral_6= 'Maintainability'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRequirementsModel.g:2005:3: (enumLiteral_7= 'Flexibility' )
                    {
                    // InternalRequirementsModel.g:2005:3: (enumLiteral_7= 'Flexibility' )
                    // InternalRequirementsModel.g:2006:4: enumLiteral_7= 'Flexibility'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRequirementsModel.g:2013:3: (enumLiteral_8= 'Safety' )
                    {
                    // InternalRequirementsModel.g:2013:3: (enumLiteral_8= 'Safety' )
                    // InternalRequirementsModel.g:2014:4: enumLiteral_8= 'Safety'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2024:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2030:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // InternalRequirementsModel.g:2031:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // InternalRequirementsModel.g:2031:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 50:
                {
                alt11=3;
                }
                break;
            case 51:
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
                    // InternalRequirementsModel.g:2032:3: (enumLiteral_0= '<' )
                    {
                    // InternalRequirementsModel.g:2032:3: (enumLiteral_0= '<' )
                    // InternalRequirementsModel.g:2033:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2040:3: (enumLiteral_1= '>' )
                    {
                    // InternalRequirementsModel.g:2040:3: (enumLiteral_1= '>' )
                    // InternalRequirementsModel.g:2041:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2048:3: (enumLiteral_2= '==' )
                    {
                    // InternalRequirementsModel.g:2048:3: (enumLiteral_2= '==' )
                    // InternalRequirementsModel.g:2049:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2056:3: (enumLiteral_3= '<>' )
                    {
                    // InternalRequirementsModel.g:2056:3: (enumLiteral_3= '<>' )
                    // InternalRequirementsModel.g:2057:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2067:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2073:2: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalRequirementsModel.g:2074:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalRequirementsModel.g:2074:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==52) ) {
                alt12=1;
            }
            else if ( (LA12_0==53) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRequirementsModel.g:2075:3: (enumLiteral_0= '&&' )
                    {
                    // InternalRequirementsModel.g:2075:3: (enumLiteral_0= '&&' )
                    // InternalRequirementsModel.g:2076:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2083:3: (enumLiteral_1= '||' )
                    {
                    // InternalRequirementsModel.g:2083:3: (enumLiteral_1= '||' )
                    // InternalRequirementsModel.g:2084:4: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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


    // $ANTLR start "ruleTimeliness"
    // InternalRequirementsModel.g:2094:1: ruleTimeliness returns [Enumerator current=null] : ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) ) ;
    public final Enumerator ruleTimeliness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2100:2: ( ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) ) )
            // InternalRequirementsModel.g:2101:2: ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) )
            {
            // InternalRequirementsModel.g:2101:2: ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 57:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRequirementsModel.g:2102:3: (enumLiteral_0= 'EARLY' )
                    {
                    // InternalRequirementsModel.g:2102:3: (enumLiteral_0= 'EARLY' )
                    // InternalRequirementsModel.g:2103:4: enumLiteral_0= 'EARLY'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getEARLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimelinessAccess().getEARLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2110:3: (enumLiteral_1= 'LATE' )
                    {
                    // InternalRequirementsModel.g:2110:3: (enumLiteral_1= 'LATE' )
                    // InternalRequirementsModel.g:2111:4: enumLiteral_1= 'LATE'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getLATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimelinessAccess().getLATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2118:3: (enumLiteral_2= 'MANY' )
                    {
                    // InternalRequirementsModel.g:2118:3: (enumLiteral_2= 'MANY' )
                    // InternalRequirementsModel.g:2119:4: enumLiteral_2= 'MANY'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getMANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimelinessAccess().getMANYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2126:3: (enumLiteral_3= 'FEW' )
                    {
                    // InternalRequirementsModel.g:2126:3: (enumLiteral_3= 'FEW' )
                    // InternalRequirementsModel.g:2127:4: enumLiteral_3= 'FEW'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getFEWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimelinessAccess().getFEWEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTimeliness"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\4\10\uffff\1\35\2\uffff\1\33\1\34\1\36\1\20\1\5\1\15\2\uffff";
    static final String dfa_3s = "\1\40\10\uffff\1\71\2\uffff\1\33\1\34\1\36\1\20\1\10\1\46\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\14\1\13\6\uffff\1\12\1\11";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\uffff\1\12\10\uffff\1\5\2\uffff\1\5\1\1\1\2\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\3\uffff\1\12\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\30\uffff\4\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\2\22\1\21\1\22",
            "\1\22\24\uffff\5\23",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1140:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000FF8000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000018F7C8050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007C00000000L});

}