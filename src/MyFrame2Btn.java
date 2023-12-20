import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2Btn extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	MyFrame2Btn() {		//this is a constructor for the button
		
//		ImageIcon icon = new ImageIcon("pointing-left.png");
//		button.setHorizontalTextPosition(JButton.CENTER);
//		button.setVerticalTextPosition(JButton.BOTTOM);

		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("shocked.png");

		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		
		button = new JButton();
		button.setBounds(120, 120, 250, 100); //creates size of button
		button.addActionListener(this);
		// button.addActionListener(e -> System.out.println("pooh!!!")); //lambda method (enables button to perform required action)
		button.setText("I'm a button!"); //text to display on button
		button.setFocusable(false); //removes line border arround button text
		button.setIcon(icon); //sets icon on a button
		button.setHorizontalTextPosition(JButton.CENTER); //sets the horizontal position of text on a button
		button.setVerticalTextPosition(JButton.TOP); //sets the vertical position of text on a button
		button.setFont(new Font("Comic Sans",Font.BOLD,24)); //customizes text on a button
		button.setIconTextGap(-1); //sets gap btw text and icon on a button
		button.setForeground(Color.green); //sets text color on button
		button.setBackground(Color.darkGray); //sets background color of button
		button.setBorder(BorderFactory.createEtchedBorder()); //creates a border style for button
		// button.setEnabled(true); //enables or disables button for true and false respectively

			
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("pooh!!!");
//			button.setEnabled(false); //button can only be clicked once in this case, it disables thereafter
			label.setVisible(true);

		}
	}
	
}