// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g 2010-06-10 20:14:44
package org.tykedog.csl.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CSLLexer extends Lexer {
    public static final int FUNCTION=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int PARAM=5;
    public static final int ID=8;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int HexDigit=17;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int VAR=9;
    public static final int COMMENT=25;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int HexLiteral=14;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DecimalLiteral=16;
    public static final int StringLiteral=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int LANGUAGE=7;
    public static final int T__33=33;
    public static final int WS=24;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=23;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=20;
    public static final int FloatingPointLiteral=11;
    public static final int IntegerLiteral=10;
    public static final int INVOKE=6;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:5:7: ( 'def' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:5:9: 'def'
            {
            match("def"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:6:7: ( '{' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:6:9: '{'
            {
            match('{'); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:7:7: ( '}' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:7:9: '}'
            {
            match('}'); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:8:7: ( '(' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:8:9: '('
            {
            match('('); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:9:7: ( ',' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:9:9: ','
            {
            match(','); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:10:7: ( ')' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:10:9: ')'
            {
            match(')'); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:11:7: ( 'if' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:11:9: 'if'
            {
            match("if"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:12:7: ( 'elif' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:12:9: 'elif'
            {
            match("elif"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:13:7: ( 'else' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:13:9: 'else'
            {
            match("else"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:14:7: ( 'while' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:14:9: 'while'
            {
            match("while"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:15:7: ( 'break' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:15:9: 'break'
            {
            match("break"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:16:7: ( ';' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:16:9: ';'
            {
            match(';'); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:7: ( 'continue' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:9: 'continue'
            {
            match("continue"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:18:7: ( 'return' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:18:9: 'return'
            {
            match("return"); 


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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:7: ( '=' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:9: '='
            {
            match('='); 

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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:20:7: ( '?' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:20:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:7: ( ':' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:7: ( '||' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:7: ( '&&' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:24:7: ( '==' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:24:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:25:7: ( '!=' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:25:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:26:7: ( '~=' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:26:9: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:27:7: ( '<' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:7: ( '>' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:7: ( '+' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:30:7: ( '-' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:31:7: ( '*' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:7: ( '/' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:7: ( '%' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:7: ( '++' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:7: ( '--' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:36:7: ( '!' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:36:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:7: ( 'null' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:7: ( 'true' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:39:7: ( 'false' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:39:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:101:5: ( '$' ID )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:101:7: '$' ID
            {
            match('$'); 
            mID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:115:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt1=1;
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
                    alt1=2;
                    }
                    break;
                default:
                    alt1=3;}

            }
            else if ( ((LA1_0>='1' && LA1_0<='9')) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:115:9: HexLiteral
                    {
                    mHexLiteral(); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:116:9: OctalLiteral
                    {
                    mOctalLiteral(); 

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:117:9: DecimalLiteral
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:126:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:126:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:126:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:130:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:130:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( 'l' | 'L' )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:130:28: ( HexDigit )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:130:28: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:130:39: ( 'l' | 'L' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L'||LA4_0=='l') ) {
                alt4=1;
            }
            switch (alt4) {
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( 'l' | 'L' )?
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:34: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:132:46: ( 'l' | 'L' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:14: ( '0' ( '0' .. '7' )+ ( 'l' | 'L' )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:16: '0' ( '0' .. '7' )+ ( 'l' | 'L' )?
            {
            match('0'); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:20: ( '0' .. '7' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:134:33: ( 'l' | 'L' )?
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
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "CharacterLiteral"
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:137:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:137:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:137:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:137:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:137:33: ~ ( '\\'' | '\\\\' )
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('.'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:25: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:37: ( Exponent )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:141:48: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                        alt14=1;
                    }
                    switch (alt14) {
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:9: '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    match('.'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:25: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:142:36: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:9: ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )?
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:21: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:143:32: ( 'f' | 'F' | 'd' | 'D' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:147:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:147:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:147:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:147:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:147:31: ~ ( '\\\\' | '\"' )
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
            	    break loop22;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:151:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:151:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:151:22: ( '+' | '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+'||LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
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

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:151:33: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:151:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:155:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\\') ) {
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
                    alt25=1;
                    }
                    break;
                case 'u':
                    {
                    alt25=2;
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
                    alt25=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:155:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:156:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:157:9: OctalEscape
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>='0' && LA26_1<='3')) ) {
                    int LA26_2 = input.LA(3);

                    if ( ((LA26_2>='0' && LA26_2<='7')) ) {
                        int LA26_4 = input.LA(4);

                        if ( ((LA26_4>='0' && LA26_4<='7')) ) {
                            alt26=1;
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        alt26=3;}
                }
                else if ( ((LA26_1>='4' && LA26_1<='7')) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>='0' && LA26_3<='7')) ) {
                        alt26=2;
                    }
                    else {
                        alt26=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:14: ( '0' .. '3' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:25: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:36: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:162:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:163:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:163:14: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:163:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:163:25: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:163:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:164:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:164:14: ( '0' .. '7' )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:164:15: '0' .. '7'
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:169:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:169:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:173:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:173:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:177:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\n'||(LA29_0>='\f' && LA29_0<='\r')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:10: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:10: ( '\\u000C' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0=='\f') ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:11: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }

            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:21: ( '\\r' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0=='\r') ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:193:22: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:196:5: ( ( ' ' | '\\t' | '\\u000C' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:196:9: ( ' ' | '\\t' | '\\u000C' )
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:201:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:201:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:201:14: ( options {greedy=false; } : . )*
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
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:201:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:5: ( ( '//' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:7: ( '//' | '#' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:7: ( '//' | '#' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='/') ) {
                alt31=1;
            }
            else if ( (LA31_0=='#') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:8: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:13: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:18: (~ ( '\\n' | '\\r' ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:18: ~ ( '\\n' | '\\r' )
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
            	    break loop32;
                }
            } while (true);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:32: ( '\\r' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:205:32: '\\r'
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
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | VAR | IntegerLiteral | ID | CharacterLiteral | FloatingPointLiteral | StringLiteral | NEWLINE | WS | COMMENT | LINE_COMMENT )
        int alt34=45;
        alt34 = dfa34.predict(input);
        switch (alt34) {
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
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:172: T__54
                {
                mT__54(); 

                }
                break;
            case 29 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:178: T__55
                {
                mT__55(); 

                }
                break;
            case 30 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:184: T__56
                {
                mT__56(); 

                }
                break;
            case 31 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:190: T__57
                {
                mT__57(); 

                }
                break;
            case 32 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:196: T__58
                {
                mT__58(); 

                }
                break;
            case 33 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:202: T__59
                {
                mT__59(); 

                }
                break;
            case 34 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:208: T__60
                {
                mT__60(); 

                }
                break;
            case 35 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:214: T__61
                {
                mT__61(); 

                }
                break;
            case 36 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:220: VAR
                {
                mVAR(); 

                }
                break;
            case 37 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:224: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 38 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:239: ID
                {
                mID(); 

                }
                break;
            case 39 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:242: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 40 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:259: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 41 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:280: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 42 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:294: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 43 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:302: WS
                {
                mWS(); 

                }
                break;
            case 44 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:305: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 45 :
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:1:313: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA21_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA21_eofS =
        "\5\uffff";
    static final String DFA21_minS =
        "\2\56\3\uffff";
    static final String DFA21_maxS =
        "\2\71\3\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "140:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( Exponent )? ( 'f' | 'F' | 'd' | 'D' )? );";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\1\42\5\uffff\4\42\1\uffff\2\42\1\62\4\uffff\1\64\3\uffff"+
        "\1\66\1\70\1\uffff\1\72\1\uffff\3\42\1\uffff\2\76\4\uffff\1\50\3"+
        "\uffff\1\42\1\102\5\42\12\uffff\3\42\1\uffff\2\76\1\114\1\uffff"+
        "\11\42\1\uffff\1\126\1\127\4\42\1\134\1\135\1\42\2\uffff\1\137\1"+
        "\140\2\42\2\uffff\1\143\2\uffff\1\42\1\145\1\uffff\1\42\1\uffff"+
        "\1\147\1\uffff";
    static final String DFA34_eofS =
        "\150\uffff";
    static final String DFA34_minS =
        "\1\11\1\145\5\uffff\1\146\1\154\1\150\1\162\1\uffff\1\157\1\145"+
        "\1\75\4\uffff\1\75\3\uffff\1\53\1\55\1\uffff\1\52\1\uffff\1\165"+
        "\1\162\1\141\1\uffff\2\56\4\uffff\1\12\3\uffff\1\146\1\60\2\151"+
        "\1\145\1\156\1\164\12\uffff\1\154\1\165\1\154\1\uffff\2\56\1\60"+
        "\1\uffff\1\146\1\145\1\154\1\141\1\164\1\165\1\154\1\145\1\163\1"+
        "\uffff\2\60\1\145\1\153\1\151\1\162\2\60\1\145\2\uffff\2\60\2\156"+
        "\2\uffff\1\60\2\uffff\1\165\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA34_maxS =
        "\1\176\1\145\5\uffff\1\146\1\154\1\150\1\162\1\uffff\1\157\1\145"+
        "\1\75\4\uffff\1\75\3\uffff\1\53\1\55\1\uffff\1\57\1\uffff\1\165"+
        "\1\162\1\141\1\uffff\2\146\4\uffff\1\15\3\uffff\1\146\1\172\1\163"+
        "\1\151\1\145\1\156\1\164\12\uffff\1\154\1\165\1\154\1\uffff\2\146"+
        "\1\172\1\uffff\1\146\1\145\1\154\1\141\1\164\1\165\1\154\1\145\1"+
        "\163\1\uffff\2\172\1\145\1\153\1\151\1\162\2\172\1\145\2\uffff\2"+
        "\172\2\156\2\uffff\1\172\2\uffff\1\165\1\172\1\uffff\1\145\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff\1\14\3\uffff\1\20\1\21\1\22"+
        "\1\23\1\uffff\1\26\1\27\1\30\2\uffff\1\33\1\uffff\1\35\3\uffff\1"+
        "\44\2\uffff\1\46\1\47\1\50\1\51\1\uffff\1\52\1\53\1\55\7\uffff\1"+
        "\24\1\17\1\25\1\40\1\36\1\31\1\37\1\32\1\54\1\34\3\uffff\1\45\3"+
        "\uffff\1\7\11\uffff\1\1\11\uffff\1\10\1\11\4\uffff\1\41\1\42\1\uffff"+
        "\1\12\1\13\2\uffff\1\43\1\uffff\1\16\1\uffff\1\15";
    static final String DFA34_specialS =
        "\150\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\50\1\47\1\uffff\1\46\1\47\22\uffff\1\50\1\23\1\45\1\51\1"+
            "\37\1\33\1\22\1\43\1\4\1\6\1\31\1\27\1\5\1\30\1\44\1\32\1\40"+
            "\11\41\1\20\1\13\1\25\1\16\1\26\1\17\1\uffff\32\42\4\uffff\1"+
            "\42\1\uffff\1\42\1\12\1\14\1\1\1\10\1\36\2\42\1\7\4\42\1\34"+
            "\3\42\1\15\1\42\1\35\2\42\1\11\3\42\1\2\1\21\1\3\1\24",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "\1\65",
            "\1\67",
            "",
            "\1\71\4\uffff\1\51",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\44\1\uffff\10\77\2\44\12\uffff\3\44\35\uffff\3\44",
            "\1\44\1\uffff\12\100\12\uffff\3\44\35\uffff\3\44",
            "",
            "",
            "",
            "",
            "\1\47\2\uffff\1\47",
            "",
            "",
            "",
            "\1\101",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\103\11\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
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
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\44\1\uffff\10\77\2\44\12\uffff\3\44\35\uffff\3\44",
            "\1\44\1\uffff\12\100\12\uffff\3\44\35\uffff\3\44",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\136",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\141",
            "\1\142",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\144",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\146",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | VAR | IntegerLiteral | ID | CharacterLiteral | FloatingPointLiteral | StringLiteral | NEWLINE | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}