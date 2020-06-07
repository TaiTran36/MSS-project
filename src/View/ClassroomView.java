package View;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;

import Object.Classroom;
import Object.TimeTable;

public class ClassroomView extends JFrame {

    private JPanel contentPane;
    private final JPanel panel_2 = new JPanel();
    private final JLabel lblNewLabel_3 = new JLabel("L\u1EDAP H\u1ECCC");
    private final JPanel panel_3 = new JPanel();

     static LinkedList<Classroom> v = new LinkedList<Classroom>();
     static LinkedList<Classroom> a;


	/**
	 * Create the frame.
	 */

	public ClassroomView(LinkedList<Classroom> classrooms){
	    initClassroom(classrooms);
    }

	 void initClassroom(LinkedList<Classroom> classrooms) {
        setTitle("MSS - Lớp học");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 650);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        panel_2.setBackground(new Color(233, 150, 122));
        panel_2.setBounds(0, 0, 984, 64);

        contentPane.add(panel_2);
        panel_2.setLayout(null);
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
        lblNewLabel_3.setBounds(27, 11, 132, 42);

        panel_2.add(lblNewLabel_3);
        panel_3.setBackground(new Color(245, 222, 179));
        panel_3.setForeground(new Color(135, 206, 235));
        panel_3.setBounds(0, 62, 984, 549);

        contentPane.add(panel_3);
        panel_3.setLayout(null);

        setBoxClassroom(panel_3, classrooms);

        JButton btnNewButton = new JButton("T\u1EA1o l\u1EDBp h\u1ECDc");
        btnNewButton.setBackground(new Color(0, 139, 139));
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(875, 500, 99, 38);
        panel_3.add(btnNewButton);

        //panel1
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(70, 130, 180));
        panel_1.setBounds(357, 42, 253, 60);
        panel_3.add(panel_1);

        JLabel lblNewLabel_9 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
        lblNewLabel_9.setForeground(Color.WHITE);
        lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
        lblNewLabel_9.setBounds(10, 11, 233, 21);
        panel_1.add(lblNewLabel_9);

        JLabel lblNewLabel_1_1 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_1_1.setBounds(20, 35, 216, 14);
        panel_1.add(lblNewLabel_1_1);

        JPanel panel_4_1 = new JPanel();
        panel_4_1.setLayout(null);
        panel_4_1.setForeground(Color.WHITE);
        panel_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(70, 130, 180), null));
        panel_4_1.setBackground(new Color(245, 245, 245));
        panel_4_1.setBounds(357, 100, 253, 161);
        panel_3.add(panel_4_1);

        JLabel lblNewLabel_7_1_1 = new JLabel("Th\u1EE9 n\u0103m");
        lblNewLabel_7_1_1.setForeground(Color.WHITE);
        lblNewLabel_7_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_7_1_1.setBounds(10, 184, 60, 14);
        panel_4_1.add(lblNewLabel_7_1_1);

        JLabel lblNewLabel_10_1_1 = new JLabel("13h - 15h");
        lblNewLabel_10_1_1.setForeground(Color.WHITE);
        lblNewLabel_10_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_10_1_1.setBounds(94, 184, 60, 14);
        panel_4_1.add(lblNewLabel_10_1_1);

        JLabel lblNewLabel_10_3_1 = new JLabel("405T5");
        lblNewLabel_10_3_1.setForeground(Color.WHITE);
        lblNewLabel_10_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_10_3_1.setBounds(196, 184, 46, 14);
        panel_4_1.add(lblNewLabel_10_3_1);

        JLabel lblNewLabel_2_1 = new JLabel("L\u1ECBch h\u1ECDc");
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_2_1.setBounds(10, 11, 60, 14);
        panel_4_1.add(lblNewLabel_2_1);

        JLabel lblNewLabel_4_1 = new JLabel("Th\u1EDDi gian");
        lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_4_1.setBounds(94, 33, 60, 14);
        panel_4_1.add(lblNewLabel_4_1);

        JLabel lblNewLabel_5_1 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
        lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_5_1.setBounds(167, 33, 75, 14);
        panel_4_1.add(lblNewLabel_5_1);

        JLabel lblNewLabel_11_1 = new JLabel("Th\u1EE9 ba");
        lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_11_1.setBounds(24, 47, 60, 26);
        panel_4_1.add(lblNewLabel_11_1);

        JLabel lblNewLabel_12_1 = new JLabel("8h - 10h");
        lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_12_1.setBounds(94, 53, 60, 14);
        panel_4_1.add(lblNewLabel_12_1);

        JLabel lblNewLabel_13_1 = new JLabel("102T5");
        lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_13_1.setBounds(177, 53, 46, 14);
        panel_4_1.add(lblNewLabel_13_1);

        JLabel lblNewLabel_14_1 = new JLabel("Th\u1EE9 n\u0103m");
        lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_14_1.setBounds(24, 72, 60, 14);
        panel_4_1.add(lblNewLabel_14_1);

        JLabel lblNewLabel_15_1 = new JLabel("13h - 15h");
        lblNewLabel_15_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_15_1.setBounds(94, 72, 60, 14);
        panel_4_1.add(lblNewLabel_15_1);

        JLabel lblNewLabel_16_1 = new JLabel("405T5");
        lblNewLabel_16_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_16_1.setBounds(177, 72, 46, 14);
        panel_4_1.add(lblNewLabel_16_1);

        JLabel lblNewLabel_17_1 = new JLabel("Ng\u00E0y");
        lblNewLabel_17_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_17_1.setBounds(24, 33, 46, 14);
        panel_4_1.add(lblNewLabel_17_1);

        JLabel lblNewLabel_18_1 = new JLabel("T\u1ED5ng s\u1ED1 sinh vi\u00EAn");
        lblNewLabel_18_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_18_1.setBounds(10, 97, 92, 14);
        panel_4_1.add(lblNewLabel_18_1);

        JLabel lblNewLabel_6_1 = new JLabel("40 sinh vi\u00EAn");
        lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_6_1.setBounds(119, 97, 84, 14);
        panel_4_1.add(lblNewLabel_6_1);

        JLabel lblNewLabel_7_2 = new JLabel("M\u00E3 l\u1EDBp h\u1ECDc");
        lblNewLabel_7_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_7_2.setBounds(10, 122, 92, 14);
        panel_4_1.add(lblNewLabel_7_2);

        JLabel lblNewLabel_8_1 = new JLabel("acnjkvgf");
        lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_8_1.setBounds(119, 122, 104, 14);
        panel_4_1.add(lblNewLabel_8_1);


        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(new Color(70, 130, 180));
        panel_1_1.setBounds(672, 42, 253, 60);
        panel_3.add(panel_1_1);

        JLabel lblNewLabel_9_1 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
        lblNewLabel_9_1.setForeground(Color.WHITE);
        lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
        lblNewLabel_9_1.setBounds(10, 11, 233, 21);
        panel_1_1.add(lblNewLabel_9_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
        lblNewLabel_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_1_1_1.setBounds(20, 35, 216, 14);
        panel_1_1.add(lblNewLabel_1_1_1);



        JPanel panel_4_1_1 = new JPanel();
        panel_4_1_1.setLayout(null);
        panel_4_1_1.setForeground(Color.WHITE);
        panel_4_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(70, 130, 180), null));
        panel_4_1_1.setBackground(new Color(245, 245, 245));
        panel_4_1_1.setBounds(672, 100, 253, 161);
        panel_3.add(panel_4_1_1);

        JLabel lblNewLabel_7_1_1_1 = new JLabel("Th\u1EE9 n\u0103m");
        lblNewLabel_7_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_7_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_7_1_1_1.setBounds(10, 184, 60, 14);
        panel_4_1_1.add(lblNewLabel_7_1_1_1);

        JLabel lblNewLabel_10_1_1_1 = new JLabel("13h - 15h");
        lblNewLabel_10_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_10_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_10_1_1_1.setBounds(94, 184, 60, 14);
        panel_4_1_1.add(lblNewLabel_10_1_1_1);

        JLabel lblNewLabel_10_3_1_1 = new JLabel("405T5");
        lblNewLabel_10_3_1_1.setForeground(Color.WHITE);
        lblNewLabel_10_3_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNewLabel_10_3_1_1.setBounds(196, 184, 46, 14);
        panel_4_1_1.add(lblNewLabel_10_3_1_1);

        JLabel lblNewLabel_2_1_1 = new JLabel("L\u1ECBch h\u1ECDc");
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_2_1_1.setBounds(10, 11, 60, 14);
        panel_4_1_1.add(lblNewLabel_2_1_1);

        JLabel lblNewLabel_4_1_1 = new JLabel("Th\u1EDDi gian");
        lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_4_1_1.setBounds(94, 33, 60, 14);
        panel_4_1_1.add(lblNewLabel_4_1_1);

        JLabel lblNewLabel_5_1_1 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
        lblNewLabel_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_5_1_1.setBounds(167, 33, 75, 14);
        panel_4_1_1.add(lblNewLabel_5_1_1);

        JLabel lblNewLabel_11_1_1 = new JLabel("Th\u1EE9 ba");
        lblNewLabel_11_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_11_1_1.setBounds(24, 47, 60, 26);
        panel_4_1_1.add(lblNewLabel_11_1_1);

        JLabel lblNewLabel_12_1_1 = new JLabel("8h - 10h");
        lblNewLabel_12_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_12_1_1.setBounds(94, 53, 60, 14);
        panel_4_1_1.add(lblNewLabel_12_1_1);

        JLabel lblNewLabel_13_1_1 = new JLabel("102T5");
        lblNewLabel_13_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_13_1_1.setBounds(177, 53, 46, 14);
        panel_4_1_1.add(lblNewLabel_13_1_1);

        JLabel lblNewLabel_14_1_1 = new JLabel("Th\u1EE9 n\u0103m");
        lblNewLabel_14_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_14_1_1.setBounds(24, 72, 60, 14);
        panel_4_1_1.add(lblNewLabel_14_1_1);

        JLabel lblNewLabel_15_1_1 = new JLabel("13h - 15h");
        lblNewLabel_15_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_15_1_1.setBounds(94, 72, 60, 14);
        panel_4_1_1.add(lblNewLabel_15_1_1);

        JLabel lblNewLabel_16_1_1 = new JLabel("405T5");
        lblNewLabel_16_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_16_1_1.setBounds(177, 72, 46, 14);
        panel_4_1_1.add(lblNewLabel_16_1_1);

        JLabel lblNewLabel_17_1_1 = new JLabel("Ng\u00E0y");
        lblNewLabel_17_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_17_1_1.setBounds(24, 33, 46, 14);
        panel_4_1_1.add(lblNewLabel_17_1_1);

        JLabel lblNewLabel_18_1_1 = new JLabel("T\u1ED5ng s\u1ED1 sinh vi\u00EAn");
        lblNewLabel_18_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_18_1_1.setBounds(10, 97, 92, 14);
        panel_4_1_1.add(lblNewLabel_18_1_1);

        JLabel lblNewLabel_6_1_1 = new JLabel("40 sinh vi\u00EAn");
        lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_6_1_1.setBounds(119, 97, 84, 14);
        panel_4_1_1.add(lblNewLabel_6_1_1);

        JLabel lblNewLabel_7_2_1 = new JLabel("M\u00E3 l\u1EDBp h\u1ECDc");
        lblNewLabel_7_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_7_2_1.setBounds(10, 122, 92, 14);
        panel_4_1_1.add(lblNewLabel_7_2_1);

        JLabel lblNewLabel_8_1_1 = new JLabel("acnjkvgf");
        lblNewLabel_8_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_8_1_1.setBounds(119, 122, 104, 14);
        panel_4_1_1.add(lblNewLabel_8_1_1);
	}


	public static void setBoxClassroom(JPanel panel_3, LinkedList<Classroom> classrooms){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(70, 130, 180));
        panel.setBounds(42, 42, 253, 60);
        panel_3.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel(classrooms.get(0).getName());
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(10, 11, 233, 21);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Học kì "+ classrooms.get(0).getSemester()+", năm học "+ classrooms.get(0).getScholastic());
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(20, 35, 216, 14);
        panel.add(lblNewLabel_1);

        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(70, 130, 180), null));
        panel_4.setForeground(new Color(255, 255, 255));
        panel_4.setBackground(new Color(245, 245, 245));
        panel_4.setBounds(42, 100, 253, 161);
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

        JLabel lblNewLabel_2 = new JLabel("Lịch học");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_2.setBounds(10, 11, 60, 14);
        panel_4.add(lblNewLabel_2);

        JLabel lblNewLabel_17 = new JLabel("Ng\u00E0y");
        lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_17.setBounds(24, 33, 46, 14);
        panel_4.add(lblNewLabel_17);

        JLabel lblNewLabel_4 = new JLabel("Thời gian");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_4.setBounds(94, 33, 60, 14);
        panel_4.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Gi\u1EA3ng \u0111\u01B0\u1EDDng");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_5.setBounds(167, 33, 75, 14);
        panel_4.add(lblNewLabel_5);

        LinkedList<TimeTable> timeTables = classrooms.get(1).getTimetables();

        int d = 0;
        for (int i =0; i<timeTables.size();i++){
            JLabel day = new JLabel(timeTables.get(i).getDay());
            day.setFont(new Font("Times New Roman", Font.PLAIN, 11));
            day.setBounds(24, 53+d, 60, 14);
            panel_4.add(day);

            JLabel time = new JLabel(timeTables.get(i).getTime());
            time.setFont(new Font("Times New Roman", Font.PLAIN, 11));
            time.setBounds(94, 53+d, 60, 14);
            panel_4.add(time);

            JLabel room = new JLabel(timeTables.get(i).getRoom());
            room.setFont(new Font("Times New Roman", Font.PLAIN, 11));
            room.setBounds(177, 53+d, 46, 14);
            panel_4.add(room);

            d+=19;
        }

        JLabel lblNewLabel_18 = new JLabel("T\u1ED5ng s\u1ED1 sinh vi\u00EAn");
        lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_18.setBounds(10, 97, 92, 14);
        panel_4.add(lblNewLabel_18);

        JLabel lblNewLabel_6 = new JLabel("40 sinh vi\u00EAn");
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_6.setBounds(119, 97, 84, 14);
        panel_4.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("M\u00E3 l\u1EDBp h\u1ECDc");
        lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_7.setBounds(10, 122, 92, 14);
        panel_4.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("acnjkvgf");
        lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblNewLabel_8.setBounds(119, 122, 104, 14);
        panel_4.add(lblNewLabel_8);



    }

}
