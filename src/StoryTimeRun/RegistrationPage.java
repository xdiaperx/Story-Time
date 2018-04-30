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
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblRegister.setBounds(20, 36, 182, 47);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblFName = new JLabel("First Name: ");
		lblFName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblFName.setBounds(57, 110, 182, 31);
		frame.getContentPane().add(lblFName);
		
		JLabel lblLName = new JLabel("Last Name: ");
		lblLName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblLName.setBounds(57, 166, 117, 21);
		frame.getContentPane().add(lblLName);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblUsername.setBounds(57, 214, 96, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblPassword.setBounds(57, 265, 91, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblPassConf = new JLabel("Password Confirmation: ");
		lblPassConf.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblPassConf.setBounds(57, 304, 230, 40);
		frame.getContentPane().add(lblPassConf);
		
		txtFName = new JTextField();
		txtFName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtFName.setBounds(158, 112, 562, 26);
		frame.getContentPane().add(txtFName);
		txtFName.setColumns(10);
		
		txtLName = new JTextField();
		txtLName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtLName.setBounds(158, 166, 562, 26);
		frame.getContentPane().add(txtLName);
		txtLName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtUsername.setBounds(158, 215, 562, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtPassword.setBounds(158, 260, 569, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtPassConf = new JTextField();
		txtPassConf.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtPassConf.setBounds(271, 311, 456, 26);
		frame.getContentPane().add(txtPassConf);
		txtPassConf.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnExit.setBounds(271, 371, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String passConf = txtPassConf.getText();
				
				
				if(passConf.equals(password))
				{
					HomeScreen.main(null);
				}
					
					
				//String username = txtUsername.getText();
				
				
				
			}
		});
		btnLogin.setBounds(436, 371, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUpClass.main(null);
			}
		});
		btnBack.setBounds(20, 530, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}