import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Universe 
{

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField txtUName;
	private JTextField txtGenre;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Universe window = new Universe();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Universe() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUniverse = new JLabel("Universe");
		lblUniverse.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblUniverse.setBounds(50, 36, 182, 47);
		frame.getContentPane().add(lblUniverse);
		
		JLabel lblUName = new JLabel("Universe Name: ");
		lblUName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblUName.setBounds(70, 126, 182, 31);
		frame.getContentPane().add(lblUName);
		
		JLabel lblGenre = new JLabel("Genre: ");
		lblGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblGenre.setBounds(70, 200, 117, 21);
		frame.getContentPane().add(lblGenre);
		
		JLabel lblImage = new JLabel("Image: ");
		lblImage.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblImage.setBounds(70, 270, 97, 21);
		frame.getContentPane().add(lblImage);
		
		txtUName = new JTextField();
		txtUName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtUName.setBounds(208, 128, 562, 26);
		frame.getContentPane().add(txtUName);
		txtUName.setColumns(10);
		
		txtGenre = new JTextField();
		txtGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtGenre.setBounds(208, 196, 562, 26);
		frame.getContentPane().add(txtGenre);
		txtGenre.setColumns(10);
		
		JButton image = new JButton("Image");
		image.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Image.main(null);
			}
		});
		image.setBounds(208, 265, 117, 29);
		frame.getContentPane().add(image);
	}
}