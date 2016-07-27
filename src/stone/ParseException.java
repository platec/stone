package stone;

import java.io.IOException;

/**
 * Created by lixiaoxun on 2016/7/26.
 */
public class ParseException extends Exception {

    public ParseException(Token t) {
        this("", t);
    }

    public ParseException(String msg, Token t) {
        super("syntax error around" + location(t) + ". " + msg);
    }

    public ParseException(IOException e) {
        super(e);
    }

    public ParseException(String msg) {
        super(msg);
    }

    public static String location(Token t) {
        if (t == Token.EOF)
            return "the last line";
        else
            return "\"" + t.getText() + "\" at line " + t.getLineNumber();
    }

}
