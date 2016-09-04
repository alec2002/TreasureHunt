import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//http://stackoverflow.com/questions/1242581/display-a-jpg-image-on-a-jpanel

public class TitleScreen extends JPanel implements ActionListener {
	private String name = "Surf Or Die";
	private Container c;
	private JFrame menuscreen;
	private JButton startbutton;
	private JButton instructions;
	public static boolean running = false;

	public TitleScreen() {
		//
		menuscreen = new JFrame("Title Screen");
		startbutton = new JButton("START");
		startbutton.setPreferredSize(new Dimension(100, 100));
		startbutton.setBounds(50, 110, 100, 100);
		startbutton.addActionListener(this);
		instructions = new JButton("instructions");
		instructions.setPreferredSize(new Dimension(100, 100));
		instructions.setBounds(250, 110, 100, 100);
		instructions.addActionListener(this);
		menuscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = menuscreen.getContentPane();

		this.setLayout(null);
		this.add(startbutton);
		this.add(instructions);
		c.add(this);
		this.setPreferredSize(new Dimension(400, 400));

		menuscreen.pack();
		menuscreen.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		g.setFont(new Font(name, 10, 18));
		g.setColor(Color.RED);
		g.drawString(name, 120, 20);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == startbutton) {
			this.menuscreen.dispose();
			running = true;

		}
		if (arg0.getSource() == instructions) {
			JOptionPane
					.showMessageDialog(
							null,
							"Move the surfer using your mouse to dodge the jellyfish and the mine, when the mine starts to flash, it will spawn in a new location. press the spacebar to splash. Survive 2 rounds to win!!!!!");
		}

	}

	public static void main(String[] args) {
		TitleScreen x = new TitleScreen();
		while (!x.running) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		UnlockChest xs = new UnlockChest();

	}

	void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
