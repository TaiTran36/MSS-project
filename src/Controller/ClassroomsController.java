package Controller;

import DB.ClassroomDB;
import View.ClassroomView;
import View.PopupAddRoom;
import Object.Classroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import Controller.LoginController.LoginListener;

public class ClassroomsController {

    private ClassroomView classroomview;
    private PopupAddRoom addRoom = new PopupAddRoom();
    private Classroom clr;
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
        	addRoom.setVisible(true);
        	addRoom.addGetInfoRoomListener(new AddRoomListener());
        }
        
      
    }
    class AddRoomListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			clr = addRoom.getInfoRoom();
			System.out.println(clr.getName());
		}
    	
    }

}
