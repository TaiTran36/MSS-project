package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Object.Student;

public class PopupActionStudent extends JFrame {

	private JPanel contentPane;
	private JButton btnEditStudent;
	private String cr;
	private JButton btnDeleteStudent;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PopupActionStudent(Student stu, String code_root) {
		initPopupActionStudent(stu);
		cr = code_root;
	}
	
	public void initPopupActionStudent(Student stu) {
		setTitle("Action");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 770, 191);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEditStudent = new JButton("S\u1EEDa th\u00F4ng tin");
		btnEditStudent.setBackground(new Color(47, 79, 79));
		btnEditStudent.setForeground(Color.WHITE);
		btnEditStudent.setBounds(109, 58, 171, 41);
		contentPane.add(btnEditStudent);
		
		
		
		btnDeleteStudent = new JButton("Xo\u00E1 ");
		btnDeleteStudent.setForeground(Color.WHITE);
		btnDeleteStudent.setBackground(new Color(47, 79, 79));
		btnDeleteStudent.setBounds(467, 58, 171, 41);
		contentPane.add(btnDeleteStudent);
		
		JLabel lblNewLabel = new JLabel("B\u1EA1n mu\u1ED1n th\u1EF1c hi\u1EC7n...");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(295, 11, 193, 36);
		contentPane.add(lblNewLabel);
		
	}
	
	public void addEditStudentListener(ActionListener listener) {
		btnEditStudent.addActionListener(listener);
	}
	
	public void addDeleteStudentListener(ActionListener listener) {
		btnDeleteStudent.addActionListener(listener);
	}
}
