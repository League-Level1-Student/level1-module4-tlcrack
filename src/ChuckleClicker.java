import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton but1 = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	public static void main(String[] args) {
		ChuckleClicker CC = new ChuckleClicker();
		CC.makeButtons();
	}
	
	
	void makeButtons(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		frame.add(pan);
		pan.add(but1);
		but1.setText("Joke");
		pan.add(but2);
		but2.setText("Punchline");
		pan.add(but3);
		but3.setText("Punchline 2");
		frame.pack();
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==but1) {
			JOptionPane.showMessageDialog(null, "Why was six afraid of seven?");
		}
		if(buttonPressed==but2) {
			JOptionPane.showMessageDialog(null, "Because seven eight/ate nine. Why did seven eat nine?");
	}
		if(buttonPressed==but3) {
			JOptionPane.showMessageDialog(null, "Beacuse you need three squared meals a day.");
	}
	}
}
