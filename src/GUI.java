import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {
		
		// JFrame - a GUI window to add components to
		
		/*
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Arsenal Players list"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of appliocation
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420,420); //sets the x-dimension and y-dimension of frame
		frame.setVisible(true); //make frame visible
		
		ImageIcon image = new ImageIcon("Arsenal_logo.png"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frame
		frame.getContentPane().setBackground(new Color(0x123456)); //change color of background... RGB is (0,0,0), normal form is (Color.blue/red,etc)
		*/

		MyFrame myFrame = new MyFrame(); //ordinary 'new MyFrame' works too
	}

}
