package Controller;

import DB.ClassroomDB;
import View.ClassroomView;
import Object.Classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ClassroomsController {

    private ClassroomView classroomview;

    public ClassroomsController(ClassroomView classroomview){
        this.classroomview = classroomview;
    }

    public void index(){
        classroomview.setVisible(true);
    }

    public void openClassroom(String code){
        classroomview.setVisible(false);
    }


}
