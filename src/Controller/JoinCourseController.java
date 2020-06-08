package Controller;

import View.JoinCourse;

public class JoinCourseController {
	private JoinCourse joinCourseView;

	public JoinCourseController(JoinCourse joinCourseView) {
		this.joinCourseView = joinCourseView;
	}

	public void index() {
		joinCourseView.setVisible(true);
	}

}
