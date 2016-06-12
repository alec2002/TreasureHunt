import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class sudoku {
	JFrame frame;
	JPanel panel;
	//
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JTextField jt4;
	JTextField jt5;
	JTextField jt6;
	JTextField jt7;
	JTextField jt8;
	JTextField jt9;
	//
	JTextField jt10;
	JTextField jt11;
	JTextField jt12;
	JTextField jt13;
	JTextField jt14;
	JTextField jt15;
	JTextField jt16;
	JTextField jt17;
	JTextField jt18;
	//
	JTextField jt19;
	JTextField jt20;
	JTextField jt21;
	JTextField jt22;
	JTextField jt23;
	JTextField jt24;
	JTextField jt25;
	JTextField jt26;
	JTextField jt27;

	//
	public static void main(String[] args) {
		sudoku X = new sudoku();
	}

	sudoku() {
		frame = new JFrame("SUDOKU");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//
		panel = new JPanel();
		//
		jt1 = new JTextField(2);
		jt2 = new JTextField(2);
		jt3 = new JTextField(2);
		jt4 = new JTextField(2);
		jt5 = new JTextField(2);
		jt6 = new JTextField(2);
		jt7 = new JTextField(2);
		jt8 = new JTextField(2);
		jt9 = new JTextField(2);
		//
		jt10 = new JTextField(2);
		jt11 = new JTextField(2);
		jt12 = new JTextField(2);
		jt13 = new JTextField(2);
		jt14 = new JTextField(2);
		jt15 = new JTextField(2);
		jt16 = new JTextField(2);
		jt17 = new JTextField(2);
		jt18 = new JTextField(2);
		//
		jt19 = new JTextField(2);
		jt20 = new JTextField(2);
		jt21 = new JTextField(2);
		jt22 = new JTextField(2);
		jt23 = new JTextField(2);
		jt24 = new JTextField(2);
		jt25 = new JTextField(2);
		jt26 = new JTextField(2);
		jt27 = new JTextField(2);
		//
		panel.add(jt1);
		panel.add(jt2);
		panel.add(jt3);
		panel.add(jt4);
		panel.add(jt5);
		panel.add(jt6);
		panel.add(jt7);
		panel.add(jt8);
		panel.add(jt9);
		//
		panel.add(jt10);
		panel.add(jt11);
		panel.add(jt12);
		panel.add(jt13);
		panel.add(jt14);
		panel.add(jt15);
		panel.add(jt16);
		panel.add(jt17);
		panel.add(jt18);
		//
		panel.add(jt19);
		panel.add(jt20);
		panel.add(jt21);
		panel.add(jt22);
		panel.add(jt23);
		panel.add(jt24);
		panel.add(jt25);
		panel.add(jt26);
		panel.add(jt27);

		frame.add(panel);
	}
}
