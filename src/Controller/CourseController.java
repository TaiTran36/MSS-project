package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.ClassroomsController.AddRoomListener;
import Controller.ClassroomsController.ClassroomListener;
import DB.ClassroomDB;
import DB.StudentDB;
import View.CourseView;
import View.PopupActionStudent;
import View.PopupAddStudent;
import Object.Classroom;
import Object.Student;
public class CourseController {
	private CourseView courseView;
	private StudentDB courseDB;
	private String cr;
	private Student std;
	private PopupAddStudent popupView ;
	private PopupActionStudent popupAction;
	 
	 
	 public CourseController(CourseView courseView){
	        this.courseView = courseView;
	        courseView.addEditStudentListener(new CourseListener());
	        courseView.addAddStudentListener(new AddStuListener());
	    }

	    public void index(String code_root){
	    	cr = code_root;
	    	courseView.setVisible(true);
	    	
	    }
	    class CourseListener implements ListSelectionListener {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				 if (e.getValueIsAdjusting()) {
				        return;
				 }else {
					 ActionController actionController = new ActionController();
					 actionController.index( courseView.getStudentFromSelectedRow(cr), cr);
				 }
			}
	      
	    }
	    
	    class AddStuListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				popupView = new PopupAddStudent(cr);
				popupView.setVisible(true);
				popupView.addGetInfoStudent(new AddStudentListener());
				
			}
	    }
	    
	    class AddStudentListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				std = popupView.getInfoStudent();
				courseDB.addStudent(std, cr);
				popupView.setVisible(false);
				LinkedList<Student> s = courseDB.getListClass(cr);
				courseView.setEditStudent(s);
				
			}
	    }
	
}
