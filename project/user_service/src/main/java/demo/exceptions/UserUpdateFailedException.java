package demo.exceptions;

public class UserUpdateFailedException extends RuntimeException {
    public UserUpdateFailedException() {
        super("User profile update failed :(");
    }
}
