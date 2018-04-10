import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationPage {

	private JFrame frame;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtPassConf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage window = new RegistrationPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblRegister.setBounds(20, 17, 76, 31);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblFName = new JLabel("First Name: ");
		lblFName.setBounds(57, 49, 91, 24);
		frame.getContentPane().add(lblFName);
		
		JLabel lblLName = new JLabel("Last Name: ");
		lblLName.setBounds(57, 85, 91, 16);
		frame.getContentPane().add(lblLName);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(57, 113, 96, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(57, 152, 91, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblPassConf = new JLabel("Password Confirmation: ");
		lblPassConf.setBounds(57, 179, 164, 31);
		frame.getContentPane().add(lblPassConf);
		
		txtFName = new JTextField();
		txtFName.setBounds(131, 48, 275, 26);
		frame.getContentPane().add(txtFName);
		txtFName.setColumns(10);
		
		txtLName = new JTextField();
		txtLName.setBounds(131, 80, 275, 26);
		frame.getContentPane().add(txtLName);
		txtLName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(124, 114, 282, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(124, 147, 282, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtPassConf = new JTextField();
		txtPassConf.setBounds(210, 181, 196, 26);
		frame.getContentPane().add(txtPassConf);
		txtPassConf.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPageClass.main(null);
			}
		});
		btnExit.setBounds(122, 222, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				
			}
		});
		btnLogin.setBounds(237, 222, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUpClass.main(null);
			}
		});
		btnBack.setBounds(6, 243, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}

