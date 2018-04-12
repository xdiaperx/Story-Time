import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpClass window = new SignUpClass();
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
	public SignUpClass() {
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
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminSignUpClass.main(null);
				
			}
		});
		btnAdmin.setBounds(83, 112, 117, 29);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnMember = new JButton("Member");
		btnMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrationPage.main(null);
			}
		});
		btnMember.setBounds(223, 112, 117, 29);
		frame.getContentPane().add(btnMember);
		
		JLabel lblSignUp = new JLabel("Sign Up:");
		lblSignUp.setBounds(181, 40, 61, 16);
		frame.getContentPane().add(lblSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPageClass.main(null);
			}
		});
		btnBack.setBounds(6, 243, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}
