parser grammar EjemploParser;

options { tokenVocab = EjemploLexer; }

// Programa principal
program: statement* EOF;

// Definición de una declaración
statement
    : assignment
    | printStmt
    | inputStmt
    | ifStmt
    | forLoop
    | whileLoop
    | repeatLoop
    | comment
    | functionCall
    | exitStmt                // Añadir salida anticipada
    | continueStmt            // Añadir continuación
    ;

// Asignación en el formato `LET ID = expr`
assignment: LET ID EQ expr;

// Declaración `PRINT expr`
printStmt: PRINT expr;

// Declaración `INPUT STRING ID`
inputStmt: INPUT STRING ID;

// Condicional en el formato `IF expr THEN statement* (ELSE statement*)? END`
ifStmt: IF expr THEN statement* (ELSE statement*)? END;

// Bucle FOR `FOR ID = expr TO expr statement* NEXT`
forLoop: FOR ID EQ expr TO expr statement* NEXT;

// Bucle WHILE `WHILE expr statement* END`
whileLoop: WHILE expr statement* END;

// Bucle REPEAT `REPEAT statement* UNTIL expr`
repeatLoop: REPEAT statement* UNTIL expr;

// Comentario `REM STRING`
comment: REM STRING;

// Llamadas a funciones `VAL(expr)`, `LEN(expr)`, `ISNAN(expr)`
functionCall: (VAL | LEN | ISNAN) LPAREN expr RPAREN;

// Declaración de salida `EXIT`
exitStmt: EXIT;

// Declaración de continuación `CONTINUE`
continueStmt: CONTINUE;

// Expresión aritmética y lógica
expr
    : expr (PLUS | MINUS) expr     // Operaciones aritméticas
    | expr (MULT | DIV | MOD) expr // Operaciones aritméticas y MOD
    | expr (LT | GT | EQ) expr     // Comparaciones
    | LPAREN expr RPAREN           // Expresión entre paréntesis
    | NUMBER                       // Números
    | ID                           // Identificadores de variables
    | STRING                       // Cadenas de texto
    | functionCall                 // Llamada a función
    ;
