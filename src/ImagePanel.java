import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImagePanel {
	int width;
	int height;
	int x;
	int y;

	public void paint(Graphics g) {
		g.drawImage(image, x, y, width, height, null);

	}

	BufferedImage image;

	public void setBounds(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	ImagePanel(String file, int w, int h, int x, int y) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		try {

			image = ImageIO.read(this.getClass().getResourceAsStream(file));

		} catch (Exception e) {
			// e.printStackTrace();

		}

	}

	// TODO Auto-generated method stub

}
