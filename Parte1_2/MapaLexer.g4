lexer grammar MapaLexer;

// Palabras clave y símbolos
MAPA         : '"Mapa de pruebas"';
TE_DA        : 'te da';
TE_QUITA     : 'te quita';
ENTERRADO_EN : 'esta enterrado en' | 'está enterrado en';
OCULTO       : 'esta oculto en';
PUNTOS       : 'puntos';
COMA         : ',' ;


// Nombres y tipos de datos
NOMBRE_BARCO : '"' [A-Z][a-zA-Z ]* '"'; // Usamos [a-zA-Z ] para permitir letras y espacios
NUMERO       : [0-9]+;
NOMBRE_PELIGRO: '"' [A-Z][a-zA-Z ]* '"';
// Ignorar espacios en blanco y saltos de línea
WS : [ \t\r\n]+ -> skip;