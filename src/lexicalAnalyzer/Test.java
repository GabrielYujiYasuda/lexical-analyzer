package lexicalAnalyzer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Professor Carlos Augusto dos Santos Pinheiro.
        //Compilers.
        Lexer l = new Lexer();

        String input1 = "PRINT \"ASD, World!\"";
        String input2 = "SUB 34 66";
        String input3 = "ADD 12 32";

        ArrayList<Token> tokens1 = l.lex(input1);
        ArrayList<Token> tokens2 = l.lex(input2);
        ArrayList<Token> tokens3 = l.lex(input3);

        l.printTokens(tokens1);
        l.printTokens(tokens2);
        l.printTokens(tokens3);
    }
}
