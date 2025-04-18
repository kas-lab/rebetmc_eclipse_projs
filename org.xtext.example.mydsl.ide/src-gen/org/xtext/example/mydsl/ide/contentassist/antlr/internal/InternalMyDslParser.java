package org.xtext.example.mydsl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "SetParameter", "ParameterAny", "Ros_system", "GraphName", "Float32_1", "Float64_1", "Reconfigs", "Default", "Duration", "Feedback", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Import", "Int8_1", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Array", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "RightParenthesis", "Comma", "Colon", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Import=40;
    public static final int Float32_1=11;
    public static final int Node=63;
    public static final int RULE_DATE_TIME=85;
    public static final int Uint64_1=20;
    public static final int String=34;
    public static final int Int16=49;
    public static final int Float32=23;
    public static final int Goal=60;
    public static final int Bool=57;
    public static final int Uint16=44;
    public static final int Boolean=21;
    public static final int Uint8=53;
    public static final int RULE_ID=86;
    public static final int RULE_DIGIT=75;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=25;
    public static final int Header=33;
    public static final int RULE_INT=88;
    public static final int Byte=58;
    public static final int RULE_ML_COMMENT=95;
    public static final int LeftSquareBracket=73;
    public static final int Ros_system=9;
    public static final int Base64=31;
    public static final int Comma=70;
    public static final int RULE_MESSAGE_ASIGMENT=89;
    public static final int LeftSquareBracketRightSquareBracket=68;
    public static final int Int32=50;
    public static final int Char=59;
    public static final int RULE_DECINT=78;
    public static final int Uint32=45;
    public static final int RULE_HOUR=83;
    public static final int Int8=61;
    public static final int Default=14;
    public static final int Int8_1=41;
    public static final int Uint16_1=18;
    public static final int Semicolon=72;
    public static final int Type=65;
    public static final int Float64=24;
    public static final int Int32_1=26;
    public static final int RULE_BINARY=76;
    public static final int String_1=43;
    public static final int String_2=17;
    public static final int RULE_DAY=80;
    public static final int RULE_BEGIN=90;
    public static final int RULE_BOOLEAN=77;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=82;
    public static final int SetParameter=7;
    public static final int Result=42;
    public static final int Name=62;
    public static final int RULE_MIN_SEC=84;
    public static final int Char_1=39;
    public static final int ParameterAny=8;
    public static final int List=56;
    public static final int RightSquareBracket=74;
    public static final int PrivateNamespace=5;
    public static final int GraphName=10;
    public static final int Byte_1=38;
    public static final int Float64_1=12;
    public static final int RightParenthesis=69;
    public static final int Duration=15;
    public static final int Uint32_1=19;
    public static final int Double=32;
    public static final int Type_1=52;
    public static final int Value=54;
    public static final int Uint64=46;
    public static final int Action=36;
    public static final int RULE_END=91;
    public static final int Message=28;
    public static final int Value_1=47;
    public static final int Time=64;
    public static final int RULE_STRING=87;
    public static final int Bool_1=37;
    public static final int Reconfigs=13;
    public static final int Any=66;
    public static final int Struct=35;
    public static final int RULE_SL_COMMENT=92;
    public static final int Uint8_1=30;
    public static final int RULE_DOUBLE=79;
    public static final int Feedback=16;
    public static final int RULE_ROS_CONVENTION_A=93;
    public static final int RULE_ROS_CONVENTION_PARAM=94;
    public static final int Colon=71;
    public static final int EOF=-1;
    public static final int Ns=67;
    public static final int RULE_WS=96;
    public static final int Int64_1=27;
    public static final int Service=29;
    public static final int RULE_ANY_OTHER=97;
    public static final int Date=55;
    public static final int Integer=22;
    public static final int Array=48;
    public static final int Int64=51;
    public static final int RULE_MONTH=81;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDslParser.g"; }


    	private MyDslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftSquareBracketRightSquareBracket", "'[]'");
    		tokenNameToValue.put("Any", "'Any'");
    		tokenNameToValue.put("Ns", "'ns:'");
    		tokenNameToValue.put("Date", "'Date'");
    		tokenNameToValue.put("List", "'List'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Byte", "'byte'");
    		tokenNameToValue.put("Char", "'char'");
    		tokenNameToValue.put("Goal", "'goal'");
    		tokenNameToValue.put("Int8", "'int8'");
    		tokenNameToValue.put("Name", "'name'");
    		tokenNameToValue.put("Node", "'node'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("Type", "'type'");
    		tokenNameToValue.put("Array", "'Array'");
    		tokenNameToValue.put("Int16", "'int16'");
    		tokenNameToValue.put("Int32", "'int32'");
    		tokenNameToValue.put("Int64", "'int64'");
    		tokenNameToValue.put("Type_1", "'type:'");
    		tokenNameToValue.put("Uint8", "'uint8'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("Base64", "'Base64'");
    		tokenNameToValue.put("Double", "'Double'");
    		tokenNameToValue.put("Header", "'Header'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Struct", "'Struct'");
    		tokenNameToValue.put("Action", "'action'");
    		tokenNameToValue.put("Bool_1", "'bool[]'");
    		tokenNameToValue.put("Byte_1", "'byte[]'");
    		tokenNameToValue.put("Char_1", "'char[]'");
    		tokenNameToValue.put("Import", "'import'");
    		tokenNameToValue.put("Int8_1", "'int8[]'");
    		tokenNameToValue.put("Result", "'result'");
    		tokenNameToValue.put("String_1", "'string'");
    		tokenNameToValue.put("Uint16", "'uint16'");
    		tokenNameToValue.put("Uint32", "'uint32'");
    		tokenNameToValue.put("Uint64", "'uint64'");
    		tokenNameToValue.put("Value_1", "'value:'");
    		tokenNameToValue.put("Boolean", "'Boolean'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Float32", "'float32'");
    		tokenNameToValue.put("Float64", "'float64'");
    		tokenNameToValue.put("Int16_1", "'int16[]'");
    		tokenNameToValue.put("Int32_1", "'int32[]'");
    		tokenNameToValue.put("Int64_1", "'int64[]'");
    		tokenNameToValue.put("Message", "'message'");
    		tokenNameToValue.put("Service", "'service'");
    		tokenNameToValue.put("Uint8_1", "'uint8[]'");
    		tokenNameToValue.put("Default", "'default:'");
    		tokenNameToValue.put("Duration", "'duration'");
    		tokenNameToValue.put("Feedback", "'feedback'");
    		tokenNameToValue.put("String_2", "'string[]'");
    		tokenNameToValue.put("Uint16_1", "'uint16[]'");
    		tokenNameToValue.put("Uint32_1", "'uint32[]'");
    		tokenNameToValue.put("Uint64_1", "'uint64[]'");
    		tokenNameToValue.put("GraphName", "'GraphName'");
    		tokenNameToValue.put("Float32_1", "'float32[]'");
    		tokenNameToValue.put("Float64_1", "'float64[]'");
    		tokenNameToValue.put("Reconfigs", "'reconfigs'");
    		tokenNameToValue.put("Ros_system", "'ros_system'");
    		tokenNameToValue.put("ParameterAny", "'ParameterAny'");
    		tokenNameToValue.put("SetParameter", "'SetParameter('");
    		tokenNameToValue.put("GlobalNamespace", "'GlobalNamespace'");
    		tokenNameToValue.put("PrivateNamespace", "'PrivateNamespace'");
    		tokenNameToValue.put("RelativeNamespace", "'RelativeNamespace'");
    	}

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDslParser.g:126:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDslParser.g:127:1: ( ruleModel EOF )
            // InternalMyDslParser.g:128:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDslParser.g:135:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:139:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDslParser.g:140:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDslParser.g:140:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDslParser.g:141:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDslParser.g:142:3: ( rule__Model__Group__0 )
            // InternalMyDslParser.g:142:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalMyDslParser.g:151:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyDslParser.g:152:1: ( ruleImport EOF )
            // InternalMyDslParser.g:153:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyDslParser.g:160:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:164:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyDslParser.g:165:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyDslParser.g:165:2: ( ( rule__Import__Group__0 ) )
            // InternalMyDslParser.g:166:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyDslParser.g:167:3: ( rule__Import__Group__0 )
            // InternalMyDslParser.g:167:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleReconfiguration"
    // InternalMyDslParser.g:176:1: entryRuleReconfiguration : ruleReconfiguration EOF ;
    public final void entryRuleReconfiguration() throws RecognitionException {
        try {
            // InternalMyDslParser.g:177:1: ( ruleReconfiguration EOF )
            // InternalMyDslParser.g:178:1: ruleReconfiguration EOF
            {
             before(grammarAccess.getReconfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleReconfiguration();

            state._fsp--;

             after(grammarAccess.getReconfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReconfiguration"


    // $ANTLR start "ruleReconfiguration"
    // InternalMyDslParser.g:185:1: ruleReconfiguration : ( ruleSetParam ) ;
    public final void ruleReconfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:189:2: ( ( ruleSetParam ) )
            // InternalMyDslParser.g:190:2: ( ruleSetParam )
            {
            // InternalMyDslParser.g:190:2: ( ruleSetParam )
            // InternalMyDslParser.g:191:3: ruleSetParam
            {
             before(grammarAccess.getReconfigurationAccess().getSetParamParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSetParam();

            state._fsp--;

             after(grammarAccess.getReconfigurationAccess().getSetParamParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReconfiguration"


    // $ANTLR start "entryRuleSetParam"
    // InternalMyDslParser.g:201:1: entryRuleSetParam : ruleSetParam EOF ;
    public final void entryRuleSetParam() throws RecognitionException {
        try {
            // InternalMyDslParser.g:202:1: ( ruleSetParam EOF )
            // InternalMyDslParser.g:203:1: ruleSetParam EOF
            {
             before(grammarAccess.getSetParamRule()); 
            pushFollow(FOLLOW_1);
            ruleSetParam();

            state._fsp--;

             after(grammarAccess.getSetParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetParam"


    // $ANTLR start "ruleSetParam"
    // InternalMyDslParser.g:210:1: ruleSetParam : ( ( rule__SetParam__Group__0 ) ) ;
    public final void ruleSetParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:214:2: ( ( ( rule__SetParam__Group__0 ) ) )
            // InternalMyDslParser.g:215:2: ( ( rule__SetParam__Group__0 ) )
            {
            // InternalMyDslParser.g:215:2: ( ( rule__SetParam__Group__0 ) )
            // InternalMyDslParser.g:216:3: ( rule__SetParam__Group__0 )
            {
             before(grammarAccess.getSetParamAccess().getGroup()); 
            // InternalMyDslParser.g:217:3: ( rule__SetParam__Group__0 )
            // InternalMyDslParser.g:217:4: rule__SetParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetParam"


    // $ANTLR start "entryRuleNamespace"
    // InternalMyDslParser.g:226:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalMyDslParser.g:227:1: ( ruleNamespace EOF )
            // InternalMyDslParser.g:228:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalMyDslParser.g:235:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:239:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalMyDslParser.g:240:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalMyDslParser.g:240:2: ( ( rule__Namespace__Alternatives ) )
            // InternalMyDslParser.g:241:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalMyDslParser.g:242:3: ( rule__Namespace__Alternatives )
            // InternalMyDslParser.g:242:4: rule__Namespace__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalMyDslParser.g:251:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalMyDslParser.g:252:1: ( ruleGraphName EOF )
            // InternalMyDslParser.g:253:1: ruleGraphName EOF
            {
             before(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGraphNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalMyDslParser.g:260:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:264:2: ( ( GraphName ) )
            // InternalMyDslParser.g:265:2: ( GraphName )
            {
            // InternalMyDslParser.g:265:2: ( GraphName )
            // InternalMyDslParser.g:266:3: GraphName
            {
             before(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 
            match(input,GraphName,FOLLOW_2); 
             after(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalMyDslParser.g:276:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalMyDslParser.g:277:1: ( ruleGlobalNamespace EOF )
            // InternalMyDslParser.g:278:1: ruleGlobalNamespace EOF
            {
             before(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalNamespace();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalMyDslParser.g:285:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:289:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalMyDslParser.g:290:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalMyDslParser.g:290:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalMyDslParser.g:291:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalMyDslParser.g:292:3: ( rule__GlobalNamespace__Group__0 )
            // InternalMyDslParser.g:292:4: rule__GlobalNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalMyDslParser.g:301:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalMyDslParser.g:302:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalMyDslParser.g:303:1: ruleRelativeNamespace_Impl EOF
            {
             before(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeNamespace_Impl();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalMyDslParser.g:310:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:314:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalMyDslParser.g:315:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalMyDslParser.g:315:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalMyDslParser.g:316:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalMyDslParser.g:317:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalMyDslParser.g:317:4: rule__RelativeNamespace_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalMyDslParser.g:326:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalMyDslParser.g:327:1: ( rulePrivateNamespace EOF )
            // InternalMyDslParser.g:328:1: rulePrivateNamespace EOF
            {
             before(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateNamespace();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalMyDslParser.g:335:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:339:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalMyDslParser.g:340:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalMyDslParser.g:340:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalMyDslParser.g:341:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalMyDslParser.g:342:3: ( rule__PrivateNamespace__Group__0 )
            // InternalMyDslParser.g:342:4: rule__PrivateNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleParameterType"
    // InternalMyDslParser.g:351:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:352:1: ( ruleParameterType EOF )
            // InternalMyDslParser.g:353:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalMyDslParser.g:360:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:364:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalMyDslParser.g:365:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalMyDslParser.g:365:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalMyDslParser.g:366:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalMyDslParser.g:367:3: ( rule__ParameterType__Alternatives )
            // InternalMyDslParser.g:367:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalMyDslParser.g:376:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalMyDslParser.g:377:1: ( ruleParameterValue EOF )
            // InternalMyDslParser.g:378:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalMyDslParser.g:385:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:389:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalMyDslParser.g:390:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalMyDslParser.g:390:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalMyDslParser.g:391:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalMyDslParser.g:392:3: ( rule__ParameterValue__Alternatives )
            // InternalMyDslParser.g:392:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalMyDslParser.g:401:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:402:1: ( ruleParameterListType EOF )
            // InternalMyDslParser.g:403:1: ruleParameterListType EOF
            {
             before(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterListType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalMyDslParser.g:410:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:414:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalMyDslParser.g:415:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalMyDslParser.g:415:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalMyDslParser.g:416:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup()); 
            // InternalMyDslParser.g:417:3: ( rule__ParameterListType__Group__0 )
            // InternalMyDslParser.g:417:4: rule__ParameterListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalMyDslParser.g:426:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:427:1: ( ruleParameterStructType EOF )
            // InternalMyDslParser.g:428:1: ruleParameterStructType EOF
            {
             before(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalMyDslParser.g:435:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:439:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalMyDslParser.g:440:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalMyDslParser.g:440:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalMyDslParser.g:441:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup()); 
            // InternalMyDslParser.g:442:3: ( rule__ParameterStructType__Group__0 )
            // InternalMyDslParser.g:442:4: rule__ParameterStructType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalMyDslParser.g:451:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:452:1: ( ruleParameterIntegerType EOF )
            // InternalMyDslParser.g:453:1: ruleParameterIntegerType EOF
            {
             before(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterIntegerType();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalMyDslParser.g:460:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:464:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalMyDslParser.g:465:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalMyDslParser.g:465:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalMyDslParser.g:466:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 
            // InternalMyDslParser.g:467:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalMyDslParser.g:467:4: rule__ParameterIntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalMyDslParser.g:476:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:477:1: ( ruleParameterStringType EOF )
            // InternalMyDslParser.g:478:1: ruleParameterStringType EOF
            {
             before(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStringType();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalMyDslParser.g:485:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:489:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalMyDslParser.g:490:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalMyDslParser.g:490:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalMyDslParser.g:491:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalMyDslParser.g:492:3: ( rule__ParameterStringType__Group__0 )
            // InternalMyDslParser.g:492:4: rule__ParameterStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalMyDslParser.g:501:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:502:1: ( ruleParameterDoubleType EOF )
            // InternalMyDslParser.g:503:1: ruleParameterDoubleType EOF
            {
             before(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDoubleType();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalMyDslParser.g:510:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:514:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalMyDslParser.g:515:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalMyDslParser.g:515:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalMyDslParser.g:516:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 
            // InternalMyDslParser.g:517:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalMyDslParser.g:517:4: rule__ParameterDoubleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalMyDslParser.g:526:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:527:1: ( ruleParameterBooleanType EOF )
            // InternalMyDslParser.g:528:1: ruleParameterBooleanType EOF
            {
             before(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBooleanType();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalMyDslParser.g:535:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:539:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalMyDslParser.g:540:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalMyDslParser.g:540:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalMyDslParser.g:541:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 
            // InternalMyDslParser.g:542:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalMyDslParser.g:542:4: rule__ParameterBooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalMyDslParser.g:551:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalMyDslParser.g:552:1: ( ruleParameterBase64Type EOF )
            // InternalMyDslParser.g:553:1: ruleParameterBase64Type EOF
            {
             before(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBase64Type();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalMyDslParser.g:560:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:564:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalMyDslParser.g:565:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalMyDslParser.g:565:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalMyDslParser.g:566:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup()); 
            // InternalMyDslParser.g:567:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalMyDslParser.g:567:4: rule__ParameterBase64Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalMyDslParser.g:576:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:577:1: ( ruleParameterArrayType EOF )
            // InternalMyDslParser.g:578:1: ruleParameterArrayType EOF
            {
             before(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterArrayType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalMyDslParser.g:585:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:589:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalMyDslParser.g:590:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalMyDslParser.g:590:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalMyDslParser.g:591:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup()); 
            // InternalMyDslParser.g:592:3: ( rule__ParameterArrayType__Group__0 )
            // InternalMyDslParser.g:592:4: rule__ParameterArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalMyDslParser.g:601:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalMyDslParser.g:602:1: ( ruleParameterList EOF )
            // InternalMyDslParser.g:603:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalMyDslParser.g:610:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:614:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalMyDslParser.g:615:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalMyDslParser.g:615:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalMyDslParser.g:616:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalMyDslParser.g:617:3: ( rule__ParameterList__Group__0 )
            // InternalMyDslParser.g:617:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalMyDslParser.g:626:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalMyDslParser.g:627:1: ( ruleParameterAny EOF )
            // InternalMyDslParser.g:628:1: ruleParameterAny EOF
            {
             before(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterAny();

            state._fsp--;

             after(grammarAccess.getParameterAnyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalMyDslParser.g:635:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:639:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalMyDslParser.g:640:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalMyDslParser.g:640:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalMyDslParser.g:641:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup()); 
            // InternalMyDslParser.g:642:3: ( rule__ParameterAny__Group__0 )
            // InternalMyDslParser.g:642:4: rule__ParameterAny__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalMyDslParser.g:651:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalMyDslParser.g:652:1: ( ruleParameterString EOF )
            // InternalMyDslParser.g:653:1: ruleParameterString EOF
            {
             before(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalMyDslParser.g:660:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:664:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalMyDslParser.g:665:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalMyDslParser.g:665:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalMyDslParser.g:666:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment()); 
            // InternalMyDslParser.g:667:3: ( rule__ParameterString__ValueAssignment )
            // InternalMyDslParser.g:667:4: rule__ParameterString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalMyDslParser.g:676:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalMyDslParser.g:677:1: ( ruleParameterBase64 EOF )
            // InternalMyDslParser.g:678:1: ruleParameterBase64 EOF
            {
             before(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalMyDslParser.g:685:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:689:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalMyDslParser.g:690:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalMyDslParser.g:690:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalMyDslParser.g:691:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment()); 
            // InternalMyDslParser.g:692:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalMyDslParser.g:692:4: rule__ParameterBase64__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64Access().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalMyDslParser.g:701:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalMyDslParser.g:702:1: ( ruleParameterInteger EOF )
            // InternalMyDslParser.g:703:1: ruleParameterInteger EOF
            {
             before(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalMyDslParser.g:710:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:714:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalMyDslParser.g:715:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalMyDslParser.g:715:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalMyDslParser.g:716:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 
            // InternalMyDslParser.g:717:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalMyDslParser.g:717:4: rule__ParameterInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalMyDslParser.g:726:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalMyDslParser.g:727:1: ( ruleParameterDouble EOF )
            // InternalMyDslParser.g:728:1: ruleParameterDouble EOF
            {
             before(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalMyDslParser.g:735:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:739:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalMyDslParser.g:740:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalMyDslParser.g:740:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalMyDslParser.g:741:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 
            // InternalMyDslParser.g:742:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalMyDslParser.g:742:4: rule__ParameterDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalMyDslParser.g:751:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalMyDslParser.g:752:1: ( ruleParameterBoolean EOF )
            // InternalMyDslParser.g:753:1: ruleParameterBoolean EOF
            {
             before(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalMyDslParser.g:760:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:764:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalMyDslParser.g:765:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalMyDslParser.g:765:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalMyDslParser.g:766:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 
            // InternalMyDslParser.g:767:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalMyDslParser.g:767:4: rule__ParameterBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalMyDslParser.g:776:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalMyDslParser.g:777:1: ( ruleParameterStruct EOF )
            // InternalMyDslParser.g:778:1: ruleParameterStruct EOF
            {
             before(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStruct();

            state._fsp--;

             after(grammarAccess.getParameterStructRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalMyDslParser.g:785:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:789:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalMyDslParser.g:790:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalMyDslParser.g:790:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalMyDslParser.g:791:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup()); 
            // InternalMyDslParser.g:792:3: ( rule__ParameterStruct__Group__0 )
            // InternalMyDslParser.g:792:4: rule__ParameterStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalMyDslParser.g:801:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalMyDslParser.g:802:1: ( ruleParameterDate EOF )
            // InternalMyDslParser.g:803:1: ruleParameterDate EOF
            {
             before(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDate();

            state._fsp--;

             after(grammarAccess.getParameterDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalMyDslParser.g:810:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:814:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalMyDslParser.g:815:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalMyDslParser.g:815:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalMyDslParser.g:816:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment()); 
            // InternalMyDslParser.g:817:3: ( rule__ParameterDate__ValueAssignment )
            // InternalMyDslParser.g:817:4: rule__ParameterDate__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDate__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDateAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalMyDslParser.g:826:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalMyDslParser.g:827:1: ( ruleParameterStructMember EOF )
            // InternalMyDslParser.g:828:1: ruleParameterStructMember EOF
            {
             before(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalMyDslParser.g:835:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:839:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalMyDslParser.g:840:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalMyDslParser.g:840:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalMyDslParser.g:841:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup()); 
            // InternalMyDslParser.g:842:3: ( rule__ParameterStructMember__Group__0 )
            // InternalMyDslParser.g:842:4: rule__ParameterStructMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalMyDslParser.g:851:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalMyDslParser.g:852:1: ( ruleParameterStructTypeMember EOF )
            // InternalMyDslParser.g:853:1: ruleParameterStructTypeMember EOF
            {
             before(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalMyDslParser.g:860:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:864:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalMyDslParser.g:865:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalMyDslParser.g:865:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalMyDslParser.g:866:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 
            // InternalMyDslParser.g:867:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalMyDslParser.g:867:4: rule__ParameterStructTypeMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalMyDslParser.g:876:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalMyDslParser.g:877:1: ( ruleBase64Binary EOF )
            // InternalMyDslParser.g:878:1: ruleBase64Binary EOF
            {
             before(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getBase64BinaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalMyDslParser.g:885:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:889:2: ( ( RULE_BINARY ) )
            // InternalMyDslParser.g:890:2: ( RULE_BINARY )
            {
            // InternalMyDslParser.g:890:2: ( RULE_BINARY )
            // InternalMyDslParser.g:891:3: RULE_BINARY
            {
             before(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 
            match(input,RULE_BINARY,FOLLOW_2); 
             after(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalMyDslParser.g:901:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalMyDslParser.g:902:1: ( ruleboolean0 EOF )
            // InternalMyDslParser.g:903:1: ruleboolean0 EOF
            {
             before(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getBoolean0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalMyDslParser.g:910:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:914:2: ( ( RULE_BOOLEAN ) )
            // InternalMyDslParser.g:915:2: ( RULE_BOOLEAN )
            {
            // InternalMyDslParser.g:915:2: ( RULE_BOOLEAN )
            // InternalMyDslParser.g:916:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalMyDslParser.g:926:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalMyDslParser.g:927:1: ( ruleDouble0 EOF )
            // InternalMyDslParser.g:928:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalMyDslParser.g:935:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:939:2: ( ( RULE_DOUBLE ) )
            // InternalMyDslParser.g:940:2: ( RULE_DOUBLE )
            {
            // InternalMyDslParser.g:940:2: ( RULE_DOUBLE )
            // InternalMyDslParser.g:941:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalMyDslParser.g:951:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalMyDslParser.g:952:1: ( ruleInteger0 EOF )
            // InternalMyDslParser.g:953:1: ruleInteger0 EOF
            {
             before(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getInteger0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalMyDslParser.g:960:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:964:2: ( ( RULE_DECINT ) )
            // InternalMyDslParser.g:965:2: ( RULE_DECINT )
            {
            // InternalMyDslParser.g:965:2: ( RULE_DECINT )
            // InternalMyDslParser.g:966:3: RULE_DECINT
            {
             before(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 
            match(input,RULE_DECINT,FOLLOW_2); 
             after(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalMyDslParser.g:976:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalMyDslParser.g:977:1: ( ruleDateTime0 EOF )
            // InternalMyDslParser.g:978:1: ruleDateTime0 EOF
            {
             before(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getDateTime0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalMyDslParser.g:985:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:989:2: ( ( RULE_DATE_TIME ) )
            // InternalMyDslParser.g:990:2: ( RULE_DATE_TIME )
            {
            // InternalMyDslParser.g:990:2: ( RULE_DATE_TIME )
            // InternalMyDslParser.g:991:3: RULE_DATE_TIME
            {
             before(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall()); 
            match(input,RULE_DATE_TIME,FOLLOW_2); 
             after(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalMyDslParser.g:1001:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1002:1: ( ruleAbstractType EOF )
            // InternalMyDslParser.g:1003:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalMyDslParser.g:1010:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1014:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalMyDslParser.g:1015:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalMyDslParser.g:1015:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalMyDslParser.g:1016:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalMyDslParser.g:1017:3: ( rule__AbstractType__Alternatives )
            // InternalMyDslParser.g:1017:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalMyDslParser.g:1026:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1027:1: ( rulebool EOF )
            // InternalMyDslParser.g:1028:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalMyDslParser.g:1035:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1039:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalMyDslParser.g:1040:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalMyDslParser.g:1040:2: ( ( rule__Bool__Group__0 ) )
            // InternalMyDslParser.g:1041:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalMyDslParser.g:1042:3: ( rule__Bool__Group__0 )
            // InternalMyDslParser.g:1042:4: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalMyDslParser.g:1051:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1052:1: ( ruleint8 EOF )
            // InternalMyDslParser.g:1053:1: ruleint8 EOF
            {
             before(grammarAccess.getInt8Rule()); 
            pushFollow(FOLLOW_1);
            ruleint8();

            state._fsp--;

             after(grammarAccess.getInt8Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalMyDslParser.g:1060:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1064:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalMyDslParser.g:1065:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalMyDslParser.g:1065:2: ( ( rule__Int8__Group__0 ) )
            // InternalMyDslParser.g:1066:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup()); 
            // InternalMyDslParser.g:1067:3: ( rule__Int8__Group__0 )
            // InternalMyDslParser.g:1067:4: rule__Int8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalMyDslParser.g:1076:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1077:1: ( ruleuint8 EOF )
            // InternalMyDslParser.g:1078:1: ruleuint8 EOF
            {
             before(grammarAccess.getUint8Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint8();

            state._fsp--;

             after(grammarAccess.getUint8Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalMyDslParser.g:1085:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1089:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalMyDslParser.g:1090:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalMyDslParser.g:1090:2: ( ( rule__Uint8__Group__0 ) )
            // InternalMyDslParser.g:1091:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup()); 
            // InternalMyDslParser.g:1092:3: ( rule__Uint8__Group__0 )
            // InternalMyDslParser.g:1092:4: rule__Uint8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalMyDslParser.g:1101:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1102:1: ( ruleint16 EOF )
            // InternalMyDslParser.g:1103:1: ruleint16 EOF
            {
             before(grammarAccess.getInt16Rule()); 
            pushFollow(FOLLOW_1);
            ruleint16();

            state._fsp--;

             after(grammarAccess.getInt16Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalMyDslParser.g:1110:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1114:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalMyDslParser.g:1115:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalMyDslParser.g:1115:2: ( ( rule__Int16__Group__0 ) )
            // InternalMyDslParser.g:1116:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup()); 
            // InternalMyDslParser.g:1117:3: ( rule__Int16__Group__0 )
            // InternalMyDslParser.g:1117:4: rule__Int16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalMyDslParser.g:1126:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1127:1: ( ruleuint16 EOF )
            // InternalMyDslParser.g:1128:1: ruleuint16 EOF
            {
             before(grammarAccess.getUint16Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint16();

            state._fsp--;

             after(grammarAccess.getUint16Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalMyDslParser.g:1135:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1139:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalMyDslParser.g:1140:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalMyDslParser.g:1140:2: ( ( rule__Uint16__Group__0 ) )
            // InternalMyDslParser.g:1141:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup()); 
            // InternalMyDslParser.g:1142:3: ( rule__Uint16__Group__0 )
            // InternalMyDslParser.g:1142:4: rule__Uint16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalMyDslParser.g:1151:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1152:1: ( ruleint32 EOF )
            // InternalMyDslParser.g:1153:1: ruleint32 EOF
            {
             before(grammarAccess.getInt32Rule()); 
            pushFollow(FOLLOW_1);
            ruleint32();

            state._fsp--;

             after(grammarAccess.getInt32Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalMyDslParser.g:1160:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1164:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalMyDslParser.g:1165:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalMyDslParser.g:1165:2: ( ( rule__Int32__Group__0 ) )
            // InternalMyDslParser.g:1166:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup()); 
            // InternalMyDslParser.g:1167:3: ( rule__Int32__Group__0 )
            // InternalMyDslParser.g:1167:4: rule__Int32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalMyDslParser.g:1176:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1177:1: ( ruleuint32 EOF )
            // InternalMyDslParser.g:1178:1: ruleuint32 EOF
            {
             before(grammarAccess.getUint32Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint32();

            state._fsp--;

             after(grammarAccess.getUint32Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalMyDslParser.g:1185:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1189:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalMyDslParser.g:1190:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalMyDslParser.g:1190:2: ( ( rule__Uint32__Group__0 ) )
            // InternalMyDslParser.g:1191:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup()); 
            // InternalMyDslParser.g:1192:3: ( rule__Uint32__Group__0 )
            // InternalMyDslParser.g:1192:4: rule__Uint32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalMyDslParser.g:1201:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1202:1: ( ruleint64 EOF )
            // InternalMyDslParser.g:1203:1: ruleint64 EOF
            {
             before(grammarAccess.getInt64Rule()); 
            pushFollow(FOLLOW_1);
            ruleint64();

            state._fsp--;

             after(grammarAccess.getInt64Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalMyDslParser.g:1210:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1214:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalMyDslParser.g:1215:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalMyDslParser.g:1215:2: ( ( rule__Int64__Group__0 ) )
            // InternalMyDslParser.g:1216:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup()); 
            // InternalMyDslParser.g:1217:3: ( rule__Int64__Group__0 )
            // InternalMyDslParser.g:1217:4: rule__Int64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalMyDslParser.g:1226:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1227:1: ( ruleuint64 EOF )
            // InternalMyDslParser.g:1228:1: ruleuint64 EOF
            {
             before(grammarAccess.getUint64Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint64();

            state._fsp--;

             after(grammarAccess.getUint64Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalMyDslParser.g:1235:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1239:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalMyDslParser.g:1240:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalMyDslParser.g:1240:2: ( ( rule__Uint64__Group__0 ) )
            // InternalMyDslParser.g:1241:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup()); 
            // InternalMyDslParser.g:1242:3: ( rule__Uint64__Group__0 )
            // InternalMyDslParser.g:1242:4: rule__Uint64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalMyDslParser.g:1251:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1252:1: ( rulefloat32 EOF )
            // InternalMyDslParser.g:1253:1: rulefloat32 EOF
            {
             before(grammarAccess.getFloat32Rule()); 
            pushFollow(FOLLOW_1);
            rulefloat32();

            state._fsp--;

             after(grammarAccess.getFloat32Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalMyDslParser.g:1260:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1264:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalMyDslParser.g:1265:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalMyDslParser.g:1265:2: ( ( rule__Float32__Group__0 ) )
            // InternalMyDslParser.g:1266:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup()); 
            // InternalMyDslParser.g:1267:3: ( rule__Float32__Group__0 )
            // InternalMyDslParser.g:1267:4: rule__Float32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalMyDslParser.g:1276:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1277:1: ( rulefloat64 EOF )
            // InternalMyDslParser.g:1278:1: rulefloat64 EOF
            {
             before(grammarAccess.getFloat64Rule()); 
            pushFollow(FOLLOW_1);
            rulefloat64();

            state._fsp--;

             after(grammarAccess.getFloat64Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalMyDslParser.g:1285:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1289:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalMyDslParser.g:1290:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalMyDslParser.g:1290:2: ( ( rule__Float64__Group__0 ) )
            // InternalMyDslParser.g:1291:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup()); 
            // InternalMyDslParser.g:1292:3: ( rule__Float64__Group__0 )
            // InternalMyDslParser.g:1292:4: rule__Float64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalMyDslParser.g:1301:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1302:1: ( rulestring0 EOF )
            // InternalMyDslParser.g:1303:1: rulestring0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            rulestring0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalMyDslParser.g:1310:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1314:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalMyDslParser.g:1315:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalMyDslParser.g:1315:2: ( ( rule__String0__Group__0 ) )
            // InternalMyDslParser.g:1316:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalMyDslParser.g:1317:3: ( rule__String0__Group__0 )
            // InternalMyDslParser.g:1317:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulechar"
    // InternalMyDslParser.g:1326:1: entryRulechar : rulechar EOF ;
    public final void entryRulechar() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1327:1: ( rulechar EOF )
            // InternalMyDslParser.g:1328:1: rulechar EOF
            {
             before(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            rulechar();

            state._fsp--;

             after(grammarAccess.getCharRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalMyDslParser.g:1335:1: rulechar : ( ( rule__Char__Group__0 ) ) ;
    public final void rulechar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1339:2: ( ( ( rule__Char__Group__0 ) ) )
            // InternalMyDslParser.g:1340:2: ( ( rule__Char__Group__0 ) )
            {
            // InternalMyDslParser.g:1340:2: ( ( rule__Char__Group__0 ) )
            // InternalMyDslParser.g:1341:3: ( rule__Char__Group__0 )
            {
             before(grammarAccess.getCharAccess().getGroup()); 
            // InternalMyDslParser.g:1342:3: ( rule__Char__Group__0 )
            // InternalMyDslParser.g:1342:4: rule__Char__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalMyDslParser.g:1351:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1352:1: ( rulebyte EOF )
            // InternalMyDslParser.g:1353:1: rulebyte EOF
            {
             before(grammarAccess.getByteRule()); 
            pushFollow(FOLLOW_1);
            rulebyte();

            state._fsp--;

             after(grammarAccess.getByteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalMyDslParser.g:1360:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1364:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalMyDslParser.g:1365:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalMyDslParser.g:1365:2: ( ( rule__Byte__Group__0 ) )
            // InternalMyDslParser.g:1366:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup()); 
            // InternalMyDslParser.g:1367:3: ( rule__Byte__Group__0 )
            // InternalMyDslParser.g:1367:4: rule__Byte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalMyDslParser.g:1376:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1377:1: ( ruletime EOF )
            // InternalMyDslParser.g:1378:1: ruletime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruletime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalMyDslParser.g:1385:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1389:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalMyDslParser.g:1390:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalMyDslParser.g:1390:2: ( ( rule__Time__Group__0 ) )
            // InternalMyDslParser.g:1391:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalMyDslParser.g:1392:3: ( rule__Time__Group__0 )
            // InternalMyDslParser.g:1392:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalMyDslParser.g:1401:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1402:1: ( ruleduration EOF )
            // InternalMyDslParser.g:1403:1: ruleduration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleduration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalMyDslParser.g:1410:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1414:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalMyDslParser.g:1415:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalMyDslParser.g:1415:2: ( ( rule__Duration__Group__0 ) )
            // InternalMyDslParser.g:1416:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalMyDslParser.g:1417:3: ( rule__Duration__Group__0 )
            // InternalMyDslParser.g:1417:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalMyDslParser.g:1426:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1427:1: ( ruleboolArray EOF )
            // InternalMyDslParser.g:1428:1: ruleboolArray EOF
            {
             before(grammarAccess.getBoolArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleboolArray();

            state._fsp--;

             after(grammarAccess.getBoolArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalMyDslParser.g:1435:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1439:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalMyDslParser.g:1440:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalMyDslParser.g:1440:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalMyDslParser.g:1441:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1442:3: ( rule__BoolArray__Group__0 )
            // InternalMyDslParser.g:1442:4: rule__BoolArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalMyDslParser.g:1451:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1452:1: ( ruleint8Array EOF )
            // InternalMyDslParser.g:1453:1: ruleint8Array EOF
            {
             before(grammarAccess.getInt8ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint8Array();

            state._fsp--;

             after(grammarAccess.getInt8ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalMyDslParser.g:1460:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1464:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalMyDslParser.g:1465:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1465:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalMyDslParser.g:1466:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1467:3: ( rule__Int8Array__Group__0 )
            // InternalMyDslParser.g:1467:4: rule__Int8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalMyDslParser.g:1476:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1477:1: ( ruleuint8Array EOF )
            // InternalMyDslParser.g:1478:1: ruleuint8Array EOF
            {
             before(grammarAccess.getUint8ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint8Array();

            state._fsp--;

             after(grammarAccess.getUint8ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalMyDslParser.g:1485:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1489:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalMyDslParser.g:1490:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1490:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalMyDslParser.g:1491:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1492:3: ( rule__Uint8Array__Group__0 )
            // InternalMyDslParser.g:1492:4: rule__Uint8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalMyDslParser.g:1501:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1502:1: ( ruleint16Array EOF )
            // InternalMyDslParser.g:1503:1: ruleint16Array EOF
            {
             before(grammarAccess.getInt16ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint16Array();

            state._fsp--;

             after(grammarAccess.getInt16ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalMyDslParser.g:1510:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1514:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalMyDslParser.g:1515:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1515:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalMyDslParser.g:1516:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1517:3: ( rule__Int16Array__Group__0 )
            // InternalMyDslParser.g:1517:4: rule__Int16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalMyDslParser.g:1526:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1527:1: ( ruleuint16Array EOF )
            // InternalMyDslParser.g:1528:1: ruleuint16Array EOF
            {
             before(grammarAccess.getUint16ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint16Array();

            state._fsp--;

             after(grammarAccess.getUint16ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalMyDslParser.g:1535:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1539:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalMyDslParser.g:1540:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1540:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalMyDslParser.g:1541:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1542:3: ( rule__Uint16Array__Group__0 )
            // InternalMyDslParser.g:1542:4: rule__Uint16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalMyDslParser.g:1551:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1552:1: ( ruleint32Array EOF )
            // InternalMyDslParser.g:1553:1: ruleint32Array EOF
            {
             before(grammarAccess.getInt32ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint32Array();

            state._fsp--;

             after(grammarAccess.getInt32ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalMyDslParser.g:1560:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1564:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalMyDslParser.g:1565:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1565:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalMyDslParser.g:1566:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1567:3: ( rule__Int32Array__Group__0 )
            // InternalMyDslParser.g:1567:4: rule__Int32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalMyDslParser.g:1576:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1577:1: ( ruleuint32Array EOF )
            // InternalMyDslParser.g:1578:1: ruleuint32Array EOF
            {
             before(grammarAccess.getUint32ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint32Array();

            state._fsp--;

             after(grammarAccess.getUint32ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalMyDslParser.g:1585:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1589:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalMyDslParser.g:1590:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1590:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalMyDslParser.g:1591:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1592:3: ( rule__Uint32Array__Group__0 )
            // InternalMyDslParser.g:1592:4: rule__Uint32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalMyDslParser.g:1601:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1602:1: ( ruleint64Array EOF )
            // InternalMyDslParser.g:1603:1: ruleint64Array EOF
            {
             before(grammarAccess.getInt64ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint64Array();

            state._fsp--;

             after(grammarAccess.getInt64ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalMyDslParser.g:1610:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1614:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalMyDslParser.g:1615:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1615:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalMyDslParser.g:1616:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1617:3: ( rule__Int64Array__Group__0 )
            // InternalMyDslParser.g:1617:4: rule__Int64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalMyDslParser.g:1626:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1627:1: ( ruleuint64Array EOF )
            // InternalMyDslParser.g:1628:1: ruleuint64Array EOF
            {
             before(grammarAccess.getUint64ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint64Array();

            state._fsp--;

             after(grammarAccess.getUint64ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalMyDslParser.g:1635:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1639:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalMyDslParser.g:1640:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1640:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalMyDslParser.g:1641:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1642:3: ( rule__Uint64Array__Group__0 )
            // InternalMyDslParser.g:1642:4: rule__Uint64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalMyDslParser.g:1651:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1652:1: ( rulefloat32Array EOF )
            // InternalMyDslParser.g:1653:1: rulefloat32Array EOF
            {
             before(grammarAccess.getFloat32ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulefloat32Array();

            state._fsp--;

             after(grammarAccess.getFloat32ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalMyDslParser.g:1660:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1664:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalMyDslParser.g:1665:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1665:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalMyDslParser.g:1666:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1667:3: ( rule__Float32Array__Group__0 )
            // InternalMyDslParser.g:1667:4: rule__Float32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalMyDslParser.g:1676:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1677:1: ( rulefloat64Array EOF )
            // InternalMyDslParser.g:1678:1: rulefloat64Array EOF
            {
             before(grammarAccess.getFloat64ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulefloat64Array();

            state._fsp--;

             after(grammarAccess.getFloat64ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalMyDslParser.g:1685:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1689:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalMyDslParser.g:1690:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1690:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalMyDslParser.g:1691:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1692:3: ( rule__Float64Array__Group__0 )
            // InternalMyDslParser.g:1692:4: rule__Float64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalMyDslParser.g:1701:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1702:1: ( rulestring0Array EOF )
            // InternalMyDslParser.g:1703:1: rulestring0Array EOF
            {
             before(grammarAccess.getString0ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulestring0Array();

            state._fsp--;

             after(grammarAccess.getString0ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalMyDslParser.g:1710:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1714:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalMyDslParser.g:1715:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalMyDslParser.g:1715:2: ( ( rule__String0Array__Group__0 ) )
            // InternalMyDslParser.g:1716:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1717:3: ( rule__String0Array__Group__0 )
            // InternalMyDslParser.g:1717:4: rule__String0Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalMyDslParser.g:1726:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1727:1: ( rulebyteArray EOF )
            // InternalMyDslParser.g:1728:1: rulebyteArray EOF
            {
             before(grammarAccess.getByteArrayRule()); 
            pushFollow(FOLLOW_1);
            rulebyteArray();

            state._fsp--;

             after(grammarAccess.getByteArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalMyDslParser.g:1735:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1739:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalMyDslParser.g:1740:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalMyDslParser.g:1740:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalMyDslParser.g:1741:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1742:3: ( rule__ByteArray__Group__0 )
            // InternalMyDslParser.g:1742:4: rule__ByteArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRulecharArray"
    // InternalMyDslParser.g:1751:1: entryRulecharArray : rulecharArray EOF ;
    public final void entryRulecharArray() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1752:1: ( rulecharArray EOF )
            // InternalMyDslParser.g:1753:1: rulecharArray EOF
            {
             before(grammarAccess.getCharArrayRule()); 
            pushFollow(FOLLOW_1);
            rulecharArray();

            state._fsp--;

             after(grammarAccess.getCharArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalMyDslParser.g:1760:1: rulecharArray : ( ( rule__CharArray__Group__0 ) ) ;
    public final void rulecharArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1764:2: ( ( ( rule__CharArray__Group__0 ) ) )
            // InternalMyDslParser.g:1765:2: ( ( rule__CharArray__Group__0 ) )
            {
            // InternalMyDslParser.g:1765:2: ( ( rule__CharArray__Group__0 ) )
            // InternalMyDslParser.g:1766:3: ( rule__CharArray__Group__0 )
            {
             before(grammarAccess.getCharArrayAccess().getGroup()); 
            // InternalMyDslParser.g:1767:3: ( rule__CharArray__Group__0 )
            // InternalMyDslParser.g:1767:4: rule__CharArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalMyDslParser.g:1776:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1777:1: ( ruleHeader EOF )
            // InternalMyDslParser.g:1778:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMyDslParser.g:1785:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1789:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalMyDslParser.g:1790:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalMyDslParser.g:1790:2: ( ( rule__Header__Group__0 ) )
            // InternalMyDslParser.g:1791:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalMyDslParser.g:1792:3: ( rule__Header__Group__0 )
            // InternalMyDslParser.g:1792:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSpecBaseRef"
    // InternalMyDslParser.g:1801:1: entryRuleSpecBaseRef : ruleSpecBaseRef EOF ;
    public final void entryRuleSpecBaseRef() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1802:1: ( ruleSpecBaseRef EOF )
            // InternalMyDslParser.g:1803:1: ruleSpecBaseRef EOF
            {
             before(grammarAccess.getSpecBaseRefRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecBaseRef();

            state._fsp--;

             after(grammarAccess.getSpecBaseRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecBaseRef"


    // $ANTLR start "ruleSpecBaseRef"
    // InternalMyDslParser.g:1810:1: ruleSpecBaseRef : ( ( rule__SpecBaseRef__ReferenceAssignment ) ) ;
    public final void ruleSpecBaseRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1814:2: ( ( ( rule__SpecBaseRef__ReferenceAssignment ) ) )
            // InternalMyDslParser.g:1815:2: ( ( rule__SpecBaseRef__ReferenceAssignment ) )
            {
            // InternalMyDslParser.g:1815:2: ( ( rule__SpecBaseRef__ReferenceAssignment ) )
            // InternalMyDslParser.g:1816:3: ( rule__SpecBaseRef__ReferenceAssignment )
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment()); 
            // InternalMyDslParser.g:1817:3: ( rule__SpecBaseRef__ReferenceAssignment )
            // InternalMyDslParser.g:1817:4: rule__SpecBaseRef__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SpecBaseRef__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecBaseRef"


    // $ANTLR start "entryRuleArraySpecRef"
    // InternalMyDslParser.g:1826:1: entryRuleArraySpecRef : ruleArraySpecRef EOF ;
    public final void entryRuleArraySpecRef() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1827:1: ( ruleArraySpecRef EOF )
            // InternalMyDslParser.g:1828:1: ruleArraySpecRef EOF
            {
             before(grammarAccess.getArraySpecRefRule()); 
            pushFollow(FOLLOW_1);
            ruleArraySpecRef();

            state._fsp--;

             after(grammarAccess.getArraySpecRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArraySpecRef"


    // $ANTLR start "ruleArraySpecRef"
    // InternalMyDslParser.g:1835:1: ruleArraySpecRef : ( ( rule__ArraySpecRef__Group__0 ) ) ;
    public final void ruleArraySpecRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1839:2: ( ( ( rule__ArraySpecRef__Group__0 ) ) )
            // InternalMyDslParser.g:1840:2: ( ( rule__ArraySpecRef__Group__0 ) )
            {
            // InternalMyDslParser.g:1840:2: ( ( rule__ArraySpecRef__Group__0 ) )
            // InternalMyDslParser.g:1841:3: ( rule__ArraySpecRef__Group__0 )
            {
             before(grammarAccess.getArraySpecRefAccess().getGroup()); 
            // InternalMyDslParser.g:1842:3: ( rule__ArraySpecRef__Group__0 )
            // InternalMyDslParser.g:1842:4: rule__ArraySpecRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArraySpecRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArraySpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalMyDslParser.g:1851:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1852:1: ( ruleKEYWORD EOF )
            // InternalMyDslParser.g:1853:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalMyDslParser.g:1860:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1864:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalMyDslParser.g:1865:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalMyDslParser.g:1865:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalMyDslParser.g:1866:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalMyDslParser.g:1867:3: ( rule__KEYWORD__Alternatives )
            // InternalMyDslParser.g:1867:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalMyDslParser.g:1876:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDslParser.g:1877:1: ( ruleEString EOF )
            // InternalMyDslParser.g:1878:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDslParser.g:1885:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1889:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDslParser.g:1890:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDslParser.g:1890:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDslParser.g:1891:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDslParser.g:1892:3: ( rule__EString__Alternatives )
            // InternalMyDslParser.g:1892:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalMyDslParser.g:1900:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1904:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt1=1;
                }
                break;
            case RelativeNamespace:
                {
                alt1=2;
                }
                break;
            case PrivateNamespace:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDslParser.g:1905:2: ( ruleGlobalNamespace )
                    {
                    // InternalMyDslParser.g:1905:2: ( ruleGlobalNamespace )
                    // InternalMyDslParser.g:1906:3: ruleGlobalNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1911:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalMyDslParser.g:1911:2: ( ruleRelativeNamespace_Impl )
                    // InternalMyDslParser.g:1912:3: ruleRelativeNamespace_Impl
                    {
                     before(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeNamespace_Impl();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:1917:2: ( rulePrivateNamespace )
                    {
                    // InternalMyDslParser.g:1917:2: ( rulePrivateNamespace )
                    // InternalMyDslParser.g:1918:3: rulePrivateNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrivateNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalMyDslParser.g:1927:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1931:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt2=1;
                }
                break;
            case Struct:
                {
                alt2=2;
                }
                break;
            case Integer:
                {
                alt2=3;
                }
                break;
            case String:
                {
                alt2=4;
                }
                break;
            case Double:
                {
                alt2=5;
                }
                break;
            case Boolean:
                {
                alt2=6;
                }
                break;
            case Base64:
                {
                alt2=7;
                }
                break;
            case Array:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDslParser.g:1932:2: ( ruleParameterListType )
                    {
                    // InternalMyDslParser.g:1932:2: ( ruleParameterListType )
                    // InternalMyDslParser.g:1933:3: ruleParameterListType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterListType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1938:2: ( ruleParameterStructType )
                    {
                    // InternalMyDslParser.g:1938:2: ( ruleParameterStructType )
                    // InternalMyDslParser.g:1939:3: ruleParameterStructType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStructType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:1944:2: ( ruleParameterIntegerType )
                    {
                    // InternalMyDslParser.g:1944:2: ( ruleParameterIntegerType )
                    // InternalMyDslParser.g:1945:3: ruleParameterIntegerType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterIntegerType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDslParser.g:1950:2: ( ruleParameterStringType )
                    {
                    // InternalMyDslParser.g:1950:2: ( ruleParameterStringType )
                    // InternalMyDslParser.g:1951:3: ruleParameterStringType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStringType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDslParser.g:1956:2: ( ruleParameterDoubleType )
                    {
                    // InternalMyDslParser.g:1956:2: ( ruleParameterDoubleType )
                    // InternalMyDslParser.g:1957:3: ruleParameterDoubleType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDoubleType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDslParser.g:1962:2: ( ruleParameterBooleanType )
                    {
                    // InternalMyDslParser.g:1962:2: ( ruleParameterBooleanType )
                    // InternalMyDslParser.g:1963:3: ruleParameterBooleanType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBooleanType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDslParser.g:1968:2: ( ruleParameterBase64Type )
                    {
                    // InternalMyDslParser.g:1968:2: ( ruleParameterBase64Type )
                    // InternalMyDslParser.g:1969:3: ruleParameterBase64Type
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64Type();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDslParser.g:1974:2: ( ruleParameterArrayType )
                    {
                    // InternalMyDslParser.g:1974:2: ( ruleParameterArrayType )
                    // InternalMyDslParser.g:1975:3: ruleParameterArrayType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterArrayType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalMyDslParser.g:1984:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:1988:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDslParser.g:1989:2: ( ruleParameterString )
                    {
                    // InternalMyDslParser.g:1989:2: ( ruleParameterString )
                    // InternalMyDslParser.g:1990:3: ruleParameterString
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterString();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1995:2: ( ruleParameterBase64 )
                    {
                    // InternalMyDslParser.g:1995:2: ( ruleParameterBase64 )
                    // InternalMyDslParser.g:1996:3: ruleParameterBase64
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:2001:2: ( ruleParameterInteger )
                    {
                    // InternalMyDslParser.g:2001:2: ( ruleParameterInteger )
                    // InternalMyDslParser.g:2002:3: ruleParameterInteger
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterInteger();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDslParser.g:2007:2: ( ruleParameterDouble )
                    {
                    // InternalMyDslParser.g:2007:2: ( ruleParameterDouble )
                    // InternalMyDslParser.g:2008:3: ruleParameterDouble
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDouble();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDslParser.g:2013:2: ( ruleParameterBoolean )
                    {
                    // InternalMyDslParser.g:2013:2: ( ruleParameterBoolean )
                    // InternalMyDslParser.g:2014:3: ruleParameterBoolean
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBoolean();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDslParser.g:2019:2: ( ruleParameterList )
                    {
                    // InternalMyDslParser.g:2019:2: ( ruleParameterList )
                    // InternalMyDslParser.g:2020:3: ruleParameterList
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterList();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDslParser.g:2025:2: ( ruleParameterStruct )
                    {
                    // InternalMyDslParser.g:2025:2: ( ruleParameterStruct )
                    // InternalMyDslParser.g:2026:3: ruleParameterStruct
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStruct();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalMyDslParser.g:2035:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2039:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) )
            int alt4=33;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDslParser.g:2040:2: ( rulebool )
                    {
                    // InternalMyDslParser.g:2040:2: ( rulebool )
                    // InternalMyDslParser.g:2041:3: rulebool
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulebool();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2046:2: ( ruleint8 )
                    {
                    // InternalMyDslParser.g:2046:2: ( ruleint8 )
                    // InternalMyDslParser.g:2047:3: ruleint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:2052:2: ( ruleuint8 )
                    {
                    // InternalMyDslParser.g:2052:2: ( ruleuint8 )
                    // InternalMyDslParser.g:2053:3: ruleuint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleuint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDslParser.g:2058:2: ( ruleint16 )
                    {
                    // InternalMyDslParser.g:2058:2: ( ruleint16 )
                    // InternalMyDslParser.g:2059:3: ruleint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDslParser.g:2064:2: ( ruleuint16 )
                    {
                    // InternalMyDslParser.g:2064:2: ( ruleuint16 )
                    // InternalMyDslParser.g:2065:3: ruleuint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleuint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDslParser.g:2070:2: ( ruleint32 )
                    {
                    // InternalMyDslParser.g:2070:2: ( ruleint32 )
                    // InternalMyDslParser.g:2071:3: ruleint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDslParser.g:2076:2: ( ruleuint32 )
                    {
                    // InternalMyDslParser.g:2076:2: ( ruleuint32 )
                    // InternalMyDslParser.g:2077:3: ruleuint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleuint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDslParser.g:2082:2: ( ruleint64 )
                    {
                    // InternalMyDslParser.g:2082:2: ( ruleint64 )
                    // InternalMyDslParser.g:2083:3: ruleint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDslParser.g:2088:2: ( ruleuint64 )
                    {
                    // InternalMyDslParser.g:2088:2: ( ruleuint64 )
                    // InternalMyDslParser.g:2089:3: ruleuint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleuint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDslParser.g:2094:2: ( rulefloat32 )
                    {
                    // InternalMyDslParser.g:2094:2: ( rulefloat32 )
                    // InternalMyDslParser.g:2095:3: rulefloat32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulefloat32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDslParser.g:2100:2: ( rulefloat64 )
                    {
                    // InternalMyDslParser.g:2100:2: ( rulefloat64 )
                    // InternalMyDslParser.g:2101:3: rulefloat64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulefloat64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDslParser.g:2106:2: ( rulestring0 )
                    {
                    // InternalMyDslParser.g:2106:2: ( rulestring0 )
                    // InternalMyDslParser.g:2107:3: rulestring0
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulestring0();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDslParser.g:2112:2: ( rulebyte )
                    {
                    // InternalMyDslParser.g:2112:2: ( rulebyte )
                    // InternalMyDslParser.g:2113:3: rulebyte
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulebyte();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDslParser.g:2118:2: ( ruletime )
                    {
                    // InternalMyDslParser.g:2118:2: ( ruletime )
                    // InternalMyDslParser.g:2119:3: ruletime
                    {
                     before(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruletime();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDslParser.g:2124:2: ( ruleduration )
                    {
                    // InternalMyDslParser.g:2124:2: ( ruleduration )
                    // InternalMyDslParser.g:2125:3: ruleduration
                    {
                     before(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleduration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDslParser.g:2130:2: ( ruleHeader )
                    {
                    // InternalMyDslParser.g:2130:2: ( ruleHeader )
                    // InternalMyDslParser.g:2131:3: ruleHeader
                    {
                     before(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleHeader();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyDslParser.g:2136:2: ( ruleboolArray )
                    {
                    // InternalMyDslParser.g:2136:2: ( ruleboolArray )
                    // InternalMyDslParser.g:2137:3: ruleboolArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleboolArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyDslParser.g:2142:2: ( ruleint8Array )
                    {
                    // InternalMyDslParser.g:2142:2: ( ruleint8Array )
                    // InternalMyDslParser.g:2143:3: ruleint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyDslParser.g:2148:2: ( ruleuint8Array )
                    {
                    // InternalMyDslParser.g:2148:2: ( ruleuint8Array )
                    // InternalMyDslParser.g:2149:3: ruleuint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleuint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyDslParser.g:2154:2: ( ruleint16Array )
                    {
                    // InternalMyDslParser.g:2154:2: ( ruleint16Array )
                    // InternalMyDslParser.g:2155:3: ruleint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyDslParser.g:2160:2: ( ruleuint16Array )
                    {
                    // InternalMyDslParser.g:2160:2: ( ruleuint16Array )
                    // InternalMyDslParser.g:2161:3: ruleuint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20()); 
                    pushFollow(FOLLOW_2);
                    ruleuint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyDslParser.g:2166:2: ( ruleint32Array )
                    {
                    // InternalMyDslParser.g:2166:2: ( ruleint32Array )
                    // InternalMyDslParser.g:2167:3: ruleint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21()); 
                    pushFollow(FOLLOW_2);
                    ruleint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyDslParser.g:2172:2: ( ruleuint32Array )
                    {
                    // InternalMyDslParser.g:2172:2: ( ruleuint32Array )
                    // InternalMyDslParser.g:2173:3: ruleuint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22()); 
                    pushFollow(FOLLOW_2);
                    ruleuint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyDslParser.g:2178:2: ( ruleint64Array )
                    {
                    // InternalMyDslParser.g:2178:2: ( ruleint64Array )
                    // InternalMyDslParser.g:2179:3: ruleint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23()); 
                    pushFollow(FOLLOW_2);
                    ruleint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalMyDslParser.g:2184:2: ( ruleuint64Array )
                    {
                    // InternalMyDslParser.g:2184:2: ( ruleuint64Array )
                    // InternalMyDslParser.g:2185:3: ruleuint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24()); 
                    pushFollow(FOLLOW_2);
                    ruleuint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalMyDslParser.g:2190:2: ( rulefloat32Array )
                    {
                    // InternalMyDslParser.g:2190:2: ( rulefloat32Array )
                    // InternalMyDslParser.g:2191:3: rulefloat32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25()); 
                    pushFollow(FOLLOW_2);
                    rulefloat32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalMyDslParser.g:2196:2: ( rulefloat64Array )
                    {
                    // InternalMyDslParser.g:2196:2: ( rulefloat64Array )
                    // InternalMyDslParser.g:2197:3: rulefloat64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26()); 
                    pushFollow(FOLLOW_2);
                    rulefloat64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalMyDslParser.g:2202:2: ( rulestring0Array )
                    {
                    // InternalMyDslParser.g:2202:2: ( rulestring0Array )
                    // InternalMyDslParser.g:2203:3: rulestring0Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27()); 
                    pushFollow(FOLLOW_2);
                    rulestring0Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalMyDslParser.g:2208:2: ( rulebyteArray )
                    {
                    // InternalMyDslParser.g:2208:2: ( rulebyteArray )
                    // InternalMyDslParser.g:2209:3: rulebyteArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28()); 
                    pushFollow(FOLLOW_2);
                    rulebyteArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalMyDslParser.g:2214:2: ( ruleSpecBaseRef )
                    {
                    // InternalMyDslParser.g:2214:2: ( ruleSpecBaseRef )
                    // InternalMyDslParser.g:2215:3: ruleSpecBaseRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecBaseRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalMyDslParser.g:2220:2: ( ruleArraySpecRef )
                    {
                    // InternalMyDslParser.g:2220:2: ( ruleArraySpecRef )
                    // InternalMyDslParser.g:2221:3: ruleArraySpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30()); 
                    pushFollow(FOLLOW_2);
                    ruleArraySpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalMyDslParser.g:2226:2: ( rulechar )
                    {
                    // InternalMyDslParser.g:2226:2: ( rulechar )
                    // InternalMyDslParser.g:2227:3: rulechar
                    {
                     before(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31()); 
                    pushFollow(FOLLOW_2);
                    rulechar();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalMyDslParser.g:2232:2: ( rulecharArray )
                    {
                    // InternalMyDslParser.g:2232:2: ( rulecharArray )
                    // InternalMyDslParser.g:2233:3: rulecharArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32()); 
                    pushFollow(FOLLOW_2);
                    rulecharArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalMyDslParser.g:2242:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2246:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt5=1;
                }
                break;
            case Message:
                {
                alt5=2;
                }
                break;
            case Result:
                {
                alt5=3;
                }
                break;
            case Feedback:
                {
                alt5=4;
                }
                break;
            case Name:
                {
                alt5=5;
                }
                break;
            case Value:
                {
                alt5=6;
                }
                break;
            case Service:
                {
                alt5=7;
                }
                break;
            case Type:
                {
                alt5=8;
                }
                break;
            case Action:
                {
                alt5=9;
                }
                break;
            case Duration:
                {
                alt5=10;
                }
                break;
            case Time:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDslParser.g:2247:2: ( Goal )
                    {
                    // InternalMyDslParser.g:2247:2: ( Goal )
                    // InternalMyDslParser.g:2248:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 
                    match(input,Goal,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2253:2: ( Message )
                    {
                    // InternalMyDslParser.g:2253:2: ( Message )
                    // InternalMyDslParser.g:2254:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 
                    match(input,Message,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:2259:2: ( Result )
                    {
                    // InternalMyDslParser.g:2259:2: ( Result )
                    // InternalMyDslParser.g:2260:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 
                    match(input,Result,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDslParser.g:2265:2: ( Feedback )
                    {
                    // InternalMyDslParser.g:2265:2: ( Feedback )
                    // InternalMyDslParser.g:2266:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 
                    match(input,Feedback,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDslParser.g:2271:2: ( Name )
                    {
                    // InternalMyDslParser.g:2271:2: ( Name )
                    // InternalMyDslParser.g:2272:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDslParser.g:2277:2: ( Value )
                    {
                    // InternalMyDslParser.g:2277:2: ( Value )
                    // InternalMyDslParser.g:2278:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 
                    match(input,Value,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDslParser.g:2283:2: ( Service )
                    {
                    // InternalMyDslParser.g:2283:2: ( Service )
                    // InternalMyDslParser.g:2284:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 
                    match(input,Service,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDslParser.g:2289:2: ( Type )
                    {
                    // InternalMyDslParser.g:2289:2: ( Type )
                    // InternalMyDslParser.g:2290:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDslParser.g:2295:2: ( Action )
                    {
                    // InternalMyDslParser.g:2295:2: ( Action )
                    // InternalMyDslParser.g:2296:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 
                    match(input,Action,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDslParser.g:2301:2: ( Duration )
                    {
                    // InternalMyDslParser.g:2301:2: ( Duration )
                    // InternalMyDslParser.g:2302:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 
                    match(input,Duration,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDslParser.g:2307:2: ( Time )
                    {
                    // InternalMyDslParser.g:2307:2: ( Time )
                    // InternalMyDslParser.g:2308:3: Time
                    {
                     before(grammarAccess.getKEYWORDAccess().getTimeKeyword_10()); 
                    match(input,Time,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTimeKeyword_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDslParser.g:2317:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2321:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDslParser.g:2322:2: ( RULE_STRING )
                    {
                    // InternalMyDslParser.g:2322:2: ( RULE_STRING )
                    // InternalMyDslParser.g:2323:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2328:2: ( RULE_ID )
                    {
                    // InternalMyDslParser.g:2328:2: ( RULE_ID )
                    // InternalMyDslParser.g:2329:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDslParser.g:2338:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2342:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDslParser.g:2343:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDslParser.g:2350:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2354:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalMyDslParser.g:2355:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalMyDslParser.g:2355:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalMyDslParser.g:2356:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalMyDslParser.g:2357:2: ( rule__Model__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Import) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDslParser.g:2357:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDslParser.g:2365:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2369:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDslParser.g:2370:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDslParser.g:2377:1: rule__Model__Group__1__Impl : ( Ros_system ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2381:1: ( ( Ros_system ) )
            // InternalMyDslParser.g:2382:1: ( Ros_system )
            {
            // InternalMyDslParser.g:2382:1: ( Ros_system )
            // InternalMyDslParser.g:2383:2: Ros_system
            {
             before(grammarAccess.getModelAccess().getRos_systemKeyword_1()); 
            match(input,Ros_system,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRos_systemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDslParser.g:2392:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2396:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDslParser.g:2397:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDslParser.g:2404:1: rule__Model__Group__2__Impl : ( ( rule__Model__RossystemAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2408:1: ( ( ( rule__Model__RossystemAssignment_2 ) ) )
            // InternalMyDslParser.g:2409:1: ( ( rule__Model__RossystemAssignment_2 ) )
            {
            // InternalMyDslParser.g:2409:1: ( ( rule__Model__RossystemAssignment_2 ) )
            // InternalMyDslParser.g:2410:2: ( rule__Model__RossystemAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getRossystemAssignment_2()); 
            // InternalMyDslParser.g:2411:2: ( rule__Model__RossystemAssignment_2 )
            // InternalMyDslParser.g:2411:3: rule__Model__RossystemAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__RossystemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRossystemAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDslParser.g:2419:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2423:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDslParser.g:2424:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDslParser.g:2431:1: rule__Model__Group__3__Impl : ( Semicolon ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2435:1: ( ( Semicolon ) )
            // InternalMyDslParser.g:2436:1: ( Semicolon )
            {
            // InternalMyDslParser.g:2436:1: ( Semicolon )
            // InternalMyDslParser.g:2437:2: Semicolon
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDslParser.g:2446:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2450:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDslParser.g:2451:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDslParser.g:2458:1: rule__Model__Group__4__Impl : ( Reconfigs ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2462:1: ( ( Reconfigs ) )
            // InternalMyDslParser.g:2463:1: ( Reconfigs )
            {
            // InternalMyDslParser.g:2463:1: ( Reconfigs )
            // InternalMyDslParser.g:2464:2: Reconfigs
            {
             before(grammarAccess.getModelAccess().getReconfigsKeyword_4()); 
            match(input,Reconfigs,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getReconfigsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDslParser.g:2473:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2477:1: ( rule__Model__Group__5__Impl )
            // InternalMyDslParser.g:2478:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDslParser.g:2484:1: rule__Model__Group__5__Impl : ( ( rule__Model__ReconfigurationsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2488:1: ( ( ( rule__Model__ReconfigurationsAssignment_5 )* ) )
            // InternalMyDslParser.g:2489:1: ( ( rule__Model__ReconfigurationsAssignment_5 )* )
            {
            // InternalMyDslParser.g:2489:1: ( ( rule__Model__ReconfigurationsAssignment_5 )* )
            // InternalMyDslParser.g:2490:2: ( rule__Model__ReconfigurationsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getReconfigurationsAssignment_5()); 
            // InternalMyDslParser.g:2491:2: ( rule__Model__ReconfigurationsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==SetParameter) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDslParser.g:2491:3: rule__Model__ReconfigurationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__ReconfigurationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getReconfigurationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyDslParser.g:2500:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2504:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDslParser.g:2505:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMyDslParser.g:2512:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2516:1: ( ( Import ) )
            // InternalMyDslParser.g:2517:1: ( Import )
            {
            // InternalMyDslParser.g:2517:1: ( Import )
            // InternalMyDslParser.g:2518:2: Import
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,Import,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMyDslParser.g:2527:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2531:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMyDslParser.g:2532:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMyDslParser.g:2539:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2543:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalMyDslParser.g:2544:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalMyDslParser.g:2544:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalMyDslParser.g:2545:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalMyDslParser.g:2546:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalMyDslParser.g:2546:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMyDslParser.g:2554:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2558:1: ( rule__Import__Group__2__Impl )
            // InternalMyDslParser.g:2559:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMyDslParser.g:2565:1: rule__Import__Group__2__Impl : ( Semicolon ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2569:1: ( ( Semicolon ) )
            // InternalMyDslParser.g:2570:1: ( Semicolon )
            {
            // InternalMyDslParser.g:2570:1: ( Semicolon )
            // InternalMyDslParser.g:2571:2: Semicolon
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__SetParam__Group__0"
    // InternalMyDslParser.g:2581:1: rule__SetParam__Group__0 : rule__SetParam__Group__0__Impl rule__SetParam__Group__1 ;
    public final void rule__SetParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2585:1: ( rule__SetParam__Group__0__Impl rule__SetParam__Group__1 )
            // InternalMyDslParser.g:2586:2: rule__SetParam__Group__0__Impl rule__SetParam__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SetParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__0"


    // $ANTLR start "rule__SetParam__Group__0__Impl"
    // InternalMyDslParser.g:2593:1: rule__SetParam__Group__0__Impl : ( SetParameter ) ;
    public final void rule__SetParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2597:1: ( ( SetParameter ) )
            // InternalMyDslParser.g:2598:1: ( SetParameter )
            {
            // InternalMyDslParser.g:2598:1: ( SetParameter )
            // InternalMyDslParser.g:2599:2: SetParameter
            {
             before(grammarAccess.getSetParamAccess().getSetParameterKeyword_0()); 
            match(input,SetParameter,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getSetParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__0__Impl"


    // $ANTLR start "rule__SetParam__Group__1"
    // InternalMyDslParser.g:2608:1: rule__SetParam__Group__1 : rule__SetParam__Group__1__Impl rule__SetParam__Group__2 ;
    public final void rule__SetParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2612:1: ( rule__SetParam__Group__1__Impl rule__SetParam__Group__2 )
            // InternalMyDslParser.g:2613:2: rule__SetParam__Group__1__Impl rule__SetParam__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SetParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__1"


    // $ANTLR start "rule__SetParam__Group__1__Impl"
    // InternalMyDslParser.g:2620:1: rule__SetParam__Group__1__Impl : ( ( rule__SetParam__NodeAssignment_1 ) ) ;
    public final void rule__SetParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2624:1: ( ( ( rule__SetParam__NodeAssignment_1 ) ) )
            // InternalMyDslParser.g:2625:1: ( ( rule__SetParam__NodeAssignment_1 ) )
            {
            // InternalMyDslParser.g:2625:1: ( ( rule__SetParam__NodeAssignment_1 ) )
            // InternalMyDslParser.g:2626:2: ( rule__SetParam__NodeAssignment_1 )
            {
             before(grammarAccess.getSetParamAccess().getNodeAssignment_1()); 
            // InternalMyDslParser.g:2627:2: ( rule__SetParam__NodeAssignment_1 )
            // InternalMyDslParser.g:2627:3: rule__SetParam__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetParam__NodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetParamAccess().getNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__1__Impl"


    // $ANTLR start "rule__SetParam__Group__2"
    // InternalMyDslParser.g:2635:1: rule__SetParam__Group__2 : rule__SetParam__Group__2__Impl rule__SetParam__Group__3 ;
    public final void rule__SetParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2639:1: ( rule__SetParam__Group__2__Impl rule__SetParam__Group__3 )
            // InternalMyDslParser.g:2640:2: rule__SetParam__Group__2__Impl rule__SetParam__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SetParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__2"


    // $ANTLR start "rule__SetParam__Group__2__Impl"
    // InternalMyDslParser.g:2647:1: rule__SetParam__Group__2__Impl : ( Comma ) ;
    public final void rule__SetParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2651:1: ( ( Comma ) )
            // InternalMyDslParser.g:2652:1: ( Comma )
            {
            // InternalMyDslParser.g:2652:1: ( Comma )
            // InternalMyDslParser.g:2653:2: Comma
            {
             before(grammarAccess.getSetParamAccess().getCommaKeyword_2()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__2__Impl"


    // $ANTLR start "rule__SetParam__Group__3"
    // InternalMyDslParser.g:2662:1: rule__SetParam__Group__3 : rule__SetParam__Group__3__Impl rule__SetParam__Group__4 ;
    public final void rule__SetParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2666:1: ( rule__SetParam__Group__3__Impl rule__SetParam__Group__4 )
            // InternalMyDslParser.g:2667:2: rule__SetParam__Group__3__Impl rule__SetParam__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__SetParam__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__3"


    // $ANTLR start "rule__SetParam__Group__3__Impl"
    // InternalMyDslParser.g:2674:1: rule__SetParam__Group__3__Impl : ( ( rule__SetParam__ParamAssignment_3 ) ) ;
    public final void rule__SetParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2678:1: ( ( ( rule__SetParam__ParamAssignment_3 ) ) )
            // InternalMyDslParser.g:2679:1: ( ( rule__SetParam__ParamAssignment_3 ) )
            {
            // InternalMyDslParser.g:2679:1: ( ( rule__SetParam__ParamAssignment_3 ) )
            // InternalMyDslParser.g:2680:2: ( rule__SetParam__ParamAssignment_3 )
            {
             before(grammarAccess.getSetParamAccess().getParamAssignment_3()); 
            // InternalMyDslParser.g:2681:2: ( rule__SetParam__ParamAssignment_3 )
            // InternalMyDslParser.g:2681:3: rule__SetParam__ParamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetParam__ParamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetParamAccess().getParamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__3__Impl"


    // $ANTLR start "rule__SetParam__Group__4"
    // InternalMyDslParser.g:2689:1: rule__SetParam__Group__4 : rule__SetParam__Group__4__Impl rule__SetParam__Group__5 ;
    public final void rule__SetParam__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2693:1: ( rule__SetParam__Group__4__Impl rule__SetParam__Group__5 )
            // InternalMyDslParser.g:2694:2: rule__SetParam__Group__4__Impl rule__SetParam__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__SetParam__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__4"


    // $ANTLR start "rule__SetParam__Group__4__Impl"
    // InternalMyDslParser.g:2701:1: rule__SetParam__Group__4__Impl : ( Comma ) ;
    public final void rule__SetParam__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2705:1: ( ( Comma ) )
            // InternalMyDslParser.g:2706:1: ( Comma )
            {
            // InternalMyDslParser.g:2706:1: ( Comma )
            // InternalMyDslParser.g:2707:2: Comma
            {
             before(grammarAccess.getSetParamAccess().getCommaKeyword_4()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__4__Impl"


    // $ANTLR start "rule__SetParam__Group__5"
    // InternalMyDslParser.g:2716:1: rule__SetParam__Group__5 : rule__SetParam__Group__5__Impl rule__SetParam__Group__6 ;
    public final void rule__SetParam__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2720:1: ( rule__SetParam__Group__5__Impl rule__SetParam__Group__6 )
            // InternalMyDslParser.g:2721:2: rule__SetParam__Group__5__Impl rule__SetParam__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__SetParam__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetParam__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__5"


    // $ANTLR start "rule__SetParam__Group__5__Impl"
    // InternalMyDslParser.g:2728:1: rule__SetParam__Group__5__Impl : ( ( rule__SetParam__ValueAssignment_5 ) ) ;
    public final void rule__SetParam__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2732:1: ( ( ( rule__SetParam__ValueAssignment_5 ) ) )
            // InternalMyDslParser.g:2733:1: ( ( rule__SetParam__ValueAssignment_5 ) )
            {
            // InternalMyDslParser.g:2733:1: ( ( rule__SetParam__ValueAssignment_5 ) )
            // InternalMyDslParser.g:2734:2: ( rule__SetParam__ValueAssignment_5 )
            {
             before(grammarAccess.getSetParamAccess().getValueAssignment_5()); 
            // InternalMyDslParser.g:2735:2: ( rule__SetParam__ValueAssignment_5 )
            // InternalMyDslParser.g:2735:3: rule__SetParam__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SetParam__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSetParamAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__5__Impl"


    // $ANTLR start "rule__SetParam__Group__6"
    // InternalMyDslParser.g:2743:1: rule__SetParam__Group__6 : rule__SetParam__Group__6__Impl ;
    public final void rule__SetParam__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2747:1: ( rule__SetParam__Group__6__Impl )
            // InternalMyDslParser.g:2748:2: rule__SetParam__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetParam__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__6"


    // $ANTLR start "rule__SetParam__Group__6__Impl"
    // InternalMyDslParser.g:2754:1: rule__SetParam__Group__6__Impl : ( RightParenthesis ) ;
    public final void rule__SetParam__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2758:1: ( ( RightParenthesis ) )
            // InternalMyDslParser.g:2759:1: ( RightParenthesis )
            {
            // InternalMyDslParser.g:2759:1: ( RightParenthesis )
            // InternalMyDslParser.g:2760:2: RightParenthesis
            {
             before(grammarAccess.getSetParamAccess().getRightParenthesisKeyword_6()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__Group__6__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalMyDslParser.g:2770:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2774:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalMyDslParser.g:2775:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GlobalNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0"


    // $ANTLR start "rule__GlobalNamespace__Group__0__Impl"
    // InternalMyDslParser.g:2782:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2786:1: ( ( () ) )
            // InternalMyDslParser.g:2787:1: ( () )
            {
            // InternalMyDslParser.g:2787:1: ( () )
            // InternalMyDslParser.g:2788:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalMyDslParser.g:2789:2: ()
            // InternalMyDslParser.g:2789:3: 
            {
            }

             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__1"
    // InternalMyDslParser.g:2797:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2801:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalMyDslParser.g:2802:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__GlobalNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1"


    // $ANTLR start "rule__GlobalNamespace__Group__1__Impl"
    // InternalMyDslParser.g:2809:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2813:1: ( ( GlobalNamespace ) )
            // InternalMyDslParser.g:2814:1: ( GlobalNamespace )
            {
            // InternalMyDslParser.g:2814:1: ( GlobalNamespace )
            // InternalMyDslParser.g:2815:2: GlobalNamespace
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,GlobalNamespace,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__2"
    // InternalMyDslParser.g:2824:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2828:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalMyDslParser.g:2829:2: rule__GlobalNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2"


    // $ANTLR start "rule__GlobalNamespace__Group__2__Impl"
    // InternalMyDslParser.g:2835:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2839:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalMyDslParser.g:2840:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalMyDslParser.g:2840:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalMyDslParser.g:2841:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2()); 
            // InternalMyDslParser.g:2842:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDslParser.g:2842:3: rule__GlobalNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__0"
    // InternalMyDslParser.g:2851:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2855:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalMyDslParser.g:2856:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__GlobalNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2__0__Impl"
    // InternalMyDslParser.g:2863:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2867:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:2868:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:2868:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:2869:2: LeftSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1"
    // InternalMyDslParser.g:2878:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2882:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalMyDslParser.g:2883:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__GlobalNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1__Impl"
    // InternalMyDslParser.g:2890:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2894:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalMyDslParser.g:2895:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:2895:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalMyDslParser.g:2896:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalMyDslParser.g:2897:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalMyDslParser.g:2897:3: rule__GlobalNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2"
    // InternalMyDslParser.g:2905:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2909:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalMyDslParser.g:2910:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__GlobalNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2__Impl"
    // InternalMyDslParser.g:2917:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2921:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalMyDslParser.g:2922:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalMyDslParser.g:2922:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalMyDslParser.g:2923:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2()); 
            // InternalMyDslParser.g:2924:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDslParser.g:2924:3: rule__GlobalNamespace__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GlobalNamespace__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3"
    // InternalMyDslParser.g:2932:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2936:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalMyDslParser.g:2937:2: rule__GlobalNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3__Impl"
    // InternalMyDslParser.g:2943:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2947:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:2948:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:2948:1: ( RightSquareBracket )
            // InternalMyDslParser.g:2949:2: RightSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0"
    // InternalMyDslParser.g:2959:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2963:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalMyDslParser.g:2964:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_16);
            rule__GlobalNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0__Impl"
    // InternalMyDslParser.g:2971:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2975:1: ( ( Comma ) )
            // InternalMyDslParser.g:2976:1: ( Comma )
            {
            // InternalMyDslParser.g:2976:1: ( Comma )
            // InternalMyDslParser.g:2977:2: Comma
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1"
    // InternalMyDslParser.g:2986:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:2990:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalMyDslParser.g:2991:2: rule__GlobalNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1__Impl"
    // InternalMyDslParser.g:2997:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3001:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalMyDslParser.g:3002:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalMyDslParser.g:3002:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalMyDslParser.g:3003:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalMyDslParser.g:3004:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalMyDslParser.g:3004:3: rule__GlobalNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalMyDslParser.g:3013:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3017:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalMyDslParser.g:3018:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RelativeNamespace_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0__Impl"
    // InternalMyDslParser.g:3025:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3029:1: ( ( () ) )
            // InternalMyDslParser.g:3030:1: ( () )
            {
            // InternalMyDslParser.g:3030:1: ( () )
            // InternalMyDslParser.g:3031:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalMyDslParser.g:3032:2: ()
            // InternalMyDslParser.g:3032:3: 
            {
            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1"
    // InternalMyDslParser.g:3040:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3044:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalMyDslParser.g:3045:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__RelativeNamespace_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1__Impl"
    // InternalMyDslParser.g:3052:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3056:1: ( ( RelativeNamespace ) )
            // InternalMyDslParser.g:3057:1: ( RelativeNamespace )
            {
            // InternalMyDslParser.g:3057:1: ( RelativeNamespace )
            // InternalMyDslParser.g:3058:2: RelativeNamespace
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,RelativeNamespace,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2"
    // InternalMyDslParser.g:3067:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3071:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalMyDslParser.g:3072:2: rule__RelativeNamespace_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2__Impl"
    // InternalMyDslParser.g:3078:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3082:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalMyDslParser.g:3083:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalMyDslParser.g:3083:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalMyDslParser.g:3084:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2()); 
            // InternalMyDslParser.g:3085:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LeftSquareBracket) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDslParser.g:3085:3: rule__RelativeNamespace_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0"
    // InternalMyDslParser.g:3094:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3098:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalMyDslParser.g:3099:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__RelativeNamespace_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0__Impl"
    // InternalMyDslParser.g:3106:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3110:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:3111:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:3111:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:3112:2: LeftSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1"
    // InternalMyDslParser.g:3121:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3125:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalMyDslParser.g:3126:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__RelativeNamespace_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1__Impl"
    // InternalMyDslParser.g:3133:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3137:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalMyDslParser.g:3138:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:3138:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalMyDslParser.g:3139:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1()); 
            // InternalMyDslParser.g:3140:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalMyDslParser.g:3140:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2"
    // InternalMyDslParser.g:3148:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3152:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalMyDslParser.g:3153:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__RelativeNamespace_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2__Impl"
    // InternalMyDslParser.g:3160:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3164:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalMyDslParser.g:3165:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalMyDslParser.g:3165:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalMyDslParser.g:3166:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2()); 
            // InternalMyDslParser.g:3167:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDslParser.g:3167:3: rule__RelativeNamespace_Impl__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RelativeNamespace_Impl__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3"
    // InternalMyDslParser.g:3175:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3179:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalMyDslParser.g:3180:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3__Impl"
    // InternalMyDslParser.g:3186:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3190:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:3191:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:3191:1: ( RightSquareBracket )
            // InternalMyDslParser.g:3192:2: RightSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0"
    // InternalMyDslParser.g:3202:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3206:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalMyDslParser.g:3207:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
            {
            pushFollow(FOLLOW_16);
            rule__RelativeNamespace_Impl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"
    // InternalMyDslParser.g:3214:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3218:1: ( ( Comma ) )
            // InternalMyDslParser.g:3219:1: ( Comma )
            {
            // InternalMyDslParser.g:3219:1: ( Comma )
            // InternalMyDslParser.g:3220:2: Comma
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1"
    // InternalMyDslParser.g:3229:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3233:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalMyDslParser.g:3234:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"
    // InternalMyDslParser.g:3240:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3244:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalMyDslParser.g:3245:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalMyDslParser.g:3245:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalMyDslParser.g:3246:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1()); 
            // InternalMyDslParser.g:3247:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalMyDslParser.g:3247:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalMyDslParser.g:3256:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3260:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalMyDslParser.g:3261:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PrivateNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0"


    // $ANTLR start "rule__PrivateNamespace__Group__0__Impl"
    // InternalMyDslParser.g:3268:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3272:1: ( ( () ) )
            // InternalMyDslParser.g:3273:1: ( () )
            {
            // InternalMyDslParser.g:3273:1: ( () )
            // InternalMyDslParser.g:3274:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalMyDslParser.g:3275:2: ()
            // InternalMyDslParser.g:3275:3: 
            {
            }

             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__1"
    // InternalMyDslParser.g:3283:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3287:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalMyDslParser.g:3288:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PrivateNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1"


    // $ANTLR start "rule__PrivateNamespace__Group__1__Impl"
    // InternalMyDslParser.g:3295:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3299:1: ( ( PrivateNamespace ) )
            // InternalMyDslParser.g:3300:1: ( PrivateNamespace )
            {
            // InternalMyDslParser.g:3300:1: ( PrivateNamespace )
            // InternalMyDslParser.g:3301:2: PrivateNamespace
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,PrivateNamespace,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__2"
    // InternalMyDslParser.g:3310:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3314:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalMyDslParser.g:3315:2: rule__PrivateNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2"


    // $ANTLR start "rule__PrivateNamespace__Group__2__Impl"
    // InternalMyDslParser.g:3321:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3325:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalMyDslParser.g:3326:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalMyDslParser.g:3326:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalMyDslParser.g:3327:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2()); 
            // InternalMyDslParser.g:3328:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftSquareBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDslParser.g:3328:3: rule__PrivateNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__0"
    // InternalMyDslParser.g:3337:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3341:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalMyDslParser.g:3342:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__PrivateNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2__0__Impl"
    // InternalMyDslParser.g:3349:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3353:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:3354:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:3354:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:3355:2: LeftSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1"
    // InternalMyDslParser.g:3364:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3368:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalMyDslParser.g:3369:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__PrivateNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1__Impl"
    // InternalMyDslParser.g:3376:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3380:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalMyDslParser.g:3381:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:3381:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalMyDslParser.g:3382:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalMyDslParser.g:3383:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalMyDslParser.g:3383:3: rule__PrivateNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2"
    // InternalMyDslParser.g:3391:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3395:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalMyDslParser.g:3396:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__PrivateNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2__Impl"
    // InternalMyDslParser.g:3403:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3407:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalMyDslParser.g:3408:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalMyDslParser.g:3408:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalMyDslParser.g:3409:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2()); 
            // InternalMyDslParser.g:3410:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDslParser.g:3410:3: rule__PrivateNamespace__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PrivateNamespace__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3"
    // InternalMyDslParser.g:3418:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3422:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalMyDslParser.g:3423:2: rule__PrivateNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3__Impl"
    // InternalMyDslParser.g:3429:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3433:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:3434:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:3434:1: ( RightSquareBracket )
            // InternalMyDslParser.g:3435:2: RightSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0"
    // InternalMyDslParser.g:3445:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3449:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalMyDslParser.g:3450:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_16);
            rule__PrivateNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0__Impl"
    // InternalMyDslParser.g:3457:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3461:1: ( ( Comma ) )
            // InternalMyDslParser.g:3462:1: ( Comma )
            {
            // InternalMyDslParser.g:3462:1: ( Comma )
            // InternalMyDslParser.g:3463:2: Comma
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1"
    // InternalMyDslParser.g:3472:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3476:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalMyDslParser.g:3477:2: rule__PrivateNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1__Impl"
    // InternalMyDslParser.g:3483:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3487:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalMyDslParser.g:3488:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalMyDslParser.g:3488:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalMyDslParser.g:3489:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalMyDslParser.g:3490:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalMyDslParser.g:3490:3: rule__PrivateNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__0"
    // InternalMyDslParser.g:3499:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3503:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalMyDslParser.g:3504:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0"


    // $ANTLR start "rule__ParameterListType__Group__0__Impl"
    // InternalMyDslParser.g:3511:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3515:1: ( ( () ) )
            // InternalMyDslParser.g:3516:1: ( () )
            {
            // InternalMyDslParser.g:3516:1: ( () )
            // InternalMyDslParser.g:3517:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 
            // InternalMyDslParser.g:3518:2: ()
            // InternalMyDslParser.g:3518:3: 
            {
            }

             after(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group__1"
    // InternalMyDslParser.g:3526:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3530:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalMyDslParser.g:3531:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1"


    // $ANTLR start "rule__ParameterListType__Group__1__Impl"
    // InternalMyDslParser.g:3538:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3542:1: ( ( List ) )
            // InternalMyDslParser.g:3543:1: ( List )
            {
            // InternalMyDslParser.g:3543:1: ( List )
            // InternalMyDslParser.g:3544:2: List
            {
             before(grammarAccess.getParameterListTypeAccess().getListKeyword_1()); 
            match(input,List,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getListKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__2"
    // InternalMyDslParser.g:3553:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3557:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalMyDslParser.g:3558:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ParameterListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2"


    // $ANTLR start "rule__ParameterListType__Group__2__Impl"
    // InternalMyDslParser.g:3565:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3569:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:3570:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:3570:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:3571:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2__Impl"


    // $ANTLR start "rule__ParameterListType__Group__3"
    // InternalMyDslParser.g:3580:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3584:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalMyDslParser.g:3585:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ParameterListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3"


    // $ANTLR start "rule__ParameterListType__Group__3__Impl"
    // InternalMyDslParser.g:3592:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3596:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalMyDslParser.g:3597:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalMyDslParser.g:3597:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalMyDslParser.g:3598:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 
            // InternalMyDslParser.g:3599:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalMyDslParser.g:3599:3: rule__ParameterListType__SequenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3__Impl"


    // $ANTLR start "rule__ParameterListType__Group__4"
    // InternalMyDslParser.g:3607:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3611:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalMyDslParser.g:3612:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ParameterListType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4"


    // $ANTLR start "rule__ParameterListType__Group__4__Impl"
    // InternalMyDslParser.g:3619:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3623:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalMyDslParser.g:3624:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalMyDslParser.g:3624:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalMyDslParser.g:3625:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4()); 
            // InternalMyDslParser.g:3626:2: ( rule__ParameterListType__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDslParser.g:3626:3: rule__ParameterListType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ParameterListType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getParameterListTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4__Impl"


    // $ANTLR start "rule__ParameterListType__Group__5"
    // InternalMyDslParser.g:3634:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3638:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalMyDslParser.g:3639:2: rule__ParameterListType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5"


    // $ANTLR start "rule__ParameterListType__Group__5__Impl"
    // InternalMyDslParser.g:3645:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3649:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:3650:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:3650:1: ( RightSquareBracket )
            // InternalMyDslParser.g:3651:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__0"
    // InternalMyDslParser.g:3661:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3665:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalMyDslParser.g:3666:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__ParameterListType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0"


    // $ANTLR start "rule__ParameterListType__Group_4__0__Impl"
    // InternalMyDslParser.g:3673:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3677:1: ( ( Comma ) )
            // InternalMyDslParser.g:3678:1: ( Comma )
            {
            // InternalMyDslParser.g:3678:1: ( Comma )
            // InternalMyDslParser.g:3679:2: Comma
            {
             before(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__1"
    // InternalMyDslParser.g:3688:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3692:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalMyDslParser.g:3693:2: rule__ParameterListType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1"


    // $ANTLR start "rule__ParameterListType__Group_4__1__Impl"
    // InternalMyDslParser.g:3699:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3703:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalMyDslParser.g:3704:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalMyDslParser.g:3704:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalMyDslParser.g:3705:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 
            // InternalMyDslParser.g:3706:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalMyDslParser.g:3706:3: rule__ParameterListType__SequenceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__0"
    // InternalMyDslParser.g:3715:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3719:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalMyDslParser.g:3720:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ParameterStructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0"


    // $ANTLR start "rule__ParameterStructType__Group__0__Impl"
    // InternalMyDslParser.g:3727:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3731:1: ( ( () ) )
            // InternalMyDslParser.g:3732:1: ( () )
            {
            // InternalMyDslParser.g:3732:1: ( () )
            // InternalMyDslParser.g:3733:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 
            // InternalMyDslParser.g:3734:2: ()
            // InternalMyDslParser.g:3734:3: 
            {
            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__1"
    // InternalMyDslParser.g:3742:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3746:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalMyDslParser.g:3747:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParameterStructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1"


    // $ANTLR start "rule__ParameterStructType__Group__1__Impl"
    // InternalMyDslParser.g:3754:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3758:1: ( ( Struct ) )
            // InternalMyDslParser.g:3759:1: ( Struct )
            {
            // InternalMyDslParser.g:3759:1: ( Struct )
            // InternalMyDslParser.g:3760:2: Struct
            {
             before(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1()); 
            match(input,Struct,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__2"
    // InternalMyDslParser.g:3769:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3773:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalMyDslParser.g:3774:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ParameterStructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2"


    // $ANTLR start "rule__ParameterStructType__Group__2__Impl"
    // InternalMyDslParser.g:3781:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3785:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:3786:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:3786:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:3787:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__3"
    // InternalMyDslParser.g:3796:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3800:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalMyDslParser.g:3801:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ParameterStructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3"


    // $ANTLR start "rule__ParameterStructType__Group__3__Impl"
    // InternalMyDslParser.g:3808:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3812:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalMyDslParser.g:3813:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalMyDslParser.g:3813:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalMyDslParser.g:3814:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 
            // InternalMyDslParser.g:3815:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalMyDslParser.g:3815:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__4"
    // InternalMyDslParser.g:3823:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3827:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalMyDslParser.g:3828:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ParameterStructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4"


    // $ANTLR start "rule__ParameterStructType__Group__4__Impl"
    // InternalMyDslParser.g:3835:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3839:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalMyDslParser.g:3840:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalMyDslParser.g:3840:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalMyDslParser.g:3841:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 
            // InternalMyDslParser.g:3842:2: ( rule__ParameterStructType__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDslParser.g:3842:3: rule__ParameterStructType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ParameterStructType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__5"
    // InternalMyDslParser.g:3850:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3854:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalMyDslParser.g:3855:2: rule__ParameterStructType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5"


    // $ANTLR start "rule__ParameterStructType__Group__5__Impl"
    // InternalMyDslParser.g:3861:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3865:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:3866:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:3866:1: ( RightSquareBracket )
            // InternalMyDslParser.g:3867:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__0"
    // InternalMyDslParser.g:3877:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3881:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalMyDslParser.g:3882:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterStructType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0"


    // $ANTLR start "rule__ParameterStructType__Group_4__0__Impl"
    // InternalMyDslParser.g:3889:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3893:1: ( ( Comma ) )
            // InternalMyDslParser.g:3894:1: ( Comma )
            {
            // InternalMyDslParser.g:3894:1: ( Comma )
            // InternalMyDslParser.g:3895:2: Comma
            {
             before(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__1"
    // InternalMyDslParser.g:3904:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3908:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalMyDslParser.g:3909:2: rule__ParameterStructType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1"


    // $ANTLR start "rule__ParameterStructType__Group_4__1__Impl"
    // InternalMyDslParser.g:3915:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3919:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalMyDslParser.g:3920:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalMyDslParser.g:3920:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalMyDslParser.g:3921:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 
            // InternalMyDslParser.g:3922:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalMyDslParser.g:3922:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__0"
    // InternalMyDslParser.g:3931:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3935:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalMyDslParser.g:3936:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ParameterIntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0"


    // $ANTLR start "rule__ParameterIntegerType__Group__0__Impl"
    // InternalMyDslParser.g:3943:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3947:1: ( ( () ) )
            // InternalMyDslParser.g:3948:1: ( () )
            {
            // InternalMyDslParser.g:3948:1: ( () )
            // InternalMyDslParser.g:3949:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 
            // InternalMyDslParser.g:3950:2: ()
            // InternalMyDslParser.g:3950:3: 
            {
            }

             after(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__1"
    // InternalMyDslParser.g:3958:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3962:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalMyDslParser.g:3963:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterIntegerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1"


    // $ANTLR start "rule__ParameterIntegerType__Group__1__Impl"
    // InternalMyDslParser.g:3970:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3974:1: ( ( Integer ) )
            // InternalMyDslParser.g:3975:1: ( Integer )
            {
            // InternalMyDslParser.g:3975:1: ( Integer )
            // InternalMyDslParser.g:3976:2: Integer
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1()); 
            match(input,Integer,FOLLOW_2); 
             after(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__2"
    // InternalMyDslParser.g:3985:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:3989:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalMyDslParser.g:3990:2: rule__ParameterIntegerType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2"


    // $ANTLR start "rule__ParameterIntegerType__Group__2__Impl"
    // InternalMyDslParser.g:3996:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4000:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalMyDslParser.g:4001:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalMyDslParser.g:4001:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalMyDslParser.g:4002:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 
            // InternalMyDslParser.g:4003:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Default) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDslParser.g:4003:3: rule__ParameterIntegerType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterIntegerType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0"
    // InternalMyDslParser.g:4012:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4016:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalMyDslParser.g:4017:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__ParameterIntegerType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0__Impl"
    // InternalMyDslParser.g:4024:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4028:1: ( ( Default ) )
            // InternalMyDslParser.g:4029:1: ( Default )
            {
            // InternalMyDslParser.g:4029:1: ( Default )
            // InternalMyDslParser.g:4030:2: Default
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1"
    // InternalMyDslParser.g:4039:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4043:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalMyDslParser.g:4044:2: rule__ParameterIntegerType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1__Impl"
    // InternalMyDslParser.g:4050:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4054:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalMyDslParser.g:4055:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:4055:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalMyDslParser.g:4056:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 
            // InternalMyDslParser.g:4057:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalMyDslParser.g:4057:3: rule__ParameterIntegerType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__0"
    // InternalMyDslParser.g:4066:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4070:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalMyDslParser.g:4071:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ParameterStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0"


    // $ANTLR start "rule__ParameterStringType__Group__0__Impl"
    // InternalMyDslParser.g:4078:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4082:1: ( ( () ) )
            // InternalMyDslParser.g:4083:1: ( () )
            {
            // InternalMyDslParser.g:4083:1: ( () )
            // InternalMyDslParser.g:4084:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalMyDslParser.g:4085:2: ()
            // InternalMyDslParser.g:4085:3: 
            {
            }

             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__1"
    // InternalMyDslParser.g:4093:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4097:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalMyDslParser.g:4098:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterStringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1"


    // $ANTLR start "rule__ParameterStringType__Group__1__Impl"
    // InternalMyDslParser.g:4105:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4109:1: ( ( String ) )
            // InternalMyDslParser.g:4110:1: ( String )
            {
            // InternalMyDslParser.g:4110:1: ( String )
            // InternalMyDslParser.g:4111:2: String
            {
             before(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 
            match(input,String,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__2"
    // InternalMyDslParser.g:4120:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4124:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalMyDslParser.g:4125:2: rule__ParameterStringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2"


    // $ANTLR start "rule__ParameterStringType__Group__2__Impl"
    // InternalMyDslParser.g:4131:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4135:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalMyDslParser.g:4136:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalMyDslParser.g:4136:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalMyDslParser.g:4137:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 
            // InternalMyDslParser.g:4138:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Default) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDslParser.g:4138:3: rule__ParameterStringType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__0"
    // InternalMyDslParser.g:4147:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4151:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalMyDslParser.g:4152:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterStringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0"


    // $ANTLR start "rule__ParameterStringType__Group_2__0__Impl"
    // InternalMyDslParser.g:4159:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4163:1: ( ( Default ) )
            // InternalMyDslParser.g:4164:1: ( Default )
            {
            // InternalMyDslParser.g:4164:1: ( Default )
            // InternalMyDslParser.g:4165:2: Default
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__1"
    // InternalMyDslParser.g:4174:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4178:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalMyDslParser.g:4179:2: rule__ParameterStringType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1"


    // $ANTLR start "rule__ParameterStringType__Group_2__1__Impl"
    // InternalMyDslParser.g:4185:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4189:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalMyDslParser.g:4190:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:4190:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalMyDslParser.g:4191:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 
            // InternalMyDslParser.g:4192:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalMyDslParser.g:4192:3: rule__ParameterStringType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__0"
    // InternalMyDslParser.g:4201:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4205:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalMyDslParser.g:4206:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ParameterDoubleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0"


    // $ANTLR start "rule__ParameterDoubleType__Group__0__Impl"
    // InternalMyDslParser.g:4213:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4217:1: ( ( () ) )
            // InternalMyDslParser.g:4218:1: ( () )
            {
            // InternalMyDslParser.g:4218:1: ( () )
            // InternalMyDslParser.g:4219:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 
            // InternalMyDslParser.g:4220:2: ()
            // InternalMyDslParser.g:4220:3: 
            {
            }

             after(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__1"
    // InternalMyDslParser.g:4228:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4232:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalMyDslParser.g:4233:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterDoubleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1"


    // $ANTLR start "rule__ParameterDoubleType__Group__1__Impl"
    // InternalMyDslParser.g:4240:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4244:1: ( ( Double ) )
            // InternalMyDslParser.g:4245:1: ( Double )
            {
            // InternalMyDslParser.g:4245:1: ( Double )
            // InternalMyDslParser.g:4246:2: Double
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,Double,FOLLOW_2); 
             after(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__2"
    // InternalMyDslParser.g:4255:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4259:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalMyDslParser.g:4260:2: rule__ParameterDoubleType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2"


    // $ANTLR start "rule__ParameterDoubleType__Group__2__Impl"
    // InternalMyDslParser.g:4266:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4270:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalMyDslParser.g:4271:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalMyDslParser.g:4271:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalMyDslParser.g:4272:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 
            // InternalMyDslParser.g:4273:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Default) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDslParser.g:4273:3: rule__ParameterDoubleType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDoubleType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0"
    // InternalMyDslParser.g:4282:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4286:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalMyDslParser.g:4287:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__ParameterDoubleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0__Impl"
    // InternalMyDslParser.g:4294:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4298:1: ( ( Default ) )
            // InternalMyDslParser.g:4299:1: ( Default )
            {
            // InternalMyDslParser.g:4299:1: ( Default )
            // InternalMyDslParser.g:4300:2: Default
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1"
    // InternalMyDslParser.g:4309:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4313:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalMyDslParser.g:4314:2: rule__ParameterDoubleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1__Impl"
    // InternalMyDslParser.g:4320:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4324:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalMyDslParser.g:4325:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:4325:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalMyDslParser.g:4326:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 
            // InternalMyDslParser.g:4327:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalMyDslParser.g:4327:3: rule__ParameterDoubleType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__0"
    // InternalMyDslParser.g:4336:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4340:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalMyDslParser.g:4341:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ParameterBooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0"


    // $ANTLR start "rule__ParameterBooleanType__Group__0__Impl"
    // InternalMyDslParser.g:4348:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4352:1: ( ( () ) )
            // InternalMyDslParser.g:4353:1: ( () )
            {
            // InternalMyDslParser.g:4353:1: ( () )
            // InternalMyDslParser.g:4354:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 
            // InternalMyDslParser.g:4355:2: ()
            // InternalMyDslParser.g:4355:3: 
            {
            }

             after(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__1"
    // InternalMyDslParser.g:4363:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4367:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalMyDslParser.g:4368:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterBooleanType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1"


    // $ANTLR start "rule__ParameterBooleanType__Group__1__Impl"
    // InternalMyDslParser.g:4375:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4379:1: ( ( Boolean ) )
            // InternalMyDslParser.g:4380:1: ( Boolean )
            {
            // InternalMyDslParser.g:4380:1: ( Boolean )
            // InternalMyDslParser.g:4381:2: Boolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,Boolean,FOLLOW_2); 
             after(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__2"
    // InternalMyDslParser.g:4390:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4394:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalMyDslParser.g:4395:2: rule__ParameterBooleanType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2"


    // $ANTLR start "rule__ParameterBooleanType__Group__2__Impl"
    // InternalMyDslParser.g:4401:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4405:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalMyDslParser.g:4406:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalMyDslParser.g:4406:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalMyDslParser.g:4407:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 
            // InternalMyDslParser.g:4408:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Default) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDslParser.g:4408:3: rule__ParameterBooleanType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBooleanType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0"
    // InternalMyDslParser.g:4417:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4421:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalMyDslParser.g:4422:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__ParameterBooleanType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0__Impl"
    // InternalMyDslParser.g:4429:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4433:1: ( ( Default ) )
            // InternalMyDslParser.g:4434:1: ( Default )
            {
            // InternalMyDslParser.g:4434:1: ( Default )
            // InternalMyDslParser.g:4435:2: Default
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1"
    // InternalMyDslParser.g:4444:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4448:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalMyDslParser.g:4449:2: rule__ParameterBooleanType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1__Impl"
    // InternalMyDslParser.g:4455:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4459:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalMyDslParser.g:4460:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:4460:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalMyDslParser.g:4461:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 
            // InternalMyDslParser.g:4462:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalMyDslParser.g:4462:3: rule__ParameterBooleanType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__0"
    // InternalMyDslParser.g:4471:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4475:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalMyDslParser.g:4476:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ParameterBase64Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0"


    // $ANTLR start "rule__ParameterBase64Type__Group__0__Impl"
    // InternalMyDslParser.g:4483:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4487:1: ( ( () ) )
            // InternalMyDslParser.g:4488:1: ( () )
            {
            // InternalMyDslParser.g:4488:1: ( () )
            // InternalMyDslParser.g:4489:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 
            // InternalMyDslParser.g:4490:2: ()
            // InternalMyDslParser.g:4490:3: 
            {
            }

             after(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__1"
    // InternalMyDslParser.g:4498:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4502:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalMyDslParser.g:4503:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterBase64Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1"


    // $ANTLR start "rule__ParameterBase64Type__Group__1__Impl"
    // InternalMyDslParser.g:4510:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4514:1: ( ( Base64 ) )
            // InternalMyDslParser.g:4515:1: ( Base64 )
            {
            // InternalMyDslParser.g:4515:1: ( Base64 )
            // InternalMyDslParser.g:4516:2: Base64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1()); 
            match(input,Base64,FOLLOW_2); 
             after(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__2"
    // InternalMyDslParser.g:4525:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4529:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalMyDslParser.g:4530:2: rule__ParameterBase64Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2"


    // $ANTLR start "rule__ParameterBase64Type__Group__2__Impl"
    // InternalMyDslParser.g:4536:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4540:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalMyDslParser.g:4541:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalMyDslParser.g:4541:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalMyDslParser.g:4542:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 
            // InternalMyDslParser.g:4543:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Default) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDslParser.g:4543:3: rule__ParameterBase64Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBase64Type__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0"
    // InternalMyDslParser.g:4552:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4556:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalMyDslParser.g:4557:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__ParameterBase64Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0__Impl"
    // InternalMyDslParser.g:4564:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4568:1: ( ( Default ) )
            // InternalMyDslParser.g:4569:1: ( Default )
            {
            // InternalMyDslParser.g:4569:1: ( Default )
            // InternalMyDslParser.g:4570:2: Default
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1"
    // InternalMyDslParser.g:4579:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4583:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalMyDslParser.g:4584:2: rule__ParameterBase64Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1__Impl"
    // InternalMyDslParser.g:4590:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4594:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalMyDslParser.g:4595:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:4595:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalMyDslParser.g:4596:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 
            // InternalMyDslParser.g:4597:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalMyDslParser.g:4597:3: rule__ParameterBase64Type__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__0"
    // InternalMyDslParser.g:4606:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4610:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalMyDslParser.g:4611:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ParameterArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0"


    // $ANTLR start "rule__ParameterArrayType__Group__0__Impl"
    // InternalMyDslParser.g:4618:1: rule__ParameterArrayType__Group__0__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4622:1: ( ( Array ) )
            // InternalMyDslParser.g:4623:1: ( Array )
            {
            // InternalMyDslParser.g:4623:1: ( Array )
            // InternalMyDslParser.g:4624:2: Array
            {
             before(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 
            match(input,Array,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__1"
    // InternalMyDslParser.g:4633:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4637:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalMyDslParser.g:4638:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ParameterArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1"


    // $ANTLR start "rule__ParameterArrayType__Group__1__Impl"
    // InternalMyDslParser.g:4645:1: rule__ParameterArrayType__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4649:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:4650:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:4650:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:4651:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__2"
    // InternalMyDslParser.g:4660:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4664:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalMyDslParser.g:4665:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ParameterArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2"


    // $ANTLR start "rule__ParameterArrayType__Group__2__Impl"
    // InternalMyDslParser.g:4672:1: rule__ParameterArrayType__Group__2__Impl : ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4676:1: ( ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) )
            // InternalMyDslParser.g:4677:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            {
            // InternalMyDslParser.g:4677:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            // InternalMyDslParser.g:4678:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2()); 
            // InternalMyDslParser.g:4679:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            // InternalMyDslParser.g:4679:3: rule__ParameterArrayType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__3"
    // InternalMyDslParser.g:4687:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4691:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalMyDslParser.g:4692:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__ParameterArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3"


    // $ANTLR start "rule__ParameterArrayType__Group__3__Impl"
    // InternalMyDslParser.g:4699:1: rule__ParameterArrayType__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4703:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:4704:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:4704:1: ( RightSquareBracket )
            // InternalMyDslParser.g:4705:2: RightSquareBracket
            {
             before(grammarAccess.getParameterArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__4"
    // InternalMyDslParser.g:4714:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4718:1: ( rule__ParameterArrayType__Group__4__Impl )
            // InternalMyDslParser.g:4719:2: rule__ParameterArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4"


    // $ANTLR start "rule__ParameterArrayType__Group__4__Impl"
    // InternalMyDslParser.g:4725:1: rule__ParameterArrayType__Group__4__Impl : ( ( rule__ParameterArrayType__Group_4__0 )? ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4729:1: ( ( ( rule__ParameterArrayType__Group_4__0 )? ) )
            // InternalMyDslParser.g:4730:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            {
            // InternalMyDslParser.g:4730:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            // InternalMyDslParser.g:4731:2: ( rule__ParameterArrayType__Group_4__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 
            // InternalMyDslParser.g:4732:2: ( rule__ParameterArrayType__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Default) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDslParser.g:4732:3: rule__ParameterArrayType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterArrayType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0"
    // InternalMyDslParser.g:4741:1: rule__ParameterArrayType__Group_4__0 : rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 ;
    public final void rule__ParameterArrayType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4745:1: ( rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 )
            // InternalMyDslParser.g:4746:2: rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__ParameterArrayType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0__Impl"
    // InternalMyDslParser.g:4753:1: rule__ParameterArrayType__Group_4__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4757:1: ( ( Default ) )
            // InternalMyDslParser.g:4758:1: ( Default )
            {
            // InternalMyDslParser.g:4758:1: ( Default )
            // InternalMyDslParser.g:4759:2: Default
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1"
    // InternalMyDslParser.g:4768:1: rule__ParameterArrayType__Group_4__1 : rule__ParameterArrayType__Group_4__1__Impl ;
    public final void rule__ParameterArrayType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4772:1: ( rule__ParameterArrayType__Group_4__1__Impl )
            // InternalMyDslParser.g:4773:2: rule__ParameterArrayType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1__Impl"
    // InternalMyDslParser.g:4779:1: rule__ParameterArrayType__Group_4__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) ;
    public final void rule__ParameterArrayType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4783:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) )
            // InternalMyDslParser.g:4784:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            {
            // InternalMyDslParser.g:4784:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            // InternalMyDslParser.g:4785:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 
            // InternalMyDslParser.g:4786:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            // InternalMyDslParser.g:4786:3: rule__ParameterArrayType__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__DefaultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalMyDslParser.g:4795:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4799:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalMyDslParser.g:4800:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalMyDslParser.g:4807:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4811:1: ( ( () ) )
            // InternalMyDslParser.g:4812:1: ( () )
            {
            // InternalMyDslParser.g:4812:1: ( () )
            // InternalMyDslParser.g:4813:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 
            // InternalMyDslParser.g:4814:2: ()
            // InternalMyDslParser.g:4814:3: 
            {
            }

             after(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalMyDslParser.g:4822:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4826:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalMyDslParser.g:4827:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalMyDslParser.g:4834:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4838:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:4839:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:4839:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:4840:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__2"
    // InternalMyDslParser.g:4849:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4853:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalMyDslParser.g:4854:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2"


    // $ANTLR start "rule__ParameterList__Group__2__Impl"
    // InternalMyDslParser.g:4861:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4865:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalMyDslParser.g:4866:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalMyDslParser.g:4866:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalMyDslParser.g:4867:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2()); 
            // InternalMyDslParser.g:4868:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalMyDslParser.g:4868:3: rule__ParameterList__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2__Impl"


    // $ANTLR start "rule__ParameterList__Group__3"
    // InternalMyDslParser.g:4876:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4880:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalMyDslParser.g:4881:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ParameterList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3"


    // $ANTLR start "rule__ParameterList__Group__3__Impl"
    // InternalMyDslParser.g:4888:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4892:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalMyDslParser.g:4893:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalMyDslParser.g:4893:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalMyDslParser.g:4894:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3()); 
            // InternalMyDslParser.g:4895:2: ( rule__ParameterList__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDslParser.g:4895:3: rule__ParameterList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ParameterList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3__Impl"


    // $ANTLR start "rule__ParameterList__Group__4"
    // InternalMyDslParser.g:4903:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4907:1: ( rule__ParameterList__Group__4__Impl )
            // InternalMyDslParser.g:4908:2: rule__ParameterList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4"


    // $ANTLR start "rule__ParameterList__Group__4__Impl"
    // InternalMyDslParser.g:4914:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4918:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:4919:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:4919:1: ( RightSquareBracket )
            // InternalMyDslParser.g:4920:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__0"
    // InternalMyDslParser.g:4930:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4934:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalMyDslParser.g:4935:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ParameterList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0"


    // $ANTLR start "rule__ParameterList__Group_3__0__Impl"
    // InternalMyDslParser.g:4942:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4946:1: ( ( Comma ) )
            // InternalMyDslParser.g:4947:1: ( Comma )
            {
            // InternalMyDslParser.g:4947:1: ( Comma )
            // InternalMyDslParser.g:4948:2: Comma
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__1"
    // InternalMyDslParser.g:4957:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4961:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalMyDslParser.g:4962:2: rule__ParameterList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1"


    // $ANTLR start "rule__ParameterList__Group_3__1__Impl"
    // InternalMyDslParser.g:4968:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4972:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalMyDslParser.g:4973:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalMyDslParser.g:4973:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalMyDslParser.g:4974:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 
            // InternalMyDslParser.g:4975:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalMyDslParser.g:4975:3: rule__ParameterList__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__0"
    // InternalMyDslParser.g:4984:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:4988:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalMyDslParser.g:4989:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ParameterAny__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0"


    // $ANTLR start "rule__ParameterAny__Group__0__Impl"
    // InternalMyDslParser.g:4996:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5000:1: ( ( () ) )
            // InternalMyDslParser.g:5001:1: ( () )
            {
            // InternalMyDslParser.g:5001:1: ( () )
            // InternalMyDslParser.g:5002:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 
            // InternalMyDslParser.g:5003:2: ()
            // InternalMyDslParser.g:5003:3: 
            {
            }

             after(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group__1"
    // InternalMyDslParser.g:5011:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5015:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalMyDslParser.g:5016:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ParameterAny__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1"


    // $ANTLR start "rule__ParameterAny__Group__1__Impl"
    // InternalMyDslParser.g:5023:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5027:1: ( ( ParameterAny ) )
            // InternalMyDslParser.g:5028:1: ( ParameterAny )
            {
            // InternalMyDslParser.g:5028:1: ( ParameterAny )
            // InternalMyDslParser.g:5029:2: ParameterAny
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1()); 
            match(input,ParameterAny,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__2"
    // InternalMyDslParser.g:5038:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5042:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalMyDslParser.g:5043:2: rule__ParameterAny__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2"


    // $ANTLR start "rule__ParameterAny__Group__2__Impl"
    // InternalMyDslParser.g:5049:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5053:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalMyDslParser.g:5054:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalMyDslParser.g:5054:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalMyDslParser.g:5055:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2()); 
            // InternalMyDslParser.g:5056:2: ( rule__ParameterAny__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Value) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDslParser.g:5056:3: rule__ParameterAny__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterAny__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAnyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__0"
    // InternalMyDslParser.g:5065:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5069:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalMyDslParser.g:5070:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterAny__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0"


    // $ANTLR start "rule__ParameterAny__Group_2__0__Impl"
    // InternalMyDslParser.g:5077:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5081:1: ( ( Value ) )
            // InternalMyDslParser.g:5082:1: ( Value )
            {
            // InternalMyDslParser.g:5082:1: ( Value )
            // InternalMyDslParser.g:5083:2: Value
            {
             before(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__1"
    // InternalMyDslParser.g:5092:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5096:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalMyDslParser.g:5097:2: rule__ParameterAny__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1"


    // $ANTLR start "rule__ParameterAny__Group_2__1__Impl"
    // InternalMyDslParser.g:5103:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5107:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalMyDslParser.g:5108:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalMyDslParser.g:5108:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalMyDslParser.g:5109:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1()); 
            // InternalMyDslParser.g:5110:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalMyDslParser.g:5110:3: rule__ParameterAny__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__0"
    // InternalMyDslParser.g:5119:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5123:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalMyDslParser.g:5124:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ParameterStruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0"


    // $ANTLR start "rule__ParameterStruct__Group__0__Impl"
    // InternalMyDslParser.g:5131:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5135:1: ( ( () ) )
            // InternalMyDslParser.g:5136:1: ( () )
            {
            // InternalMyDslParser.g:5136:1: ( () )
            // InternalMyDslParser.g:5137:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 
            // InternalMyDslParser.g:5138:2: ()
            // InternalMyDslParser.g:5138:3: 
            {
            }

             after(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__1"
    // InternalMyDslParser.g:5146:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5150:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalMyDslParser.g:5151:2: rule__ParameterStruct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1"


    // $ANTLR start "rule__ParameterStruct__Group__1__Impl"
    // InternalMyDslParser.g:5157:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5161:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalMyDslParser.g:5162:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalMyDslParser.g:5162:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalMyDslParser.g:5163:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1()); 
            // InternalMyDslParser.g:5164:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftSquareBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDslParser.g:5164:3: rule__ParameterStruct__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStruct__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStructAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__0"
    // InternalMyDslParser.g:5173:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5177:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalMyDslParser.g:5178:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__ParameterStruct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0"


    // $ANTLR start "rule__ParameterStruct__Group_1__0__Impl"
    // InternalMyDslParser.g:5185:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5189:1: ( ( LeftSquareBracket ) )
            // InternalMyDslParser.g:5190:1: ( LeftSquareBracket )
            {
            // InternalMyDslParser.g:5190:1: ( LeftSquareBracket )
            // InternalMyDslParser.g:5191:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__1"
    // InternalMyDslParser.g:5200:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5204:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalMyDslParser.g:5205:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__ParameterStruct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1"


    // $ANTLR start "rule__ParameterStruct__Group_1__1__Impl"
    // InternalMyDslParser.g:5212:1: rule__ParameterStruct__Group_1__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5216:1: ( ( RULE_BEGIN ) )
            // InternalMyDslParser.g:5217:1: ( RULE_BEGIN )
            {
            // InternalMyDslParser.g:5217:1: ( RULE_BEGIN )
            // InternalMyDslParser.g:5218:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__2"
    // InternalMyDslParser.g:5227:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5231:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalMyDslParser.g:5232:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_39);
            rule__ParameterStruct__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2"


    // $ANTLR start "rule__ParameterStruct__Group_1__2__Impl"
    // InternalMyDslParser.g:5239:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5243:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2 )* ) )
            // InternalMyDslParser.g:5244:1: ( ( rule__ParameterStruct__ValueAssignment_1_2 )* )
            {
            // InternalMyDslParser.g:5244:1: ( ( rule__ParameterStruct__ValueAssignment_1_2 )* )
            // InternalMyDslParser.g:5245:2: ( rule__ParameterStruct__ValueAssignment_1_2 )*
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2()); 
            // InternalMyDslParser.g:5246:2: ( rule__ParameterStruct__ValueAssignment_1_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDslParser.g:5246:3: rule__ParameterStruct__ValueAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__ParameterStruct__ValueAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__3"
    // InternalMyDslParser.g:5254:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl rule__ParameterStruct__Group_1__4 ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5258:1: ( rule__ParameterStruct__Group_1__3__Impl rule__ParameterStruct__Group_1__4 )
            // InternalMyDslParser.g:5259:2: rule__ParameterStruct__Group_1__3__Impl rule__ParameterStruct__Group_1__4
            {
            pushFollow(FOLLOW_41);
            rule__ParameterStruct__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3"


    // $ANTLR start "rule__ParameterStruct__Group_1__3__Impl"
    // InternalMyDslParser.g:5266:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5270:1: ( ( RightSquareBracket ) )
            // InternalMyDslParser.g:5271:1: ( RightSquareBracket )
            {
            // InternalMyDslParser.g:5271:1: ( RightSquareBracket )
            // InternalMyDslParser.g:5272:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__4"
    // InternalMyDslParser.g:5281:1: rule__ParameterStruct__Group_1__4 : rule__ParameterStruct__Group_1__4__Impl ;
    public final void rule__ParameterStruct__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5285:1: ( rule__ParameterStruct__Group_1__4__Impl )
            // InternalMyDslParser.g:5286:2: rule__ParameterStruct__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__4"


    // $ANTLR start "rule__ParameterStruct__Group_1__4__Impl"
    // InternalMyDslParser.g:5292:1: rule__ParameterStruct__Group_1__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterStruct__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5296:1: ( ( RULE_END ) )
            // InternalMyDslParser.g:5297:1: ( RULE_END )
            {
            // InternalMyDslParser.g:5297:1: ( RULE_END )
            // InternalMyDslParser.g:5298:2: RULE_END
            {
             before(grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__4__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__0"
    // InternalMyDslParser.g:5308:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5312:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalMyDslParser.g:5313:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__ParameterStructMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0"


    // $ANTLR start "rule__ParameterStructMember__Group__0__Impl"
    // InternalMyDslParser.g:5320:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5324:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalMyDslParser.g:5325:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalMyDslParser.g:5325:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalMyDslParser.g:5326:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 
            // InternalMyDslParser.g:5327:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalMyDslParser.g:5327:3: rule__ParameterStructMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__1"
    // InternalMyDslParser.g:5335:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5339:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalMyDslParser.g:5340:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ParameterStructMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1"


    // $ANTLR start "rule__ParameterStructMember__Group__1__Impl"
    // InternalMyDslParser.g:5347:1: rule__ParameterStructMember__Group__1__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5351:1: ( ( Colon ) )
            // InternalMyDslParser.g:5352:1: ( Colon )
            {
            // InternalMyDslParser.g:5352:1: ( Colon )
            // InternalMyDslParser.g:5353:2: Colon
            {
             before(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__2"
    // InternalMyDslParser.g:5362:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5366:1: ( rule__ParameterStructMember__Group__2__Impl )
            // InternalMyDslParser.g:5367:2: rule__ParameterStructMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2"


    // $ANTLR start "rule__ParameterStructMember__Group__2__Impl"
    // InternalMyDslParser.g:5373:1: rule__ParameterStructMember__Group__2__Impl : ( ( rule__ParameterStructMember__ValueAssignment_2 ) ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5377:1: ( ( ( rule__ParameterStructMember__ValueAssignment_2 ) ) )
            // InternalMyDslParser.g:5378:1: ( ( rule__ParameterStructMember__ValueAssignment_2 ) )
            {
            // InternalMyDslParser.g:5378:1: ( ( rule__ParameterStructMember__ValueAssignment_2 ) )
            // InternalMyDslParser.g:5379:2: ( rule__ParameterStructMember__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_2()); 
            // InternalMyDslParser.g:5380:2: ( rule__ParameterStructMember__ValueAssignment_2 )
            // InternalMyDslParser.g:5380:3: rule__ParameterStructMember__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0"
    // InternalMyDslParser.g:5389:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5393:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalMyDslParser.g:5394:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ParameterStructTypeMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0__Impl"
    // InternalMyDslParser.g:5401:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5405:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalMyDslParser.g:5406:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalMyDslParser.g:5406:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalMyDslParser.g:5407:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 
            // InternalMyDslParser.g:5408:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalMyDslParser.g:5408:3: rule__ParameterStructTypeMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1"
    // InternalMyDslParser.g:5416:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5420:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalMyDslParser.g:5421:2: rule__ParameterStructTypeMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1__Impl"
    // InternalMyDslParser.g:5427:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5431:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalMyDslParser.g:5432:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalMyDslParser.g:5432:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalMyDslParser.g:5433:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 
            // InternalMyDslParser.g:5434:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalMyDslParser.g:5434:3: rule__ParameterStructTypeMember__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__0"
    // InternalMyDslParser.g:5443:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5447:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalMyDslParser.g:5448:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Bool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // InternalMyDslParser.g:5455:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5459:1: ( ( () ) )
            // InternalMyDslParser.g:5460:1: ( () )
            {
            // InternalMyDslParser.g:5460:1: ( () )
            // InternalMyDslParser.g:5461:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalMyDslParser.g:5462:2: ()
            // InternalMyDslParser.g:5462:3: 
            {
            }

             after(grammarAccess.getBoolAccess().getBoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // InternalMyDslParser.g:5470:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5474:1: ( rule__Bool__Group__1__Impl )
            // InternalMyDslParser.g:5475:2: rule__Bool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // InternalMyDslParser.g:5481:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5485:1: ( ( Bool ) )
            // InternalMyDslParser.g:5486:1: ( Bool )
            {
            // InternalMyDslParser.g:5486:1: ( Bool )
            // InternalMyDslParser.g:5487:2: Bool
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1()); 
            match(input,Bool,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Int8__Group__0"
    // InternalMyDslParser.g:5497:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5501:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalMyDslParser.g:5502:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Int8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0"


    // $ANTLR start "rule__Int8__Group__0__Impl"
    // InternalMyDslParser.g:5509:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5513:1: ( ( () ) )
            // InternalMyDslParser.g:5514:1: ( () )
            {
            // InternalMyDslParser.g:5514:1: ( () )
            // InternalMyDslParser.g:5515:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0()); 
            // InternalMyDslParser.g:5516:2: ()
            // InternalMyDslParser.g:5516:3: 
            {
            }

             after(grammarAccess.getInt8Access().getInt8Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0__Impl"


    // $ANTLR start "rule__Int8__Group__1"
    // InternalMyDslParser.g:5524:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5528:1: ( rule__Int8__Group__1__Impl )
            // InternalMyDslParser.g:5529:2: rule__Int8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1"


    // $ANTLR start "rule__Int8__Group__1__Impl"
    // InternalMyDslParser.g:5535:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5539:1: ( ( Int8 ) )
            // InternalMyDslParser.g:5540:1: ( Int8 )
            {
            // InternalMyDslParser.g:5540:1: ( Int8 )
            // InternalMyDslParser.g:5541:2: Int8
            {
             before(grammarAccess.getInt8Access().getInt8Keyword_1()); 
            match(input,Int8,FOLLOW_2); 
             after(grammarAccess.getInt8Access().getInt8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1__Impl"


    // $ANTLR start "rule__Uint8__Group__0"
    // InternalMyDslParser.g:5551:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5555:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalMyDslParser.g:5556:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Uint8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0"


    // $ANTLR start "rule__Uint8__Group__0__Impl"
    // InternalMyDslParser.g:5563:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5567:1: ( ( () ) )
            // InternalMyDslParser.g:5568:1: ( () )
            {
            // InternalMyDslParser.g:5568:1: ( () )
            // InternalMyDslParser.g:5569:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0()); 
            // InternalMyDslParser.g:5570:2: ()
            // InternalMyDslParser.g:5570:3: 
            {
            }

             after(grammarAccess.getUint8Access().getUint8Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0__Impl"


    // $ANTLR start "rule__Uint8__Group__1"
    // InternalMyDslParser.g:5578:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5582:1: ( rule__Uint8__Group__1__Impl )
            // InternalMyDslParser.g:5583:2: rule__Uint8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1"


    // $ANTLR start "rule__Uint8__Group__1__Impl"
    // InternalMyDslParser.g:5589:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5593:1: ( ( Uint8 ) )
            // InternalMyDslParser.g:5594:1: ( Uint8 )
            {
            // InternalMyDslParser.g:5594:1: ( Uint8 )
            // InternalMyDslParser.g:5595:2: Uint8
            {
             before(grammarAccess.getUint8Access().getUint8Keyword_1()); 
            match(input,Uint8,FOLLOW_2); 
             after(grammarAccess.getUint8Access().getUint8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1__Impl"


    // $ANTLR start "rule__Int16__Group__0"
    // InternalMyDslParser.g:5605:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5609:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalMyDslParser.g:5610:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Int16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0"


    // $ANTLR start "rule__Int16__Group__0__Impl"
    // InternalMyDslParser.g:5617:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5621:1: ( ( () ) )
            // InternalMyDslParser.g:5622:1: ( () )
            {
            // InternalMyDslParser.g:5622:1: ( () )
            // InternalMyDslParser.g:5623:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0()); 
            // InternalMyDslParser.g:5624:2: ()
            // InternalMyDslParser.g:5624:3: 
            {
            }

             after(grammarAccess.getInt16Access().getInt16Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0__Impl"


    // $ANTLR start "rule__Int16__Group__1"
    // InternalMyDslParser.g:5632:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5636:1: ( rule__Int16__Group__1__Impl )
            // InternalMyDslParser.g:5637:2: rule__Int16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1"


    // $ANTLR start "rule__Int16__Group__1__Impl"
    // InternalMyDslParser.g:5643:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5647:1: ( ( Int16 ) )
            // InternalMyDslParser.g:5648:1: ( Int16 )
            {
            // InternalMyDslParser.g:5648:1: ( Int16 )
            // InternalMyDslParser.g:5649:2: Int16
            {
             before(grammarAccess.getInt16Access().getInt16Keyword_1()); 
            match(input,Int16,FOLLOW_2); 
             after(grammarAccess.getInt16Access().getInt16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1__Impl"


    // $ANTLR start "rule__Uint16__Group__0"
    // InternalMyDslParser.g:5659:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5663:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalMyDslParser.g:5664:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Uint16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0"


    // $ANTLR start "rule__Uint16__Group__0__Impl"
    // InternalMyDslParser.g:5671:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5675:1: ( ( () ) )
            // InternalMyDslParser.g:5676:1: ( () )
            {
            // InternalMyDslParser.g:5676:1: ( () )
            // InternalMyDslParser.g:5677:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0()); 
            // InternalMyDslParser.g:5678:2: ()
            // InternalMyDslParser.g:5678:3: 
            {
            }

             after(grammarAccess.getUint16Access().getUint16Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0__Impl"


    // $ANTLR start "rule__Uint16__Group__1"
    // InternalMyDslParser.g:5686:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5690:1: ( rule__Uint16__Group__1__Impl )
            // InternalMyDslParser.g:5691:2: rule__Uint16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1"


    // $ANTLR start "rule__Uint16__Group__1__Impl"
    // InternalMyDslParser.g:5697:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5701:1: ( ( Uint16 ) )
            // InternalMyDslParser.g:5702:1: ( Uint16 )
            {
            // InternalMyDslParser.g:5702:1: ( Uint16 )
            // InternalMyDslParser.g:5703:2: Uint16
            {
             before(grammarAccess.getUint16Access().getUint16Keyword_1()); 
            match(input,Uint16,FOLLOW_2); 
             after(grammarAccess.getUint16Access().getUint16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1__Impl"


    // $ANTLR start "rule__Int32__Group__0"
    // InternalMyDslParser.g:5713:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5717:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalMyDslParser.g:5718:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Int32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0"


    // $ANTLR start "rule__Int32__Group__0__Impl"
    // InternalMyDslParser.g:5725:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5729:1: ( ( () ) )
            // InternalMyDslParser.g:5730:1: ( () )
            {
            // InternalMyDslParser.g:5730:1: ( () )
            // InternalMyDslParser.g:5731:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0()); 
            // InternalMyDslParser.g:5732:2: ()
            // InternalMyDslParser.g:5732:3: 
            {
            }

             after(grammarAccess.getInt32Access().getInt32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0__Impl"


    // $ANTLR start "rule__Int32__Group__1"
    // InternalMyDslParser.g:5740:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5744:1: ( rule__Int32__Group__1__Impl )
            // InternalMyDslParser.g:5745:2: rule__Int32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1"


    // $ANTLR start "rule__Int32__Group__1__Impl"
    // InternalMyDslParser.g:5751:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5755:1: ( ( Int32 ) )
            // InternalMyDslParser.g:5756:1: ( Int32 )
            {
            // InternalMyDslParser.g:5756:1: ( Int32 )
            // InternalMyDslParser.g:5757:2: Int32
            {
             before(grammarAccess.getInt32Access().getInt32Keyword_1()); 
            match(input,Int32,FOLLOW_2); 
             after(grammarAccess.getInt32Access().getInt32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1__Impl"


    // $ANTLR start "rule__Uint32__Group__0"
    // InternalMyDslParser.g:5767:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5771:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalMyDslParser.g:5772:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Uint32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0"


    // $ANTLR start "rule__Uint32__Group__0__Impl"
    // InternalMyDslParser.g:5779:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5783:1: ( ( () ) )
            // InternalMyDslParser.g:5784:1: ( () )
            {
            // InternalMyDslParser.g:5784:1: ( () )
            // InternalMyDslParser.g:5785:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0()); 
            // InternalMyDslParser.g:5786:2: ()
            // InternalMyDslParser.g:5786:3: 
            {
            }

             after(grammarAccess.getUint32Access().getUint32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0__Impl"


    // $ANTLR start "rule__Uint32__Group__1"
    // InternalMyDslParser.g:5794:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5798:1: ( rule__Uint32__Group__1__Impl )
            // InternalMyDslParser.g:5799:2: rule__Uint32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1"


    // $ANTLR start "rule__Uint32__Group__1__Impl"
    // InternalMyDslParser.g:5805:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5809:1: ( ( Uint32 ) )
            // InternalMyDslParser.g:5810:1: ( Uint32 )
            {
            // InternalMyDslParser.g:5810:1: ( Uint32 )
            // InternalMyDslParser.g:5811:2: Uint32
            {
             before(grammarAccess.getUint32Access().getUint32Keyword_1()); 
            match(input,Uint32,FOLLOW_2); 
             after(grammarAccess.getUint32Access().getUint32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1__Impl"


    // $ANTLR start "rule__Int64__Group__0"
    // InternalMyDslParser.g:5821:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5825:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalMyDslParser.g:5826:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Int64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0"


    // $ANTLR start "rule__Int64__Group__0__Impl"
    // InternalMyDslParser.g:5833:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5837:1: ( ( () ) )
            // InternalMyDslParser.g:5838:1: ( () )
            {
            // InternalMyDslParser.g:5838:1: ( () )
            // InternalMyDslParser.g:5839:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0()); 
            // InternalMyDslParser.g:5840:2: ()
            // InternalMyDslParser.g:5840:3: 
            {
            }

             after(grammarAccess.getInt64Access().getInt64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0__Impl"


    // $ANTLR start "rule__Int64__Group__1"
    // InternalMyDslParser.g:5848:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5852:1: ( rule__Int64__Group__1__Impl )
            // InternalMyDslParser.g:5853:2: rule__Int64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1"


    // $ANTLR start "rule__Int64__Group__1__Impl"
    // InternalMyDslParser.g:5859:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5863:1: ( ( Int64 ) )
            // InternalMyDslParser.g:5864:1: ( Int64 )
            {
            // InternalMyDslParser.g:5864:1: ( Int64 )
            // InternalMyDslParser.g:5865:2: Int64
            {
             before(grammarAccess.getInt64Access().getInt64Keyword_1()); 
            match(input,Int64,FOLLOW_2); 
             after(grammarAccess.getInt64Access().getInt64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1__Impl"


    // $ANTLR start "rule__Uint64__Group__0"
    // InternalMyDslParser.g:5875:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5879:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalMyDslParser.g:5880:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Uint64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0"


    // $ANTLR start "rule__Uint64__Group__0__Impl"
    // InternalMyDslParser.g:5887:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5891:1: ( ( () ) )
            // InternalMyDslParser.g:5892:1: ( () )
            {
            // InternalMyDslParser.g:5892:1: ( () )
            // InternalMyDslParser.g:5893:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0()); 
            // InternalMyDslParser.g:5894:2: ()
            // InternalMyDslParser.g:5894:3: 
            {
            }

             after(grammarAccess.getUint64Access().getUint64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0__Impl"


    // $ANTLR start "rule__Uint64__Group__1"
    // InternalMyDslParser.g:5902:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5906:1: ( rule__Uint64__Group__1__Impl )
            // InternalMyDslParser.g:5907:2: rule__Uint64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1"


    // $ANTLR start "rule__Uint64__Group__1__Impl"
    // InternalMyDslParser.g:5913:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5917:1: ( ( Uint64 ) )
            // InternalMyDslParser.g:5918:1: ( Uint64 )
            {
            // InternalMyDslParser.g:5918:1: ( Uint64 )
            // InternalMyDslParser.g:5919:2: Uint64
            {
             before(grammarAccess.getUint64Access().getUint64Keyword_1()); 
            match(input,Uint64,FOLLOW_2); 
             after(grammarAccess.getUint64Access().getUint64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1__Impl"


    // $ANTLR start "rule__Float32__Group__0"
    // InternalMyDslParser.g:5929:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5933:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalMyDslParser.g:5934:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Float32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0"


    // $ANTLR start "rule__Float32__Group__0__Impl"
    // InternalMyDslParser.g:5941:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5945:1: ( ( () ) )
            // InternalMyDslParser.g:5946:1: ( () )
            {
            // InternalMyDslParser.g:5946:1: ( () )
            // InternalMyDslParser.g:5947:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0()); 
            // InternalMyDslParser.g:5948:2: ()
            // InternalMyDslParser.g:5948:3: 
            {
            }

             after(grammarAccess.getFloat32Access().getFloat32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0__Impl"


    // $ANTLR start "rule__Float32__Group__1"
    // InternalMyDslParser.g:5956:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5960:1: ( rule__Float32__Group__1__Impl )
            // InternalMyDslParser.g:5961:2: rule__Float32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1"


    // $ANTLR start "rule__Float32__Group__1__Impl"
    // InternalMyDslParser.g:5967:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5971:1: ( ( Float32 ) )
            // InternalMyDslParser.g:5972:1: ( Float32 )
            {
            // InternalMyDslParser.g:5972:1: ( Float32 )
            // InternalMyDslParser.g:5973:2: Float32
            {
             before(grammarAccess.getFloat32Access().getFloat32Keyword_1()); 
            match(input,Float32,FOLLOW_2); 
             after(grammarAccess.getFloat32Access().getFloat32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1__Impl"


    // $ANTLR start "rule__Float64__Group__0"
    // InternalMyDslParser.g:5983:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5987:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalMyDslParser.g:5988:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Float64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0"


    // $ANTLR start "rule__Float64__Group__0__Impl"
    // InternalMyDslParser.g:5995:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:5999:1: ( ( () ) )
            // InternalMyDslParser.g:6000:1: ( () )
            {
            // InternalMyDslParser.g:6000:1: ( () )
            // InternalMyDslParser.g:6001:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0()); 
            // InternalMyDslParser.g:6002:2: ()
            // InternalMyDslParser.g:6002:3: 
            {
            }

             after(grammarAccess.getFloat64Access().getFloat64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0__Impl"


    // $ANTLR start "rule__Float64__Group__1"
    // InternalMyDslParser.g:6010:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6014:1: ( rule__Float64__Group__1__Impl )
            // InternalMyDslParser.g:6015:2: rule__Float64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1"


    // $ANTLR start "rule__Float64__Group__1__Impl"
    // InternalMyDslParser.g:6021:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6025:1: ( ( Float64 ) )
            // InternalMyDslParser.g:6026:1: ( Float64 )
            {
            // InternalMyDslParser.g:6026:1: ( Float64 )
            // InternalMyDslParser.g:6027:2: Float64
            {
             before(grammarAccess.getFloat64Access().getFloat64Keyword_1()); 
            match(input,Float64,FOLLOW_2); 
             after(grammarAccess.getFloat64Access().getFloat64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalMyDslParser.g:6037:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6041:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalMyDslParser.g:6042:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalMyDslParser.g:6049:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6053:1: ( ( () ) )
            // InternalMyDslParser.g:6054:1: ( () )
            {
            // InternalMyDslParser.g:6054:1: ( () )
            // InternalMyDslParser.g:6055:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalMyDslParser.g:6056:2: ()
            // InternalMyDslParser.g:6056:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalMyDslParser.g:6064:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6068:1: ( rule__String0__Group__1__Impl )
            // InternalMyDslParser.g:6069:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalMyDslParser.g:6075:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6079:1: ( ( String_1 ) )
            // InternalMyDslParser.g:6080:1: ( String_1 )
            {
            // InternalMyDslParser.g:6080:1: ( String_1 )
            // InternalMyDslParser.g:6081:2: String_1
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,String_1,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Char__Group__0"
    // InternalMyDslParser.g:6091:1: rule__Char__Group__0 : rule__Char__Group__0__Impl rule__Char__Group__1 ;
    public final void rule__Char__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6095:1: ( rule__Char__Group__0__Impl rule__Char__Group__1 )
            // InternalMyDslParser.g:6096:2: rule__Char__Group__0__Impl rule__Char__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Char__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Char__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0"


    // $ANTLR start "rule__Char__Group__0__Impl"
    // InternalMyDslParser.g:6103:1: rule__Char__Group__0__Impl : ( () ) ;
    public final void rule__Char__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6107:1: ( ( () ) )
            // InternalMyDslParser.g:6108:1: ( () )
            {
            // InternalMyDslParser.g:6108:1: ( () )
            // InternalMyDslParser.g:6109:2: ()
            {
             before(grammarAccess.getCharAccess().getChar0Action_0()); 
            // InternalMyDslParser.g:6110:2: ()
            // InternalMyDslParser.g:6110:3: 
            {
            }

             after(grammarAccess.getCharAccess().getChar0Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0__Impl"


    // $ANTLR start "rule__Char__Group__1"
    // InternalMyDslParser.g:6118:1: rule__Char__Group__1 : rule__Char__Group__1__Impl ;
    public final void rule__Char__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6122:1: ( rule__Char__Group__1__Impl )
            // InternalMyDslParser.g:6123:2: rule__Char__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1"


    // $ANTLR start "rule__Char__Group__1__Impl"
    // InternalMyDslParser.g:6129:1: rule__Char__Group__1__Impl : ( Char ) ;
    public final void rule__Char__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6133:1: ( ( Char ) )
            // InternalMyDslParser.g:6134:1: ( Char )
            {
            // InternalMyDslParser.g:6134:1: ( Char )
            // InternalMyDslParser.g:6135:2: Char
            {
             before(grammarAccess.getCharAccess().getCharKeyword_1()); 
            match(input,Char,FOLLOW_2); 
             after(grammarAccess.getCharAccess().getCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1__Impl"


    // $ANTLR start "rule__Byte__Group__0"
    // InternalMyDslParser.g:6145:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6149:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalMyDslParser.g:6150:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Byte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Byte__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0"


    // $ANTLR start "rule__Byte__Group__0__Impl"
    // InternalMyDslParser.g:6157:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6161:1: ( ( () ) )
            // InternalMyDslParser.g:6162:1: ( () )
            {
            // InternalMyDslParser.g:6162:1: ( () )
            // InternalMyDslParser.g:6163:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0()); 
            // InternalMyDslParser.g:6164:2: ()
            // InternalMyDslParser.g:6164:3: 
            {
            }

             after(grammarAccess.getByteAccess().getByteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0__Impl"


    // $ANTLR start "rule__Byte__Group__1"
    // InternalMyDslParser.g:6172:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6176:1: ( rule__Byte__Group__1__Impl )
            // InternalMyDslParser.g:6177:2: rule__Byte__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1"


    // $ANTLR start "rule__Byte__Group__1__Impl"
    // InternalMyDslParser.g:6183:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6187:1: ( ( Byte ) )
            // InternalMyDslParser.g:6188:1: ( Byte )
            {
            // InternalMyDslParser.g:6188:1: ( Byte )
            // InternalMyDslParser.g:6189:2: Byte
            {
             before(grammarAccess.getByteAccess().getByteKeyword_1()); 
            match(input,Byte,FOLLOW_2); 
             after(grammarAccess.getByteAccess().getByteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalMyDslParser.g:6199:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6203:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalMyDslParser.g:6204:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalMyDslParser.g:6211:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6215:1: ( ( () ) )
            // InternalMyDslParser.g:6216:1: ( () )
            {
            // InternalMyDslParser.g:6216:1: ( () )
            // InternalMyDslParser.g:6217:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0()); 
            // InternalMyDslParser.g:6218:2: ()
            // InternalMyDslParser.g:6218:3: 
            {
            }

             after(grammarAccess.getTimeAccess().getTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalMyDslParser.g:6226:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6230:1: ( rule__Time__Group__1__Impl )
            // InternalMyDslParser.g:6231:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalMyDslParser.g:6237:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6241:1: ( ( Time ) )
            // InternalMyDslParser.g:6242:1: ( Time )
            {
            // InternalMyDslParser.g:6242:1: ( Time )
            // InternalMyDslParser.g:6243:2: Time
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_1()); 
            match(input,Time,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalMyDslParser.g:6253:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6257:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalMyDslParser.g:6258:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalMyDslParser.g:6265:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6269:1: ( ( () ) )
            // InternalMyDslParser.g:6270:1: ( () )
            {
            // InternalMyDslParser.g:6270:1: ( () )
            // InternalMyDslParser.g:6271:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalMyDslParser.g:6272:2: ()
            // InternalMyDslParser.g:6272:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalMyDslParser.g:6280:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6284:1: ( rule__Duration__Group__1__Impl )
            // InternalMyDslParser.g:6285:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalMyDslParser.g:6291:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6295:1: ( ( Duration ) )
            // InternalMyDslParser.g:6296:1: ( Duration )
            {
            // InternalMyDslParser.g:6296:1: ( Duration )
            // InternalMyDslParser.g:6297:2: Duration
            {
             before(grammarAccess.getDurationAccess().getDurationKeyword_1()); 
            match(input,Duration,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDurationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__BoolArray__Group__0"
    // InternalMyDslParser.g:6307:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6311:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalMyDslParser.g:6312:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__BoolArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0"


    // $ANTLR start "rule__BoolArray__Group__0__Impl"
    // InternalMyDslParser.g:6319:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6323:1: ( ( () ) )
            // InternalMyDslParser.g:6324:1: ( () )
            {
            // InternalMyDslParser.g:6324:1: ( () )
            // InternalMyDslParser.g:6325:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0()); 
            // InternalMyDslParser.g:6326:2: ()
            // InternalMyDslParser.g:6326:3: 
            {
            }

             after(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0__Impl"


    // $ANTLR start "rule__BoolArray__Group__1"
    // InternalMyDslParser.g:6334:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6338:1: ( rule__BoolArray__Group__1__Impl )
            // InternalMyDslParser.g:6339:2: rule__BoolArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1"


    // $ANTLR start "rule__BoolArray__Group__1__Impl"
    // InternalMyDslParser.g:6345:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6349:1: ( ( Bool_1 ) )
            // InternalMyDslParser.g:6350:1: ( Bool_1 )
            {
            // InternalMyDslParser.g:6350:1: ( Bool_1 )
            // InternalMyDslParser.g:6351:2: Bool_1
            {
             before(grammarAccess.getBoolArrayAccess().getBoolKeyword_1()); 
            match(input,Bool_1,FOLLOW_2); 
             after(grammarAccess.getBoolArrayAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1__Impl"


    // $ANTLR start "rule__Int8Array__Group__0"
    // InternalMyDslParser.g:6361:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6365:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalMyDslParser.g:6366:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__Int8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0"


    // $ANTLR start "rule__Int8Array__Group__0__Impl"
    // InternalMyDslParser.g:6373:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6377:1: ( ( () ) )
            // InternalMyDslParser.g:6378:1: ( () )
            {
            // InternalMyDslParser.g:6378:1: ( () )
            // InternalMyDslParser.g:6379:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0()); 
            // InternalMyDslParser.g:6380:2: ()
            // InternalMyDslParser.g:6380:3: 
            {
            }

             after(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0__Impl"


    // $ANTLR start "rule__Int8Array__Group__1"
    // InternalMyDslParser.g:6388:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6392:1: ( rule__Int8Array__Group__1__Impl )
            // InternalMyDslParser.g:6393:2: rule__Int8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1"


    // $ANTLR start "rule__Int8Array__Group__1__Impl"
    // InternalMyDslParser.g:6399:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6403:1: ( ( Int8_1 ) )
            // InternalMyDslParser.g:6404:1: ( Int8_1 )
            {
            // InternalMyDslParser.g:6404:1: ( Int8_1 )
            // InternalMyDslParser.g:6405:2: Int8_1
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1()); 
            match(input,Int8_1,FOLLOW_2); 
             after(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1__Impl"


    // $ANTLR start "rule__Uint8Array__Group__0"
    // InternalMyDslParser.g:6415:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6419:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalMyDslParser.g:6420:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__Uint8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0"


    // $ANTLR start "rule__Uint8Array__Group__0__Impl"
    // InternalMyDslParser.g:6427:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6431:1: ( ( () ) )
            // InternalMyDslParser.g:6432:1: ( () )
            {
            // InternalMyDslParser.g:6432:1: ( () )
            // InternalMyDslParser.g:6433:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0()); 
            // InternalMyDslParser.g:6434:2: ()
            // InternalMyDslParser.g:6434:3: 
            {
            }

             after(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0__Impl"


    // $ANTLR start "rule__Uint8Array__Group__1"
    // InternalMyDslParser.g:6442:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6446:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalMyDslParser.g:6447:2: rule__Uint8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1"


    // $ANTLR start "rule__Uint8Array__Group__1__Impl"
    // InternalMyDslParser.g:6453:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6457:1: ( ( Uint8_1 ) )
            // InternalMyDslParser.g:6458:1: ( Uint8_1 )
            {
            // InternalMyDslParser.g:6458:1: ( Uint8_1 )
            // InternalMyDslParser.g:6459:2: Uint8_1
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1()); 
            match(input,Uint8_1,FOLLOW_2); 
             after(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1__Impl"


    // $ANTLR start "rule__Int16Array__Group__0"
    // InternalMyDslParser.g:6469:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6473:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalMyDslParser.g:6474:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Int16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0"


    // $ANTLR start "rule__Int16Array__Group__0__Impl"
    // InternalMyDslParser.g:6481:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6485:1: ( ( () ) )
            // InternalMyDslParser.g:6486:1: ( () )
            {
            // InternalMyDslParser.g:6486:1: ( () )
            // InternalMyDslParser.g:6487:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0()); 
            // InternalMyDslParser.g:6488:2: ()
            // InternalMyDslParser.g:6488:3: 
            {
            }

             after(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0__Impl"


    // $ANTLR start "rule__Int16Array__Group__1"
    // InternalMyDslParser.g:6496:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6500:1: ( rule__Int16Array__Group__1__Impl )
            // InternalMyDslParser.g:6501:2: rule__Int16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1"


    // $ANTLR start "rule__Int16Array__Group__1__Impl"
    // InternalMyDslParser.g:6507:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6511:1: ( ( Int16_1 ) )
            // InternalMyDslParser.g:6512:1: ( Int16_1 )
            {
            // InternalMyDslParser.g:6512:1: ( Int16_1 )
            // InternalMyDslParser.g:6513:2: Int16_1
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1()); 
            match(input,Int16_1,FOLLOW_2); 
             after(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1__Impl"


    // $ANTLR start "rule__Uint16Array__Group__0"
    // InternalMyDslParser.g:6523:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6527:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalMyDslParser.g:6528:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_63);
            rule__Uint16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0"


    // $ANTLR start "rule__Uint16Array__Group__0__Impl"
    // InternalMyDslParser.g:6535:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6539:1: ( ( () ) )
            // InternalMyDslParser.g:6540:1: ( () )
            {
            // InternalMyDslParser.g:6540:1: ( () )
            // InternalMyDslParser.g:6541:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0()); 
            // InternalMyDslParser.g:6542:2: ()
            // InternalMyDslParser.g:6542:3: 
            {
            }

             after(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0__Impl"


    // $ANTLR start "rule__Uint16Array__Group__1"
    // InternalMyDslParser.g:6550:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6554:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalMyDslParser.g:6555:2: rule__Uint16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1"


    // $ANTLR start "rule__Uint16Array__Group__1__Impl"
    // InternalMyDslParser.g:6561:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6565:1: ( ( Uint16_1 ) )
            // InternalMyDslParser.g:6566:1: ( Uint16_1 )
            {
            // InternalMyDslParser.g:6566:1: ( Uint16_1 )
            // InternalMyDslParser.g:6567:2: Uint16_1
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1()); 
            match(input,Uint16_1,FOLLOW_2); 
             after(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1__Impl"


    // $ANTLR start "rule__Int32Array__Group__0"
    // InternalMyDslParser.g:6577:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6581:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalMyDslParser.g:6582:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__Int32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0"


    // $ANTLR start "rule__Int32Array__Group__0__Impl"
    // InternalMyDslParser.g:6589:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6593:1: ( ( () ) )
            // InternalMyDslParser.g:6594:1: ( () )
            {
            // InternalMyDslParser.g:6594:1: ( () )
            // InternalMyDslParser.g:6595:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0()); 
            // InternalMyDslParser.g:6596:2: ()
            // InternalMyDslParser.g:6596:3: 
            {
            }

             after(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0__Impl"


    // $ANTLR start "rule__Int32Array__Group__1"
    // InternalMyDslParser.g:6604:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6608:1: ( rule__Int32Array__Group__1__Impl )
            // InternalMyDslParser.g:6609:2: rule__Int32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1"


    // $ANTLR start "rule__Int32Array__Group__1__Impl"
    // InternalMyDslParser.g:6615:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6619:1: ( ( Int32_1 ) )
            // InternalMyDslParser.g:6620:1: ( Int32_1 )
            {
            // InternalMyDslParser.g:6620:1: ( Int32_1 )
            // InternalMyDslParser.g:6621:2: Int32_1
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1()); 
            match(input,Int32_1,FOLLOW_2); 
             after(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1__Impl"


    // $ANTLR start "rule__Uint32Array__Group__0"
    // InternalMyDslParser.g:6631:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6635:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalMyDslParser.g:6636:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__Uint32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0"


    // $ANTLR start "rule__Uint32Array__Group__0__Impl"
    // InternalMyDslParser.g:6643:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6647:1: ( ( () ) )
            // InternalMyDslParser.g:6648:1: ( () )
            {
            // InternalMyDslParser.g:6648:1: ( () )
            // InternalMyDslParser.g:6649:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0()); 
            // InternalMyDslParser.g:6650:2: ()
            // InternalMyDslParser.g:6650:3: 
            {
            }

             after(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0__Impl"


    // $ANTLR start "rule__Uint32Array__Group__1"
    // InternalMyDslParser.g:6658:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6662:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalMyDslParser.g:6663:2: rule__Uint32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1"


    // $ANTLR start "rule__Uint32Array__Group__1__Impl"
    // InternalMyDslParser.g:6669:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6673:1: ( ( Uint32_1 ) )
            // InternalMyDslParser.g:6674:1: ( Uint32_1 )
            {
            // InternalMyDslParser.g:6674:1: ( Uint32_1 )
            // InternalMyDslParser.g:6675:2: Uint32_1
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1()); 
            match(input,Uint32_1,FOLLOW_2); 
             after(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1__Impl"


    // $ANTLR start "rule__Int64Array__Group__0"
    // InternalMyDslParser.g:6685:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6689:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalMyDslParser.g:6690:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_66);
            rule__Int64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0"


    // $ANTLR start "rule__Int64Array__Group__0__Impl"
    // InternalMyDslParser.g:6697:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6701:1: ( ( () ) )
            // InternalMyDslParser.g:6702:1: ( () )
            {
            // InternalMyDslParser.g:6702:1: ( () )
            // InternalMyDslParser.g:6703:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0()); 
            // InternalMyDslParser.g:6704:2: ()
            // InternalMyDslParser.g:6704:3: 
            {
            }

             after(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0__Impl"


    // $ANTLR start "rule__Int64Array__Group__1"
    // InternalMyDslParser.g:6712:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6716:1: ( rule__Int64Array__Group__1__Impl )
            // InternalMyDslParser.g:6717:2: rule__Int64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1"


    // $ANTLR start "rule__Int64Array__Group__1__Impl"
    // InternalMyDslParser.g:6723:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6727:1: ( ( Int64_1 ) )
            // InternalMyDslParser.g:6728:1: ( Int64_1 )
            {
            // InternalMyDslParser.g:6728:1: ( Int64_1 )
            // InternalMyDslParser.g:6729:2: Int64_1
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1()); 
            match(input,Int64_1,FOLLOW_2); 
             after(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1__Impl"


    // $ANTLR start "rule__Uint64Array__Group__0"
    // InternalMyDslParser.g:6739:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6743:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalMyDslParser.g:6744:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_67);
            rule__Uint64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0"


    // $ANTLR start "rule__Uint64Array__Group__0__Impl"
    // InternalMyDslParser.g:6751:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6755:1: ( ( () ) )
            // InternalMyDslParser.g:6756:1: ( () )
            {
            // InternalMyDslParser.g:6756:1: ( () )
            // InternalMyDslParser.g:6757:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0()); 
            // InternalMyDslParser.g:6758:2: ()
            // InternalMyDslParser.g:6758:3: 
            {
            }

             after(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0__Impl"


    // $ANTLR start "rule__Uint64Array__Group__1"
    // InternalMyDslParser.g:6766:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6770:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalMyDslParser.g:6771:2: rule__Uint64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1"


    // $ANTLR start "rule__Uint64Array__Group__1__Impl"
    // InternalMyDslParser.g:6777:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6781:1: ( ( Uint64_1 ) )
            // InternalMyDslParser.g:6782:1: ( Uint64_1 )
            {
            // InternalMyDslParser.g:6782:1: ( Uint64_1 )
            // InternalMyDslParser.g:6783:2: Uint64_1
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1()); 
            match(input,Uint64_1,FOLLOW_2); 
             after(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1__Impl"


    // $ANTLR start "rule__Float32Array__Group__0"
    // InternalMyDslParser.g:6793:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6797:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalMyDslParser.g:6798:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_68);
            rule__Float32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0"


    // $ANTLR start "rule__Float32Array__Group__0__Impl"
    // InternalMyDslParser.g:6805:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6809:1: ( ( () ) )
            // InternalMyDslParser.g:6810:1: ( () )
            {
            // InternalMyDslParser.g:6810:1: ( () )
            // InternalMyDslParser.g:6811:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0()); 
            // InternalMyDslParser.g:6812:2: ()
            // InternalMyDslParser.g:6812:3: 
            {
            }

             after(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0__Impl"


    // $ANTLR start "rule__Float32Array__Group__1"
    // InternalMyDslParser.g:6820:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6824:1: ( rule__Float32Array__Group__1__Impl )
            // InternalMyDslParser.g:6825:2: rule__Float32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1"


    // $ANTLR start "rule__Float32Array__Group__1__Impl"
    // InternalMyDslParser.g:6831:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6835:1: ( ( Float32_1 ) )
            // InternalMyDslParser.g:6836:1: ( Float32_1 )
            {
            // InternalMyDslParser.g:6836:1: ( Float32_1 )
            // InternalMyDslParser.g:6837:2: Float32_1
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1()); 
            match(input,Float32_1,FOLLOW_2); 
             after(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1__Impl"


    // $ANTLR start "rule__Float64Array__Group__0"
    // InternalMyDslParser.g:6847:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6851:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalMyDslParser.g:6852:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_69);
            rule__Float64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0"


    // $ANTLR start "rule__Float64Array__Group__0__Impl"
    // InternalMyDslParser.g:6859:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6863:1: ( ( () ) )
            // InternalMyDslParser.g:6864:1: ( () )
            {
            // InternalMyDslParser.g:6864:1: ( () )
            // InternalMyDslParser.g:6865:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0()); 
            // InternalMyDslParser.g:6866:2: ()
            // InternalMyDslParser.g:6866:3: 
            {
            }

             after(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0__Impl"


    // $ANTLR start "rule__Float64Array__Group__1"
    // InternalMyDslParser.g:6874:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6878:1: ( rule__Float64Array__Group__1__Impl )
            // InternalMyDslParser.g:6879:2: rule__Float64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1"


    // $ANTLR start "rule__Float64Array__Group__1__Impl"
    // InternalMyDslParser.g:6885:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6889:1: ( ( Float64_1 ) )
            // InternalMyDslParser.g:6890:1: ( Float64_1 )
            {
            // InternalMyDslParser.g:6890:1: ( Float64_1 )
            // InternalMyDslParser.g:6891:2: Float64_1
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1()); 
            match(input,Float64_1,FOLLOW_2); 
             after(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1__Impl"


    // $ANTLR start "rule__String0Array__Group__0"
    // InternalMyDslParser.g:6901:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6905:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalMyDslParser.g:6906:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_70);
            rule__String0Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0"


    // $ANTLR start "rule__String0Array__Group__0__Impl"
    // InternalMyDslParser.g:6913:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6917:1: ( ( () ) )
            // InternalMyDslParser.g:6918:1: ( () )
            {
            // InternalMyDslParser.g:6918:1: ( () )
            // InternalMyDslParser.g:6919:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0()); 
            // InternalMyDslParser.g:6920:2: ()
            // InternalMyDslParser.g:6920:3: 
            {
            }

             after(grammarAccess.getString0ArrayAccess().getStringArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0__Impl"


    // $ANTLR start "rule__String0Array__Group__1"
    // InternalMyDslParser.g:6928:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6932:1: ( rule__String0Array__Group__1__Impl )
            // InternalMyDslParser.g:6933:2: rule__String0Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1"


    // $ANTLR start "rule__String0Array__Group__1__Impl"
    // InternalMyDslParser.g:6939:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6943:1: ( ( String_2 ) )
            // InternalMyDslParser.g:6944:1: ( String_2 )
            {
            // InternalMyDslParser.g:6944:1: ( String_2 )
            // InternalMyDslParser.g:6945:2: String_2
            {
             before(grammarAccess.getString0ArrayAccess().getStringKeyword_1()); 
            match(input,String_2,FOLLOW_2); 
             after(grammarAccess.getString0ArrayAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1__Impl"


    // $ANTLR start "rule__ByteArray__Group__0"
    // InternalMyDslParser.g:6955:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6959:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalMyDslParser.g:6960:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_71);
            rule__ByteArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0"


    // $ANTLR start "rule__ByteArray__Group__0__Impl"
    // InternalMyDslParser.g:6967:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6971:1: ( ( () ) )
            // InternalMyDslParser.g:6972:1: ( () )
            {
            // InternalMyDslParser.g:6972:1: ( () )
            // InternalMyDslParser.g:6973:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0()); 
            // InternalMyDslParser.g:6974:2: ()
            // InternalMyDslParser.g:6974:3: 
            {
            }

             after(grammarAccess.getByteArrayAccess().getByteArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0__Impl"


    // $ANTLR start "rule__ByteArray__Group__1"
    // InternalMyDslParser.g:6982:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6986:1: ( rule__ByteArray__Group__1__Impl )
            // InternalMyDslParser.g:6987:2: rule__ByteArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1"


    // $ANTLR start "rule__ByteArray__Group__1__Impl"
    // InternalMyDslParser.g:6993:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:6997:1: ( ( Byte_1 ) )
            // InternalMyDslParser.g:6998:1: ( Byte_1 )
            {
            // InternalMyDslParser.g:6998:1: ( Byte_1 )
            // InternalMyDslParser.g:6999:2: Byte_1
            {
             before(grammarAccess.getByteArrayAccess().getByteKeyword_1()); 
            match(input,Byte_1,FOLLOW_2); 
             after(grammarAccess.getByteArrayAccess().getByteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1__Impl"


    // $ANTLR start "rule__CharArray__Group__0"
    // InternalMyDslParser.g:7009:1: rule__CharArray__Group__0 : rule__CharArray__Group__0__Impl rule__CharArray__Group__1 ;
    public final void rule__CharArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7013:1: ( rule__CharArray__Group__0__Impl rule__CharArray__Group__1 )
            // InternalMyDslParser.g:7014:2: rule__CharArray__Group__0__Impl rule__CharArray__Group__1
            {
            pushFollow(FOLLOW_72);
            rule__CharArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__0"


    // $ANTLR start "rule__CharArray__Group__0__Impl"
    // InternalMyDslParser.g:7021:1: rule__CharArray__Group__0__Impl : ( () ) ;
    public final void rule__CharArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7025:1: ( ( () ) )
            // InternalMyDslParser.g:7026:1: ( () )
            {
            // InternalMyDslParser.g:7026:1: ( () )
            // InternalMyDslParser.g:7027:2: ()
            {
             before(grammarAccess.getCharArrayAccess().getCharArrayAction_0()); 
            // InternalMyDslParser.g:7028:2: ()
            // InternalMyDslParser.g:7028:3: 
            {
            }

             after(grammarAccess.getCharArrayAccess().getCharArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__0__Impl"


    // $ANTLR start "rule__CharArray__Group__1"
    // InternalMyDslParser.g:7036:1: rule__CharArray__Group__1 : rule__CharArray__Group__1__Impl ;
    public final void rule__CharArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7040:1: ( rule__CharArray__Group__1__Impl )
            // InternalMyDslParser.g:7041:2: rule__CharArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__1"


    // $ANTLR start "rule__CharArray__Group__1__Impl"
    // InternalMyDslParser.g:7047:1: rule__CharArray__Group__1__Impl : ( Char_1 ) ;
    public final void rule__CharArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7051:1: ( ( Char_1 ) )
            // InternalMyDslParser.g:7052:1: ( Char_1 )
            {
            // InternalMyDslParser.g:7052:1: ( Char_1 )
            // InternalMyDslParser.g:7053:2: Char_1
            {
             before(grammarAccess.getCharArrayAccess().getCharKeyword_1()); 
            match(input,Char_1,FOLLOW_2); 
             after(grammarAccess.getCharArrayAccess().getCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalMyDslParser.g:7063:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7067:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMyDslParser.g:7068:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalMyDslParser.g:7075:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7079:1: ( ( () ) )
            // InternalMyDslParser.g:7080:1: ( () )
            {
            // InternalMyDslParser.g:7080:1: ( () )
            // InternalMyDslParser.g:7081:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalMyDslParser.g:7082:2: ()
            // InternalMyDslParser.g:7082:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalMyDslParser.g:7090:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7094:1: ( rule__Header__Group__1__Impl )
            // InternalMyDslParser.g:7095:2: rule__Header__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalMyDslParser.g:7101:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7105:1: ( ( Header ) )
            // InternalMyDslParser.g:7106:1: ( Header )
            {
            // InternalMyDslParser.g:7106:1: ( Header )
            // InternalMyDslParser.g:7107:2: Header
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 
            match(input,Header,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__ArraySpecRef__Group__0"
    // InternalMyDslParser.g:7117:1: rule__ArraySpecRef__Group__0 : rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1 ;
    public final void rule__ArraySpecRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7121:1: ( rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1 )
            // InternalMyDslParser.g:7122:2: rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1
            {
            pushFollow(FOLLOW_74);
            rule__ArraySpecRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__0"


    // $ANTLR start "rule__ArraySpecRef__Group__0__Impl"
    // InternalMyDslParser.g:7129:1: rule__ArraySpecRef__Group__0__Impl : ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) ) ;
    public final void rule__ArraySpecRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7133:1: ( ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) ) )
            // InternalMyDslParser.g:7134:1: ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) )
            {
            // InternalMyDslParser.g:7134:1: ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) )
            // InternalMyDslParser.g:7135:2: ( rule__ArraySpecRef__ReferenceAssignment_0 )
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0()); 
            // InternalMyDslParser.g:7136:2: ( rule__ArraySpecRef__ReferenceAssignment_0 )
            // InternalMyDslParser.g:7136:3: rule__ArraySpecRef__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__0__Impl"


    // $ANTLR start "rule__ArraySpecRef__Group__1"
    // InternalMyDslParser.g:7144:1: rule__ArraySpecRef__Group__1 : rule__ArraySpecRef__Group__1__Impl ;
    public final void rule__ArraySpecRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7148:1: ( rule__ArraySpecRef__Group__1__Impl )
            // InternalMyDslParser.g:7149:2: rule__ArraySpecRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__1"


    // $ANTLR start "rule__ArraySpecRef__Group__1__Impl"
    // InternalMyDslParser.g:7155:1: rule__ArraySpecRef__Group__1__Impl : ( LeftSquareBracketRightSquareBracket ) ;
    public final void rule__ArraySpecRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7159:1: ( ( LeftSquareBracketRightSquareBracket ) )
            // InternalMyDslParser.g:7160:1: ( LeftSquareBracketRightSquareBracket )
            {
            // InternalMyDslParser.g:7160:1: ( LeftSquareBracketRightSquareBracket )
            // InternalMyDslParser.g:7161:2: LeftSquareBracketRightSquareBracket
            {
             before(grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalMyDslParser.g:7171:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7175:1: ( ( ruleImport ) )
            // InternalMyDslParser.g:7176:2: ( ruleImport )
            {
            // InternalMyDslParser.g:7176:2: ( ruleImport )
            // InternalMyDslParser.g:7177:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__RossystemAssignment_2"
    // InternalMyDslParser.g:7186:1: rule__Model__RossystemAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Model__RossystemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7190:1: ( ( ( RULE_ID ) ) )
            // InternalMyDslParser.g:7191:2: ( ( RULE_ID ) )
            {
            // InternalMyDslParser.g:7191:2: ( ( RULE_ID ) )
            // InternalMyDslParser.g:7192:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getRossystemSystemCrossReference_2_0()); 
            // InternalMyDslParser.g:7193:3: ( RULE_ID )
            // InternalMyDslParser.g:7194:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getRossystemSystemIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRossystemSystemIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getModelAccess().getRossystemSystemCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RossystemAssignment_2"


    // $ANTLR start "rule__Model__ReconfigurationsAssignment_5"
    // InternalMyDslParser.g:7205:1: rule__Model__ReconfigurationsAssignment_5 : ( ruleReconfiguration ) ;
    public final void rule__Model__ReconfigurationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7209:1: ( ( ruleReconfiguration ) )
            // InternalMyDslParser.g:7210:2: ( ruleReconfiguration )
            {
            // InternalMyDslParser.g:7210:2: ( ruleReconfiguration )
            // InternalMyDslParser.g:7211:3: ruleReconfiguration
            {
             before(grammarAccess.getModelAccess().getReconfigurationsReconfigurationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReconfiguration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getReconfigurationsReconfigurationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ReconfigurationsAssignment_5"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalMyDslParser.g:7220:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7224:1: ( ( RULE_STRING ) )
            // InternalMyDslParser.g:7225:2: ( RULE_STRING )
            {
            // InternalMyDslParser.g:7225:2: ( RULE_STRING )
            // InternalMyDslParser.g:7226:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__SetParam__NodeAssignment_1"
    // InternalMyDslParser.g:7235:1: rule__SetParam__NodeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetParam__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7239:1: ( ( ( RULE_ID ) ) )
            // InternalMyDslParser.g:7240:2: ( ( RULE_ID ) )
            {
            // InternalMyDslParser.g:7240:2: ( ( RULE_ID ) )
            // InternalMyDslParser.g:7241:3: ( RULE_ID )
            {
             before(grammarAccess.getSetParamAccess().getNodeRosNodeCrossReference_1_0()); 
            // InternalMyDslParser.g:7242:3: ( RULE_ID )
            // InternalMyDslParser.g:7243:4: RULE_ID
            {
             before(grammarAccess.getSetParamAccess().getNodeRosNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getNodeRosNodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSetParamAccess().getNodeRosNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__NodeAssignment_1"


    // $ANTLR start "rule__SetParam__ParamAssignment_3"
    // InternalMyDslParser.g:7254:1: rule__SetParam__ParamAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SetParam__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7258:1: ( ( ( RULE_ID ) ) )
            // InternalMyDslParser.g:7259:2: ( ( RULE_ID ) )
            {
            // InternalMyDslParser.g:7259:2: ( ( RULE_ID ) )
            // InternalMyDslParser.g:7260:3: ( RULE_ID )
            {
             before(grammarAccess.getSetParamAccess().getParamRosParameterCrossReference_3_0()); 
            // InternalMyDslParser.g:7261:3: ( RULE_ID )
            // InternalMyDslParser.g:7262:4: RULE_ID
            {
             before(grammarAccess.getSetParamAccess().getParamRosParameterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetParamAccess().getParamRosParameterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSetParamAccess().getParamRosParameterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__ParamAssignment_3"


    // $ANTLR start "rule__SetParam__ValueAssignment_5"
    // InternalMyDslParser.g:7273:1: rule__SetParam__ValueAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__SetParam__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7277:1: ( ( ruleParameterValue ) )
            // InternalMyDslParser.g:7278:2: ( ruleParameterValue )
            {
            // InternalMyDslParser.g:7278:2: ( ruleParameterValue )
            // InternalMyDslParser.g:7279:3: ruleParameterValue
            {
             before(grammarAccess.getSetParamAccess().getValueParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getSetParamAccess().getValueParameterValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParam__ValueAssignment_5"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_1"
    // InternalMyDslParser.g:7288:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7292:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7293:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7293:2: ( ruleGraphName )
            // InternalMyDslParser.g:7294:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_2_1"
    // InternalMyDslParser.g:7303:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7307:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7308:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7308:2: ( ruleGraphName )
            // InternalMyDslParser.g:7309:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_1"
    // InternalMyDslParser.g:7318:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7322:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7323:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7323:2: ( ruleGraphName )
            // InternalMyDslParser.g:7324:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"
    // InternalMyDslParser.g:7333:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7337:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7338:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7338:2: ( ruleGraphName )
            // InternalMyDslParser.g:7339:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_1"
    // InternalMyDslParser.g:7348:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7352:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7353:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7353:2: ( ruleGraphName )
            // InternalMyDslParser.g:7354:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_2_1"
    // InternalMyDslParser.g:7363:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7367:1: ( ( ruleGraphName ) )
            // InternalMyDslParser.g:7368:2: ( ruleGraphName )
            {
            // InternalMyDslParser.g:7368:2: ( ruleGraphName )
            // InternalMyDslParser.g:7369:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_3"
    // InternalMyDslParser.g:7378:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7382:1: ( ( ruleParameterType ) )
            // InternalMyDslParser.g:7383:2: ( ruleParameterType )
            {
            // InternalMyDslParser.g:7383:2: ( ruleParameterType )
            // InternalMyDslParser.g:7384:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_3"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_4_1"
    // InternalMyDslParser.g:7393:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7397:1: ( ( ruleParameterType ) )
            // InternalMyDslParser.g:7398:2: ( ruleParameterType )
            {
            // InternalMyDslParser.g:7398:2: ( ruleParameterType )
            // InternalMyDslParser.g:7399:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_4_1"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"
    // InternalMyDslParser.g:7408:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7412:1: ( ( ruleParameterStructTypeMember ) )
            // InternalMyDslParser.g:7413:2: ( ruleParameterStructTypeMember )
            {
            // InternalMyDslParser.g:7413:2: ( ruleParameterStructTypeMember )
            // InternalMyDslParser.g:7414:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"
    // InternalMyDslParser.g:7423:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7427:1: ( ( ruleParameterStructTypeMember ) )
            // InternalMyDslParser.g:7428:2: ( ruleParameterStructTypeMember )
            {
            // InternalMyDslParser.g:7428:2: ( ruleParameterStructTypeMember )
            // InternalMyDslParser.g:7429:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"


    // $ANTLR start "rule__ParameterIntegerType__DefaultAssignment_2_1"
    // InternalMyDslParser.g:7438:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7442:1: ( ( ruleParameterInteger ) )
            // InternalMyDslParser.g:7443:2: ( ruleParameterInteger )
            {
            // InternalMyDslParser.g:7443:2: ( ruleParameterInteger )
            // InternalMyDslParser.g:7444:3: ruleParameterInteger
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterStringType__DefaultAssignment_2_1"
    // InternalMyDslParser.g:7453:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7457:1: ( ( ruleParameterString ) )
            // InternalMyDslParser.g:7458:2: ( ruleParameterString )
            {
            // InternalMyDslParser.g:7458:2: ( ruleParameterString )
            // InternalMyDslParser.g:7459:3: ruleParameterString
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterDoubleType__DefaultAssignment_2_1"
    // InternalMyDslParser.g:7468:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7472:1: ( ( ruleParameterDouble ) )
            // InternalMyDslParser.g:7473:2: ( ruleParameterDouble )
            {
            // InternalMyDslParser.g:7473:2: ( ruleParameterDouble )
            // InternalMyDslParser.g:7474:3: ruleParameterDouble
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBooleanType__DefaultAssignment_2_1"
    // InternalMyDslParser.g:7483:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7487:1: ( ( ruleParameterBoolean ) )
            // InternalMyDslParser.g:7488:2: ( ruleParameterBoolean )
            {
            // InternalMyDslParser.g:7488:2: ( ruleParameterBoolean )
            // InternalMyDslParser.g:7489:3: ruleParameterBoolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBase64Type__DefaultAssignment_2_1"
    // InternalMyDslParser.g:7498:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7502:1: ( ( ruleParameterBase64 ) )
            // InternalMyDslParser.g:7503:2: ( ruleParameterBase64 )
            {
            // InternalMyDslParser.g:7503:2: ( ruleParameterBase64 )
            // InternalMyDslParser.g:7504:3: ruleParameterBase64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterArrayType__TypeAssignment_2"
    // InternalMyDslParser.g:7513:1: rule__ParameterArrayType__TypeAssignment_2 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7517:1: ( ( ruleParameterType ) )
            // InternalMyDslParser.g:7518:2: ( ruleParameterType )
            {
            // InternalMyDslParser.g:7518:2: ( ruleParameterType )
            // InternalMyDslParser.g:7519:3: ruleParameterType
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__TypeAssignment_2"


    // $ANTLR start "rule__ParameterArrayType__DefaultAssignment_4_1"
    // InternalMyDslParser.g:7528:1: rule__ParameterArrayType__DefaultAssignment_4_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7532:1: ( ( ruleParameterList ) )
            // InternalMyDslParser.g:7533:2: ( ruleParameterList )
            {
            // InternalMyDslParser.g:7533:2: ( ruleParameterList )
            // InternalMyDslParser.g:7534:3: ruleParameterList
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__DefaultAssignment_4_1"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalMyDslParser.g:7543:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7547:1: ( ( ruleParameterValue ) )
            // InternalMyDslParser.g:7548:2: ( ruleParameterValue )
            {
            // InternalMyDslParser.g:7548:2: ( ruleParameterValue )
            // InternalMyDslParser.g:7549:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_2"


    // $ANTLR start "rule__ParameterList__ValueAssignment_3_1"
    // InternalMyDslParser.g:7558:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7562:1: ( ( ruleParameterValue ) )
            // InternalMyDslParser.g:7563:2: ( ruleParameterValue )
            {
            // InternalMyDslParser.g:7563:2: ( ruleParameterValue )
            // InternalMyDslParser.g:7564:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterAny__ValueAssignment_2_1"
    // InternalMyDslParser.g:7573:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7577:1: ( ( ruleEString ) )
            // InternalMyDslParser.g:7578:2: ( ruleEString )
            {
            // InternalMyDslParser.g:7578:2: ( ruleEString )
            // InternalMyDslParser.g:7579:3: ruleEString
            {
             before(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__ValueAssignment_2_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment"
    // InternalMyDslParser.g:7588:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7592:1: ( ( ruleEString ) )
            // InternalMyDslParser.g:7593:2: ( ruleEString )
            {
            // InternalMyDslParser.g:7593:2: ( ruleEString )
            // InternalMyDslParser.g:7594:3: ruleEString
            {
             before(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__ValueAssignment"


    // $ANTLR start "rule__ParameterBase64__ValueAssignment"
    // InternalMyDslParser.g:7603:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7607:1: ( ( ruleBase64Binary ) )
            // InternalMyDslParser.g:7608:2: ( ruleBase64Binary )
            {
            // InternalMyDslParser.g:7608:2: ( ruleBase64Binary )
            // InternalMyDslParser.g:7609:3: ruleBase64Binary
            {
             before(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64__ValueAssignment"


    // $ANTLR start "rule__ParameterInteger__ValueAssignment"
    // InternalMyDslParser.g:7618:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7622:1: ( ( ruleInteger0 ) )
            // InternalMyDslParser.g:7623:2: ( ruleInteger0 )
            {
            // InternalMyDslParser.g:7623:2: ( ruleInteger0 )
            // InternalMyDslParser.g:7624:3: ruleInteger0
            {
             before(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInteger__ValueAssignment"


    // $ANTLR start "rule__ParameterDouble__ValueAssignment"
    // InternalMyDslParser.g:7633:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7637:1: ( ( ruleDouble0 ) )
            // InternalMyDslParser.g:7638:2: ( ruleDouble0 )
            {
            // InternalMyDslParser.g:7638:2: ( ruleDouble0 )
            // InternalMyDslParser.g:7639:3: ruleDouble0
            {
             before(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDouble__ValueAssignment"


    // $ANTLR start "rule__ParameterBoolean__ValueAssignment"
    // InternalMyDslParser.g:7648:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7652:1: ( ( ruleboolean0 ) )
            // InternalMyDslParser.g:7653:2: ( ruleboolean0 )
            {
            // InternalMyDslParser.g:7653:2: ( ruleboolean0 )
            // InternalMyDslParser.g:7654:3: ruleboolean0
            {
             before(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBoolean__ValueAssignment"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_2"
    // InternalMyDslParser.g:7663:1: rule__ParameterStruct__ValueAssignment_1_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7667:1: ( ( ruleParameterStructMember ) )
            // InternalMyDslParser.g:7668:2: ( ruleParameterStructMember )
            {
            // InternalMyDslParser.g:7668:2: ( ruleParameterStructMember )
            // InternalMyDslParser.g:7669:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_2"


    // $ANTLR start "rule__ParameterDate__ValueAssignment"
    // InternalMyDslParser.g:7678:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7682:1: ( ( ruleDateTime0 ) )
            // InternalMyDslParser.g:7683:2: ( ruleDateTime0 )
            {
            // InternalMyDslParser.g:7683:2: ( ruleDateTime0 )
            // InternalMyDslParser.g:7684:3: ruleDateTime0
            {
             before(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDate__ValueAssignment"


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_0"
    // InternalMyDslParser.g:7693:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7697:1: ( ( ruleEString ) )
            // InternalMyDslParser.g:7698:2: ( ruleEString )
            {
            // InternalMyDslParser.g:7698:2: ( ruleEString )
            // InternalMyDslParser.g:7699:3: ruleEString
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructMember__ValueAssignment_2"
    // InternalMyDslParser.g:7708:1: rule__ParameterStructMember__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7712:1: ( ( ruleParameterValue ) )
            // InternalMyDslParser.g:7713:2: ( ruleParameterValue )
            {
            // InternalMyDslParser.g:7713:2: ( ruleParameterValue )
            // InternalMyDslParser.g:7714:3: ruleParameterValue
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__ValueAssignment_2"


    // $ANTLR start "rule__ParameterStructTypeMember__NameAssignment_0"
    // InternalMyDslParser.g:7723:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7727:1: ( ( ruleEString ) )
            // InternalMyDslParser.g:7728:2: ( ruleEString )
            {
            // InternalMyDslParser.g:7728:2: ( ruleEString )
            // InternalMyDslParser.g:7729:3: ruleEString
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructTypeMember__TypeAssignment_1"
    // InternalMyDslParser.g:7738:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7742:1: ( ( ruleParameterType ) )
            // InternalMyDslParser.g:7743:2: ( ruleParameterType )
            {
            // InternalMyDslParser.g:7743:2: ( ruleParameterType )
            // InternalMyDslParser.g:7744:3: ruleParameterType
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__TypeAssignment_1"


    // $ANTLR start "rule__SpecBaseRef__ReferenceAssignment"
    // InternalMyDslParser.g:7753:1: rule__SpecBaseRef__ReferenceAssignment : ( ( ruleEString ) ) ;
    public final void rule__SpecBaseRef__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7757:1: ( ( ( ruleEString ) ) )
            // InternalMyDslParser.g:7758:2: ( ( ruleEString ) )
            {
            // InternalMyDslParser.g:7758:2: ( ( ruleEString ) )
            // InternalMyDslParser.g:7759:3: ( ruleEString )
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0()); 
            // InternalMyDslParser.g:7760:3: ( ruleEString )
            // InternalMyDslParser.g:7761:4: ruleEString
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecBaseRef__ReferenceAssignment"


    // $ANTLR start "rule__ArraySpecRef__ReferenceAssignment_0"
    // InternalMyDslParser.g:7772:1: rule__ArraySpecRef__ReferenceAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ArraySpecRef__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslParser.g:7776:1: ( ( ( ruleEString ) ) )
            // InternalMyDslParser.g:7777:2: ( ( ruleEString ) )
            {
            // InternalMyDslParser.g:7777:2: ( ( ruleEString ) )
            // InternalMyDslParser.g:7778:3: ( ruleEString )
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0()); 
            // InternalMyDslParser.g:7779:3: ( ruleEString )
            // InternalMyDslParser.g:7780:4: ruleEString
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__ReferenceAssignment_0"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\10\2\11\10\uffff";
    static final String dfa_3s = "\3\105\4\uffff\1\106\3\uffff";
    static final String dfa_4s = "\3\127\4\uffff\1\132\3\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\1\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\10\2\uffff\1\7\1\10\1\uffff\1\3\1\6\1\4\1\5\6\uffff\1\2\1\1",
            "\2\11\1\10\2\uffff\1\11\13\uffff\2\11",
            "\2\11\1\10\2\uffff\1\11\13\uffff\2\11",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\2\12\1\uffff\4\12\6\uffff\2\12\2\uffff\1\10",
            "",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1984:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }
    static final String dfa_8s = "\44\uffff";
    static final String dfa_9s = "\36\uffff\2\42\4\uffff";
    static final String dfa_10s = "\1\13\35\uffff\2\104\4\uffff";
    static final String dfa_11s = "\1\127\35\uffff\2\104\4\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\36\1\37";
    static final String dfa_13s = "\44\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\2\uffff\1\17\1\uffff\1\34\1\25\1\27\1\31\2\uffff\1\12\1\13\1\24\1\26\1\30\2\uffff\1\23\2\uffff\1\20\3\uffff\1\21\1\35\1\41\1\uffff\1\22\1\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\1\uffff\1\3\3\uffff\1\1\1\15\1\40\1\uffff\1\2\2\uffff\1\16\25\uffff\1\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\43",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2035:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C0F200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0101000D80600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}