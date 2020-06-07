package Controller;

import DB.ClassroomDB;
import View.ClassroomView;
import Object.Classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ClassroomsController {

    private ClassroomView classroomview;
    private ClassroomDB classroomDB;

    public ClassroomsController(ClassroomView classroomview){
//        this.classroomDB = new ClassroomDB();
//        LinkedList<Classroom> cr = classroomDB.getListClass();
        this.classroomview = classroomview;
//        classroomview.getListClass(cr);
    }

    public void index(){
        classroomview.setVisible(true);

//        classroomview.addGetListListener(new getListListener());


    }


}
