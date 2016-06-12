import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow {
	JFrame frame;
	JPanel panel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

	public static void main(String[] args) {
		GameWindow ggg = new GameWindow();
	}

	GameWindow() {
		GamePanel con = new GamePanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel = new GamePanel();
		frame.add(panel);
	}
}
