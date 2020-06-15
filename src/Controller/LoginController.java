package Controller;

import Model.Authenticate;
import Model.ClassroomDB;
import View.ClassroomView;
import View.Login;
import Object.Classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

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
            int loginStatus = login(request[0], request[1]);
            if(loginStatus == 1){
                ClassroomDB classroomDB = new ClassroomDB();
                LinkedList<Classroom> cr = classroomDB.getListClass();
                ClassroomView classroom = new ClassroomView(cr);
                ClassroomsController classroomsController = new ClassroomsController(classroom);
                classroomsController.index();
                loginView.setVisible(false);
            }else{
                loginView.messageLogin(0);
            }

        }
    }

    public int login(String code, String password){
        return authenticate.checkAccount(code, password);
    }
}
