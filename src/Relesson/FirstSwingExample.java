package Relesson;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {
	public static void main(String[]args) {
		JFrame f=new JFrame("This is For Thandar");
		JButton b=new JButton("click");
		b.setBounds(130,100,100, 40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
