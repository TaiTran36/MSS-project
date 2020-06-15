package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Model.HeapSort;
import Model.SortedArrayPriorityQueue;
import Object.Course;
import Object.Student;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class CourseView extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JButton btnAddStu;
	private static JButton btnimDanh;
	private JButton btnSearch;
	private JLabel lblMessSearch;
	private JButton btnList;
	
	private static String [] columnNames = new String [] {
            "MSV", "Họ và tên", "Ngày sinh", "Địa chỉ", "Số buổi vắng", "Điểm thường xuyên", "Điểm giữa kì", "Điểm cuối kỳ", "Điểm trung bình"};
	
	private Object data = new Object [][] {
		
	};
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public CourseView(SortedArrayPriorityQueue student) {
		initCourseView(student);
	}
	
	public void initCourseView(SortedArrayPriorityQueue student) {
		setTitle("Chia sẻ tài liệu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(-5, -5, 1400, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 226, 748);
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(0, 0, 226, 231);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("NGUYỄN THỊ HỒNG MINH");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 190, 206, 30);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 194, 168);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(ListStudents.class.getResource("/res/avt.png")));

		btnList = new JButton("Danh sách sinh viên");
		btnList.setForeground(Color.WHITE);
		btnList.setFont(new Font("Arial", Font.PLAIN, 13));
		btnList.setBackground(new Color(0, 139, 139));
		btnList.setBounds(0, 309, 226, 47);
		panel.add(btnList);

		btnimDanh = new JButton("Điểm danh");
		btnimDanh.setForeground(Color.WHITE);
		btnimDanh.setFont(new Font("Arial", Font.PLAIN, 13));
		btnimDanh.setBackground(new Color(0, 139, 139));
		btnimDanh.setBounds(0, 358, 226, 47);
		panel.add(btnimDanh);

		JButton btnChiaSTi = new JButton("Chia sẻ tài liệu");
		btnChiaSTi.setForeground(Color.WHITE);
		btnChiaSTi.setFont(new Font("Arial", Font.PLAIN, 13));
		btnChiaSTi.setBackground(new Color(0, 139, 139));
		btnChiaSTi.setBounds(0, 406, 226, 47);
		panel.add(btnChiaSTi);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(224, 0, 1156, 56);
		panel_3.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(145, 11, 317, 34);
		panel_3.add(textField);
		textField.setColumns(10);
		
		btnSearch = new JButton("Tìm kiếm");
		btnSearch.setBackground(new Color(46, 139, 87));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBounds(472, 11, 109, 34);
		panel_3.add(btnSearch);
		
		lblMessSearch = new JLabel("");
		lblMessSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMessSearch.setForeground(Color.WHITE);
		lblMessSearch.setBounds(632, 11, 392, 34);
		panel_3.add(lblMessSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 128, 1086, 502);
		contentPane.add(scrollPane);

		
		table = new JTable();
		Object [][] students = new Object[student.size()][9];
		for (int i = 0; i < student.size(); i++) {
			Student s = (Student)student.get(i).getValue();
			students[i][0] = s.getCode();
			students[i][1] = s.getName();
			students[i][2] = s.getDateOfBirth();
			students[i][3] = s.getAddress();
			students[i][4] = s.getRoom().get(0).getNumOfAbsences();
			students[i][5] = s.getRoom().get(0).getScoreAttendance();
			students[i][6] = s.getRoom().get(0).getScoreMidTerm();
			students[i][7] = s.getRoom().get(0).getScoreEndTerm();
			students[i][8] = s.getRoom().get(0).getScore();
        }
		
		
	      
		table.setModel(new DefaultTableModel(students,columnNames));
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
	    table.getColumnModel().getColumn(1).setPreferredWidth(150);
	    table.getColumnModel().getColumn(2).setPreferredWidth(50);
	    table.getColumnModel().getColumn(3).setPreferredWidth(150);
	    table.getColumnModel().getColumn(4).setPreferredWidth(50);
	    table.getColumnModel().getColumn(5).setPreferredWidth(50);
	    table.getColumnModel().getColumn(6).setPreferredWidth(50);
	    table.getColumnModel().getColumn(7).setPreferredWidth(50);
	    table.getColumnModel().getColumn(8).setPreferredWidth(50);
		table.setRowHeight(30);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		scrollPane.setPreferredSize(new Dimension (480, 300));
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách sinh viên");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(394, 67, 865, 39);
		contentPane.add(lblNewLabel_2);
		
		btnAddStu = new JButton("Thêm sinh viên");
		btnAddStu.setBackground(new Color(0, 128, 128));
		btnAddStu.setForeground(Color.WHITE);
		btnAddStu.setBounds(1180, 644, 138, 41);
		contentPane.add(btnAddStu);
		
		
	}
	
	public void addShowListListener(ActionListener listener) {
		  
		btnList.addActionListener(listener);
	 }
	
	 public void addSearchListener(ActionListener listener) {
		  
		 btnSearch.addActionListener(listener);
	 }
	
	 public void addEditStudentListener(ListSelectionListener listener) {
		  
		 table.getSelectionModel().addListSelectionListener(listener);
	 }
	 
	 public void addAddStudentListener(ActionListener listener) {
		 btnAddStu.addActionListener(listener);
		
	 }
	 
	 public static void addAttendanceStudentListener(ActionListener listener) {
		 btnimDanh.addActionListener(listener);
	 }
	 
	 public static void setEditStudent(SortedArrayPriorityQueue student) {
		 Object [][] students = new Object[student.size()][9];
			for (int i = 0; i < student.size(); i++) {
				Student s = (Student)student.get(i).getValue();
				students[i][0] = s.getCode();
				students[i][1] = s.getName();
				students[i][2] = s.getDateOfBirth();
				students[i][3] = s.getAddress();
				students[i][4] = s.getRoom().get(0).getNumOfAbsences();
				students[i][5] = s.getRoom().get(0).getScoreAttendance();
				students[i][6] = s.getRoom().get(0).getScoreMidTerm();
				students[i][7] = s.getRoom().get(0).getScoreEndTerm();
				students[i][8] = s.getRoom().get(0).getScore();
	        }
		 table.setModel(new DefaultTableModel(students,columnNames));
	 }
	 
	 public static void setSearchStudent(Student student) {
		 Object [][] students = new Object[1][9];
		students[0][0] = student.getCode();
		students[0][1] = student.getName();
		students[0][2] = student.getDateOfBirth();
		students[0][3] = student.getAddress();
		students[0][4] = student.getRoom().get(0).getNumOfAbsences();
		students[0][5] = student.getRoom().get(0).getScoreAttendance();
		students[0][6] = student.getRoom().get(0).getScoreMidTerm();
		students[0][7] = student.getRoom().get(0).getScoreEndTerm();
		students[0][8] = student.getRoom().get(0).getScore();
	   
		 table.setModel(new DefaultTableModel(students,columnNames));
	 }
	 public static Student getStudentFromSelectedRow(String code_root) {
		 Student std = null;
		 int row = table.getSelectedRow();
	        if (row >= 0) {
	        	Course c = new Course(Double.parseDouble(table.getModel().getValueAt(row, 8).toString()), Integer.parseInt(table.getModel().getValueAt(row, 4).toString()),Double.parseDouble(table.getModel().getValueAt(row, 5).toString()),Double.parseDouble(table.getModel().getValueAt(row, 6).toString()),Double.parseDouble(table.getModel().getValueAt(row, 7).toString()));
	        	LinkedList<Course> courses = new LinkedList<Course>();
	        	courses.add(c);
	        	std = new Student(table.getModel().getValueAt(row, 1).toString(),table.getModel().getValueAt(row, 0).toString(), table.getModel().getValueAt(row, 2).toString(), table.getModel().getValueAt(row, 3).toString(), courses);
	        }
	    return std; 
	 }
	 public static String  getIdStudent() {
		 String id  = "";
		 int row = table.getSelectedRow();
		 if (row >= 0) {
			id = table.getModel().getValueAt(row, 0).toString();
		 }
		 return id;
	 }
	 
	 public String getNameSearch() {
		 String name = textField.getText();
		 return name;
	 }
	 
	 public void setSearchMess(String mess) {
		 lblMessSearch.setText(mess);
	 }
}
