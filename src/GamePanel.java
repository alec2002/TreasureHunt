import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer t;
	int x = 10;
	int y = 10;
	Boolean moveRight = true;
	Boolean moveLeft = false;
	Boolean moveUp = true;
	Boolean moveDown = false;
	Random r = new Random();
	int windowwidth = 200;
	int windowheight = 200;
	ImageObject xx;

	BufferedImage image;

	Color red = new Color(255, 0, 0);

	public GamePanel() {
		t = new Timer(5, this);
		t.start();

		xx = new ImageObject(x, y, 100, 100, image);

		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("jelly.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}

	}

	public void paintComponent(Graphics g) {

		g.setColor(Color.BLUE);// blue backround
		g.fillRect(0, 0, 600, 600);

	}

	public void actionPerformed(ActionEvent e) {
		xx.update();

		repaint();
	}
}
