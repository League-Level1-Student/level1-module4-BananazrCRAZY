package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame f = new JFrame("Whack a Button for Fame and Glory");
	JPanel p = new JPanel();
	JButton b1 = new JButton("         ");
	JButton b2 = new JButton("         ");
	JButton b3 = new JButton("         ");
	JButton b4 = new JButton("         ");
	JButton b5 = new JButton("         ");
	JButton b6 = new JButton("         ");
	JButton b7 = new JButton("         ");
	JButton b8 = new JButton("         ");
	JButton b9 = new JButton("         ");
	JButton b10 = new JButton("         ");
	JButton b11 = new JButton("         ");
	JButton b12 = new JButton("         ");
	JButton b13 = new JButton("         ");
	JButton b14 = new JButton("         ");
	JButton b15 = new JButton("         ");
	JButton b16 = new JButton("         ");
	JButton b17 = new JButton("         ");
	JButton b18 = new JButton("         ");
	JButton b19 = new JButton("         ");
	JButton b20 = new JButton("         ");
	JButton b21 = new JButton("         ");
	JButton b22 = new JButton("         ");
	JButton b23 = new JButton("         ");
	Random ran = new Random();
	public WhackAMole() {
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		f.setSize(230, 300);
	
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);
		p.add(b21);
		p.add(b22);
		p.add(b23);
		
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
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);

		drawButtons();
	}
	
	public void drawButtons() {
		JButton mole = new JButton("mole!");
		p.add(mole);
		mole.addActionListener(this);
		
		
		switch (ran.nextInt(24-1)) {
		case 1:
			
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
			break;
		case 8:
			System.out.println("8");
			break;
		case 9:
			System.out.println("9");
			break;
		case 10:
			System.out.println("10");
			break;
		case 11:
			System.out.println("11");
			break;
		case 12:
			System.out.println("12");
			break;
		case 13:
			System.out.println("13");
			break;
		case 14:
			System.out.println("14");
			break;
		case 15:
			System.out.println("15");
			break;
		case 16:
			System.out.println("16");
			break;
		case 17:
			System.out.println("17");
			break;
		case 18:
			System.out.println("18");
			break;
		case 19:
			System.out.println("19");
			break;
		case 20:
			System.out.println("20");
			break;
		case 21:
			System.out.println("21");
			break;
		case 22:
			System.out.println("22");
			break;
		case 23:
			System.out.println("23");
			break;
		case 24:
			System.out.println("24");
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f.dispose();
	}
}
