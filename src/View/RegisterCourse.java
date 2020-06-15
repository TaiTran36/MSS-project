package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Object.Classroom;
import Object.TimeTable;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class RegisterCourse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton btnAddRoom;
	private JLabel lblMess;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RegisterCourse frame = new RegisterCourse();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public RegisterCourse() {
		initRegisterCourse();
	}

	
	void initRegisterCourse() {
		setTitle("T\u1EA1o l\u1EDBp h\u1ECDc");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 587, 458);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u1EA0O L\u1EDAP H\u1ECCC C\u1EE6A B\u1EA0N");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(207, 11, 196, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn l\u1EDBp h\u1ECDc ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 72, 72, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(103, 68, 412, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u00E3 l\u1EDBp ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(36, 133, 72, 22);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 129, 412, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("H\u1ECDc k\u1EF3");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(36, 195, 72, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 191, 136, 31);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("N\u0103m h\u1ECDc");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(277, 195, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(370, 191, 145, 31);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("L\u1ECBch h\u1ECDc");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setBounds(36, 233, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Ng\u00E0y h\u1ECDc");
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setBounds(36, 281, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Ng\u00E0y h\u1ECDc");
		lblNewLabel_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_2.setBounds(36, 329, 72, 22);
		contentPane.add(lblNewLabel_1_1_1_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 277, 86, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(103, 325, 86, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(247, 277, 91, 31);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(247, 325, 91, 31);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(432, 278, 86, 31);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(432, 320, 86, 31);
		contentPane.add(textField_9);
		
		btnAddRoom = new JButton("T\u1EA1o l\u1EDBp");
		btnAddRoom.setBackground(new Color(47, 79, 79));
		btnAddRoom.setForeground(Color.WHITE);
		btnAddRoom.setBounds(207, 377, 171, 31);
		contentPane.add(btnAddRoom);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Ca h\u1ECDc");
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setBounds(199, 281, 41, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Ca h\u1ECDc");
		lblNewLabel_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1.setBounds(199, 329, 52, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_3 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
		lblNewLabel_1_1_1_2_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_3.setBounds(348, 329, 74, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1_3_1 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
		lblNewLabel_1_1_1_2_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_3_1.setBounds(348, 281, 74, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_3_1);
		
		lblMess = new JLabel("");
		lblMess.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMess.setForeground(Color.WHITE);
		lblMess.setBounds(127, 43, 361, 14);
		contentPane.add(lblMess);
	}
	
	public Classroom getInfoRoom() {
		String name = textField.getText();
		String semester = textField_2.getText();
		String scholastic = textField_3.getText();
		String code = textField_1.getText();
		
		String day1 = textField_4.getText();
		String time1 = textField_5.getText();
		String room1 = textField_6.getText();
		
		TimeTable timeTable1 = new TimeTable(day1, time1, room1);
		
		String day2 = textField_7.getText();
		String time2 = textField_8.getText();
		String room2 = textField_9.getText();
		
		TimeTable timeTable2 = new TimeTable(day1, time1, room1);
		
		LinkedList <TimeTable> arrtTime = new LinkedList<TimeTable>();
		arrtTime.add(timeTable1);
		arrtTime.add(timeTable2);
		
		Classroom room = new Classroom(name,code, semester, scholastic, arrtTime);
		return room;
		
	}
	
	public void addGetInfoRoomListener(ActionListener listener) {
		btnAddRoom.addActionListener(listener);
	}
	
	public void setMess() {
		lblMess.setText("Mã lớp học đã tồn tại");
	}
}
