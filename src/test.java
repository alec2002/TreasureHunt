import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {
	JFrame frame;
	JPanel panel;
	JLabel image;
	Icon icon;

	public static void main(String[] args) {
		test x = new test();
	}

	test() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		panel = new JPanel();
		icon = new ImageIcon("/Users/alec/Desktop/Unknown-1.jpeg");
		image = new JLabel(icon);
		frame.add(image);

		frame.pack();
	}
}
