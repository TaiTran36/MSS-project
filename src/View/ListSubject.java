package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class ListSubject extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JPanel panel_subject_1 = new JPanel();
	private final JPanel panel_subject_2 = new JPanel();
	private final JPanel panel_subject_3 = new JPanel();
	private final JPanel panel_subject_4 = new JPanel();
	private final JPanel panel_subject_5 = new JPanel();
	private final JPanel panel_subject_3_1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("\u0110\u00E3 \u0111\u0103ng k\u00FD");
	private final JLabel lblNewLabel_1 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_1_1 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_1_2 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_1_3 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_1_4 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_1_5 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_2 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_2_1 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_2_2 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_2_3 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_2_4 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_2_5 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel_3 = new JLabel("L\u1EDAP H\u1ECCC");
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JLabel lblNewLabel_4 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3 = new JLabel("405T5");
	private final JPanel panel_4_1 = new JPanel();
	private final JLabel lblNewLabel_4_1 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5_1 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6_1 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7_2 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1_1 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8_1 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9_1 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10_4 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1_1 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2_1 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3_1 = new JLabel("405T5");
	private final JPanel panel_4_2 = new JPanel();
	private final JLabel lblNewLabel_4_2 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5_2 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6_2 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7_3 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1_2 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8_2 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9_2 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10_5 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1_2 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2_2 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3_2 = new JLabel("405T5");
	private final JPanel panel_4_3 = new JPanel();
	private final JLabel lblNewLabel_4_3 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5_3 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6_3 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7_4 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1_3 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8_3 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9_3 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10_6 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1_3 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2_3 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3_3 = new JLabel("405T5");
	private final JPanel panel_4_4 = new JPanel();
	private final JLabel lblNewLabel_4_4 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5_4 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6_4 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7_5 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1_4 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8_4 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9_4 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10_7 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1_4 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2_4 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3_4 = new JLabel("405T5");
	private final JPanel panel_4_4_1 = new JPanel();
	private final JLabel lblNewLabel_4_4_1 = new JLabel("C\u1EA4U TR\u00DAC D\u1EEE LI\u1EC6U V\u00C0 THU\u1EACT TO\u00C1N");
	private final JLabel lblNewLabel_5_4_1 = new JLabel("H\u1ECDc k\u1EF3 2, n\u0103m h\u1ECDc 2019-2020");
	private final JLabel lblNewLabel_6_4_1 = new JLabel("L\u1ECBch h\u1ECDc");
	private final JLabel lblNewLabel_7_5_1 = new JLabel("Th\u1EE9 ba");
	private final JLabel lblNewLabel_7_1_4_1 = new JLabel("Th\u1EE9 n\u0103m");
	private final JLabel lblNewLabel_8_4_1 = new JLabel("Th\u1EDDi gian");
	private final JLabel lblNewLabel_9_4_1 = new JLabel("Ph\u00F2ng");
	private final JLabel lblNewLabel_10_7_1 = new JLabel("8h - 10h");
	private final JLabel lblNewLabel_10_1_4_1 = new JLabel("13h - 15h");
	private final JLabel lblNewLabel_10_2_4_1 = new JLabel("102T5");
	private final JLabel lblNewLabel_10_3_4_1 = new JLabel("405T5");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListSubject frame = new ListSubject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListSubject() {
		setTitle("Danh s\u00E1ch m\u00F4n h\u1ECDc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 233, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		panel_subject_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_1.setBackground(new Color(0, 128, 128));
		panel_subject_1.setForeground(new Color(0, 0, 0));
		panel_subject_1.setBounds(0, 491, 246, 73);
		
		panel.add(panel_subject_1);
		panel_subject_1.setLayout(null);
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 11, 226, 27);
		
		panel_subject_1.add(lblNewLabel_1_4);
		lblNewLabel_2_4.setBounds(10, 40, 200, 22);
		
		panel_subject_1.add(lblNewLabel_2_4);
		panel_subject_2.setForeground(Color.BLACK);
		panel_subject_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_2.setBackground(new Color(0, 128, 128));
		panel_subject_2.setBounds(0, 420, 246, 73);
		
		panel.add(panel_subject_2);
		panel_subject_2.setLayout(null);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 11, 226, 27);
		
		panel_subject_2.add(lblNewLabel_1_3);
		lblNewLabel_2_3.setBounds(10, 40, 200, 22);
		
		panel_subject_2.add(lblNewLabel_2_3);
		panel_subject_3.setForeground(Color.BLACK);
		panel_subject_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_3.setBackground(new Color(0, 128, 128));
		panel_subject_3.setBounds(0, 347, 246, 73);
		
		panel.add(panel_subject_3);
		panel_subject_3.setLayout(null);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 11, 226, 27);
		
		panel_subject_3.add(lblNewLabel_1_2);
		lblNewLabel_2_2.setBounds(10, 40, 202, 22);
		
		panel_subject_3.add(lblNewLabel_2_2);
		panel_subject_4.setForeground(Color.BLACK);
		panel_subject_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_4.setBackground(new Color(0, 128, 128));
		panel_subject_4.setBounds(0, 276, 246, 73);
		
		panel.add(panel_subject_4);
		panel_subject_4.setLayout(null);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 11, 226, 27);
		
		panel_subject_4.add(lblNewLabel_1_1);
		lblNewLabel_2_1.setBounds(10, 40, 203, 22);
		
		panel_subject_4.add(lblNewLabel_2_1);
		panel_subject_5.setForeground(Color.BLACK);
		panel_subject_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_5.setBackground(new Color(0, 128, 128));
		panel_subject_5.setBounds(0, 206, 246, 73);
		
		panel.add(panel_subject_5);
		panel_subject_5.setLayout(null);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 226, 27);
		
		panel_subject_5.add(lblNewLabel_1);
		lblNewLabel_2.setBounds(10, 40, 202, 22);
		
		panel_subject_5.add(lblNewLabel_2);
		panel_subject_3_1.setForeground(Color.BLACK);
		panel_subject_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_subject_3_1.setBackground(new Color(0, 128, 128));
		panel_subject_3_1.setBounds(0, 563, 246, 73);
		
		panel.add(panel_subject_3_1);
		panel_subject_3_1.setLayout(null);
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(10, 11, 226, 27);
		
		panel_subject_3_1.add(lblNewLabel_1_5);
		lblNewLabel_2_5.setBounds(10, 40, 202, 22);
		
		panel_subject_3_1.add(lblNewLabel_2_5);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 158, 141, 23);
		
		panel.add(lblNewLabel);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(0, 0, 246, 147);
		
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblogo = new JLabel("MSS");
		lblogo.setBounds(10, 29, 219, 91);
		panel_1.add(lblogo);
		lblogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblogo.setForeground(Color.WHITE);
		lblogo.setFont(new Font("Footlight MT Light", Font.BOLD, 60));
		panel_2.setBackground(new Color(233, 150, 122));
		panel_2.setBounds(232, 0, 1077, 64);
		
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(20, 11, 110, 28);
		
		panel_2.add(lblNewLabel_3);
		panel_3.setBackground(new Color(245, 222, 179));
		panel_3.setForeground(new Color(135, 206, 235));
		panel_3.setBounds(232, 62, 1077, 687);
		
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(new Color(0, 128, 128));
		panel_4.setBounds(61, 42, 264, 231);
		
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 11, 244, 37);
		
		panel_4.add(lblNewLabel_4);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 55, 226, 22);
		
		panel_4.add(lblNewLabel_5);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 112, 60, 14);
		
		panel_4.add(lblNewLabel_6);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(10, 148, 60, 14);
		
		panel_4.add(lblNewLabel_7);
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_7_1.setBounds(10, 184, 60, 14);
		
		panel_4.add(lblNewLabel_7_1);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(94, 112, 71, 14);
		
		panel_4.add(lblNewLabel_8);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(196, 112, 58, 14);
		
		panel_4.add(lblNewLabel_9);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(94, 148, 60, 14);
		
		panel_4.add(lblNewLabel_10);
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_1.setBounds(94, 184, 60, 14);
		
		panel_4.add(lblNewLabel_10_1);
		lblNewLabel_10_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_2.setBounds(196, 148, 46, 14);
		
		panel_4.add(lblNewLabel_10_2);
		lblNewLabel_10_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_3.setBounds(196, 184, 46, 14);
		
		panel_4.add(lblNewLabel_10_3);
		panel_5.setBounds(61, 42, 264, 88);
		
		panel_3.add(panel_5);
		panel_4_1.setLayout(null);
		panel_4_1.setForeground(Color.WHITE);
		panel_4_1.setBackground(new Color(0, 128, 128));
		panel_4_1.setBounds(421, 42, 264, 231);
		
		panel_3.add(panel_4_1);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(10, 11, 244, 37);
		
		panel_4_1.add(lblNewLabel_4_1);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 55, 226, 22);
		
		panel_4_1.add(lblNewLabel_5_1);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6_1.setBounds(10, 112, 60, 14);
		
		panel_4_1.add(lblNewLabel_6_1);
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_2.setBounds(10, 148, 60, 14);
		
		panel_4_1.add(lblNewLabel_7_2);
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1_1.setBounds(10, 184, 60, 14);
		
		panel_4_1.add(lblNewLabel_7_1_1);
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8_1.setBounds(94, 112, 71, 14);
		
		panel_4_1.add(lblNewLabel_8_1);
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9_1.setBounds(196, 112, 58, 14);
		
		panel_4_1.add(lblNewLabel_9_1);
		lblNewLabel_10_4.setForeground(Color.WHITE);
		lblNewLabel_10_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_4.setBounds(94, 148, 60, 14);
		
		panel_4_1.add(lblNewLabel_10_4);
		lblNewLabel_10_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1_1.setBounds(94, 184, 60, 14);
		
		panel_4_1.add(lblNewLabel_10_1_1);
		lblNewLabel_10_2_1.setForeground(Color.WHITE);
		lblNewLabel_10_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2_1.setBounds(196, 148, 46, 14);
		
		panel_4_1.add(lblNewLabel_10_2_1);
		lblNewLabel_10_3_1.setForeground(Color.WHITE);
		lblNewLabel_10_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3_1.setBounds(196, 184, 46, 14);
		
		panel_4_1.add(lblNewLabel_10_3_1);
		panel_4_2.setLayout(null);
		panel_4_2.setForeground(Color.WHITE);
		panel_4_2.setBackground(new Color(0, 128, 128));
		panel_4_2.setBounds(775, 42, 264, 231);
		
		panel_3.add(panel_4_2);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4_2.setBounds(10, 11, 244, 37);
		
		panel_4_2.add(lblNewLabel_4_2);
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 55, 226, 22);
		
		panel_4_2.add(lblNewLabel_5_2);
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6_2.setBounds(10, 112, 60, 14);
		
		panel_4_2.add(lblNewLabel_6_2);
		lblNewLabel_7_3.setForeground(Color.WHITE);
		lblNewLabel_7_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_3.setBounds(10, 148, 60, 14);
		
		panel_4_2.add(lblNewLabel_7_3);
		lblNewLabel_7_1_2.setForeground(Color.WHITE);
		lblNewLabel_7_1_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1_2.setBounds(10, 184, 60, 14);
		
		panel_4_2.add(lblNewLabel_7_1_2);
		lblNewLabel_8_2.setForeground(Color.WHITE);
		lblNewLabel_8_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8_2.setBounds(94, 112, 71, 14);
		
		panel_4_2.add(lblNewLabel_8_2);
		lblNewLabel_9_2.setForeground(Color.WHITE);
		lblNewLabel_9_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9_2.setBounds(196, 112, 58, 14);
		
		panel_4_2.add(lblNewLabel_9_2);
		lblNewLabel_10_5.setForeground(Color.WHITE);
		lblNewLabel_10_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_5.setBounds(94, 148, 60, 14);
		
		panel_4_2.add(lblNewLabel_10_5);
		lblNewLabel_10_1_2.setForeground(Color.WHITE);
		lblNewLabel_10_1_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1_2.setBounds(94, 184, 60, 14);
		
		panel_4_2.add(lblNewLabel_10_1_2);
		lblNewLabel_10_2_2.setForeground(Color.WHITE);
		lblNewLabel_10_2_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2_2.setBounds(196, 148, 46, 14);
		
		panel_4_2.add(lblNewLabel_10_2_2);
		lblNewLabel_10_3_2.setForeground(Color.WHITE);
		lblNewLabel_10_3_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3_2.setBounds(196, 184, 46, 14);
		
		panel_4_2.add(lblNewLabel_10_3_2);
		panel_4_3.setLayout(null);
		panel_4_3.setForeground(Color.WHITE);
		panel_4_3.setBackground(new Color(0, 128, 128));
		panel_4_3.setBounds(61, 357, 264, 231);
		
		panel_3.add(panel_4_3);
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4_3.setBounds(10, 11, 244, 37);
		
		panel_4_3.add(lblNewLabel_4_3);
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(10, 55, 226, 22);
		
		panel_4_3.add(lblNewLabel_5_3);
		lblNewLabel_6_3.setForeground(Color.WHITE);
		lblNewLabel_6_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6_3.setBounds(10, 112, 60, 14);
		
		panel_4_3.add(lblNewLabel_6_3);
		lblNewLabel_7_4.setForeground(Color.WHITE);
		lblNewLabel_7_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_4.setBounds(10, 148, 60, 14);
		
		panel_4_3.add(lblNewLabel_7_4);
		lblNewLabel_7_1_3.setForeground(Color.WHITE);
		lblNewLabel_7_1_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1_3.setBounds(10, 184, 60, 14);
		
		panel_4_3.add(lblNewLabel_7_1_3);
		lblNewLabel_8_3.setForeground(Color.WHITE);
		lblNewLabel_8_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8_3.setBounds(94, 112, 71, 14);
		
		panel_4_3.add(lblNewLabel_8_3);
		lblNewLabel_9_3.setForeground(Color.WHITE);
		lblNewLabel_9_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9_3.setBounds(196, 112, 58, 14);
		
		panel_4_3.add(lblNewLabel_9_3);
		lblNewLabel_10_6.setForeground(Color.WHITE);
		lblNewLabel_10_6.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_6.setBounds(94, 148, 60, 14);
		
		panel_4_3.add(lblNewLabel_10_6);
		lblNewLabel_10_1_3.setForeground(Color.WHITE);
		lblNewLabel_10_1_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1_3.setBounds(94, 184, 60, 14);
		
		panel_4_3.add(lblNewLabel_10_1_3);
		lblNewLabel_10_2_3.setForeground(Color.WHITE);
		lblNewLabel_10_2_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2_3.setBounds(196, 148, 46, 14);
		
		panel_4_3.add(lblNewLabel_10_2_3);
		lblNewLabel_10_3_3.setForeground(Color.WHITE);
		lblNewLabel_10_3_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3_3.setBounds(196, 184, 46, 14);
		
		panel_4_3.add(lblNewLabel_10_3_3);
		panel_4_4.setLayout(null);
		panel_4_4.setForeground(Color.WHITE);
		panel_4_4.setBackground(new Color(0, 128, 128));
		panel_4_4.setBounds(421, 357, 264, 231);
		
		panel_3.add(panel_4_4);
		lblNewLabel_4_4.setForeground(Color.WHITE);
		lblNewLabel_4_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4_4.setBounds(10, 11, 244, 37);
		
		panel_4_4.add(lblNewLabel_4_4);
		lblNewLabel_5_4.setForeground(Color.WHITE);
		lblNewLabel_5_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_4.setBounds(10, 55, 226, 22);
		
		panel_4_4.add(lblNewLabel_5_4);
		lblNewLabel_6_4.setForeground(Color.WHITE);
		lblNewLabel_6_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6_4.setBounds(10, 112, 60, 14);
		
		panel_4_4.add(lblNewLabel_6_4);
		lblNewLabel_7_5.setForeground(Color.WHITE);
		lblNewLabel_7_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_5.setBounds(10, 148, 60, 14);
		
		panel_4_4.add(lblNewLabel_7_5);
		lblNewLabel_7_1_4.setForeground(Color.WHITE);
		lblNewLabel_7_1_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1_4.setBounds(10, 184, 60, 14);
		
		panel_4_4.add(lblNewLabel_7_1_4);
		lblNewLabel_8_4.setForeground(Color.WHITE);
		lblNewLabel_8_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8_4.setBounds(94, 112, 71, 14);
		
		panel_4_4.add(lblNewLabel_8_4);
		lblNewLabel_9_4.setForeground(Color.WHITE);
		lblNewLabel_9_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9_4.setBounds(196, 112, 58, 14);
		
		panel_4_4.add(lblNewLabel_9_4);
		lblNewLabel_10_7.setForeground(Color.WHITE);
		lblNewLabel_10_7.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_7.setBounds(94, 148, 60, 14);
		
		panel_4_4.add(lblNewLabel_10_7);
		lblNewLabel_10_1_4.setForeground(Color.WHITE);
		lblNewLabel_10_1_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1_4.setBounds(94, 184, 60, 14);
		
		panel_4_4.add(lblNewLabel_10_1_4);
		lblNewLabel_10_2_4.setForeground(Color.WHITE);
		lblNewLabel_10_2_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2_4.setBounds(196, 148, 46, 14);
		
		panel_4_4.add(lblNewLabel_10_2_4);
		lblNewLabel_10_3_4.setForeground(Color.WHITE);
		lblNewLabel_10_3_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3_4.setBounds(196, 184, 46, 14);
		
		panel_4_4.add(lblNewLabel_10_3_4);
		panel_4_4_1.setLayout(null);
		panel_4_4_1.setForeground(Color.WHITE);
		panel_4_4_1.setBackground(new Color(0, 128, 128));
		panel_4_4_1.setBounds(775, 357, 264, 231);
		
		panel_3.add(panel_4_4_1);
		lblNewLabel_4_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_4_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4_4_1.setBounds(10, 11, 244, 37);
		
		panel_4_4_1.add(lblNewLabel_4_4_1);
		lblNewLabel_5_4_1.setForeground(Color.WHITE);
		lblNewLabel_5_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5_4_1.setBounds(10, 55, 226, 22);
		
		panel_4_4_1.add(lblNewLabel_5_4_1);
		lblNewLabel_6_4_1.setForeground(Color.WHITE);
		lblNewLabel_6_4_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_6_4_1.setBounds(10, 112, 60, 14);
		
		panel_4_4_1.add(lblNewLabel_6_4_1);
		lblNewLabel_7_5_1.setForeground(Color.WHITE);
		lblNewLabel_7_5_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_5_1.setBounds(10, 148, 60, 14);
		
		panel_4_4_1.add(lblNewLabel_7_5_1);
		lblNewLabel_7_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7_1_4_1.setBounds(10, 184, 60, 14);
		
		panel_4_4_1.add(lblNewLabel_7_1_4_1);
		lblNewLabel_8_4_1.setForeground(Color.WHITE);
		lblNewLabel_8_4_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_8_4_1.setBounds(94, 112, 71, 14);
		
		panel_4_4_1.add(lblNewLabel_8_4_1);
		lblNewLabel_9_4_1.setForeground(Color.WHITE);
		lblNewLabel_9_4_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_9_4_1.setBounds(196, 112, 58, 14);
		
		panel_4_4_1.add(lblNewLabel_9_4_1);
		lblNewLabel_10_7_1.setForeground(Color.WHITE);
		lblNewLabel_10_7_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_7_1.setBounds(94, 148, 60, 14);
		
		panel_4_4_1.add(lblNewLabel_10_7_1);
		lblNewLabel_10_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_1_4_1.setBounds(94, 184, 60, 14);
		
		panel_4_4_1.add(lblNewLabel_10_1_4_1);
		lblNewLabel_10_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_10_2_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_2_4_1.setBounds(196, 148, 46, 14);
		
		panel_4_4_1.add(lblNewLabel_10_2_4_1);
		lblNewLabel_10_3_4_1.setForeground(Color.WHITE);
		lblNewLabel_10_3_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10_3_4_1.setBounds(196, 184, 46, 14);
		
		panel_4_4_1.add(lblNewLabel_10_3_4_1);
	}
}
