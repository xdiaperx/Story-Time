package StoryTimeRun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Reviews {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reviews window = new Reviews();
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
	public Reviews() {
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
		
		JLabel lblReviewStory = new JLabel("Review Story");
		lblReviewStory.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblReviewStory.setBounds(295, 40, 237, 74);
		frame.getContentPane().add(lblReviewStory);
		
		JLabel lblIntroduction = new JLabel("Introduction:");
		lblIntroduction.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroduction.setBounds(71, 145, 132, 40);
		frame.getContentPane().add(lblIntroduction);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Like");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setBounds(81, 180, 122, 47);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_1.setBounds(81, 220, 122, 41);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Neither");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_2.setBounds(81, 256, 122, 40);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Main Plot:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(325, 155, 109, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Like");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_3.setBounds(335, 189, 122, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnDislike = new JRadioButton("Dislike");
		rdbtnDislike.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike.setBounds(334, 226, 100, 31);
		frame.getContentPane().add(rdbtnDislike);
		
		JRadioButton rdbtnNeither = new JRadioButton("Neither");
		rdbtnNeither.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither.setBounds(335, 261, 122, 31);
		frame.getContentPane().add(rdbtnNeither);
		
		JLabel lblSubplots = new JLabel("Subplot(s):");
		lblSubplots.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSubplots.setBounds(560, 155, 131, 23);
		frame.getContentPane().add(lblSubplots);
		
		JRadioButton rdbtnLike = new JRadioButton("Like");
		rdbtnLike.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnLike.setBounds(570, 189, 86, 31);
		frame.getContentPane().add(rdbtnLike);
		
		JRadioButton rdbtnDislike_1 = new JRadioButton("Dislike");
		rdbtnDislike_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike_1.setBounds(569, 226, 122, 31);
		frame.getContentPane().add(rdbtnDislike_1);
		
		JRadioButton rdbtnNeither_1 = new JRadioButton("Neither");
		rdbtnNeither_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither_1.setBounds(570, 262, 132, 31);
		frame.getContentPane().add(rdbtnNeither_1);
		
		JLabel lblClimax = new JLabel("Climax:");
		lblClimax.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblClimax.setBounds(97, 339, 132, 23);
		frame.getContentPane().add(lblClimax);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Like");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_4.setBounds(81, 368, 71, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_5.setBounds(81, 405, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Neither");
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_6.setBounds(81, 440, 116, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JLabel lblConclusion = new JLabel("Conclusion:");
		lblConclusion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConclusion.setBounds(325, 340, 152, 23);
		frame.getContentPane().add(lblConclusion);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Like");
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_7.setBounds(325, 369, 91, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnDislike_2 = new JRadioButton("Dislike");
		rdbtnDislike_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike_2.setBounds(325, 406, 109, 31);
		frame.getContentPane().add(rdbtnDislike_2);
		
		JRadioButton rdbtnNeither_2 = new JRadioButton("Neither");
		rdbtnNeither_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither_2.setBounds(325, 441, 116, 31);
		frame.getContentPane().add(rdbtnNeither_2);
		
		JLabel lblCharacters = new JLabel("Characters:");
		lblCharacters.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCharacters.setBounds(560, 340, 131, 23);
		frame.getContentPane().add(lblCharacters);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Like");
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_8.setBounds(570, 369, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_9.setBounds(570, 406, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Neither");
		rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_10.setBounds(570, 441, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Story_Page.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(525, 486, 145, 31);
		frame.getContentPane().add(btnNewButton);
	}
}
