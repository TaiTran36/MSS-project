package View;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import Controller.ClassroomsController;
import Controller.JoinCourseController;
import Object.Classroom;
import Object.TimeTable;

public class ClassroomView extends JFrame {

	private JPanel contentPane;
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel_3 = new JLabel("L\u1EDAP H\u1ECCC");
	private final JPanel panel_3 = new JPanel();
	private JButton btnAddClass;
	private ClassroomsController clr;

	/**
	 * Create the frame.
	 */

	public ClassroomView(LinkedList<Classroom> classrooms) {
		initClassroom(classrooms);
	}

	void initClassroom(LinkedList<Classroom> classrooms) {
		setTitle("MSS - Lá»›p há»�c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-5, -5, 1400, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel_2.setBackground(new Color(233, 150, 122));
		panel_2.setBounds(0, 0, 1370, 64);

		contentPane.add(panel_2);
		panel_2.setLayout(null);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(27, 11, 132, 42);

		panel_2.add(lblNewLabel_3);
		panel_3.setBackground(new Color(245, 222, 179));
		panel_3.setForeground(new Color(135, 206, 235));
		panel_3.setBounds(0, 62, 1370, 687);

		contentPane.add(panel_3);
		panel_3.setLayout(null);

		btnAddClass = new JButton("T\u1EA1o l\u1EDBp h\u1ECDc");
		btnAddClass.setBackground(new Color(0, 139, 139));
		btnAddClass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAddClass.setForeground(Color.WHITE);
		btnAddClass.setBounds(1244, 569, 99, 38);
		panel_3.add(btnAddClass);

		// list lá»›p
		int d_box = 132;
		int c = 0;
		for (Classroom cl : classrooms) {

			if (c > 2) {
				int d = d_box - 386 * c;
				int d_title_y = 319;
				int d_content_y = 377;
				setBoxClassroom(panel_3, cl, d, d_title_y, d_content_y);
				d_box += 2 * 386;
			} else {
				int d_title_y = 29;
				int d_content_y = 88;
				setBoxClassroom(panel_3, cl, d_box, d_title_y, d_content_y);
				d_box += 386;
			}
			c++;
		}
	}

	public void setBoxClassroom(JPanel panel_3, Classroom c, int d_box, int d_title_y, int d_content_y) {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(d_box, d_title_y, 283, 60);
		panel_3.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(c.getName());
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 249, 21);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Há»�c kÃ¬ " + c.getSemester() + ", nÄƒm há»�c " + c.getScholastic());
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 35, 216, 14);
		panel.add(lblNewLabel_1);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(70, 130, 180), null));
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(new Color(245, 245, 245));
		panel_4.setBounds(d_box, d_content_y, 283, 192);
		panel_3.add(panel_4);

		JLabel lblNewLabel_7_1 = new JLabel();
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_7_1.setBounds(10, 184, 60, 14);
		panel_4.add(lblNewLabel_7_1);

		JLabel lblNewLabel_10_1 = new JLabel();
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_1.setBounds(94, 184, 60, 14);
		panel_4.add(lblNewLabel_10_1);

		JLabel lblNewLabel_10_3 = new JLabel();
		lblNewLabel_10_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_3.setBounds(196, 184, 46, 14);
		panel_4.add(lblNewLabel_10_3);

		JLabel lblNewLabel_2 = new JLabel("Lá»‹ch há»�c");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 11, 60, 14);
		panel_4.add(lblNewLabel_2);

		JLabel lblNewLabel_17 = new JLabel("Ng\u00E0y");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_17.setBounds(24, 33, 46, 14);
		panel_4.add(lblNewLabel_17);

		JLabel lblNewLabel_4 = new JLabel("Thá»�i gian");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(94, 33, 60, 14);
		panel_4.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_5.setBounds(167, 33, 75, 14);
		panel_4.add(lblNewLabel_5);

		LinkedList<TimeTable> timeTables = c.getTimetables();

		int d = 0;
		for (int i = 0; i < timeTables.size(); i++) {
			JLabel day = new JLabel(timeTables.get(i).getDay());
			day.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			day.setBounds(24, 53 + d, 60, 14);
			panel_4.add(day);

			JLabel time = new JLabel(timeTables.get(i).getTime());
			time.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			time.setBounds(94, 53 + d, 60, 14);
			panel_4.add(time);

			JLabel room = new JLabel(timeTables.get(i).getRoom());
			room.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			room.setBounds(177, 53 + d, 46, 14);
			panel_4.add(room);

			d += 19;
		}

		JLabel lblNewLabel_18 = new JLabel("T\u1ED5ng s\u1ED1 sinh vi\u00EAn");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_18.setBounds(10, 97, 109, 14);
		panel_4.add(lblNewLabel_18);

		JLabel lblNewLabel_6 = new JLabel(c.getQuantity() + " sinh vi\u00EAn");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(119, 97, 84, 14);
		panel_4.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("M\u00E3 l\u1EDBp h\u1ECDc");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 122, 92, 14);
		panel_4.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel(c.getCode());
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(119, 122, 104, 14);
		panel_4.add(lblNewLabel_8);

		JButton btnInside = new JButton("VÃ o lá»›p");
		btnInside.setName(c.getCode());
		btnInside.setBackground(new Color(0, 139, 139));
		btnInside.setBounds(190, 140, 80, 40);
		panel_4.add(btnInside);
		btnInside.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinCourse joinCourseView = new JoinCourse();
				JoinCourseController joincourseController = new JoinCourseController(joinCourseView);
				joincourseController.index();

				System.out.println(btnInside.getName());
				System.out.println(btnInside.getName());
			}
		});

	}
	
	 public void addAddCLassListener(ActionListener listener) {
		  
		 btnAddClass.addActionListener(listener);
	    }
}