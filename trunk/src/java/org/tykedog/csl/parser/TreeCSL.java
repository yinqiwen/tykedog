// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g 2010-06-12 16:30:17

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:17:1: language returns [CSL csl] : ^( LANGUAGE ( statement )* ( function )* ) ;
    public final CSL language() throws RecognitionException {
        CSL csl = null;

        Statement statement1 = null;

        Function function2 = null;


        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:18:1: ( ^( LANGUAGE ( statement )* ( function )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:19:1: ^( LANGUAGE ( statement )* ( function )* )
            {
            csl = new CSL();
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language49); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:20:12: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==INVOKE||(LA1_0>=VAR && LA1_0<=StringLiteral)||LA1_0==28||LA1_0==33||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=44 && LA1_0<=68)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:20:13: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_language52);
                	    statement1=statement();

                	    state._fsp--;

                	    csl.addStatement(statement1);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:20:61: ( function )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==FUNCTION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:20:62: function
                	    {
                	    pushFollow(FOLLOW_function_in_language58);
                	    function2=function();

                	    state._fsp--;

                	    csl.addFunction(function2);

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
        return csl;
    }
    // $ANTLR end "language"


    // $ANTLR start "function"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:23:1: function returns [Function func] : ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) ;
    public final Function function() throws RecognitionException {
        Function func = null;

        CommonTree ID3=null;
        CommonTree VAR4=null;
        Statement s = null;


        func = new Function();
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:25:1: ( ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:3: ^( FUNCTION ID ^( PARAM ( VAR )* ) (s= statement )* )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function84); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_function86); 
            func.setName((ID3!=null?ID3.getText():null));
            match(input,PARAM,FOLLOW_PARAM_in_function90); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:50: ( VAR )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==VAR) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:51: VAR
                	    {
                	    VAR4=(CommonTree)match(input,VAR,FOLLOW_VAR_in_function93); 
                	    func.addArg((VAR4!=null?VAR4.getText():null));

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:84: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVOKE||(LA4_0>=VAR && LA4_0<=StringLiteral)||LA4_0==28||LA4_0==33||(LA4_0>=36 && LA4_0<=37)||(LA4_0>=39 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=68)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:26:85: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function103);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:28:1: statement returns [Statement stat] : ( block | ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? ) | ^( 'while' expression block ) | ^( 'return' ( expression )? ) | 'break' | 'continue' | expression );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Expression ifexpr = null;

        BlockStatement ifblock = null;

        Expression elifexpr = null;

        BlockStatement elifblock = null;

        BlockStatement elseblock = null;

        BlockStatement block5 = null;

        Expression expression6 = null;

        BlockStatement block7 = null;

        Expression expression8 = null;


        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:29:2: ( block | ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? ) | ^( 'while' expression block ) | ^( 'return' ( expression )? ) | 'break' | 'continue' | expression )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 39:
                {
                alt8=6;
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
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:30:5: block
                    {
                    pushFollow(FOLLOW_block_in_statement124);
                    block5=block();

                    state._fsp--;

                    stat = block5;

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:32:5: ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? )
                    {
                    IfElseStatement ifElse = new IfElseStatement();
                    match(input,33,FOLLOW_33_in_statement144); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement148);
                    ifexpr=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement152);
                    ifblock=block();

                    state._fsp--;


                            ChoiceStatement ifChoice = new ChoiceStatement(ifexpr, ifblock);
                            ifElse.setIfStatement(ifChoice);
                        
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:38:5: ( ^( 'elif' elifexpr= expression elifblock= block ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:38:6: ^( 'elif' elifexpr= expression elifblock= block )
                    	    {
                    	    match(input,34,FOLLOW_34_in_statement167); 

                    	    match(input, Token.DOWN, null); 
                    	    pushFollow(FOLLOW_expression_in_statement171);
                    	    elifexpr=expression();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_block_in_statement175);
                    	    elifblock=block();

                    	    state._fsp--;


                    	    match(input, Token.UP, null); 

                    	            ChoiceStatement elifChoice = new ChoiceStatement(elifexpr, elifblock);
                    	            ifElse.addElifStatement(elifChoice);
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:44:5: ( ^( 'else' elseblock= block ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:44:6: ^( 'else' elseblock= block )
                            {
                            match(input,35,FOLLOW_35_in_statement198); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_block_in_statement202);
                            elseblock=block();

                            state._fsp--;

                            ifElse.setElseBlock(elseblock);

                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:45:7: ^( 'while' expression block )
                    {
                    match(input,36,FOLLOW_36_in_statement218); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement220);
                    expression6=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement222);
                    block7=block();

                    state._fsp--;


                    match(input, Token.UP, null); 

                            stat = new WhileStatement(expression6, block7);
                        

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:49:7: ^( 'return' ( expression )? )
                    {
                    match(input,40,FOLLOW_40_in_statement239); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:49:19: ( expression )?
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==INVOKE||(LA7_0>=VAR && LA7_0<=StringLiteral)||LA7_0==41||(LA7_0>=44 && LA7_0<=68)) ) {
                            alt7=1;
                        }
                        switch (alt7) {
                            case 1 :
                                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:49:19: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement242);
                                expression();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:50:7: 'break'
                    {
                    match(input,37,FOLLOW_37_in_statement252); 
                    stat = new BreakStatement();

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:51:7: 'continue'
                    {
                    match(input,39,FOLLOW_39_in_statement261); 
                    stat = new ContinueStatement();

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:52:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement270);
                    expression8=expression();

                    state._fsp--;

                    stat = new ExpressionStatement(expression8);

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:55:1: block returns [BlockStatement stat] : ^( '{' (s= statement )* ) ;
    public final BlockStatement block() throws RecognitionException {
        BlockStatement stat = null;

        Statement s = null;



        List<Statement> sl = new ArrayList<Statement>();
        stat = new BlockStatement(sl);

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:60:2: ( ^( '{' (s= statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:61:2: ^( '{' (s= statement )* )
            {
            match(input,28,FOLLOW_28_in_block294); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:61:8: (s= statement )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==INVOKE||(LA9_0>=VAR && LA9_0<=StringLiteral)||LA9_0==28||LA9_0==33||(LA9_0>=36 && LA9_0<=37)||(LA9_0>=39 && LA9_0<=41)||(LA9_0>=44 && LA9_0<=68)) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:61:9: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block299);
                	    s=statement();

                	    state._fsp--;

                	    sl.add(s);

                	    }
                	    break;

                	default :
                	    break loop9;
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:63:1: expression returns [Expression expr] : ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' opr= expression ) | ^( '++' opr= expression ) | ^( '--' opr= expression ) | ^( VAR ID ) | ^( INVOKE ID (opr= expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | token= 'true' | token= 'false' | token= 'null' );
    public final Expression expression() throws RecognitionException {
        Expression expr = null;

        CommonTree token=null;
        CommonTree ID9=null;
        CommonTree ID10=null;
        CommonTree IntegerLiteral11=null;
        CommonTree FloatingPointLiteral12=null;
        CommonTree CharacterLiteral13=null;
        CommonTree StringLiteral14=null;
        Expression opra = null;

        Expression oprb = null;

        Expression opr = null;


        List<Expression> exprList = new ArrayList<Expression>();
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:65:2: ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression oprb= expression ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' opr= expression ) | ^( '++' opr= expression ) | ^( '--' opr= expression ) | ^( VAR ID ) | ^( INVOKE ID (opr= expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | token= 'true' | token= 'false' | token= 'null' )
            int alt11=32;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 62:
                {
                alt11=2;
                }
                break;
            case 63:
                {
                alt11=3;
                }
                break;
            case 64:
                {
                alt11=4;
                }
                break;
            case 65:
                {
                alt11=5;
                }
                break;
            case 66:
                {
                alt11=6;
                }
                break;
            case 44:
                {
                alt11=7;
                }
                break;
            case 45:
                {
                alt11=8;
                }
                break;
            case 51:
                {
                alt11=9;
                }
                break;
            case 52:
                {
                alt11=10;
                }
                break;
            case 53:
                {
                alt11=11;
                }
                break;
            case 54:
                {
                alt11=12;
                }
                break;
            case 55:
                {
                alt11=13;
                }
                break;
            case 46:
                {
                alt11=14;
                }
                break;
            case 48:
                {
                alt11=15;
                }
                break;
            case 47:
                {
                alt11=16;
                }
                break;
            case 67:
                {
                alt11=17;
                }
                break;
            case 68:
                {
                alt11=18;
                }
                break;
            case 49:
                {
                alt11=19;
                }
                break;
            case 50:
                {
                alt11=20;
                }
                break;
            case 58:
                {
                alt11=21;
                }
                break;
            case 56:
                {
                alt11=22;
                }
                break;
            case 57:
                {
                alt11=23;
                }
                break;
            case VAR:
                {
                alt11=24;
                }
                break;
            case INVOKE:
                {
                alt11=25;
                }
                break;
            case IntegerLiteral:
                {
                alt11=26;
                }
                break;
            case FloatingPointLiteral:
                {
                alt11=27;
                }
                break;
            case CharacterLiteral:
                {
                alt11=28;
                }
                break;
            case StringLiteral:
                {
                alt11=29;
                }
                break;
            case 60:
                {
                alt11=30;
                }
                break;
            case 61:
                {
                alt11=31;
                }
                break;
            case 59:
                {
                alt11=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:66:2: ^( '=' opra= expression oprb= expression )
                    {
                    match(input,41,FOLLOW_41_in_expression323); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression327);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression331);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new AssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:70:3: ^( '+=' opra= expression oprb= expression )
                    {
                    match(input,62,FOLLOW_62_in_expression340); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression344);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression348);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:74:3: ^( '-=' opra= expression oprb= expression )
                    {
                    match(input,63,FOLLOW_63_in_expression357); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression361);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression365);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MinusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:78:3: ^( '*=' opra= expression oprb= expression )
                    {
                    match(input,64,FOLLOW_64_in_expression374); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression378);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression382);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:82:3: ^( '/=' opra= expression oprb= expression )
                    {
                    match(input,65,FOLLOW_65_in_expression391); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression395);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression399);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:86:3: ^( '%=' opra= expression oprb= expression )
                    {
                    match(input,66,FOLLOW_66_in_expression408); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression412);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression416);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:90:3: ^( '||' opra= expression oprb= expression )
                    {
                    match(input,44,FOLLOW_44_in_expression425); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression429);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression433);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicOrExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 8 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:94:3: ^( '&&' opra= expression oprb= expression )
                    {
                    match(input,45,FOLLOW_45_in_expression442); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression446);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression450);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicAndExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 9 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:98:3: ^( '+' opra= expression oprb= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression459); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression463);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression467);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 10 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:102:3: ^( '-' opra= expression oprb= expression )
                    {
                    match(input,52,FOLLOW_52_in_expression476); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression480);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression484);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MinusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 11 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:106:3: ^( '*' opra= expression oprb= expression )
                    {
                    match(input,53,FOLLOW_53_in_expression493); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression497);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression501);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 12 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:110:3: ^( '/' opra= expression oprb= expression )
                    {
                    match(input,54,FOLLOW_54_in_expression510); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression514);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression518);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 13 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:114:3: ^( '%' opra= expression oprb= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression527); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression531);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression535);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 14 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:118:3: ^( '==' opra= expression oprb= expression )
                    {
                    match(input,46,FOLLOW_46_in_expression544); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression548);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression552);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new EqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 15 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:122:3: ^( '~=' opra= expression oprb= expression )
                    {
                    match(input,48,FOLLOW_48_in_expression561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression565);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression569);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MatchEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 16 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:126:3: ^( '!=' opra= expression oprb= expression )
                    {
                    match(input,47,FOLLOW_47_in_expression578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression582);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression586);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 17 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:130:3: ^( '>=' opra= expression oprb= expression )
                    {
                    match(input,67,FOLLOW_67_in_expression595); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression599);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression603);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 18 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:134:3: ^( '<=' opra= expression oprb= expression )
                    {
                    match(input,68,FOLLOW_68_in_expression612); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression616);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression620);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 19 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:138:3: ^( '<' opra= expression oprb= expression )
                    {
                    match(input,49,FOLLOW_49_in_expression629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression633);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression637);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 20 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:142:3: ^( '>' opra= expression oprb= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression646); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression650);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression654);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 21 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:146:3: ^( '!' opr= expression )
                    {
                    match(input,58,FOLLOW_58_in_expression663); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression667);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 22 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:150:3: ^( '++' opr= expression )
                    {
                    match(input,56,FOLLOW_56_in_expression676); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression680);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new IncreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 23 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:154:3: ^( '--' opr= expression )
                    {
                    match(input,57,FOLLOW_57_in_expression690); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression694);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DecreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 24 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:158:3: ^( VAR ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expression704); 

                    match(input, Token.DOWN, null); 
                    ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_expression706); 

                    match(input, Token.UP, null); 

                    	   expr = new VarExpression((ID9!=null?ID9.getText():null), (ID9!=null?ID9.getLine():0));
                    	

                    }
                    break;
                case 25 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:162:3: ^( INVOKE ID (opr= expression )* )
                    {
                    match(input,INVOKE,FOLLOW_INVOKE_in_expression715); 

                    match(input, Token.DOWN, null); 
                    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_expression717); 
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:162:15: (opr= expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==INVOKE||(LA10_0>=VAR && LA10_0<=StringLiteral)||LA10_0==41||(LA10_0>=44 && LA10_0<=68)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:162:16: opr= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression722);
                    	    opr=expression();

                    	    state._fsp--;

                    	    exprList.add(opr);

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    	   expr = new InvokeExpression((ID10!=null?ID10.getText():null), exprList, (ID10!=null?ID10.getLine():0));
                    	

                    }
                    break;
                case 26 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:166:3: IntegerLiteral
                    {
                    IntegerLiteral11=(CommonTree)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expression733); 

                    	   Integer i = Integer.valueOf((IntegerLiteral11!=null?IntegerLiteral11.getText():null));
                    	   expr = new ConstantExpression(i,  (IntegerLiteral11!=null?IntegerLiteral11.getLine():0));
                    	

                    }
                    break;
                case 27 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:171:10: FloatingPointLiteral
                    {
                    FloatingPointLiteral12=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_expression747); 

                    	   Double d = Double.valueOf((FloatingPointLiteral12!=null?FloatingPointLiteral12.getText():null));
                    	   expr = new ConstantExpression(d,  (FloatingPointLiteral12!=null?FloatingPointLiteral12.getLine():0));
                    	

                    }
                    break;
                case 28 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:176:10: CharacterLiteral
                    {
                    CharacterLiteral13=(CommonTree)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_expression768); 

                    	   Character c = Character.valueOf((CharacterLiteral13!=null?CharacterLiteral13.getText():null).charAt(0));
                    	   expr = new ConstantExpression(c,  (CharacterLiteral13!=null?CharacterLiteral13.getLine():0));
                    	

                    }
                    break;
                case 29 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:181:10: StringLiteral
                    {
                    StringLiteral14=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_expression789); 

                    	   expr = new ConstantExpression((StringLiteral14!=null?StringLiteral14.getText():null),  (StringLiteral14!=null?StringLiteral14.getLine():0));
                    	

                    }
                    break;
                case 30 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:185:10: token= 'true'
                    {
                    token=(CommonTree)match(input,60,FOLLOW_60_in_expression812); 

                    	   expr = new ConstantExpression(Boolean.TRUE,  token.getLine());
                    	

                    }
                    break;
                case 31 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:189:10: token= 'false'
                    {
                    token=(CommonTree)match(input,61,FOLLOW_61_in_expression835); 

                    	   expr = new ConstantExpression(Boolean.FALSE,  token.getLine());
                    	

                    }
                    break;
                case 32 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\TreeCSL.g:193:10: token= 'null'
                    {
                    token=(CommonTree)match(input,59,FOLLOW_59_in_expression858); 

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


 

    public static final BitSet FOLLOW_LANGUAGE_in_language49 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_language52 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_function_in_language58 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_FUNCTION_in_function84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PARAM_in_function90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_function93 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_statement_in_function103 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_block_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement152 = new BitSet(new long[]{0x0000000C00000008L});
    public static final BitSet FOLLOW_34_in_statement167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement171 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_statement198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_statement239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block299 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_41_in_expression323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression327 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_expression340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression344 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_expression357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression361 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression378 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression395 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression412 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expression425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression429 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expression442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression446 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression463 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression480 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expression493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression497 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression514 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression531 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression548 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression565 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expression578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression582 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression599 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression616 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expression629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression633 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression650 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expression704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_expression715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression717 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_IntegerLiteral_in_expression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_expression747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_expression768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_expression789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression858 = new BitSet(new long[]{0x0000000000000002L});

}