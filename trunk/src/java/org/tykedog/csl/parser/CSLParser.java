// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g 2010-06-10 20:14:43
package org.tykedog.csl.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CSLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "PARAM", "INVOKE", "LANGUAGE", "ID", "VAR", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'def'", "'{'", "'}'", "'('", "','", "')'", "'if'", "'elif'", "'else'", "'while'", "'break'", "';'", "'continue'", "'return'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'~='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'null'", "'true'", "'false'"
    };
    public static final int FUNCTION=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int PARAM=5;
    public static final int T__61=61;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int WS=24;
    public static final int T__33=33;
    public static final int LANGUAGE=7;
    public static final int T__34=34;
    public static final int NEWLINE=23;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=20;
    public static final int FloatingPointLiteral=11;
    public static final int IntegerLiteral=10;
    public static final int INVOKE=6;
    public static final int Letter=22;
    public static final int OctalEscape=21;
    public static final int EscapeSequence=18;

    // delegates
    // delegators


        public CSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CSLParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g"; }


    public static class language_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "language"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:1: language : ( function )* -> ^( LANGUAGE ( function )* ) ;
    public final CSLParser.language_return language() throws RecognitionException {
        CSLParser.language_return retval = new CSLParser.language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.function_return function1 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:9: ( ( function )* -> ^( LANGUAGE ( function )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:11: ( function )*
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:11: ( function )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_language77);
            	    function1=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:21: -> ^( LANGUAGE ( function )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:24: ^( LANGUAGE ( function )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LANGUAGE, "LANGUAGE"), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:35: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "language"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:1: function : 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) ;
    public final CSLParser.function_return function() throws RecognitionException {
        CSLParser.function_return retval = new CSLParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;
        Token ID3=null;
        Token char_literal5=null;
        Token char_literal7=null;
        CSLParser.param_return param4 = null;

        CSLParser.statement_return statement6 = null;


        Object string_literal2_tree=null;
        Object ID3_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:10: ( 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:12: 'def' ID param '{' ( statement )* '}'
            {
            string_literal2=(Token)match(input,27,FOLLOW_27_in_function95); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(string_literal2);

            ID3=(Token)match(input,ID,FOLLOW_ID_in_function97); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID3);

            pushFollow(FOLLOW_param_in_function99);
            param4=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param4.getTree());
            char_literal5=(Token)match(input,28,FOLLOW_28_in_function101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal5);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:31: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=StringLiteral)||LA2_0==28||LA2_0==30||LA2_0==33||(LA2_0>=36 && LA2_0<=37)||(LA2_0>=39 && LA2_0<=40)||(LA2_0>=51 && LA2_0<=52)||(LA2_0>=56 && LA2_0<=61)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function103);
            	    statement6=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal7=(Token)match(input,29,FOLLOW_29_in_function106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal7);



            // AST REWRITE
            // elements: statement, param, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 21:46: -> ^( FUNCTION ID param ( statement )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:49: ^( FUNCTION ID param ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_param.nextTree());
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:69: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:1: param : '(' ( VAR ( ',' VAR )* )? ')' -> ^( PARAM ( VAR )* ) ;
    public final CSLParser.param_return param() throws RecognitionException {
        CSLParser.param_return retval = new CSLParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        Token VAR9=null;
        Token char_literal10=null;
        Token VAR11=null;
        Token char_literal12=null;

        Object char_literal8_tree=null;
        Object VAR9_tree=null;
        Object char_literal10_tree=null;
        Object VAR11_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:7: ( '(' ( VAR ( ',' VAR )* )? ')' -> ^( PARAM ( VAR )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:9: '(' ( VAR ( ',' VAR )* )? ')'
            {
            char_literal8=(Token)match(input,30,FOLLOW_30_in_param128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal8);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:12: ( VAR ( ',' VAR )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:13: VAR ( ',' VAR )*
                    {
                    VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_param130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR9);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:16: ( ',' VAR )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==31) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:17: ',' VAR
                    	    {
                    	    char_literal10=(Token)match(input,31,FOLLOW_31_in_param132); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_31.add(char_literal10);

                    	    VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_param133); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VAR.add(VAR11);


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal12=(Token)match(input,32,FOLLOW_32_in_param138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal12);



            // AST REWRITE
            // elements: VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:31: -> ^( PARAM ( VAR )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:34: ^( PARAM ( VAR )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:42: ( VAR )*
                while ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR.nextNode());

                }
                stream_VAR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:25:1: statement : ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' );
    public final CSLParser.statement_return statement() throws RecognitionException {
        CSLParser.statement_return retval = new CSLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        Token string_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token string_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        CSLParser.expression_return ifExpr = null;

        CSLParser.block_return ifBlock = null;

        CSLParser.expression_return elifExpr = null;

        CSLParser.block_return elifBlock = null;

        CSLParser.block_return elseBlock = null;

        CSLParser.block_return block13 = null;

        CSLParser.expression_return expression18 = null;

        CSLParser.block_return block19 = null;

        CSLParser.expression_return expression26 = null;


        Object string_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object string_literal22_tree=null;
        Object char_literal23_tree=null;
        Object string_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:26:2: ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' )
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
            case 37:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            case 40:
                {
                alt7=6;
                }
                break;
            case ID:
            case VAR:
            case IntegerLiteral:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case 30:
            case 51:
            case 52:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:27:2: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement158);
                    block13=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block13.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:4: 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )?
                    {
                    string_literal14=(Token)match(input,33,FOLLOW_33_in_statement164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal14);

                    pushFollow(FOLLOW_expression_in_statement168);
                    ifExpr=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifExpr.getTree());
                    pushFollow(FOLLOW_block_in_statement172);
                    ifBlock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(ifBlock.getTree());
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:41: ( 'elif' elifExpr= expression elifBlock= block )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:42: 'elif' elifExpr= expression elifBlock= block
                    	    {
                    	    string_literal15=(Token)match(input,34,FOLLOW_34_in_statement175); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_34.add(string_literal15);

                    	    pushFollow(FOLLOW_expression_in_statement179);
                    	    elifExpr=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(elifExpr.getTree());
                    	    pushFollow(FOLLOW_block_in_statement183);
                    	    elifBlock=block();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_block.add(elifBlock.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:87: ( 'else' elseBlock= block )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:88: 'else' elseBlock= block
                            {
                            string_literal16=(Token)match(input,35,FOLLOW_35_in_statement188); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_35.add(string_literal16);

                            pushFollow(FOLLOW_block_in_statement192);
                            elseBlock=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(elseBlock.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 33, elseBlock, elifExpr, 35, 34, ifBlock, elifBlock, ifExpr
                    // token labels: 
                    // rule labels: ifExpr, retval, ifBlock, elseBlock, elifExpr, elifBlock
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifExpr=new RewriteRuleSubtreeStream(adaptor,"rule ifExpr",ifExpr!=null?ifExpr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ifBlock=new RewriteRuleSubtreeStream(adaptor,"rule ifBlock",ifBlock!=null?ifBlock.tree:null);
                    RewriteRuleSubtreeStream stream_elseBlock=new RewriteRuleSubtreeStream(adaptor,"rule elseBlock",elseBlock!=null?elseBlock.tree:null);
                    RewriteRuleSubtreeStream stream_elifExpr=new RewriteRuleSubtreeStream(adaptor,"rule elifExpr",elifExpr!=null?elifExpr.tree:null);
                    RewriteRuleSubtreeStream stream_elifBlock=new RewriteRuleSubtreeStream(adaptor,"rule elifBlock",elifBlock!=null?elifBlock.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:3: -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:6: ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ifExpr.nextTree());
                        adaptor.addChild(root_1, stream_ifBlock.nextTree());
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:30: ( ^( 'elif' $elifExpr $elifBlock) )*
                        while ( stream_elifExpr.hasNext()||stream_34.hasNext()||stream_elifBlock.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:30: ^( 'elif' $elifExpr $elifBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elifExpr.nextTree());
                            adaptor.addChild(root_2, stream_elifBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_elifExpr.reset();
                        stream_34.reset();
                        stream_elifBlock.reset();
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:62: ( ^( 'else' $elseBlock) )?
                        if ( stream_elseBlock.hasNext()||stream_35.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:62: ^( 'else' $elseBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elseBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_elseBlock.reset();
                        stream_35.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:30:4: 'while' expression block
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal17=(Token)match(input,36,FOLLOW_36_in_statement232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal17_tree = (Object)adaptor.create(string_literal17);
                    root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_statement235);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());
                    pushFollow(FOLLOW_block_in_statement237);
                    block19=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block19.getTree());

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:31:4: 'break' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal20=(Token)match(input,37,FOLLOW_37_in_statement242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }
                    char_literal21=(Token)match(input,38,FOLLOW_38_in_statement244); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:4: 'continue' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal22=(Token)match(input,39,FOLLOW_39_in_statement250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    adaptor.addChild(root_0, string_literal22_tree);
                    }
                    char_literal23=(Token)match(input,38,FOLLOW_38_in_statement252); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:4: 'return' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal24=(Token)match(input,40,FOLLOW_40_in_statement258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal24_tree = (Object)adaptor.create(string_literal24);
                    adaptor.addChild(root_0, string_literal24_tree);
                    }
                    char_literal25=(Token)match(input,38,FOLLOW_38_in_statement260); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:5: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement267);
                    expression26=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression26.getTree());
                    char_literal27=(Token)match(input,38,FOLLOW_38_in_statement269); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:1: block : '{' ( statement )* '}' -> ^( '{' ( statement )* ) ;
    public final CSLParser.block_return block() throws RecognitionException {
        CSLParser.block_return retval = new CSLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        CSLParser.statement_return statement29 = null;


        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:7: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:9: '{' ( statement )* '}'
            {
            char_literal28=(Token)match(input,28,FOLLOW_28_in_block281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal28);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:13: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=StringLiteral)||LA8_0==28||LA8_0==30||LA8_0==33||(LA8_0>=36 && LA8_0<=37)||(LA8_0>=39 && LA8_0<=40)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=56 && LA8_0<=61)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block283);
            	    statement29=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement29.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal30=(Token)match(input,29,FOLLOW_29_in_block286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal30);



            // AST REWRITE
            // elements: 28, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:28: -> ^( '{' ( statement )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:31: ^( '{' ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_28.nextNode(), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:37: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:40:1: expression : conditionalExpression ( '=' expression )? ;
    public final CSLParser.expression_return expression() throws RecognitionException {
        CSLParser.expression_return retval = new CSLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        CSLParser.conditionalExpression_return conditionalExpression31 = null;

        CSLParser.expression_return expression33 = null;


        Object char_literal32_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:2: ( conditionalExpression ( '=' expression )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:4: conditionalExpression ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression306);
            conditionalExpression31=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression31.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:26: ( '=' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred14_CSL()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
                    {
                    char_literal32=(Token)match(input,41,FOLLOW_41_in_expression309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal32_tree = (Object)adaptor.create(char_literal32);
                    root_0 = (Object)adaptor.becomeRoot(char_literal32_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_expression312);
                    expression33=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression33.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:44:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
    public final CSLParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        CSLParser.conditionalExpression_return retval = new CSLParser.conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        CSLParser.conditionalOrExpression_return conditionalOrExpression34 = null;

        CSLParser.expression_return expression36 = null;

        CSLParser.expression_return expression38 = null;


        Object char_literal35_tree=null;
        Object char_literal37_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:9: conditionalOrExpression ( '?' expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression330);
            conditionalOrExpression34=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression34.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:33: ( '?' expression ':' expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:35: '?' expression ':' expression
                    {
                    char_literal35=(Token)match(input,42,FOLLOW_42_in_conditionalExpression334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    root_0 = (Object)adaptor.becomeRoot(char_literal35_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression337);
                    expression36=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression36.getTree());
                    char_literal37=(Token)match(input,43,FOLLOW_43_in_conditionalExpression339); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression342);
                    expression38=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression38.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:48:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final CSLParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        CSLParser.conditionalOrExpression_return retval = new CSLParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal40=null;
        CSLParser.conditionalAndExpression_return conditionalAndExpression39 = null;

        CSLParser.conditionalAndExpression_return conditionalAndExpression41 = null;


        Object string_literal40_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression361);
            conditionalAndExpression39=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression39.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:34: ( '||' conditionalAndExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:36: '||' conditionalAndExpression
            	    {
            	    string_literal40=(Token)match(input,44,FOLLOW_44_in_conditionalOrExpression365); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal40_tree = (Object)adaptor.create(string_literal40);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal40_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression368);
            	    conditionalAndExpression41=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression41.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:52:1: conditionalAndExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final CSLParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        CSLParser.conditionalAndExpression_return retval = new CSLParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        CSLParser.equalityExpression_return equalityExpression42 = null;

        CSLParser.equalityExpression_return equalityExpression44 = null;


        Object string_literal43_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:5: ( equalityExpression ( '&&' equalityExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression387);
            equalityExpression42=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression42.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:28: ( '&&' equalityExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:30: '&&' equalityExpression
            	    {
            	    string_literal43=(Token)match(input,45,FOLLOW_45_in_conditionalAndExpression391); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal43_tree = (Object)adaptor.create(string_literal43);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression394);
            	    equalityExpression44=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression44.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:56:1: equalityExpression : relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* ;
    public final CSLParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CSLParser.equalityExpression_return retval = new CSLParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46=null;
        Token string_literal47=null;
        Token string_literal48=null;
        CSLParser.relationalExpression_return relationalExpression45 = null;

        CSLParser.relationalExpression_return relationalExpression49 = null;


        Object string_literal46_tree=null;
        Object string_literal47_tree=null;
        Object string_literal48_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:5: ( relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:9: relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression413);
            relationalExpression45=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression45.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:30: ( ( '==' | '!=' | '~=' ) relationalExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' ) relationalExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:33: '=='
            	            {
            	            string_literal46=(Token)match(input,46,FOLLOW_46_in_equalityExpression418); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (Object)adaptor.create(string_literal46);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:41: '!='
            	            {
            	            string_literal47=(Token)match(input,47,FOLLOW_47_in_equalityExpression423); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal47_tree = (Object)adaptor.create(string_literal47);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:49: '~='
            	            {
            	            string_literal48=(Token)match(input,48,FOLLOW_48_in_equalityExpression428); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal48_tree = (Object)adaptor.create(string_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression432);
            	    relationalExpression49=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression49.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:60:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final CSLParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CSLParser.relationalExpression_return retval = new CSLParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.additiveExpression_return additiveExpression50 = null;

        CSLParser.relationalOp_return relationalOp51 = null;

        CSLParser.additiveExpression_return additiveExpression52 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:9: additiveExpression ( relationalOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression451);
            additiveExpression50=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression50.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:28: ( relationalOp additiveExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=49 && LA15_0<=50)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:30: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression455);
            	    relationalOp51=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(relationalOp51.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression458);
            	    additiveExpression52=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression52.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOp"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' ) ;
    public final CSLParser.relationalOp_return relationalOp() throws RecognitionException {
        CSLParser.relationalOp_return retval = new CSLParser.relationalOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;

        Object char_literal53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:2: ( ( '<' '=' | '>' '=' | '<' | '>' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
            {
            root_0 = (Object)adaptor.nil();

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==41) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=ID && LA16_1<=StringLiteral)||LA16_1==30||(LA16_1>=51 && LA16_1<=52)||(LA16_1>=56 && LA16_1<=61)) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==50) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==41) ) {
                    alt16=2;
                }
                else if ( ((LA16_2>=ID && LA16_2<=StringLiteral)||LA16_2==30||(LA16_2>=51 && LA16_2<=52)||(LA16_2>=56 && LA16_2<=61)) ) {
                    alt16=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:5: '<' '='
                    {
                    char_literal53=(Token)match(input,49,FOLLOW_49_in_relationalOp474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = (Object)adaptor.create(char_literal53);
                    adaptor.addChild(root_0, char_literal53_tree);
                    }
                    char_literal54=(Token)match(input,41,FOLLOW_41_in_relationalOp476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:15: '>' '='
                    {
                    char_literal55=(Token)match(input,50,FOLLOW_50_in_relationalOp480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    char_literal56=(Token)match(input,41,FOLLOW_41_in_relationalOp482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:25: '<'
                    {
                    char_literal57=(Token)match(input,49,FOLLOW_49_in_relationalOp486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    adaptor.addChild(root_0, char_literal57_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:31: '>'
                    {
                    char_literal58=(Token)match(input,50,FOLLOW_50_in_relationalOp490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:68:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CSLParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CSLParser.additiveExpression_return retval = new CSLParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        CSLParser.multiplicativeExpression_return multiplicativeExpression59 = null;

        CSLParser.multiplicativeExpression_return multiplicativeExpression62 = null;


        Object char_literal60_tree=null;
        Object char_literal61_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression507);
            multiplicativeExpression59=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression59.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=51 && LA18_0<=52)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==51) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==52) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:37: '+'
            	            {
            	            char_literal60=(Token)match(input,51,FOLLOW_51_in_additiveExpression512); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = (Object)adaptor.create(char_literal60);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:44: '-'
            	            {
            	            char_literal61=(Token)match(input,52,FOLLOW_52_in_additiveExpression517); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = (Object)adaptor.create(char_literal61);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression521);
            	    multiplicativeExpression62=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:72:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final CSLParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CSLParser.multiplicativeExpression_return retval = new CSLParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        CSLParser.unaryExpression_return unaryExpression63 = null;

        CSLParser.unaryExpression_return unaryExpression67 = null;


        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal66_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression540);
            unaryExpression63=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression63.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=53 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:29: '*'
            	            {
            	            char_literal64=(Token)match(input,53,FOLLOW_53_in_multiplicativeExpression546); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = (Object)adaptor.create(char_literal64);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:36: '/'
            	            {
            	            char_literal65=(Token)match(input,54,FOLLOW_54_in_multiplicativeExpression551); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = (Object)adaptor.create(char_literal65);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:43: '%'
            	            {
            	            char_literal66=(Token)match(input,55,FOLLOW_55_in_multiplicativeExpression556); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = (Object)adaptor.create(char_literal66);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression561);
            	    unaryExpression67=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression67.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:76:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression );
    public final CSLParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CSLParser.unaryExpression_return retval = new CSLParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68=null;
        Token char_literal70=null;
        Token string_literal72=null;
        Token string_literal74=null;
        Token char_literal76=null;
        CSLParser.unaryExpression_return unaryExpression69 = null;

        CSLParser.unaryExpression_return unaryExpression71 = null;

        CSLParser.unaryExpression_return unaryExpression73 = null;

        CSLParser.unaryExpression_return unaryExpression75 = null;

        CSLParser.unaryExpression_return unaryExpression77 = null;

        CSLParser.topExpression_return topExpression78 = null;


        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object string_literal72_tree=null;
        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:77:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt21=1;
                }
                break;
            case 52:
                {
                alt21=2;
                }
                break;
            case 56:
                {
                alt21=3;
                }
                break;
            case 57:
                {
                alt21=4;
                }
                break;
            case 58:
                {
                alt21=5;
                }
                break;
            case ID:
            case VAR:
            case IntegerLiteral:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case 30:
            case 59:
            case 60:
            case 61:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:77:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal68=(Token)match(input,51,FOLLOW_51_in_unaryExpression581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression584);
                    unaryExpression69=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression69.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:78:7: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal70=(Token)match(input,52,FOLLOW_52_in_unaryExpression592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = (Object)adaptor.create(char_literal70);
                    root_0 = (Object)adaptor.becomeRoot(char_literal70_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression595);
                    unaryExpression71=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression71.getTree());

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:79:9: '++' unaryExpression
                    {
                    string_literal72=(Token)match(input,56,FOLLOW_56_in_unaryExpression605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal72);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression607);
                    unaryExpression73=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression73.getTree());


                    // AST REWRITE
                    // elements: 56, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:30: -> ^( '++' unaryExpression )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:79:32: ^( '++' unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_56.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:80:9: '--' unaryExpression
                    {
                    string_literal74=(Token)match(input,57,FOLLOW_57_in_unaryExpression625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal74);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression627);
                    unaryExpression75=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression75.getTree());


                    // AST REWRITE
                    // elements: 57, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:30: -> ^( '--' unaryExpression )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:80:32: ^( '--' unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_57.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:81:9: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal76=(Token)match(input,58,FOLLOW_58_in_unaryExpression645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = (Object)adaptor.create(char_literal76);
                    root_0 = (Object)adaptor.becomeRoot(char_literal76_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression648);
                    unaryExpression77=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression77.getTree());

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:82:9: topExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topExpression_in_unaryExpression658);
                    topExpression78=topExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topExpression78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class topExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:85:1: topExpression : ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | VAR );
    public final CSLParser.topExpression_return topExpression() throws RecognitionException {
        CSLParser.topExpression_return retval = new CSLParser.topExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        Token char_literal81=null;
        Token ID82=null;
        Token VAR85=null;
        CSLParser.expression_return expression80 = null;

        CSLParser.arguments_return arguments83 = null;

        CSLParser.literal_return literal84 = null;


        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object ID82_tree=null;
        Object VAR85_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:86:5: ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | VAR )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case ID:
                {
                alt22=2;
                }
                break;
            case IntegerLiteral:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case 59:
            case 60:
            case 61:
                {
                alt22=3;
                }
                break;
            case VAR:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:87:5: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal79=(Token)match(input,30,FOLLOW_30_in_topExpression681); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_topExpression684);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression80.getTree());
                    char_literal81=(Token)match(input,32,FOLLOW_32_in_topExpression686); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:88:7: ID arguments
                    {
                    ID82=(Token)match(input,ID,FOLLOW_ID_in_topExpression696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID82);

                    pushFollow(FOLLOW_arguments_in_topExpression698);
                    arguments83=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments83.getTree());


                    // AST REWRITE
                    // elements: ID, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:20: -> ^( INVOKE ID arguments )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:88:23: ^( INVOKE ID arguments )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_arguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:89:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_topExpression716);
                    literal84=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal84.getTree());

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:90:7: VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR85=(Token)match(input,VAR,FOLLOW_VAR_in_topExpression724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR85_tree = (Object)adaptor.create(VAR85);
                    adaptor.addChild(root_0, VAR85_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:92:1: arguments : '(' ( expressionList )? ')' ;
    public final CSLParser.arguments_return arguments() throws RecognitionException {
        CSLParser.arguments_return retval = new CSLParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        Token char_literal88=null;
        CSLParser.expressionList_return expressionList87 = null;


        Object char_literal86_tree=null;
        Object char_literal88_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:2: ( '(' ( expressionList )? ')' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:4: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal86=(Token)match(input,30,FOLLOW_30_in_arguments734); if (state.failed) return retval;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:9: ( expressionList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ID && LA23_0<=StringLiteral)||LA23_0==30||(LA23_0>=51 && LA23_0<=52)||(LA23_0>=56 && LA23_0<=61)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments737);
                    expressionList87=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList87.getTree());

                    }
                    break;

            }

            char_literal88=(Token)match(input,32,FOLLOW_32_in_arguments740); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:97:1: expressionList : expression ( ',' expression )* -> ( expression )+ ;
    public final CSLParser.expressionList_return expressionList() throws RecognitionException {
        CSLParser.expressionList_return retval = new CSLParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal90=null;
        CSLParser.expression_return expression89 = null;

        CSLParser.expression_return expression91 = null;


        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:5: ( expression ( ',' expression )* -> ( expression )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList758);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:20: ( ',' expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:21: ',' expression
            	    {
            	    char_literal90=(Token)match(input,31,FOLLOW_31_in_expressionList761); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal90);

            	    pushFollow(FOLLOW_expression_in_expressionList763);
            	    expression91=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:38: -> ( expression )+
            {
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:104:1: literal : ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final CSLParser.literal_return literal() throws RecognitionException {
        CSLParser.literal_return retval = new CSLParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntegerLiteral92=null;
        Token FloatingPointLiteral93=null;
        Token CharacterLiteral94=null;
        Token StringLiteral95=null;
        Token string_literal97=null;
        CSLParser.booleanLiteral_return booleanLiteral96 = null;


        Object IntegerLiteral92_tree=null;
        Object FloatingPointLiteral93_tree=null;
        Object CharacterLiteral94_tree=null;
        Object StringLiteral95_tree=null;
        Object string_literal97_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:105:2: ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
                {
                alt25=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt25=2;
                }
                break;
            case CharacterLiteral:
                {
                alt25=3;
                }
                break;
            case StringLiteral:
                {
                alt25=4;
                }
                break;
            case 60:
            case 61:
                {
                alt25=5;
                }
                break;
            case 59:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:105:6: IntegerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerLiteral92=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral92_tree = (Object)adaptor.create(IntegerLiteral92);
                    adaptor.addChild(root_0, IntegerLiteral92_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    FloatingPointLiteral93=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral93_tree = (Object)adaptor.create(FloatingPointLiteral93);
                    adaptor.addChild(root_0, FloatingPointLiteral93_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    CharacterLiteral94=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral94_tree = (Object)adaptor.create(CharacterLiteral94);
                    adaptor.addChild(root_0, CharacterLiteral94_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral95=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral95_tree = (Object)adaptor.create(StringLiteral95);
                    adaptor.addChild(root_0, StringLiteral95_tree);
                    }

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:109:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal838);
                    booleanLiteral96=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral96.getTree());

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:110:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal97=(Token)match(input,59,FOLLOW_59_in_literal848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:120:1: booleanLiteral : ( 'true' | 'false' );
    public final CSLParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        CSLParser.booleanLiteral_return retval = new CSLParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;

        Object set98_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:121:5: ( 'true' | 'false' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
            {
            root_0 = (Object)adaptor.nil();

            set98=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set98));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    // $ANTLR start synpred14_CSL
    public final void synpred14_CSL_fragment() throws RecognitionException {   
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: ( '=' expression )
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
        {
        match(input,41,FOLLOW_41_in_synpred14_CSL309); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred14_CSL312);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_CSL

    // Delegated rules

    public final boolean synpred14_CSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_CSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_function_in_language77 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_function95 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_function97 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_function99 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function101 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_statement_in_function103 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_29_in_function106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_param128 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_VAR_in_param130 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_param132 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_in_param133 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_param138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement164 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement168 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement172 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_statement175 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement179 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement183 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_statement188 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_statement232 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement242 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement250 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement258 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement267 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block281 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_statement_in_block283 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_29_in_block286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression306 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression309 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expression312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression330 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_conditionalExpression334 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression337 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_conditionalExpression339 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression361 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_conditionalOrExpression365 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression368 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression387 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_conditionalAndExpression391 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression394 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression413 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_equalityExpression418 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_47_in_equalityExpression423 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_48_in_equalityExpression428 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression432 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression451 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression455 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression458 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp474 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp480 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression507 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_additiveExpression512 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_52_in_additiveExpression517 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression521 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression540 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_multiplicativeExpression546 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_54_in_multiplicativeExpression551 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_55_in_multiplicativeExpression556 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression561 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_51_in_unaryExpression581 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression592 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression605 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_unaryExpression625 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unaryExpression645 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topExpression_in_unaryExpression658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topExpression681 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_topExpression684 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_topExpression686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_topExpression696 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arguments_in_topExpression698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_topExpression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_topExpression724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arguments734 = new BitSet(new long[]{0x3F1801B350003F00L});
    public static final BitSet FOLLOW_expressionList_in_arguments737 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_arguments740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList758 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_expressionList761 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expressionList763 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_literal798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_literal848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_CSL309 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_synpred14_CSL312 = new BitSet(new long[]{0x0000000000000002L});

}