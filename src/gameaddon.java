import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class gameaddon implements ActionListener {
	int x = 5;
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;

	public static void main(String[] args) {
		gameaddon x = new gameaddon();
	}

	gameaddon() {

		frame = new JFrame("LIVES - 5 -");
		frame.setVisible(true);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel = new JPanel();
		b1 = new JButton("U");
		b2 = new JButton("A");
		b3 = new JButton("N");
		b4 = new JButton("D");
		b5 = new JButton("H");
		b6 = new JButton("B");
		b7 = new JButton("L");
		b8 = new JButton("E");
		b9 = new JButton("O");
		b10 = new JButton("T");
		b11 = new JButton("R");
		b12 = new JButton("C");
		b13 = new JButton("W");
		b14 = new JButton("P");
		b15 = new JButton("K");

		//
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);

		frame.setSize(400, 400);
		//
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		//

	}

	//

	public void actionPerformed(ActionEvent e) {
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "YOU LOSE");
			System.exit(0);
		}

		if (e.getSource() == b1) {
			b1.setBackground(Color.BLACK);
			b1.setOpaque(true);
		}
		if (e.getSource() == b2) {

			frame.setTitle("Lives - " + --x + " -");
		}

		if (e.getSource() == b3) {
			b3.setBackground(Color.BLACK);
			b3.setOpaque(true);
		}
		if (e.getSource() == b4) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b5) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b6) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b7) {
			b7.setBackground(Color.BLACK);
			b7.setOpaque(true);
		}
		if (e.getSource() == b8) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b9) {
			b9.setBackground(Color.BLACK);
			b9.setOpaque(true);
		}
		if (e.getSource() == b10) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b11) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b12) {
			b12.setBackground(Color.BLACK);
			b12.setOpaque(true);
		}
		if (e.getSource() == b13) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b14) {

			frame.setTitle("Lives - " + --x + " -");
		}
		if (e.getSource() == b15) {
			b15.setBackground(Color.BLACK);
			b15.setOpaque(true);
		}
		if (b1.getBackground() == Color.BLACK && b3.getBackground() == Color.BLACK && b7.getBackground() == Color.BLACK
				&& b9.getBackground() == Color.BLACK && b12.getBackground() == Color.BLACK
				&& b15.getBackground() == Color.BLACK) {
			JOptionPane.showMessageDialog(null,
					"You may have figured out the code for my chest, but goodluck completing my maze, HAHAHAHA!!!!");
		}

	}

}