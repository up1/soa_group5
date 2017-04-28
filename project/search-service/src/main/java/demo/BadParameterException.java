package demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BadParameterException extends RuntimeException {
    public BadParameterException(String parameter, Long value) {
        super("Bad Parameter : " + parameter + " = " + value);
    }
}