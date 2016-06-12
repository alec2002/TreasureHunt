
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class backroundImage extends JPanel {
	BufferedImage image;

	backroundImage(String file) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(file));
		} catch (IOException e) {

			e.printStackTrace();
		}
		repaint();
	}

	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, 400, 400, null);
	}
}
