grammar CSL;

options {
    language=Python;
    output=AST;
}

tokens
{
   EVAL;
   VAR;
}

statement
	:	
	block 
	| 'if' ifExpr=logicExpression ifBlock=block ('elif' elifExpr=logicExpression elifBlock=block)* ('else' elseBlock=block)?
	 -> ^('if' $ifExpr $ifBlock ^('elif' $elifExpr $elifBlock)* ^('else' $elseBlock)?)
	| 'while'^ logicExpression block
	|  evalExpression ';'!
	|  assignExpression ';'!
	;
	
block	:	'{' statement* '}' -> ^('{' statement*);

evalExpression
	:	ID params -> ^(EVAL ID params);

param 	:	var|literal;
params 	:	param*;
	
assignExpression
	:	var '='^ (var | evalExpression);

parLogicExpression
	:	'('! logicExpression ')'!
	;

logicExpression
	:	atomLogicExpression (LogicJoinOperator^ logicExpression)?;

atomLogicExpression
	:	(leftOperand LogicCompareOperator^ rightOperand)
	| parLogicExpression;

leftOperand
	:	var;

rightOperand
	:	param;


LogicCompareOperator
	:	('==' | '!=' | '~=' | '>' | '<' | '>=' | '<=')
	;
LogicJoinOperator
	:	'&&'|'||';

var	:	('$'ID ->^(VAR ID)) 
                | ('$'ID'['param']' -> ^(VAR ID param));


literal	
	:   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   booleanLiteral
    |   'null'
	;


IntegerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;


booleanLiteral
    :   'true'
    |   'false'
    ;

ID
    :  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
   ;

fragment    
HexLiteral : '0' ('x'|'X') HexDigit+  ('l'|'L')? ;
fragment
DecimalLiteral : ('0' | '1'..'9' '0'..'9'*)  ('l'|'L')? ;
fragment
OctalLiteral : '0' ('0'..'7')+  ('l'|'L')? ;

CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent?  ('f'|'F'|'d'|'D') ?
    |   '.' ('0'..'9')+ Exponent?  ('f'|'F'|'d'|'D') ?
    |   ('0'..'9')+ Exponent?  ('f'|'F'|'d'|'D') ?
	;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
    
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;    

fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

NEWLINE
    :   (('\u000C')?('\r')? '\n' )+{$channel=HIDDEN;}
    ;

WS  :   (' '|'\t'|'\u000C') {$channel=HIDDEN;}
    ;


COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : ('//'|'#') ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;