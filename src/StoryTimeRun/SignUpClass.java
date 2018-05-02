package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminSignUp.main(null);
				
			}
		});
		btnAdmin.setBounds(276, 122, 117, 29);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnMember = new JButton("Member");
		btnMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrationPage.main(null);
			}
		});
		btnMember.setBounds(439, 122, 117, 29);
		frame.getContentPane().add(btnMember);
		
		JLabel lblSignUp = new JLabel("Sign Up:");
		lblSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblSignUp.setBounds(374, 40, 169, 45);
		frame.getContentPane().add(lblSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnBack.setBounds(6, 543, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}
