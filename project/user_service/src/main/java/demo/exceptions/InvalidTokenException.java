package demo.exceptions;

/**
 * Created by caliver on 4/25/2017 AD.
 */
public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String token) {
        super("This token is invalid : " + token);
    }
}
