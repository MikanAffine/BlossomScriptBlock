grammar Blossom;

options {
language = Java;
}

@header {
package me.koneko.blossom.parse;
}

// parser rules

file: stmt* EOF;


stmt: varDeclare | ifStmt | whileStmt | breakStmt | continueStmt | blockStmt | expr SEMI;

varDeclare: Var Identifier (Assign cond)? SEMI;
blockStmt: LBrace stmt* RBrace;
ifStmt: If LParen cond RParen stmt (Else stmt)?;
whileStmt: While LParen cond RParen stmt;
breakStmt: Break SEMI;
continueStmt: Continue SEMI;

list: cond (Comma cond)*;
cond: expr (RelatOp cond)?;
expr: term (CalcOp0 expr)?;
term: factor (CalcOp1 term)?;
factor: LParen expr RParen | literal | Identifier | Identifier LParen list? RParen;

literal: Float | Integer | String;
// lexer rules

// keywords
Var: 'var';
If: 'if';
Else: 'else';
While: 'while';
Continue: 'continue';
Break: 'break';

fragment Digit: [0-9];
fragment Letter: [a-zA-Z];
fragment Char: ~["\\\r\n];
fragment Sign: [+-];

// identifier
Identifier: (Letter | '_' | '$') (Letter | Digit | '_' | '$')*;

// literals
Float: Sign? Digit+ '.' Digit*;
Integer: Sign? Digit+;
String: '"' Char* '"';

// edges
Comma: ',';
LParen: '(';
RParen: ')';
LBrace: '{';
RBrace: '}';
/*
LBrack: '[';
RBrack: ']';
*/

// operators
Assign: '=';

RelatOp: GTR | LSS | EQ | LEQ | GEQ | NEQ;
EQ: '==';
GTR: '>';
LSS: '<';
LEQ: '<=';
GEQ: '>=';
NEQ: '!=';

CalcOp0: ADD | SUB;
ADD: '+';
SUB: '-';
CalcOp1: MUL | DIV | MOD;
MUL: '*';
DIV: '/';
MOD: '%';

SEMI: ';';

Whitespace: [ \t\r\n] -> skip;

// comment
Comment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]* -> skip;