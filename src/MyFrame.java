import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
		
		this.setTitle("Arsenal Players list"); //sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of appliocation
		this.setResizable(false); //prevent this from being resized
		this.setSize(420,420); //sets the x-dimension and y-dimension of this
		this.setVisible(true); //make this visible
		
		ImageIcon image = new ImageIcon("Arsenal_logo.png"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of this
		this.getContentPane().setBackground(new Color(0x123456)); //change color of background... RGB is (0,0,0), normal form is (color.blue/red,etc)
		
	}
}
