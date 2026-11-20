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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_DECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "':'", "'import'", "';'", "'['", "']'", "'AND'", "'('", "')'", "'OR'", "'SHALL'", "'NOT'", "'EVENTUALLY'", "'THIS'", "'UNTIL'", "'BEFORE'", "'AFTER'", "'IN'", "'AS'", "'POSSIBLE'", "'CLOSE'", "'TO'", "'FuzzyTriangular'", "'FuzzyRightShoulder'", "'foot='", "'shoulder='", "'FuzzyLeftShoulder'", "'^'", "'MAY'", "'-'", "'hr'", "'min'", "'s'", "'ms'", "'ns'", "'Functional suitability'", "'Performance efficiency'", "'Compatibility'", "'Interaction capability'", "'Reliability'", "'Security'", "'Maintainability'", "'Flexibility'", "'Safety'", "'<'", "'>'", "'=='", "'<>'", "'&&'", "'||'", "'EARLY'", "'LATE'", "'MANY'", "'FEW'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalRequirementsModel.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_requirements_1_0= ruleRequirement ) )* ) ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_requirements_1_0= ruleRequirement ) )* ) )
            // InternalRequirementsModel.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_requirements_1_0= ruleRequirement ) )* )
            {
            // InternalRequirementsModel.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_requirements_1_0= ruleRequirement ) )* )
            // InternalRequirementsModel.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_requirements_1_0= ruleRequirement ) )*
            {
            // InternalRequirementsModel.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRequirementsModel.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalRequirementsModel.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalRequirementsModel.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementsModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"eu.coresense.requirements.RequirementsModel.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRequirementsModel.g:99:3: ( (lv_requirements_1_0= ruleRequirement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRequirementsModel.g:100:4: (lv_requirements_1_0= ruleRequirement )
            	    {
            	    // InternalRequirementsModel.g:100:4: (lv_requirements_1_0= ruleRequirement )
            	    // InternalRequirementsModel.g:101:5: lv_requirements_1_0= ruleRequirement
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementsModelAccess().getRequirementsRequirementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_requirements_1_0=ruleRequirement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_1_0,
            	    						"eu.coresense.requirements.RequirementsModel.Requirement");
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
    // $ANTLR end "ruleRequirementsModel"


    // $ANTLR start "entryRuleRequirement"
    // InternalRequirementsModel.g:122:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRequirementsModel.g:122:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRequirementsModel.g:123:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRequirementsModel.g:129:1: ruleRequirement returns [EObject current=null] : ( ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_qa_3_0= ruleQualityAttribute ) ) otherlv_4= ':' ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_expression_7_0= ruleExpression ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_naturalLanguageDescription_5_0=null;
        Token otherlv_6=null;
        EObject lv_featureQualifier_0_0 = null;

        Enumerator lv_qa_3_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:135:2: ( ( ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_qa_3_0= ruleQualityAttribute ) ) otherlv_4= ':' ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_expression_7_0= ruleExpression ) ) ) )
            // InternalRequirementsModel.g:136:2: ( ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_qa_3_0= ruleQualityAttribute ) ) otherlv_4= ':' ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_expression_7_0= ruleExpression ) ) )
            {
            // InternalRequirementsModel.g:136:2: ( ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_qa_3_0= ruleQualityAttribute ) ) otherlv_4= ':' ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_expression_7_0= ruleExpression ) ) )
            // InternalRequirementsModel.g:137:3: ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_qa_3_0= ruleQualityAttribute ) ) otherlv_4= ':' ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_expression_7_0= ruleExpression ) )
            {
            // InternalRequirementsModel.g:137:3: ( (lv_featureQualifier_0_0= ruleFeatureQualifier ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRequirementsModel.g:138:4: (lv_featureQualifier_0_0= ruleFeatureQualifier )
                    {
                    // InternalRequirementsModel.g:138:4: (lv_featureQualifier_0_0= ruleFeatureQualifier )
                    // InternalRequirementsModel.g:139:5: lv_featureQualifier_0_0= ruleFeatureQualifier
                    {

                    					newCompositeNode(grammarAccess.getRequirementAccess().getFeatureQualifierFeatureQualifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_featureQualifier_0_0=ruleFeatureQualifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequirementRule());
                    					}
                    					set(
                    						current,
                    						"featureQualifier",
                    						lv_featureQualifier_0_0,
                    						"eu.coresense.requirements.RequirementsModel.FeatureQualifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRequirementsModel.g:156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRequirementsModel.g:157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRequirementsModel.g:157:4: (lv_name_1_0= RULE_ID )
            // InternalRequirementsModel.g:158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getCommaKeyword_2());
            		
            // InternalRequirementsModel.g:178:3: ( (lv_qa_3_0= ruleQualityAttribute ) )
            // InternalRequirementsModel.g:179:4: (lv_qa_3_0= ruleQualityAttribute )
            {
            // InternalRequirementsModel.g:179:4: (lv_qa_3_0= ruleQualityAttribute )
            // InternalRequirementsModel.g:180:5: lv_qa_3_0= ruleQualityAttribute
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getQaQualityAttributeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_qa_3_0=ruleQualityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"qa",
            						lv_qa_3_0,
            						"eu.coresense.requirements.RequirementsModel.QualityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getColonKeyword_4());
            		
            // InternalRequirementsModel.g:201:3: ( (lv_naturalLanguageDescription_5_0= RULE_STRING ) )
            // InternalRequirementsModel.g:202:4: (lv_naturalLanguageDescription_5_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:202:4: (lv_naturalLanguageDescription_5_0= RULE_STRING )
            // InternalRequirementsModel.g:203:5: lv_naturalLanguageDescription_5_0= RULE_STRING
            {
            lv_naturalLanguageDescription_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_naturalLanguageDescription_5_0, grammarAccess.getRequirementAccess().getNaturalLanguageDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"naturalLanguageDescription",
            						lv_naturalLanguageDescription_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getCommaKeyword_6());
            		
            // InternalRequirementsModel.g:223:3: ( (lv_expression_7_0= ruleExpression ) )
            // InternalRequirementsModel.g:224:4: (lv_expression_7_0= ruleExpression )
            {
            // InternalRequirementsModel.g:224:4: (lv_expression_7_0= ruleExpression )
            // InternalRequirementsModel.g:225:5: lv_expression_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getExpressionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_7_0,
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


    // $ANTLR start "entryRuleImport"
    // InternalRequirementsModel.g:246:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRequirementsModel.g:246:47: (iv_ruleImport= ruleImport EOF )
            // InternalRequirementsModel.g:247:2: iv_ruleImport= ruleImport EOF
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
    // InternalRequirementsModel.g:253:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:259:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalRequirementsModel.g:260:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalRequirementsModel.g:260:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalRequirementsModel.g:261:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRequirementsModel.g:265:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalRequirementsModel.g:266:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:266:4: (lv_importURI_1_0= RULE_STRING )
            // InternalRequirementsModel.g:267:5: lv_importURI_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFeatureQualifier"
    // InternalRequirementsModel.g:291:1: entryRuleFeatureQualifier returns [EObject current=null] : iv_ruleFeatureQualifier= ruleFeatureQualifier EOF ;
    public final EObject entryRuleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureQualifier = null;


        try {
            // InternalRequirementsModel.g:291:57: (iv_ruleFeatureQualifier= ruleFeatureQualifier EOF )
            // InternalRequirementsModel.g:292:2: iv_ruleFeatureQualifier= ruleFeatureQualifier EOF
            {
             newCompositeNode(grammarAccess.getFeatureQualifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureQualifier=ruleFeatureQualifier();

            state._fsp--;

             current =iv_ruleFeatureQualifier; 
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
    // $ANTLR end "entryRuleFeatureQualifier"


    // $ANTLR start "ruleFeatureQualifier"
    // InternalRequirementsModel.g:298:1: ruleFeatureQualifier returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:304:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // InternalRequirementsModel.g:305:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // InternalRequirementsModel.g:305:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // InternalRequirementsModel.g:306:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureQualifierAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRequirementsModel.g:310:3: ( (otherlv_1= RULE_ID ) )
            // InternalRequirementsModel.g:311:4: (otherlv_1= RULE_ID )
            {
            // InternalRequirementsModel.g:311:4: (otherlv_1= RULE_ID )
            // InternalRequirementsModel.g:312:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureQualifierRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureQualifierAccess().getFeatureFeatureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureQualifierAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleFeatureQualifier"


    // $ANTLR start "entryRuleCondition"
    // InternalRequirementsModel.g:331:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRequirementsModel.g:331:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRequirementsModel.g:332:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalRequirementsModel.g:338:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;

        Enumerator lv_logicalOp_3_0 = null;

        EObject lv_secondTerm_4_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:344:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? ) )
            // InternalRequirementsModel.g:345:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            {
            // InternalRequirementsModel.g:345:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )? )
            // InternalRequirementsModel.g:346:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleMathOperator ) ) ( (lv_value_2_0= ruleLiteral ) ) ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            {
            // InternalRequirementsModel.g:346:3: ( (otherlv_0= RULE_ID ) )
            // InternalRequirementsModel.g:347:4: (otherlv_0= RULE_ID )
            {
            // InternalRequirementsModel.g:347:4: (otherlv_0= RULE_ID )
            // InternalRequirementsModel.g:348:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getMeasurementContextVarCrossReference_0_0());
            				

            }


            }

            // InternalRequirementsModel.g:359:3: ( (lv_operator_1_0= ruleMathOperator ) )
            // InternalRequirementsModel.g:360:4: (lv_operator_1_0= ruleMathOperator )
            {
            // InternalRequirementsModel.g:360:4: (lv_operator_1_0= ruleMathOperator )
            // InternalRequirementsModel.g:361:5: lv_operator_1_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalRequirementsModel.g:378:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalRequirementsModel.g:379:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalRequirementsModel.g:379:4: (lv_value_2_0= ruleLiteral )
            // InternalRequirementsModel.g:380:5: lv_value_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValueLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalRequirementsModel.g:397:3: ( ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=61 && LA4_0<=62)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRequirementsModel.g:398:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) ) ( (lv_secondTerm_4_0= ruleCondition ) )
                    {
                    // InternalRequirementsModel.g:398:4: ( (lv_logicalOp_3_0= ruleLogicalOperator ) )
                    // InternalRequirementsModel.g:399:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    {
                    // InternalRequirementsModel.g:399:5: (lv_logicalOp_3_0= ruleLogicalOperator )
                    // InternalRequirementsModel.g:400:6: lv_logicalOp_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalRequirementsModel.g:417:4: ( (lv_secondTerm_4_0= ruleCondition ) )
                    // InternalRequirementsModel.g:418:5: (lv_secondTerm_4_0= ruleCondition )
                    {
                    // InternalRequirementsModel.g:418:5: (lv_secondTerm_4_0= ruleCondition )
                    // InternalRequirementsModel.g:419:6: lv_secondTerm_4_0= ruleCondition
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
    // InternalRequirementsModel.g:441:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalRequirementsModel.g:441:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalRequirementsModel.g:442:2: iv_ruleProposition= ruleProposition EOF
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
    // InternalRequirementsModel.g:448:1: ruleProposition returns [EObject current=null] : ( (lv_condition_0_0= ruleCondition ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:454:2: ( ( (lv_condition_0_0= ruleCondition ) ) )
            // InternalRequirementsModel.g:455:2: ( (lv_condition_0_0= ruleCondition ) )
            {
            // InternalRequirementsModel.g:455:2: ( (lv_condition_0_0= ruleCondition ) )
            // InternalRequirementsModel.g:456:3: (lv_condition_0_0= ruleCondition )
            {
            // InternalRequirementsModel.g:456:3: (lv_condition_0_0= ruleCondition )
            // InternalRequirementsModel.g:457:4: lv_condition_0_0= ruleCondition
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
    // InternalRequirementsModel.g:477:1: entryRuleBooleanStatement returns [EObject current=null] : iv_ruleBooleanStatement= ruleBooleanStatement EOF ;
    public final EObject entryRuleBooleanStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanStatement = null;


        try {
            // InternalRequirementsModel.g:477:57: (iv_ruleBooleanStatement= ruleBooleanStatement EOF )
            // InternalRequirementsModel.g:478:2: iv_ruleBooleanStatement= ruleBooleanStatement EOF
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
    // InternalRequirementsModel.g:484:1: ruleBooleanStatement returns [EObject current=null] : ( (lv_booleanValue_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanStatement() throws RecognitionException {
        EObject current = null;

        Token lv_booleanValue_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:490:2: ( ( (lv_booleanValue_0_0= RULE_BOOLEAN ) ) )
            // InternalRequirementsModel.g:491:2: ( (lv_booleanValue_0_0= RULE_BOOLEAN ) )
            {
            // InternalRequirementsModel.g:491:2: ( (lv_booleanValue_0_0= RULE_BOOLEAN ) )
            // InternalRequirementsModel.g:492:3: (lv_booleanValue_0_0= RULE_BOOLEAN )
            {
            // InternalRequirementsModel.g:492:3: (lv_booleanValue_0_0= RULE_BOOLEAN )
            // InternalRequirementsModel.g:493:4: lv_booleanValue_0_0= RULE_BOOLEAN
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
    // InternalRequirementsModel.g:512:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRequirementsModel.g:512:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRequirementsModel.g:513:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalRequirementsModel.g:519:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
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
            // InternalRequirementsModel.g:525:2: ( (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:526:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:526:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:527:3: otherlv_0= 'AND' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getANDKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:535:3: ( (lv_leftExpression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:536:4: (lv_leftExpression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:536:4: (lv_leftExpression_2_0= ruleExpression )
            // InternalRequirementsModel.g:537:5: lv_leftExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAndAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:558:3: ( (lv_rightExpression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:559:4: (lv_rightExpression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:559:4: (lv_rightExpression_4_0= ruleExpression )
            // InternalRequirementsModel.g:560:5: lv_rightExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:585:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRequirementsModel.g:585:43: (iv_ruleOr= ruleOr EOF )
            // InternalRequirementsModel.g:586:2: iv_ruleOr= ruleOr EOF
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
    // InternalRequirementsModel.g:592:1: ruleOr returns [EObject current=null] : (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
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
            // InternalRequirementsModel.g:598:2: ( (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:599:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:599:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:600:3: otherlv_0= 'OR' otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getORKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:608:3: ( (lv_leftExpression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:609:4: (lv_leftExpression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:609:4: (lv_leftExpression_2_0= ruleExpression )
            // InternalRequirementsModel.g:610:5: lv_leftExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getLeftExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOrAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:631:3: ( (lv_rightExpression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:632:4: (lv_rightExpression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:632:4: (lv_rightExpression_4_0= ruleExpression )
            // InternalRequirementsModel.g:633:5: lv_rightExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getRightExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:658:1: entryRuleShall returns [EObject current=null] : iv_ruleShall= ruleShall EOF ;
    public final EObject entryRuleShall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShall = null;


        try {
            // InternalRequirementsModel.g:658:46: (iv_ruleShall= ruleShall EOF )
            // InternalRequirementsModel.g:659:2: iv_ruleShall= ruleShall EOF
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
    // InternalRequirementsModel.g:665:1: ruleShall returns [EObject current=null] : (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleShall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:671:2: ( (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:672:2: (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:672:2: (otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:673:3: otherlv_0= 'SHALL' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getShallAccess().getSHALLKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getShallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:681:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:682:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:682:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:683:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getShallAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:708:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalRequirementsModel.g:708:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalRequirementsModel.g:709:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalRequirementsModel.g:715:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:721:2: ( (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:722:2: (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:722:2: (otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:723:3: otherlv_0= 'NOT' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNOTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:731:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:732:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:732:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:733:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:758:1: entryRuleEventually returns [EObject current=null] : iv_ruleEventually= ruleEventually EOF ;
    public final EObject entryRuleEventually() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventually = null;


        try {
            // InternalRequirementsModel.g:758:51: (iv_ruleEventually= ruleEventually EOF )
            // InternalRequirementsModel.g:759:2: iv_ruleEventually= ruleEventually EOF
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
    // InternalRequirementsModel.g:765:1: ruleEventually returns [EObject current=null] : (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleEventually() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:771:2: ( (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalRequirementsModel.g:772:2: (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalRequirementsModel.g:772:2: (otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalRequirementsModel.g:773:3: otherlv_0= 'EVENTUALLY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEventuallyAccess().getEVENTUALLYKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEventuallyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:781:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:782:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:782:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:783:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEventuallyAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:808:1: entryRuleThisUntil returns [EObject current=null] : iv_ruleThisUntil= ruleThisUntil EOF ;
    public final EObject entryRuleThisUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisUntil = null;


        try {
            // InternalRequirementsModel.g:808:50: (iv_ruleThisUntil= ruleThisUntil EOF )
            // InternalRequirementsModel.g:809:2: iv_ruleThisUntil= ruleThisUntil EOF
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
    // InternalRequirementsModel.g:815:1: ruleThisUntil returns [EObject current=null] : (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleThisUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_leftExpression_1_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:821:2: ( (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) ) )
            // InternalRequirementsModel.g:822:2: (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) )
            {
            // InternalRequirementsModel.g:822:2: (otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) ) )
            // InternalRequirementsModel.g:823:3: otherlv_0= 'THIS' ( (lv_leftExpression_1_0= ruleExpression ) ) otherlv_2= 'UNTIL' ( (lv_rightExpression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getThisUntilAccess().getTHISKeyword_0());
            		
            // InternalRequirementsModel.g:827:3: ( (lv_leftExpression_1_0= ruleExpression ) )
            // InternalRequirementsModel.g:828:4: (lv_leftExpression_1_0= ruleExpression )
            {
            // InternalRequirementsModel.g:828:4: (lv_leftExpression_1_0= ruleExpression )
            // InternalRequirementsModel.g:829:5: lv_leftExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getThisUntilAccess().getLeftExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getThisUntilAccess().getUNTILKeyword_2());
            		
            // InternalRequirementsModel.g:850:3: ( (lv_rightExpression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:851:4: (lv_rightExpression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:851:4: (lv_rightExpression_3_0= ruleExpression )
            // InternalRequirementsModel.g:852:5: lv_rightExpression_3_0= ruleExpression
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
    // InternalRequirementsModel.g:873:1: entryRuleBefore returns [EObject current=null] : iv_ruleBefore= ruleBefore EOF ;
    public final EObject entryRuleBefore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBefore = null;


        try {
            // InternalRequirementsModel.g:873:47: (iv_ruleBefore= ruleBefore EOF )
            // InternalRequirementsModel.g:874:2: iv_ruleBefore= ruleBefore EOF
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
    // InternalRequirementsModel.g:880:1: ruleBefore returns [EObject current=null] : (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBefore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_event_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:886:2: ( (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalRequirementsModel.g:887:2: (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalRequirementsModel.g:887:2: (otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalRequirementsModel.g:888:3: otherlv_0= 'BEFORE' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBeforeAccess().getBEFOREKeyword_0());
            		
            // InternalRequirementsModel.g:892:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalRequirementsModel.g:893:4: (lv_event_1_0= ruleEvent )
            {
            // InternalRequirementsModel.g:893:4: (lv_event_1_0= ruleEvent )
            // InternalRequirementsModel.g:894:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getBeforeAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBeforeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:915:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:916:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:916:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:917:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBeforeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:942:1: entryRuleAfter returns [EObject current=null] : iv_ruleAfter= ruleAfter EOF ;
    public final EObject entryRuleAfter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfter = null;


        try {
            // InternalRequirementsModel.g:942:46: (iv_ruleAfter= ruleAfter EOF )
            // InternalRequirementsModel.g:943:2: iv_ruleAfter= ruleAfter EOF
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
    // InternalRequirementsModel.g:949:1: ruleAfter returns [EObject current=null] : (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAfter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_event_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:955:2: ( (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalRequirementsModel.g:956:2: (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalRequirementsModel.g:956:2: (otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalRequirementsModel.g:957:3: otherlv_0= 'AFTER' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAfterAccess().getAFTERKeyword_0());
            		
            // InternalRequirementsModel.g:961:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalRequirementsModel.g:962:4: (lv_event_1_0= ruleEvent )
            {
            // InternalRequirementsModel.g:962:4: (lv_event_1_0= ruleEvent )
            // InternalRequirementsModel.g:963:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getAfterAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAfterAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:984:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:985:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:985:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:986:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAfterAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:1011:1: entryRuleIn returns [EObject current=null] : iv_ruleIn= ruleIn EOF ;
    public final EObject entryRuleIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIn = null;


        try {
            // InternalRequirementsModel.g:1011:43: (iv_ruleIn= ruleIn EOF )
            // InternalRequirementsModel.g:1012:2: iv_ruleIn= ruleIn EOF
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
    // InternalRequirementsModel.g:1018:1: ruleIn returns [EObject current=null] : (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
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
            // InternalRequirementsModel.g:1024:2: ( (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRequirementsModel.g:1025:2: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:1025:2: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRequirementsModel.g:1026:3: otherlv_0= 'IN' otherlv_1= '(' ( (lv_deadline_2_0= ruleTimeInterval ) ) otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInAccess().getINKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:1034:3: ( (lv_deadline_2_0= ruleTimeInterval ) )
            // InternalRequirementsModel.g:1035:4: (lv_deadline_2_0= ruleTimeInterval )
            {
            // InternalRequirementsModel.g:1035:4: (lv_deadline_2_0= ruleTimeInterval )
            // InternalRequirementsModel.g:1036:5: lv_deadline_2_0= ruleTimeInterval
            {

            					newCompositeNode(grammarAccess.getInAccess().getDeadlineTimeIntervalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getInAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:1057:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalRequirementsModel.g:1058:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1058:4: (lv_expression_4_0= ruleExpression )
            // InternalRequirementsModel.g:1059:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:1084:1: entryRuleAsAsPossible returns [EObject current=null] : iv_ruleAsAsPossible= ruleAsAsPossible EOF ;
    public final EObject entryRuleAsAsPossible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsAsPossible = null;


        try {
            // InternalRequirementsModel.g:1084:53: (iv_ruleAsAsPossible= ruleAsAsPossible EOF )
            // InternalRequirementsModel.g:1085:2: iv_ruleAsAsPossible= ruleAsAsPossible EOF
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
    // InternalRequirementsModel.g:1091:1: ruleAsAsPossible returns [EObject current=null] : (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ',' ( (lv_membershipFunction_7_0= ruleMembershipFunction ) ) otherlv_8= ')' ) ;
    public final EObject ruleAsAsPossible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_timeFrequency_1_0 = null;

        EObject lv_quantity_5_0 = null;

        EObject lv_membershipFunction_7_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1097:2: ( (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ',' ( (lv_membershipFunction_7_0= ruleMembershipFunction ) ) otherlv_8= ')' ) )
            // InternalRequirementsModel.g:1098:2: (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ',' ( (lv_membershipFunction_7_0= ruleMembershipFunction ) ) otherlv_8= ')' )
            {
            // InternalRequirementsModel.g:1098:2: (otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ',' ( (lv_membershipFunction_7_0= ruleMembershipFunction ) ) otherlv_8= ')' )
            // InternalRequirementsModel.g:1099:3: otherlv_0= 'AS' ( (lv_timeFrequency_1_0= ruleTimeliness ) ) otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= '(' ( (lv_quantity_5_0= ruleQuantifiable ) ) otherlv_6= ',' ( (lv_membershipFunction_7_0= ruleMembershipFunction ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAsAsPossibleAccess().getASKeyword_0());
            		
            // InternalRequirementsModel.g:1103:3: ( (lv_timeFrequency_1_0= ruleTimeliness ) )
            // InternalRequirementsModel.g:1104:4: (lv_timeFrequency_1_0= ruleTimeliness )
            {
            // InternalRequirementsModel.g:1104:4: (lv_timeFrequency_1_0= ruleTimeliness )
            // InternalRequirementsModel.g:1105:5: lv_timeFrequency_1_0= ruleTimeliness
            {

            					newCompositeNode(grammarAccess.getAsAsPossibleAccess().getTimeFrequencyTimelinessEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAsAsPossibleAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAsAsPossibleAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAsAsPossibleAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRequirementsModel.g:1134:3: ( (lv_quantity_5_0= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1135:4: (lv_quantity_5_0= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1135:4: (lv_quantity_5_0= ruleQuantifiable )
            // InternalRequirementsModel.g:1136:5: lv_quantity_5_0= ruleQuantifiable
            {

            					newCompositeNode(grammarAccess.getAsAsPossibleAccess().getQuantityQuantifiableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_6=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getAsAsPossibleAccess().getCommaKeyword_6());
            		
            // InternalRequirementsModel.g:1157:3: ( (lv_membershipFunction_7_0= ruleMembershipFunction ) )
            // InternalRequirementsModel.g:1158:4: (lv_membershipFunction_7_0= ruleMembershipFunction )
            {
            // InternalRequirementsModel.g:1158:4: (lv_membershipFunction_7_0= ruleMembershipFunction )
            // InternalRequirementsModel.g:1159:5: lv_membershipFunction_7_0= ruleMembershipFunction
            {

            					newCompositeNode(grammarAccess.getAsAsPossibleAccess().getMembershipFunctionMembershipFunctionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_membershipFunction_7_0=ruleMembershipFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsAsPossibleRule());
            					}
            					set(
            						current,
            						"membershipFunction",
            						lv_membershipFunction_7_0,
            						"eu.coresense.requirements.RequirementsModel.MembershipFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAsAsPossibleAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalRequirementsModel.g:1184:1: entryRuleCompoundExpression returns [EObject current=null] : iv_ruleCompoundExpression= ruleCompoundExpression EOF ;
    public final EObject entryRuleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExpression = null;


        try {
            // InternalRequirementsModel.g:1184:59: (iv_ruleCompoundExpression= ruleCompoundExpression EOF )
            // InternalRequirementsModel.g:1185:2: iv_ruleCompoundExpression= ruleCompoundExpression EOF
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
    // InternalRequirementsModel.g:1191:1: ruleCompoundExpression returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil ) ;
    public final EObject ruleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_ThisUntil_2 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1197:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil ) )
            // InternalRequirementsModel.g:1198:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil )
            {
            // InternalRequirementsModel.g:1198:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_ThisUntil_2= ruleThisUntil )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRequirementsModel.g:1199:3: this_And_0= ruleAnd
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
                    // InternalRequirementsModel.g:1208:3: this_Or_1= ruleOr
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
                    // InternalRequirementsModel.g:1217:3: this_ThisUntil_2= ruleThisUntil
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
    // InternalRequirementsModel.g:1229:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRequirementsModel.g:1229:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRequirementsModel.g:1230:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRequirementsModel.g:1236:1: ruleStatement returns [EObject current=null] : (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanStatement_0 = null;

        EObject this_Proposition_1 = null;

        EObject this_Quantifiable_2 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1242:2: ( (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1243:2: (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1243:2: (this_BooleanStatement_0= ruleBooleanStatement | this_Proposition_1= ruleProposition | this_Quantifiable_2= ruleQuantifiable )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 40:
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
                    // InternalRequirementsModel.g:1244:3: this_BooleanStatement_0= ruleBooleanStatement
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
                    // InternalRequirementsModel.g:1253:3: this_Proposition_1= ruleProposition
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
                    // InternalRequirementsModel.g:1262:3: this_Quantifiable_2= ruleQuantifiable
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
    // InternalRequirementsModel.g:1274:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRequirementsModel.g:1274:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRequirementsModel.g:1275:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRequirementsModel.g:1281:1: ruleExpression returns [EObject current=null] : (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement ) ;
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
            // InternalRequirementsModel.g:1287:2: ( (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement ) )
            // InternalRequirementsModel.g:1288:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )
            {
            // InternalRequirementsModel.g:1288:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )
            int alt7=12;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalRequirementsModel.g:1289:3: this_Shall_0= ruleShall
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
                    // InternalRequirementsModel.g:1298:3: this_Negation_1= ruleNegation
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
                    // InternalRequirementsModel.g:1307:3: this_May_2= ruleMay
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
                    // InternalRequirementsModel.g:1316:3: this_Eventually_3= ruleEventually
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
                    // InternalRequirementsModel.g:1325:3: this_CompoundExpression_4= ruleCompoundExpression
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
                    // InternalRequirementsModel.g:1334:3: this_Before_5= ruleBefore
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
                    // InternalRequirementsModel.g:1343:3: this_After_6= ruleAfter
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
                    // InternalRequirementsModel.g:1352:3: this_In_7= ruleIn
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
                    // InternalRequirementsModel.g:1361:3: this_AsCloseFreq_8= ruleAsCloseFreq
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
                    // InternalRequirementsModel.g:1370:3: this_AsCloseLit_9= ruleAsCloseLit
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
                    // InternalRequirementsModel.g:1379:3: this_AsAsPossible_10= ruleAsAsPossible
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
                    // InternalRequirementsModel.g:1388:3: this_Statement_11= ruleStatement
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
    // InternalRequirementsModel.g:1400:1: entryRuleAsCloseFreq returns [EObject current=null] : iv_ruleAsCloseFreq= ruleAsCloseFreq EOF ;
    public final EObject entryRuleAsCloseFreq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseFreq = null;


        try {
            // InternalRequirementsModel.g:1400:52: (iv_ruleAsCloseFreq= ruleAsCloseFreq EOF )
            // InternalRequirementsModel.g:1401:2: iv_ruleAsCloseFreq= ruleAsCloseFreq EOF
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
    // InternalRequirementsModel.g:1407:1: ruleAsCloseFreq returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ) ;
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
            // InternalRequirementsModel.g:1413:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            // InternalRequirementsModel.g:1414:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )
            {
            // InternalRequirementsModel.g:1414:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )
            // InternalRequirementsModel.g:1415:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_frequency_6_0= ruleTime ) ) otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseFreqAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseFreqAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseFreqAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseFreqAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseFreqAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseFreqAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:1439:3: ( (lv_frequency_6_0= ruleTime ) )
            // InternalRequirementsModel.g:1440:4: (lv_frequency_6_0= ruleTime )
            {
            // InternalRequirementsModel.g:1440:4: (lv_frequency_6_0= ruleTime )
            // InternalRequirementsModel.g:1441:5: lv_frequency_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getFrequencyTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_7=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAsCloseFreqAccess().getCommaKeyword_7());
            		
            // InternalRequirementsModel.g:1462:3: ( (lv_expression_8_0= ruleExpression ) )
            // InternalRequirementsModel.g:1463:4: (lv_expression_8_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1463:4: (lv_expression_8_0= ruleExpression )
            // InternalRequirementsModel.g:1464:5: lv_expression_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAsCloseFreqAccess().getExpressionExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:1489:1: entryRuleAsCloseLit returns [EObject current=null] : iv_ruleAsCloseLit= ruleAsCloseLit EOF ;
    public final EObject entryRuleAsCloseLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsCloseLit = null;


        try {
            // InternalRequirementsModel.g:1489:51: (iv_ruleAsCloseLit= ruleAsCloseLit EOF )
            // InternalRequirementsModel.g:1490:2: iv_ruleAsCloseLit= ruleAsCloseLit EOF
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
    // InternalRequirementsModel.g:1496:1: ruleAsCloseLit returns [EObject current=null] : (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ',' ( (lv_membershipFunction_10_0= ruleMembershipFunction ) ) otherlv_11= ')' ) ;
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
        Token otherlv_11=null;
        EObject lv_quantity_6_0 = null;

        EObject lv_comparator_8_0 = null;

        EObject lv_membershipFunction_10_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1502:2: ( (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ',' ( (lv_membershipFunction_10_0= ruleMembershipFunction ) ) otherlv_11= ')' ) )
            // InternalRequirementsModel.g:1503:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ',' ( (lv_membershipFunction_10_0= ruleMembershipFunction ) ) otherlv_11= ')' )
            {
            // InternalRequirementsModel.g:1503:2: (otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ',' ( (lv_membershipFunction_10_0= ruleMembershipFunction ) ) otherlv_11= ')' )
            // InternalRequirementsModel.g:1504:3: otherlv_0= 'AS' otherlv_1= 'CLOSE' otherlv_2= 'AS' otherlv_3= 'POSSIBLE' otherlv_4= 'TO' otherlv_5= '(' ( (lv_quantity_6_0= ruleLiteral ) ) otherlv_7= ',' ( (lv_comparator_8_0= ruleQuantifiable ) ) otherlv_9= ',' ( (lv_membershipFunction_10_0= ruleMembershipFunction ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAsCloseLitAccess().getASKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAsCloseLitAccess().getCLOSEKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAsCloseLitAccess().getASKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAsCloseLitAccess().getPOSSIBLEKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAsCloseLitAccess().getTOKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAsCloseLitAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRequirementsModel.g:1528:3: ( (lv_quantity_6_0= ruleLiteral ) )
            // InternalRequirementsModel.g:1529:4: (lv_quantity_6_0= ruleLiteral )
            {
            // InternalRequirementsModel.g:1529:4: (lv_quantity_6_0= ruleLiteral )
            // InternalRequirementsModel.g:1530:5: lv_quantity_6_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getQuantityLiteralParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_7=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAsCloseLitAccess().getCommaKeyword_7());
            		
            // InternalRequirementsModel.g:1551:3: ( (lv_comparator_8_0= ruleQuantifiable ) )
            // InternalRequirementsModel.g:1552:4: (lv_comparator_8_0= ruleQuantifiable )
            {
            // InternalRequirementsModel.g:1552:4: (lv_comparator_8_0= ruleQuantifiable )
            // InternalRequirementsModel.g:1553:5: lv_comparator_8_0= ruleQuantifiable
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getComparatorQuantifiableParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_9=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getAsCloseLitAccess().getCommaKeyword_9());
            		
            // InternalRequirementsModel.g:1574:3: ( (lv_membershipFunction_10_0= ruleMembershipFunction ) )
            // InternalRequirementsModel.g:1575:4: (lv_membershipFunction_10_0= ruleMembershipFunction )
            {
            // InternalRequirementsModel.g:1575:4: (lv_membershipFunction_10_0= ruleMembershipFunction )
            // InternalRequirementsModel.g:1576:5: lv_membershipFunction_10_0= ruleMembershipFunction
            {

            					newCompositeNode(grammarAccess.getAsCloseLitAccess().getMembershipFunctionMembershipFunctionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_17);
            lv_membershipFunction_10_0=ruleMembershipFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsCloseLitRule());
            					}
            					set(
            						current,
            						"membershipFunction",
            						lv_membershipFunction_10_0,
            						"eu.coresense.requirements.RequirementsModel.MembershipFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAsCloseLitAccess().getRightParenthesisKeyword_11());
            		

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


    // $ANTLR start "entryRuleMembershipFunction"
    // InternalRequirementsModel.g:1601:1: entryRuleMembershipFunction returns [EObject current=null] : iv_ruleMembershipFunction= ruleMembershipFunction EOF ;
    public final EObject entryRuleMembershipFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipFunction = null;


        try {
            // InternalRequirementsModel.g:1601:59: (iv_ruleMembershipFunction= ruleMembershipFunction EOF )
            // InternalRequirementsModel.g:1602:2: iv_ruleMembershipFunction= ruleMembershipFunction EOF
            {
             newCompositeNode(grammarAccess.getMembershipFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembershipFunction=ruleMembershipFunction();

            state._fsp--;

             current =iv_ruleMembershipFunction; 
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
    // $ANTLR end "entryRuleMembershipFunction"


    // $ANTLR start "ruleMembershipFunction"
    // InternalRequirementsModel.g:1608:1: ruleMembershipFunction returns [EObject current=null] : (this_FuzzyTriangular_0= ruleFuzzyTriangular | this_FuzzyRightShoulder_1= ruleFuzzyRightShoulder | this_FuzzyLeftShoulder_2= ruleFuzzyLeftShoulder ) ;
    public final EObject ruleMembershipFunction() throws RecognitionException {
        EObject current = null;

        EObject this_FuzzyTriangular_0 = null;

        EObject this_FuzzyRightShoulder_1 = null;

        EObject this_FuzzyLeftShoulder_2 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:1614:2: ( (this_FuzzyTriangular_0= ruleFuzzyTriangular | this_FuzzyRightShoulder_1= ruleFuzzyRightShoulder | this_FuzzyLeftShoulder_2= ruleFuzzyLeftShoulder ) )
            // InternalRequirementsModel.g:1615:2: (this_FuzzyTriangular_0= ruleFuzzyTriangular | this_FuzzyRightShoulder_1= ruleFuzzyRightShoulder | this_FuzzyLeftShoulder_2= ruleFuzzyLeftShoulder )
            {
            // InternalRequirementsModel.g:1615:2: (this_FuzzyTriangular_0= ruleFuzzyTriangular | this_FuzzyRightShoulder_1= ruleFuzzyRightShoulder | this_FuzzyLeftShoulder_2= ruleFuzzyLeftShoulder )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRequirementsModel.g:1616:3: this_FuzzyTriangular_0= ruleFuzzyTriangular
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getFuzzyTriangularParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyTriangular_0=ruleFuzzyTriangular();

                    state._fsp--;


                    			current = this_FuzzyTriangular_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:1625:3: this_FuzzyRightShoulder_1= ruleFuzzyRightShoulder
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getFuzzyRightShoulderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyRightShoulder_1=ruleFuzzyRightShoulder();

                    state._fsp--;


                    			current = this_FuzzyRightShoulder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:1634:3: this_FuzzyLeftShoulder_2= ruleFuzzyLeftShoulder
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getFuzzyLeftShoulderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyLeftShoulder_2=ruleFuzzyLeftShoulder();

                    state._fsp--;


                    			current = this_FuzzyLeftShoulder_2;
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
    // $ANTLR end "ruleMembershipFunction"


    // $ANTLR start "entryRuleFuzzyTriangular"
    // InternalRequirementsModel.g:1646:1: entryRuleFuzzyTriangular returns [EObject current=null] : iv_ruleFuzzyTriangular= ruleFuzzyTriangular EOF ;
    public final EObject entryRuleFuzzyTriangular() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyTriangular = null;


        try {
            // InternalRequirementsModel.g:1646:56: (iv_ruleFuzzyTriangular= ruleFuzzyTriangular EOF )
            // InternalRequirementsModel.g:1647:2: iv_ruleFuzzyTriangular= ruleFuzzyTriangular EOF
            {
             newCompositeNode(grammarAccess.getFuzzyTriangularRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyTriangular=ruleFuzzyTriangular();

            state._fsp--;

             current =iv_ruleFuzzyTriangular; 
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
    // $ANTLR end "entryRuleFuzzyTriangular"


    // $ANTLR start "ruleFuzzyTriangular"
    // InternalRequirementsModel.g:1653:1: ruleFuzzyTriangular returns [EObject current=null] : (otherlv_0= 'FuzzyTriangular' otherlv_1= '(' ( (lv_a_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_b_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_c_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuzzyTriangular() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_a_2_0=null;
        Token otherlv_3=null;
        Token lv_b_4_0=null;
        Token otherlv_5=null;
        Token lv_c_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1659:2: ( (otherlv_0= 'FuzzyTriangular' otherlv_1= '(' ( (lv_a_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_b_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_c_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) )
            // InternalRequirementsModel.g:1660:2: (otherlv_0= 'FuzzyTriangular' otherlv_1= '(' ( (lv_a_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_b_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_c_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            {
            // InternalRequirementsModel.g:1660:2: (otherlv_0= 'FuzzyTriangular' otherlv_1= '(' ( (lv_a_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_b_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_c_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            // InternalRequirementsModel.g:1661:3: otherlv_0= 'FuzzyTriangular' otherlv_1= '(' ( (lv_a_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_b_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_c_6_0= RULE_DECIMAL ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyTriangularAccess().getFuzzyTriangularKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyTriangularAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:1669:3: ( (lv_a_2_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1670:4: (lv_a_2_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1670:4: (lv_a_2_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1671:5: lv_a_2_0= RULE_DECIMAL
            {
            lv_a_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_6); 

            					newLeafNode(lv_a_2_0, grammarAccess.getFuzzyTriangularAccess().getADECIMALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyTriangularRule());
            					}
            					setWithLastConsumed(
            						current,
            						"a",
            						lv_a_2_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzyTriangularAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:1691:3: ( (lv_b_4_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1692:4: (lv_b_4_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1692:4: (lv_b_4_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1693:5: lv_b_4_0= RULE_DECIMAL
            {
            lv_b_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_6); 

            					newLeafNode(lv_b_4_0, grammarAccess.getFuzzyTriangularAccess().getBDECIMALTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyTriangularRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_4_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyTriangularAccess().getCommaKeyword_5());
            		
            // InternalRequirementsModel.g:1713:3: ( (lv_c_6_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1714:4: (lv_c_6_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1714:4: (lv_c_6_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1715:5: lv_c_6_0= RULE_DECIMAL
            {
            lv_c_6_0=(Token)match(input,RULE_DECIMAL,FOLLOW_17); 

            					newLeafNode(lv_c_6_0, grammarAccess.getFuzzyTriangularAccess().getCDECIMALTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyTriangularRule());
            					}
            					setWithLastConsumed(
            						current,
            						"c",
            						lv_c_6_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFuzzyTriangularAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleFuzzyTriangular"


    // $ANTLR start "entryRuleFuzzyRightShoulder"
    // InternalRequirementsModel.g:1739:1: entryRuleFuzzyRightShoulder returns [EObject current=null] : iv_ruleFuzzyRightShoulder= ruleFuzzyRightShoulder EOF ;
    public final EObject entryRuleFuzzyRightShoulder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyRightShoulder = null;


        try {
            // InternalRequirementsModel.g:1739:59: (iv_ruleFuzzyRightShoulder= ruleFuzzyRightShoulder EOF )
            // InternalRequirementsModel.g:1740:2: iv_ruleFuzzyRightShoulder= ruleFuzzyRightShoulder EOF
            {
             newCompositeNode(grammarAccess.getFuzzyRightShoulderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyRightShoulder=ruleFuzzyRightShoulder();

            state._fsp--;

             current =iv_ruleFuzzyRightShoulder; 
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
    // $ANTLR end "entryRuleFuzzyRightShoulder"


    // $ANTLR start "ruleFuzzyRightShoulder"
    // InternalRequirementsModel.g:1746:1: ruleFuzzyRightShoulder returns [EObject current=null] : (otherlv_0= 'FuzzyRightShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuzzyRightShoulder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_foot_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_shoulder_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1752:2: ( (otherlv_0= 'FuzzyRightShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) )
            // InternalRequirementsModel.g:1753:2: (otherlv_0= 'FuzzyRightShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            {
            // InternalRequirementsModel.g:1753:2: (otherlv_0= 'FuzzyRightShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            // InternalRequirementsModel.g:1754:3: otherlv_0= 'FuzzyRightShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyRightShoulderAccess().getFuzzyRightShoulderKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyRightShoulderAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyRightShoulderAccess().getFootKeyword_2());
            		
            // InternalRequirementsModel.g:1766:3: ( (lv_foot_3_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1767:4: (lv_foot_3_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1767:4: (lv_foot_3_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1768:5: lv_foot_3_0= RULE_DECIMAL
            {
            lv_foot_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_6); 

            					newLeafNode(lv_foot_3_0, grammarAccess.getFuzzyRightShoulderAccess().getFootDECIMALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyRightShoulderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foot",
            						lv_foot_3_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyRightShoulderAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyRightShoulderAccess().getShoulderKeyword_5());
            		
            // InternalRequirementsModel.g:1792:3: ( (lv_shoulder_6_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1793:4: (lv_shoulder_6_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1793:4: (lv_shoulder_6_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1794:5: lv_shoulder_6_0= RULE_DECIMAL
            {
            lv_shoulder_6_0=(Token)match(input,RULE_DECIMAL,FOLLOW_17); 

            					newLeafNode(lv_shoulder_6_0, grammarAccess.getFuzzyRightShoulderAccess().getShoulderDECIMALTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyRightShoulderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shoulder",
            						lv_shoulder_6_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFuzzyRightShoulderAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleFuzzyRightShoulder"


    // $ANTLR start "entryRuleFuzzyLeftShoulder"
    // InternalRequirementsModel.g:1818:1: entryRuleFuzzyLeftShoulder returns [EObject current=null] : iv_ruleFuzzyLeftShoulder= ruleFuzzyLeftShoulder EOF ;
    public final EObject entryRuleFuzzyLeftShoulder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyLeftShoulder = null;


        try {
            // InternalRequirementsModel.g:1818:58: (iv_ruleFuzzyLeftShoulder= ruleFuzzyLeftShoulder EOF )
            // InternalRequirementsModel.g:1819:2: iv_ruleFuzzyLeftShoulder= ruleFuzzyLeftShoulder EOF
            {
             newCompositeNode(grammarAccess.getFuzzyLeftShoulderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyLeftShoulder=ruleFuzzyLeftShoulder();

            state._fsp--;

             current =iv_ruleFuzzyLeftShoulder; 
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
    // $ANTLR end "entryRuleFuzzyLeftShoulder"


    // $ANTLR start "ruleFuzzyLeftShoulder"
    // InternalRequirementsModel.g:1825:1: ruleFuzzyLeftShoulder returns [EObject current=null] : (otherlv_0= 'FuzzyLeftShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuzzyLeftShoulder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_foot_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_shoulder_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1831:2: ( (otherlv_0= 'FuzzyLeftShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) )
            // InternalRequirementsModel.g:1832:2: (otherlv_0= 'FuzzyLeftShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            {
            // InternalRequirementsModel.g:1832:2: (otherlv_0= 'FuzzyLeftShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
            // InternalRequirementsModel.g:1833:3: otherlv_0= 'FuzzyLeftShoulder' otherlv_1= '(' otherlv_2= 'foot=' ( (lv_foot_3_0= RULE_DECIMAL ) ) otherlv_4= ',' otherlv_5= 'shoulder=' ( (lv_shoulder_6_0= RULE_DECIMAL ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyLeftShoulderAccess().getFuzzyLeftShoulderKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyLeftShoulderAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyLeftShoulderAccess().getFootKeyword_2());
            		
            // InternalRequirementsModel.g:1845:3: ( (lv_foot_3_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1846:4: (lv_foot_3_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1846:4: (lv_foot_3_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1847:5: lv_foot_3_0= RULE_DECIMAL
            {
            lv_foot_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_6); 

            					newLeafNode(lv_foot_3_0, grammarAccess.getFuzzyLeftShoulderAccess().getFootDECIMALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyLeftShoulderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foot",
            						lv_foot_3_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyLeftShoulderAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzyLeftShoulderAccess().getShoulderKeyword_5());
            		
            // InternalRequirementsModel.g:1871:3: ( (lv_shoulder_6_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:1872:4: (lv_shoulder_6_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:1872:4: (lv_shoulder_6_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:1873:5: lv_shoulder_6_0= RULE_DECIMAL
            {
            lv_shoulder_6_0=(Token)match(input,RULE_DECIMAL,FOLLOW_17); 

            					newLeafNode(lv_shoulder_6_0, grammarAccess.getFuzzyLeftShoulderAccess().getShoulderDECIMALTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuzzyLeftShoulderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shoulder",
            						lv_shoulder_6_0,
            						"eu.coresense.requirements.RequirementsModel.DECIMAL");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFuzzyLeftShoulderAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleFuzzyLeftShoulder"


    // $ANTLR start "entryRuleQuantifiable"
    // InternalRequirementsModel.g:1897:1: entryRuleQuantifiable returns [EObject current=null] : iv_ruleQuantifiable= ruleQuantifiable EOF ;
    public final EObject entryRuleQuantifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiable = null;


        try {
            // InternalRequirementsModel.g:1897:53: (iv_ruleQuantifiable= ruleQuantifiable EOF )
            // InternalRequirementsModel.g:1898:2: iv_ruleQuantifiable= ruleQuantifiable EOF
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
    // InternalRequirementsModel.g:1904:1: ruleQuantifiable returns [EObject current=null] : (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleQuantifiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:1910:2: ( (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRequirementsModel.g:1911:2: (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRequirementsModel.g:1911:2: (otherlv_0= '^' ( (otherlv_1= RULE_ID ) ) )
            // InternalRequirementsModel.g:1912:3: otherlv_0= '^' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantifiableAccess().getCircumflexAccentKeyword_0());
            		
            // InternalRequirementsModel.g:1916:3: ( (otherlv_1= RULE_ID ) )
            // InternalRequirementsModel.g:1917:4: (otherlv_1= RULE_ID )
            {
            // InternalRequirementsModel.g:1917:4: (otherlv_1= RULE_ID )
            // InternalRequirementsModel.g:1918:5: otherlv_1= RULE_ID
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
    // InternalRequirementsModel.g:1933:1: entryRuleMay returns [EObject current=null] : iv_ruleMay= ruleMay EOF ;
    public final EObject entryRuleMay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMay = null;


        try {
            // InternalRequirementsModel.g:1933:44: (iv_ruleMay= ruleMay EOF )
            // InternalRequirementsModel.g:1934:2: iv_ruleMay= ruleMay EOF
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
    // InternalRequirementsModel.g:1940:1: ruleMay returns [EObject current=null] : (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' ) ;
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
            // InternalRequirementsModel.g:1946:2: ( (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' ) )
            // InternalRequirementsModel.g:1947:2: (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' )
            {
            // InternalRequirementsModel.g:1947:2: (otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')' )
            // InternalRequirementsModel.g:1948:3: otherlv_0= 'MAY' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_alternatives_4_0= ruleMayAlternative ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMayAccess().getMAYKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMayAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRequirementsModel.g:1956:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRequirementsModel.g:1957:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRequirementsModel.g:1957:4: (lv_expression_2_0= ruleExpression )
            // InternalRequirementsModel.g:1958:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMayAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getMayAccess().getCommaKeyword_3());
            		
            // InternalRequirementsModel.g:1979:3: ( (lv_alternatives_4_0= ruleMayAlternative ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRequirementsModel.g:1980:4: (lv_alternatives_4_0= ruleMayAlternative )
            	    {
            	    // InternalRequirementsModel.g:1980:4: (lv_alternatives_4_0= ruleMayAlternative )
            	    // InternalRequirementsModel.g:1981:5: lv_alternatives_4_0= ruleMayAlternative
            	    {

            	    					newCompositeNode(grammarAccess.getMayAccess().getAlternativesMayAlternativeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2006:1: entryRuleMayAlternative returns [EObject current=null] : iv_ruleMayAlternative= ruleMayAlternative EOF ;
    public final EObject entryRuleMayAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMayAlternative = null;


        try {
            // InternalRequirementsModel.g:2006:55: (iv_ruleMayAlternative= ruleMayAlternative EOF )
            // InternalRequirementsModel.g:2007:2: iv_ruleMayAlternative= ruleMayAlternative EOF
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
    // InternalRequirementsModel.g:2013:1: ruleMayAlternative returns [EObject current=null] : (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? ) ;
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
            // InternalRequirementsModel.g:2019:2: ( (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? ) )
            // InternalRequirementsModel.g:2020:2: (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? )
            {
            // InternalRequirementsModel.g:2020:2: (otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )? )
            // InternalRequirementsModel.g:2021:3: otherlv_0= 'OR' otherlv_1= 'MAY' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getMayAlternativeAccess().getORKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMayAlternativeAccess().getMAYKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMayAlternativeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRequirementsModel.g:2033:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalRequirementsModel.g:2034:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalRequirementsModel.g:2034:4: (lv_expression_3_0= ruleExpression )
            // InternalRequirementsModel.g:2035:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMayAlternativeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getMayAlternativeAccess().getRightParenthesisKeyword_4());
            		
            // InternalRequirementsModel.g:2056:3: (otherlv_5= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRequirementsModel.g:2057:4: otherlv_5= ','
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
    // InternalRequirementsModel.g:2066:1: entryRuleEvent returns [String current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final String entryRuleEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEvent = null;


        try {
            // InternalRequirementsModel.g:2066:45: (iv_ruleEvent= ruleEvent EOF )
            // InternalRequirementsModel.g:2067:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRequirementsModel.g:2073:1: ruleEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2079:2: (this_STRING_0= RULE_STRING )
            // InternalRequirementsModel.g:2080:2: this_STRING_0= RULE_STRING
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
    // InternalRequirementsModel.g:2090:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalRequirementsModel.g:2090:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalRequirementsModel.g:2091:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalRequirementsModel.g:2097:1: ruleTimeInterval returns [EObject current=null] : ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_after_0_0 = null;

        EObject lv_before_2_0 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:2103:2: ( ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) ) )
            // InternalRequirementsModel.g:2104:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            {
            // InternalRequirementsModel.g:2104:2: ( ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) ) )
            // InternalRequirementsModel.g:2105:3: ( (lv_after_0_0= ruleTime ) ) otherlv_1= '-' ( (lv_before_2_0= ruleTime ) )
            {
            // InternalRequirementsModel.g:2105:3: ( (lv_after_0_0= ruleTime ) )
            // InternalRequirementsModel.g:2106:4: (lv_after_0_0= ruleTime )
            {
            // InternalRequirementsModel.g:2106:4: (lv_after_0_0= ruleTime )
            // InternalRequirementsModel.g:2107:5: lv_after_0_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getTimeIntervalAccess().getAfterTimeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getHyphenMinusKeyword_1());
            		
            // InternalRequirementsModel.g:2128:3: ( (lv_before_2_0= ruleTime ) )
            // InternalRequirementsModel.g:2129:4: (lv_before_2_0= ruleTime )
            {
            // InternalRequirementsModel.g:2129:4: (lv_before_2_0= ruleTime )
            // InternalRequirementsModel.g:2130:5: lv_before_2_0= ruleTime
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
    // InternalRequirementsModel.g:2151:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRequirementsModel.g:2151:45: (iv_ruleTime= ruleTime EOF )
            // InternalRequirementsModel.g:2152:2: iv_ruleTime= ruleTime EOF
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
    // InternalRequirementsModel.g:2158:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) ;
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
            // InternalRequirementsModel.g:2164:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) ) )
            // InternalRequirementsModel.g:2165:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            {
            // InternalRequirementsModel.g:2165:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' ) )
            // InternalRequirementsModel.g:2166:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            {
            // InternalRequirementsModel.g:2166:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:2167:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:2167:4: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:2168:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            // InternalRequirementsModel.g:2184:3: (otherlv_1= 'hr' | otherlv_2= 'min' | otherlv_3= 's' | otherlv_4= 'ms' | otherlv_5= 'ns' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            case 46:
                {
                alt11=4;
                }
                break;
            case 47:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRequirementsModel.g:2185:4: otherlv_1= 'hr'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getHrKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2190:4: otherlv_2= 'min'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getMinKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2195:4: otherlv_3= 's'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getSKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2200:4: otherlv_4= 'ms'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getMsKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:2205:4: otherlv_5= 'ns'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2214:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRequirementsModel.g:2214:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRequirementsModel.g:2215:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalRequirementsModel.g:2221:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalRequirementsModel.g:2227:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalRequirementsModel.g:2228:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalRequirementsModel.g:2228:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case RULE_BOOLEAN:
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
                    // InternalRequirementsModel.g:2229:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalRequirementsModel.g:2238:3: this_DecimalLiteral_1= ruleDecimalLiteral
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
                    // InternalRequirementsModel.g:2247:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalRequirementsModel.g:2256:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
    // InternalRequirementsModel.g:2268:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalRequirementsModel.g:2268:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalRequirementsModel.g:2269:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalRequirementsModel.g:2275:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2281:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRequirementsModel.g:2282:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRequirementsModel.g:2282:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRequirementsModel.g:2283:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRequirementsModel.g:2283:3: (lv_value_0_0= RULE_INT )
            // InternalRequirementsModel.g:2284:4: lv_value_0_0= RULE_INT
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
    // InternalRequirementsModel.g:2303:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalRequirementsModel.g:2303:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalRequirementsModel.g:2304:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalRequirementsModel.g:2310:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2316:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalRequirementsModel.g:2317:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalRequirementsModel.g:2317:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalRequirementsModel.g:2318:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalRequirementsModel.g:2318:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalRequirementsModel.g:2319:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalRequirementsModel.g:2338:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalRequirementsModel.g:2338:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalRequirementsModel.g:2339:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalRequirementsModel.g:2345:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2351:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRequirementsModel.g:2352:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRequirementsModel.g:2352:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRequirementsModel.g:2353:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRequirementsModel.g:2353:3: (lv_value_0_0= RULE_STRING )
            // InternalRequirementsModel.g:2354:4: lv_value_0_0= RULE_STRING
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
    // InternalRequirementsModel.g:2373:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalRequirementsModel.g:2373:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalRequirementsModel.g:2374:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalRequirementsModel.g:2380:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2386:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRequirementsModel.g:2387:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRequirementsModel.g:2387:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRequirementsModel.g:2388:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRequirementsModel.g:2388:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRequirementsModel.g:2389:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalRequirementsModel.g:2408:1: ruleQualityAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) ;
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
            // InternalRequirementsModel.g:2414:2: ( ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) ) )
            // InternalRequirementsModel.g:2415:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            {
            // InternalRequirementsModel.g:2415:2: ( (enumLiteral_0= 'Functional suitability' ) | (enumLiteral_1= 'Performance efficiency' ) | (enumLiteral_2= 'Compatibility' ) | (enumLiteral_3= 'Interaction capability' ) | (enumLiteral_4= 'Reliability' ) | (enumLiteral_5= 'Security' ) | (enumLiteral_6= 'Maintainability' ) | (enumLiteral_7= 'Flexibility' ) | (enumLiteral_8= 'Safety' ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt13=1;
                }
                break;
            case 49:
                {
                alt13=2;
                }
                break;
            case 50:
                {
                alt13=3;
                }
                break;
            case 51:
                {
                alt13=4;
                }
                break;
            case 52:
                {
                alt13=5;
                }
                break;
            case 53:
                {
                alt13=6;
                }
                break;
            case 54:
                {
                alt13=7;
                }
                break;
            case 55:
                {
                alt13=8;
                }
                break;
            case 56:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRequirementsModel.g:2416:3: (enumLiteral_0= 'Functional suitability' )
                    {
                    // InternalRequirementsModel.g:2416:3: (enumLiteral_0= 'Functional suitability' )
                    // InternalRequirementsModel.g:2417:4: enumLiteral_0= 'Functional suitability'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualityAttributeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2424:3: (enumLiteral_1= 'Performance efficiency' )
                    {
                    // InternalRequirementsModel.g:2424:3: (enumLiteral_1= 'Performance efficiency' )
                    // InternalRequirementsModel.g:2425:4: enumLiteral_1= 'Performance efficiency'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQualityAttributeAccess().getPERFORMANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2432:3: (enumLiteral_2= 'Compatibility' )
                    {
                    // InternalRequirementsModel.g:2432:3: (enumLiteral_2= 'Compatibility' )
                    // InternalRequirementsModel.g:2433:4: enumLiteral_2= 'Compatibility'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQualityAttributeAccess().getCOMPATIBILITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2440:3: (enumLiteral_3= 'Interaction capability' )
                    {
                    // InternalRequirementsModel.g:2440:3: (enumLiteral_3= 'Interaction capability' )
                    // InternalRequirementsModel.g:2441:4: enumLiteral_3= 'Interaction capability'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQualityAttributeAccess().getINTERACTIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRequirementsModel.g:2448:3: (enumLiteral_4= 'Reliability' )
                    {
                    // InternalRequirementsModel.g:2448:3: (enumLiteral_4= 'Reliability' )
                    // InternalRequirementsModel.g:2449:4: enumLiteral_4= 'Reliability'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQualityAttributeAccess().getRELIABILITYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRequirementsModel.g:2456:3: (enumLiteral_5= 'Security' )
                    {
                    // InternalRequirementsModel.g:2456:3: (enumLiteral_5= 'Security' )
                    // InternalRequirementsModel.g:2457:4: enumLiteral_5= 'Security'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getQualityAttributeAccess().getSECURITYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRequirementsModel.g:2464:3: (enumLiteral_6= 'Maintainability' )
                    {
                    // InternalRequirementsModel.g:2464:3: (enumLiteral_6= 'Maintainability' )
                    // InternalRequirementsModel.g:2465:4: enumLiteral_6= 'Maintainability'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getQualityAttributeAccess().getMAINTAINABILITYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRequirementsModel.g:2472:3: (enumLiteral_7= 'Flexibility' )
                    {
                    // InternalRequirementsModel.g:2472:3: (enumLiteral_7= 'Flexibility' )
                    // InternalRequirementsModel.g:2473:4: enumLiteral_7= 'Flexibility'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getQualityAttributeAccess().getFLEXIBILITYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRequirementsModel.g:2480:3: (enumLiteral_8= 'Safety' )
                    {
                    // InternalRequirementsModel.g:2480:3: (enumLiteral_8= 'Safety' )
                    // InternalRequirementsModel.g:2481:4: enumLiteral_8= 'Safety'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2491:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2497:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) ) )
            // InternalRequirementsModel.g:2498:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            {
            // InternalRequirementsModel.g:2498:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt14=1;
                }
                break;
            case 58:
                {
                alt14=2;
                }
                break;
            case 59:
                {
                alt14=3;
                }
                break;
            case 60:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRequirementsModel.g:2499:3: (enumLiteral_0= '<' )
                    {
                    // InternalRequirementsModel.g:2499:3: (enumLiteral_0= '<' )
                    // InternalRequirementsModel.g:2500:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2507:3: (enumLiteral_1= '>' )
                    {
                    // InternalRequirementsModel.g:2507:3: (enumLiteral_1= '>' )
                    // InternalRequirementsModel.g:2508:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2515:3: (enumLiteral_2= '==' )
                    {
                    // InternalRequirementsModel.g:2515:3: (enumLiteral_2= '==' )
                    // InternalRequirementsModel.g:2516:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2523:3: (enumLiteral_3= '<>' )
                    {
                    // InternalRequirementsModel.g:2523:3: (enumLiteral_3= '<>' )
                    // InternalRequirementsModel.g:2524:4: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2534:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2540:2: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalRequirementsModel.g:2541:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalRequirementsModel.g:2541:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            else if ( (LA15_0==62) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRequirementsModel.g:2542:3: (enumLiteral_0= '&&' )
                    {
                    // InternalRequirementsModel.g:2542:3: (enumLiteral_0= '&&' )
                    // InternalRequirementsModel.g:2543:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2550:3: (enumLiteral_1= '||' )
                    {
                    // InternalRequirementsModel.g:2550:3: (enumLiteral_1= '||' )
                    // InternalRequirementsModel.g:2551:4: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

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
    // InternalRequirementsModel.g:2561:1: ruleTimeliness returns [Enumerator current=null] : ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) ) ;
    public final Enumerator ruleTimeliness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsModel.g:2567:2: ( ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) ) )
            // InternalRequirementsModel.g:2568:2: ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) )
            {
            // InternalRequirementsModel.g:2568:2: ( (enumLiteral_0= 'EARLY' ) | (enumLiteral_1= 'LATE' ) | (enumLiteral_2= 'MANY' ) | (enumLiteral_3= 'FEW' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt16=1;
                }
                break;
            case 64:
                {
                alt16=2;
                }
                break;
            case 65:
                {
                alt16=3;
                }
                break;
            case 66:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRequirementsModel.g:2569:3: (enumLiteral_0= 'EARLY' )
                    {
                    // InternalRequirementsModel.g:2569:3: (enumLiteral_0= 'EARLY' )
                    // InternalRequirementsModel.g:2570:4: enumLiteral_0= 'EARLY'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getEARLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimelinessAccess().getEARLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsModel.g:2577:3: (enumLiteral_1= 'LATE' )
                    {
                    // InternalRequirementsModel.g:2577:3: (enumLiteral_1= 'LATE' )
                    // InternalRequirementsModel.g:2578:4: enumLiteral_1= 'LATE'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getLATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimelinessAccess().getLATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsModel.g:2585:3: (enumLiteral_2= 'MANY' )
                    {
                    // InternalRequirementsModel.g:2585:3: (enumLiteral_2= 'MANY' )
                    // InternalRequirementsModel.g:2586:4: enumLiteral_2= 'MANY'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTimelinessAccess().getMANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimelinessAccess().getMANYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsModel.g:2593:3: (enumLiteral_3= 'FEW' )
                    {
                    // InternalRequirementsModel.g:2593:3: (enumLiteral_3= 'FEW' )
                    // InternalRequirementsModel.g:2594:4: enumLiteral_3= 'FEW'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\4\10\uffff\1\41\2\uffff\1\37\1\40\1\42\1\24\1\5\1\15\2\uffff";
    static final String dfa_3s = "\1\51\10\uffff\1\102\2\uffff\1\37\1\40\1\42\1\24\1\10\1\57\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\14\1\13\6\uffff\1\12\1\11";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\uffff\1\12\14\uffff\1\5\2\uffff\1\5\1\1\1\2\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\10\uffff\1\12\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\35\uffff\4\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\3\22\1\21",
            "\1\22\35\uffff\5\23",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1288:2: (this_Shall_0= ruleShall | this_Negation_1= ruleNegation | this_May_2= ruleMay | this_Eventually_3= ruleEventually | this_CompoundExpression_4= ruleCompoundExpression | this_Before_5= ruleBefore | this_After_6= ruleAfter | this_In_7= ruleIn | this_AsCloseFreq_8= ruleAsCloseFreq | this_AsCloseLit_9= ruleAsCloseLit | this_AsAsPossible_10= ruleAsAsPossible | this_Statement_11= ruleStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x01FF000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000300F7C80050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000009800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000F80000000000L});

}