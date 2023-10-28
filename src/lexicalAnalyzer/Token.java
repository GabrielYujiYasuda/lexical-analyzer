package lexicalAnalyzer;

public class Token {
    private String type;
    private String value;

    //Constructor
    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    //Getters, due the private attributes
    public String getType() {
        return type;
    }
    public String getValue() {
        return value;
    }
}
