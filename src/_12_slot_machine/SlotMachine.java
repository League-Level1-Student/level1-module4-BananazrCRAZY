package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel s1 = new JLabel();
	JLabel s2 = new JLabel();
	JLabel s3 = new JLabel();
	JButton b = new JButton("Spin");
	JLabel win = new JLabel();
	public SlotMachine() {
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		
		p.add(s1);
		p.add(s2);
		p.add(s3);
		p.add(b);
		
		b.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}