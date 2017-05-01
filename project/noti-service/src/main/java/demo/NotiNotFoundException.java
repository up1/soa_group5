package demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Banky on 4/26/17.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotiNotFoundException extends RuntimeException {
    public NotiNotFoundException(String userName) {
        super("Could not find user " + userName);
    }
}
