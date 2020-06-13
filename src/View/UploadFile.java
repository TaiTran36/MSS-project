package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
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

public class UploadFile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UploadFile frame = new UploadFile();
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
	public UploadFile() {
		setTitle("Chia s\u1EBB t\u00E0i li\u1EC7u");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1384, 788);
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

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(224, 0, 1156, 56);
		panel_3.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1342, 57, 26, 692);
		contentPane.add(scrollBar);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 235));
		panel_4.setBounds(224, 57, 1120, 691);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("T\u1EA3i l\u00EAn");
		btnNewButton_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(531, 380, 153, 42);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Upload File");
		btnNewButton_1_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBounds(531, 277, 153, 42);
		panel_4.add(btnNewButton_1_1);
	}

}
