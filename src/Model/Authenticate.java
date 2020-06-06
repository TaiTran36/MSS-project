package Model;

import DB.AuthenticateDB;

import java.util.HashMap;

public class Authenticate {

    private HashMap<String, String> authDB ;

    public Authenticate(){
        this.authDB = new AuthenticateDB().authDB;
    }

    public int checkAccount(String code, String password){
        if(authDB.containsKey(code)){
            if(authDB.containsValue(password)){
                return 1;
            }else{
                return 0;
            }
        }else{
            return -1;
        }
    }
}
