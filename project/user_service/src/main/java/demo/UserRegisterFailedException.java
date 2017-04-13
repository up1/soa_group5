package demo;

/**
 * Created by DELL on 12/04/2560.
 */
public class UserRegisterFailedException extends RuntimeException {
    public UserRegisterFailedException() {
        super("Username or Password is incorrect");
    }
}
