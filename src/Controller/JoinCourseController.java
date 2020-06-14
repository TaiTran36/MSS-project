package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DB.StudentDB;
import View.CourseView;
import View.JoinCourse;

public class JoinCourseController {
	private JoinCourse joinCourseView;
	private String cr;
	private StudentDB courseDB;
	public JoinCourseController(JoinCourse joinCourseView) {
		this.joinCourseView = joinCourseView;
		joinCourseView.addJoinCourseListener(new JoinListener());
	}

	public void index(String code_root) {
		joinCourseView.setVisible(true);
		cr = code_root;
	}

	

	 class JoinListener implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	joinCourseView.setVisible(false);
	        	CourseView courseView = new CourseView(courseDB.getListClass(cr));
	        	CourseController courseController = new CourseController(courseView);
	        	courseController.index(cr);
	        }
	        
	      
	    }
    
}