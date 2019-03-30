package extra;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements MouseListener {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	
	
public static void main(String[] args) {
	nastySurprise NS = new nastySurprise();
	NS.GUI();
}
	public void GUI(){
	fra.setVisible(true);
	fra.setSize(500, 200);
	fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.add(pan);
		pan.add(trick);
		trick.setSize(250, 200);
		trick.setText("trick");
		pan.add(treat);
		treat.setSize(250, 200);
		treat.setText("treat");
		fra.pack();
		pan.addMouseListener( this);
		trick.addMouseListener( this);
		treat.addMouseListener( this);
		
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
	
	public nastySurprise() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton clicked= (JButton) e.getSource();
		System.out.println("it happened here");
		if(trick==clicked) {
			 showPictureFromTheInternet("https://i.ytimg.com/vi/Ce7hJ24a8yM/maxresdefault.jpg");
			 System.out.println("it happened here, too");
		}
		if(treat==clicked) {
			 showPictureFromTheInternet("https://www.usnews.com/dims4/USNEWS/8c1e4ac/2147483647/resize/1200x%3E/quality/85/?url=http%3A%2F%2Fcom-usnews-beam-media.s3.amazonaws.com%2F4b%2F30%2Ff6194265469399947efaeffccf2b%2F20190306edloc-a.jpg");
			 System.out.println("it happened here instead");
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
