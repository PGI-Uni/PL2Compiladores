lexer grammar EjemploLexer;

// Palabras clave específicas deben ir antes de ID
IF: 'if'|'IF';
THEN: 'then'|'THEN';
ELSE: 'else'|'ELSE';
PRINT: 'print'|'PRINT';
END: 'end'|'END';
LET: 'let'|'LET';
INPUT: 'input'|'INPUT';
FOR: 'for'|'FOR';
TO: 'TO';
NEXT: 'NEXT';
WHILE: 'WHILE';
REPEAT: 'REPEAT';
UNTIL: 'UNTIL';
REM: 'REM';
CONTINUE: 'CONTINUE';
EXIT: 'EXIT';
MOD: 'MOD';
VAL: 'VAL';
LEN: 'LEN';
ISNAN: 'ISNAN';

// Identificadores generales, números y otros tokens
ID: [a-zA-Z]+;       // Identificadores generales
NUMBER: [0-9]+;      // Números
STRING: '"' .*? '"';  // Cadenas de texto entre comillas
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQ: '=';
LT: '<';
GT: '>';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';

// Ignorar espacios en blanco y nuevas líneas
WS: [ \t\r\n]+ -> skip;
