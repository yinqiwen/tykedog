// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g 2010-06-14 18:52:38

package org.tykedog.csl.parser;
import org.tykedog.csl.interpreter.expression.*;
import org.tykedog.csl.interpreter.statement.*;
import org.tykedog.csl.interpreter.function.*;
import org.tykedog.csl.interpreter.*;
import org.tykedog.csl.util.*;


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
    public String getGrammarFileName() { return "F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g"; }



    // $ANTLR start "language"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:18:1: language returns [CSL csl] : ^( LANGUAGE ( statement )* ( function )* ) ;
    public final CSL language() throws RecognitionException {
        CSL csl = null;

        Statement statement1 = null;

        Function function2 = null;


        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:19:1: ( ^( LANGUAGE ( statement )* ( function )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:20:1: ^( LANGUAGE ( statement )* ( function )* )
            {
            csl = new CSL();
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_language49); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:21:12: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==INVOKE||(LA1_0>=VAR && LA1_0<=StringLiteral)||LA1_0==28||LA1_0==33||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=44 && LA1_0<=68)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:21:13: statement
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

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:21:61: ( function )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==FUNCTION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:21:62: function
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:24:1: function returns [Function func] : ^( FUNCTION (n= ID ) ^( PARAM (p= ID )* ) (s= statement )* ) ;
    public final Function function() throws RecognitionException {
        Function func = null;

        CommonTree n=null;
        CommonTree p=null;
        Statement s = null;


        func = new Function();
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:26:1: ( ^( FUNCTION (n= ID ) ^( PARAM (p= ID )* ) (s= statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:3: ^( FUNCTION (n= ID ) ^( PARAM (p= ID )* ) (s= statement )* )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function84); 

            match(input, Token.DOWN, null); 
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:14: (n= ID )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:15: n= ID
            {
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_function89); 
            func.setName((n!=null?n.getText():null));

            }

            match(input,PARAM,FOLLOW_PARAM_in_function94); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:53: (p= ID )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==ID) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:54: p= ID
                	    {
                	    p=(CommonTree)match(input,ID,FOLLOW_ID_in_function99); 
                	    func.addArg((p!=null?p.getText():null));

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:86: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INVOKE||(LA4_0>=VAR && LA4_0<=StringLiteral)||LA4_0==28||LA4_0==33||(LA4_0>=36 && LA4_0<=37)||(LA4_0>=39 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=68)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:27:87: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function109);
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:29:1: statement returns [Statement stat] : ( block | ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? ) | ^( 'while' expression block ) | ^( 'return' ( expression )? ) | 'break' | 'continue' | expression );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Expression ifexpr = null;

        BlockStatement ifblock = null;

        Expression elifexpr = null;

        BlockStatement elifblock = null;

        BlockStatement elseblock = null;

        BlockStatement block3 = null;

        Expression expression4 = null;

        BlockStatement block5 = null;

        Expression expression6 = null;

        Expression expression7 = null;


        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:30:2: ( block | ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? ) | ^( 'while' expression block ) | ^( 'return' ( expression )? ) | 'break' | 'continue' | expression )
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:31:5: block
                    {
                    pushFollow(FOLLOW_block_in_statement130);
                    block3=block();

                    state._fsp--;

                    stat = block3;

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:33:5: ^( 'if' ifexpr= expression ifblock= block ( ^( 'elif' elifexpr= expression elifblock= block ) )* ( ^( 'else' elseblock= block ) )? )
                    {

                           IfElseStatement ifElse = new IfElseStatement();
                           stat = ifElse;
                        
                    match(input,33,FOLLOW_33_in_statement150); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement154);
                    ifexpr=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement158);
                    ifblock=block();

                    state._fsp--;


                            ChoiceStatement ifChoice = new ChoiceStatement(ifexpr, ifblock);
                            ifElse.setIfStatement(ifChoice);
                        
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:42:5: ( ^( 'elif' elifexpr= expression elifblock= block ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:42:6: ^( 'elif' elifexpr= expression elifblock= block )
                    	    {
                    	    match(input,34,FOLLOW_34_in_statement173); 

                    	    match(input, Token.DOWN, null); 
                    	    pushFollow(FOLLOW_expression_in_statement177);
                    	    elifexpr=expression();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_block_in_statement181);
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

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:48:5: ( ^( 'else' elseblock= block ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:48:6: ^( 'else' elseblock= block )
                            {
                            match(input,35,FOLLOW_35_in_statement204); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_block_in_statement208);
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:49:7: ^( 'while' expression block )
                    {
                    match(input,36,FOLLOW_36_in_statement222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement224);
                    expression4=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_block_in_statement226);
                    block5=block();

                    state._fsp--;


                    match(input, Token.UP, null); 

                            stat = new WhileStatement(expression4, block5);
                        

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:53:6: ^( 'return' ( expression )? )
                    {
                    ReturnStatement rs = new ReturnStatement();
                    match(input,40,FOLLOW_40_in_statement244); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:53:64: ( expression )?
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==INVOKE||(LA7_0>=VAR && LA7_0<=StringLiteral)||LA7_0==41||(LA7_0>=44 && LA7_0<=68)) ) {
                            alt7=1;
                        }
                        switch (alt7) {
                            case 1 :
                                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:53:65: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement248);
                                expression6=expression();

                                state._fsp--;

                                rs.setExpr(expression6);

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    stat = rs;

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:54:7: 'break'
                    {
                    match(input,37,FOLLOW_37_in_statement263); 
                    stat = new BreakStatement();

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:55:7: 'continue'
                    {
                    match(input,39,FOLLOW_39_in_statement272); 
                    stat = new ContinueStatement();

                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:56:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement281);
                    expression7=expression();

                    state._fsp--;

                    stat = new ExpressionStatement(expression7);

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:59:1: block returns [BlockStatement stat] : ^( '{' (s= statement )* ) ;
    public final BlockStatement block() throws RecognitionException {
        BlockStatement stat = null;

        Statement s = null;



        List<Statement> sl = new ArrayList<Statement>();
        stat = new BlockStatement(sl);

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:64:2: ( ^( '{' (s= statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:65:2: ^( '{' (s= statement )* )
            {
            match(input,28,FOLLOW_28_in_block305); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:65:8: (s= statement )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==INVOKE||(LA9_0>=VAR && LA9_0<=StringLiteral)||LA9_0==28||LA9_0==33||(LA9_0>=36 && LA9_0<=37)||(LA9_0>=39 && LA9_0<=41)||(LA9_0>=44 && LA9_0<=68)) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:65:9: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block310);
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:67:1: expression returns [Expression expr] : ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression (oprb= expression )? ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' opr= expression ) | ^( '++' opr= expression ) | ^( '--' opr= expression ) | ^( INVOKE ID (opr= expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | VAR | token= 'true' | token= 'false' | token= 'null' );
    public final Expression expression() throws RecognitionException {
        Expression expr = null;

        CommonTree token=null;
        CommonTree ID8=null;
        CommonTree IntegerLiteral9=null;
        CommonTree FloatingPointLiteral10=null;
        CommonTree CharacterLiteral11=null;
        CommonTree StringLiteral12=null;
        CommonTree VAR13=null;
        Expression opra = null;

        Expression oprb = null;

        Expression opr = null;


        List<Expression> exprList = new ArrayList<Expression>();
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:69:2: ( ^( '=' opra= expression oprb= expression ) | ^( '+=' opra= expression oprb= expression ) | ^( '-=' opra= expression oprb= expression ) | ^( '*=' opra= expression oprb= expression ) | ^( '/=' opra= expression oprb= expression ) | ^( '%=' opra= expression oprb= expression ) | ^( '||' opra= expression oprb= expression ) | ^( '&&' opra= expression oprb= expression ) | ^( '+' opra= expression oprb= expression ) | ^( '-' opra= expression (oprb= expression )? ) | ^( '*' opra= expression oprb= expression ) | ^( '/' opra= expression oprb= expression ) | ^( '%' opra= expression oprb= expression ) | ^( '==' opra= expression oprb= expression ) | ^( '~=' opra= expression oprb= expression ) | ^( '!=' opra= expression oprb= expression ) | ^( '>=' opra= expression oprb= expression ) | ^( '<=' opra= expression oprb= expression ) | ^( '<' opra= expression oprb= expression ) | ^( '>' opra= expression oprb= expression ) | ^( '!' opr= expression ) | ^( '++' opr= expression ) | ^( '--' opr= expression ) | ^( INVOKE ID (opr= expression )* ) | IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | VAR | token= 'true' | token= 'false' | token= 'null' )
            int alt12=32;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 63:
                {
                alt12=3;
                }
                break;
            case 64:
                {
                alt12=4;
                }
                break;
            case 65:
                {
                alt12=5;
                }
                break;
            case 66:
                {
                alt12=6;
                }
                break;
            case 44:
                {
                alt12=7;
                }
                break;
            case 45:
                {
                alt12=8;
                }
                break;
            case 51:
                {
                alt12=9;
                }
                break;
            case 52:
                {
                alt12=10;
                }
                break;
            case 53:
                {
                alt12=11;
                }
                break;
            case 54:
                {
                alt12=12;
                }
                break;
            case 55:
                {
                alt12=13;
                }
                break;
            case 46:
                {
                alt12=14;
                }
                break;
            case 48:
                {
                alt12=15;
                }
                break;
            case 47:
                {
                alt12=16;
                }
                break;
            case 67:
                {
                alt12=17;
                }
                break;
            case 68:
                {
                alt12=18;
                }
                break;
            case 49:
                {
                alt12=19;
                }
                break;
            case 50:
                {
                alt12=20;
                }
                break;
            case 58:
                {
                alt12=21;
                }
                break;
            case 56:
                {
                alt12=22;
                }
                break;
            case 57:
                {
                alt12=23;
                }
                break;
            case INVOKE:
                {
                alt12=24;
                }
                break;
            case IntegerLiteral:
                {
                alt12=25;
                }
                break;
            case FloatingPointLiteral:
                {
                alt12=26;
                }
                break;
            case CharacterLiteral:
                {
                alt12=27;
                }
                break;
            case StringLiteral:
                {
                alt12=28;
                }
                break;
            case VAR:
                {
                alt12=29;
                }
                break;
            case 60:
                {
                alt12=30;
                }
                break;
            case 61:
                {
                alt12=31;
                }
                break;
            case 59:
                {
                alt12=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:70:2: ^( '=' opra= expression oprb= expression )
                    {
                    match(input,41,FOLLOW_41_in_expression334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression338);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression342);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new AssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:74:3: ^( '+=' opra= expression oprb= expression )
                    {
                    match(input,62,FOLLOW_62_in_expression351); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression355);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression359);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:78:3: ^( '-=' opra= expression oprb= expression )
                    {
                    match(input,63,FOLLOW_63_in_expression368); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression372);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression376);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MinusAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:82:3: ^( '*=' opra= expression oprb= expression )
                    {
                    match(input,64,FOLLOW_64_in_expression385); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression389);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression393);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:86:3: ^( '/=' opra= expression oprb= expression )
                    {
                    match(input,65,FOLLOW_65_in_expression402); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression406);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression410);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:90:3: ^( '%=' opra= expression oprb= expression )
                    {
                    match(input,66,FOLLOW_66_in_expression419); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression423);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression427);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModAssignExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:94:3: ^( '||' opra= expression oprb= expression )
                    {
                    match(input,44,FOLLOW_44_in_expression436); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression440);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression444);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicOrExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 8 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:98:3: ^( '&&' opra= expression oprb= expression )
                    {
                    match(input,45,FOLLOW_45_in_expression453); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression457);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression461);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LogicAndExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 9 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:102:3: ^( '+' opra= expression oprb= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression470); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression474);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression478);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new PlusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 10 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:106:3: ^( '-' opra= expression (oprb= expression )? )
                    {
                    match(input,52,FOLLOW_52_in_expression487); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression491);
                    opra=expression();

                    state._fsp--;

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:106:25: (oprb= expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INVOKE||(LA10_0>=VAR && LA10_0<=StringLiteral)||LA10_0==41||(LA10_0>=44 && LA10_0<=68)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:106:26: oprb= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression496);
                            oprb=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	   expr = new MinusExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 11 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:110:3: ^( '*' opra= expression oprb= expression )
                    {
                    match(input,53,FOLLOW_53_in_expression507); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression511);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression515);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MultiplyExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 12 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:114:3: ^( '/' opra= expression oprb= expression )
                    {
                    match(input,54,FOLLOW_54_in_expression524); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression528);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression532);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DivideExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 13 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:118:3: ^( '%' opra= expression oprb= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression541); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression545);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression549);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new ModExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 14 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:122:3: ^( '==' opra= expression oprb= expression )
                    {
                    match(input,46,FOLLOW_46_in_expression558); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression562);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression566);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new EqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 15 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:126:3: ^( '~=' opra= expression oprb= expression )
                    {
                    match(input,48,FOLLOW_48_in_expression575); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression579);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression583);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new MatchEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 16 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:130:3: ^( '!=' opra= expression oprb= expression )
                    {
                    match(input,47,FOLLOW_47_in_expression592); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression596);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression600);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotEqualExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 17 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:134:3: ^( '>=' opra= expression oprb= expression )
                    {
                    match(input,67,FOLLOW_67_in_expression609); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression613);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression617);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 18 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:138:3: ^( '<=' opra= expression oprb= expression )
                    {
                    match(input,68,FOLLOW_68_in_expression626); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression630);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression634);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessEqualThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 19 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:142:3: ^( '<' opra= expression oprb= expression )
                    {
                    match(input,49,FOLLOW_49_in_expression643); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression647);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression651);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new LessThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 20 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:146:3: ^( '>' opra= expression oprb= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression660); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression664);
                    opra=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression668);
                    oprb=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new GreaterThanExpression(opra, oprb, opra.getLine());
                    	

                    }
                    break;
                case 21 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:150:3: ^( '!' opr= expression )
                    {
                    match(input,58,FOLLOW_58_in_expression677); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression681);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new NotExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 22 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:154:3: ^( '++' opr= expression )
                    {
                    match(input,56,FOLLOW_56_in_expression690); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression694);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new IncreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 23 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:158:3: ^( '--' opr= expression )
                    {
                    match(input,57,FOLLOW_57_in_expression704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression708);
                    opr=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	   expr = new DecreaseExpression(opr, opr.getLine());
                    	

                    }
                    break;
                case 24 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:162:3: ^( INVOKE ID (opr= expression )* )
                    {
                    match(input,INVOKE,FOLLOW_INVOKE_in_expression718); 

                    match(input, Token.DOWN, null); 
                    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_expression720); 
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:162:15: (opr= expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==INVOKE||(LA11_0>=VAR && LA11_0<=StringLiteral)||LA11_0==41||(LA11_0>=44 && LA11_0<=68)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:162:16: opr= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression725);
                    	    opr=expression();

                    	    state._fsp--;

                    	    exprList.add(opr);

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    	   expr = new InvokeExpression((ID8!=null?ID8.getText():null), exprList, (ID8!=null?ID8.getLine():0));
                    	

                    }
                    break;
                case 25 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:166:3: IntegerLiteral
                    {
                    IntegerLiteral9=(CommonTree)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_expression736); 

                    	   Integer i = Integer.valueOf((IntegerLiteral9!=null?IntegerLiteral9.getText():null));
                    	   expr = new ConstantExpression(i,  (IntegerLiteral9!=null?IntegerLiteral9.getLine():0));
                    	

                    }
                    break;
                case 26 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:171:10: FloatingPointLiteral
                    {
                    FloatingPointLiteral10=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_expression750); 

                    	   Double d = Double.valueOf((FloatingPointLiteral10!=null?FloatingPointLiteral10.getText():null));
                    	   expr = new ConstantExpression(d,  (FloatingPointLiteral10!=null?FloatingPointLiteral10.getLine():0));
                    	

                    }
                    break;
                case 27 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:176:10: CharacterLiteral
                    {
                    CharacterLiteral11=(CommonTree)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_expression771); 

                               String s = (CharacterLiteral11!=null?CharacterLiteral11.getText():null);
                               s = s.substring(1, s.length()-1);
                               s = StringUtil.convertESC(s);
                    	   Character c = Character.valueOf(s.charAt(0));
                    	   expr = new ConstantExpression(c,  (CharacterLiteral11!=null?CharacterLiteral11.getLine():0));
                    	

                    }
                    break;
                case 28 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:184:10: StringLiteral
                    {
                    StringLiteral12=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_expression792); 

                               String s = (StringLiteral12!=null?StringLiteral12.getText():null);
                               s = s.substring(1, s.length()-1);
                               s = StringUtil.convertESC(s);
                    	   expr = new ConstantExpression(s,  (StringLiteral12!=null?StringLiteral12.getLine():0));
                    	

                    }
                    break;
                case 29 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:191:3: VAR
                    {
                    VAR13=(CommonTree)match(input,VAR,FOLLOW_VAR_in_expression806); 

                    	   expr = new VarExpression((VAR13!=null?VAR13.getText():null), (VAR13!=null?VAR13.getLine():0));
                    	

                    }
                    break;
                case 30 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:195:10: token= 'true'
                    {
                    token=(CommonTree)match(input,60,FOLLOW_60_in_expression822); 

                    	   expr = new ConstantExpression(Boolean.TRUE,  token.getLine());
                    	

                    }
                    break;
                case 31 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:199:10: token= 'false'
                    {
                    token=(CommonTree)match(input,61,FOLLOW_61_in_expression845); 

                    	   expr = new ConstantExpression(Boolean.FALSE,  token.getLine());
                    	

                    }
                    break;
                case 32 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\TreeCSL.g:203:10: token= 'null'
                    {
                    token=(CommonTree)match(input,59,FOLLOW_59_in_expression868); 

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
    public static final BitSet FOLLOW_ID_in_function89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PARAM_in_function94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function99 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_statement_in_function109 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_block_in_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement154 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement158 = new BitSet(new long[]{0x0000000C00000008L});
    public static final BitSet FOLLOW_34_in_statement173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement177 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_statement204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement224 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_statement244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_statement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block310 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_41_in_expression334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression338 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_expression351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression355 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_expression368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression372 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression389 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression406 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression423 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expression436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression440 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expression453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression457 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression474 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression491 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expression507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression511 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression528 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression545 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression562 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression579 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expression592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression596 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression613 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression630 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_expression643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression664 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_expression718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression720 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expression725 = new BitSet(new long[]{0xFFFFF3B210003E58L,0x000000000000001FL});
    public static final BitSet FOLLOW_IntegerLiteral_in_expression736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_expression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_expression771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_expression792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_expression806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression868 = new BitSet(new long[]{0x0000000000000002L});

}