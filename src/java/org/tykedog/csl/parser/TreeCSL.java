// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g 2010-06-11 14:43:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "PARAM", "INVOKE", "LANGUAGE", "ID", "VAR", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'def'", "'{'", "'}'", "'('", "','", "')'", "'if'", "'elif'", "'else'", "'while'", "'break'", "';'", "'continue'", "'return'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'~='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'null'", "'true'", "'false'", "'+='", "'-='", "'*='", "'/='", "'%='", "'>='", "'<='"
    };
    public static final int T__68=68;
    public static final int FUNCTION=4;
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
    public String getGrammarFileName() { return "D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g"; }



    // $ANTLR start "language"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:1: language : ^( LANGUAGE ( statement )* ( function )* ) ;
    public final void language() throws RecognitionException {
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:10: ( ^( LANGUAGE ( statement )* ( function )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:12: ^( LANGUAGE ( statement )* ( function )* )
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language43); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:23: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==INVOKE||(LA1_0>=VAR && LA1_0<=StringLiteral)||LA1_0==28||LA1_0==33||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=44 && LA1_0<=68)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:23: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_language45);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:34: ( function )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==FUNCTION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:34: function
                	    {
                	    pushFollow(FOLLOW_function_in_language48);
                	    function();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:19:1: function returns [Function func] : ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) ;
    public final Function function() throws RecognitionException {
        Function func = null;

        CommonTree ID1=null;
        CommonTree VAR2=null;
        Statement s = null;


        func = new Function();
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:21:1: ( ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:3: ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function71); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_function73); 
            func.setName((ID1!=null?ID1.getText():null));
            match(input,PARAM,FOLLOW_PARAM_in_function77); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:50: ( VAR )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==VAR) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:51: VAR
                	    {
                	    VAR2=(CommonTree)match(input,VAR,FOLLOW_VAR_in_function80); 
                	    func.addArg((VAR2!=null?VAR2.getText():null));

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:84: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVOKE||(LA4_0>=VAR && LA4_0<=StringLiteral)||LA4_0==28||LA4_0==33||(LA4_0>=36 && LA4_0<=37)||(LA4_0>=39 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=68)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:22:85: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function90);
            	    s=statement();

            	    state._fsp--;

            	    func.addStatment(s);

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:24:1: statement returns [Statement stat] : ( block | ^( 'if' expression[stat] block ( ^( 'elif' expression[stat] block ) )* ( ^( 'else' block ) )? ) | ^( 'while' expression[stat] block ) | 'return' | 'break' | 'continue' | expression[stat] );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        BlockStatement block3 = null;


        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:25:2: ( block | ^( 'if' expression[stat] block ( ^( 'elif' expression[stat] block ) )* ( ^( 'else' block ) )? ) | ^( 'while' expression[stat] block ) | 'return' | 'break' | 'continue' | expression[stat] )
            int alt7=7;
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
            case 36:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            case 37:
                {
                alt7=5;
                }
                break;
            case 39:
                {
                alt7=6;
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
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:5: block
                    {
                    pushFollow(FOLLOW_block_in_statement111);
                    block3=block();

                    state._fsp--;

                    stat = block3;

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:27:6: ^( 'if' expression[stat] block ( ^( 'elif' expression[stat] block ) )* ( ^( 'else' block ) )? )
                    {
                    match(input,33,FOLLOW_33_in_statement120); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement122);
                    expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement125);
                    block();

                    state._fsp--;

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:27:36: ( ^( 'elif' expression[stat] block ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:27:37: ^( 'elif' expression[stat] block )
                    	    {
                    	    match(input,34,FOLLOW_34_in_statement129); 

                    	    match(input, Token.DOWN, null); 
                    	    pushFollow(FOLLOW_expression_in_statement131);
                    	    expression(stat);

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_block_in_statement134);
                    	    block();

                    	    state._fsp--;


                    	    match(input, Token.UP, null); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:27:72: ( ^( 'else' block ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:27:73: ^( 'else' block )
                            {
                            match(input,35,FOLLOW_35_in_statement141); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_block_in_statement143);
                            block();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:7: ^( 'while' expression[stat] block )
                    {
                    match(input,36,FOLLOW_36_in_statement157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement159);
                    expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement162);
                    block();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:29:7: 'return'
                    {
                    match(input,40,FOLLOW_40_in_statement172); 

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:30:7: 'break'
                    {
                    match(input,37,FOLLOW_37_in_statement180); 

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:31:7: 'continue'
                    {
                    match(input,39,FOLLOW_39_in_statement188); 

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:32:7: expression[stat]
                    {
                    pushFollow(FOLLOW_expression_in_statement196);
                    expression(stat);

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


    // $ANTLR start "block"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:35:1: block returns [BlockStatement stat] : ^( '{' (s= statement )* ) ;
    public final BlockStatement block() throws RecognitionException {
        BlockStatement stat = null;

        Statement s = null;



        List<Statement> sl = new ArrayList<Statement>();
        stat = new BlockStatement(sl);

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:40:2: ( ^( '{' (s= statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:41:2: ^( '{' (s= statement )* )
            {
            match(input,28,FOLLOW_28_in_block219); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:41:8: (s= statement )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==INVOKE||(LA8_0>=VAR && LA8_0<=StringLiteral)||LA8_0==28||LA8_0==33||(LA8_0>=36 && LA8_0<=37)||(LA8_0>=39 && LA8_0<=41)||(LA8_0>=44 && LA8_0<=68)) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:41:9: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block224);
                	    s=statement();

                	    state._fsp--;

                	    sl.add(s);

                	    }
                	    break;

                	default :
                	    break loop8;
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
        return stat;
    }
    // $ANTLR end "block"


    // $ANTLR start "expression"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:43:1: expression[Statement stat] returns [Expression expr] : ( ^( '=' opra= expression[stat] oprb= expression[stat] ) | ^( '+=' opra= expression[stat] oprb= expression[stat] ) | ^( '-=' opra= expression[stat] oprb= expression[stat] ) | ^( '*=' opra= expression[stat] oprb= expression[stat] ) | ^( '/=' opra= expression[stat] oprb= expression[stat] ) | ^( '%=' opra= expression[stat] oprb= expression[stat] ) | ^( '||' opra= expression[stat] oprb= expression[stat] ) | ^( '&&' opra= expression[stat] oprb= expression[stat] ) | ^( '+' opra= expression[stat] oprb= expression[stat] ) | ^( '-' opra= expression[stat] oprb= expression[stat] ) | ^( '*' opra= expression[stat] oprb= expression[stat] ) | ^( '/' opra= expression[stat] oprb= expression[stat] ) | ^( '%' opra= expression[stat] oprb= expression[stat] ) | ^( '==' opra= expression[stat] oprb= expression[stat] ) | ^( '~=' opra= expression[stat] oprb= expression[stat] ) | ^( '!=' opra= expression[stat] oprb= expression[stat] ) | ^( '>=' opra= expression[stat] oprb= expression[stat] ) | ^( '<=' opra= expression[stat] oprb= expression[stat] ) | ^( '<' opra= expression[stat] oprb= expression[stat] ) | ^( '>' opra= expression[stat] oprb= expression[stat] ) | ^( '!' opr= expression[stat] ) | ^( '++' opr= expression[stat] ) | ^( '--' opr= expression[stat] ) | ^( VAR ID ) | ^( INVOKE ID (opr= expression[stat] )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | token= 'true' | token= 'false' | token= 'null' );
    public final Expression expression(Statement stat) throws RecognitionException {
        Expression expr = null;

        CommonTree token=null;
        CommonTree ID4=null;
        CommonTree ID5=null;
        CommonTree IntegerLiteral6=null;
        CommonTree FloatingPointLiteral7=null;
        CommonTree CharacterLiteral8=null;
        CommonTree StringLiteral9=null;
        Expression opra = null;

        Expression oprb = null;

        Expression opr = null;


        List<Expression> exprList = new ArrayList<Expression>();
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:45:2: ( ^( '=' opra= expression[stat] oprb= expression[stat] ) | ^( '+=' opra= expression[stat] oprb= expression[stat] ) | ^( '-=' opra= expression[stat] oprb= expression[stat] ) | ^( '*=' opra= expression[stat] oprb= expression[stat] ) | ^( '/=' opra= expression[stat] oprb= expression[stat] ) | ^( '%=' opra= expression[stat] oprb= expression[stat] ) | ^( '||' opra= expression[stat] oprb= expression[stat] ) | ^( '&&' opra= expression[stat] oprb= expression[stat] ) | ^( '+' opra= expression[stat] oprb= expression[stat] ) | ^( '-' opra= expression[stat] oprb= expression[stat] ) | ^( '*' opra= expression[stat] oprb= expression[stat] ) | ^( '/' opra= expression[stat] oprb= expression[stat] ) | ^( '%' opra= expression[stat] oprb= expression[stat] ) | ^( '==' opra= expression[stat] oprb= expression[stat] ) | ^( '~=' opra= expression[stat] oprb= expression[stat] ) | ^( '!=' opra= expression[stat] oprb= expression[stat] ) | ^( '>=' opra= expression[stat] oprb= expression[stat] ) | ^( '<=' opra= expression[stat] oprb= expression[stat] ) | ^( '<' opra= expression[stat] oprb= expression[stat] ) | ^( '>' opra= expression[stat] oprb= expression[stat] ) | ^( '!' opr= expression[stat] ) | ^( '++' opr= expression[stat] ) | ^( '--' opr= expression[stat] ) | ^( VAR ID ) | ^( INVOKE ID (opr= expression[stat] )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | token= 'true' | token= 'false' | token= 'null' )
            int alt10=32;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt10=1;
                }
                break;
            case 62:
                {
                alt10=2;
                }
                break;
            case 63:
                {
                alt10=3;
                }
                break;
            case 64:
                {
                alt10=4;
                }
                break;
            case 65:
                {
                alt10=5;
                }
                break;
            case 66:
                {
                alt10=6;
                }
                break;
            case 44:
                {
                alt10=7;
                }
                break;
            case 45:
                {
                alt10=8;
                }
                break;
            case 51:
                {
                alt10=9;
                }
                break;
            case 52:
                {
                alt10=10;
                }
                break;
            case 53:
                {
                alt10=11;
                }
                break;
            case 54:
                {
                alt10=12;
                }
                break;
            case 55:
                {
                alt10=13;
                }
                break;
            case 46:
                {
                alt10=14;
                }
                break;
            case 48:
                {
                alt10=15;
                }
                break;
            case 47:
                {
                alt10=16;
                }
                break;
            case 67:
                {
                alt10=17;
                }
                break;
            case 68:
                {
                alt10=18;
                }
                break;
            case 49:
                {
                alt10=19;
                }
                break;
            case 50:
                {
                alt10=20;
                }
                break;
            case 58:
                {
                alt10=21;
                }
                break;
            case 56:
                {
                alt10=22;
                }
                break;
            case 57:
                {
                alt10=23;
                }
                break;
            case VAR:
                {
                alt10=24;
                }
                break;
            case INVOKE:
                {
                alt10=25;
                }
                break;
            case IntegerLiteral:
                {
                alt10=26;
                }
                break;
            case FloatingPointLiteral:
                {
                alt10=27;
                }
                break;
            case CharacterLiteral:
                {
                alt10=28;
                }
                break;
            case StringLiteral:
                {
                alt10=29;
                }
                break;
            case 60:
                {
                alt10=30;
                }
                break;
            case 61:
                {
                alt10=31;
                }
                break;
            case 59:
                {
                alt10=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:46:2: ^( '=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,41,FOLLOW_41_in_expression249); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression253);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression258);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new AssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:50:3: ^( '+=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,62,FOLLOW_62_in_expression268); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression272);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression277);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:54:3: ^( '-=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,63,FOLLOW_63_in_expression287); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression291);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression296);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MinusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:58:3: ^( '*=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,64,FOLLOW_64_in_expression306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression310);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression315);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:62:3: ^( '/=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,65,FOLLOW_65_in_expression325); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression329);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression334);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:66:3: ^( '%=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,66,FOLLOW_66_in_expression344); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression348);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression353);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:70:3: ^( '||' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,44,FOLLOW_44_in_expression363); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression367);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression372);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicOrExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 8 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:74:3: ^( '&&' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,45,FOLLOW_45_in_expression382); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression386);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression391);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicAndExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 9 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:78:3: ^( '+' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,51,FOLLOW_51_in_expression401); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression405);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression410);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 10 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:82:3: ^( '-' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,52,FOLLOW_52_in_expression420); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression424);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression429);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MinusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 11 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:86:3: ^( '*' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,53,FOLLOW_53_in_expression439); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression443);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression448);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 12 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:90:3: ^( '/' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,54,FOLLOW_54_in_expression458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression462);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression467);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 13 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:94:3: ^( '%' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,55,FOLLOW_55_in_expression477); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression481);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression486);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 14 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:98:3: ^( '==' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,46,FOLLOW_46_in_expression496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression500);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression505);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new EqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 15 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:102:3: ^( '~=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,48,FOLLOW_48_in_expression515); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression519);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression524);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MatchEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 16 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:106:3: ^( '!=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,47,FOLLOW_47_in_expression534); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression538);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression543);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 17 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:110:3: ^( '>=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,67,FOLLOW_67_in_expression553); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression557);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression562);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 18 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:114:3: ^( '<=' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,68,FOLLOW_68_in_expression572); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression576);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression581);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 19 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:118:3: ^( '<' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,49,FOLLOW_49_in_expression591); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression595);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression600);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 20 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:122:3: ^( '>' opra= expression[stat] oprb= expression[stat] )
                    {
                    match(input,50,FOLLOW_50_in_expression610); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression614);
                    opra=expression(stat);

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression619);
                    oprb=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 21 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:126:3: ^( '!' opr= expression[stat] )
                    {
                    match(input,58,FOLLOW_58_in_expression629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression633);
                    opr=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 22 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:130:3: ^( '++' opr= expression[stat] )
                    {
                    match(input,56,FOLLOW_56_in_expression643); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression647);
                    opr=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new IncreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 23 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:134:3: ^( '--' opr= expression[stat] )
                    {
                    match(input,57,FOLLOW_57_in_expression658); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression662);
                    opr=expression(stat);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DecreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 24 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:138:3: ^( VAR ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expression673); 

                    match(input, Token.DOWN, null); 
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expression675); 

                    match(input, Token.UP, null); 

                    	   expr = new VarExpression((ID4!=null?ID4.getText():null), (ID4!=null?ID4.getLine():0));
                    	

                    }
                    break;
                case 25 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:142:3: ^( INVOKE ID (opr= expression[stat] )* )
                    {
                    match(input,INVOKE,FOLLOW_INVOKE_in_expression684); 

                    match(input, Token.DOWN, null); 
                    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_expression686); 
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:142:15: (opr= expression[stat] )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==INVOKE||(LA9_0>=VAR && LA9_0<=StringLiteral)||LA9_0==41||(LA9_0>=44 && LA9_0<=68)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:142:16: opr= expression[stat]
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression691);
                    	    opr=expression(stat);

                    	    state._fsp--;

                    	    exprList.add(opr);

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    	   expr = new InvokeExpression((ID5!=null?ID5.getText():null), exprList, (ID5!=null?ID5.getLine():0));
                    	

                    }
                    break;
                case 26 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:146:3: IntegerLiteral
                    {
                    IntegerLiteral6=(CommonTree)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expression703); 

                    	   Integer i = Integer.valueOf((IntegerLiteral6!=null?IntegerLiteral6.getText():null));
                    	   expr = new ConstantExpression(i,  (IntegerLiteral6!=null?IntegerLiteral6.getLine():0));
                    	

                    }
                    break;
                case 27 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:151:10: FloatingPointLiteral
                    {
                    FloatingPointLiteral7=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_expression717); 

                    	   Double d = Double.valueOf((FloatingPointLiteral7!=null?FloatingPointLiteral7.getText():null));
                    	   expr = new ConstantExpression(d,  (FloatingPointLiteral7!=null?FloatingPointLiteral7.getLine():0));
                    	

                    }
                    break;
                case 28 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:156:10: CharacterLiteral
                    {
                    CharacterLiteral8=(CommonTree)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_expression738); 

                    	   Character c = Character.valueOf((CharacterLiteral8!=null?CharacterLiteral8.getText():null).charAt(0));
                    	   expr = new ConstantExpression(c,  (CharacterLiteral8!=null?CharacterLiteral8.getLine():0));
                    	

                    }
                    break;
                case 29 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:161:10: StringLiteral
                    {
                    StringLiteral9=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_expression759); 

                    	   expr = new ConstantExpression((StringLiteral9!=null?StringLiteral9.getText():null),  (StringLiteral9!=null?StringLiteral9.getLine():0));
                    	

                    }
                    break;
                case 30 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:165:10: token= 'true'
                    {
                    token=(CommonTree)match(input,60,FOLLOW_60_in_expression782); 

                    	   expr = new ConstantExpression(Boolean.TRUE,  token.getLine());
                    	

                    }
                    break;
                case 31 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:169:10: token= 'false'
                    {
                    token=(CommonTree)match(input,61,FOLLOW_61_in_expression805); 

                    	   expr = new ConstantExpression(Boolean.FALSE,  token.getLine());
                    	

                    }
                    break;
                case 32 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:173:10: token= 'null'
                    {
                    token=(CommonTree)match(input,59,FOLLOW_59_in_expression828); 

                    	   expr = new ConstantExpression(null,  token.getLine());
                    	

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
    public static final BitSet FOLLOW_statement_in_language45 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_function_in_language48 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_FUNCTION_in_function71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function73 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PARAM_in_function77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_function80 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_statement_in_function90 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_block_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement122 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement125 = new BitSet(new long[]{0x0000000C00000008L});
    public static final BitSet FOLLOW_34_in_statement129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement131 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_statement141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement159 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block224 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_41_in_expression249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression253 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_expression268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression272 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_expression287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression291 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression310 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression329 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression348 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expression363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression367 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expression382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression386 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression405 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression424 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expression439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression443 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression462 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression481 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression500 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression519 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expression534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression557 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression576 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expression591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression595 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression614 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expression673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_expression684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression686 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression691 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_IntegerLiteral_in_expression703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_expression717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_expression738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_expression759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression828 = new BitSet(new long[]{0x0000000000000002L});

}