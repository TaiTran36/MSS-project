package Test;

import DB.AuthenticateDB;
import Model.Authenticate;

public class TestLogin {
    public static void main(String[] args) {
        String code = "1001";
        String password = "abcdef1";
        AuthenticateDB authDB = new AuthenticateDB();
        System.out.println(authDB.authDB.size());
        Authenticate auth = new Authenticate();

        System.out.println(auth.checkAccount(code,password));

    }
}
