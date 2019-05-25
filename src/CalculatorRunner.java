import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton("add");
JButton subtract = new JButton("sub");
JButton multiply = new JButton("mul");
JButton divide = new JButton("div");
JTextField field1 = new JTextField();
JTextField field2 = new JTextField();
JLabel label = new JLabel();
Calculator cal = new Calculator();
	public static void main(String[] args) {
		
		
		
		
		
		
		CalculatorRunner CR = new CalculatorRunner();
		CR.GUI();
	}
	
	
	void GUI() {
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);

		field1.setPreferredSize(new Dimension(160, 20));
		field2.setPreferredSize(new Dimension(160, 20));
		frame.setPreferredSize(new Dimension(360, 360));
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		
		
		frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String num1 = field1.getText();
		int n1 = Integer.parseInt(num1);
		String num2 = field2.getText();
		int n2 = Integer.parseInt(num2);
		
		if(e.getSource().equals(add)) {
			label.setText(cal.add(n1, n2)+ "");
		}
		if(e.getSource().equals(subtract)) {
			label.setText(cal.subtract(n1, n2)+ "");
		}
		if(e.getSource().equals(multiply)) {
			label.setText(cal.multiply(n1, n2)+ "");
		}
		if(e.getSource().equals(divide)) {
			label.setText(cal.divide(n1, n2)+ "");
		}
		
		
	}
}
