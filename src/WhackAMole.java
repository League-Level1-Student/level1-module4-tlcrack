import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class WhackAMole implements ActionListener {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton butM;
	int score = 0;
	Date start;

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.GUI();
	}

	void GUI() {
		Random rand = new Random();
		drawButtons(rand);

		start = new Date();
		fra.add(pan);
		fra.setVisible(true);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setPreferredSize(new Dimension(300, 300));

		fra.pack();

	}

	void drawButtons(Random r) {
		pan.removeAll();
		int ra = r.nextInt(24);
		for (int i = 23; i > -1; i--) {
			JButton but = new JButton();
			pan.add(but);
			but.addActionListener(this);
			if (i == ra) {
				but.setText("mole!");
				butM=but;
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()!=butM) {
			speak("WRONG!!!");
		}
		
		else {
			score +=1;
		}
		Random rand = new Random();
		drawButtons(rand);
		
		if(score>9) {
			endGame(start, score);
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            +( molesWhacked * 1000.00 / (timeAtEnd.getTime() - timeAtStart.getTime()))
	                  + " moles per second.");
	}
	
	
	
	
}