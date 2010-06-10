// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g 2010-06-10 21:45:48

package org.tykedog.csl.parser;
import org.tykedog.csl.interpreter.expression.*;
import org.tykedog.csl.interpreter.statement.*;
import org.tykedog.csl.interpreter.function.*;
import org.tykedog.csl.interpreter.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TreeCSL extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "PARAM", "INVOKE", "LANGUAGE", "ID", "VAR", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'def'", "'{'", "'}'", "'('", "','", "')'", "'if'", "'elif'", "'else'", "'while'", "'break'", "';'", "'continue'", "'return'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'~='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'null'", "'true'", "'false'", "'for'", "'+='", "'-='", "'*='", "'/='", "'%='", "'>='", "'<='"
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


        public TreeCSL(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TreeCSL(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TreeCSL.tokenNames; }
    public String getGrammarFileName() { return "F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g"; }



    // $ANTLR start "language"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:17:1: language : ^( LANGUAGE ( function )* ) ;
    public final void language() throws RecognitionException {
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:17:10: ( ^( LANGUAGE ( function )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:17:12: ^( LANGUAGE ( function )* )
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language43); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:17:23: ( function )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==FUNCTION) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:17:23: function
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:19:1: function returns [Function func] : ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) ;
    public final Function function() throws RecognitionException {
        Function func = null;

        CommonTree ID1=null;
        CommonTree VAR2=null;
        Statement s = null;


        func = new Function();
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:21:1: ( ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:22:3: ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function68); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_function70); 
            func.setName((ID1!=null?ID1.getText():null));
            match(input,PARAM,FOLLOW_PARAM_in_function74); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:22:50: ( VAR )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==VAR) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:22:51: VAR
                	    {
                	    VAR2=(CommonTree)match(input,VAR,FOLLOW_VAR_in_function77); 
                	    func.addArg((VAR2!=null?VAR2.getText():null));

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:22:84: (s= statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==INVOKE||(LA3_0>=VAR && LA3_0<=StringLiteral)||LA3_0==28||LA3_0==33||(LA3_0>=36 && LA3_0<=37)||(LA3_0>=39 && LA3_0<=41)||(LA3_0>=44 && LA3_0<=69)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:22:85: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function87);
            	    s=statement();

            	    state._fsp--;

            	    func.addStatment(s);

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
        return func;
    }
    // $ANTLR end "function"


    // $ANTLR start "statement"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:24:1: statement returns [Statement stat] : ( ^( '{' (s= statement )* ) | ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? ) | ^( 'for' expression expression statement ) | ^( 'while' expression statement ) | 'return' | 'break' | 'continue' | expression );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Statement s = null;


        List<Statement> sl = new ArrayList<Statement>();
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:26:2: ( ^( '{' (s= statement )* ) | ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? ) | ^( 'for' expression expression statement ) | ^( 'while' expression statement ) | 'return' | 'break' | 'continue' | expression )
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
            case 62:
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
            case INVOKE:
            case VAR:
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
            case 59:
            case 60:
            case 61:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:5: ^( '{' (s= statement )* )
                    {
                    match(input,28,FOLLOW_28_in_statement114); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:11: (s= statement )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==INVOKE||(LA4_0>=VAR && LA4_0<=StringLiteral)||LA4_0==28||LA4_0==33||(LA4_0>=36 && LA4_0<=37)||(LA4_0>=39 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=69)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:12: s= statement
                        	    {
                        	    pushFollow(FOLLOW_statement_in_statement119);
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

                           BlockStatement block = new BlockStatement(sl);
                        

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:32:6: ^( 'if' expression statement ( ^( 'elif' expression statement ) )* ( ^( 'else' statement ) )? )
                    {
                    match(input,33,FOLLOW_33_in_statement143); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement145);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement147);
                    statement();

                    state._fsp--;

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:32:34: ( ^( 'elif' expression statement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:32:35: ^( 'elif' expression statement )
                    	    {
                    	    match(input,34,FOLLOW_34_in_statement151); 

                    	    match(input, Token.DOWN, null); 
                    	    pushFollow(FOLLOW_expression_in_statement153);
                    	    expression();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_statement_in_statement155);
                    	    statement();

                    	    state._fsp--;


                    	    match(input, Token.UP, null); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:32:68: ( ^( 'else' statement ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:32:69: ^( 'else' statement )
                            {
                            match(input,35,FOLLOW_35_in_statement162); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_statement_in_statement164);
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:33:6: ^( 'for' expression expression statement )
                    {
                    match(input,62,FOLLOW_62_in_statement177); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement179);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_statement181);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement183);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:34:7: ^( 'while' expression statement )
                    {
                    match(input,36,FOLLOW_36_in_statement193); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement195);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement197);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:35:7: 'return'
                    {
                    match(input,40,FOLLOW_40_in_statement207); 

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:36:7: 'break'
                    {
                    match(input,37,FOLLOW_37_in_statement215); 

                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:37:7: 'continue'
                    {
                    match(input,39,FOLLOW_39_in_statement223); 

                    }
                    break;
                case 8 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:38:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement231);
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:42:1: expression returns [Expression expr] : ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' expression ) | ^( '++' expression ) | ^( '--' expression ) | ^( VAR ID ) | ^( INVOKE ID ( expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | 'true' | 'false' | 'null' );
    public final Expression expression() throws RecognitionException {
        Expression expr = null;

        CommonTree ID3=null;
        Expression opra = null;

        Expression oprb = null;


        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:43:2: ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' expression ) | ^( '++' expression ) | ^( '--' expression ) | ^( VAR ID ) | ^( INVOKE ID ( expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | 'true' | 'false' | 'null' )
            int alt9=32;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 63:
                {
                alt9=2;
                }
                break;
            case 64:
                {
                alt9=3;
                }
                break;
            case 65:
                {
                alt9=4;
                }
                break;
            case 66:
                {
                alt9=5;
                }
                break;
            case 67:
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
            case 68:
                {
                alt9=17;
                }
                break;
            case 69:
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
            case 60:
                {
                alt9=30;
                }
                break;
            case 61:
                {
                alt9=31;
                }
                break;
            case 59:
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:44:2: ^( '=' opra= expression oprb= expression )
                    {
                    match(input,41,FOLLOW_41_in_expression250); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression254);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression258);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new AssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:48:3: ^( '+=' opra= expression oprb= expression )
                    {
                    match(input,63,FOLLOW_63_in_expression267); 

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
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:51:3: ^( '-=' opra= expression oprb= expression )
                    {
                    match(input,64,FOLLOW_64_in_expression284); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression288);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression292);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:52:3: ^( '*=' opra= expression oprb= expression )
                    {
                    match(input,65,FOLLOW_65_in_expression298); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression302);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression306);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:53:3: ^( '/=' opra= expression oprb= expression )
                    {
                    match(input,66,FOLLOW_66_in_expression312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression316);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression320);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:54:3: ^( '%=' opra= expression oprb= expression )
                    {
                    match(input,67,FOLLOW_67_in_expression326); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression330);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression334);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:55:3: ^( '||' opra= expression oprb= expression )
                    {
                    match(input,44,FOLLOW_44_in_expression340); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression344);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression348);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:56:3: ^( '&&' opra= expression oprb= expression )
                    {
                    match(input,45,FOLLOW_45_in_expression354); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression358);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression362);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:57:3: ^( '+' opra= expression oprb= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression368); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression372);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression376);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:58:3: ^( '-' opra= expression oprb= expression )
                    {
                    match(input,52,FOLLOW_52_in_expression382); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression386);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression390);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:59:3: ^( '*' opra= expression oprb= expression )
                    {
                    match(input,53,FOLLOW_53_in_expression396); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression400);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression404);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:60:3: ^( '/' opra= expression oprb= expression )
                    {
                    match(input,54,FOLLOW_54_in_expression410); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression414);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression418);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:61:3: ^( '%' opra= expression oprb= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression424); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression428);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression432);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:62:3: ^( '==' opra= expression oprb= expression )
                    {
                    match(input,46,FOLLOW_46_in_expression438); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression442);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression446);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:63:3: ^( '~=' opra= expression oprb= expression )
                    {
                    match(input,48,FOLLOW_48_in_expression452); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression456);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression460);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:64:3: ^( '!=' opra= expression oprb= expression )
                    {
                    match(input,47,FOLLOW_47_in_expression466); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression470);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression474);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:65:3: ^( '>=' opra= expression oprb= expression )
                    {
                    match(input,68,FOLLOW_68_in_expression480); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression484);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression488);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:66:3: ^( '<=' opra= expression oprb= expression )
                    {
                    match(input,69,FOLLOW_69_in_expression494); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression498);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression502);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:67:3: ^( '<' opra= expression oprb= expression )
                    {
                    match(input,49,FOLLOW_49_in_expression508); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression512);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression516);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:68:3: ^( '>' opra= expression oprb= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression522); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression526);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression530);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:69:3: ^( '!' expression )
                    {
                    match(input,58,FOLLOW_58_in_expression536); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression538);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:70:3: ^( '++' expression )
                    {
                    match(input,56,FOLLOW_56_in_expression544); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression546);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:71:3: ^( '--' expression )
                    {
                    match(input,57,FOLLOW_57_in_expression553); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression555);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 24 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:72:3: ^( VAR ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expression562); 

                    match(input, Token.DOWN, null); 
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expression564); 

                    match(input, Token.UP, null); 

                    	   expr = new VarExpression((ID3!=null?ID3.getText():null), (ID3!=null?ID3.getLine():0));
                    	

                    }
                    break;
                case 25 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:76:3: ^( INVOKE ID ( expression )* )
                    {
                    match(input,INVOKE,FOLLOW_INVOKE_in_expression573); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_expression575); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:76:15: ( expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==INVOKE||(LA8_0>=VAR && LA8_0<=StringLiteral)||LA8_0==41||(LA8_0>=44 && LA8_0<=61)||(LA8_0>=63 && LA8_0<=69)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:76:15: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression577);
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:77:3: IntegerLiteral
                    {
                    match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expression583); 

                    }
                    break;
                case 27 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:78:10: FloatingPointLiteral
                    {
                    match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_expression594); 

                    }
                    break;
                case 28 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:79:10: CharacterLiteral
                    {
                    match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_expression605); 

                    }
                    break;
                case 29 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:80:10: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_expression616); 

                    }
                    break;
                case 30 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:81:10: 'true'
                    {
                    match(input,60,FOLLOW_60_in_expression627); 

                    }
                    break;
                case 31 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:82:10: 'false'
                    {
                    match(input,61,FOLLOW_61_in_expression638); 

                    }
                    break;
                case 32 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:83:10: 'null'
                    {
                    match(input,59,FOLLOW_59_in_expression649); 

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
    public static final BitSet FOLLOW_FUNCTION_in_function68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PARAM_in_function74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_function77 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_statement_in_function87 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_28_in_statement114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement119 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_33_in_statement143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement145 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_statement_in_statement147 = new BitSet(new long[]{0x0000000C00000008L});
    public static final BitSet FOLLOW_34_in_statement151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement153 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_statement_in_statement155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_statement162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_statement177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement179 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_statement181 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_statement_in_statement183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement195 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_statement_in_statement197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expression250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression254 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_expression267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression271 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression288 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression302 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression316 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression330 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expression340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression344 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expression354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression358 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression372 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression386 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expression396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression400 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression414 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression428 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression442 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression456 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expression466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression470 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression484 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_69_in_expression494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression498 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expression508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression512 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression526 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expression562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_expression573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression575 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_expression_in_expression577 = new BitSet(new long[]{0xFFFFF3B210003E48L,0x000000000000003FL});
    public static final BitSet FOLLOW_IntegerLiteral_in_expression583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_expression594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_expression605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_expression616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression649 = new BitSet(new long[]{0x0000000000000002L});

}