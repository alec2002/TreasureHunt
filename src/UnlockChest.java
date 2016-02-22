import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class UnlockChest implements MouseMotionListener {
	JFrame frame;
	BufferedImage backroundimage;

	public static void main(String[] args) {
		UnlockChest rrr = new UnlockChest();
	}

	public UnlockChest() {

		frame = new JFrame();
		frame.setVisible(true);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		ImagePanel dd = new ImagePanel("pic.jpg", 400, 400);

		try {
			backroundimage = ImageIO.read(getClass().getResource("pic.jpg"));

		} catch (Exception e) {
			// TODO: handle exception
		}

		//
		frame.add(dd);

		frame.setSize(401, 420);
		try {
			new Robot().mouseMove(10, 70);
		} catch (AWTException e) {

			e.printStackTrace();
		}
		frame.addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		Color c = new Color(backroundimage.getRGB(mouseX, mouseY));

		System.out.println(c.getRed());

	}

}
