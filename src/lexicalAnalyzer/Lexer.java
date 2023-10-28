package lexicalAnalyzer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    public ArrayList<Token> lex(String input) {
        var tokens = new ArrayList<Token>();

        //Used to define and compile a regex, turning them into strings.
        Pattern pattern = Pattern.compile("(PRINT|ADD|SUB)|\"(.*?)\"|(\\d+)|(\\s+)");
        //Used to match the regex and the input string.
        Matcher matcher = pattern.matcher(input);

        //find is used to find the next correspondent regex in the string.
        //while group is used do access the next correspondent regex in the string\
        //after a succeeded find.
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                tokens.add(new Token("COMMAND", matcher.group(1)));
            } else if (matcher.group(2) != null) {
                tokens.add(new Token("STRING", matcher.group(2)));
            } else if (matcher.group(3) != null) {
                tokens.add(new Token("NUMBER", matcher.group(3)));
            } else if (matcher.group(4) != null) {
                tokens.add(new Token("WHITESPACE", "\"" + matcher.group(4) + "\""));
            }
        }

        return tokens;
    }

    public  void printTokens(ArrayList<Token> tokens) {
        for (Token token : tokens) {
            System.out.println(token.getType() + ": " + token.getValue());
        }
    }
}
