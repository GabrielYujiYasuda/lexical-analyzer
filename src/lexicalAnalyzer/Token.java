package lexicalAnalyzer;

import java.util.ArrayList;

public class Token {
    private String type;
    private String value;

    //Construtor
    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    //Getters, já que os atributos devem ser privados.
    public String getType() {
        return type;
    }
    public String getValue() {
        return value;
    }
}
