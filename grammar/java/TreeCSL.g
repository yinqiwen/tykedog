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

language : ^(LANGUAGE function*);

function returns [Function func]
@init {func = new Function();}
:	
  ^(FUNCTION ID{func.setName($ID.text);} ^(PARAM (VAR{func.addArg($VAR.text);})*)  (s=statement{func.addStatment(s);})*);

statement returns[Statement stat]
@init {List<Statement> sl = new ArrayList<Statement>();}
	: 
    ^('{' (s=statement{sl.add(s);})*) 
    
    {
       BlockStatement block = new BlockStatement(sl);
    }
    |^('if' expression statement (^('elif' expression statement))* (^('else' statement))?) 
    |^('for' expression expression statement)
    | ^('while' expression statement )
    | 'return'
    | 'break'
    | 'continue'
    | expression
	;
	

expression returns[Expression expr]
	:	
	^('=' opra=expression oprb=expression)
	{
	   $expr = new AssignExpression(opra, oprb, opra.getLine());
	}
	|^('+=' opra=expression oprb=expression)
	{
	}
	|^('-=' opra=expression oprb=expression)
	|^('*=' opra=expression oprb=expression)
	|^('/=' opra=expression oprb=expression)
	|^('%=' opra=expression oprb=expression)
	|^('||' opra=expression oprb=expression)
	|^('&&' opra=expression oprb=expression)
	|^('+' opra=expression oprb=expression)
	|^('-' opra=expression oprb=expression)
	|^('*' opra=expression oprb=expression)
	|^('/' opra=expression oprb=expression)
	|^('%' opra=expression oprb=expression)
	|^('==' opra=expression oprb=expression)
	|^('~=' opra=expression oprb=expression)
	|^('!=' opra=expression oprb=expression)
	|^('>=' opra=expression oprb=expression)
	|^('<=' opra=expression oprb=expression)
	|^('<' opra=expression oprb=expression)
	|^('>' opra=expression oprb=expression)
	|^('!' expression)
	|^('++' expression )
	|^('--' expression )
	|^(VAR ID)
	{
	   $expr = new VarExpression($ID.text, $ID.line);
	}
	|^(INVOKE ID expression*)
	|IntegerLiteral
        |FloatingPointLiteral
        |CharacterLiteral
        |StringLiteral
        |'true'
        |'false'
        |'null'
	;

