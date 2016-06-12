import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject {
	BufferedImage image;

	public ImageObject(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height);
		this.image = image;
	}

	public void draw(Graphics g) {

		g.drawImage(image, x, y, 100, 100, null);
	}

}
