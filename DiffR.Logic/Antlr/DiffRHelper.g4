grammar DiffRHelper;


message : line+ EOF;
INT : [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
NUM : [0-9];
COMMA : ',';
DOT : '.';
QUOTE : '"';
WS: [ \t\n\r\f]+ -> skip ;

line : text+ jsonObj text+ jsonObj text+;


text : ID 
| NUM 
| COMMA 
| INT 
| '(' ID INT ')' 
| DOT
|QUOTE;

jsonObj : '{' text '}';