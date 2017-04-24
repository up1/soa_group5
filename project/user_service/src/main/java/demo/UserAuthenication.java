package demo;

import javax.servlet.http.HttpSession;
import java.util.Dictionary;

/**
 * Created by caliver on 4/23/2017 AD.
 */
public class UserAuthenication {
    private static HttpSession session;
    private static Dictionary<String ,HttpSession> sessionDictionary;

    private UserAuthenication(User user){
        this.session.setAttribute("username", user.getUsername());
        this.session.setAttribute("firstname", user.getFirstname());
        this.session.setAttribute("lastname", user.getLastname());
        this.session.setAttribute("gender", user.getGender());
        this.session.setAttribute("birth_date", user.getBirth_date());
        this.session.setAttribute("email", user.getEmail());
        this.session.setAttribute("noti_status", user.getNoti_status());
    }

    public static HttpSession getSession(){
        return session;
    }

    public static void deleteSession(){
        session.invalidate();
        session = null;
    }

    public static String authorize(User user){
        if (session == null) {
            new UserAuthenication(user);
            sessionDictionary.put(session.getId(), session);
        }
        return session.getId();
    }

}
