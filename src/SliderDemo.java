import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo() {
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); //sets slider at minimum of 0, max of 100 and starting point of 50
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true); //sets(void) or gets(bool) whether tick marks are painted on the slider
		slider.setMinorTickSpacing(10); //sets(void) or gets(int) the range between minor ticks [shorter]
		
		slider.setPaintTrack(true); //sets or gets(booleans) whether or not to paint the slider track
		slider.setMajorTickSpacing(25); //sets(void) or gets(int) the range between major ticks [longer]
		
		slider.setPaintLabels(true); //sets(void) or gets(bool) whether labels are painted on the slider.
		slider.setFont(new Font("MV Boli",Font.PLAIN,16));
		
		//slider.setOrientation(SwingConstants.HORIZONTAL); //the default orientation is horizontal
		slider.setOrientation(SwingConstants.VERTICAL); //sets orientation from horizontal to vertical
		
		label.setText("°C = "+ slider.getValue()); //the getValue attribute gets the value at which the slider is set, 50 in this case.
		label.setFont(new Font("MV Boli",Font.PLAIN,24));
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) { //this line of code is used for a program with changing or varying values
		
		label.setText("°C = "+ slider.getValue()); //changes the value of the result as the slider is being adjusted
	}
	
}