import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton but = new JButton();
	JLabel f1;
	JLabel f2;
	JLabel f3;
	boolean youWin = false;
	int money = 0;
public static void main(String[] args) throws MalformedURLException {
	SlotMachine SL = new SlotMachine();
	SL.GUI();
	
}
void GUI() throws MalformedURLException {
	fra.setVisible(true);
	fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fra.setPreferredSize(new Dimension(1000, 500));
	fra.add(pan);
	
	
	but.setText("spin to win!(But probably lose. Your odds are one in nine.)");

	tooLong();

	but.addActionListener(this);
	
	fra.pack();
}

void tooLong() throws MalformedURLException {
	Random rand = new Random();
	int r = rand.nextInt(3);
	int $ = rand.nextInt(3);
	int yeet = rand.nextInt(3);
	if(r==0) {
		f1 = createLabelImage("Fox.png");
	}
	if(r==1) {
		f1 = createLabelImage("Fox2.png");
	}
	if(r==2) {
		f1 = createLabelImage("Fox3.png");
	}
	
	if($==0) {
		f2 = createLabelImage("Fox.png");
	}
	if($==1) {
		f2 = createLabelImage("Fox2.png");
	}
	if($==2) {
		f2 = createLabelImage("Fox3.png");
	}
	
	if(yeet==0) {
		f3 = createLabelImage("Fox.png");
	}
	if(yeet==1) {
		f3 = createLabelImage("Fox2.png");
	}
	if(yeet==2) {
		f3 = createLabelImage("Fox3.png");
		if(r==$&&r==yeet) {
			youWin=true;
		}
	}

	pan.add(f1);
	pan.add(f2);
	pan.add(f3);
	pan.add(but);
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	pan.remove(f1);
	pan.remove(f2);
	pan.remove(f3);
	pan.remove(but);
	try {
		tooLong();
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
money +=1;

JOptionPane.showMessageDialog(null, "That'll be $" + money);

fra.pack();
if(youWin) {
	JOptionPane.showMessageDialog(null, "You won! Now pay up.");
}
}


}
