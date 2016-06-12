import javax.swing.JPanel;

public class GameObject extends JPanel {
	int x;
	int y;
	int width;
	int height;

	GameObject(int xxx, int yyy, int width, int height) {
		x = xxx;
		y = yyy;
		this.width = width;
		this.height = height;

	}

}
