package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class makeButtons implements ActionListener {
	JButton punchline = new JButton("Punchline");
	JButton joke = new JButton("Joke");
	makeButtons() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		p.add(joke);
		joke.addActionListener(this);
		p.add(punchline);
		punchline.addActionListener(this);
		
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == joke) {
			
		} else {
			
		}
	}
}
