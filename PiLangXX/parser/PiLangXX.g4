// antlr4 -package parser -o antlr-generated  -no-listener parser/PiLangXX.g4
grammar PiLangXX;

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
	| 'while' '(' expr ')' whileChildStmt   # whileStmt
    | 'print' expr ';'                      # printStmt
	| 'return' expr ';'						# returnStmt
	;

whileChildStmt: '{' whileChildStmt* '}'		# whileCompoundStmt
	| IDENTIFIER '=' expr ';'				# whileAssignStmt
	| 'if' '(' expr ')' whileChildStmt 'else' whileChildStmt	# whileIfStmt
	| 'while' '(' expr ')' whileChildStmt   # whileInWhileStmt
    | 'print' expr ';'                      # whilePrintStmt
	| 'return' expr ';'						# whileReturnStmt
	| 'break;'						# breakStmt
	| 'continue;'						# continueStmt
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
