package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSignUp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignUp window = new AdminSignUp();
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
	public AdminSignUp() {
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
		
		JLabel lblAuthorizationCode = new JLabel("Authorization Code: ");
		lblAuthorizationCode.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblAuthorizationCode.setBounds(275, 124, 201, 44);
		frame.getContentPane().add(lblAuthorizationCode);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		textField.setBounds(456, 133, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(456, 231, 117, 29);
		frame.getContentPane().add(btnContinue);
		
		JLabel lblAdmin = new JLabel("Admin Sign Up: ");
		lblAdmin.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblAdmin.setBounds(343, 57, 195, 40);
		frame.getContentPane().add(lblAdmin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUpClass.main(null);
			}
		});
		btnBack.setBounds(302, 231, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}
