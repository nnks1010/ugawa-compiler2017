// antlr4 -package parser -o antlr-generated  -no-listener parser/TinyPiS.g4
grammar TinyPiS;

prog: varDecls stmt
    ;

varDecls: ( 'var' IDENTIFIER ';' )*
    ;

stmt: '{' stmt* '}'                         # compoundStmt
    | IDENTIFIER '=' expr ';'               # assignStmt
    | 'if' '(' expr ')' stmt 'else' stmt    # ifStmt
    | 'while' '(' expr ')' stmt             # whileStmt
    | 'print' expr ';'                      # printStmt
    ;

expr: orExpr
    ;

orExpr: orExpr OROP andExpr
    | andExpr
    ;

andExpr: andExpr ANDOP addExpr
    | addExpr
    ;

addExpr: addExpr (ADDOP|SUBOP) mulExpr
    | mulExpr
    ;

mulExpr: mulExpr MULOP unaryExpr
    | unaryExpr
    ;

unaryExpr: VALUE                            # literalExpr
    | SUBOP unaryExpr                       # unExpr
    | UNARYOP unaryExpr                     # unExpr
    | IDENTIFIER                            # varExpr
    | '(' expr ')'                          # parenExpr
    ;

OROP: '|';
ANDOP: '&';
ADDOP: '+';
SUBOP: '-';
MULOP: '*'|'/';
UNARYOP: '~';

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
VALUE: [0-9]|[1-9][0-9]+;
WS: [ \t\r\n] -> skip;
