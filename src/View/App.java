package View;

import Controller.LoginController;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginView = new Login();
                LoginController loginController = new LoginController(loginView);
                loginController.index();
            }
        });
    }
}
