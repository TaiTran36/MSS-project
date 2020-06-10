package Controller;

import DB.ClassroomDB;
import View.ClassroomView;
import View.PopupAddRoom;
import View.RegisterCourse;
import Object.Classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import Controller.LoginController.LoginListener;

public class ClassroomsController {

    private ClassroomView classroomview;
    private RegisterCourse registerCourse = new RegisterCourse();
    private Classroom clr;
    private ClassroomDB roomDB;
    public ClassroomsController(ClassroomView classroomview){
        this.classroomview = classroomview;
        classroomview.addAddCLassListener(new ClassroomListener());
    }

    public void index(){
        classroomview.setVisible(true);
    }

    class ClassroomListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        	registerCourse.setVisible(true);
        	registerCourse.addGetInfoRoomListener(new AddRoomListener());
        }
        
      
    }
    class AddRoomListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			clr = registerCourse.getInfoRoom();
			roomDB.addClassroom(clr);
			registerCourse.setVisible(false);
			LinkedList<Classroom> cr = roomDB.getListClass();
			classroomview.initClassroom(cr);
//			System.out.println(clr.getName());
		}
    	
    }

}
