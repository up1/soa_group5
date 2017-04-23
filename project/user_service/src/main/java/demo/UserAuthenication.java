package demo;

import javax.servlet.http.HttpSession;

/**
 * Created by caliver on 4/23/2017 AD.
 */
public class UserAuthenication {
    private static HttpSession session;

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

    public static HttpSession authorize(User user){
        if (session == null)
            new UserAuthenication(user);
        return session;
    }

}
