package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Story_Page {

	public JFrame frame;
	private String storyName;
	private String format;
	private String genre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story_Page window = new Story_Page();
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
	public Story_Page() {
		initialize();
	}
	
	public Story_Page(String storName, String gen, String form) {
		storyName = storName;
		format = form;
		genre = gen;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStoryName = new JLabel("Story Name");
		lblStoryName.setFont(new Font("Sitka Heading", Font.BOLD, 34));
		lblStoryName.setBounds(47, 19, 354, 68);
		frame.getContentPane().add(lblStoryName);
		
		lblStoryName.setText(storyName);
		
		JLabel lblFormats = new JLabel("Format:");
		lblFormats.setBounds(47, 76, 73, 23);
		frame.getContentPane().add(lblFormats);
		
		JLabel lblGenres = new JLabel("Genre(s):");
		lblGenres.setBounds(34, 106, 82, 23);
		frame.getContentPane().add(lblGenres);
		
		JButton btnNewButton = new JButton("Review");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reviews.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(47, 148, 184, 56);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel.setBounds(87, 268, 44, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Intoduction");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(111, 224, 145, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Main Plot");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(351, 232, 145, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subplot(s)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(594, 235, 113, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblClimax = new JLabel("Climax");
		lblClimax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblClimax.setBounds(138, 386, 93, 35);
		frame.getContentPane().add(lblClimax);
		
		JLabel lblConclusion = new JLabel("Conclusion");
		lblConclusion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblConclusion.setBounds(351, 392, 131, 23);
		frame.getContentPane().add(lblConclusion);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_4.setBounds(148, 268, 50, 47);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_5.setBounds(214, 271, 53, 44);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel_6.setBounds(324, 268, 50, 47);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_7.setBounds(391, 268, 50, 47);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel_8.setBounds(566, 268, 50, 47);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_9.setBounds(458, 268, 51, 47);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel_10.setBounds(87, 427, 50, 52);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_11.setBounds(633, 268, 50, 52);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_12.setBounds(700, 268, 44, 47);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_13.setBounds(154, 427, 44, 47);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_14.setBounds(221, 427, 53, 52);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel_15.setBounds(321, 432, 53, 47);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_16.setBounds(391, 432, 50, 47);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_17.setBounds(456, 432, 53, 47);
		frame.getContentPane().add(lblNewLabel_17);
		
		if(DoReview.introTot > 1)
			DoReview.mainTot--;
		
		JLabel label = new JLabel(Double.toString(((DoReview.introLike / DoReview.introTot) * 1000.0) / 10.0) + "%");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(87, 318, 60, 23);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("00.0%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_1.setBounds(148, 318, 60, 23);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("00.0%");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_2.setBounds(214, 318, 60, 23);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("00.0%");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_3.setBounds(324, 318, 50, 23);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("00.0%");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_4.setBounds(391, 318, 60, 23);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("00.0%");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_5.setBounds(458, 318, 60, 23);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("00.0%");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_6.setBounds(566, 318, 50, 23);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("00.0%");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_7.setBounds(633, 318, 60, 23);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("00.0%");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_8.setBounds(699, 318, 60, 23);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("00.0%");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_9.setBounds(87, 478, 60, 23);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("00.0%");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_10.setBounds(148, 478, 50, 23);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("00.0%");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_11.setBounds(214, 478, 53, 23);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("00.0%");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_12.setBounds(314, 478, 60, 23);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("00.0%");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_13.setBounds(391, 478, 60, 23);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("00.0%");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_14.setBounds(458, 478, 51, 23);
		frame.getContentPane().add(label_14);
		
		JLabel lblCharacters = new JLabel("Characters");
		lblCharacters.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCharacters.setBounds(594, 394, 124, 23);
		frame.getContentPane().add(lblCharacters);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-up.png")));
		lblNewLabel_18.setBounds(566, 429, 53, 50);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/thumbs-down.png")));
		lblNewLabel_19.setBounds(700, 427, 50, 50);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(Story_Page.class.getResource("/StoryTimeRun/1f937-2642.png")));
		lblNewLabel_20.setBounds(633, 427, 53, 56);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel label_15 = new JLabel("00.0%");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_15.setBounds(566, 477, 50, 23);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("00.0%");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_16.setBounds(633, 478, 60, 23);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("00.0%");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_17.setBounds(700, 478, 50, 23);
		frame.getContentPane().add(label_17);
		
		JButton btnNewButton_1 = new JButton("Home Screen");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					HomeScreen.main(null);
					frame.dispose();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(291, 148, 161, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setBounds(133, 106, 418, 23);
		frame.getContentPane().add(lblNewLabel_21);
		
		lblNewLabel_21.setText(format);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setBounds(133, 76, 418, 23);
		frame.getContentPane().add(lblNewLabel_22);
		
		lblNewLabel_22.setText(genre);
	}
}
