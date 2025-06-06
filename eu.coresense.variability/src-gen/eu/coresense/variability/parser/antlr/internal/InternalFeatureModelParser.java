package eu.coresense.variability.parser.antlr.internal;

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
import eu.coresense.variability.services.FeatureModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature_model'", "'{'", "'featureDefinitions'", "','", "'}'", "'name'", "'root'", "'features'", "'crossTreeConstraints'", "'BasicConstraint'", "'type'", "'rightFeature'", "'leftFeature'", "'mandatory'", "'selected'", "'Feature'", "'id'", "'children'", "'Alternative'", "'OrGroup'", "'REQUIRES'", "'EXCLUDES'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFeatureModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureModel.g"; }



     	private FeatureModelGrammarAccess grammarAccess;

        public InternalFeatureModelParser(TokenStream input, FeatureModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FeatureModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFeatureModel.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFeatureModel.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalFeatureModel.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFeatureModel.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'feature_model' otherlv_1= '{' otherlv_2= 'featureDefinitions' otherlv_3= '{' ( (lv_featureDefinitions_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )* otherlv_7= '}' ( (lv_fm_8_0= ruleFeatureModel ) ) otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_featureDefinitions_4_0 = null;

        EObject lv_featureDefinitions_6_0 = null;

        EObject lv_fm_8_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:78:2: ( (otherlv_0= 'feature_model' otherlv_1= '{' otherlv_2= 'featureDefinitions' otherlv_3= '{' ( (lv_featureDefinitions_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )* otherlv_7= '}' ( (lv_fm_8_0= ruleFeatureModel ) ) otherlv_9= '}' ) )
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' otherlv_2= 'featureDefinitions' otherlv_3= '{' ( (lv_featureDefinitions_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )* otherlv_7= '}' ( (lv_fm_8_0= ruleFeatureModel ) ) otherlv_9= '}' )
            {
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' otherlv_2= 'featureDefinitions' otherlv_3= '{' ( (lv_featureDefinitions_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )* otherlv_7= '}' ( (lv_fm_8_0= ruleFeatureModel ) ) otherlv_9= '}' )
            // InternalFeatureModel.g:80:3: otherlv_0= 'feature_model' otherlv_1= '{' otherlv_2= 'featureDefinitions' otherlv_3= '{' ( (lv_featureDefinitions_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )* otherlv_7= '}' ( (lv_fm_8_0= ruleFeatureModel ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFeature_modelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFeatureDefinitionsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFeatureModel.g:96:3: ( (lv_featureDefinitions_4_0= ruleFeature ) )
            // InternalFeatureModel.g:97:4: (lv_featureDefinitions_4_0= ruleFeature )
            {
            // InternalFeatureModel.g:97:4: (lv_featureDefinitions_4_0= ruleFeature )
            // InternalFeatureModel.g:98:5: lv_featureDefinitions_4_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_featureDefinitions_4_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"featureDefinitions",
            						lv_featureDefinitions_4_0,
            						"eu.coresense.variability.FeatureModel.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureModel.g:115:3: (otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureModel.g:116:4: otherlv_5= ',' ( (lv_featureDefinitions_6_0= ruleFeature ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFeatureModel.g:120:4: ( (lv_featureDefinitions_6_0= ruleFeature ) )
            	    // InternalFeatureModel.g:121:5: (lv_featureDefinitions_6_0= ruleFeature )
            	    {
            	    // InternalFeatureModel.g:121:5: (lv_featureDefinitions_6_0= ruleFeature )
            	    // InternalFeatureModel.g:122:6: lv_featureDefinitions_6_0= ruleFeature
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_featureDefinitions_6_0=ruleFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"featureDefinitions",
            	    							lv_featureDefinitions_6_0,
            	    							"eu.coresense.variability.FeatureModel.Feature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalFeatureModel.g:144:3: ( (lv_fm_8_0= ruleFeatureModel ) )
            // InternalFeatureModel.g:145:4: (lv_fm_8_0= ruleFeatureModel )
            {
            // InternalFeatureModel.g:145:4: (lv_fm_8_0= ruleFeatureModel )
            // InternalFeatureModel.g:146:5: lv_fm_8_0= ruleFeatureModel
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_fm_8_0=ruleFeatureModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"fm",
            						lv_fm_8_0,
            						"eu.coresense.variability.FeatureModel.FeatureModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalFeatureModel.g:171:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalFeatureModel.g:171:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalFeatureModel.g:172:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
             newCompositeNode(grammarAccess.getFeatureModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;

             current =iv_ruleFeatureModel; 
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
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalFeatureModel.g:178:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'features' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'crossTreeConstraints' ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )* ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_3_0 = null;

        EObject lv_crossTreeConstraints_7_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:184:2: ( (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'features' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'crossTreeConstraints' ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )* ) )
            // InternalFeatureModel.g:185:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'features' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'crossTreeConstraints' ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )* )
            {
            // InternalFeatureModel.g:185:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'features' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'crossTreeConstraints' ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )* )
            // InternalFeatureModel.g:186:3: otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'features' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'crossTreeConstraints' ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getNameKeyword_0());
            		
            // InternalFeatureModel.g:190:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFeatureModel.g:191:4: (lv_name_1_0= ruleEString )
            {
            // InternalFeatureModel.g:191:4: (lv_name_1_0= ruleEString )
            // InternalFeatureModel.g:192:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureModelAccess().getRootKeyword_2());
            		
            // InternalFeatureModel.g:213:3: ( (lv_root_3_0= ruleFeature ) )
            // InternalFeatureModel.g:214:4: (lv_root_3_0= ruleFeature )
            {
            // InternalFeatureModel.g:214:4: (lv_root_3_0= ruleFeature )
            // InternalFeatureModel.g:215:5: lv_root_3_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_root_3_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_3_0,
            						"eu.coresense.variability.FeatureModel.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFeatureModelAccess().getFeaturesKeyword_4());
            		
            // InternalFeatureModel.g:236:3: ( (otherlv_5= RULE_ID ) )
            // InternalFeatureModel.g:237:4: (otherlv_5= RULE_ID )
            {
            // InternalFeatureModel.g:237:4: (otherlv_5= RULE_ID )
            // InternalFeatureModel.g:238:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureModelRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getFeatureModelAccess().getFeaturesFeatureCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_6());
            		
            // InternalFeatureModel.g:253:3: ( (lv_crossTreeConstraints_7_0= ruleBasicConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFeatureModel.g:254:4: (lv_crossTreeConstraints_7_0= ruleBasicConstraint )
            	    {
            	    // InternalFeatureModel.g:254:4: (lv_crossTreeConstraints_7_0= ruleBasicConstraint )
            	    // InternalFeatureModel.g:255:5: lv_crossTreeConstraints_7_0= ruleBasicConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_crossTreeConstraints_7_0=ruleBasicConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"crossTreeConstraints",
            	    						lv_crossTreeConstraints_7_0,
            	    						"eu.coresense.variability.FeatureModel.BasicConstraint");
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
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleBasicConstraint"
    // InternalFeatureModel.g:276:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // InternalFeatureModel.g:276:56: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // InternalFeatureModel.g:277:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
             newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;

             current =iv_ruleBasicConstraint; 
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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // InternalFeatureModel.g:283:1: ruleBasicConstraint returns [EObject current=null] : (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:289:2: ( (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalFeatureModel.g:290:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalFeatureModel.g:290:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalFeatureModel.g:291:3: otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBasicConstraintAccess().getTypeKeyword_2());
            		
            // InternalFeatureModel.g:303:3: ( (lv_type_3_0= ruleCrossTreeConstraintType ) )
            // InternalFeatureModel.g:304:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            {
            // InternalFeatureModel.g:304:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            // InternalFeatureModel.g:305:5: lv_type_3_0= ruleCrossTreeConstraintType
            {

            					newCompositeNode(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_3_0=ruleCrossTreeConstraintType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicConstraintRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"eu.coresense.variability.FeatureModel.CrossTreeConstraintType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4());
            		
            // InternalFeatureModel.g:326:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:327:4: ( ruleEString )
            {
            // InternalFeatureModel.g:327:4: ( ruleEString )
            // InternalFeatureModel.g:328:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6());
            		
            // InternalFeatureModel.g:346:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:347:4: ( ruleEString )
            {
            // InternalFeatureModel.g:347:4: ( ruleEString )
            // InternalFeatureModel.g:348:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleFeature"
    // InternalFeatureModel.g:370:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalFeatureModel.g:370:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalFeatureModel.g:371:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalFeatureModel.g:377:1: ruleFeature returns [EObject current=null] : (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_Impl_0 = null;

        EObject this_Alternative_1 = null;

        EObject this_OrGroup_2 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:383:2: ( (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) )
            // InternalFeatureModel.g:384:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            {
            // InternalFeatureModel.g:384:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==25) ) {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt3=1;
                        }
                        break;
                    case 30:
                        {
                        alt3=3;
                        }
                        break;
                    case 29:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureModel.g:385:3: this_Feature_Impl_0= ruleFeature_Impl
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feature_Impl_0=ruleFeature_Impl();

                    state._fsp--;


                    			current = this_Feature_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:394:3: this_Alternative_1= ruleAlternative
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alternative_1=ruleAlternative();

                    state._fsp--;


                    			current = this_Alternative_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:403:3: this_OrGroup_2= ruleOrGroup
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrGroup_2=ruleOrGroup();

                    state._fsp--;


                    			current = this_OrGroup_2;
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:415:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // InternalFeatureModel.g:415:53: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // InternalFeatureModel.g:416:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
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
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // InternalFeatureModel.g:422:1: ruleFeature_Impl returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token lv_selected_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_11_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:428:2: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalFeatureModel.g:429:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalFeatureModel.g:429:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalFeatureModel.g:430:3: ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalFeatureModel.g:430:3: ( (lv_mandatory_0_0= 'mandatory' ) )
            // InternalFeatureModel.g:431:4: (lv_mandatory_0_0= 'mandatory' )
            {
            // InternalFeatureModel.g:431:4: (lv_mandatory_0_0= 'mandatory' )
            // InternalFeatureModel.g:432:5: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,24,FOLLOW_19); 

            					newLeafNode(lv_mandatory_0_0, grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeature_ImplRule());
            					}
            					setWithLastConsumed(current, "mandatory", lv_mandatory_0_0 != null, "mandatory");
            				

            }


            }

            // InternalFeatureModel.g:444:3: ( (lv_selected_1_0= 'selected' ) )
            // InternalFeatureModel.g:445:4: (lv_selected_1_0= 'selected' )
            {
            // InternalFeatureModel.g:445:4: (lv_selected_1_0= 'selected' )
            // InternalFeatureModel.g:446:5: lv_selected_1_0= 'selected'
            {
            lv_selected_1_0=(Token)match(input,25,FOLLOW_20); 

            					newLeafNode(lv_selected_1_0, grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeature_ImplRule());
            					}
            					setWithLastConsumed(current, "selected", lv_selected_1_0 != null, "selected");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2());
            		
            // InternalFeatureModel.g:462:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFeatureModel.g:463:4: (lv_name_3_0= ruleEString )
            {
            // InternalFeatureModel.g:463:4: (lv_name_3_0= ruleEString )
            // InternalFeatureModel.g:464:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFeature_ImplAccess().getIdKeyword_5());
            		
            // InternalFeatureModel.g:489:3: ( (lv_id_6_0= ruleEString ) )
            // InternalFeatureModel.g:490:4: (lv_id_6_0= ruleEString )
            {
            // InternalFeatureModel.g:490:4: (lv_id_6_0= ruleEString )
            // InternalFeatureModel.g:491:5: lv_id_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_id_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_6_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureModel.g:508:3: (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureModel.g:509:4: otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalFeatureModel.g:517:4: ( (lv_children_9_0= ruleFeature ) )
                    // InternalFeatureModel.g:518:5: (lv_children_9_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:518:5: (lv_children_9_0= ruleFeature )
                    // InternalFeatureModel.g:519:6: lv_children_9_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_children_9_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_9_0,
                    							"eu.coresense.variability.FeatureModel.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFeatureModel.g:536:4: (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFeatureModel.g:537:5: otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalFeatureModel.g:541:5: ( (lv_children_11_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:542:6: (lv_children_11_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:542:6: (lv_children_11_0= ruleFeature )
                    	    // InternalFeatureModel.g:543:7: lv_children_11_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_children_11_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_11_0,
                    	    								"eu.coresense.variability.FeatureModel.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalFeatureModel.g:574:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFeatureModel.g:574:47: (iv_ruleEString= ruleEString EOF )
            // InternalFeatureModel.g:575:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFeatureModel.g:581:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:587:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFeatureModel.g:588:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFeatureModel.g:588:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
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
                    // InternalFeatureModel.g:589:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:597:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAlternative"
    // InternalFeatureModel.g:608:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalFeatureModel.g:608:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalFeatureModel.g:609:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalFeatureModel.g:615:1: ruleAlternative returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Alternative' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token lv_selected_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_11_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:621:2: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Alternative' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalFeatureModel.g:622:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Alternative' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalFeatureModel.g:622:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Alternative' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalFeatureModel.g:623:3: ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'Alternative' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalFeatureModel.g:623:3: ( (lv_mandatory_0_0= 'mandatory' ) )
            // InternalFeatureModel.g:624:4: (lv_mandatory_0_0= 'mandatory' )
            {
            // InternalFeatureModel.g:624:4: (lv_mandatory_0_0= 'mandatory' )
            // InternalFeatureModel.g:625:5: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,24,FOLLOW_19); 

            					newLeafNode(lv_mandatory_0_0, grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlternativeRule());
            					}
            					setWithLastConsumed(current, "mandatory", lv_mandatory_0_0 != null, "mandatory");
            				

            }


            }

            // InternalFeatureModel.g:637:3: ( (lv_selected_1_0= 'selected' ) )
            // InternalFeatureModel.g:638:4: (lv_selected_1_0= 'selected' )
            {
            // InternalFeatureModel.g:638:4: (lv_selected_1_0= 'selected' )
            // InternalFeatureModel.g:639:5: lv_selected_1_0= 'selected'
            {
            lv_selected_1_0=(Token)match(input,25,FOLLOW_23); 

            					newLeafNode(lv_selected_1_0, grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlternativeRule());
            					}
            					setWithLastConsumed(current, "selected", lv_selected_1_0 != null, "selected");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getAlternativeKeyword_2());
            		
            // InternalFeatureModel.g:655:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFeatureModel.g:656:4: (lv_name_3_0= ruleEString )
            {
            // InternalFeatureModel.g:656:4: (lv_name_3_0= ruleEString )
            // InternalFeatureModel.g:657:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAlternativeAccess().getIdKeyword_5());
            		
            // InternalFeatureModel.g:682:3: ( (lv_id_6_0= ruleEString ) )
            // InternalFeatureModel.g:683:4: (lv_id_6_0= ruleEString )
            {
            // InternalFeatureModel.g:683:4: (lv_id_6_0= ruleEString )
            // InternalFeatureModel.g:684:5: lv_id_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_id_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_6_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureModel.g:701:3: (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:702:4: otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalFeatureModel.g:710:4: ( (lv_children_9_0= ruleFeature ) )
                    // InternalFeatureModel.g:711:5: (lv_children_9_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:711:5: (lv_children_9_0= ruleFeature )
                    // InternalFeatureModel.g:712:6: lv_children_9_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_children_9_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_9_0,
                    							"eu.coresense.variability.FeatureModel.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFeatureModel.g:729:4: (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureModel.g:730:5: otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalFeatureModel.g:734:5: ( (lv_children_11_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:735:6: (lv_children_11_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:735:6: (lv_children_11_0= ruleFeature )
                    	    // InternalFeatureModel.g:736:7: lv_children_11_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_children_11_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_11_0,
                    	    								"eu.coresense.variability.FeatureModel.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOrGroup"
    // InternalFeatureModel.g:767:1: entryRuleOrGroup returns [EObject current=null] : iv_ruleOrGroup= ruleOrGroup EOF ;
    public final EObject entryRuleOrGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGroup = null;


        try {
            // InternalFeatureModel.g:767:48: (iv_ruleOrGroup= ruleOrGroup EOF )
            // InternalFeatureModel.g:768:2: iv_ruleOrGroup= ruleOrGroup EOF
            {
             newCompositeNode(grammarAccess.getOrGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrGroup=ruleOrGroup();

            state._fsp--;

             current =iv_ruleOrGroup; 
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
    // $ANTLR end "entryRuleOrGroup"


    // $ANTLR start "ruleOrGroup"
    // InternalFeatureModel.g:774:1: ruleOrGroup returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'OrGroup' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleOrGroup() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token lv_selected_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_11_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:780:2: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'OrGroup' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalFeatureModel.g:781:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'OrGroup' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalFeatureModel.g:781:2: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'OrGroup' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalFeatureModel.g:782:3: ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_selected_1_0= 'selected' ) ) otherlv_2= 'OrGroup' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalFeatureModel.g:782:3: ( (lv_mandatory_0_0= 'mandatory' ) )
            // InternalFeatureModel.g:783:4: (lv_mandatory_0_0= 'mandatory' )
            {
            // InternalFeatureModel.g:783:4: (lv_mandatory_0_0= 'mandatory' )
            // InternalFeatureModel.g:784:5: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,24,FOLLOW_19); 

            					newLeafNode(lv_mandatory_0_0, grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrGroupRule());
            					}
            					setWithLastConsumed(current, "mandatory", lv_mandatory_0_0 != null, "mandatory");
            				

            }


            }

            // InternalFeatureModel.g:796:3: ( (lv_selected_1_0= 'selected' ) )
            // InternalFeatureModel.g:797:4: (lv_selected_1_0= 'selected' )
            {
            // InternalFeatureModel.g:797:4: (lv_selected_1_0= 'selected' )
            // InternalFeatureModel.g:798:5: lv_selected_1_0= 'selected'
            {
            lv_selected_1_0=(Token)match(input,25,FOLLOW_24); 

            					newLeafNode(lv_selected_1_0, grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrGroupRule());
            					}
            					setWithLastConsumed(current, "selected", lv_selected_1_0 != null, "selected");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOrGroupAccess().getOrGroupKeyword_2());
            		
            // InternalFeatureModel.g:814:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFeatureModel.g:815:4: (lv_name_3_0= ruleEString )
            {
            // InternalFeatureModel.g:815:4: (lv_name_3_0= ruleEString )
            // InternalFeatureModel.g:816:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getOrGroupAccess().getIdKeyword_5());
            		
            // InternalFeatureModel.g:841:3: ( (lv_id_6_0= ruleEString ) )
            // InternalFeatureModel.g:842:4: (lv_id_6_0= ruleEString )
            {
            // InternalFeatureModel.g:842:4: (lv_id_6_0= ruleEString )
            // InternalFeatureModel.g:843:5: lv_id_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_id_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrGroupRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_6_0,
            						"eu.coresense.variability.FeatureModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureModel.g:860:3: (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureModel.g:861:4: otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= ruleFeature ) ) (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalFeatureModel.g:869:4: ( (lv_children_9_0= ruleFeature ) )
                    // InternalFeatureModel.g:870:5: (lv_children_9_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:870:5: (lv_children_9_0= ruleFeature )
                    // InternalFeatureModel.g:871:6: lv_children_9_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_children_9_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrGroupRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_9_0,
                    							"eu.coresense.variability.FeatureModel.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFeatureModel.g:888:4: (otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFeatureModel.g:889:5: otherlv_10= ',' ( (lv_children_11_0= ruleFeature ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalFeatureModel.g:893:5: ( (lv_children_11_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:894:6: (lv_children_11_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:894:6: (lv_children_11_0= ruleFeature )
                    	    // InternalFeatureModel.g:895:7: lv_children_11_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_children_11_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_11_0,
                    	    								"eu.coresense.variability.FeatureModel.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOrGroup"


    // $ANTLR start "ruleCrossTreeConstraintType"
    // InternalFeatureModel.g:926:1: ruleCrossTreeConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) ;
    public final Enumerator ruleCrossTreeConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:932:2: ( ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) )
            // InternalFeatureModel.g:933:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            {
            // InternalFeatureModel.g:933:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:934:3: (enumLiteral_0= 'REQUIRES' )
                    {
                    // InternalFeatureModel.g:934:3: (enumLiteral_0= 'REQUIRES' )
                    // InternalFeatureModel.g:935:4: enumLiteral_0= 'REQUIRES'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:942:3: (enumLiteral_1= 'EXCLUDES' )
                    {
                    // InternalFeatureModel.g:942:3: (enumLiteral_1= 'EXCLUDES' )
                    // InternalFeatureModel.g:943:4: enumLiteral_1= 'EXCLUDES'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCrossTreeConstraintType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});

}