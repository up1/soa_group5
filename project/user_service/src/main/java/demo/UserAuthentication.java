package demo;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by caliver on 4/23/2017 AD.
 */
public class UserAuthentication {

    private static Token token;
    private static Dictionary<String, Token> tokenList = new Hashtable<>();
    private static Dictionary<String , User> sessionDictionary = new Hashtable<>();

    private UserAuthentication(User user){
        token = new Token();
        tokenList.put(token.getTokenID(), token);
        sessionDictionary.put(token.getTokenID(), user);
    }

    public static User getSession(String tokenID){
        return sessionDictionary.get(tokenID);
    }

    public static void deleteSession(String tokenID){
        tokenList.get(tokenID).setValidation(false);
        sessionDictionary.remove(tokenID);
        token = null;
    }

    public static Token authorize(User user){
        new UserAuthentication(user);
        return token;
    }

    public static boolean isValidToken(String tokenID) {
        return !(tokenID == null || sessionDictionary.get(tokenID) == null || !tokenList.get(tokenID).getValidation());
    }
}
