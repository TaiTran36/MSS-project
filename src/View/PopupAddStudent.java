package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Object.Classroom;
import Object.Course;
import Object.Student;
import Object.TimeTable;

public class PopupAddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnAddStudent;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	public PopupAddStudent(String code_root) {
		initPopupAddStudent(code_root);
	}
	public void initPopupAddStudent(String code_root) {
		setTitle("T\u1EA1o l\u1EDBp h\u1ECDc");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 770, 458);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TH\u00CAM SINH VI\u00CAN V\u00C0O L\u1EDAP H\u1ECCC");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(270, 11, 268, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn sinh vi\u00EAn");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 58, 89, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(122, 59, 541, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u00E3 sinh vi\u00EAn");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(36, 110, 72, 22);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 106, 541, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(36, 157, 72, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 153, 136, 31);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setBounds(36, 209, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		btnAddStudent = new JButton("Th\u00EAm");
		btnAddStudent.setBackground(new Color(47, 79, 79));
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.setBounds(309, 377, 171, 31);
		contentPane.add(btnAddStudent);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 205, 541, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("S\u1ED1 bu\u1ED5i v\u1EAFng");
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setBounds(36, 262, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 258, 136, 31);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("\u0110i\u1EC3m th\u01B0\u1EDDng xuy\u00EAn");
		lblNewLabel_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1.setBounds(36, 316, 134, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(180, 312, 55, 31);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("\u0110i\u1EC3m gi\u1EEFa k\u00EC");
		lblNewLabel_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(245, 316, 103, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(326, 312, 55, 31);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1_1 = new JLabel("\u0110i\u1EC3m cu\u1ED1i k\u00EC");
		lblNewLabel_1_1_1_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1_1_1.setBounds(391, 316, 103, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(473, 312, 55, 31);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_2 = new JLabel("\u0110i\u1EC3m trung b\u00ECnh");
		lblNewLabel_1_1_1_2_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1_2.setBounds(546, 316, 103, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(659, 312, 55, 31);
		contentPane.add(textField_8);
		
		lblNewLabel_2 = new JLabel("M\u00E3 l\u1EDBp");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(36, 33, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(code_root);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(79, 33, 91, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	public Student getInfoStudent() {
		String name = textField.getText();
		String code = textField_1.getText();
		String dateOfBirth = textField_2.getText();
		String address = textField_3.getText();
		
		String numOfAbsences = textField_4.getText();
		String scoreAttendance = textField_5.getText();
		String scoreMidTerm = textField_6.getText();
		String scoreEndTerm = textField_7.getText();
		String score = textField_8.getText();
		
		Course c = new Course(Double.parseDouble(score), Integer.parseInt(numOfAbsences), Double.parseDouble(scoreAttendance), Double.parseDouble(scoreMidTerm), Double.parseDouble(scoreEndTerm));
		LinkedList<Course> cou = new LinkedList<Course>();
		cou.add(c);
		String code_root = lblNewLabel_3.getText();
		
		Student st = new Student(name,code, dateOfBirth, address, cou);
		return st;
		
	}
	
	public void addGetInfoStudent(ActionListener listener) {
		btnAddStudent.addActionListener(listener);
	 }
}
