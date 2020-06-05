package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtMsv;
	private JPasswordField password;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("\u0110\u0103ng nh\u1EADp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(159, 134, 250, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtMsv = new JTextField();
		txtMsv.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMsv.setText("M\u00E3 sinh vi\u00EAn:");
		txtMsv.setBounds(10, 11, 204, 27);
		panel.add(txtMsv);
		txtMsv.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(159, 207, 250, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		password = new JPasswordField();
		password.setFont(new Font("Arial", Font.PLAIN, 12));
		password.setText("M\u1EADt kh\u1EA9u");
		password.setBounds(10, 11, 203, 27);
		panel_1.add(password);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(159, 289, 250, 49);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbLogin = new JLabel("\u0110\u0103ng nh\u1EADp");
		lbLogin.setForeground(Color.WHITE);
		lbLogin.setFont(new Font("Arial", Font.BOLD, 14));
		lbLogin.setBounds(87, 11, 83, 27);
		panel_2.add(lbLogin);
		
		JLabel lblogo = new JLabel("PH\u1EA6N M\u1EC0M QU\u1EA2N L\u00CD SINH VI\u00CAN");
		lblogo.setForeground(Color.WHITE);
		lblogo.setFont(new Font("Arial", Font.BOLD, 16));
		lblogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblogo.setBounds(159, 30, 250, 84);
		contentPane.add(lblogo);
		setLocationRelativeTo(null);
	}
}
