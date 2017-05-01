package demo;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by caliver on 4/28/2017 AD.
 */
public class Token {
    private String tokenID;
    private boolean validation;

    public Token(){
        this.tokenID = new BigInteger(130, new SecureRandom()).toString(32);
        this.validation = true;
    }

    public void setTokenID(String tokenID) {
        this.tokenID = tokenID;
    }

    public String getTokenID() {
        return tokenID;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public boolean getValidation() {
        return validation;
    }
}
