package View;

import Controller.LoginController;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import net.miginfocom.swing.MigLayout;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField inputUsername;
	private JPasswordField inputPassword;
	private JLabel lblValidateLogin;
	private JButton btnLogin;
	private JPanel panel_2;
	static LoginController loginController = new LoginController();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


    public Login() {
        initialize();
    }
	/**
	 * Create the frame.
	 */
	void initialize() {
		setTitle("MSS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 650);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 128));
        contentPane.setForeground(new Color(0, 0, 128));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblogo = new JLabel("MSS");
        lblogo.setForeground(Color.WHITE);
        lblogo.setFont(new Font("Footlight MT Light", Font.BOLD, 60));
        lblogo.setHorizontalAlignment(SwingConstants.CENTER);
        lblogo.setBounds(307, 49, 300, 73);
        contentPane.add(lblogo);

        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(293, 253, 120, 49);
        contentPane.add(lblNewLabel);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPassword.setBounds(293, 334, 120, 49);
        contentPane.add(lblPassword);

        inputUsername = new JTextField();
        inputUsername.setBounds(438, 259, 272, 43);
        contentPane.add(inputUsername);
        inputUsername.setFont(new Font("Arial", Font.PLAIN, 12));
        inputUsername.setColumns(10);
        lblNewLabel.setLabelFor(inputUsername);

        inputPassword = new JPasswordField();
        inputPassword.setBounds(438, 340, 272, 43);
        contentPane.add(inputPassword);
        inputPassword.setFont(new Font("Arial", Font.PLAIN, 12));

        JLabel lblNewLabel_1 = new JLabel("SYSTEM");
        lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(519, 70, 114, 43);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("PH\u1EA6N M\u1EC0M QU\u1EA2N L\u00CD SINH VI\u00CAN");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBounds(460, 97, 250, 48);
        contentPane.add(lblNewLabel_2);

        btnLogin = new JButton("\u0110\u0102NG NH\u1EACP");
        btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(new Color(47, 79, 79));
        btnLogin.setBounds(383, 462, 250, 43);
        contentPane.add(btnLogin);

        lblValidateLogin = new JLabel();
        lblValidateLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblValidateLogin.setForeground(Color.WHITE);
        lblValidateLogin.setBounds(293, 194, 417, 37);
        contentPane.add(lblValidateLogin);


//        btnLogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                lblValidateLogin.setText("");
//                String code = inputUsername.getText();
//                String password = String.copyValueOf(inputPassword.getPassword());
//                System.out.println(loginController.login(code,password));
//                if(loginController.login(code,password) == 1){
//                    lblValidateLogin.setText("Ä�Äƒng nháº­p thÃ nh cÃ´ng!");
//                }else{
//                    lblValidateLogin.setText("TÃªn Ä‘Äƒng nháº­p hoáº·c máº­t kháº©u khÃ´ng Ä‘Ãºng. Vui lÃ²ng nháº­p láº¡i !");
//                }
//            }
//        });
	}

	public String [] getInputAccount(){
        String code = inputUsername.getText();
        String password = String.copyValueOf(inputPassword.getPassword());
        return new String []{code, password};
    }

    public void messageLogin(int option){
	   if(option == 1) {
           lblValidateLogin.setText("Ä�Äƒng nháº­p thÃ nh cÃ´ng!");
       }
	   if(option < 1) {
           lblValidateLogin.setText("TÃªn Ä‘Äƒng nháº­p hoáº·c máº­t kháº©u khÃ´ng Ä‘Ãºng. Vui lÃ²ng nháº­p láº¡i !");
       }
    }

    public void addLoginListener(ActionListener listener) {
	    lblValidateLogin.setText("");
        btnLogin.addActionListener(listener);
    }
}
