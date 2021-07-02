package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JFrame f = new JFrame("Simple Caluculator");
	JPanel p = new JPanel();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Sub");
	JButton mult = new JButton("Mult");
	JButton div = new JButton("Div");
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JLabel ans = new JLabel();
	
	public void calculator() {
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		p.add(num1);
		p.add(num2);
		p.add(add);
		p.add(sub);
		p.add(mult);
		p.add(div);
		p.add(ans);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {

		} else if (e.getSource() == sub) {

		} else if (e.getSource() == mult) {

		} else if (e.getSource() == div) {
			
		}
	}

/*
	int conToInt(JTextField JText) {
		String n = JText.getText();
		int num = Integer.parseInt(n);
		return num;
	}
	
	String conToString(int ansI) {
		String ansS = Integer.toString(ansI);
		return ansS;
	}
*/
}
