package test.mypac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame() {
		setLayout(null);
		JButton btn=new JButton("눌러보셈");
		btn.setBounds(50, 50, 100, 40);
		add(btn);
		
	}
}
