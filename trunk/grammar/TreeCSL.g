tree grammar TreeCSL;

options{
    tokenVocab=CSL;
    ASTLabelType=CommonTree;
    language=Python;
}

statement
	:
	^('{' statement*)
	|^('if' logicExpression ^('{' statement*) ^('elif' logicExpression ^('{' statement*))* ^('else' ^('{' statement*))?)
	| 	;
	
logicExpression
	:	^('&&' opra=logicExpression oprb=logicExpression)
	| ^('||' opra=logicExpression oprb=logicExpression)
	| ^(LogicCompareOperator var var)
	| ^(LogicCompareOperator var StringLiteral)
	;
	
var	:	^(VAR ID)
	|	^(VAR ID StringLiteral);
	|       ^(VAR ID var);
