package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

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
	int slot1, slot2, slot3;
	
	public SlotMachine() throws MalformedURLException {
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		
		p.add(s1);
		p.add(s2);
		p.add(s3);
		p.add(b);
		
		b.addActionListener(this);
		
		f.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f.dispose();
		try {
			SlotSpin();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		f.setVisible(true);
	}
	
	public void SlotSpin() throws MalformedURLException {
		f.remove(p);
		p = new JPanel();
		for (int i = 0; i < 3; i++) {
			Random ran = new Random();
			int num = ran.nextInt(3);
			
			if (i == 0) {
				if (num == 0) {
					s1 = createLabelImage("Red7.jpg");
					slot1 = 1;
				} else if (num == 1) {
					s1 = createLabelImage("bell.jpg");
					slot1 = 2;
				} else {
					s1 = createLabelImage("cherry.jpg");
					slot1 = 3;
				}
			} else if (i == 1) {
				if (num == 0) {
					s2 = createLabelImage("Red7.jpg");
					slot2 = 1;
				} else if (num == 1) {
					s2 = createLabelImage("bell.jpg");
					slot2 = 2;
				} else {
					s2 = createLabelImage("cherry.jpg");
					slot2 = 3;
				}
			} else {
				if (num == 0) {
					s3 = createLabelImage("Red7.jpg");
					slot3 = 1;
				} else if (num == 1) {
					s3 = createLabelImage("bell.jpg");
					slot3 = 2;
				} else {
					s3 = createLabelImage("cherry.jpg");
					slot3 = 3;
				}
			}
		}
		p.add(s1);
		p.add(s2);
		p.add(s3);
		p.add(b);
		
		f.add(p);
		f.pack();
		
		if (slot1 == slot2 && slot2 == slot3) {
			System.out.println("You Win!");
		}
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
