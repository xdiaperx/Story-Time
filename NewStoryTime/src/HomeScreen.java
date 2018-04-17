import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;

public class HomeScreen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
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
	public HomeScreen() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JLabel lblHarryPotter = new JLabel("Harry Potter");
		lblHarryPotter.setBounds(119, 185, 106, 30);
		frame.getContentPane().add(lblHarryPotter);
		
		JLabel lblStarWars = new JLabel("Star Wars");
		lblStarWars.setBounds(369, 182, 86, 37);
		frame.getContentPane().add(lblStarWars);
		
		JLabel lblNewLabel = new JLabel("Lord of the Rings");
		lblNewLabel.setBounds(563, 189, 126, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(58, 34, 736, 21);
		frame.getContentPane().add(textField);
		textField.setBackground(Color.GRAY);
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		
		JLabel lblUsernmaeLabel = new JLabel("Usernmae label");
		lblUsernmaeLabel.setBounds(598, 94, 158, 16);
		frame.getContentPane().add(lblUsernmaeLabel);
		
		JLabel lblSignOut = new JLabel("Sign Out");
		lblSignOut.setBounds(705, 122, 61, 16);
		frame.getContentPane().add(lblSignOut);
	}
}
