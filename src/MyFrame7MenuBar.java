import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame7MenuBar extends JFrame implements ActionListener {

	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame7MenuBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");

		menuBar = new JMenuBar(); //creates a menubar
		
		fileMenu = new JMenu("File"); //creates menus; a file menu in this case
		editMenu = new JMenu("Edit"); ///////////////; an edit menu in this case
		helpMenu = new JMenu("Help"); ///////////////; a help menu in this case
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");

		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file -->> Mnemonics are like shortcuts, this will navigate to file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit -->> this will navigate to edit 
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help -->> this will navigate to help
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load -->> Mnemonics are like shortcuts. Press L, and your file will load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save -->> Press S, and your file will save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit -->> Press E, and your fileMenu will close

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*boop beep* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}

}
