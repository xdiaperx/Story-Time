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
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Reviews {

	private JFrame frame;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnDislike;
	private JRadioButton rdbtnNeither;
	private JRadioButton rdbtnLike;
	private JRadioButton rdbtnDislike_1;
	private JRadioButton rdbtnNeither_1;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JRadioButton rdbtnNewRadioButton_6;
	private JRadioButton rdbtnNewRadioButton_7;
	private JRadioButton rdbtnDislike_2;
	private JRadioButton rdbtnNeither_2;
	private JRadioButton rdbtnNewRadioButton_8;
	private JRadioButton rdbtnNewRadioButton_9;
	private JRadioButton rdbtnNewRadioButton_10;
	
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
		
		rdbtnNewRadioButton = new JRadioButton("Like");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setBounds(81, 180, 122, 47);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_1.setBounds(81, 220, 122, 41);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Neither");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_2.setBounds(81, 256, 122, 40);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton);
		group1.add(rdbtnNewRadioButton_1);
		group1.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Main Plot:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(325, 155, 109, 23);
		frame.getContentPane().add(lblNewLabel);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Like");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_3.setBounds(335, 189, 122, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		rdbtnDislike = new JRadioButton("Dislike");
		rdbtnDislike.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike.setBounds(334, 226, 100, 31);
		frame.getContentPane().add(rdbtnDislike);
		
		rdbtnNeither = new JRadioButton("Neither");
		rdbtnNeither.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither.setBounds(335, 261, 122, 31);
		frame.getContentPane().add(rdbtnNeither);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_3);
		group2.add(rdbtnDislike);
		group2.add(rdbtnNeither);
		
		JLabel lblSubplots = new JLabel("Subplot(s):");
		lblSubplots.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSubplots.setBounds(560, 155, 131, 23);
		frame.getContentPane().add(lblSubplots);
		
		rdbtnLike = new JRadioButton("Like");
		rdbtnLike.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnLike.setBounds(570, 189, 86, 31);
		frame.getContentPane().add(rdbtnLike);
		
		rdbtnDislike_1 = new JRadioButton("Dislike");
		rdbtnDislike_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike_1.setBounds(569, 226, 122, 31);
		frame.getContentPane().add(rdbtnDislike_1);
		
		rdbtnNeither_1 = new JRadioButton("Neither");
		rdbtnNeither_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither_1.setBounds(570, 262, 132, 31);
		frame.getContentPane().add(rdbtnNeither_1);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnLike);
		group3.add(rdbtnDislike_1);
		group3.add(rdbtnNeither_1);
		
		JLabel lblClimax = new JLabel("Climax:");
		lblClimax.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblClimax.setBounds(97, 339, 132, 23);
		frame.getContentPane().add(lblClimax);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Like");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_4.setBounds(81, 368, 71, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_5 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_5.setBounds(81, 405, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		rdbtnNewRadioButton_6 = new JRadioButton("Neither");
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_6.setBounds(81, 440, 116, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnNewRadioButton_4);
		group4.add(rdbtnNewRadioButton_5);
		group4.add(rdbtnNewRadioButton_6);
		
		JLabel lblConclusion = new JLabel("Conclusion:");
		lblConclusion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConclusion.setBounds(325, 340, 152, 23);
		frame.getContentPane().add(lblConclusion);
		
		rdbtnNewRadioButton_7 = new JRadioButton("Like");
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_7.setBounds(325, 369, 91, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		rdbtnDislike_2 = new JRadioButton("Dislike");
		rdbtnDislike_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnDislike_2.setBounds(325, 406, 109, 31);
		frame.getContentPane().add(rdbtnDislike_2);
		
		rdbtnNeither_2 = new JRadioButton("Neither");
		rdbtnNeither_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNeither_2.setBounds(325, 441, 116, 31);
		frame.getContentPane().add(rdbtnNeither_2);
		
		ButtonGroup group5 = new ButtonGroup();
		group5.add(rdbtnNewRadioButton_7);
		group5.add(rdbtnDislike_2);
		group5.add(rdbtnNeither_2);
		
		JLabel lblCharacters = new JLabel("Characters:");
		lblCharacters.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCharacters.setBounds(560, 340, 131, 23);
		frame.getContentPane().add(lblCharacters);
		
		rdbtnNewRadioButton_8 = new JRadioButton("Like");
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_8.setBounds(570, 369, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		rdbtnNewRadioButton_9 = new JRadioButton("Dislike");
		rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_9.setBounds(570, 406, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		rdbtnNewRadioButton_10 = new JRadioButton("Neither");
		rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_10.setBounds(570, 441, 179, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		ButtonGroup group6 = new ButtonGroup();
		group6.add(rdbtnNewRadioButton_8);
		group6.add(rdbtnNewRadioButton_9);
		group6.add(rdbtnNewRadioButton_10);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					DoReview.introLike++;
					DoReview.introTot++;
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					DoReview.introDislike++;
					DoReview.introTot++;
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
					DoReview.introNeither++;
					DoReview.introTot++;
				}
				if(rdbtnNewRadioButton_3.isSelected()) {
					DoReview.mainLike++;
					DoReview.mainTot++;
				}
				else if(rdbtnDislike.isSelected()) {
					DoReview.mainDislike++;
					DoReview.mainTot++;
				}
				else if(rdbtnNeither.isSelected()) {
					DoReview.mainNeither++;
					DoReview.mainTot++;
				}
				if(rdbtnLike.isSelected()) {
					DoReview.subLike++;
					DoReview.subTot++;
				}
				else if(rdbtnDislike_1.isSelected()) {
					DoReview.subDislike++;
					DoReview.subTot++;
				}
				else if(rdbtnNeither_1.isSelected()) {
					DoReview.subNeither++;
					DoReview.subTot++;
				}
				if(rdbtnNewRadioButton_4.isSelected()) {
					DoReview.climaxLike++;
					DoReview.climaxTot++;
				}
				else if(rdbtnNewRadioButton_5.isSelected()) {
					DoReview.climaxDislike++;
					DoReview.climaxTot++;
				}
				else if(rdbtnNewRadioButton_6.isSelected()) {
					DoReview.climaxNeither++;
					DoReview.climaxTot++;
				}
				if(rdbtnNewRadioButton_7.isSelected()) {
					DoReview.conLike++;
					DoReview.conTot++;
				}
				else if(rdbtnDislike_2.isSelected()) {
					DoReview.conDislike++;
					DoReview.conTot++;
				}
				else if(rdbtnNeither_2.isSelected()) {
					DoReview.conNeither++;
					DoReview.conTot++;
				}
				if(rdbtnNewRadioButton_8.isSelected()) {
					DoReview.charLike++;
					DoReview.charTot++;
				}
				else if(rdbtnNewRadioButton_9.isSelected()) {
					DoReview.charDislike++;
					DoReview.charTot++;
				}
				else if(rdbtnNewRadioButton_10.isSelected()) {
					DoReview.charNeither++;
					DoReview.charTot++;
				}
				new Story_Page("Avengers Infinity War", "Movie", "Superhero, Action, Sci-fi").frame.setVisible(true);;
				frame.dispose();
			}
		});
		btnNewButton.setBounds(525, 486, 145, 31);
		frame.getContentPane().add(btnNewButton);
	}
}
