import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	JLabel label = new JLabel();
	Border borderImage1 = BorderFactory.createLineBorder(Color.blue);
	Border borderImage2 = BorderFactory.createLineBorder(new Color(0x00A100));
	
	ProgressBarDemo() {
		
		bar.setValue(0); //Set or get the current value of the progress bar. The value is constrained by the minimum and maximum values.
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true); //Set or get whether the progress bar displays a pcent string. By default, the value of the pcent string
		//is the value returned by 'getPercentComplete' formatted as a pcent. You can set the string to be displayed with 'setString'
		bar.setFont(new Font("MV Boli",Font.BOLD,24));
		bar.setForeground(new Color(0x00A100));
		bar.setBackground(Color.black);
		
		label.setText("Downloading...");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli",Font.PLAIN,16));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(borderImage1);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER); 
		label.setBounds(0, 50, 404, 331);

		frame.add(bar);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0; //no definitve value for the counter so the while loop can work perfectly
		
		while(counter<=100) {
			
			bar.setValue(counter); //value of how bar counts has been set to the value which the counter uses below, 1% in this case
			try {
				Thread.sleep(50); //1000 millisecs here means 1sec, so 50 is 0.05sec. The counter will progress every 0.0sec by 1% till it reaches 100% in this case
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //the output
			}
			counter +=1; //this means increase by 1% every 0.05sec in this case
		}
		
		bar.setString("Done! :)");
		label.setText("Download Complete!");
		label.setForeground(new Color(0x00A100));
		label.setFont(new Font("MV Boli",Font.PLAIN,32));
		label.setBorder(borderImage2);

	}
	
}
