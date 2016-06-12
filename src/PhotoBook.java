import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoBook implements MouseMotionListener {
	BufferedImage backround;
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	sounds s = new sounds();
	backroundImage X = new backroundImage("Treasure.jpeg");

	public static void main(String[] args) {
		PhotoBook d = new PhotoBook();
	}

	public PhotoBook() {
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();

		JOptionPane.showMessageDialog(null, "YAAAARGGGG, we are going on a treasure hunt skipper");
		JOptionPane.showMessageDialog(null, "ok lad find thy docking device on here map");
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(290, 340);
		frame.setLayout(null);
		X.setBounds(0, 0, 288, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBounds(500, 500, 500, 500);

		frame.add(panel);
		frame.add(X);
		frame.addMouseMotionListener(this);

	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent arg0) {

		if (arg0.getX() > 251 & arg0.getX() < 263 && arg0.getY() == 106 & arg0.getY() < 111) {

			s.playSound("waves.wav");
			JOptionPane.showMessageDialog(null, "Good job lad, now find the place that marks me booty");
		}
		if (arg0.getX() > 160 & arg0.getX() < 165 && arg0.getY() > 230 & arg0.getY() < 235) {
			s.playSound("dddd.wav");
			JOptionPane
					.showMessageDialog(
							null,
							"Oh no, the ghost of Black Beard has appeared, remember the combination then click the correct combination or feel his wrath");
			s.playSound("drama.wav");

			gameaddon tt = new gameaddon();

		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
