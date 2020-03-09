package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;

import jpopupmenu.MyJPopupMenu;
import myframe.MyFrame;
import popup.PopupPrintListener;


public class Main extends JPanel{
	
	public static MyJPopupMenu popup;
	
	public Main() {
		popup = new MyJPopupMenu();
		addMouseListener(new MousePopupListener());
	}
	
	public static void main(String s[]) {
		MyFrame myFrame = new MyFrame();
	}
	 
	class MousePopupListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			checkPopup(e);
		}
	
		public void mouseClicked(MouseEvent e) {
			checkPopup(e);
		}
	
		public void mouseReleased(MouseEvent e) {
			checkPopup(e);
		}
	
		private void checkPopup(MouseEvent e) {
			if (e.isPopupTrigger()) {
				popup.show(Main.this, e.getX(), e.getY());
			}
		}
	}
	
	 
}
