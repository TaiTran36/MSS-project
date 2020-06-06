package Controller;

import Model.Authenticate;
import View.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private Login loginView;
    protected static Authenticate authenticate = new Authenticate();

    public LoginController(Login loginView){
        this.loginView = loginView;
        loginView.addLoginListener(new LoginListener());
    }
    public LoginController(){

    }

    public void index(){
        loginView.setVisible(true);
    }

    class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String [] request = loginView.getInputAccount();
            System.out.println(login(request[0], request[1]));
            loginView.messageLogin(login(request[0], request[1]));
        }
    }

    public int login(String code, String password){
        return authenticate.checkAccount(code, password);
    }
}
