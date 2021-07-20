package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	JButton b24 = new JButton("         ");
	Random ran = new Random();
	Point poi = new Point();
	int score, miss;
	Date timeStart = new Date();
	public WhackAMole() {
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		f.setBounds(230, 300, 230, 300);
	
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
		p.add(b24);
		
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
		b24.addActionListener(this);
		
		drawButtons();
	}
	
	public void drawButtons() {
		RestText();
		switch (ran.nextInt(24)+1) {
		case 1:
			b1.setText("mole");
			break;
		case 2:
			b2.setText("mole");
			break;
		case 3:
			b3.setText("mole");
			break;
		case 4:
			b4.setText("mole");
			break;
		case 5:
			b5.setText("mole");
			break;
		case 6:
			b6.setText("mole");
			break;
		case 7:
			b7.setText("mole");
			break;
		case 8:
			b8.setText("mole");
			break;
		case 9:
			b9.setText("mole");
			break;
		case 10:
			b10.setText("mole");
			break;
		case 11:
			b11.setText("mole");
			break;
		case 12:
			b12.setText("mole");
			break;
		case 13:
			b13.setText("mole");
			break;
		case 14:
			b14.setText("mole");
			break;
		case 15:
			b15.setText("mole");
			break;
		case 16:
			b16.setText("mole");
			break;
		case 17:
			b17.setText("mole");
			break;
		case 18:
			b18.setText("mole");
			break;
		case 19:
			b19.setText("mole");
			break;
		case 20:
			b20.setText("mole");
			break;
		case 21:
			b21.setText("mole");
			break;
		case 22:
			b22.setText("mole");
			break;
		case 23:
			b23.setText("mole");
			break;
		case 24:
			b24.setText("mole");
			break;
		}
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (((JButton) e.getSource()).getText().equalsIgnoreCase("mole")) {
			score++;
			System.out.println("Score: " + score);
			if (score == 10) {
				endGame(timeStart, score);
			}
		} else {
			miss++;
			speak("You missed");
			if (miss == 3) {
				System.out.println("GAME OVER");
				speak("GAME OVER");
			}
		}
		
		f.dispose();
		drawButtons();
	}
	
	public void RestText() {
		b1.setText("         ");
		b2.setText("         ");
		b3.setText("         ");
		b4.setText("         ");
		b5.setText("         ");
		b5.setText("         ");
		b6.setText("         ");
		b7.setText("         ");
		b8.setText("         ");
		b9.setText("         ");
		b10.setText("         ");
		b11.setText("         ");
		b12.setText("         ");
		b13.setText("         ");
		b14.setText("         ");
		b15.setText("         ");
		b16.setText("         ");
		b17.setText("         ");
		b18.setText("         ");
		b19.setText("         ");
		b20.setText("         ");
		b21.setText("         ");
		b22.setText("         ");
		b23.setText("         ");
		b24.setText("         ");
		
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
//	private void playSound(String fileName) { 
//		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
//		sound.play();
//	}
}
