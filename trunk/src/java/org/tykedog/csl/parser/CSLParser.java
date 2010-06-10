// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g 2010-06-10 17:40:32
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "VAR", "PARAM", "INVOKE", "LANGUAGE", "ID", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'def'", "'{'", "'}'", "'('", "','", "')'", "'if'", "'elif'", "'else'", "'while'", "'break'", "';'", "'continue'", "'return'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'~='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'$'", "'null'", "'true'", "'false'"
    };
    public static final int FUNCTION=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int PARAM=6;
    public static final int ID=9;
    public static final int T__61=61;
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
    public static final int WS=24;
    public static final int LANGUAGE=8;
    public static final int T__33=33;
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
    public static final int INVOKE=7;
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
    public String getGrammarFileName() { return "D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g"; }


    public static class language_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "language"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:1: language : ( function )* -> ^( LANGUAGE ( function )* ) ;
    public final CSLParser.language_return language() throws RecognitionException {
        CSLParser.language_return retval = new CSLParser.language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.function_return function1 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:9: ( ( function )* -> ^( LANGUAGE ( function )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:11: ( function )*
            {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:11: ( function )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_language83);
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
            // 20:21: -> ^( LANGUAGE ( function )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:24: ^( LANGUAGE ( function )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LANGUAGE, "LANGUAGE"), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:20:35: ( function )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:1: function : 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:10: ( 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:12: 'def' ID param '{' ( statement )* '}'
            {
            string_literal2=(Token)match(input,27,FOLLOW_27_in_function101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(string_literal2);

            ID3=(Token)match(input,ID,FOLLOW_ID_in_function103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID3);

            pushFollow(FOLLOW_param_in_function105);
            param4=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param4.getTree());
            char_literal5=(Token)match(input,28,FOLLOW_28_in_function107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal5);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:31: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=StringLiteral)||LA2_0==28||LA2_0==30||LA2_0==33||(LA2_0>=36 && LA2_0<=37)||(LA2_0>=39 && LA2_0<=40)||(LA2_0>=51 && LA2_0<=52)||(LA2_0>=56 && LA2_0<=62)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function109);
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

            char_literal7=(Token)match(input,29,FOLLOW_29_in_function112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal7);



            // AST REWRITE
            // elements: ID, statement, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:46: -> ^( FUNCTION ID param ( statement )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:49: ^( FUNCTION ID param ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_param.nextTree());
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:22:69: ( statement )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:1: param : '(' ( var ( ',' var )* )? ')' -> ^( PARAM ( var )* ) ;
    public final CSLParser.param_return param() throws RecognitionException {
        CSLParser.param_return retval = new CSLParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        Token char_literal12=null;
        CSLParser.var_return var9 = null;

        CSLParser.var_return var11 = null;


        Object char_literal8_tree=null;
        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:7: ( '(' ( var ( ',' var )* )? ')' -> ^( PARAM ( var )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:9: '(' ( var ( ',' var )* )? ')'
            {
            char_literal8=(Token)match(input,30,FOLLOW_30_in_param134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal8);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:12: ( var ( ',' var )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:13: var ( ',' var )*
                    {
                    pushFollow(FOLLOW_var_in_param136);
                    var9=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_var.add(var9.getTree());
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:16: ( ',' var )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==31) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:17: ',' var
                    	    {
                    	    char_literal10=(Token)match(input,31,FOLLOW_31_in_param138); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_31.add(char_literal10);

                    	    pushFollow(FOLLOW_var_in_param139);
                    	    var11=var();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_var.add(var11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal12=(Token)match(input,32,FOLLOW_32_in_param144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal12);



            // AST REWRITE
            // elements: var
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 24:31: -> ^( PARAM ( var )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:34: ^( PARAM ( var )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:24:42: ( var )*
                while ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextTree());

                }
                stream_var.reset();

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:26:1: statement : ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' );
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:27:2: ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' )
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
            case 62:
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:2: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement164);
                    block13=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block13.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:4: 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )?
                    {
                    string_literal14=(Token)match(input,33,FOLLOW_33_in_statement170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal14);

                    pushFollow(FOLLOW_expression_in_statement174);
                    ifExpr=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifExpr.getTree());
                    pushFollow(FOLLOW_block_in_statement178);
                    ifBlock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(ifBlock.getTree());
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:41: ( 'elif' elifExpr= expression elifBlock= block )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:42: 'elif' elifExpr= expression elifBlock= block
                    	    {
                    	    string_literal15=(Token)match(input,34,FOLLOW_34_in_statement181); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_34.add(string_literal15);

                    	    pushFollow(FOLLOW_expression_in_statement185);
                    	    elifExpr=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(elifExpr.getTree());
                    	    pushFollow(FOLLOW_block_in_statement189);
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

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:87: ( 'else' elseBlock= block )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:88: 'else' elseBlock= block
                            {
                            string_literal16=(Token)match(input,35,FOLLOW_35_in_statement194); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_35.add(string_literal16);

                            pushFollow(FOLLOW_block_in_statement198);
                            elseBlock=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(elseBlock.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 34, elifBlock, elifExpr, ifExpr, 35, elseBlock, ifBlock, 33
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
                    // 30:3: -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                    {
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:6: ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ifExpr.nextTree());
                        adaptor.addChild(root_1, stream_ifBlock.nextTree());
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:30: ( ^( 'elif' $elifExpr $elifBlock) )*
                        while ( stream_34.hasNext()||stream_elifBlock.hasNext()||stream_elifExpr.hasNext() ) {
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:30: ^( 'elif' $elifExpr $elifBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elifExpr.nextTree());
                            adaptor.addChild(root_2, stream_elifBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_34.reset();
                        stream_elifBlock.reset();
                        stream_elifExpr.reset();
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:62: ( ^( 'else' $elseBlock) )?
                        if ( stream_35.hasNext()||stream_elseBlock.hasNext() ) {
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:62: ^( 'else' $elseBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elseBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_35.reset();
                        stream_elseBlock.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:31:4: 'while' expression block
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal17=(Token)match(input,36,FOLLOW_36_in_statement238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal17_tree = (Object)adaptor.create(string_literal17);
                    root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_statement241);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());
                    pushFollow(FOLLOW_block_in_statement243);
                    block19=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block19.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:32:4: 'break' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal20=(Token)match(input,37,FOLLOW_37_in_statement248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }
                    char_literal21=(Token)match(input,38,FOLLOW_38_in_statement250); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:33:4: 'continue' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal22=(Token)match(input,39,FOLLOW_39_in_statement256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    adaptor.addChild(root_0, string_literal22_tree);
                    }
                    char_literal23=(Token)match(input,38,FOLLOW_38_in_statement258); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:34:4: 'return' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal24=(Token)match(input,40,FOLLOW_40_in_statement264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal24_tree = (Object)adaptor.create(string_literal24);
                    adaptor.addChild(root_0, string_literal24_tree);
                    }
                    char_literal25=(Token)match(input,38,FOLLOW_38_in_statement266); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:35:5: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement273);
                    expression26=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression26.getTree());
                    char_literal27=(Token)match(input,38,FOLLOW_38_in_statement275); if (state.failed) return retval;

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:1: block : '{' ( statement )* '}' -> ^( '{' ( statement )* ) ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:7: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:9: '{' ( statement )* '}'
            {
            char_literal28=(Token)match(input,28,FOLLOW_28_in_block287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal28);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:13: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=StringLiteral)||LA8_0==28||LA8_0==30||LA8_0==33||(LA8_0>=36 && LA8_0<=37)||(LA8_0>=39 && LA8_0<=40)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=56 && LA8_0<=62)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block289);
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

            char_literal30=(Token)match(input,29,FOLLOW_29_in_block292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal30);



            // AST REWRITE
            // elements: statement, 28
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:28: -> ^( '{' ( statement )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:31: ^( '{' ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_28.nextNode(), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:38:37: ( statement )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:1: expression : conditionalExpression ( '=' expression )? ;
    public final CSLParser.expression_return expression() throws RecognitionException {
        CSLParser.expression_return retval = new CSLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        CSLParser.conditionalExpression_return conditionalExpression31 = null;

        CSLParser.expression_return expression33 = null;


        Object char_literal32_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:2: ( conditionalExpression ( '=' expression )? )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:4: conditionalExpression ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression312);
            conditionalExpression31=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression31.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:26: ( '=' expression )?
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:27: '=' expression
                    {
                    char_literal32=(Token)match(input,41,FOLLOW_41_in_expression315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal32_tree = (Object)adaptor.create(char_literal32);
                    root_0 = (Object)adaptor.becomeRoot(char_literal32_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_expression318);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:45:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:46:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:46:9: conditionalOrExpression ( '?' expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression336);
            conditionalOrExpression34=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression34.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:46:33: ( '?' expression ':' expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:46:35: '?' expression ':' expression
                    {
                    char_literal35=(Token)match(input,42,FOLLOW_42_in_conditionalExpression340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    root_0 = (Object)adaptor.becomeRoot(char_literal35_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression343);
                    expression36=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression36.getTree());
                    char_literal37=(Token)match(input,43,FOLLOW_43_in_conditionalExpression345); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression348);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:49:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final CSLParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        CSLParser.conditionalOrExpression_return retval = new CSLParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal40=null;
        CSLParser.conditionalAndExpression_return conditionalAndExpression39 = null;

        CSLParser.conditionalAndExpression_return conditionalAndExpression41 = null;


        Object string_literal40_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:50:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:50:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression367);
            conditionalAndExpression39=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression39.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:50:34: ( '||' conditionalAndExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:50:36: '||' conditionalAndExpression
            	    {
            	    string_literal40=(Token)match(input,44,FOLLOW_44_in_conditionalOrExpression371); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal40_tree = (Object)adaptor.create(string_literal40);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal40_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression374);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:53:1: conditionalAndExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final CSLParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        CSLParser.conditionalAndExpression_return retval = new CSLParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        CSLParser.equalityExpression_return equalityExpression42 = null;

        CSLParser.equalityExpression_return equalityExpression44 = null;


        Object string_literal43_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:54:5: ( equalityExpression ( '&&' equalityExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:54:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression393);
            equalityExpression42=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression42.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:54:28: ( '&&' equalityExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:54:30: '&&' equalityExpression
            	    {
            	    string_literal43=(Token)match(input,45,FOLLOW_45_in_conditionalAndExpression397); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal43_tree = (Object)adaptor.create(string_literal43);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression400);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:1: equalityExpression : relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:5: ( relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:9: relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression419);
            relationalExpression45=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression45.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:30: ( ( '==' | '!=' | '~=' ) relationalExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:32: ( '==' | '!=' | '~=' ) relationalExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:32: ( '==' | '!=' | '~=' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:33: '=='
            	            {
            	            string_literal46=(Token)match(input,46,FOLLOW_46_in_equalityExpression424); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal46_tree = (Object)adaptor.create(string_literal46);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:41: '!='
            	            {
            	            string_literal47=(Token)match(input,47,FOLLOW_47_in_equalityExpression429); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal47_tree = (Object)adaptor.create(string_literal47);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:58:49: '~='
            	            {
            	            string_literal48=(Token)match(input,48,FOLLOW_48_in_equalityExpression434); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal48_tree = (Object)adaptor.create(string_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression438);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:61:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final CSLParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CSLParser.relationalExpression_return retval = new CSLParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.additiveExpression_return additiveExpression50 = null;

        CSLParser.relationalOp_return relationalOp51 = null;

        CSLParser.additiveExpression_return additiveExpression52 = null;



        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:62:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:62:9: additiveExpression ( relationalOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression457);
            additiveExpression50=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression50.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:62:28: ( relationalOp additiveExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=49 && LA15_0<=50)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:62:30: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression461);
            	    relationalOp51=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(relationalOp51.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression464);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' ) ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:2: ( ( '<' '=' | '>' '=' | '<' | '>' ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:4: ( '<' '=' | '>' '=' | '<' | '>' )
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:4: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==41) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=ID && LA16_1<=StringLiteral)||LA16_1==30||(LA16_1>=51 && LA16_1<=52)||(LA16_1>=56 && LA16_1<=62)) ) {
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
                else if ( ((LA16_2>=ID && LA16_2<=StringLiteral)||LA16_2==30||(LA16_2>=51 && LA16_2<=52)||(LA16_2>=56 && LA16_2<=62)) ) {
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:5: '<' '='
                    {
                    char_literal53=(Token)match(input,49,FOLLOW_49_in_relationalOp480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = (Object)adaptor.create(char_literal53);
                    adaptor.addChild(root_0, char_literal53_tree);
                    }
                    char_literal54=(Token)match(input,41,FOLLOW_41_in_relationalOp482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:15: '>' '='
                    {
                    char_literal55=(Token)match(input,50,FOLLOW_50_in_relationalOp486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    char_literal56=(Token)match(input,41,FOLLOW_41_in_relationalOp488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:25: '<'
                    {
                    char_literal57=(Token)match(input,49,FOLLOW_49_in_relationalOp492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    adaptor.addChild(root_0, char_literal57_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:66:31: '>'
                    {
                    char_literal58=(Token)match(input,50,FOLLOW_50_in_relationalOp496); if (state.failed) return retval;
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression513);
            multiplicativeExpression59=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression59.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=51 && LA18_0<=52)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:36: ( '+' | '-' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:37: '+'
            	            {
            	            char_literal60=(Token)match(input,51,FOLLOW_51_in_additiveExpression518); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = (Object)adaptor.create(char_literal60);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:70:44: '-'
            	            {
            	            char_literal61=(Token)match(input,52,FOLLOW_52_in_additiveExpression523); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = (Object)adaptor.create(char_literal61);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression527);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression546);
            unaryExpression63=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression63.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=53 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:27: ( '*' | '/' | '%' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:29: '*'
            	            {
            	            char_literal64=(Token)match(input,53,FOLLOW_53_in_multiplicativeExpression552); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = (Object)adaptor.create(char_literal64);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:36: '/'
            	            {
            	            char_literal65=(Token)match(input,54,FOLLOW_54_in_multiplicativeExpression557); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = (Object)adaptor.create(char_literal65);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:74:43: '%'
            	            {
            	            char_literal66=(Token)match(input,55,FOLLOW_55_in_multiplicativeExpression562); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = (Object)adaptor.create(char_literal66);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression567);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:77:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression );
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:78:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression )
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
            case IntegerLiteral:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case 30:
            case 59:
            case 60:
            case 61:
            case 62:
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:78:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal68=(Token)match(input,51,FOLLOW_51_in_unaryExpression587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression590);
                    unaryExpression69=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression69.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:79:7: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal70=(Token)match(input,52,FOLLOW_52_in_unaryExpression598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = (Object)adaptor.create(char_literal70);
                    root_0 = (Object)adaptor.becomeRoot(char_literal70_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression601);
                    unaryExpression71=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression71.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:80:9: '++' unaryExpression
                    {
                    string_literal72=(Token)match(input,56,FOLLOW_56_in_unaryExpression611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal72);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression613);
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
                    // 80:30: -> ^( '++' unaryExpression )
                    {
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:80:32: ^( '++' unaryExpression )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:81:9: '--' unaryExpression
                    {
                    string_literal74=(Token)match(input,57,FOLLOW_57_in_unaryExpression631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal74);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression633);
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
                    // 81:30: -> ^( '--' unaryExpression )
                    {
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:81:32: ^( '--' unaryExpression )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:82:9: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal76=(Token)match(input,58,FOLLOW_58_in_unaryExpression651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = (Object)adaptor.create(char_literal76);
                    root_0 = (Object)adaptor.becomeRoot(char_literal76_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression654);
                    unaryExpression77=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression77.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:83:9: topExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topExpression_in_unaryExpression664);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:86:1: topExpression : ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | var );
    public final CSLParser.topExpression_return topExpression() throws RecognitionException {
        CSLParser.topExpression_return retval = new CSLParser.topExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        Token char_literal81=null;
        Token ID82=null;
        CSLParser.expression_return expression80 = null;

        CSLParser.arguments_return arguments83 = null;

        CSLParser.literal_return literal84 = null;

        CSLParser.var_return var85 = null;


        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object ID82_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:87:5: ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | var )
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
            case 60:
            case 61:
            case 62:
                {
                alt22=3;
                }
                break;
            case 59:
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:88:5: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal79=(Token)match(input,30,FOLLOW_30_in_topExpression687); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_topExpression690);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression80.getTree());
                    char_literal81=(Token)match(input,32,FOLLOW_32_in_topExpression692); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:89:7: ID arguments
                    {
                    ID82=(Token)match(input,ID,FOLLOW_ID_in_topExpression702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID82);

                    pushFollow(FOLLOW_arguments_in_topExpression704);
                    arguments83=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments83.getTree());


                    // AST REWRITE
                    // elements: arguments, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:20: -> ^( INVOKE ID arguments )
                    {
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:89:23: ^( INVOKE ID arguments )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:90:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_topExpression722);
                    literal84=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal84.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:91:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_topExpression730);
                    var85=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var85.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:93:1: arguments : '(' ( expressionList )? ')' ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:94:2: ( '(' ( expressionList )? ')' )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:94:4: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal86=(Token)match(input,30,FOLLOW_30_in_arguments740); if (state.failed) return retval;
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:94:9: ( expressionList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ID && LA23_0<=StringLiteral)||LA23_0==30||(LA23_0>=51 && LA23_0<=52)||(LA23_0>=56 && LA23_0<=62)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments743);
                    expressionList87=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList87.getTree());

                    }
                    break;

            }

            char_literal88=(Token)match(input,32,FOLLOW_32_in_arguments746); if (state.failed) return retval;

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:98:1: expressionList : expression ( ',' expression )* -> ( expression )+ ;
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
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:99:5: ( expression ( ',' expression )* -> ( expression )+ )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:99:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList764);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:99:20: ( ',' expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:99:21: ',' expression
            	    {
            	    char_literal90=(Token)match(input,31,FOLLOW_31_in_expressionList767); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal90);

            	    pushFollow(FOLLOW_expression_in_expressionList769);
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
            // 99:38: -> ( expression )+
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

    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:102:1: var : '$' ID -> ^( VAR ID ) ;
    public final CSLParser.var_return var() throws RecognitionException {
        CSLParser.var_return retval = new CSLParser.var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        Token ID93=null;

        Object char_literal92_tree=null;
        Object ID93_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:102:5: ( '$' ID -> ^( VAR ID ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:102:7: '$' ID
            {
            char_literal92=(Token)match(input,59,FOLLOW_59_in_var789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal92);

            ID93=(Token)match(input,ID,FOLLOW_ID_in_var790); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID93);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:13: -> ^( VAR ID )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:102:16: ^( VAR ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

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
    // $ANTLR end "var"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:105:1: literal : ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final CSLParser.literal_return literal() throws RecognitionException {
        CSLParser.literal_return retval = new CSLParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntegerLiteral94=null;
        Token FloatingPointLiteral95=null;
        Token CharacterLiteral96=null;
        Token StringLiteral97=null;
        Token string_literal99=null;
        CSLParser.booleanLiteral_return booleanLiteral98 = null;


        Object IntegerLiteral94_tree=null;
        Object FloatingPointLiteral95_tree=null;
        Object CharacterLiteral96_tree=null;
        Object StringLiteral97_tree=null;
        Object string_literal99_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:106:2: ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
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
            case 61:
            case 62:
                {
                alt25=5;
                }
                break;
            case 60:
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:106:6: IntegerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerLiteral94=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral94_tree = (Object)adaptor.create(IntegerLiteral94);
                    adaptor.addChild(root_0, IntegerLiteral94_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:107:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    FloatingPointLiteral95=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral95_tree = (Object)adaptor.create(FloatingPointLiteral95);
                    adaptor.addChild(root_0, FloatingPointLiteral95_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:108:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    CharacterLiteral96=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral96_tree = (Object)adaptor.create(CharacterLiteral96);
                    adaptor.addChild(root_0, CharacterLiteral96_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:109:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral97=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral97_tree = (Object)adaptor.create(StringLiteral97);
                    adaptor.addChild(root_0, StringLiteral97_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:110:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal851);
                    booleanLiteral98=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral98.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:111:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal99=(Token)match(input,60,FOLLOW_60_in_literal861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal99_tree = (Object)adaptor.create(string_literal99);
                    adaptor.addChild(root_0, string_literal99_tree);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:121:1: booleanLiteral : ( 'true' | 'false' );
    public final CSLParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        CSLParser.booleanLiteral_return retval = new CSLParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:122:5: ( 'true' | 'false' )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
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
        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:27: ( '=' expression )
        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:42:27: '=' expression
        {
        match(input,41,FOLLOW_41_in_synpred14_CSL315); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred14_CSL318);
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


 

    public static final BitSet FOLLOW_function_in_language83 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_function101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_function103 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_function105 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function107 = new BitSet(new long[]{0x7F1801B270003E00L});
    public static final BitSet FOLLOW_statement_in_function109 = new BitSet(new long[]{0x7F1801B270003E00L});
    public static final BitSet FOLLOW_29_in_function112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_param134 = new BitSet(new long[]{0x7F1801B350003E00L});
    public static final BitSet FOLLOW_var_in_param136 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_param138 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_var_in_param139 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_param144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement170 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_statement174 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement178 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_statement181 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_statement185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement189 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_statement194 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_statement238 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_statement241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement248 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement256 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement264 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement273 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block287 = new BitSet(new long[]{0x7F1801B270003E00L});
    public static final BitSet FOLLOW_statement_in_block289 = new BitSet(new long[]{0x7F1801B270003E00L});
    public static final BitSet FOLLOW_29_in_block292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression312 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression315 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_expression318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression336 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_conditionalExpression340 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression343 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_conditionalExpression345 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression367 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_conditionalOrExpression371 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression374 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression393 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_conditionalAndExpression397 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression400 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression419 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_equalityExpression424 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_47_in_equalityExpression429 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_48_in_equalityExpression434 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression438 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression457 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression461 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression464 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp480 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp486 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression513 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_additiveExpression518 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_52_in_additiveExpression523 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression527 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression546 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_multiplicativeExpression552 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_54_in_multiplicativeExpression557 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_55_in_multiplicativeExpression562 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression567 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_51_in_unaryExpression587 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression598 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression611 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_unaryExpression631 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unaryExpression651 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topExpression_in_unaryExpression664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topExpression687 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_topExpression690 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_topExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_topExpression702 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arguments_in_topExpression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_topExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_topExpression730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arguments740 = new BitSet(new long[]{0x7F1801B350003E00L});
    public static final BitSet FOLLOW_expressionList_in_arguments743 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_arguments746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList764 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_expressionList767 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_expressionList769 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_59_in_var789 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_var790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_literal811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_literal861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_CSL315 = new BitSet(new long[]{0x7F1801B250003E00L});
    public static final BitSet FOLLOW_expression_in_synpred14_CSL318 = new BitSet(new long[]{0x0000000000000002L});

}