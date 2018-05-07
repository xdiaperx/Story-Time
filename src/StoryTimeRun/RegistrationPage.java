
package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.util.StringUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;



public class RegistrationPage {

	private JFrame frame;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtPassConf;
	
	private static int maxMembs = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws FileNotFoundException {
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
		lblFName.setBounds(57, 126, 182, 31);
		frame.getContentPane().add(lblFName);
		
		JLabel lblLName = new JLabel("Last Name: ");
		lblLName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblLName.setBounds(57, 169, 117, 21);
		frame.getContentPane().add(lblLName);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblUsername.setBounds(57, 214, 96, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblPassword.setBounds(57, 265, 91, 16);
		frame.getContentPane().add(lblPassword);
		
		
		txtFName = new JTextField();
		txtFName.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		txtFName.setBounds(158, 128, 562, 26);
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
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					LoginPage.main(null);
					frame.dispose();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnExit.setBounds(271, 371, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JButton btnLogin = new JButton("Register");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isAlphanumeric(txtPassword.getText())) {
					try {
						Member newMemb = new Member(txtUsername.getText(), txtPassword.getText(), txtFName.getText(), txtLName.getText());
						ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("membs.txt"));
						out.writeObject(newMemb);
						out.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						HomeScreen.main(null);
						frame.dispose();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Passwork", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(436, 371, 117, 29);
		frame.getContentPane().add(btnLogin);
		
	}
	
	private boolean isAlphanumeric(String str) {
	    for (int i=0; i<str.length(); i++) {
	        char c = str.charAt(i);
	        if (c < 0x30 || (c >= 0x3a && c <= 0x40) || (c > 0x5a && c <= 0x60) || c > 0x7a)
	            return false;
	    }
	    return true;
	}
	
}