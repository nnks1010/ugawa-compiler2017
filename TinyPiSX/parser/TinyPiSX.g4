// antlr4 -package parser -o antlr-generated  -no-listener parser/TinyPiSX.g4
grammar TinyPiSX;

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

expr: lorExpr
    ;

lorExpr: lorExpr LOROP landExpr
    | landExpr
    ;

landExpr: landExpr LANDOP orExpr
    | orExpr
    ;

orExpr: orExpr OROP andExpr
    | andExpr
    ;

andExpr: andExpr ANDOP equExpr
    | equExpr
    ;

equExpr: equExpr EQUOP cmpExpr
    | cmpExpr
    ;

cmpExpr: cmpExpr CMPOP addExpr
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

LOROP: '||';
LANDOP: '&&';
OROP: '|';
ANDOP: '&';
EQUOP: '=='|'!=';
CMPOP: '<'|'<='|'>'|'>=';
ADDOP: '+';
SUBOP: '-';
MULOP: '*'|'/';
UNARYOP: '~'|'!';

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
VALUE: [0-9]|[1-9][0-9]+;
WS: [ \t\r\n] -> skip;
