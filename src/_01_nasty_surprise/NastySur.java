package _01_nasty_surprise;

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

public class NastySur implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	
	public void NastySur() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.add(p);
		p.add(trick);
		p.add(treat);	
		
		trick.addActionListener(this);
		treat.addActionListener(this);
		
		f.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == treat) {
			showPictureFromTheInternet("https://cdn.mos.cms.futurecdn.net/oafrH5eR2xkEjm55LS9gVM-320-80.jpg");
		} else {
			showPictureFromTheInternet("https://cdn.pixabay.com/photo/2017/10/26/05/15/dog-2890078_1280.jpg");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
}
