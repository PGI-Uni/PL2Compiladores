parser grammar EjemploParser;

options {
  tokenVocab = EjemploLexer;
  language = Java;
}

prog : (linea|INTRO)*;  // Cambiado para que no requiera el EOF explícito
linea : expr+ INTRO;

expr
    : LET IDENTIFICADOR OPIGUAL expr #LetExpr
    | IDENTIFICADOR #Identificador
    | STRING #StringLiteral
    | PARIZQ expr PARDER #Expresion
    | expr (OPSUM | OPRES | OPMULT | OPDIV | OPMOD) term #OperacionAritmetica
    | expr (COMPMENOR | COMPMAYOR | COMPIGUAL | COMPDIST | COMPMENORI | COMPMAYORI) expr* #OperacionComparativa
    | OPIGUAL expr #Opigual
    | PRINT PARIZQ expr PARDER #Print
    | FUNCION IDENTIFICADOR PARIZQ expr (COMA expr)* PARDER #Func
    | OPIF expr OPTHEN expr+ (OPELSE expr*)? OPEND #IfExpr
    | WHILE expr DO expr OPEND #WhileExpr
    | FOR IDENTIFICADOR OPIGUAL expr TO expr (STEP expr)? DO expr OPEND #ForExpr
    | REPEAT expr UNTIL expr #RepeatExpr
    | SWITCH expr CON (INTRO expr)+ #Switch
    | INT #Numero
    | WS expr #Ws
    | INTRO expr #ExprIntro
    ;

term
    : INT #TermNumero
    | IDENTIFICADOR #TermIdentificador
    | PARIZQ expr PARDER #TermParentesis
    ;
