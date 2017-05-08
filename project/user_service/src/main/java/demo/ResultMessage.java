package demo;

/**
 * Created by Kununya on 8/5/2560.
 */
public class ResultMessage {

    private String username;
    private String message;

    public ResultMessage(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public ResultMessage(String username, String s, String firstname, String lastname, String gender, String email, String noti_status) {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
