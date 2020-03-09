package jpopupmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;

import popup.PopupPrintListener;

public class MyJPopupMenu extends JPopupMenu{
	
	private static final int POSITION = JMenuItem.RIGHT;
	ActionListener menuListener = null;
	JMenuItem item = null;

	public MyJPopupMenu() {
		CreateMenuListener();
		
		SetMenuItem("Left","1.gif");
		SetMenuItem("Center","2.gif");
		SetMenuItem("Right","3.gif");
		SetMenuItem("Full","4.gif");
		
		this.addSeparator();
		
		SetSettings();
		
		this.setLabel("Justification");
		
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
		this.addPopupMenuListener(new PopupPrintListener()); 
	}

	private void SetSettings() {
		JMenuItem item;
		this.add(item = new JMenuItem("Settings . . ."));
		item.addActionListener(menuListener);
	}

	private void SetMenuItem(String a, String b) {
		JMenuItem item;
		this.add(item = new JMenuItem(a, new ImageIcon(b)));
		item.setHorizontalTextPosition(POSITION);
		item.addActionListener(menuListener);
	}

	private void CreateMenuListener() {
		menuListener = new ActionListener() {
		  public void actionPerformed(ActionEvent event) {
		    System.out.println("Popup menu item ["
		    + event.getActionCommand() + "] was pressed.");
		  }
		};
	}
}
