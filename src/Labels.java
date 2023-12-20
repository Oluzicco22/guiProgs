import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("SAKA REAL short.png");
		Border borderImage = BorderFactory.createLineBorder(Color.red);
		
		
		JLabel label = new JLabel(); //creates a label
		label.setText("Saka loves Gunners"); //sets text of label
		label.setIcon(image); //adds an image/icon on label screen
		label.setHorizontalTextPosition(JLabel.CENTER); //sets text LEFT, CENTER, RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.BOTTOM); //sets text TOP. CENTER, BOTTTOM of imageIcon
		label.setForeground(Color.red); //sets font color of text
		label.setFont(new Font("MV Boli",Font.ITALIC,60)); //sets font of text
		label.setIconTextGap(-5); //sets gap of text to image
		label.setBackground(Color.black); //sets background color
		label.setOpaque(true); //display background color
		label.setBorder(borderImage); //adds border to your label
		label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of icon+text within label - (TCB)
		label.setHorizontalAlignment(JLabel.CENTER); //sets horizontal position of icon+text within label - (LCR)
		//label.setBounds(70, 60, 350, 350); //sets x,y positions within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //completely closes your JFrame window
		frame.setSize(500,500);
		//frame.setLayout(null); //prevents label from occupying the whole frame
		frame.setVisible(true);
		frame.add(label); //a screen that can contain icon/image and text
		frame.pack(); //a method that enables a label to auto contain icon+text irrespective of adjustments in code; should always come last

	}

}
