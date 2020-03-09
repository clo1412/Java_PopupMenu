package myframe;

import javax.swing.JFrame;

import main.Main;

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("PopupMenuExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(new Main());
	    this.setSize(300, 300);
	    this.setVisible(true);
	}
}
