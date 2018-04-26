import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Image extends JFrame {
	private static final int SCALE_DEFAULT = 0;

	private ImageIcon[] imageIcon = new ImageIcon[1];

	private JLabel jlblImageViewer = new JLabel();

	public static void main(String args[]) {
		Image frame = new Image();

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	public Image() {
		super("Label Demo");
		imageIcon[0] = new ImageIcon(new ImageIcon("image.jpg").getImage()
				.getScaledInstance(500, 470, Image.SCALE_DEFAULT));

		jlblImageViewer.setIcon(imageIcon[0]);
		jlblImageViewer.setHorizontalAlignment(SwingConstants.CENTER);

		add(jlblImageViewer, BorderLayout.CENTER);
	}

}