tree grammar TreeCSL;

options{
    tokenVocab=CSL;
    ASTLabelType=CommonTree;
}


@header {
package org.tykedog.csl.parser;
import org.tykedog.csl.interpreter.expression.*;
import org.tykedog.csl.interpreter.statement.*;
}

language : ^(LANGUAGE function*);

function:	^(FUNCTION ID ^(PARAM (^(VAR ID))*) statement*);

statement returns[Statement stat]
@init {List<Statement> sl = new ArrayList<Statement>();}
	: 
    ^('{' (s=statement{sl.add(s);})*) 
    
    {
       BlockStatement block = new BlockStatement();
         
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
	   $expr = new AssignExpression(opra, oprb);
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
	|^(INVOKE ID expression*)
	|IntegerLiteral
        |FloatingPointLiteral
        |CharacterLiteral
        |StringLiteral
        |'true'
        |'false'
        |'null'
	;

