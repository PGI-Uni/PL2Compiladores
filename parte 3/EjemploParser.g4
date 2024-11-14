parser grammar EjemploParser;

options {
  tokenVocab = EjemploLexer;
  language = Java;
}

prog : (expr)*;  // Cambiado para que no requiera el EOF explícito

expr
    : IDENTIFICADOR #Identificador
    | STRING #StringLiteral
    | PARIZQ expr PARDER #Expresion
    | concatenar #Conca 
    | opArimetica  #OpArim 
    | expr (COMPMENOR | COMPMAYOR | COMPIGUAL | COMPDIST | COMPMENORI | COMPMAYORI) expr+ #OperacionComparativa
    | OPIGUAL expr #Opigual
    | PRINT expr #Print
    | INPUT STRING? IDENTIFICADOR expr? #Input
    | LET IDENTIFICADOR OPIGUAL expr #LetExpr
    | IDFUN PARIZQ expr (COMA expr)* PARDER #Func
    | OPIF expr OPTHEN expr+ INTRO OPEND #if
    | OPELSE expr+ INTRO OPEND #elseExpr
    | WHILE expr (INTRO expr)*? INTRO OPEND #WhileExpr
    | FOR IDENTIFICADOR OPIGUAL expr TO expr (INTRO expr)*? INTRO NEXT #ForExpr
    | REPEAT INTRO expr+ INTRO UNTIL expr* #RepeatExpr
    | SWITCH expr CON (INTRO expr)+ #Switch
    | INT #Numero
    | WS expr #Ws
    | INTRO expr? #ExprIntro
    | CONTINUE #Continua
    | EXIT #Sale
    ;

concatenar: (STRING|IDENTIFICADOR) OPSUM (STRING|IDENTIFICADOR) ;

opArimetica: term (OPSUM | OPRES | OPMULT | OPDIV | OPMOD) term ;

term
    : INT #TermNumero
    | IDENTIFICADOR #Id
    | PARIZQ expr PARDER #TermParentesis
    ;
