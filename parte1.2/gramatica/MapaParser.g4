parser grammar MapaParser;

options { tokenVocab = MapaLexer; }

mapa : MAPA* barcoInfo* criaturaInfo* posicionInfo* peligroInfo* EOF;


barcoInfo : NOMBRE_BARCO TE_DA NUMERO PUNTOS ;

posicionInfo : NOMBRE_BARCO ENTERRADO_EN NUMERO COMA NUMERO ;

criaturaInfo : NOMBRE_BARCO TE_QUITA NUMERO PUNTOS;

peligroInfo : NOMBRE_BARCO OCULTO NUMERO COMA NUMERO;