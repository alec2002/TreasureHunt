import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class jellyfish {
	long startTime;
	int width;
	int height;
	int x;
	int y;
	BufferedImage i;
	int jelx = 1;
	int jely = 1;
	Random r = new Random();

	jellyfish(int x, int y, int width, int height, BufferedImage i) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.i = i;
		startTime = System.currentTimeMillis();
	}

	//
	public void dir() {
		x += jelx;
		y += jely;

	}

	public void left() {

		if (x <= 0) {
			jelx = r.nextInt(18);
		}
	}

	public void right() {
		// -
		if (x >= 520) {
			jelx = -r.nextInt(18);
		}
	}

	public void down() {

		if (y >= 520) {
			jely = -r.nextInt(18);
		}

	}

	public void up() {
		// -
		if (y <= 0) {
			jely = r.nextInt(18);
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void update() {
		dir();
		left();
		right();
		down();
		up();
		if (System.currentTimeMillis() - startTime >= 60000) {
			jelx = 100;
			jely = 100;
			startTime = System.currentTimeMillis();
		}
	}

	public void draw(Graphics g) {
		g.drawImage(i, x, y, width, height, null);
	}
}
