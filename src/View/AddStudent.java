package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setTitle("Th\u00EAm sinh vi\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 446);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 sinh vi\u00EAn");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(47, 90, 92, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnSinhVin = new JLabel("T\u00EAn sinh vi\u00EAn");
		lblTnSinhVin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTnSinhVin.setForeground(Color.WHITE);
		lblTnSinhVin.setBounds(47, 141, 92, 30);
		contentPane.add(lblTnSinhVin);
		
		JLabel lblaCh = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblaCh.setFont(new Font("Arial", Font.PLAIN, 13));
		lblaCh.setForeground(Color.WHITE);
		lblaCh.setBounds(47, 205, 92, 30);
		contentPane.add(lblaCh);
		
		JLabel lblGpa = new JLabel("GPA");
		lblGpa.setFont(new Font("Arial", Font.PLAIN, 13));
		lblGpa.setForeground(Color.WHITE);
		lblGpa.setBounds(47, 266, 92, 30);
		contentPane.add(lblGpa);
		
		textField = new JTextField();
		textField.setBounds(174, 90, 269, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 146, 269, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 210, 269, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 271, 269, 30);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.setBounds(261, 336, 89, 41);
		contentPane.add(btnNewButton);
	}
}
