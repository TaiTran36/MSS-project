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
	private JTable table;
	private JButton btnAddStu;
	

//	private Vector<String> vctHeader = new Vector<String>();
//	private Vector<Vector<String>> vctData = new Vector<Vector<String>>();
	
	private String [] columnNames = new String [] {
            "MSV", "Họ và tên", "Ngày sinh", "Địa chỉ", "Số buổi vắng", "ĐIểm thường xuyên", "Điểm giữa kì", "Điểm cuối kì", "Điểm trung bình"};
	
	private Object data = new Object [][] {
		
	};
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public CourseView(LinkedList<Student> student) {
		initCourseView(student);
	}
	
	public void initCourseView(LinkedList<Student>student) {
		setTitle("Chia s\u1EBB t\u00E0i li\u1EC7u");
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

		JLabel lblNewLabel = new JLabel("NGUY\u1EC4N TH\u1ECA H\u1ED2NG MINH");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 190, 206, 30);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 194, 168);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(ListStudents.class.getResource("/res/avt.png")));

		JButton btnNewButton = new JButton("Danh s\u00E1ch sinh vi\u00EAn");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setBounds(0, 309, 226, 47);
		panel.add(btnNewButton);

		JButton btnimDanh = new JButton("\u0110i\u1EC3m danh");
		btnimDanh.setForeground(Color.WHITE);
		btnimDanh.setFont(new Font("Arial", Font.PLAIN, 13));
		btnimDanh.setBackground(new Color(0, 139, 139));
		btnimDanh.setBounds(0, 358, 226, 47);
		panel.add(btnimDanh);

		JButton btnChiaSTi = new JButton("Chia s\u1EBB t\u00E0i li\u1EC7u");
		btnChiaSTi.setForeground(Color.WHITE);
		btnChiaSTi.setFont(new Font("Arial", Font.PLAIN, 13));
		btnChiaSTi.setBackground(new Color(0, 139, 139));
		btnChiaSTi.setBounds(0, 406, 226, 47);
		panel.add(btnChiaSTi);
		
		JButton btnNewButton_1_1 = new JButton("Upload File");
		btnNewButton_1_1.setBounds(25, 450, 153, 42);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1_1.setForeground(Color.WHITE);
		
		JButton btnNewButton_1 = new JButton("T\u1EA3i l\u00EAn");
		btnNewButton_1.setBounds(25, 494, 153, 42);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.WHITE);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(224, 0, 1156, 56);
		panel_3.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 128, 1086, 502);
		contentPane.add(scrollPane);

		
		table = new JTable();
		Object [][] students = new Object[student.size()][9];
		for (int i = 0; i < student.size(); i++) {
			students[i][0] = student.get(i).getCode();
			students[i][1] = student.get(i).getName();
			students[i][2] = student.get(i).getDateOfBirth();
			students[i][3] = student.get(i).getAddress();
			students[i][4] = student.get(i).getRoom().get(0).getNumOfAbsences();
			students[i][5] = student.get(i).getRoom().get(0).getScoreAttendance();
			students[i][6] = student.get(i).getRoom().get(0).getScoreMidTerm();
			students[i][7] = student.get(i).getRoom().get(0).getScoreEndTerm();
			students[i][8] = student.get(i).getRoom().get(0).getScore();
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
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách sinh viên lớp");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(367, 78, 865, 39);
		contentPane.add(lblNewLabel_2);
		
		btnAddStu = new JButton("Thêm sinh viên");
		btnAddStu.setBackground(new Color(0, 128, 128));
		btnAddStu.setForeground(Color.WHITE);
		btnAddStu.setBounds(1180, 644, 138, 41);
		contentPane.add(btnAddStu);
		
		
	}
	
	 public void addEditStudentListener(ListSelectionListener listener) {
		  
		 table.getSelectionModel().addListSelectionListener(listener);
	 }
	 
	 public void addAddStudentListener(ActionListener listener) {
		 btnAddStu.addActionListener(listener);
		
	 }
	 
	 
}
