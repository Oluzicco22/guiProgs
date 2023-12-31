import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame9ColorChooser extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	MyFrame9ColorChooser() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text :D");
		label.setFont(new Font("Montserrat",Font.PLAIN,80));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser(); //creates a palette of colors for user to choose
			
			Color mycolor = JColorChooser.showDialog(null, "Pick your preferred color", Color.black);
			
//			label.setForeground(mycolor);
			label.setBackground(mycolor);
		}
	}

}
