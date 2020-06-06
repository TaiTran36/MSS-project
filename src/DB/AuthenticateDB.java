package DB;

import Model.Authenticate;

import java.util.HashMap;

public class AuthenticateDB {

    public HashMap<String, String> authDB;

    public AuthenticateDB(){
        this.authDB = insertGenerateDB();
    }

    public HashMap insertGenerateDB(){
        authDB = new HashMap<>();
        for (int i=0;i<10;i++){
            authDB.put("100".concat(String.valueOf(i)), "abcdef".concat(String.valueOf(i)));
        }
        return authDB;
    }

}
