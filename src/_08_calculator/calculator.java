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
	JFrame frame = new JFrame("Simple Caluculator");
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Sub");
	JButton mult = new JButton("Mult");
	JButton div = new JButton("Div");
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JLabel ans = new JLabel("ANSWER");
	int n1int, n2int, ansInt;
	
	public void calculator() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		panel.add(ans);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			conToInt();
			ansInt = n1int + n2int;
			conToString();
		} else if (e.getSource() == sub) {
			conToInt();
			ansInt = n1int - n2int;
			conToString();
		} else if (e.getSource() == mult) {
			conToInt();
			ansInt = n1int * n2int;
			conToString();
		} else if (e.getSource() == div) {
			conToInt();
			ansInt = n1int / n2int;
			conToString();
		}
	}
	
	public void conToInt() {
		String n1  = num1.getText();
		String n2 = num2.getText();
		n1int = Integer.parseInt(n1);
		n2int = Integer.parseInt(n2);
	}
	
	public void conToString() {
		String s = ansInt + "";
		ans.setText(s);
	}
}
