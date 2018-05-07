package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateStory {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ObjectOutputStream out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateStory window = new CreateStory();
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
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public CreateStory() throws ClassNotFoundException, FileNotFoundException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException, FileNotFoundException, IOException {
		
		out = new ObjectOutputStream(new FileOutputStream("storiesCSE.txt"));
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateAStory = new JLabel("Create A Story");
		lblCreateAStory.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCreateAStory.setBounds(274, 43, 274, 103);
		frame.getContentPane().add(lblCreateAStory);
		
		JLabel lblStoryName = new JLabel("Story Name:");
		lblStoryName.setBounds(89, 176, 124, 39);
		frame.getContentPane().add(lblStoryName);
		
		textField = new JTextField();
		textField.setBounds(205, 179, 286, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setBounds(137, 260, 58, 23);
		frame.getContentPane().add(lblGenre);
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setBounds(129, 337, 66, 23);
		frame.getContentPane().add(lblFormat);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 257, 286, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 334, 286, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCreateStory = new JButton("Create Story");
		btnCreateStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Story newStor = new Story(textField.getText(), textField_1.getText(), textField_2.getText());
					out.writeObject(newStor);
					out.close();
					try {
						HomeScreen.main(null);
						frame.dispose();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCreateStory.setBounds(137, 417, 177, 48);
		frame.getContentPane().add(btnCreateStory);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(423, 417, 177, 48);
		frame.getContentPane().add(btnNewButton);
	}
}
