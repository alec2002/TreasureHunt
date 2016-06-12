import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Restart implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton cancel;
	JButton restar;

	public static void main(String[] args) {
		Restart x = new Restart();
	}

	Restart() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		panel = new JPanel();
		cancel = new JButton("Cancel");
		restar = new JButton("Restart");
		panel.add(cancel);
		panel.add(restar);
		frame.add(panel);
		restar.addActionListener(this);
		cancel.addActionListener(this);
	}

	public void res() {
		PhotoBook pb = new PhotoBook();
		gameaddon ga = new gameaddon();
		UnlockChest uc = new UnlockChest();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cancel) {
			System.exit(0);
		}
		if (arg0.getSource() == restar) {
			res();
		}

	}
}
