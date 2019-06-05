import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
public static void main(String[] args) {
	WhackAMole wam = new WhackAMole();
	wam.GUI();
}

void GUI() {
	Random rand = new Random();
drawButtons(rand);
fra.add(pan);
	fra.setVisible(true);
	fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fra.setPreferredSize(new Dimension(300, 300));
	
	
fra.pack();
	
}

void drawButtons(Random r) {
for(int i = 24; i>0;i--) {
	JButton but = new JButton();
	pan.add(but);
	
}

	
	
	
	
}

}
