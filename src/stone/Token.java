package stone;

/**
 * Created by lixiaoxun on 2016/7/26.
 */
public abstract class Token {
    public static final Token EOF = new Token(-1){};
    public static final String EOL = "\\n";
    private int lineNumber;

    protected Token(int line){
        lineNumber = line;
    }

    public int getLineNumber() { return lineNumber; }
    public boolean isIdentifier() { return false; }
    public boolean isNumber() { return false; }
    public boolean isString() { return false; }
    public int getNumber() throws StoneException {
        throw new StoneException("not number token");        //此处和书中代码不一致，存疑
    }

    public String getText() {
        return "";
    }
}
