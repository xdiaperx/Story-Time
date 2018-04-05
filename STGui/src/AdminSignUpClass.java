import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSignUpClass {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignUpClass window = new AdminSignUpClass();
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
	public AdminSignUpClass() {
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
		
		JLabel lblAuthorizationCode = new JLabel("Authorization Code: ");
		lblAuthorizationCode.setBounds(95, 125, 130, 16);
		frame.getContentPane().add(lblAuthorizationCode);
		
		textField = new JTextField();
		textField.setBounds(221, 120, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(159, 153, 117, 29);
		frame.getContentPane().add(btnContinue);
		
		JLabel lblAdmin = new JLabel("Admin Sign Up: ");
		lblAdmin.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAdmin.setBounds(148, 47, 147, 40);
		frame.getContentPane().add(lblAdmin);
		
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
