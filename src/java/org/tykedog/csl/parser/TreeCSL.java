// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g 2010-06-10 17:54:13

package org.tykedog.csl.parser;
import org.tykedog.csl.interpreter.expression.*;
import org.tykedog.csl.interpreter.statement.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TreeCSL extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "VAR", "PARAM", "INVOKE", "LANGUAGE", "ID", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'def'", "'{'", "'}'", "'('", "','", "')'", "'if'", "'elif'", "'else'", "'while'", "'break'", "';'", "'continue'", "'return'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'~='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'$'", "'null'", "'true'", "'false'", "'for'", "'+='", "'-='", "'*='", "'/='", "'%='", "'>='", "'<='"
    };
    public static final int T__68=68;
    public static final int FUNCTION=4;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int PARAM=6;
    public static final int T__61=61;
    public static final int ID=9;
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
    public static final int VAR=5;
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
    public static final int T__33=33;
    public static final int LANGUAGE=8;
    public static final int WS=24;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int NEWLINE=23;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=20;
    public static final int FloatingPointLiteral=11;
    public static final int IntegerLiteral=10;
    public static final int INVOKE=7;
    public static final int EscapeSequence=18;
    public static final int OctalEscape=21;
    public static final int Letter=22;

    // delegates
    // delegators


        public TreeCSL(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TreeCSL(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TreeCSL.tokenNames; }
    public String getGrammarFileName() { return "D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g"; }



    // $ANTLR start "language"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:15:1: language : ^( LANGUAGE ( function )* ) ;
    public final void language() throws RecognitionException {
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:15:10: ( ^( LANGUAGE ( function )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:15:12: ^( LANGUAGE ( function )* )
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language43); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:15:23: ( function )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==FUNCTION) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:15:23: function
                	    {
                	    pushFollow(FOLLOW_function_in_language45);
                	    function();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

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
    // $ANTLR end "language"


    // $ANTLR start "function"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:1: function : ^( FUNCTION ID ^( PARAM ( ^( VAR ID ) )* ) ( statement )* ) ;
    public final void function() throws RecognitionException {
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:9: ( ^( FUNCTION ID ^( PARAM ( ^( VAR ID ) )* ) ( statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:11: ^( FUNCTION ID ^( PARAM ( ^( VAR ID ) )* ) ( statement )* )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function55); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_function57); 
            match(input,PARAM,FOLLOW_PARAM_in_function60); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:33: ( ^( VAR ID ) )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==VAR) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:34: ^( VAR ID )
                	    {
                	    match(input,VAR,FOLLOW_VAR_in_function64); 

                	    match(input, Token.DOWN, null); 
                	    match(input,ID,FOLLOW_ID_in_function66); 

                	    match(input, Token.UP, null); 

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:47: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR||LA3_0==INVOKE||(LA3_0>=IntegerLiteral && LA3_0<=StringLiteral)||LA3_0==28||LA3_0==33||(LA3_0>=36 && LA3_0<=37)||(LA3_0>=39 && LA3_0<=41)||(LA3_0>=44 && LA3_0<=58)||(LA3_0>=60 && LA3_0<=70)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:47: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function72);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); 

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
    // $ANTLR end "function"


    // $ANTLR start "statement"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:19:1: statement returns [Statement stat] : ( ^( '{' (s= statement )* ) | ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? ) | ^( 'for' expression expression statement ) | ^( 'while' expression statement ) | 'return' | 'break' | 'continue' | expression );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Statement s = null;


        List<Statement> sl = new ArrayList<Statement>();
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:21:2: ( ^( '{' (s= statement )* ) | ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? ) | ^( 'for' expression expression statement ) | ^( 'while' expression statement ) | 'return' | 'break' | 'continue' | expression )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 40:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            case 39:
                {
                alt7=7;
                }
                break;
            case VAR:
            case INVOKE:
            case IntegerLiteral:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case 41:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:5: ^( '{' (s= statement )* )
                    {
                    match(input,28,FOLLOW_28_in_statement97); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:11: (s= statement )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==VAR||LA4_0==INVOKE||(LA4_0>=IntegerLiteral && LA4_0<=StringLiteral)||LA4_0==28||LA4_0==33||(LA4_0>=36 && LA4_0<=37)||(LA4_0>=39 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=58)||(LA4_0>=60 && LA4_0<=70)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:12: s= statement
                        	    {
                        	    pushFollow(FOLLOW_statement_in_statement102);
                        	    s=statement();

                        	    state._fsp--;

                        	    sl.add(s);

                        	    }
                        	    break;

                        	default :
                        	    break loop4;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                           BlockStatement block = new BlockStatement();
                             
                        

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:6: ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? )
                    {
                    match(input,33,FOLLOW_33_in_statement126); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement128);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement130);
                    statement();

                    state._fsp--;

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:34: ( ^( 'elif' expression statement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:35: ^( 'elif' expression statement )
                    	    {
                    	    match(input,34,FOLLOW_34_in_statement134); 

                    	    match(input, Token.DOWN, null); 
                    	    pushFollow(FOLLOW_expression_in_statement136);
                    	    expression();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_statement_in_statement138);
                    	    statement();

                    	    state._fsp--;


                    	    match(input, Token.UP, null); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:68: ( ^( 'else' statement ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:69: ^( 'else' statement )
                            {
                            match(input,35,FOLLOW_35_in_statement145); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_statement_in_statement147);
                            statement();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:29:6: ^( 'for' expression expression statement )
                    {
                    match(input,63,FOLLOW_63_in_statement160); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement162);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_statement164);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement166);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:30:7: ^( 'while' expression statement )
                    {
                    match(input,36,FOLLOW_36_in_statement176); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement178);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement180);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:31:7: 'return'
                    {
                    match(input,40,FOLLOW_40_in_statement190); 

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:32:7: 'break'
                    {
                    match(input,37,FOLLOW_37_in_statement198); 

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:33:7: 'continue'
                    {
                    match(input,39,FOLLOW_39_in_statement206); 

                    }
                    break;
                case 8 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:34:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement214);
                    expression();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "statement"


    // $ANTLR start "expression"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:38:1: expression returns [Expression expr] : ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' expression ) | ^( '++' expression ) | ^( '--' expression ) | ^( VAR ID ) | ^( INVOKE ID ( expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | 'true' | 'false' | 'null' );
    public final Expression expression() throws RecognitionException {
        Expression expr = null;

        Expression opra = null;

        Expression oprb = null;


        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:39:2: ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' expression ) | ^( '++' expression ) | ^( '--' expression ) | ^( VAR ID ) | ^( INVOKE ID ( expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | 'true' | 'false' | 'null' )
            int alt9=32;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 64:
                {
                alt9=2;
                }
                break;
            case 65:
                {
                alt9=3;
                }
                break;
            case 66:
                {
                alt9=4;
                }
                break;
            case 67:
                {
                alt9=5;
                }
                break;
            case 68:
                {
                alt9=6;
                }
                break;
            case 44:
                {
                alt9=7;
                }
                break;
            case 45:
                {
                alt9=8;
                }
                break;
            case 51:
                {
                alt9=9;
                }
                break;
            case 52:
                {
                alt9=10;
                }
                break;
            case 53:
                {
                alt9=11;
                }
                break;
            case 54:
                {
                alt9=12;
                }
                break;
            case 55:
                {
                alt9=13;
                }
                break;
            case 46:
                {
                alt9=14;
                }
                break;
            case 48:
                {
                alt9=15;
                }
                break;
            case 47:
                {
                alt9=16;
                }
                break;
            case 69:
                {
                alt9=17;
                }
                break;
            case 70:
                {
                alt9=18;
                }
                break;
            case 49:
                {
                alt9=19;
                }
                break;
            case 50:
                {
                alt9=20;
                }
                break;
            case 58:
                {
                alt9=21;
                }
                break;
            case 56:
                {
                alt9=22;
                }
                break;
            case 57:
                {
                alt9=23;
                }
                break;
            case VAR:
                {
                alt9=24;
                }
                break;
            case INVOKE:
                {
                alt9=25;
                }
                break;
            case IntegerLiteral:
                {
                alt9=26;
                }
                break;
            case FloatingPointLiteral:
                {
                alt9=27;
                }
                break;
            case CharacterLiteral:
                {
                alt9=28;
                }
                break;
            case StringLiteral:
                {
                alt9=29;
                }
                break;
            case 61:
                {
                alt9=30;
                }
                break;
            case 62:
                {
                alt9=31;
                }
                break;
            case 60:
                {
                alt9=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:40:2: ^( '=' opra= expression oprb= expression )
                    {
                    match(input,41,FOLLOW_41_in_expression233); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression237);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression241);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new AssignExpression(opra, oprb);
                    	

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:44:3: ^( '+=' opra= expression oprb= expression )
                    {
                    match(input,64,FOLLOW_64_in_expression250); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression254);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression258);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:47:3: ^( '-=' opra= expression oprb= expression )
                    {
                    match(input,65,FOLLOW_65_in_expression267); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression271);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression275);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:48:3: ^( '*=' opra= expression oprb= expression )
                    {
                    match(input,66,FOLLOW_66_in_expression281); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression285);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression289);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:49:3: ^( '/=' opra= expression oprb= expression )
                    {
                    match(input,67,FOLLOW_67_in_expression295); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression299);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression303);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:50:3: ^( '%=' opra= expression oprb= expression )
                    {
                    match(input,68,FOLLOW_68_in_expression309); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression313);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression317);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:51:3: ^( '||' opra= expression oprb= expression )
                    {
                    match(input,44,FOLLOW_44_in_expression323); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression327);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression331);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:52:3: ^( '&&' opra= expression oprb= expression )
                    {
                    match(input,45,FOLLOW_45_in_expression337); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression341);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression345);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:53:3: ^( '+' opra= expression oprb= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression351); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression355);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression359);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:54:3: ^( '-' opra= expression oprb= expression )
                    {
                    match(input,52,FOLLOW_52_in_expression365); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression369);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression373);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:55:3: ^( '*' opra= expression oprb= expression )
                    {
                    match(input,53,FOLLOW_53_in_expression379); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression383);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression387);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:56:3: ^( '/' opra= expression oprb= expression )
                    {
                    match(input,54,FOLLOW_54_in_expression393); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression397);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression401);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:57:3: ^( '%' opra= expression oprb= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression407); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression411);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression415);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:58:3: ^( '==' opra= expression oprb= expression )
                    {
                    match(input,46,FOLLOW_46_in_expression421); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression425);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression429);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:59:3: ^( '~=' opra= expression oprb= expression )
                    {
                    match(input,48,FOLLOW_48_in_expression435); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression439);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression443);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:60:3: ^( '!=' opra= expression oprb= expression )
                    {
                    match(input,47,FOLLOW_47_in_expression449); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression453);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression457);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:61:3: ^( '>=' opra= expression oprb= expression )
                    {
                    match(input,69,FOLLOW_69_in_expression463); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression467);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression471);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:62:3: ^( '<=' opra= expression oprb= expression )
                    {
                    match(input,70,FOLLOW_70_in_expression477); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression481);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression485);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:63:3: ^( '<' opra= expression oprb= expression )
                    {
                    match(input,49,FOLLOW_49_in_expression491); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression495);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression499);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:64:3: ^( '>' opra= expression oprb= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression505); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression509);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression513);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:65:3: ^( '!' expression )
                    {
                    match(input,58,FOLLOW_58_in_expression519); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression521);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:66:3: ^( '++' expression )
                    {
                    match(input,56,FOLLOW_56_in_expression527); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression529);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:67:3: ^( '--' expression )
                    {
                    match(input,57,FOLLOW_57_in_expression536); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression538);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 24 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:68:3: ^( VAR ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expression545); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_expression547); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 25 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:69:3: ^( INVOKE ID ( expression )* )
                    {
                    match(input,INVOKE,FOLLOW_INVOKE_in_expression553); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_expression555); 
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:69:15: ( expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==VAR||LA8_0==INVOKE||(LA8_0>=IntegerLiteral && LA8_0<=StringLiteral)||LA8_0==41||(LA8_0>=44 && LA8_0<=58)||(LA8_0>=60 && LA8_0<=62)||(LA8_0>=64 && LA8_0<=70)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:69:15: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression557);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 26 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:70:3: IntegerLiteral
                    {
                    match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expression563); 

                    }
                    break;
                case 27 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:71:10: FloatingPointLiteral
                    {
                    match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_expression574); 

                    }
                    break;
                case 28 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:72:10: CharacterLiteral
                    {
                    match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_expression585); 

                    }
                    break;
                case 29 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:73:10: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_expression596); 

                    }
                    break;
                case 30 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:74:10: 'true'
                    {
                    match(input,61,FOLLOW_61_in_expression607); 

                    }
                    break;
                case 31 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:75:10: 'false'
                    {
                    match(input,62,FOLLOW_62_in_expression618); 

                    }
                    break;
                case 32 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:76:10: 'null'
                    {
                    match(input,60,FOLLOW_60_in_expression629); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_LANGUAGE_in_language43 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_in_language45 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_FUNCTION_in_function55 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function57 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_PARAM_in_function60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_function64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function66 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_function72 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_28_in_statement97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement102 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_33_in_statement126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement128 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_statement_in_statement130 = new BitSet(new long[]{0x0000000C00000008L});
    public static final BitSet FOLLOW_34_in_statement134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement136 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_statement_in_statement138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_statement145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_statement160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement162 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_statement164 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_statement_in_statement166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement178 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_statement_in_statement180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expression233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression237 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression254 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression271 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression285 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression299 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression313 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expression323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression327 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expression337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression341 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression355 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression369 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expression379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression383 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression397 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression411 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression425 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression439 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expression449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression453 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_69_in_expression463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression467 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_70_in_expression477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression481 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expression491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression495 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression509 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expression545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_expression553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression555 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_expression557 = new BitSet(new long[]{0xF7FFF3B210003CA8L,0x000000000000007FL});
    public static final BitSet FOLLOW_IntegerLiteral_in_expression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_expression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_expression585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_expression596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_expression618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression629 = new BitSet(new long[]{0x0000000000000002L});

}