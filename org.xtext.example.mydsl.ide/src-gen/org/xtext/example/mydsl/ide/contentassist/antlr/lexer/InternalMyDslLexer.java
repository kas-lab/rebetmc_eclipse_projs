package org.xtext.example.mydsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDslLexer.g"; }

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:14:19: ( 'RelativeNamespace' )
            // InternalMyDslLexer.g:14:21: 'RelativeNamespace'
            {
            match("RelativeNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RelativeNamespace"

    // $ANTLR start "PrivateNamespace"
    public final void mPrivateNamespace() throws RecognitionException {
        try {
            int _type = PrivateNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:16:18: ( 'PrivateNamespace' )
            // InternalMyDslLexer.g:16:20: 'PrivateNamespace'
            {
            match("PrivateNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrivateNamespace"

    // $ANTLR start "GlobalNamespace"
    public final void mGlobalNamespace() throws RecognitionException {
        try {
            int _type = GlobalNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:18:17: ( 'GlobalNamespace' )
            // InternalMyDslLexer.g:18:19: 'GlobalNamespace'
            {
            match("GlobalNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GlobalNamespace"

    // $ANTLR start "SetParameter"
    public final void mSetParameter() throws RecognitionException {
        try {
            int _type = SetParameter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:20:14: ( 'SetParameter(' )
            // InternalMyDslLexer.g:20:16: 'SetParameter('
            {
            match("SetParameter("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SetParameter"

    // $ANTLR start "ParameterAny"
    public final void mParameterAny() throws RecognitionException {
        try {
            int _type = ParameterAny;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:22:14: ( 'ParameterAny' )
            // InternalMyDslLexer.g:22:16: 'ParameterAny'
            {
            match("ParameterAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterAny"

    // $ANTLR start "Ros_system"
    public final void mRos_system() throws RecognitionException {
        try {
            int _type = Ros_system;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:24:12: ( 'ros_system' )
            // InternalMyDslLexer.g:24:14: 'ros_system'
            {
            match("ros_system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ros_system"

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:26:11: ( 'GraphName' )
            // InternalMyDslLexer.g:26:13: 'GraphName'
            {
            match("GraphName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GraphName"

    // $ANTLR start "Float32_1"
    public final void mFloat32_1() throws RecognitionException {
        try {
            int _type = Float32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:28:11: ( 'float32[]' )
            // InternalMyDslLexer.g:28:13: 'float32[]'
            {
            match("float32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32_1"

    // $ANTLR start "Float64_1"
    public final void mFloat64_1() throws RecognitionException {
        try {
            int _type = Float64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:30:11: ( 'float64[]' )
            // InternalMyDslLexer.g:30:13: 'float64[]'
            {
            match("float64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64_1"

    // $ANTLR start "Reconfigs"
    public final void mReconfigs() throws RecognitionException {
        try {
            int _type = Reconfigs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:32:11: ( 'reconfigs' )
            // InternalMyDslLexer.g:32:13: 'reconfigs'
            {
            match("reconfigs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reconfigs"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:34:9: ( 'default:' )
            // InternalMyDslLexer.g:34:11: 'default:'
            {
            match("default:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Duration"
    public final void mDuration() throws RecognitionException {
        try {
            int _type = Duration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:36:10: ( 'duration' )
            // InternalMyDslLexer.g:36:12: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Duration"

    // $ANTLR start "Feedback"
    public final void mFeedback() throws RecognitionException {
        try {
            int _type = Feedback;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:38:10: ( 'feedback' )
            // InternalMyDslLexer.g:38:12: 'feedback'
            {
            match("feedback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feedback"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:40:10: ( 'string[]' )
            // InternalMyDslLexer.g:40:12: 'string[]'
            {
            match("string[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_2"

    // $ANTLR start "Uint16_1"
    public final void mUint16_1() throws RecognitionException {
        try {
            int _type = Uint16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:42:10: ( 'uint16[]' )
            // InternalMyDslLexer.g:42:12: 'uint16[]'
            {
            match("uint16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16_1"

    // $ANTLR start "Uint32_1"
    public final void mUint32_1() throws RecognitionException {
        try {
            int _type = Uint32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:44:10: ( 'uint32[]' )
            // InternalMyDslLexer.g:44:12: 'uint32[]'
            {
            match("uint32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32_1"

    // $ANTLR start "Uint64_1"
    public final void mUint64_1() throws RecognitionException {
        try {
            int _type = Uint64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:46:10: ( 'uint64[]' )
            // InternalMyDslLexer.g:46:12: 'uint64[]'
            {
            match("uint64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64_1"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:48:9: ( 'Boolean' )
            // InternalMyDslLexer.g:48:11: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:50:9: ( 'Integer' )
            // InternalMyDslLexer.g:50:11: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:52:9: ( 'float32' )
            // InternalMyDslLexer.g:52:11: 'float32'
            {
            match("float32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32"

    // $ANTLR start "Float64"
    public final void mFloat64() throws RecognitionException {
        try {
            int _type = Float64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:54:9: ( 'float64' )
            // InternalMyDslLexer.g:54:11: 'float64'
            {
            match("float64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64"

    // $ANTLR start "Int16_1"
    public final void mInt16_1() throws RecognitionException {
        try {
            int _type = Int16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:56:9: ( 'int16[]' )
            // InternalMyDslLexer.g:56:11: 'int16[]'
            {
            match("int16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16_1"

    // $ANTLR start "Int32_1"
    public final void mInt32_1() throws RecognitionException {
        try {
            int _type = Int32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:58:9: ( 'int32[]' )
            // InternalMyDslLexer.g:58:11: 'int32[]'
            {
            match("int32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32_1"

    // $ANTLR start "Int64_1"
    public final void mInt64_1() throws RecognitionException {
        try {
            int _type = Int64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:60:9: ( 'int64[]' )
            // InternalMyDslLexer.g:60:11: 'int64[]'
            {
            match("int64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64_1"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:62:9: ( 'message' )
            // InternalMyDslLexer.g:62:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:64:9: ( 'service' )
            // InternalMyDslLexer.g:64:11: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Service"

    // $ANTLR start "Uint8_1"
    public final void mUint8_1() throws RecognitionException {
        try {
            int _type = Uint8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:66:9: ( 'uint8[]' )
            // InternalMyDslLexer.g:66:11: 'uint8[]'
            {
            match("uint8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8_1"

    // $ANTLR start "Base64"
    public final void mBase64() throws RecognitionException {
        try {
            int _type = Base64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:68:8: ( 'Base64' )
            // InternalMyDslLexer.g:68:10: 'Base64'
            {
            match("Base64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Base64"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:70:8: ( 'Double' )
            // InternalMyDslLexer.g:70:10: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "Header"
    public final void mHeader() throws RecognitionException {
        try {
            int _type = Header;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:72:8: ( 'Header' )
            // InternalMyDslLexer.g:72:10: 'Header'
            {
            match("Header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Header"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:74:8: ( 'String' )
            // InternalMyDslLexer.g:74:10: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Struct"
    public final void mStruct() throws RecognitionException {
        try {
            int _type = Struct;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:76:8: ( 'Struct' )
            // InternalMyDslLexer.g:76:10: 'Struct'
            {
            match("Struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Struct"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:78:8: ( 'action' )
            // InternalMyDslLexer.g:78:10: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Bool_1"
    public final void mBool_1() throws RecognitionException {
        try {
            int _type = Bool_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:80:8: ( 'bool[]' )
            // InternalMyDslLexer.g:80:10: 'bool[]'
            {
            match("bool[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool_1"

    // $ANTLR start "Byte_1"
    public final void mByte_1() throws RecognitionException {
        try {
            int _type = Byte_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:82:8: ( 'byte[]' )
            // InternalMyDslLexer.g:82:10: 'byte[]'
            {
            match("byte[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte_1"

    // $ANTLR start "Char_1"
    public final void mChar_1() throws RecognitionException {
        try {
            int _type = Char_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:84:8: ( 'char[]' )
            // InternalMyDslLexer.g:84:10: 'char[]'
            {
            match("char[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char_1"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:86:8: ( 'import' )
            // InternalMyDslLexer.g:86:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Int8_1"
    public final void mInt8_1() throws RecognitionException {
        try {
            int _type = Int8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:88:8: ( 'int8[]' )
            // InternalMyDslLexer.g:88:10: 'int8[]'
            {
            match("int8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8_1"

    // $ANTLR start "Result"
    public final void mResult() throws RecognitionException {
        try {
            int _type = Result;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:90:8: ( 'result' )
            // InternalMyDslLexer.g:90:10: 'result'
            {
            match("result"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Result"

    // $ANTLR start "String_1"
    public final void mString_1() throws RecognitionException {
        try {
            int _type = String_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:92:10: ( 'string' )
            // InternalMyDslLexer.g:92:12: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_1"

    // $ANTLR start "Uint16"
    public final void mUint16() throws RecognitionException {
        try {
            int _type = Uint16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:94:8: ( 'uint16' )
            // InternalMyDslLexer.g:94:10: 'uint16'
            {
            match("uint16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16"

    // $ANTLR start "Uint32"
    public final void mUint32() throws RecognitionException {
        try {
            int _type = Uint32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:96:8: ( 'uint32' )
            // InternalMyDslLexer.g:96:10: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32"

    // $ANTLR start "Uint64"
    public final void mUint64() throws RecognitionException {
        try {
            int _type = Uint64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:98:8: ( 'uint64' )
            // InternalMyDslLexer.g:98:10: 'uint64'
            {
            match("uint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64"

    // $ANTLR start "Value_1"
    public final void mValue_1() throws RecognitionException {
        try {
            int _type = Value_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:100:9: ( 'value:' )
            // InternalMyDslLexer.g:100:11: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value_1"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:102:7: ( 'Array' )
            // InternalMyDslLexer.g:102:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:104:7: ( 'int16' )
            // InternalMyDslLexer.g:104:9: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16"

    // $ANTLR start "Int32"
    public final void mInt32() throws RecognitionException {
        try {
            int _type = Int32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:106:7: ( 'int32' )
            // InternalMyDslLexer.g:106:9: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32"

    // $ANTLR start "Int64"
    public final void mInt64() throws RecognitionException {
        try {
            int _type = Int64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:108:7: ( 'int64' )
            // InternalMyDslLexer.g:108:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:110:8: ( 'type:' )
            // InternalMyDslLexer.g:110:10: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type_1"

    // $ANTLR start "Uint8"
    public final void mUint8() throws RecognitionException {
        try {
            int _type = Uint8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:112:7: ( 'uint8' )
            // InternalMyDslLexer.g:112:9: 'uint8'
            {
            match("uint8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:114:7: ( 'value' )
            // InternalMyDslLexer.g:114:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:116:6: ( 'Date' )
            // InternalMyDslLexer.g:116:8: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:118:6: ( 'List' )
            // InternalMyDslLexer.g:118:8: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:120:6: ( 'bool' )
            // InternalMyDslLexer.g:120:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:122:6: ( 'byte' )
            // InternalMyDslLexer.g:122:8: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:124:6: ( 'char' )
            // InternalMyDslLexer.g:124:8: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:126:6: ( 'goal' )
            // InternalMyDslLexer.g:126:8: 'goal'
            {
            match("goal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal"

    // $ANTLR start "Int8"
    public final void mInt8() throws RecognitionException {
        try {
            int _type = Int8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:128:6: ( 'int8' )
            // InternalMyDslLexer.g:128:8: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:130:6: ( 'name' )
            // InternalMyDslLexer.g:130:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:132:6: ( 'node' )
            // InternalMyDslLexer.g:132:8: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node"

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:134:6: ( 'time' )
            // InternalMyDslLexer.g:134:8: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Time"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:136:6: ( 'type' )
            // InternalMyDslLexer.g:136:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:138:5: ( 'Any' )
            // InternalMyDslLexer.g:138:7: 'Any'
            {
            match("Any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "Ns"
    public final void mNs() throws RecognitionException {
        try {
            int _type = Ns;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:140:4: ( 'ns:' )
            // InternalMyDslLexer.g:140:6: 'ns:'
            {
            match("ns:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ns"

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:142:37: ( '[]' )
            // InternalMyDslLexer.g:142:39: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracketRightSquareBracket"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:144:18: ( ')' )
            // InternalMyDslLexer.g:144:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:146:7: ( ',' )
            // InternalMyDslLexer.g:146:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:148:7: ( ':' )
            // InternalMyDslLexer.g:148:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:150:11: ( ';' )
            // InternalMyDslLexer.g:150:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:152:19: ( '[' )
            // InternalMyDslLexer.g:152:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:154:20: ( ']' )
            // InternalMyDslLexer.g:154:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:156:21: ( '0' .. '9' )
            // InternalMyDslLexer.g:156:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:158:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalMyDslLexer.g:158:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalMyDslLexer.g:158:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDslLexer.g:158:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:158:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalMyDslLexer.g:158:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:160:14: ( ( 'true' | 'false' ) )
            // InternalMyDslLexer.g:160:16: ( 'true' | 'false' )
            {
            // InternalMyDslLexer.g:160:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDslLexer.g:160:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:160:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:162:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalMyDslLexer.g:162:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalMyDslLexer.g:162:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.'||(LA6_0>='0' && LA6_0<='9')||LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            else if ( (LA6_0=='-') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDslLexer.g:162:16: ( RULE_DIGIT )*
                    {
                    // InternalMyDslLexer.g:162:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:162:16: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:162:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalMyDslLexer.g:162:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:162:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslLexer.g:162:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDslLexer.g:162:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalMyDslLexer.g:162:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:162:50: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:162:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalMyDslLexer.g:162:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDslLexer.g:162:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalMyDslLexer.g:162:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalMyDslLexer.g:162:68: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDslLexer.g:162:92: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDslLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalMyDslLexer.g:162:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:162:103: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:164:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalMyDslLexer.g:164:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalMyDslLexer.g:164:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt15=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt15=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt15=2;
                }
                break;
            case '-':
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDslLexer.g:164:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:164:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDslLexer.g:164:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:164:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMyDslLexer.g:164:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalMyDslLexer.g:164:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:164:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:166:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalMyDslLexer.g:166:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalMyDslLexer.g:166:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='1' && LA16_0<='3')) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='9')) ) {
                    alt16=2;
                }
                else {
                    alt16=1;}
            }
            else if ( ((LA16_0>='4' && LA16_0<='9')) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDslLexer.g:166:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:166:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3'); 
                    matchRange('0','9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:168:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalMyDslLexer.g:168:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalMyDslLexer.g:168:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='1') ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>='0' && LA17_1<='2')) ) {
                    alt17=2;
                }
                else {
                    alt17=1;}
            }
            else if ( ((LA17_0>='2' && LA17_0<='9')) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDslLexer.g:168:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:168:33: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:170:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalMyDslLexer.g:170:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:172:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalMyDslLexer.g:172:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalMyDslLexer.g:172:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='0' && LA18_0<='1')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='2') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDslLexer.g:172:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:172:41: '2' '0' .. '3'
                    {
                    match('2'); 
                    matchRange('0','3'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_MIN_SEC"
    public final void mRULE_MIN_SEC() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:174:23: ( '0' .. '5' '0' .. '9' )
            // InternalMyDslLexer.g:174:25: '0' .. '5' '0' .. '9'
            {
            matchRange('0','5'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_SEC"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:176:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalMyDslLexer.g:176:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
            {
            mRULE_YEAR(); 
            match('-'); 
            mRULE_MONTH(); 
            match('-'); 
            mRULE_DAY(); 
            match('T'); 
            mRULE_HOUR(); 
            match(':'); 
            mRULE_MIN_SEC(); 
            match(':'); 
            mRULE_MIN_SEC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_MESSAGE_ASIGMENT"
    public final void mRULE_MESSAGE_ASIGMENT() throws RecognitionException {
        try {
            int _type = RULE_MESSAGE_ASIGMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:178:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalMyDslLexer.g:178:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalMyDslLexer.g:178:25: ( RULE_ID | RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='^' && LA19_0<='_')||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\"'||LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDslLexer.g:178:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:178:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalMyDslLexer.g:178:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt20=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt20=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt20=3;
                }
                break;
            case '-':
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDslLexer.g:178:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:178:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalMyDslLexer.g:178:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalMyDslLexer.g:178:81: '-' RULE_INT
                    {
                    match('-'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MESSAGE_ASIGMENT"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:180:21: ()
            // InternalMyDslLexer.g:180:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:182:19: ()
            // InternalMyDslLexer.g:182:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:184:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalMyDslLexer.g:184:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalMyDslLexer.g:184:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDslLexer.g:184:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:186:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalMyDslLexer.g:186:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalMyDslLexer.g:186:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='/') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='A' && LA22_0<='Z')||(LA22_0>='^' && LA22_0<='_')||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDslLexer.g:186:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDslLexer.g:186:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_A"

    // $ANTLR start "RULE_ROS_CONVENTION_PARAM"
    public final void mRULE_ROS_CONVENTION_PARAM() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:188:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalMyDslLexer.g:188:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalMyDslLexer.g:188:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt23=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt23=2;
                    }
                    break;
                case '~':
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalMyDslLexer.g:188:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDslLexer.g:188:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDslLexer.g:188:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:190:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDslLexer.g:190:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDslLexer.g:190:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDslLexer.g:190:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDslLexer.g:190:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:192:19: ( ( '0' .. '9' )+ )
            // InternalMyDslLexer.g:192:21: ( '0' .. '9' )+
            {
            // InternalMyDslLexer.g:192:21: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDslLexer.g:192:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:194:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDslLexer.g:194:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDslLexer.g:194:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\"') ) {
                alt29=1;
            }
            else if ( (LA29_0=='\'') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDslLexer.g:194:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDslLexer.g:194:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:194:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:194:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:194:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDslLexer.g:194:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:194:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:194:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:196:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDslLexer.g:196:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDslLexer.g:196:24: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDslLexer.g:196:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:198:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDslLexer.g:198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDslLexer.g:198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:200:16: ( . )
            // InternalMyDslLexer.g:200:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDslLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | SetParameter | ParameterAny | Ros_system | GraphName | Float32_1 | Float64_1 | Reconfigs | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Import | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Array | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | RightParenthesis | Comma | Colon | Semicolon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=85;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalMyDslLexer.g:1:10: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 2 :
                // InternalMyDslLexer.g:1:28: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 3 :
                // InternalMyDslLexer.g:1:45: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 4 :
                // InternalMyDslLexer.g:1:61: SetParameter
                {
                mSetParameter(); 

                }
                break;
            case 5 :
                // InternalMyDslLexer.g:1:74: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 6 :
                // InternalMyDslLexer.g:1:87: Ros_system
                {
                mRos_system(); 

                }
                break;
            case 7 :
                // InternalMyDslLexer.g:1:98: GraphName
                {
                mGraphName(); 

                }
                break;
            case 8 :
                // InternalMyDslLexer.g:1:108: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 9 :
                // InternalMyDslLexer.g:1:118: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 10 :
                // InternalMyDslLexer.g:1:128: Reconfigs
                {
                mReconfigs(); 

                }
                break;
            case 11 :
                // InternalMyDslLexer.g:1:138: Default
                {
                mDefault(); 

                }
                break;
            case 12 :
                // InternalMyDslLexer.g:1:146: Duration
                {
                mDuration(); 

                }
                break;
            case 13 :
                // InternalMyDslLexer.g:1:155: Feedback
                {
                mFeedback(); 

                }
                break;
            case 14 :
                // InternalMyDslLexer.g:1:164: String_2
                {
                mString_2(); 

                }
                break;
            case 15 :
                // InternalMyDslLexer.g:1:173: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 16 :
                // InternalMyDslLexer.g:1:182: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 17 :
                // InternalMyDslLexer.g:1:191: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 18 :
                // InternalMyDslLexer.g:1:200: Boolean
                {
                mBoolean(); 

                }
                break;
            case 19 :
                // InternalMyDslLexer.g:1:208: Integer
                {
                mInteger(); 

                }
                break;
            case 20 :
                // InternalMyDslLexer.g:1:216: Float32
                {
                mFloat32(); 

                }
                break;
            case 21 :
                // InternalMyDslLexer.g:1:224: Float64
                {
                mFloat64(); 

                }
                break;
            case 22 :
                // InternalMyDslLexer.g:1:232: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 23 :
                // InternalMyDslLexer.g:1:240: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 24 :
                // InternalMyDslLexer.g:1:248: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 25 :
                // InternalMyDslLexer.g:1:256: Message
                {
                mMessage(); 

                }
                break;
            case 26 :
                // InternalMyDslLexer.g:1:264: Service
                {
                mService(); 

                }
                break;
            case 27 :
                // InternalMyDslLexer.g:1:272: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 28 :
                // InternalMyDslLexer.g:1:280: Base64
                {
                mBase64(); 

                }
                break;
            case 29 :
                // InternalMyDslLexer.g:1:287: Double
                {
                mDouble(); 

                }
                break;
            case 30 :
                // InternalMyDslLexer.g:1:294: Header
                {
                mHeader(); 

                }
                break;
            case 31 :
                // InternalMyDslLexer.g:1:301: String
                {
                mString(); 

                }
                break;
            case 32 :
                // InternalMyDslLexer.g:1:308: Struct
                {
                mStruct(); 

                }
                break;
            case 33 :
                // InternalMyDslLexer.g:1:315: Action
                {
                mAction(); 

                }
                break;
            case 34 :
                // InternalMyDslLexer.g:1:322: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 35 :
                // InternalMyDslLexer.g:1:329: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 36 :
                // InternalMyDslLexer.g:1:336: Char_1
                {
                mChar_1(); 

                }
                break;
            case 37 :
                // InternalMyDslLexer.g:1:343: Import
                {
                mImport(); 

                }
                break;
            case 38 :
                // InternalMyDslLexer.g:1:350: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 39 :
                // InternalMyDslLexer.g:1:357: Result
                {
                mResult(); 

                }
                break;
            case 40 :
                // InternalMyDslLexer.g:1:364: String_1
                {
                mString_1(); 

                }
                break;
            case 41 :
                // InternalMyDslLexer.g:1:373: Uint16
                {
                mUint16(); 

                }
                break;
            case 42 :
                // InternalMyDslLexer.g:1:380: Uint32
                {
                mUint32(); 

                }
                break;
            case 43 :
                // InternalMyDslLexer.g:1:387: Uint64
                {
                mUint64(); 

                }
                break;
            case 44 :
                // InternalMyDslLexer.g:1:394: Value_1
                {
                mValue_1(); 

                }
                break;
            case 45 :
                // InternalMyDslLexer.g:1:402: Array
                {
                mArray(); 

                }
                break;
            case 46 :
                // InternalMyDslLexer.g:1:408: Int16
                {
                mInt16(); 

                }
                break;
            case 47 :
                // InternalMyDslLexer.g:1:414: Int32
                {
                mInt32(); 

                }
                break;
            case 48 :
                // InternalMyDslLexer.g:1:420: Int64
                {
                mInt64(); 

                }
                break;
            case 49 :
                // InternalMyDslLexer.g:1:426: Type_1
                {
                mType_1(); 

                }
                break;
            case 50 :
                // InternalMyDslLexer.g:1:433: Uint8
                {
                mUint8(); 

                }
                break;
            case 51 :
                // InternalMyDslLexer.g:1:439: Value
                {
                mValue(); 

                }
                break;
            case 52 :
                // InternalMyDslLexer.g:1:445: Date
                {
                mDate(); 

                }
                break;
            case 53 :
                // InternalMyDslLexer.g:1:450: List
                {
                mList(); 

                }
                break;
            case 54 :
                // InternalMyDslLexer.g:1:455: Bool
                {
                mBool(); 

                }
                break;
            case 55 :
                // InternalMyDslLexer.g:1:460: Byte
                {
                mByte(); 

                }
                break;
            case 56 :
                // InternalMyDslLexer.g:1:465: Char
                {
                mChar(); 

                }
                break;
            case 57 :
                // InternalMyDslLexer.g:1:470: Goal
                {
                mGoal(); 

                }
                break;
            case 58 :
                // InternalMyDslLexer.g:1:475: Int8
                {
                mInt8(); 

                }
                break;
            case 59 :
                // InternalMyDslLexer.g:1:480: Name
                {
                mName(); 

                }
                break;
            case 60 :
                // InternalMyDslLexer.g:1:485: Node
                {
                mNode(); 

                }
                break;
            case 61 :
                // InternalMyDslLexer.g:1:490: Time
                {
                mTime(); 

                }
                break;
            case 62 :
                // InternalMyDslLexer.g:1:495: Type
                {
                mType(); 

                }
                break;
            case 63 :
                // InternalMyDslLexer.g:1:500: Any
                {
                mAny(); 

                }
                break;
            case 64 :
                // InternalMyDslLexer.g:1:504: Ns
                {
                mNs(); 

                }
                break;
            case 65 :
                // InternalMyDslLexer.g:1:507: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 66 :
                // InternalMyDslLexer.g:1:543: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 67 :
                // InternalMyDslLexer.g:1:560: Comma
                {
                mComma(); 

                }
                break;
            case 68 :
                // InternalMyDslLexer.g:1:566: Colon
                {
                mColon(); 

                }
                break;
            case 69 :
                // InternalMyDslLexer.g:1:572: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 70 :
                // InternalMyDslLexer.g:1:582: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 71 :
                // InternalMyDslLexer.g:1:600: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 72 :
                // InternalMyDslLexer.g:1:619: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 73 :
                // InternalMyDslLexer.g:1:631: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 74 :
                // InternalMyDslLexer.g:1:644: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 75 :
                // InternalMyDslLexer.g:1:656: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 76 :
                // InternalMyDslLexer.g:1:668: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 77 :
                // InternalMyDslLexer.g:1:683: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 78 :
                // InternalMyDslLexer.g:1:705: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // InternalMyDslLexer.g:1:721: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 80 :
                // InternalMyDslLexer.g:1:743: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 81 :
                // InternalMyDslLexer.g:1:769: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 82 :
                // InternalMyDslLexer.g:1:777: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // InternalMyDslLexer.g:1:789: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // InternalMyDslLexer.g:1:805: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 85 :
                // InternalMyDslLexer.g:1:813: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA12_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA12_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "162:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA32_eotS =
        "\1\53\30\60\1\134\5\uffff\2\144\1\uffff\1\145\1\56\1\144\1\56\1\60\2\56\1\uffff\1\56\1\uffff\1\56\2\uffff\1\60\1\uffff\1\60\1\uffff\50\60\13\uffff\1\144\1\145\2\144\1\60\2\uffff\1\u00a3\2\uffff\1\u00a3\4\uffff\41\60\1\u00ca\7\60\2\uffff\2\144\3\uffff\31\60\1\u00f1\3\60\1\u00f5\2\60\1\u00f9\1\u00fb\1\u00fd\2\60\1\uffff\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\uffff\1\144\15\60\1\u0103\7\60\1\u011f\3\60\1\u0124\1\u0126\1\u0128\2\uffff\3\60\1\uffff\2\60\6\uffff\1\u012f\1\u0130\11\uffff\6\60\1\u0137\1\u0138\2\60\1\u013b\5\60\1\u0142\1\60\1\u0145\1\u0147\1\u0149\2\uffff\1\60\1\u014b\1\60\6\uffff\1\u014d\1\60\1\u014f\1\u0150\1\u0151\3\uffff\6\60\2\uffff\2\60\1\uffff\1\u015b\1\u015d\3\60\2\uffff\1\u0161\6\uffff\1\u0162\1\uffff\1\u0163\1\uffff\1\u0164\3\uffff\10\60\4\uffff\1\u016d\1\uffff\1\u016e\4\uffff\4\60\1\u0173\2\60\1\u0176\2\uffff\4\60\1\uffff\1\60\1\u017c\1\uffff\5\60\1\uffff\2\60\1\u0184\4\60\1\uffff\1\60\1\uffff\5\60\1\u018f\1\60\1\u0191\1\uffff\1\u0192\2\uffff";
    static final String DFA32_eofS =
        "\u0193\uffff";
    static final String DFA32_minS =
        "\1\0\30\57\1\135\5\uffff\2\56\1\uffff\1\57\2\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\50\57\10\uffff\1\56\2\uffff\1\56\1\57\2\56\1\57\2\0\1\57\2\0\1\57\4\uffff\51\57\1\uffff\3\56\1\0\1\uffff\1\0\45\57\1\uffff\7\57\2\55\34\57\2\uffff\3\57\1\uffff\2\57\6\uffff\2\57\11\uffff\25\57\2\uffff\3\57\6\uffff\5\57\3\uffff\6\57\2\uffff\2\57\1\uffff\5\57\2\uffff\1\57\6\uffff\1\57\1\uffff\1\57\1\uffff\1\57\3\uffff\10\57\4\uffff\1\57\1\uffff\1\57\4\uffff\10\57\2\uffff\4\57\1\uffff\2\57\1\uffff\5\57\1\uffff\4\57\1\50\2\57\1\uffff\1\57\1\uffff\10\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\30\172\1\135\5\uffff\2\145\1\uffff\1\172\2\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\50\172\10\uffff\1\145\2\uffff\1\145\1\172\2\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\51\172\1\uffff\3\145\1\uffff\1\uffff\1\uffff\45\172\1\uffff\7\172\2\145\34\172\2\uffff\3\172\1\uffff\2\172\6\uffff\2\172\11\uffff\25\172\2\uffff\3\172\6\uffff\5\172\3\uffff\6\172\2\uffff\2\172\1\uffff\5\172\2\uffff\1\172\6\uffff\1\172\1\uffff\1\172\1\uffff\1\172\3\uffff\10\172\4\uffff\1\172\1\uffff\1\172\4\uffff\10\172\2\uffff\4\172\1\uffff\2\172\1\uffff\5\172\1\uffff\7\172\1\uffff\1\172\1\uffff\10\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\32\uffff\1\102\1\103\1\104\1\105\1\107\2\uffff\1\112\7\uffff\1\116\1\uffff\1\117\1\uffff\1\124\1\125\1\uffff\1\121\1\uffff\1\115\50\uffff\1\101\1\106\1\102\1\103\1\104\1\105\1\107\1\110\1\uffff\1\113\1\112\13\uffff\1\116\1\123\1\120\1\124\51\uffff\1\100\4\uffff\1\122\46\uffff\1\77\45\uffff\1\46\1\72\3\uffff\1\64\2\uffff\1\42\1\66\1\43\1\67\1\44\1\70\2\uffff\1\61\1\76\1\75\1\111\1\65\1\71\1\73\1\74\1\114\25\uffff\1\33\1\62\3\uffff\1\26\1\56\1\27\1\57\1\30\1\60\5\uffff\1\54\1\63\1\55\6\uffff\1\37\1\40\2\uffff\1\47\5\uffff\1\16\1\50\1\uffff\1\17\1\51\1\20\1\52\1\21\1\53\1\uffff\1\34\1\uffff\1\45\1\uffff\1\35\1\36\1\41\10\uffff\1\10\1\24\1\11\1\25\1\uffff\1\13\1\uffff\1\32\1\22\1\23\1\31\10\uffff\1\15\1\14\4\uffff\1\7\2\uffff\1\12\5\uffff\1\6\7\uffff\1\5\1\uffff\1\4\10\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\10\46\uffff\1\0\1\5\102\uffff\1\1\1\4\1\uffff\1\2\1\7\62\uffff\1\3\1\uffff\1\6\u00ee\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\56\1\47\1\51\3\56\1\50\1\56\1\32\2\56\1\33\1\43\1\41\1\52\1\37\2\40\7\44\1\34\1\35\5\56\1\24\1\12\1\46\1\16\1\42\1\46\1\3\1\17\1\13\2\46\1\26\3\46\1\2\1\46\1\1\1\4\7\46\1\31\1\56\1\36\1\45\1\46\1\56\1\20\1\21\1\22\1\7\1\42\1\6\1\27\1\46\1\14\3\46\1\15\1\30\3\46\1\5\1\10\1\25\1\11\1\23\4\46\3\56\1\54\uff81\56",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\57\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\64\20\61\1\63\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\65\5\61\1\66\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\67\16\61\1\70\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\72\11\61\1\71\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\75\3\61\1\74\6\61\1\73\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\76\17\61\1\77\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\101\16\61\1\100\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\102\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\104\15\61\1\103\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\105\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\107\1\106\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\110\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\112\15\61\1\111\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\113\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\114\27\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\115\11\61\1\116\1\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\117\22\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\120\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\122\3\61\1\121\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\124\10\61\1\125\6\61\1\123\1\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\126\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\127\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\130\15\61\1\131\3\61\1\132\7\61",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\145\1\uffff\12\143\10\uffff\1\142\2\uffff\1\145\34\uffff\1\142\2\uffff\1\145",
            "\1\145\1\uffff\12\146\13\uffff\1\145\37\uffff\1\145",
            "",
            "\1\53\12\147\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\145\1\uffff\12\150\13\uffff\1\145\37\uffff\1\145",
            "\1\145\1\uffff\12\151\13\uffff\1\145\37\uffff\1\145",
            "\32\152\4\uffff\1\152\1\uffff\32\152",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\42\154\1\155\71\154\1\153\uffa3\154",
            "\47\157\1\160\64\157\1\156\uffa3\157",
            "",
            "\1\163\4\uffff\1\163\2\uffff\1\162\26\uffff\32\53\3\uffff\2\53\1\uffff\32\53",
            "",
            "\1\163\4\uffff\1\163",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\165\16\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\166\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\167\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\170\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\171\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\172\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\173\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\174\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\175\17\61\1\176\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\177\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0080\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0081\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\u0082\24\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0083\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0084\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0085\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0086\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0087\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0088\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0089\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u008a\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u008b\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u008c\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u008d\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u008e\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u008f\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0090\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0091\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0092\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0093\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0094\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0095\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u0096\1\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0097\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0098\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0099\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u009a\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u009b\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u009c\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u009d\26\61",
            "\1\53\12\61\1\u009e\2\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145\1\uffff\12\u009f\13\uffff\1\145\37\uffff\1\145",
            "",
            "",
            "\1\145\1\uffff\12\u00a0\13\uffff\1\145\37\uffff\1\145",
            "\1\53\12\147\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\145\1\uffff\12\u00a1\13\uffff\1\145\37\uffff\1\145",
            "\1\145\1\uffff\12\151\13\uffff\1\145\37\uffff\1\145",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\0\u00a2",
            "\42\154\1\155\71\154\1\153\uffa3\154",
            "\1\163\15\uffff\1\62",
            "\0\u00a4",
            "\47\157\1\160\64\157\1\156\uffa3\157",
            "\1\163\15\uffff\1\62",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00a5\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\u00a6\4\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00a7\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\61\1\u00a8\30\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u00a9\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\17\61\1\u00aa\12\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00ab\13\61\1\u00ac\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\u00ad\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00ae\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00af\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00b0\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00b1\26\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00b2\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00b3\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00b4\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00b5\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\u00b6\4\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00b7\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00b8\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00b9\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00ba\25\61",
            "\1\53\1\61\1\u00bb\1\61\1\u00bc\2\61\1\u00bd\1\61\1\u00be\1\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00bf\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00c0\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\61\1\u00c1\30\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00c2\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00c3\26\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00c4\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00c5\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00c6\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00c7\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00c8\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00c9\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00cb\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00cc\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00cd\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00ce\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00cf\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d0\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d1\25\61",
            "",
            "\1\145\1\uffff\12\u00d2\13\uffff\1\145\37\uffff\1\145",
            "\1\145\1\uffff\12\u00d3\13\uffff\1\145\37\uffff\1\145",
            "\1\145\1\uffff\12\u00a1\13\uffff\1\145\37\uffff\1\145",
            "\42\154\1\155\71\154\1\153\uffa3\154",
            "",
            "\47\157\1\160\64\157\1\156\uffa3\157",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00d4\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00d5\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u00d6\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00d7\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u00d8\22\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00d9\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00da\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00db\27\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00dc\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00dd\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00de\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00df\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\61\1\u00e0\30\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e1\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00e2\5\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00e3\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00e4\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00e5\21\61",
            "\1\53\1\61\1\u00e6\1\61\1\u00e7\2\61\1\u00e8\1\61\1\u00e9\1\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00ea\25\61",
            "\1\53\6\61\1\u00eb\3\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u00ec\23\61",
            "\1\53\6\61\1\u00ed\3\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\2\61\1\u00ee\7\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\4\61\1\u00ef\5\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u00f0\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00f2\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u00f3\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00f4\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00f6\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00f7\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u00f8\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u00fa\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u00fc\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00fe\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u00ff\1\61",
            "",
            "\1\53\12\61\1\u0100\2\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0108\1\145\1\uffff\12\145\13\uffff\1\145\37\uffff\1\145",
            "\1\u0108\1\145\1\uffff\12\151\13\uffff\1\145\37\uffff\1\145",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0109\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u010a\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u010b\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u010c\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\15\61\1\u010d\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u010e\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u010f\23\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0110\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u0111\1\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\u0112\24\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0113\6\61",
            "\1\53\3\61\1\u0114\2\61\1\u0115\3\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0116\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0117\16\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0118\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0119\23\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u011a\27\61",
            "\1\53\6\61\1\u011b\3\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\2\61\1\u011c\7\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\4\61\1\u011d\5\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u011e\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0120\31\61",
            "\1\53\4\61\1\u0121\5\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0122\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0123\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0125\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0127\3\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0129\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u012a\23\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u012b\25\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u012c\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u012d\14\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\61\1\u012e\2\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\u0131\4\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0132\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0133\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\15\61\1\u0134\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0135\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0136\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0139\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u013a\21\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\2\61\1\u013c\7\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\4\61\1\u013d\5\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u013e\27\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u013f\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0140\13\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0141\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0143\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0144\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0146\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u0148\3\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u014a\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u014c\10\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u014e\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0152\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\15\61\1\u0153\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0154\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0155\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0156\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0157\15\61",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0158\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0159\23\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u015a\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\1\u015c\3\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u015e\17\61",
            "\1\53\12\61\1\u015f\2\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0160\14\61",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\15\61\1\u0165\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0166\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0167\10\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0168\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0169\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u016a\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u016b\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u016c\7\61",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u016f\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0170\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\1\u0171\31\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0172\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0174\6\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0175\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0177\15\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0178\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0179\14\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u017a\7\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u017b\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u017d\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u017e\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u017f\1\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0180\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0181\10\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0182\7\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0183\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0185\31\61",
            "\1\u0186\6\uffff\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0187\12\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u0188\31\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u0189\27\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\1\u018a\31\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u018b\27\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u018c\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u018d\27\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u018e\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0190\25\61",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\53\12\61\3\uffff\1\62\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | SetParameter | ParameterAny | Ros_system | GraphName | Float32_1 | Float64_1 | Reconfigs | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Import | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Array | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | RightParenthesis | Comma | Colon | Semicolon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_39 = input.LA(1);

                        s = -1;
                        if ( (LA32_39=='\\') ) {s = 107;}

                        else if ( ((LA32_39>='\u0000' && LA32_39<='!')||(LA32_39>='#' && LA32_39<='[')||(LA32_39>=']' && LA32_39<='\uFFFF')) ) {s = 108;}

                        else if ( (LA32_39=='\"') ) {s = 109;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_107 = input.LA(1);

                        s = -1;
                        if ( ((LA32_107>='\u0000' && LA32_107<='\uFFFF')) ) {s = 162;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_110 = input.LA(1);

                        s = -1;
                        if ( ((LA32_110>='\u0000' && LA32_110<='\uFFFF')) ) {s = 164;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_162 = input.LA(1);

                        s = -1;
                        if ( (LA32_162=='\"') ) {s = 109;}

                        else if ( (LA32_162=='\\') ) {s = 107;}

                        else if ( ((LA32_162>='\u0000' && LA32_162<='!')||(LA32_162>='#' && LA32_162<='[')||(LA32_162>=']' && LA32_162<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_108 = input.LA(1);

                        s = -1;
                        if ( (LA32_108=='\"') ) {s = 109;}

                        else if ( (LA32_108=='\\') ) {s = 107;}

                        else if ( ((LA32_108>='\u0000' && LA32_108<='!')||(LA32_108>='#' && LA32_108<='[')||(LA32_108>=']' && LA32_108<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_40 = input.LA(1);

                        s = -1;
                        if ( (LA32_40=='\\') ) {s = 110;}

                        else if ( ((LA32_40>='\u0000' && LA32_40<='&')||(LA32_40>='(' && LA32_40<='[')||(LA32_40>=']' && LA32_40<='\uFFFF')) ) {s = 111;}

                        else if ( (LA32_40=='\'') ) {s = 112;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_164 = input.LA(1);

                        s = -1;
                        if ( (LA32_164=='\'') ) {s = 112;}

                        else if ( (LA32_164=='\\') ) {s = 110;}

                        else if ( ((LA32_164>='\u0000' && LA32_164<='&')||(LA32_164>='(' && LA32_164<='[')||(LA32_164>=']' && LA32_164<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_111 = input.LA(1);

                        s = -1;
                        if ( (LA32_111=='\'') ) {s = 112;}

                        else if ( (LA32_111=='\\') ) {s = 110;}

                        else if ( ((LA32_111>='\u0000' && LA32_111<='&')||(LA32_111>='(' && LA32_111<='[')||(LA32_111>=']' && LA32_111<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='R') ) {s = 1;}

                        else if ( (LA32_0=='P') ) {s = 2;}

                        else if ( (LA32_0=='G') ) {s = 3;}

                        else if ( (LA32_0=='S') ) {s = 4;}

                        else if ( (LA32_0=='r') ) {s = 5;}

                        else if ( (LA32_0=='f') ) {s = 6;}

                        else if ( (LA32_0=='d') ) {s = 7;}

                        else if ( (LA32_0=='s') ) {s = 8;}

                        else if ( (LA32_0=='u') ) {s = 9;}

                        else if ( (LA32_0=='B') ) {s = 10;}

                        else if ( (LA32_0=='I') ) {s = 11;}

                        else if ( (LA32_0=='i') ) {s = 12;}

                        else if ( (LA32_0=='m') ) {s = 13;}

                        else if ( (LA32_0=='D') ) {s = 14;}

                        else if ( (LA32_0=='H') ) {s = 15;}

                        else if ( (LA32_0=='a') ) {s = 16;}

                        else if ( (LA32_0=='b') ) {s = 17;}

                        else if ( (LA32_0=='c') ) {s = 18;}

                        else if ( (LA32_0=='v') ) {s = 19;}

                        else if ( (LA32_0=='A') ) {s = 20;}

                        else if ( (LA32_0=='t') ) {s = 21;}

                        else if ( (LA32_0=='L') ) {s = 22;}

                        else if ( (LA32_0=='g') ) {s = 23;}

                        else if ( (LA32_0=='n') ) {s = 24;}

                        else if ( (LA32_0=='[') ) {s = 25;}

                        else if ( (LA32_0==')') ) {s = 26;}

                        else if ( (LA32_0==',') ) {s = 27;}

                        else if ( (LA32_0==':') ) {s = 28;}

                        else if ( (LA32_0==';') ) {s = 29;}

                        else if ( (LA32_0==']') ) {s = 30;}

                        else if ( (LA32_0=='0') ) {s = 31;}

                        else if ( ((LA32_0>='1' && LA32_0<='2')) ) {s = 32;}

                        else if ( (LA32_0=='.') ) {s = 33;}

                        else if ( (LA32_0=='E'||LA32_0=='e') ) {s = 34;}

                        else if ( (LA32_0=='-') ) {s = 35;}

                        else if ( ((LA32_0>='3' && LA32_0<='9')) ) {s = 36;}

                        else if ( (LA32_0=='^') ) {s = 37;}

                        else if ( (LA32_0=='C'||LA32_0=='F'||(LA32_0>='J' && LA32_0<='K')||(LA32_0>='M' && LA32_0<='O')||LA32_0=='Q'||(LA32_0>='T' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='l')||(LA32_0>='o' && LA32_0<='q')||(LA32_0>='w' && LA32_0<='z')) ) {s = 38;}

                        else if ( (LA32_0=='\"') ) {s = 39;}

                        else if ( (LA32_0=='\'') ) {s = 40;}

                        else if ( (LA32_0=='#') ) {s = 41;}

                        else if ( (LA32_0=='/') ) {s = 42;}

                        else if ( (LA32_0=='~') ) {s = 44;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 45;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||(LA32_0>='$' && LA32_0<='&')||LA32_0=='('||(LA32_0>='*' && LA32_0<='+')||(LA32_0>='<' && LA32_0<='@')||LA32_0=='\\'||LA32_0=='`'||(LA32_0>='{' && LA32_0<='}')||(LA32_0>='\u007F' && LA32_0<='\uFFFF')) ) {s = 46;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}