package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import Controller.CourseController.AddStudentListener;
import Controller.CourseController.CourseListener;
import DB.StudentDB;
import Object.Student;
import View.CourseView;
import View.PopupActionStudent;
import View.PopupAddStudent;
import View.PopupEditStudent;

public class ActionController {
	
	private PopupActionStudent actionStudent;
	private CourseView courseView;
	private Student student;
	private static String cr;
	private PopupEditStudent editStudent;
	private StudentDB courseDB;
	private CourseView cw;
	
	public ActionController() {
		
	}
	
	public void index(Student stu, String code_root) {
		
		actionStudent = new PopupActionStudent(stu, code_root);
		student = stu;
		cr = code_root;
		actionStudent.setVisible(true);
		actionStudent.addEditStudentListener(new EditListener());
		actionStudent.addDeleteStudentListener(new DeleteListener());
	}
	
	class EditListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			EditController editController = new EditController();
			editController.index(student, cr);
			actionStudent.setVisible(false);
		}
    }
	
	class DeleteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String id = cw.getIdStudent();
			courseDB.deleteStudent(id, cr);
			LinkedList<Student> s = courseDB.getListClass(cr);
			courseView.setEditStudent(s);
		}
    }

}
