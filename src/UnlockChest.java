import java.applet.AudioClip;
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
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class UnlockChest extends JPanel implements MouseMotionListener, KeyListener, ActionListener {
	Rectangle surferBox;
	boolean isflash = false;
	long startt = -1;
	int mineb1 = 70;
	int mineb2 = 70;
	int move1 = 380;
	int move2 = 400;
	int minex = 100;
	int miney = 400;

	int minew = 75;
	int mineh = 75;
	int num1 = 200;
	int num2 = 100;
	int one = 1;
	int i = 60;
	int minebob = 1;
	Rectangle jellyfishBox;
	Rectangle minebox;
	JFrame frame;
	JPanel panel;
	int score = 3;
	int score2 = 1;
	int backwidth = 600;
	int num = 1000 / 60;
	int backheight = 600;
	boolean visible = true;
	boolean showim = true;
	int box1 = 100;
	int box2 = 100;
	boolean mineb = true;
	BufferedImage backroundimage;

	BufferedImage backroundimage2;

	BufferedImage backroundimage3;

	BufferedImage backroundimage4;

	ImagePanel surfboard;
	ImagePanel mine;
	jellyfish jf;
	jellyfish jf2;
	Random r = new Random();
	int mouseY;
	int mouseX;
	int x = 300;

	int y = 300;
	int mov = 1;
	Timer t;
	Timer tt;
	ImagePanel dd;

	public UnlockChest() {
		playSound("waves.wav");
		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");

		dd = new ImagePanel("Unknown-1.jpeg", backwidth, backheight, 0, 0);
		mine = new ImagePanel("imgres.png", minew, mineh, minex, miney);

		surfboard = new ImagePanel("images.png", 100, 100, 200, 100);
		surferBox = new Rectangle(100, 100, num1, num2);
		frame = new JFrame();
		frame.setTitle("Dodge The JellyFish Round 1");
		frame.add(this);

		panel = new JPanel();
		try {

			backroundimage = ImageIO.read(getClass().getResource("Unknown-1.jpeg"));

			backroundimage2 = ImageIO.read(getClass().getResource("images.png"));

			backroundimage3 = ImageIO.read(getClass().getResource("jelly.png"));

			backroundimage4 = ImageIO.read(getClass().getResource("imgres.png"));
		} catch (Exception e) {

			// TODO: handle exception

		}

		jf = new jellyfish(x, y, 100, 100, backroundimage3);
		jellyfishBox = new Rectangle(300, 300, box1, box2);
		Timer t = new Timer(num, this);

		try {

			new Robot().mouseMove(250, 300);

		} catch (AWTException e) {

			e.printStackTrace();

		}

		frame.setVisible(visible);

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
		if (visible == true) {
			if (isflash == true) {

				if (startt == -1) {
					startt = System.currentTimeMillis();
				}
				if (System.currentTimeMillis() - startt >= 100) {
					showim = !showim;
					startt = System.currentTimeMillis();
				}
			}
			dd.paint(g);

			jf.draw(g);
			if (showim == true) {
				mine.paint(g);
			}

			surfboard.paint(g);
		}
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

			playSound("splash.wav");

		}
		if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {

			System.exit(0);

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
		minebox = new Rectangle(minex, miney, mineb1, mineb2);
		repaint();
		// moves thing1
		jf.update();
		mine.setBounds(minex, miney -= minebob, minew, mineh);

		if (miney < move1) {
			minebob = -1;
		}
		if (miney > move2) {
			minebob = +1;
		}
		// /
		// System.out.println(miney);
		jellyfishBox.setBounds(jf.x, jf.y, jf.width, jf.height);
		if (surferBox.intersects(jellyfishBox)) {
			jf.x = 1;
			jf.width = 0;
			jf.height = 0;
			JOptionPane.showMessageDialog(null, "You Lose");
			frame.dispose();
			int i = 0;
			int j = 0;
			System.exit(0);
		}
		if (surferBox.intersects(minebox)) {
			mineb1 = 0;
			mineb2 = 0;
			minex = 0;
			miney = 0;
			minew = 0;
			mineh = 0;
			playSound("exp.wav");
			jf.x = 1;
			jf.width = 0;
			jf.height = 0;
			JOptionPane.showMessageDialog(null, "You Lose");
			frame.dispose();
			int i = 0;
			int j = 0;
			System.exit(0);
		}
	}

	public void Timer() {
		System.out.println("1 : 00");
		for (int i = 60; i > 0; i--) {
			if (i == 32) {
				isflash = true;
			}
			if (i == 31) {
				isflash = false;
			}
			if (i == 30) {
				showim = false;
				mineb1 = 0;
				mineb2 = 0;
				minex = 300;
				miney = 200;
				move1 = 180;
				move2 = 200;
				showim = true;
				isflash = true;
			}
			if (i == 29) {
				showim = true;
				isflash = false;
				mineb1 = 70;
				mineb2 = 70;
			}
			frame.setTitle("           Dodge The JellyFish Round 1 "
					+ "                                               Timer- " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if (i == 1) {
				frame.setTitle("Dodge The JellyFish Round 2");
				System.out.println("Round 2");

				for (int j = 60; j > 0; j--) {
					if (j == 57) {
						isflash = true;
					}
					if (j == 56) {
						isflash = false;
					}
					if (j == 55) {
						showim = false;
						mineb1 = 0;
						mineb2 = 0;
						minex = 400;
						miney = 400;
						move1 = 380;
						move2 = 400;
						showim = true;
						isflash = true;
					}
					if (j == 54) {
						showim = true;
						isflash = false;
						mineb1 = 0;
						mineb2 = 0;
					}
					if (j == 35) {
						isflash = true;
					}
					if (j == 32) {
						isflash = false;
					}
					if (j == 30) {
						showim = false;
						mineb1 = 0;
						mineb2 = 0;
						minex = 300;
						miney = 100;
						move1 = 80;
						move2 = 100;
						showim = true;
						isflash = true;
					}
					if (j == 29) {
						showim = true;
						isflash = false;
						mineb1 = 0;
						mineb2 = 0;
					}

					frame.setTitle("           Dodge The JellyFish Round 2 "
							+ "                                               Timer- " + j);
					try {
						Thread.sleep(1000);
						System.out.println(j);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (j == 1) {
						jf.x = 0;
						jf.y = 0;
						jf.width = 0;
						jf.height = 0;
						box1 = 0;
						box2 = 0;
						num1 = 0;
						num2 = 0;
						frame.setTitle("You Win");
						JOptionPane.showMessageDialog(null, "YOU WIN!!!!!");
						System.out.println("You Win");
						System.exit(0);
					}
				}

			}
		}
	}

	void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
