// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g 2010-06-11 10:33:47
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
    public String getGrammarFileName() { return "D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g"; }


    public static class language_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "language"
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:1: language : ( statement | function )* -> ^( LANGUAGE ( statement )* ( function )* ) ;
    public final CSLParser.language_return language() throws RecognitionException {
        CSLParser.language_return retval = new CSLParser.language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.statement_return statement1 = null;

        CSLParser.function_return function2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:9: ( ( statement | function )* -> ^( LANGUAGE ( statement )* ( function )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:11: ( statement | function )*
            {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:11: ( statement | function )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=StringLiteral)||LA1_0==28||LA1_0==30||LA1_0==33||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=40)||(LA1_0>=51 && LA1_0<=52)||(LA1_0>=56 && LA1_0<=61)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==27) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_language78);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:22: function
            	    {
            	    pushFollow(FOLLOW_function_in_language80);
            	    function2=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: function, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:33: -> ^( LANGUAGE ( statement )* ( function )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:36: ^( LANGUAGE ( statement )* ( function )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LANGUAGE, "LANGUAGE"), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:19:58: ( function )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:1: function : 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) ;
    public final CSLParser.function_return function() throws RecognitionException {
        CSLParser.function_return retval = new CSLParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        CSLParser.param_return param5 = null;

        CSLParser.statement_return statement7 = null;


        Object string_literal3_tree=null;
        Object ID4_tree=null;
        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:10: ( 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:12: 'def' ID param '{' ( statement )* '}'
            {
            string_literal3=(Token)match(input,27,FOLLOW_27_in_function103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_function105); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID4);

            pushFollow(FOLLOW_param_in_function107);
            param5=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param5.getTree());
            char_literal6=(Token)match(input,28,FOLLOW_28_in_function109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal6);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:31: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=StringLiteral)||LA2_0==28||LA2_0==30||LA2_0==33||(LA2_0>=36 && LA2_0<=37)||(LA2_0>=39 && LA2_0<=40)||(LA2_0>=51 && LA2_0<=52)||(LA2_0>=56 && LA2_0<=61)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function111);
            	    statement7=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal8=(Token)match(input,29,FOLLOW_29_in_function114); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal8);



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
            // 21:46: -> ^( FUNCTION ID param ( statement )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:49: ^( FUNCTION ID param ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_param.nextTree());
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:21:69: ( statement )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:1: param : '(' ( VAR ( ',' VAR )* )? ')' -> ^( PARAM ( VAR )* ) ;
    public final CSLParser.param_return param() throws RecognitionException {
        CSLParser.param_return retval = new CSLParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        Token VAR10=null;
        Token char_literal11=null;
        Token VAR12=null;
        Token char_literal13=null;

        Object char_literal9_tree=null;
        Object VAR10_tree=null;
        Object char_literal11_tree=null;
        Object VAR12_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:7: ( '(' ( VAR ( ',' VAR )* )? ')' -> ^( PARAM ( VAR )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:9: '(' ( VAR ( ',' VAR )* )? ')'
            {
            char_literal9=(Token)match(input,30,FOLLOW_30_in_param136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal9);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:12: ( VAR ( ',' VAR )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:13: VAR ( ',' VAR )*
                    {
                    VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_param138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR10);

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:16: ( ',' VAR )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==31) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:17: ',' VAR
                    	    {
                    	    char_literal11=(Token)match(input,31,FOLLOW_31_in_param140); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_31.add(char_literal11);

                    	    VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_param141); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VAR.add(VAR12);


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal13=(Token)match(input,32,FOLLOW_32_in_param146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal13);



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
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:34: ^( PARAM ( VAR )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:23:42: ( VAR )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:25:1: statement : ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' );
    public final CSLParser.statement_return statement() throws RecognitionException {
        CSLParser.statement_return retval = new CSLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        CSLParser.expression_return ifExpr = null;

        CSLParser.block_return ifBlock = null;

        CSLParser.expression_return elifExpr = null;

        CSLParser.block_return elifBlock = null;

        CSLParser.block_return elseBlock = null;

        CSLParser.block_return block14 = null;

        CSLParser.expression_return expression19 = null;

        CSLParser.block_return block20 = null;

        CSLParser.expression_return expression27 = null;


        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        Object string_literal21_tree=null;
        Object char_literal22_tree=null;
        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object string_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:26:2: ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ';' | expression ';' )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:27:2: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement166);
                    block14=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block14.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:4: 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )?
                    {
                    string_literal15=(Token)match(input,33,FOLLOW_33_in_statement172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal15);

                    pushFollow(FOLLOW_expression_in_statement176);
                    ifExpr=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifExpr.getTree());
                    pushFollow(FOLLOW_block_in_statement180);
                    ifBlock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(ifBlock.getTree());
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:41: ( 'elif' elifExpr= expression elifBlock= block )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:42: 'elif' elifExpr= expression elifBlock= block
                    	    {
                    	    string_literal16=(Token)match(input,34,FOLLOW_34_in_statement183); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_34.add(string_literal16);

                    	    pushFollow(FOLLOW_expression_in_statement187);
                    	    elifExpr=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(elifExpr.getTree());
                    	    pushFollow(FOLLOW_block_in_statement191);
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

                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:87: ( 'else' elseBlock= block )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:28:88: 'else' elseBlock= block
                            {
                            string_literal17=(Token)match(input,35,FOLLOW_35_in_statement196); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_35.add(string_literal17);

                            pushFollow(FOLLOW_block_in_statement200);
                            elseBlock=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(elseBlock.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: elifExpr, ifBlock, ifExpr, 35, elseBlock, 34, 33, elifBlock
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
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:6: ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ifExpr.nextTree());
                        adaptor.addChild(root_1, stream_ifBlock.nextTree());
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:30: ( ^( 'elif' $elifExpr $elifBlock) )*
                        while ( stream_elifExpr.hasNext()||stream_34.hasNext()||stream_elifBlock.hasNext() ) {
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:30: ^( 'elif' $elifExpr $elifBlock)
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
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:62: ( ^( 'else' $elseBlock) )?
                        if ( stream_35.hasNext()||stream_elseBlock.hasNext() ) {
                            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:29:62: ^( 'else' $elseBlock)
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:30:4: 'while' expression block
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,36,FOLLOW_36_in_statement240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    root_0 = (Object)adaptor.becomeRoot(string_literal18_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_statement243);
                    expression19=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression19.getTree());
                    pushFollow(FOLLOW_block_in_statement245);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:31:4: 'break' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal21=(Token)match(input,37,FOLLOW_37_in_statement250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = (Object)adaptor.create(string_literal21);
                    adaptor.addChild(root_0, string_literal21_tree);
                    }
                    char_literal22=(Token)match(input,38,FOLLOW_38_in_statement252); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:32:4: 'continue' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal23=(Token)match(input,39,FOLLOW_39_in_statement258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal23_tree = (Object)adaptor.create(string_literal23);
                    adaptor.addChild(root_0, string_literal23_tree);
                    }
                    char_literal24=(Token)match(input,38,FOLLOW_38_in_statement260); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:33:4: 'return' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal25=(Token)match(input,40,FOLLOW_40_in_statement266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = (Object)adaptor.create(string_literal25);
                    adaptor.addChild(root_0, string_literal25_tree);
                    }
                    char_literal26=(Token)match(input,38,FOLLOW_38_in_statement268); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:34:5: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement275);
                    expression27=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression27.getTree());
                    char_literal28=(Token)match(input,38,FOLLOW_38_in_statement277); if (state.failed) return retval;

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:1: block : '{' ( statement )* '}' -> ^( '{' ( statement )* ) ;
    public final CSLParser.block_return block() throws RecognitionException {
        CSLParser.block_return retval = new CSLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal31=null;
        CSLParser.statement_return statement30 = null;


        Object char_literal29_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:7: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:9: '{' ( statement )* '}'
            {
            char_literal29=(Token)match(input,28,FOLLOW_28_in_block289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal29);

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:13: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=StringLiteral)||LA8_0==28||LA8_0==30||LA8_0==33||(LA8_0>=36 && LA8_0<=37)||(LA8_0>=39 && LA8_0<=40)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=56 && LA8_0<=61)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block291);
            	    statement30=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement30.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal31=(Token)match(input,29,FOLLOW_29_in_block294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal31);



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
            // 37:28: -> ^( '{' ( statement )* )
            {
                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:31: ^( '{' ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_28.nextNode(), root_1);

                // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:37:37: ( statement )*
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:40:1: expression : conditionalExpression ( '=' expression )? ;
    public final CSLParser.expression_return expression() throws RecognitionException {
        CSLParser.expression_return retval = new CSLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        CSLParser.conditionalExpression_return conditionalExpression32 = null;

        CSLParser.expression_return expression34 = null;


        Object char_literal33_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:2: ( conditionalExpression ( '=' expression )? )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:4: conditionalExpression ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression314);
            conditionalExpression32=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression32.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:26: ( '=' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred15_CSL()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
                    {
                    char_literal33=(Token)match(input,41,FOLLOW_41_in_expression317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = (Object)adaptor.create(char_literal33);
                    root_0 = (Object)adaptor.becomeRoot(char_literal33_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_expression320);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression34.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:44:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
    public final CSLParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        CSLParser.conditionalExpression_return retval = new CSLParser.conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        CSLParser.conditionalOrExpression_return conditionalOrExpression35 = null;

        CSLParser.expression_return expression37 = null;

        CSLParser.expression_return expression39 = null;


        Object char_literal36_tree=null;
        Object char_literal38_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:45:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:45:9: conditionalOrExpression ( '?' expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression338);
            conditionalOrExpression35=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression35.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:45:33: ( '?' expression ':' expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:45:35: '?' expression ':' expression
                    {
                    char_literal36=(Token)match(input,42,FOLLOW_42_in_conditionalExpression342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression345);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression37.getTree());
                    char_literal38=(Token)match(input,43,FOLLOW_43_in_conditionalExpression347); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression350);
                    expression39=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression39.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:48:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final CSLParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        CSLParser.conditionalOrExpression_return retval = new CSLParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        CSLParser.conditionalAndExpression_return conditionalAndExpression40 = null;

        CSLParser.conditionalAndExpression_return conditionalAndExpression42 = null;


        Object string_literal41_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:49:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:49:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression369);
            conditionalAndExpression40=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression40.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:49:34: ( '||' conditionalAndExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:49:36: '||' conditionalAndExpression
            	    {
            	    string_literal41=(Token)match(input,44,FOLLOW_44_in_conditionalOrExpression373); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal41_tree = (Object)adaptor.create(string_literal41);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal41_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression376);
            	    conditionalAndExpression42=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression42.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:52:1: conditionalAndExpression : equalityExpression ( '&&' equalityExpression )* ;
    public final CSLParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        CSLParser.conditionalAndExpression_return retval = new CSLParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        CSLParser.equalityExpression_return equalityExpression43 = null;

        CSLParser.equalityExpression_return equalityExpression45 = null;


        Object string_literal44_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:53:5: ( equalityExpression ( '&&' equalityExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:53:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression395);
            equalityExpression43=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression43.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:53:28: ( '&&' equalityExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:53:30: '&&' equalityExpression
            	    {
            	    string_literal44=(Token)match(input,45,FOLLOW_45_in_conditionalAndExpression399); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal44_tree = (Object)adaptor.create(string_literal44);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal44_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression402);
            	    equalityExpression45=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression45.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:56:1: equalityExpression : relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* ;
    public final CSLParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CSLParser.equalityExpression_return retval = new CSLParser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token string_literal48=null;
        Token string_literal49=null;
        CSLParser.relationalExpression_return relationalExpression46 = null;

        CSLParser.relationalExpression_return relationalExpression50 = null;


        Object string_literal47_tree=null;
        Object string_literal48_tree=null;
        Object string_literal49_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:5: ( relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:9: relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression421);
            relationalExpression46=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression46.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:30: ( ( '==' | '!=' | '~=' ) relationalExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' ) relationalExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:33: '=='
            	            {
            	            string_literal47=(Token)match(input,46,FOLLOW_46_in_equalityExpression426); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal47_tree = (Object)adaptor.create(string_literal47);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:41: '!='
            	            {
            	            string_literal48=(Token)match(input,47,FOLLOW_47_in_equalityExpression431); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal48_tree = (Object)adaptor.create(string_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:57:49: '~='
            	            {
            	            string_literal49=(Token)match(input,48,FOLLOW_48_in_equalityExpression436); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal49_tree = (Object)adaptor.create(string_literal49);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression440);
            	    relationalExpression50=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression50.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:60:1: relationalExpression : additiveExpression ( relationalOp additiveExpression )* ;
    public final CSLParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CSLParser.relationalExpression_return retval = new CSLParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.additiveExpression_return additiveExpression51 = null;

        CSLParser.relationalOp_return relationalOp52 = null;

        CSLParser.additiveExpression_return additiveExpression53 = null;



        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:61:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:61:9: additiveExpression ( relationalOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression459);
            additiveExpression51=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression51.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:61:28: ( relationalOp additiveExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=49 && LA15_0<=50)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:61:30: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression463);
            	    relationalOp52=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(relationalOp52.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression466);
            	    additiveExpression53=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression53.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:64:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' ) ;
    public final CSLParser.relationalOp_return relationalOp() throws RecognitionException {
        CSLParser.relationalOp_return retval = new CSLParser.relationalOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;

        Object char_literal54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:2: ( ( '<' '=' | '>' '=' | '<' | '>' ) )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:5: '<' '='
                    {
                    char_literal54=(Token)match(input,49,FOLLOW_49_in_relationalOp482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }
                    char_literal55=(Token)match(input,41,FOLLOW_41_in_relationalOp484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:15: '>' '='
                    {
                    char_literal56=(Token)match(input,50,FOLLOW_50_in_relationalOp488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    char_literal57=(Token)match(input,41,FOLLOW_41_in_relationalOp490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    adaptor.addChild(root_0, char_literal57_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:25: '<'
                    {
                    char_literal58=(Token)match(input,49,FOLLOW_49_in_relationalOp494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:65:31: '>'
                    {
                    char_literal59=(Token)match(input,50,FOLLOW_50_in_relationalOp498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = (Object)adaptor.create(char_literal59);
                    adaptor.addChild(root_0, char_literal59_tree);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:68:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CSLParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CSLParser.additiveExpression_return retval = new CSLParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal61=null;
        Token char_literal62=null;
        CSLParser.multiplicativeExpression_return multiplicativeExpression60 = null;

        CSLParser.multiplicativeExpression_return multiplicativeExpression63 = null;


        Object char_literal61_tree=null;
        Object char_literal62_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression515);
            multiplicativeExpression60=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression60.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=51 && LA18_0<=52)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:37: '+'
            	            {
            	            char_literal61=(Token)match(input,51,FOLLOW_51_in_additiveExpression520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = (Object)adaptor.create(char_literal61);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:69:44: '-'
            	            {
            	            char_literal62=(Token)match(input,52,FOLLOW_52_in_additiveExpression525); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal62_tree = (Object)adaptor.create(char_literal62);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal62_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression529);
            	    multiplicativeExpression63=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression63.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:72:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final CSLParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CSLParser.multiplicativeExpression_return retval = new CSLParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        CSLParser.unaryExpression_return unaryExpression64 = null;

        CSLParser.unaryExpression_return unaryExpression68 = null;


        Object char_literal65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal67_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression548);
            unaryExpression64=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression64.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=53 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' )
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
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:29: '*'
            	            {
            	            char_literal65=(Token)match(input,53,FOLLOW_53_in_multiplicativeExpression554); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = (Object)adaptor.create(char_literal65);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:36: '/'
            	            {
            	            char_literal66=(Token)match(input,54,FOLLOW_54_in_multiplicativeExpression559); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = (Object)adaptor.create(char_literal66);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:73:43: '%'
            	            {
            	            char_literal67=(Token)match(input,55,FOLLOW_55_in_multiplicativeExpression564); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal67_tree = (Object)adaptor.create(char_literal67);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal67_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression569);
            	    unaryExpression68=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression68.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:76:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression );
    public final CSLParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CSLParser.unaryExpression_return retval = new CSLParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Token string_literal73=null;
        Token string_literal75=null;
        Token char_literal77=null;
        CSLParser.unaryExpression_return unaryExpression70 = null;

        CSLParser.unaryExpression_return unaryExpression72 = null;

        CSLParser.unaryExpression_return unaryExpression74 = null;

        CSLParser.unaryExpression_return unaryExpression76 = null;

        CSLParser.unaryExpression_return unaryExpression78 = null;

        CSLParser.topExpression_return topExpression79 = null;


        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object string_literal73_tree=null;
        Object string_literal75_tree=null;
        Object char_literal77_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:77:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:77:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal69=(Token)match(input,51,FOLLOW_51_in_unaryExpression589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal69_tree = (Object)adaptor.create(char_literal69);
                    root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression592);
                    unaryExpression70=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression70.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:78:7: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal71=(Token)match(input,52,FOLLOW_52_in_unaryExpression600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = (Object)adaptor.create(char_literal71);
                    root_0 = (Object)adaptor.becomeRoot(char_literal71_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression603);
                    unaryExpression72=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression72.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:79:9: '++' unaryExpression
                    {
                    string_literal73=(Token)match(input,56,FOLLOW_56_in_unaryExpression613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal73);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression615);
                    unaryExpression74=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression74.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, 56
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
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:79:32: ^( '++' unaryExpression )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:80:9: '--' unaryExpression
                    {
                    string_literal75=(Token)match(input,57,FOLLOW_57_in_unaryExpression633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal75);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression635);
                    unaryExpression76=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression76.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, 57
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
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:80:32: ^( '--' unaryExpression )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:81:9: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal77=(Token)match(input,58,FOLLOW_58_in_unaryExpression653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    root_0 = (Object)adaptor.becomeRoot(char_literal77_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression656);
                    unaryExpression78=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression78.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:82:9: topExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topExpression_in_unaryExpression666);
                    topExpression79=topExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topExpression79.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:85:1: topExpression : ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | VAR );
    public final CSLParser.topExpression_return topExpression() throws RecognitionException {
        CSLParser.topExpression_return retval = new CSLParser.topExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        Token char_literal82=null;
        Token ID83=null;
        Token VAR86=null;
        CSLParser.expression_return expression81 = null;

        CSLParser.arguments_return arguments84 = null;

        CSLParser.literal_return literal85 = null;


        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object ID83_tree=null;
        Object VAR86_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:86:5: ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | VAR )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:87:5: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal80=(Token)match(input,30,FOLLOW_30_in_topExpression689); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_topExpression692);
                    expression81=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression81.getTree());
                    char_literal82=(Token)match(input,32,FOLLOW_32_in_topExpression694); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:88:7: ID arguments
                    {
                    ID83=(Token)match(input,ID,FOLLOW_ID_in_topExpression704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID83);

                    pushFollow(FOLLOW_arguments_in_topExpression706);
                    arguments84=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments84.getTree());


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
                    // 88:20: -> ^( INVOKE ID arguments )
                    {
                        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:88:23: ^( INVOKE ID arguments )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:89:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_topExpression724);
                    literal85=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal85.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:90:7: VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR86=(Token)match(input,VAR,FOLLOW_VAR_in_topExpression732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR86_tree = (Object)adaptor.create(VAR86);
                    adaptor.addChild(root_0, VAR86_tree);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:92:1: arguments : '(' ( expressionList )? ')' ;
    public final CSLParser.arguments_return arguments() throws RecognitionException {
        CSLParser.arguments_return retval = new CSLParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal87=null;
        Token char_literal89=null;
        CSLParser.expressionList_return expressionList88 = null;


        Object char_literal87_tree=null;
        Object char_literal89_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:93:2: ( '(' ( expressionList )? ')' )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:93:4: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal87=(Token)match(input,30,FOLLOW_30_in_arguments742); if (state.failed) return retval;
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:93:9: ( expressionList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ID && LA23_0<=StringLiteral)||LA23_0==30||(LA23_0>=51 && LA23_0<=52)||(LA23_0>=56 && LA23_0<=61)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments745);
                    expressionList88=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList88.getTree());

                    }
                    break;

            }

            char_literal89=(Token)match(input,32,FOLLOW_32_in_arguments748); if (state.failed) return retval;

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:97:1: expressionList : expression ( ',' expression )* -> ( expression )+ ;
    public final CSLParser.expressionList_return expressionList() throws RecognitionException {
        CSLParser.expressionList_return retval = new CSLParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal91=null;
        CSLParser.expression_return expression90 = null;

        CSLParser.expression_return expression92 = null;


        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:98:5: ( expression ( ',' expression )* -> ( expression )+ )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:98:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList766);
            expression90=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression90.getTree());
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:98:20: ( ',' expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:98:21: ',' expression
            	    {
            	    char_literal91=(Token)match(input,31,FOLLOW_31_in_expressionList769); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal91);

            	    pushFollow(FOLLOW_expression_in_expressionList771);
            	    expression92=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());

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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:104:1: literal : ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final CSLParser.literal_return literal() throws RecognitionException {
        CSLParser.literal_return retval = new CSLParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntegerLiteral93=null;
        Token FloatingPointLiteral94=null;
        Token CharacterLiteral95=null;
        Token StringLiteral96=null;
        Token string_literal98=null;
        CSLParser.booleanLiteral_return booleanLiteral97 = null;


        Object IntegerLiteral93_tree=null;
        Object FloatingPointLiteral94_tree=null;
        Object CharacterLiteral95_tree=null;
        Object StringLiteral96_tree=null;
        Object string_literal98_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:105:2: ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
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
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:105:6: IntegerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerLiteral93=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral93_tree = (Object)adaptor.create(IntegerLiteral93);
                    adaptor.addChild(root_0, IntegerLiteral93_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:106:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    FloatingPointLiteral94=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral94_tree = (Object)adaptor.create(FloatingPointLiteral94);
                    adaptor.addChild(root_0, FloatingPointLiteral94_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:107:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    CharacterLiteral95=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral95_tree = (Object)adaptor.create(CharacterLiteral95);
                    adaptor.addChild(root_0, CharacterLiteral95_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:108:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral96=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral96_tree = (Object)adaptor.create(StringLiteral96);
                    adaptor.addChild(root_0, StringLiteral96_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:109:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal846);
                    booleanLiteral97=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral97.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:110:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal98=(Token)match(input,59,FOLLOW_59_in_literal856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);
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
    // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:120:1: booleanLiteral : ( 'true' | 'false' );
    public final CSLParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        CSLParser.booleanLiteral_return retval = new CSLParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;

        Object set99_tree=null;

        try {
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:121:5: ( 'true' | 'false' )
            // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:
            {
            root_0 = (Object)adaptor.nil();

            set99=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set99));
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

    // $ANTLR start synpred15_CSL
    public final void synpred15_CSL_fragment() throws RecognitionException {   
        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:27: ( '=' expression )
        // D:\\Src\\MyProject\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
        {
        match(input,41,FOLLOW_41_in_synpred15_CSL317); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred15_CSL320);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_CSL

    // Delegated rules

    public final boolean synpred15_CSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_CSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statement_in_language78 = new BitSet(new long[]{0x3F1801B258003F02L});
    public static final BitSet FOLLOW_function_in_language80 = new BitSet(new long[]{0x3F1801B258003F02L});
    public static final BitSet FOLLOW_27_in_function103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_function105 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_function107 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function109 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_statement_in_function111 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_29_in_function114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_param136 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_VAR_in_param138 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_param140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_in_param141 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_param146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement172 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement176 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement180 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_statement183 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement187 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement191 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_statement196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_statement240 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement243 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement250 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement258 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement266 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement275 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block289 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_statement_in_block291 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_29_in_block294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression314 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression317 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expression320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression338 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_conditionalExpression342 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression345 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_conditionalExpression347 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression369 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_conditionalOrExpression373 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression376 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression395 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_conditionalAndExpression399 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression402 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression421 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_equalityExpression426 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_47_in_equalityExpression431 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_48_in_equalityExpression436 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression440 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression459 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression463 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression466 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp482 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp488 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression515 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_additiveExpression520 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_52_in_additiveExpression525 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression529 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression548 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_multiplicativeExpression554 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_54_in_multiplicativeExpression559 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_55_in_multiplicativeExpression564 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression569 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_51_in_unaryExpression589 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression600 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression613 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_unaryExpression633 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unaryExpression653 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topExpression_in_unaryExpression666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topExpression689 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_topExpression692 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_topExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_topExpression704 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arguments_in_topExpression706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_topExpression724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_topExpression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arguments742 = new BitSet(new long[]{0x3F1801B350003F00L});
    public static final BitSet FOLLOW_expressionList_in_arguments745 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_arguments748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList766 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_expressionList769 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expressionList771 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_literal806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_literal856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred15_CSL317 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_synpred15_CSL320 = new BitSet(new long[]{0x0000000000000002L});

}