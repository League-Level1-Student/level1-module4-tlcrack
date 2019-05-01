import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel lab = new JLabel();
	JPanel pan = new JPanel();
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.GUI();

	}

	void GUI() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 150);
		frame.setTitle("Type or Die");
		
		pan.add(lab);

		currentLetter = generateRandomLetter();
		lab.setText("" + currentLetter);

		lab.setFont(lab.getFont().deriveFont(28.0f));
		lab.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		
		frame.add(pan);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(	("you typed " + e.getKeyChar()));
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct!");
			pan.setBackground(new Color(119, 255, 85));
		}
		else {
			pan.setBackground(new Color(255, 51, 0));
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method st
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		lab.setText("" + currentLetter);

		lab.setFont(lab.getFont().deriveFont(28.0f));
		lab.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		
	}

}
