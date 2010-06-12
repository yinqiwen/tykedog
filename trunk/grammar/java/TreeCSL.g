tree grammar TreeCSL;

options{
    tokenVocab=CSL;
    ASTLabelType=CommonTree;
}


@header {
package org.tykedog.csl.parser;
import org.tykedog.csl.interpreter.expression.*;
import org.tykedog.csl.interpreter.statement.*;
import org.tykedog.csl.interpreter.function.*;
import org.tykedog.csl.interpreter.*;
}

language returns[CSL csl]
:
{csl = new CSL();} 
^(LANGUAGE (statement{csl.addStatement($statement.stat);})* (function{csl.addFunction($function.func);})*)
;

function returns [Function func]
@init {func = new Function();}
:	
  ^(FUNCTION ID{func.setName($ID.text);} ^(PARAM (VAR{func.addArg($VAR.text);})*)  (s=statement{func.addStatment(s);})*);

statement returns[Statement stat]
	: 
    block{stat = $block.stat;}
    |
    {IfElseStatement ifElse = new IfElseStatement();}
    ^('if' ifexpr=expression ifblock=block
    {
        ChoiceStatement ifChoice = new ChoiceStatement(ifexpr, ifblock);
        ifElse.setIfStatement(ifChoice);
    } 
    (^('elif' elifexpr=expression elifblock=block)
    {
        ChoiceStatement elifChoice = new ChoiceStatement(elifexpr, elifblock);
        ifElse.addElifStatement(elifChoice);
    }
    )* 
    (^('else' elseblock=block{ifElse.setElseBlock(elseblock);}))?)  
    | ^('while' expression block )
    {
        stat = new WhileStatement($expression.expr, $block.stat);
    }
    | ^('return'  expression?)
    | 'break'{stat = new BreakStatement();}
    | 'continue'{stat = new ContinueStatement();}
    | expression {stat = new ExpressionStatement($expression.expr);}
	;

block returns[BlockStatement stat]
@init {
List<Statement> sl = new ArrayList<Statement>();
stat = new BlockStatement(sl);
}
	:	
	^('{' (s=statement{sl.add(s);})*);

expression returns[Expression expr]
@init {List<Expression> exprList = new ArrayList<Expression>();}
	:	
	^('=' opra=expression oprb=expression)
	{
	   $expr = new AssignExpression(opra, oprb, opra.getLine());
	}
	|^('+=' opra=expression oprb=expression)
	{
	   $expr = new PlusAssignExpression(opra, oprb, opra.getLine());
	}
	|^('-=' opra=expression oprb=expression)
	{
	   $expr = new MinusAssignExpression(opra, oprb, opra.getLine());
	}
	|^('*=' opra=expression oprb=expression)
	{
	   $expr = new MultiplyAssignExpression(opra, oprb, opra.getLine());
	}
	|^('/=' opra=expression oprb=expression)
	{
	   $expr = new DivideAssignExpression(opra, oprb, opra.getLine());
	}
	|^('%=' opra=expression oprb=expression)
	{
	   $expr = new ModAssignExpression(opra, oprb, opra.getLine());
	}
	|^('||' opra=expression oprb=expression)
	{
	   $expr = new LogicOrExpression(opra, oprb, opra.getLine());
	}
	|^('&&' opra=expression oprb=expression)
	{
	   $expr = new LogicAndExpression(opra, oprb, opra.getLine());
	}
	|^('+' opra=expression oprb=expression)
	{
	   $expr = new PlusExpression(opra, oprb, opra.getLine());
	}
	|^('-' opra=expression oprb=expression)
	{
	   $expr = new MinusExpression(opra, oprb, opra.getLine());
	}
	|^('*' opra=expression oprb=expression)
	{
	   $expr = new MultiplyExpression(opra, oprb, opra.getLine());
	}
	|^('/' opra=expression oprb=expression)
	{
	   $expr = new DivideExpression(opra, oprb, opra.getLine());
	}
	|^('%' opra=expression oprb=expression)
	{
	   $expr = new ModExpression(opra, oprb, opra.getLine());
	}
	|^('==' opra=expression oprb=expression)
	{
	   $expr = new EqualExpression(opra, oprb, opra.getLine());
	}
	|^('~=' opra=expression oprb=expression)
	{
	   $expr = new MatchEqualExpression(opra, oprb, opra.getLine());
	}
	|^('!=' opra=expression oprb=expression)
	{
	   $expr = new NotEqualExpression(opra, oprb, opra.getLine());
	}
	|^('>=' opra=expression oprb=expression)
	{
	   $expr = new GreaterEqualThanExpression(opra, oprb, opra.getLine());
	}
	|^('<=' opra=expression oprb=expression)
	{
	   $expr = new LessEqualThanExpression(opra, oprb, opra.getLine());
	}
	|^('<' opra=expression oprb=expression)
	{
	   $expr = new LessThanExpression(opra, oprb, opra.getLine());
	}
	|^('>' opra=expression oprb=expression)
	{
	   $expr = new GreaterThanExpression(opra, oprb, opra.getLine());
	}
	|^('!' opr=expression)
	{
	   $expr = new NotExpression(opr, opr.getLine());
	}
	|^('++' opr=expression )
	{
	   $expr = new IncreaseExpression(opr, opr.getLine());
	}
	|^('--' opr=expression )
	{
	   $expr = new DecreaseExpression(opr, opr.getLine());
	}
	|^(VAR ID)
	{
	   $expr = new VarExpression($ID.text, $ID.line);
	}
	|^(INVOKE ID (opr=expression{exprList.add(opr);})*)
	{
	   $expr = new InvokeExpression($ID.text, exprList, $ID.line);
	}
	|IntegerLiteral
	{
	   Integer i = Integer.valueOf($IntegerLiteral.text);
	   $expr = new ConstantExpression(i,  $IntegerLiteral.line);
	}
        |FloatingPointLiteral
        {
	   Double d = Double.valueOf($FloatingPointLiteral.text);
	   $expr = new ConstantExpression(d,  $FloatingPointLiteral.line);
	}
        |CharacterLiteral
        {
	   Character c = Character.valueOf($CharacterLiteral.text.charAt(0));
	   $expr = new ConstantExpression(c,  $CharacterLiteral.line);
	}
        |StringLiteral
        {
	   $expr = new ConstantExpression($StringLiteral.text,  $StringLiteral.line);
	}
        |token='true'
        {
	   $expr = new ConstantExpression(Boolean.TRUE,  token.getLine());
	}
        |token='false'
        {
	   $expr = new ConstantExpression(Boolean.FALSE,  token.getLine());
	}
        |token='null'
        {
	   $expr = new ConstantExpression(null,  token.getLine());
	}
	;

