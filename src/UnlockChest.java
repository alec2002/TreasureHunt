import java.awt.AWTException;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class UnlockChest extends JPanel implements MouseMotionListener, KeyListener, ActionListener {
	Rectangle surferBox;
	Rectangle jellyfishBox;
	JFrame frame;
	int score = 3;
	int score2 = 1;
	int backwidth = 600;

	int backheight = 600;

	BufferedImage backroundimage;

	BufferedImage backroundimage2;

	BufferedImage backroundimage3;

	ImagePanel surfboard;

	jellyfish jf;

	sounds waves = new sounds();

	sounds ss = new sounds();

	Random r = new Random();
	int mouseY;
	int mouseX;
	int x = 300;

	int y = 300;

	Timer t;
	Timer tt;
	ImagePanel dd;

	public static void main(String[] args) {

		UnlockChest rrr = new UnlockChest();

	}

	public UnlockChest() {

		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");

		waves.playSound("waves.wav");

		dd = new ImagePanel("Unknown-1.jpeg", backwidth, backheight, 0, 0);

		surfboard = new ImagePanel("images.png", 100, 100, 200, 200);
		surferBox = new Rectangle(100, 100, 200, 200);
		frame = new JFrame();
		frame.setTitle("Dodge The JellyFish");
		frame.add(this);

		try {

			backroundimage = ImageIO.read(getClass().getResource("Unknown-1.jpeg"));

			backroundimage2 = ImageIO.read(getClass().getResource("images.png"));

			backroundimage3 = ImageIO.read(getClass().getResource("jelly.png"));

		} catch (Exception e) {

			// TODO: handle exception

		}

		jf = new jellyfish(300, 300, 100, 100, backroundimage3);
		jellyfishBox = new Rectangle(300, 300, 100, 100);
		Timer t = new Timer(1000 / 60, this);

		try {

			new Robot().mouseMove(250, 300);

		} catch (AWTException e) {

			e.printStackTrace();

		}

		frame.setVisible(true);

		frame.setSize(600, 600);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().setCursor(blankCursor);

		frame.addMouseMotionListener(this);

		frame.addKeyListener(this);

		frame.setVisible(true);

		t.start();
		Timer();
	}

	public void paintComponent(Graphics g) {

		dd.paint(g);

		jf.draw(g);

		surfboard.paint(g);

	}

	public void mouseDragged(MouseEvent e) {

		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {

		int mouseX = e.getX();

		int mouseY = e.getY();

		surfboard.setBounds(mouseX - 50, mouseY - 50, 100, 100);
		surferBox.setBounds(mouseX - 50, mouseY - 50, 100, 100);

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

	@Override
	public void actionPerformed(ActionEvent arg0) {

		repaint();
		// moves thing1
		jf.update();
		jellyfishBox.setBounds(jf.x, jf.y, jf.width, jf.height);
		if (surferBox.intersects(jellyfishBox)) {
			JOptionPane.showMessageDialog(null, "You lose");
			System.exit(0);
		}
	}

	public void Timer() {
		System.out.println("1 : 00");
		for (int i = 60; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if (i == 1) {
				System.out.println("DDJJDJDJDJ");
			}
			if (surferBox.intersects(jellyfishBox)) {
				try {
					Thread.sleep(1000000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
