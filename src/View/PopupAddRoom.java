package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Object.Classroom;
import Object.TimeTable;

import javax.swing.JTextField;
import javax.swing.JButton;

public class PopupAddRoom extends JFrame {

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
	private JTextField textField_10;
	private JButton btnAddRoom;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PopupAddRoom frame = new PopupAddRoom();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public PopupAddRoom() {
		initAddRoom();
	}
	/**
	 * Create the frame.
	 */
	void initAddRoom() {
		setTitle("MSS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 650);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 128));
        contentPane.setForeground(new Color(0, 0, 128));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(224, 79, 222, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(222, 136, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(362, 136, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(224, 193, 158, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(296, 242, 86, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(422, 242, 86, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBounds(180, 242, 86, 20);
        contentPane.add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setBounds(180, 290, 86, 20);
        contentPane.add(textField_7);
        textField_7.setColumns(10);
        
        textField_8 = new JTextField();
        textField_8.setBounds(296, 290, 86, 20);
        contentPane.add(textField_8);
        textField_8.setColumns(10);
        
        textField_9 = new JTextField();
        textField_9.setBounds(422, 290, 86, 20);
        contentPane.add(textField_9);
        textField_9.setColumns(10);
        
        textField_10 = new JTextField();
        textField_10.setBounds(389, 193, 86, 20);
        contentPane.add(textField_10);
        textField_10.setColumns(10);
        
        btnAddRoom = new JButton("T\u1EA1o l\u1EDBp");
        btnAddRoom.setBounds(559, 516, 150, 23);
        contentPane.add(btnAddRoom);
	}
	
	public Classroom getInfoRoom() {
		String name = textField.getText();
		String semester = textField_1.getText();
		String scholastic = textField_2.getText();
		String code = textField_3.getText();
		int quantity = Integer.parseInt(textField_4.getText());
		
		String day1 = textField_5.getText();
		String time1 = textField_6.getText();
		String room1 = textField_7.getText();
		
		TimeTable timeTable1 = new TimeTable(day1, time1, room1);
		
		String day2 = textField_8.getText();
		String time2 = textField_9.getText();
		String room2 = textField_10.getText();
		
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
}
