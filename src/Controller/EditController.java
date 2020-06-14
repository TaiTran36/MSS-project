package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import Controller.ActionController.EditListener;
import Controller.CourseController.AddStudentListener;
import DB.StudentDB;
import Object.Student;
import View.CourseView;
import View.PopupActionStudent;
import View.PopupAddStudent;
import View.PopupEditStudent;

public class EditController {
	
	private PopupEditStudent editView;
	private String cr;
	private StudentDB courseDB;
	private CourseView courseView;
	private PopupActionStudent actionView;
	public EditController() {
		
	}
	
	public void index(Student stu, String code_room) {
		editView = new PopupEditStudent(stu);
		cr = code_room;
		editView.setVisible(true);
		editView.addEditStudentListener(new EditListener());
	}

	
	 class EditListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					Student stu = editView.getEditStudent();
					courseDB.editStudent(stu, cr);
					LinkedList<Student> s = courseDB.getListClass(cr);
					courseView.setEditStudent(s);
					editView.setVisible(false);
//					actionView.setVisible(false);
					
			}
	    }
}
