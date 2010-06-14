// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g 2010-06-14 18:50:06
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:1: language : ( statement | function )* -> ^( LANGUAGE ( statement )* ( function )* ) ;
    public final CSLParser.language_return language() throws RecognitionException {
        CSLParser.language_return retval = new CSLParser.language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.statement_return statement1 = null;

        CSLParser.function_return function2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:9: ( ( statement | function )* -> ^( LANGUAGE ( statement )* ( function )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:11: ( statement | function )*
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:11: ( statement | function )*
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
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_language78);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:22: function
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
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:36: ^( LANGUAGE ( statement )* ( function )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LANGUAGE, "LANGUAGE"), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:58: ( function )*
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:10: ( 'def' ID param '{' ( statement )* '}' -> ^( FUNCTION ID param ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:12: 'def' ID param '{' ( statement )* '}'
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
            // elements: ID, param, statement
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:1: param : '(' ( ID ( ',' ID )* )? ')' -> ^( PARAM ( ID )* ) ;
    public final CSLParser.param_return param() throws RecognitionException {
        CSLParser.param_return retval = new CSLParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        Token ID10=null;
        Token char_literal11=null;
        Token ID12=null;
        Token char_literal13=null;

        Object char_literal9_tree=null;
        Object ID10_tree=null;
        Object char_literal11_tree=null;
        Object ID12_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:7: ( '(' ( ID ( ',' ID )* )? ')' -> ^( PARAM ( ID )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:9: '(' ( ID ( ',' ID )* )? ')'
            {
            char_literal9=(Token)match(input,30,FOLLOW_30_in_param136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal9);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:12: ( ID ( ',' ID )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:13: ID ( ',' ID )*
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_param138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID10);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:15: ( ',' ID )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==31) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:16: ',' ID
                    	    {
                    	    char_literal11=(Token)match(input,31,FOLLOW_31_in_param140); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_31.add(char_literal11);

                    	    ID12=(Token)match(input,ID,FOLLOW_ID_in_param141); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID12);


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
            // 23:29: -> ^( PARAM ( ID )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:32: ^( PARAM ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:40: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:25:1: statement : ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | expression ';' );
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
        Token char_literal27=null;
        Token char_literal29=null;
        CSLParser.expression_return ifExpr = null;

        CSLParser.block_return ifBlock = null;

        CSLParser.expression_return elifExpr = null;

        CSLParser.block_return elifBlock = null;

        CSLParser.block_return elseBlock = null;

        CSLParser.block_return block14 = null;

        CSLParser.expression_return expression19 = null;

        CSLParser.block_return block20 = null;

        CSLParser.expression_return expression26 = null;

        CSLParser.expression_return expression28 = null;


        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        Object string_literal21_tree=null;
        Object char_literal22_tree=null;
        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object string_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:26:2: ( block | 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' expression block | 'break' ';' | 'continue' ';' | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | expression ';' )
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
            case 37:
                {
                alt8=4;
                }
                break;
            case 39:
                {
                alt8=5;
                }
                break;
            case 40:
                {
                alt8=6;
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
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:27:2: block
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:28:4: 'if' ifExpr= expression ifBlock= block ( 'elif' elifExpr= expression elifBlock= block )* ( 'else' elseBlock= block )?
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
                    // elements: 34, 35, ifBlock, ifExpr, elifBlock, elifExpr, 33, elseBlock
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
                        while ( stream_34.hasNext()||stream_elifBlock.hasNext()||stream_elifExpr.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:31: ^( 'elif' $elifExpr $elifBlock)
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
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:64: ( ^( 'else' $elseBlock) )?
                        if ( stream_35.hasNext()||stream_elseBlock.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:65: ^( 'else' $elseBlock)
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:30:4: 'while' expression block
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,36,FOLLOW_36_in_statement244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    root_0 = (Object)adaptor.becomeRoot(string_literal18_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_statement247);
                    expression19=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression19.getTree());
                    pushFollow(FOLLOW_block_in_statement249);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:31:4: 'break' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal21=(Token)match(input,37,FOLLOW_37_in_statement254); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = (Object)adaptor.create(string_literal21);
                    adaptor.addChild(root_0, string_literal21_tree);
                    }
                    char_literal22=(Token)match(input,38,FOLLOW_38_in_statement256); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:4: 'continue' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal23=(Token)match(input,39,FOLLOW_39_in_statement262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal23_tree = (Object)adaptor.create(string_literal23);
                    adaptor.addChild(root_0, string_literal23_tree);
                    }
                    char_literal24=(Token)match(input,38,FOLLOW_38_in_statement264); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:4: 'return' ( expression )? ';'
                    {
                    string_literal25=(Token)match(input,40,FOLLOW_40_in_statement271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(string_literal25);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:13: ( expression )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=ID && LA7_0<=StringLiteral)||LA7_0==30||(LA7_0>=51 && LA7_0<=52)||(LA7_0>=56 && LA7_0<=61)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement273);
                            expression26=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,38,FOLLOW_38_in_statement276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal27);



                    // AST REWRITE
                    // elements: expression, 40
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 33:29: -> ^( 'return' ( expression )? )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:32: ^( 'return' ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:33:43: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:5: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement291);
                    expression28=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression28.getTree());
                    char_literal29=(Token)match(input,38,FOLLOW_38_in_statement293); if (state.failed) return retval;

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

        Token char_literal30=null;
        Token char_literal32=null;
        CSLParser.statement_return statement31 = null;


        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:7: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:9: '{' ( statement )* '}'
            {
            char_literal30=(Token)match(input,28,FOLLOW_28_in_block305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal30);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:13: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=StringLiteral)||LA9_0==28||LA9_0==30||LA9_0==33||(LA9_0>=36 && LA9_0<=37)||(LA9_0>=39 && LA9_0<=40)||(LA9_0>=51 && LA9_0<=52)||(LA9_0>=56 && LA9_0<=61)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block307);
            	    statement31=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal32=(Token)match(input,29,FOLLOW_29_in_block310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal32);



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

        Token char_literal34=null;
        CSLParser.conditionalExpression_return conditionalExpression33 = null;

        CSLParser.expression_return expression35 = null;


        Object char_literal34_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:2: ( conditionalExpression ( '=' expression )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:4: conditionalExpression ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression330);
            conditionalExpression33=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression33.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:26: ( '=' expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred16_CSL()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
                    {
                    char_literal34=(Token)match(input,41,FOLLOW_41_in_expression333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    root_0 = (Object)adaptor.becomeRoot(char_literal34_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_expression336);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression35.getTree());

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

        Token char_literal37=null;
        Token char_literal39=null;
        CSLParser.conditionalOrExpression_return conditionalOrExpression36 = null;

        CSLParser.expression_return expression38 = null;

        CSLParser.expression_return expression40 = null;


        Object char_literal37_tree=null;
        Object char_literal39_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:9: conditionalOrExpression ( '?' expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression354);
            conditionalOrExpression36=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression36.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:33: ( '?' expression ':' expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:35: '?' expression ':' expression
                    {
                    char_literal37=(Token)match(input,42,FOLLOW_42_in_conditionalExpression358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal37_tree = (Object)adaptor.create(char_literal37);
                    root_0 = (Object)adaptor.becomeRoot(char_literal37_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression361);
                    expression38=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression38.getTree());
                    char_literal39=(Token)match(input,43,FOLLOW_43_in_conditionalExpression363); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression366);
                    expression40=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression40.getTree());

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

        Token string_literal42=null;
        CSLParser.conditionalAndExpression_return conditionalAndExpression41 = null;

        CSLParser.conditionalAndExpression_return conditionalAndExpression43 = null;


        Object string_literal42_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression385);
            conditionalAndExpression41=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression41.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:34: ( '||' conditionalAndExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:36: '||' conditionalAndExpression
            	    {
            	    string_literal42=(Token)match(input,44,FOLLOW_44_in_conditionalOrExpression389); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal42_tree = (Object)adaptor.create(string_literal42);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal42_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression392);
            	    conditionalAndExpression43=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression43.getTree());

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

        Token string_literal45=null;
        CSLParser.equalityExpression_return equalityExpression44 = null;

        CSLParser.equalityExpression_return equalityExpression46 = null;


        Object string_literal45_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:5: ( equalityExpression ( '&&' equalityExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:9: equalityExpression ( '&&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression411);
            equalityExpression44=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression44.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:28: ( '&&' equalityExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:53:30: '&&' equalityExpression
            	    {
            	    string_literal45=(Token)match(input,45,FOLLOW_45_in_conditionalAndExpression415); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal45_tree = (Object)adaptor.create(string_literal45);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression418);
            	    equalityExpression46=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression46.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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

        Token string_literal48=null;
        Token string_literal49=null;
        Token string_literal50=null;
        CSLParser.relationalExpression_return relationalExpression47 = null;

        CSLParser.relationalExpression_return relationalExpression51 = null;


        Object string_literal48_tree=null;
        Object string_literal49_tree=null;
        Object string_literal50_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:5: ( relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:9: relationalExpression ( ( '==' | '!=' | '~=' ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression437);
            relationalExpression47=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression47.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:30: ( ( '==' | '!=' | '~=' ) relationalExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=46 && LA15_0<=48)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' ) relationalExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:32: ( '==' | '!=' | '~=' )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:33: '=='
            	            {
            	            string_literal48=(Token)match(input,46,FOLLOW_46_in_equalityExpression442); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal48_tree = (Object)adaptor.create(string_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:41: '!='
            	            {
            	            string_literal49=(Token)match(input,47,FOLLOW_47_in_equalityExpression447); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal49_tree = (Object)adaptor.create(string_literal49);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:57:49: '~='
            	            {
            	            string_literal50=(Token)match(input,48,FOLLOW_48_in_equalityExpression452); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal50_tree = (Object)adaptor.create(string_literal50);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal50_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression456);
            	    relationalExpression51=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression51.getTree());

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

        CSLParser.additiveExpression_return additiveExpression52 = null;

        CSLParser.relationalOp_return relationalOp53 = null;

        CSLParser.additiveExpression_return additiveExpression54 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:5: ( additiveExpression ( relationalOp additiveExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:9: additiveExpression ( relationalOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression475);
            additiveExpression52=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression52.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:28: ( relationalOp additiveExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=49 && LA16_0<=50)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:61:30: relationalOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression479);
            	    relationalOp53=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(relationalOp53.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression482);
            	    additiveExpression54=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression54.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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

        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;

        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:2: ( ( '<' '=' | '>' '=' | '<' | '>' ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
            {
            root_0 = (Object)adaptor.nil();

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:4: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==49) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==41) ) {
                    alt17=1;
                }
                else if ( ((LA17_1>=ID && LA17_1<=StringLiteral)||LA17_1==30||(LA17_1>=51 && LA17_1<=52)||(LA17_1>=56 && LA17_1<=61)) ) {
                    alt17=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==50) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==41) ) {
                    alt17=2;
                }
                else if ( ((LA17_2>=ID && LA17_2<=StringLiteral)||LA17_2==30||(LA17_2>=51 && LA17_2<=52)||(LA17_2>=56 && LA17_2<=61)) ) {
                    alt17=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:5: '<' '='
                    {
                    char_literal55=(Token)match(input,49,FOLLOW_49_in_relationalOp498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    char_literal56=(Token)match(input,41,FOLLOW_41_in_relationalOp500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:15: '>' '='
                    {
                    char_literal57=(Token)match(input,50,FOLLOW_50_in_relationalOp504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = (Object)adaptor.create(char_literal57);
                    adaptor.addChild(root_0, char_literal57_tree);
                    }
                    char_literal58=(Token)match(input,41,FOLLOW_41_in_relationalOp506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:25: '<'
                    {
                    char_literal59=(Token)match(input,49,FOLLOW_49_in_relationalOp510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = (Object)adaptor.create(char_literal59);
                    adaptor.addChild(root_0, char_literal59_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:31: '>'
                    {
                    char_literal60=(Token)match(input,50,FOLLOW_50_in_relationalOp514); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);
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

        Token char_literal62=null;
        Token char_literal63=null;
        CSLParser.multiplicativeExpression_return multiplicativeExpression61 = null;

        CSLParser.multiplicativeExpression_return multiplicativeExpression64 = null;


        Object char_literal62_tree=null;
        Object char_literal63_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression531);
            multiplicativeExpression61=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression61.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:36: ( '+' | '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==51) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==52) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:37: '+'
            	            {
            	            char_literal62=(Token)match(input,51,FOLLOW_51_in_additiveExpression536); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal62_tree = (Object)adaptor.create(char_literal62);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:44: '-'
            	            {
            	            char_literal63=(Token)match(input,52,FOLLOW_52_in_additiveExpression541); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = (Object)adaptor.create(char_literal63);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression545);
            	    multiplicativeExpression64=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression64.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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

        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;
        CSLParser.unaryExpression_return unaryExpression65 = null;

        CSLParser.unaryExpression_return unaryExpression69 = null;


        Object char_literal66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal68_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression564);
            unaryExpression65=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression65.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=53 && LA21_0<=55)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:27: ( '*' | '/' | '%' )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:29: '*'
            	            {
            	            char_literal66=(Token)match(input,53,FOLLOW_53_in_multiplicativeExpression570); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = (Object)adaptor.create(char_literal66);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:36: '/'
            	            {
            	            char_literal67=(Token)match(input,54,FOLLOW_54_in_multiplicativeExpression575); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal67_tree = (Object)adaptor.create(char_literal67);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:43: '%'
            	            {
            	            char_literal68=(Token)match(input,55,FOLLOW_55_in_multiplicativeExpression580); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal68_tree = (Object)adaptor.create(char_literal68);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression585);
            	    unaryExpression69=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression69.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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

        Token char_literal70=null;
        Token char_literal72=null;
        Token string_literal74=null;
        Token string_literal76=null;
        Token char_literal78=null;
        CSLParser.unaryExpression_return unaryExpression71 = null;

        CSLParser.unaryExpression_return unaryExpression73 = null;

        CSLParser.unaryExpression_return unaryExpression75 = null;

        CSLParser.unaryExpression_return unaryExpression77 = null;

        CSLParser.unaryExpression_return unaryExpression79 = null;

        CSLParser.topExpression_return topExpression80 = null;


        Object char_literal70_tree=null;
        Object char_literal72_tree=null;
        Object string_literal74_tree=null;
        Object string_literal76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:77:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( '++' unaryExpression ) | '--' unaryExpression -> ^( '--' unaryExpression ) | '!' unaryExpression | topExpression )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt22=1;
                }
                break;
            case 52:
                {
                alt22=2;
                }
                break;
            case 56:
                {
                alt22=3;
                }
                break;
            case 57:
                {
                alt22=4;
                }
                break;
            case 58:
                {
                alt22=5;
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
                alt22=6;
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
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:77:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal70=(Token)match(input,51,FOLLOW_51_in_unaryExpression605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = (Object)adaptor.create(char_literal70);
                    root_0 = (Object)adaptor.becomeRoot(char_literal70_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression608);
                    unaryExpression71=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression71.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:78:7: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal72=(Token)match(input,52,FOLLOW_52_in_unaryExpression616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression619);
                    unaryExpression73=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression73.getTree());

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:79:9: '++' unaryExpression
                    {
                    string_literal74=(Token)match(input,56,FOLLOW_56_in_unaryExpression629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal74);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression631);
                    unaryExpression75=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression75.getTree());


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
                    string_literal76=(Token)match(input,57,FOLLOW_57_in_unaryExpression649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal76);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression651);
                    unaryExpression77=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression77.getTree());


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

                    char_literal78=(Token)match(input,58,FOLLOW_58_in_unaryExpression669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression672);
                    unaryExpression79=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression79.getTree());

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:82:9: topExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topExpression_in_unaryExpression682);
                    topExpression80=topExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topExpression80.getTree());

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

        Token char_literal81=null;
        Token char_literal83=null;
        Token ID84=null;
        Token VAR87=null;
        CSLParser.expression_return expression82 = null;

        CSLParser.arguments_return arguments85 = null;

        CSLParser.literal_return literal86 = null;


        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object ID84_tree=null;
        Object VAR87_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:86:5: ( '(' expression ')' | ID arguments -> ^( INVOKE ID arguments ) | literal | VAR )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case ID:
                {
                alt23=2;
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
                alt23=3;
                }
                break;
            case VAR:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:87:5: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal81=(Token)match(input,30,FOLLOW_30_in_topExpression705); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_topExpression708);
                    expression82=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression82.getTree());
                    char_literal83=(Token)match(input,32,FOLLOW_32_in_topExpression710); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:88:7: ID arguments
                    {
                    ID84=(Token)match(input,ID,FOLLOW_ID_in_topExpression720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID84);

                    pushFollow(FOLLOW_arguments_in_topExpression722);
                    arguments85=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments85.getTree());


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

                    pushFollow(FOLLOW_literal_in_topExpression740);
                    literal86=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal86.getTree());

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:90:7: VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR87=(Token)match(input,VAR,FOLLOW_VAR_in_topExpression748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR87_tree = (Object)adaptor.create(VAR87);
                    adaptor.addChild(root_0, VAR87_tree);
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

        Token char_literal88=null;
        Token char_literal90=null;
        CSLParser.expressionList_return expressionList89 = null;


        Object char_literal88_tree=null;
        Object char_literal90_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:2: ( '(' ( expressionList )? ')' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:4: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal88=(Token)match(input,30,FOLLOW_30_in_arguments758); if (state.failed) return retval;
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:93:9: ( expressionList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ID && LA24_0<=StringLiteral)||LA24_0==30||(LA24_0>=51 && LA24_0<=52)||(LA24_0>=56 && LA24_0<=61)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments761);
                    expressionList89=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList89.getTree());

                    }
                    break;

            }

            char_literal90=(Token)match(input,32,FOLLOW_32_in_arguments764); if (state.failed) return retval;

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

        Token char_literal92=null;
        CSLParser.expression_return expression91 = null;

        CSLParser.expression_return expression93 = null;


        Object char_literal92_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:5: ( expression ( ',' expression )* -> ( expression )+ )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList782);
            expression91=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:20: ( ',' expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:98:21: ',' expression
            	    {
            	    char_literal92=(Token)match(input,31,FOLLOW_31_in_expressionList785); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal92);

            	    pushFollow(FOLLOW_expression_in_expressionList787);
            	    expression93=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:105:2: ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt26=6;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
                {
                alt26=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt26=2;
                }
                break;
            case CharacterLiteral:
                {
                alt26=3;
                }
                break;
            case StringLiteral:
                {
                alt26=4;
                }
                break;
            case 60:
            case 61:
                {
                alt26=5;
                }
                break;
            case 59:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:105:6: IntegerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerLiteral94=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral94_tree = (Object)adaptor.create(IntegerLiteral94);
                    adaptor.addChild(root_0, IntegerLiteral94_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:106:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    FloatingPointLiteral95=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral95_tree = (Object)adaptor.create(FloatingPointLiteral95);
                    adaptor.addChild(root_0, FloatingPointLiteral95_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:107:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    CharacterLiteral96=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral96_tree = (Object)adaptor.create(CharacterLiteral96);
                    adaptor.addChild(root_0, CharacterLiteral96_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:108:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral97=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral97_tree = (Object)adaptor.create(StringLiteral97);
                    adaptor.addChild(root_0, StringLiteral97_tree);
                    }

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:109:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal862);
                    booleanLiteral98=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral98.getTree());

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:110:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal99=(Token)match(input,59,FOLLOW_59_in_literal872); if (state.failed) return retval;
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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:120:1: booleanLiteral : ( 'true' | 'false' );
    public final CSLParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        CSLParser.booleanLiteral_return retval = new CSLParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:121:5: ( 'true' | 'false' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
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

    // $ANTLR start synpred16_CSL
    public final void synpred16_CSL_fragment() throws RecognitionException {   
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: ( '=' expression )
        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:27: '=' expression
        {
        match(input,41,FOLLOW_41_in_synpred16_CSL333); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred16_CSL336);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_CSL

    // Delegated rules

    public final boolean synpred16_CSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_CSL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_30_in_param136 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_ID_in_param138 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_param140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_param141 = new BitSet(new long[]{0x0000000180000000L});
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
    public static final BitSet FOLLOW_36_in_statement244 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_statement247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement254 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statement262 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement271 = new BitSet(new long[]{0x3F1801F250003F00L});
    public static final BitSet FOLLOW_expression_in_statement273 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement291 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block305 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_statement_in_block307 = new BitSet(new long[]{0x3F1801B270003F00L});
    public static final BitSet FOLLOW_29_in_block310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression330 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression333 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expression336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression354 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_conditionalExpression358 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression361 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_conditionalExpression363 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression385 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_conditionalOrExpression389 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression392 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression411 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_conditionalAndExpression415 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression418 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression437 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_equalityExpression442 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_47_in_equalityExpression447 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_48_in_equalityExpression452 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression456 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression475 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression479 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression482 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp498 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp504 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relationalOp506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression531 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_additiveExpression536 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_52_in_additiveExpression541 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression545 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression564 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_multiplicativeExpression570 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_54_in_multiplicativeExpression575 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_55_in_multiplicativeExpression580 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression585 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_51_in_unaryExpression605 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression616 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression629 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_unaryExpression649 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unaryExpression669 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topExpression_in_unaryExpression682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topExpression705 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_topExpression708 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_topExpression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_topExpression720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arguments_in_topExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_topExpression740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_topExpression748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arguments758 = new BitSet(new long[]{0x3F1801B350003F00L});
    public static final BitSet FOLLOW_expressionList_in_arguments761 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_arguments764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList782 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_expressionList785 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_expressionList787 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_literal822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_literal872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred16_CSL333 = new BitSet(new long[]{0x3F1801B250003F00L});
    public static final BitSet FOLLOW_expression_in_synpred16_CSL336 = new BitSet(new long[]{0x0000000000000002L});

}