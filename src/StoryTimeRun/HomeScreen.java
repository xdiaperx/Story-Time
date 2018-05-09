package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen {

	private JFrame frame;
	private Story stor;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
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
	 * @throws ClassNotFoundException 
	 */
	public HomeScreen() throws ClassNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Story[] stors = new Story[12];
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("storiesCSE.txt"));
			stor = (Story) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Story Time Homepage");
		lblNewLabel.setBounds(214, 49, 354, 65);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LoginPage.main(null);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(445, 387, 169, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Story");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateStory.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(144, 387, 142, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		if(stor != null)
			btnNewButton_2.setText(stor.getStoryName());
		btnNewButton_2.setBounds(17, 134, 228, 36);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Story_Page(stor.getStoryName(), stor.getFormat(), stor.getGenre()).frame.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(17, 189, 228, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(17, 244, 228, 36);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(17, 299, 228, 36);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(262, 133, 218, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(262, 188, 218, 37);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(262, 244, 218, 36);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(262, 299, 218, 36);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(497, 133, 203, 36);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBounds(497, 189, 203, 36);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBounds(497, 244, 203, 36);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBounds(497, 299, 203, 36);
		frame.getContentPane().add(btnNewButton_13);
		
		
	}
}
