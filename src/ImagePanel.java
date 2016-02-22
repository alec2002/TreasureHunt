import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	int width;
	int height;

	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, width, height, null);
	}

	BufferedImage image;

	ImagePanel(String file, int w, int h) {
		try {
			width = w;
			height = h;
			image = ImageIO.read(this.getClass().getResourceAsStream(file));

		} catch (Exception e) {
			// e.printStackTrace();

		}

	}
}
