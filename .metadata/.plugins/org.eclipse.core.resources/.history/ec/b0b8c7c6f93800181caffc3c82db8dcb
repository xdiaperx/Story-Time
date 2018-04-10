import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPageClass {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageClass window = new LoginPageClass();
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

	public LoginPageClass() {
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
		
		JLabel lblStoryTime = new JLabel("Story Time");
		lblStoryTime.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblStoryTime.setBounds(178, 31, 117, 30);
		frame.getContentPane().add(lblStoryTime);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBounds(235, 173, 117, 29);
		frame.getContentPane().add(btnReset);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(158, 97, 225, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(158, 135, 225, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if(password.contains("123") && username.contains("Mary"))
				{
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect Login Info", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(106, 173, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(96, 100, 82, 21);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(96, 140, 61, 16);
		frame.getContentPane().add(lblPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(46, 73, 365, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(49, 168, 310, 1);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(46, 214, 365, 14);
		frame.getContentPane().add(separator_2);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUpClass.main(null);
			}
		});
		btnSignUp.setBounds(178, 228, 117, 29);
		frame.getContentPane().add(btnSignUp);
	}
}
