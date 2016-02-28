import java.awt.AWTException;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class UnlockChest implements MouseMotionListener, KeyListener {
	JFrame frame;
	BufferedImage backroundimage;
	BufferedImage backroundimage2;
	ImagePanel surfboard;
	sounds waves = new sounds();
	sounds ss = new sounds();

	public static void main(String[] args) {
		UnlockChest rrr = new UnlockChest();
	}

	public UnlockChest() {

		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
		waves.playSound("waves.wav");
		frame = new JFrame();
		frame.setVisible(true);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setCursor(blankCursor);
		ImagePanel dd = new ImagePanel("Unknown-1.jpeg", 600, 600);
		surfboard = new ImagePanel("images.jpeg", 100, 100);
		try {
			backroundimage = ImageIO.read(getClass().getResource("Unknown-1.jpeg"));
			backroundimage2 = ImageIO.read(getClass().getResource("images.jpeg"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		frame.setLayout(null);
		dd.setBounds(0, 0, 600, 600);
		surfboard.setBounds(200, 200, 100, 100);

		frame.add(surfboard);
		frame.add(dd);
		frame.repaint();
		frame.setSize(600, 600);
		try {
			new Robot().mouseMove(250, 300);
		} catch (AWTException e) {

			e.printStackTrace();
		}
		frame.addMouseMotionListener(this);
		frame.addKeyListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		surfboard.setBounds(mouseX - 50, mouseY - 50, 100, 100);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
			ss.playSound("splash.wav");

		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
