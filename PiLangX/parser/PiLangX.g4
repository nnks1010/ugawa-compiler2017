// antlr4 -package parser -o antlr-generated  -no-listener parser/PiLangX.g4
grammar PiLangX;

prog: varDecls funcDecl*
	;

funcDecl: 'function' IDENTIFIER '(' params ')' '{' varDecls stmt* '}'
    ;

params:   /* no parameter */
    | IDENTIFIER (',' IDENTIFIER)*
    ;

varDecls: ('var' IDENTIFIER ';')*
    ;

stmt: '{' stmt* '}'							# compoundStmt
	| IDENTIFIER '=' expr ';'				# assignStmt
	| 'if' '(' expr ')' stmt 'else' stmt	# ifStmt
	| 'while' '(' expr ')' stmt				# whileStmt
    | 'print' expr ';'                      # printStmt
	| 'return' expr ';'						# returnStmt
	;

expr: orExpr
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

unaryExpr: VALUE                # literalExpr
    | SUBOP unaryExpr           # unExpr
    | UNARYOP unaryExpr         # unExpr
	| IDENTIFIER			    # varExpr
	| '(' expr ')'		    	# parenExpr
	| IDENTIFIER '(' args ')'   # callExpr
	;

args: /* no arguments */
	| expr ( ',' expr )*
	;

OROP: '|';
ANDOP: '&';
EQUOP: '=='|'!=';
CMPOP: '<'|'<='|'>'|'>=';
ADDOP: '+';
SUBOP: '-';
MULOP: '*'|'/';
UNARYOP: '~';

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
VALUE: [0-9]|[1-9][0-9]+;
WS: [ \t\r\n] -> skip;
