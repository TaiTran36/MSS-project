package Controller;

import Model.Authenticate;
import View.Login;

public class LoginController {

    private Login loginView;
    protected static Authenticate authenticate = new Authenticate();

    public LoginController(Login loginView){
        this.loginView = loginView;
    }
    public LoginController(){

    }

    public void index(){
        loginView.setVisible(true);
    }

    public int login(String code, String password){
        return authenticate.checkAccount(code, password);
    }
}
