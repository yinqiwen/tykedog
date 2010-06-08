// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g 2010-06-08 20:51:52
package org.tykedog.csl.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CSLLexer extends Lexer {
    public static final int T__42=42;
    public static final int HexLiteral=14;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int LINE_COMMENT=26;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int LogicJoinOperator=8;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int DecimalLiteral=16;
    public static final int HexDigit=17;
    public static final int StringLiteral=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int LANGUAGE=6;
    public static final int WS=24;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=23;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int EVAL=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=20;
    public static final int FloatingPointLiteral=11;
    public static final int VAR=5;
    public static final int IntegerLiteral=10;
    public static final int COMMENT=25;
    public static final int LogicCompareOperator=9;
    public static final int EscapeSequence=18;
    public static final int OctalEscape=21;
    public static final int Letter=22;

    // delegates
    // delegators

    public CSLLexer() {;} 
    public CSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:5:7: ( 'if' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:5:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:6:7: ( 'elif' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:6:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:7:7: ( 'else' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:7:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:8:7: ( 'while' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:8:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:9:7: ( ';' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:10:7: ( '{' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:10:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:11:7: ( '}' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:11:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:12:7: ( '=' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:13:7: ( '(' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:14:7: ( ')' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:15:7: ( '$' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:15:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:16:7: ( '[' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:7: ( ']' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:18:7: ( 'null' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:18:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:7: ( 'true' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:20:7: ( 'false' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:20:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "LogicCompareOperator"
    public final void mLogicCompareOperator() throws RecognitionException {
        try {
            int _type = LogicCompareOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:2: ( ( '==' | '!=' | '~=' | '>' | '<' | '>=' | '<=' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:4: ( '==' | '!=' | '~=' | '>' | '<' | '>=' | '<=' )
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:4: ( '==' | '!=' | '~=' | '>' | '<' | '>=' | '<=' )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:5: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:12: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:19: '~='
                    {
                    match("~="); 


                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:32: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:38: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:59:45: '<='
                    {
                    match("<="); 


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
    // $ANTLR end "LogicCompareOperator"

    // $ANTLR start "LogicJoinOperator"
    public final void mLogicJoinOperator() throws RecognitionException {
        try {
            int _type = LogicJoinOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:62:2: ( '&&' | '||' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='&') ) {
                alt2=1;
            }
            else if ( (LA2_0=='|') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:62:4: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:62:9: '||'
                    {
                    match("||"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LogicJoinOperator"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:79:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt3=1;
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
                    {
                    alt3=2;
                    }
                    break;
                default:
                    alt3=3;}

            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:79:9: HexLiteral
                    {
                    mHexLiteral(); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:80:9: OctalLiteral
                    {
                    mOctalLiteral(); 

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:81:9: DecimalLiteral
                    {
                    mDecimalLiteral(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:91:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:91:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:91:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:95:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:95:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( 'l' | 'L' )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:95:28: ( HexDigit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:95:28: HexDigit
            	    {
            	    mHexDigit(); 

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

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:95:39: ( 'l' | 'L' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='L'||LA6_0=='l') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'l' | 'L' )?
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:34: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:46: ( 'l' | 'L' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='l') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "OctalLiteral"
    public final void mOctalLiteral() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:99:14: ( '0' ( '0' .. '7' )+ ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:99:16: '0' ( '0' .. '7' )+ ( 'l' | 'L' )?
            {
            match('0'); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:99:20: ( '0' .. '7' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:99:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

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

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:99:33: ( 'l' | 'L' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='l') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "CharacterLiteral"
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:102:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:102:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:102:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                alt12=1;
            }
            else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:102:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:102:33: ~ ( '\\'' | '\\\\' )
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

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CharacterLiteral"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    match('.'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:25: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:37: ( Exponent )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:48: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:9: '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    match('.'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:13: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:25: ( Exponent )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:36: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='D'||LA19_0=='F'||LA19_0=='d'||LA19_0=='f') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:9: ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:9: ( '0' .. '9' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:21: ( Exponent )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:32: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='d'||LA22_0=='f') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:112:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:112:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:112:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:112:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:112:31: ~ ( '\\\\' | '\"' )
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
            	    break loop24;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:22: ( '+' | '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
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

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:33: ( '0' .. '9' )+
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
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:34: '0' .. '9'
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
    // $ANTLR end "Exponent"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:120:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt27=1;
                    }
                    break;
                case 'u':
                    {
                    alt27=2;
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
                    {
                    alt27=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:120:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:121:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:122:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>='0' && LA28_1<='3')) ) {
                    int LA28_2 = input.LA(3);

                    if ( ((LA28_2>='0' && LA28_2<='7')) ) {
                        int LA28_4 = input.LA(4);

                        if ( ((LA28_4>='0' && LA28_4<='7')) ) {
                            alt28=1;
                        }
                        else {
                            alt28=2;}
                    }
                    else {
                        alt28=3;}
                }
                else if ( ((LA28_1>='4' && LA28_1<='7')) ) {
                    int LA28_3 = input.LA(3);

                    if ( ((LA28_3>='0' && LA28_3<='7')) ) {
                        alt28=2;
                    }
                    else {
                        alt28=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:14: ( '0' .. '3' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:25: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:36: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:127:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:128:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:128:14: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:128:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:128:25: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:128:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:129:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:129:14: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:129:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:138:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:138:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\n'||(LA31_0>='\f' && LA31_0<='\r')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:10: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:10: ( '\\u000C' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0=='\f') ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:11: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }

            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:21: ( '\\r' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0=='\r') ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:158:22: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:161:5: ( ( ' ' | '\\t' | '\\u000C' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:161:9: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:166:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:166:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:166:14: ( options {greedy=false; } : . )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='*') ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1=='/') ) {
                        alt32=2;
                    }
                    else if ( ((LA32_1>='\u0000' && LA32_1<='.')||(LA32_1>='0' && LA32_1<='\uFFFF')) ) {
                        alt32=1;
                    }


                }
                else if ( ((LA32_0>='\u0000' && LA32_0<=')')||(LA32_0>='+' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:166:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:5: ( ( '//' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:7: ( '//' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:7: ( '//' | '#' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='/') ) {
                alt33=1;
            }
            else if ( (LA33_0=='#') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:8: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:13: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:18: (~ ( '\\n' | '\\r' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:18: ~ ( '\\n' | '\\r' )
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
            	    break loop34;
                }
            } while (true);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:32: ( '\\r' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\r') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:170:32: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | LogicCompareOperator | LogicJoinOperator | IntegerLiteral | ID | CharacterLiteral | FloatingPointLiteral | StringLiteral | NEWLINE | WS | COMMENT | LINE_COMMENT )
        int alt36=27;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:106: LogicCompareOperator
                {
                mLogicCompareOperator(); 

                }
                break;
            case 18 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:127: LogicJoinOperator
                {
                mLogicJoinOperator(); 

                }
                break;
            case 19 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:145: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 20 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:160: ID
                {
                mID(); 

                }
                break;
            case 21 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:163: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 22 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:180: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 23 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:201: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 24 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:215: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 25 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:223: WS
                {
                mWS(); 

                }
                break;
            case 26 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:226: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 27 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:234: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA1_eotS =
        "\4\uffff\1\7\1\11\4\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\41\3\uffff\2\75\4\uffff";
    static final String DFA1_maxS =
        "\1\176\3\uffff\2\75\4\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\4\1\7\1\5";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\32\uffff\1\5\1\1\1\4\77\uffff\1\3",
            "",
            "",
            "",
            "\1\6",
            "\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "59:4: ( '==' | '!=' | '~=' | '>' | '<' | '>=' | '<=' )";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA23_eofS =
        "\5\uffff";
    static final String DFA23_minS =
        "\2\56\3\uffff";
    static final String DFA23_maxS =
        "\2\71\3\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA23_specialS =
        "\5\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "105:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? );";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\3\24\3\uffff\1\40\5\uffff\3\24\2\uffff\2\44\4\uffff\1"+
        "\32\4\uffff\1\50\2\24\1\uffff\3\24\1\uffff\2\44\2\uffff\6\24\1\65"+
        "\1\66\1\24\1\70\1\71\1\24\2\uffff\1\73\2\uffff\1\74\2\uffff";
    static final String DFA36_eofS =
        "\75\uffff";
    static final String DFA36_minS =
        "\1\11\1\146\1\154\1\150\3\uffff\1\75\5\uffff\1\165\1\162\1\141"+
        "\2\uffff\2\56\4\uffff\1\12\2\uffff\1\52\1\uffff\1\60\2\151\1\uffff"+
        "\1\154\1\165\1\154\1\uffff\2\56\2\uffff\1\146\1\145\2\154\1\145"+
        "\1\163\2\60\1\145\2\60\1\145\2\uffff\1\60\2\uffff\1\60\2\uffff";
    static final String DFA36_maxS =
        "\1\176\1\146\1\154\1\150\3\uffff\1\75\5\uffff\1\165\1\162\1\141"+
        "\2\uffff\2\146\4\uffff\1\15\2\uffff\1\57\1\uffff\1\172\1\163\1\151"+
        "\1\uffff\1\154\1\165\1\154\1\uffff\2\146\2\uffff\1\146\1\145\2\154"+
        "\1\145\1\163\2\172\1\145\2\172\1\145\2\uffff\1\172\2\uffff\1\172"+
        "\2\uffff";
    static final String DFA36_acceptS =
        "\4\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14\1\15\3\uffff\1"+
        "\21\1\22\2\uffff\1\24\1\25\1\26\1\27\1\uffff\1\30\1\31\1\uffff\1"+
        "\33\3\uffff\1\10\3\uffff\1\23\2\uffff\1\32\1\1\14\uffff\1\2\1\3"+
        "\1\uffff\1\16\1\17\1\uffff\1\4\1\20";
    static final String DFA36_specialS =
        "\75\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\32\1\31\1\uffff\1\30\1\31\22\uffff\1\32\1\20\1\27\1\34\1"+
            "\12\1\uffff\1\21\1\25\1\10\1\11\4\uffff\1\26\1\33\1\22\11\23"+
            "\1\uffff\1\4\1\20\1\7\1\20\2\uffff\32\24\1\13\1\uffff\1\14\1"+
            "\uffff\1\24\1\uffff\4\24\1\2\1\17\2\24\1\1\4\24\1\15\5\24\1"+
            "\16\2\24\1\3\3\24\1\5\1\21\1\6\1\20",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\26\1\uffff\10\45\2\26\12\uffff\3\26\35\uffff\3\26",
            "\1\26\1\uffff\12\46\12\uffff\3\26\35\uffff\3\26",
            "",
            "",
            "",
            "",
            "\1\31\2\uffff\1\31",
            "",
            "",
            "\1\47\4\uffff\1\34",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\51\11\uffff\1\52",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\26\1\uffff\10\45\2\26\12\uffff\3\26\35\uffff\3\26",
            "\1\26\1\uffff\12\46\12\uffff\3\26\35\uffff\3\26",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\67",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\72",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | LogicCompareOperator | LogicJoinOperator | IntegerLiteral | ID | CharacterLiteral | FloatingPointLiteral | StringLiteral | NEWLINE | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}