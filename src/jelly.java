import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class jelly extends JPanel implements ActionListener {
	Timer t = new Timer(5, this);
	double x = 0, y = 0, velX = 2, velY = 2;
jelly(int x, int y, int width, int height, BufferedImage){
	
}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
		g2.fill(circle);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		// every 5 mils repaint
		// x = x plus velocity x
		if (x < 0 || x > 560) {
			velX = -velX;
		}
		if (y < 0 || y > 360) {
			velY = -velY;
		}
		x += velX;
		y += velY;
		repaint();
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

}
