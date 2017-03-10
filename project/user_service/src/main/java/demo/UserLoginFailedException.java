package demo;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 7/3/2560.
 */
public class UserLoginFailedException extends RuntimeException {
    public UserLoginFailedException() {
        super("Username or Password is incorrect");
    }
}
