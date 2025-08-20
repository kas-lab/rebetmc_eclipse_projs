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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature_model'", "'{'", "'}'", "'name'", "'root'", "'crossTreeConstraints'", "'BasicConstraint'", "'type'", "'rightFeature'", "'leftFeature'", "'mandatory'", "'selected'", "'Feature'", "'id'", "'children'", "','", "'Alternative'", "'OrGroup'", "'REQUIRES'", "'EXCLUDES'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fm_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:78:2: ( (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' ) )
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' )
            {
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' )
            // InternalFeatureModel.g:80:3: otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFeature_modelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalFeatureModel.g:88:3: ( (lv_fm_2_0= ruleFeatureModel ) )
            // InternalFeatureModel.g:89:4: (lv_fm_2_0= ruleFeatureModel )
            {
            // InternalFeatureModel.g:89:4: (lv_fm_2_0= ruleFeatureModel )
            // InternalFeatureModel.g:90:5: lv_fm_2_0= ruleFeatureModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_fm_2_0=ruleFeatureModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"fm",
              						lv_fm_2_0,
              						"eu.coresense.variability.FeatureModel.FeatureModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalFeatureModel.g:115:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalFeatureModel.g:115:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalFeatureModel.g:116:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:122:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )* ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_3_0 = null;

        EObject lv_crossTreeConstraints_5_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:128:2: ( (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )* ) )
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )* )
            {
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )* )
            // InternalFeatureModel.g:130:3: otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getNameKeyword_0());
              		
            }
            // InternalFeatureModel.g:134:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFeatureModel.g:135:4: (lv_name_1_0= ruleEString )
            {
            // InternalFeatureModel.g:135:4: (lv_name_1_0= ruleEString )
            // InternalFeatureModel.g:136:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFeatureModelAccess().getRootKeyword_2());
              		
            }
            // InternalFeatureModel.g:157:3: ( (lv_root_3_0= ruleFeature ) )
            // InternalFeatureModel.g:158:4: (lv_root_3_0= ruleFeature )
            {
            // InternalFeatureModel.g:158:4: (lv_root_3_0= ruleFeature )
            // InternalFeatureModel.g:159:5: lv_root_3_0= ruleFeature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_root_3_0=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_4());
              		
            }
            // InternalFeatureModel.g:180:3: ( (lv_crossTreeConstraints_5_0= ruleBasicConstraint ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureModel.g:181:4: (lv_crossTreeConstraints_5_0= ruleBasicConstraint )
            	    {
            	    // InternalFeatureModel.g:181:4: (lv_crossTreeConstraints_5_0= ruleBasicConstraint )
            	    // InternalFeatureModel.g:182:5: lv_crossTreeConstraints_5_0= ruleBasicConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_crossTreeConstraints_5_0=ruleBasicConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"crossTreeConstraints",
            	      						lv_crossTreeConstraints_5_0,
            	      						"eu.coresense.variability.FeatureModel.BasicConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleBasicConstraint"
    // InternalFeatureModel.g:203:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // InternalFeatureModel.g:203:56: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // InternalFeatureModel.g:204:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:210:1: ruleBasicConstraint returns [EObject current=null] : (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalFeatureModel.g:216:2: ( (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalFeatureModel.g:217:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalFeatureModel.g:217:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalFeatureModel.g:218:3: otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'rightFeature' ( ( ruleEString ) ) otherlv_6= 'leftFeature' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBasicConstraintAccess().getTypeKeyword_2());
              		
            }
            // InternalFeatureModel.g:230:3: ( (lv_type_3_0= ruleCrossTreeConstraintType ) )
            // InternalFeatureModel.g:231:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            {
            // InternalFeatureModel.g:231:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            // InternalFeatureModel.g:232:5: lv_type_3_0= ruleCrossTreeConstraintType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleCrossTreeConstraintType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4());
              		
            }
            // InternalFeatureModel.g:253:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:254:4: ( ruleEString )
            {
            // InternalFeatureModel.g:254:4: ( ruleEString )
            // InternalFeatureModel.g:255:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBasicConstraintRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6());
              		
            }
            // InternalFeatureModel.g:273:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:274:4: ( ruleEString )
            {
            // InternalFeatureModel.g:274:4: ( ruleEString )
            // InternalFeatureModel.g:275:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBasicConstraintRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleFeature"
    // InternalFeatureModel.g:297:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalFeatureModel.g:297:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalFeatureModel.g:298:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:304:1: ruleFeature returns [EObject current=null] : (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_Impl_0 = null;

        EObject this_Alternative_1 = null;

        EObject this_OrGroup_2 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:310:2: ( (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) )
            // InternalFeatureModel.g:311:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            {
            // InternalFeatureModel.g:311:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        switch ( input.LA(4) ) {
                        case 22:
                            {
                            switch ( input.LA(5) ) {
                            case 23:
                                {
                                alt2=1;
                                }
                                break;
                            case 27:
                                {
                                alt2=2;
                                }
                                break;
                            case 28:
                                {
                                alt2=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 23:
                            {
                            alt2=1;
                            }
                            break;
                        case 27:
                            {
                            alt2=2;
                            }
                            break;
                        case 28:
                            {
                            alt2=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 23:
                        {
                        alt2=1;
                        }
                        break;
                    case 27:
                        {
                        alt2=2;
                        }
                        break;
                    case 28:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }

                    }
                    break;
                case 22:
                    {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        switch ( input.LA(4) ) {
                        case 23:
                            {
                            alt2=1;
                            }
                            break;
                        case 27:
                            {
                            alt2=2;
                            }
                            break;
                        case 28:
                            {
                            alt2=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 23:
                        {
                        alt2=1;
                        }
                        break;
                    case 27:
                        {
                        alt2=2;
                        }
                        break;
                    case 28:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 27:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        alt2=1;
                        }
                        break;
                    case 27:
                        {
                        alt2=2;
                        }
                        break;
                    case 28:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

                        throw nvae;
                    }

                    }
                    break;
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 27:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFeatureModel.g:312:3: this_Feature_Impl_0= ruleFeature_Impl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Feature_Impl_0=ruleFeature_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Feature_Impl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:321:3: this_Alternative_1= ruleAlternative
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Alternative_1=ruleAlternative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Alternative_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:330:3: this_OrGroup_2= ruleOrGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OrGroup_2=ruleOrGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OrGroup_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:342:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // InternalFeatureModel.g:342:53: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // InternalFeatureModel.g:343:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature_Impl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:349:1: ruleFeature_Impl returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_8_0 = null;

        EObject lv_children_11_0 = null;

        EObject lv_children_13_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:355:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalFeatureModel.g:356:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalFeatureModel.g:356:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalFeatureModel.g:357:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalFeatureModel.g:357:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureModel.g:358:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:358:4: (otherlv_0= 'mandatory' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==21) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==21) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalFeatureModel.g:359:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:364:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:365:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:369:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:370:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeature_ImplRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:383:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:384:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:384:4: (otherlv_2= 'selected' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==22) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==22) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFeatureModel.g:385:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:390:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:391:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:395:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:396:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeature_ImplRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2());
              		
            }
            // InternalFeatureModel.g:413:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:414:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:414:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:415:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFeature_ImplAccess().getIdKeyword_5());
              		
            }
            // InternalFeatureModel.g:440:3: ( (lv_id_8_0= ruleEString ) )
            // InternalFeatureModel.g:441:4: (lv_id_8_0= ruleEString )
            {
            // InternalFeatureModel.g:441:4: (lv_id_8_0= ruleEString )
            // InternalFeatureModel.g:442:5: lv_id_8_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_id_8_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:459:3: (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:460:4: otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0());
                      			
                    }
                    otherlv_10=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalFeatureModel.g:468:4: ( (lv_children_11_0= ruleFeature ) )
                    // InternalFeatureModel.g:469:5: (lv_children_11_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:469:5: (lv_children_11_0= ruleFeature )
                    // InternalFeatureModel.g:470:6: lv_children_11_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_children_11_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    // InternalFeatureModel.g:487:4: (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureModel.g:488:5: otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) )
                    	    {
                    	    otherlv_12=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:492:5: ( (lv_children_13_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:493:6: (lv_children_13_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:493:6: (lv_children_13_0= ruleFeature )
                    	    // InternalFeatureModel.g:494:7: lv_children_13_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_children_13_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_13_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalFeatureModel.g:525:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFeatureModel.g:525:47: (iv_ruleEString= ruleEString EOF )
            // InternalFeatureModel.g:526:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:532:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:538:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFeatureModel.g:539:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFeatureModel.g:539:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureModel.g:540:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:548:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAlternative"
    // InternalFeatureModel.g:559:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalFeatureModel.g:559:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalFeatureModel.g:560:2: iv_ruleAlternative= ruleAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternative; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:566:1: ruleAlternative returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_8_0 = null;

        EObject lv_children_11_0 = null;

        EObject lv_children_13_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:572:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalFeatureModel.g:573:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalFeatureModel.g:573:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalFeatureModel.g:574:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalFeatureModel.g:574:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:575:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:575:4: (otherlv_0= 'mandatory' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==21) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFeatureModel.g:576:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:581:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:582:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:586:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:587:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAlternativeRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:600:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureModel.g:601:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:601:4: (otherlv_2= 'selected' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==22) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFeatureModel.g:602:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:607:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:608:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:612:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:613:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAlternativeRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getAlternativeKeyword_2());
              		
            }
            // InternalFeatureModel.g:630:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:631:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:631:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:632:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAlternativeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAlternativeAccess().getIdKeyword_5());
              		
            }
            // InternalFeatureModel.g:657:3: ( (lv_id_8_0= ruleEString ) )
            // InternalFeatureModel.g:658:4: (lv_id_8_0= ruleEString )
            {
            // InternalFeatureModel.g:658:4: (lv_id_8_0= ruleEString )
            // InternalFeatureModel.g:659:5: lv_id_8_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_id_8_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAlternativeRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:676:3: (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureModel.g:677:4: otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0());
                      			
                    }
                    otherlv_10=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalFeatureModel.g:685:4: ( (lv_children_11_0= ruleFeature ) )
                    // InternalFeatureModel.g:686:5: (lv_children_11_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:686:5: (lv_children_11_0= ruleFeature )
                    // InternalFeatureModel.g:687:6: lv_children_11_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_children_11_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    // InternalFeatureModel.g:704:4: (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==26) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFeatureModel.g:705:5: otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) )
                    	    {
                    	    otherlv_12=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:709:5: ( (lv_children_13_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:710:6: (lv_children_13_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:710:6: (lv_children_13_0= ruleFeature )
                    	    // InternalFeatureModel.g:711:7: lv_children_13_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_children_13_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_13_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOrGroup"
    // InternalFeatureModel.g:742:1: entryRuleOrGroup returns [EObject current=null] : iv_ruleOrGroup= ruleOrGroup EOF ;
    public final EObject entryRuleOrGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGroup = null;


        try {
            // InternalFeatureModel.g:742:48: (iv_ruleOrGroup= ruleOrGroup EOF )
            // InternalFeatureModel.g:743:2: iv_ruleOrGroup= ruleOrGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrGroup=ruleOrGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalFeatureModel.g:749:1: ruleOrGroup returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleOrGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_8_0 = null;

        EObject lv_children_11_0 = null;

        EObject lv_children_13_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:755:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalFeatureModel.g:756:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalFeatureModel.g:756:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalFeatureModel.g:757:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalFeatureModel.g:757:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureModel.g:758:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:758:4: (otherlv_0= 'mandatory' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==21) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalFeatureModel.g:759:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:764:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:765:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:769:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:770:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrGroupRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:783:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureModel.g:784:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:784:4: (otherlv_2= 'selected' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==22) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFeatureModel.g:785:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:790:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:791:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:795:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:796:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrGroupRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOrGroupAccess().getOrGroupKeyword_2());
              		
            }
            // InternalFeatureModel.g:813:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:814:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:814:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:815:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrGroupRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOrGroupAccess().getIdKeyword_5());
              		
            }
            // InternalFeatureModel.g:840:3: ( (lv_id_8_0= ruleEString ) )
            // InternalFeatureModel.g:841:4: (lv_id_8_0= ruleEString )
            {
            // InternalFeatureModel.g:841:4: (lv_id_8_0= ruleEString )
            // InternalFeatureModel.g:842:5: lv_id_8_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_id_8_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrGroupRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:859:3: (otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureModel.g:860:4: otherlv_9= 'children' otherlv_10= '{' ( (lv_children_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0());
                      			
                    }
                    otherlv_10=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalFeatureModel.g:868:4: ( (lv_children_11_0= ruleFeature ) )
                    // InternalFeatureModel.g:869:5: (lv_children_11_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:869:5: (lv_children_11_0= ruleFeature )
                    // InternalFeatureModel.g:870:6: lv_children_11_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_children_11_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    // InternalFeatureModel.g:887:4: (otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==26) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFeatureModel.g:888:5: otherlv_12= ',' ( (lv_children_13_0= ruleFeature ) )
                    	    {
                    	    otherlv_12=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:892:5: ( (lv_children_13_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:893:6: (lv_children_13_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:893:6: (lv_children_13_0= ruleFeature )
                    	    // InternalFeatureModel.g:894:7: lv_children_13_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_children_13_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrGroupRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_13_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrGroup"


    // $ANTLR start "ruleCrossTreeConstraintType"
    // InternalFeatureModel.g:925:1: ruleCrossTreeConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) ;
    public final Enumerator ruleCrossTreeConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:931:2: ( ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) )
            // InternalFeatureModel.g:932:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            {
            // InternalFeatureModel.g:932:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureModel.g:933:3: (enumLiteral_0= 'REQUIRES' )
                    {
                    // InternalFeatureModel.g:933:3: (enumLiteral_0= 'REQUIRES' )
                    // InternalFeatureModel.g:934:4: enumLiteral_0= 'REQUIRES'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:941:3: (enumLiteral_1= 'EXCLUDES' )
                    {
                    // InternalFeatureModel.g:941:3: (enumLiteral_1= 'EXCLUDES' )
                    // InternalFeatureModel.g:942:4: enumLiteral_1= 'EXCLUDES'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCrossTreeConstraintType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}