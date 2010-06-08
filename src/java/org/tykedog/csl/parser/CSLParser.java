// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g 2010-06-08 20:51:52
package org.tykedog.csl.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class CSLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EVAL", "VAR", "LANGUAGE", "ID", "LogicJoinOperator", "LogicCompareOperator", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "EscapeSequence", "Exponent", "UnicodeEscape", "OctalEscape", "Letter", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "'if'", "'elif'", "'else'", "'while'", "';'", "'{'", "'}'", "'='", "'('", "')'", "'$'", "'['", "']'", "'null'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int HexLiteral=14;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int LINE_COMMENT=26;
    public static final int OctalLiteral=15;
    public static final int CharacterLiteral=12;
    public static final int Exponent=19;
    public static final int LogicJoinOperator=8;
    public static final int ID=7;
    public static final int DecimalLiteral=16;
    public static final int EOF=-1;
    public static final int HexDigit=17;
    public static final int StringLiteral=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=24;
    public static final int LANGUAGE=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int NEWLINE=23;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EVAL=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=20;
    public static final int FloatingPointLiteral=11;
    public static final int VAR=5;
    public static final int IntegerLiteral=10;
    public static final int COMMENT=25;
    public static final int Letter=22;
    public static final int OctalEscape=21;
    public static final int EscapeSequence=18;
    public static final int LogicCompareOperator=9;

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:1: language : ( statement )* -> ^( LANGUAGE ( statement )* ) ;
    public final CSLParser.language_return language() throws RecognitionException {
        CSLParser.language_return retval = new CSLParser.language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.statement_return statement1 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:9: ( ( statement )* -> ^( LANGUAGE ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:11: ( statement )*
            {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:11: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==27||LA1_0==30||LA1_0==32||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_language61);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 17:22: -> ^( LANGUAGE ( statement )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:25: ^( LANGUAGE ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LANGUAGE, "LANGUAGE"), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:17:36: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:19:1: statement : ( block | 'if' ifExpr= logicExpression ifBlock= block ( 'elif' elifExpr= logicExpression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' logicExpression block | evalExpression ';' | assignExpression ';' );
    public final CSLParser.statement_return statement() throws RecognitionException {
        CSLParser.statement_return retval = new CSLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token string_literal4=null;
        Token string_literal5=null;
        Token string_literal6=null;
        Token char_literal10=null;
        Token char_literal12=null;
        CSLParser.logicExpression_return ifExpr = null;

        CSLParser.block_return ifBlock = null;

        CSLParser.logicExpression_return elifExpr = null;

        CSLParser.block_return elifBlock = null;

        CSLParser.block_return elseBlock = null;

        CSLParser.block_return block2 = null;

        CSLParser.logicExpression_return logicExpression7 = null;

        CSLParser.block_return block8 = null;

        CSLParser.evalExpression_return evalExpression9 = null;

        CSLParser.assignExpression_return assignExpression11 = null;


        Object string_literal3_tree=null;
        Object string_literal4_tree=null;
        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_logicExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:20:2: ( block | 'if' ifExpr= logicExpression ifBlock= block ( 'elif' elifExpr= logicExpression elifBlock= block )* ( 'else' elseBlock= block )? -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? ) | 'while' logicExpression block | evalExpression ';' | assignExpression ';' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case ID:
                {
                alt4=4;
                }
                break;
            case 37:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:21:2: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement82);
                    block2=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block2.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:4: 'if' ifExpr= logicExpression ifBlock= block ( 'elif' elifExpr= logicExpression elifBlock= block )* ( 'else' elseBlock= block )?
                    {
                    string_literal3=(Token)match(input,27,FOLLOW_27_in_statement88);  
                    stream_27.add(string_literal3);

                    pushFollow(FOLLOW_logicExpression_in_statement92);
                    ifExpr=logicExpression();

                    state._fsp--;

                    stream_logicExpression.add(ifExpr.getTree());
                    pushFollow(FOLLOW_block_in_statement96);
                    ifBlock=block();

                    state._fsp--;

                    stream_block.add(ifBlock.getTree());
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:46: ( 'elif' elifExpr= logicExpression elifBlock= block )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==28) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:47: 'elif' elifExpr= logicExpression elifBlock= block
                    	    {
                    	    string_literal4=(Token)match(input,28,FOLLOW_28_in_statement99);  
                    	    stream_28.add(string_literal4);

                    	    pushFollow(FOLLOW_logicExpression_in_statement103);
                    	    elifExpr=logicExpression();

                    	    state._fsp--;

                    	    stream_logicExpression.add(elifExpr.getTree());
                    	    pushFollow(FOLLOW_block_in_statement107);
                    	    elifBlock=block();

                    	    state._fsp--;

                    	    stream_block.add(elifBlock.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:97: ( 'else' elseBlock= block )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==29) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:22:98: 'else' elseBlock= block
                            {
                            string_literal5=(Token)match(input,29,FOLLOW_29_in_statement112);  
                            stream_29.add(string_literal5);

                            pushFollow(FOLLOW_block_in_statement116);
                            elseBlock=block();

                            state._fsp--;

                            stream_block.add(elseBlock.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ifBlock, elseBlock, 27, elifExpr, 28, elifBlock, ifExpr, 29
                    // token labels: 
                    // rule labels: ifExpr, retval, ifBlock, elseBlock, elifExpr, elifBlock
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifExpr=new RewriteRuleSubtreeStream(adaptor,"rule ifExpr",ifExpr!=null?ifExpr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ifBlock=new RewriteRuleSubtreeStream(adaptor,"rule ifBlock",ifBlock!=null?ifBlock.tree:null);
                    RewriteRuleSubtreeStream stream_elseBlock=new RewriteRuleSubtreeStream(adaptor,"rule elseBlock",elseBlock!=null?elseBlock.tree:null);
                    RewriteRuleSubtreeStream stream_elifExpr=new RewriteRuleSubtreeStream(adaptor,"rule elifExpr",elifExpr!=null?elifExpr.tree:null);
                    RewriteRuleSubtreeStream stream_elifBlock=new RewriteRuleSubtreeStream(adaptor,"rule elifBlock",elifBlock!=null?elifBlock.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:3: -> ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:6: ^( 'if' $ifExpr $ifBlock ( ^( 'elif' $elifExpr $elifBlock) )* ( ^( 'else' $elseBlock) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ifExpr.nextTree());
                        adaptor.addChild(root_1, stream_ifBlock.nextTree());
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:30: ( ^( 'elif' $elifExpr $elifBlock) )*
                        while ( stream_elifExpr.hasNext()||stream_28.hasNext()||stream_elifBlock.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:30: ^( 'elif' $elifExpr $elifBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_28.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elifExpr.nextTree());
                            adaptor.addChild(root_2, stream_elifBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_elifExpr.reset();
                        stream_28.reset();
                        stream_elifBlock.reset();
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:62: ( ^( 'else' $elseBlock) )?
                        if ( stream_elseBlock.hasNext()||stream_29.hasNext() ) {
                            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:23:62: ^( 'else' $elseBlock)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_29.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_elseBlock.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_elseBlock.reset();
                        stream_29.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:24:4: 'while' logicExpression block
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal6=(Token)match(input,30,FOLLOW_30_in_statement156); 
                    string_literal6_tree = (Object)adaptor.create(string_literal6);
                    root_0 = (Object)adaptor.becomeRoot(string_literal6_tree, root_0);

                    pushFollow(FOLLOW_logicExpression_in_statement159);
                    logicExpression7=logicExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, logicExpression7.getTree());
                    pushFollow(FOLLOW_block_in_statement161);
                    block8=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block8.getTree());

                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:25:5: evalExpression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_evalExpression_in_statement167);
                    evalExpression9=evalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, evalExpression9.getTree());
                    char_literal10=(Token)match(input,31,FOLLOW_31_in_statement169); 

                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:26:5: assignExpression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_statement176);
                    assignExpression11=assignExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignExpression11.getTree());
                    char_literal12=(Token)match(input,31,FOLLOW_31_in_statement178); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:1: block : '{' ( statement )* '}' -> ^( '{' ( statement )* ) ;
    public final CSLParser.block_return block() throws RecognitionException {
        CSLParser.block_return retval = new CSLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        CSLParser.statement_return statement14 = null;


        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:7: ( '{' ( statement )* '}' -> ^( '{' ( statement )* ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:9: '{' ( statement )* '}'
            {
            char_literal13=(Token)match(input,32,FOLLOW_32_in_block190);  
            stream_32.add(char_literal13);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:13: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||LA5_0==27||LA5_0==30||LA5_0==32||LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block192);
            	    statement14=statement();

            	    state._fsp--;

            	    stream_statement.add(statement14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            char_literal15=(Token)match(input,33,FOLLOW_33_in_block195);  
            stream_33.add(char_literal15);



            // AST REWRITE
            // elements: 32, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:28: -> ^( '{' ( statement )* )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:31: ^( '{' ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_32.nextNode(), root_1);

                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:29:37: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class evalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evalExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:31:1: evalExpression : ID params -> ^( EVAL ID params ) ;
    public final CSLParser.evalExpression_return evalExpression() throws RecognitionException {
        CSLParser.evalExpression_return retval = new CSLParser.evalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID16=null;
        CSLParser.params_return params17 = null;


        Object ID16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:2: ( ID params -> ^( EVAL ID params ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:4: ID params
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_evalExpression213);  
            stream_ID.add(ID16);

            pushFollow(FOLLOW_params_in_evalExpression215);
            params17=params();

            state._fsp--;

            stream_params.add(params17.getTree());


            // AST REWRITE
            // elements: params, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:14: -> ^( EVAL ID params )
            {
                // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:32:17: ^( EVAL ID params )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVAL, "EVAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "evalExpression"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:1: param : ( var | literal );
    public final CSLParser.param_return param() throws RecognitionException {
        CSLParser.param_return retval = new CSLParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.var_return var18 = null;

        CSLParser.literal_return literal19 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:8: ( var | literal )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=IntegerLiteral && LA6_0<=StringLiteral)||(LA6_0>=40 && LA6_0<=42)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:10: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_param234);
                    var18=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var18.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:34:14: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_param236);
                    literal19=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:1: params : ( param )* ;
    public final CSLParser.params_return params() throws RecognitionException {
        CSLParser.params_return retval = new CSLParser.params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.param_return param20 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:9: ( ( param )* )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:11: ( param )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:11: ( param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=IntegerLiteral && LA7_0<=StringLiteral)||LA7_0==37||(LA7_0>=40 && LA7_0<=42)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:35:11: param
            	    {
            	    pushFollow(FOLLOW_param_in_params244);
            	    param20=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param20.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "params"

    public static class assignExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:37:1: assignExpression : var '=' ( var | evalExpression ) ;
    public final CSLParser.assignExpression_return assignExpression() throws RecognitionException {
        CSLParser.assignExpression_return retval = new CSLParser.assignExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        CSLParser.var_return var21 = null;

        CSLParser.var_return var23 = null;

        CSLParser.evalExpression_return evalExpression24 = null;


        Object char_literal22_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:2: ( var '=' ( var | evalExpression ) )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:4: var '=' ( var | evalExpression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_in_assignExpression255);
            var21=var();

            state._fsp--;

            adaptor.addChild(root_0, var21.getTree());
            char_literal22=(Token)match(input,34,FOLLOW_34_in_assignExpression257); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            root_0 = (Object)adaptor.becomeRoot(char_literal22_tree, root_0);

            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:13: ( var | evalExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:14: var
                    {
                    pushFollow(FOLLOW_var_in_assignExpression261);
                    var23=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var23.getTree());

                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:38:20: evalExpression
                    {
                    pushFollow(FOLLOW_evalExpression_in_assignExpression265);
                    evalExpression24=evalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, evalExpression24.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "assignExpression"

    public static class parLogicExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parLogicExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:40:1: parLogicExpression : '(' logicExpression ')' ;
    public final CSLParser.parLogicExpression_return parLogicExpression() throws RecognitionException {
        CSLParser.parLogicExpression_return retval = new CSLParser.parLogicExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal25=null;
        Token char_literal27=null;
        CSLParser.logicExpression_return logicExpression26 = null;


        Object char_literal25_tree=null;
        Object char_literal27_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:2: ( '(' logicExpression ')' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:41:4: '(' logicExpression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal25=(Token)match(input,35,FOLLOW_35_in_parLogicExpression275); 
            pushFollow(FOLLOW_logicExpression_in_parLogicExpression278);
            logicExpression26=logicExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicExpression26.getTree());
            char_literal27=(Token)match(input,36,FOLLOW_36_in_parLogicExpression280); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "parLogicExpression"

    public static class logicExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:44:1: logicExpression : atomLogicExpression ( LogicJoinOperator logicExpression )? ;
    public final CSLParser.logicExpression_return logicExpression() throws RecognitionException {
        CSLParser.logicExpression_return retval = new CSLParser.logicExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LogicJoinOperator29=null;
        CSLParser.atomLogicExpression_return atomLogicExpression28 = null;

        CSLParser.logicExpression_return logicExpression30 = null;


        Object LogicJoinOperator29_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:2: ( atomLogicExpression ( LogicJoinOperator logicExpression )? )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:4: atomLogicExpression ( LogicJoinOperator logicExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atomLogicExpression_in_logicExpression292);
            atomLogicExpression28=atomLogicExpression();

            state._fsp--;

            adaptor.addChild(root_0, atomLogicExpression28.getTree());
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:24: ( LogicJoinOperator logicExpression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LogicJoinOperator) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:45:25: LogicJoinOperator logicExpression
                    {
                    LogicJoinOperator29=(Token)match(input,LogicJoinOperator,FOLLOW_LogicJoinOperator_in_logicExpression295); 
                    LogicJoinOperator29_tree = (Object)adaptor.create(LogicJoinOperator29);
                    root_0 = (Object)adaptor.becomeRoot(LogicJoinOperator29_tree, root_0);

                    pushFollow(FOLLOW_logicExpression_in_logicExpression298);
                    logicExpression30=logicExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, logicExpression30.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "logicExpression"

    public static class atomLogicExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomLogicExpression"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:47:1: atomLogicExpression : ( ( leftOperand LogicCompareOperator rightOperand ) | parLogicExpression );
    public final CSLParser.atomLogicExpression_return atomLogicExpression() throws RecognitionException {
        CSLParser.atomLogicExpression_return retval = new CSLParser.atomLogicExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LogicCompareOperator32=null;
        CSLParser.leftOperand_return leftOperand31 = null;

        CSLParser.rightOperand_return rightOperand33 = null;

        CSLParser.parLogicExpression_return parLogicExpression34 = null;


        Object LogicCompareOperator32_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:48:2: ( ( leftOperand LogicCompareOperator rightOperand ) | parLogicExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:48:4: ( leftOperand LogicCompareOperator rightOperand )
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:48:4: ( leftOperand LogicCompareOperator rightOperand )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:48:5: leftOperand LogicCompareOperator rightOperand
                    {
                    pushFollow(FOLLOW_leftOperand_in_atomLogicExpression310);
                    leftOperand31=leftOperand();

                    state._fsp--;

                    adaptor.addChild(root_0, leftOperand31.getTree());
                    LogicCompareOperator32=(Token)match(input,LogicCompareOperator,FOLLOW_LogicCompareOperator_in_atomLogicExpression312); 
                    LogicCompareOperator32_tree = (Object)adaptor.create(LogicCompareOperator32);
                    root_0 = (Object)adaptor.becomeRoot(LogicCompareOperator32_tree, root_0);

                    pushFollow(FOLLOW_rightOperand_in_atomLogicExpression315);
                    rightOperand33=rightOperand();

                    state._fsp--;

                    adaptor.addChild(root_0, rightOperand33.getTree());

                    }


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:49:4: parLogicExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parLogicExpression_in_atomLogicExpression321);
                    parLogicExpression34=parLogicExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, parLogicExpression34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "atomLogicExpression"

    public static class leftOperand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftOperand"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:51:1: leftOperand : var ;
    public final CSLParser.leftOperand_return leftOperand() throws RecognitionException {
        CSLParser.leftOperand_return retval = new CSLParser.leftOperand_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.var_return var35 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:52:2: ( var )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:52:4: var
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_in_leftOperand330);
            var35=var();

            state._fsp--;

            adaptor.addChild(root_0, var35.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "leftOperand"

    public static class rightOperand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rightOperand"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:54:1: rightOperand : param ;
    public final CSLParser.rightOperand_return rightOperand() throws RecognitionException {
        CSLParser.rightOperand_return retval = new CSLParser.rightOperand_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CSLParser.param_return param36 = null;



        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:55:2: ( param )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:55:4: param
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_param_in_rightOperand339);
            param36=param();

            state._fsp--;

            adaptor.addChild(root_0, param36.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "rightOperand"

    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:1: var : ( ( '$' ID -> ^( VAR ID ) ) | ( '$' ID '[' param ']' -> ^( VAR ID param ) ) );
    public final CSLParser.var_return var() throws RecognitionException {
        CSLParser.var_return retval = new CSLParser.var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        Token ID38=null;
        Token char_literal39=null;
        Token ID40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        CSLParser.param_return param42 = null;


        Object char_literal37_tree=null;
        Object ID38_tree=null;
        Object char_literal39_tree=null;
        Object ID40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:5: ( ( '$' ID -> ^( VAR ID ) ) | ( '$' ID '[' param ']' -> ^( VAR ID param ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==38) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_2>=LogicJoinOperator && LA11_2<=StringLiteral)||(LA11_2>=31 && LA11_2<=32)||LA11_2==34||(LA11_2>=36 && LA11_2<=37)||(LA11_2>=39 && LA11_2<=42)) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:7: ( '$' ID -> ^( VAR ID ) )
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:7: ( '$' ID -> ^( VAR ID ) )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:8: '$' ID
                    {
                    char_literal37=(Token)match(input,37,FOLLOW_37_in_var396);  
                    stream_37.add(char_literal37);

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_var397);  
                    stream_ID.add(ID38);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:14: -> ^( VAR ID )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:64:16: ^( VAR ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:19: ( '$' ID '[' param ']' -> ^( VAR ID param ) )
                    {
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:19: ( '$' ID '[' param ']' -> ^( VAR ID param ) )
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:20: '$' ID '[' param ']'
                    {
                    char_literal39=(Token)match(input,37,FOLLOW_37_in_var427);  
                    stream_37.add(char_literal39);

                    ID40=(Token)match(input,ID,FOLLOW_ID_in_var428);  
                    stream_ID.add(ID40);

                    char_literal41=(Token)match(input,38,FOLLOW_38_in_var429);  
                    stream_38.add(char_literal41);

                    pushFollow(FOLLOW_param_in_var430);
                    param42=param();

                    state._fsp--;

                    stream_param.add(param42.getTree());
                    char_literal43=(Token)match(input,39,FOLLOW_39_in_var431);  
                    stream_39.add(char_literal43);



                    // AST REWRITE
                    // elements: param, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:37: -> ^( VAR ID param )
                    {
                        // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:65:40: ^( VAR ID param )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_param.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:68:1: literal : ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final CSLParser.literal_return literal() throws RecognitionException {
        CSLParser.literal_return retval = new CSLParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntegerLiteral44=null;
        Token FloatingPointLiteral45=null;
        Token CharacterLiteral46=null;
        Token StringLiteral47=null;
        Token string_literal49=null;
        CSLParser.booleanLiteral_return booleanLiteral48 = null;


        Object IntegerLiteral44_tree=null;
        Object FloatingPointLiteral45_tree=null;
        Object CharacterLiteral46_tree=null;
        Object StringLiteral47_tree=null;
        Object string_literal49_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:2: ( IntegerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
                {
                alt12=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt12=2;
                }
                break;
            case CharacterLiteral:
                {
                alt12=3;
                }
                break;
            case StringLiteral:
                {
                alt12=4;
                }
                break;
            case 41:
            case 42:
                {
                alt12=5;
                }
                break;
            case 40:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:69:6: IntegerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerLiteral44=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal455); 
                    IntegerLiteral44_tree = (Object)adaptor.create(IntegerLiteral44);
                    adaptor.addChild(root_0, IntegerLiteral44_tree);


                    }
                    break;
                case 2 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:70:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    FloatingPointLiteral45=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal465); 
                    FloatingPointLiteral45_tree = (Object)adaptor.create(FloatingPointLiteral45);
                    adaptor.addChild(root_0, FloatingPointLiteral45_tree);


                    }
                    break;
                case 3 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:71:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    CharacterLiteral46=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal475); 
                    CharacterLiteral46_tree = (Object)adaptor.create(CharacterLiteral46);
                    adaptor.addChild(root_0, CharacterLiteral46_tree);


                    }
                    break;
                case 4 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:72:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral47=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal485); 
                    StringLiteral47_tree = (Object)adaptor.create(StringLiteral47);
                    adaptor.addChild(root_0, StringLiteral47_tree);


                    }
                    break;
                case 5 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:73:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal495);
                    booleanLiteral48=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral48.getTree());

                    }
                    break;
                case 6 :
                    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:74:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal49=(Token)match(input,40,FOLLOW_40_in_literal505); 
                    string_literal49_tree = (Object)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:85:1: booleanLiteral : ( 'true' | 'false' );
    public final CSLParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        CSLParser.booleanLiteral_return retval = new CSLParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:86:5: ( 'true' | 'false' )
            // F:\\MyProject\\Java\\tykedog\\grammar\\java\\CSL.g:
            {
            root_0 = (Object)adaptor.nil();

            set50=(Token)input.LT(1);
            if ( (input.LA(1)>=41 && input.LA(1)<=42) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set50));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_language61 = new BitSet(new long[]{0x0000002148000082L});
    public static final BitSet FOLLOW_block_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_statement88 = new BitSet(new long[]{0x0000002948000080L});
    public static final BitSet FOLLOW_logicExpression_in_statement92 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_block_in_statement96 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_statement99 = new BitSet(new long[]{0x0000002948000080L});
    public static final BitSet FOLLOW_logicExpression_in_statement103 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_block_in_statement107 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_29_in_statement112 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_block_in_statement116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_statement156 = new BitSet(new long[]{0x0000002948000080L});
    public static final BitSet FOLLOW_logicExpression_in_statement159 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_block_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExpression_in_statement167 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_statement176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_block190 = new BitSet(new long[]{0x0000002348000080L});
    public static final BitSet FOLLOW_statement_in_block192 = new BitSet(new long[]{0x0000002348000080L});
    public static final BitSet FOLLOW_33_in_block195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_evalExpression213 = new BitSet(new long[]{0x0000072148003C80L});
    public static final BitSet FOLLOW_params_in_evalExpression215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_param234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_param236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params244 = new BitSet(new long[]{0x0000072148003C82L});
    public static final BitSet FOLLOW_var_in_assignExpression255 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_assignExpression257 = new BitSet(new long[]{0x0000002148000080L});
    public static final BitSet FOLLOW_var_in_assignExpression261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExpression_in_assignExpression265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parLogicExpression275 = new BitSet(new long[]{0x0000002948000080L});
    public static final BitSet FOLLOW_logicExpression_in_parLogicExpression278 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parLogicExpression280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomLogicExpression_in_logicExpression292 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LogicJoinOperator_in_logicExpression295 = new BitSet(new long[]{0x0000002948000080L});
    public static final BitSet FOLLOW_logicExpression_in_logicExpression298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftOperand_in_atomLogicExpression310 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LogicCompareOperator_in_atomLogicExpression312 = new BitSet(new long[]{0x0000072148003C80L});
    public static final BitSet FOLLOW_rightOperand_in_atomLogicExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parLogicExpression_in_atomLogicExpression321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_leftOperand330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_rightOperand339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_var396 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_var397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_var427 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_var428 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_var429 = new BitSet(new long[]{0x0000072148003C80L});
    public static final BitSet FOLLOW_param_in_var430 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_var431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_literal455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_literal505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}