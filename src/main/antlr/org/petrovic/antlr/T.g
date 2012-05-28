grammar T;

@parser::header {
package org.petrovic.antlr;
}

@members {
int blah = 0;
}

@lexer::header {
package org.petrovic.antlr;
}

/** Match things like "call foo;" */
r : 'call' ID ';' {System.out.println("invoke "+$ID.text);} ;

ID: 'a'..'z'+ ;
WS: (' '|'\n'|'\r')+   {$channel=HIDDEN;} ; // ignore whitespace
