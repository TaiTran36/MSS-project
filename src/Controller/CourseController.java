package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.ClassroomsController.AddRoomListener;
import Controller.ClassroomsController.ClassroomListener;
import Model.ClassroomDB;
import Model.HeapSort;
import Model.SortedArrayPriorityQueue;
import Model.StudentDB;
import View.CourseView;
import View.PopupActionStudent;
import View.PopupAddStudent;
import View.PopupAttendance;
import Object.Classroom;
import Object.Student;
public class CourseController {
	private CourseView courseView;
	private StudentDB courseDB;
	private String cr;
	private Student std;
	private PopupAddStudent popupView ;
	private PopupActionStudent popupAction;
	 private PopupAttendance attendance;
	 
	 public CourseController(CourseView courseView){
	        this.courseView = courseView;
	        courseView.addEditStudentListener(new CourseListener());
	        courseView.addAddStudentListener(new AddStuListener());
	        courseView.addAttendanceStudentListener(new AttendanceStuListener());
	        courseView.addSearchListener(new SearchStuListener());
	        courseView.addShowListListener(new ListStuListener());
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
	    
	    class AttendanceStuListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
	      
	    }
	    
	    class ListStuListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SortedArrayPriorityQueue s = courseDB.getListClass(cr);
				courseView.setEditStudent(s);
			}
	      
	    }
	    
	    class SearchStuListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name []= courseView.getNameSearch().split(" ");
				if(!name.equals("")) {
					SortedArrayPriorityQueue s = courseDB.getListClass(cr);
					int index = courseDB.sreach(s, 0, s.size()-1, name[name.length-1].toLowerCase());
					if(index == -1) {
						courseView.setSearchMess("Tên sinh viên không được tìm thấy...");
					}else {
						Student st = (Student) s.get(index).getValue();
						courseView.setSearchStudent(st);
					}
					
				}else {
					courseView.setSearchMess("Bạn cần nhập tên để tìm kiếm...");
				}
			}
	      
	    }
	    
	    
	    class AttendanceStudentListener implements ListSelectionListener {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (e.getValueIsAdjusting()) {
			        return;
			 }else {
				 String [] arr = attendance.getValueStudent();
				 courseDB = new StudentDB();
				 courseDB.attendanceStudent(arr[1], cr, (arr[0].equals("true"))?(1):0 );
				 SortedArrayPriorityQueue s = courseDB.getListClass(cr);
				 courseView.setEditStudent(s);
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
				SortedArrayPriorityQueue s = courseDB.getListClass(cr);
				courseView.setEditStudent(s);
				
			}
	    }
	
}
