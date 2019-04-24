import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel lab = new JLabel();
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.GUI();

	}

	void GUI() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 150);
		frame.setTitle("Type or Die");
		
		frame.add(lab);

		currentLetter = generateRandomLetter();
		lab.setText("" + currentLetter);

		lab.setFont(lab.getFont().deriveFont(28.0f));
		lab.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(	("you typed " + currentLetter));
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
