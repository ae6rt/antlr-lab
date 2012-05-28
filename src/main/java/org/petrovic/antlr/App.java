package org.petrovic.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("waiting for input...");

        ANTLRInputStream antlrInputStream = new ANTLRInputStream(System.in);
        TLexer tLexer = new TLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream((tLexer));
        TParser tParser = new TParser(commonTokenStream);
        tParser.r();
    }
}
