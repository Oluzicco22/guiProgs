import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLO {

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// Grid Layout = places components in a grid of cells.
		//				 Each components takes all the available space within the cell,
		//				 and each cell is the same size.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10)); //sets GridLayout and the first two values reps number of rows and columns, while
											  //the second two values reps the horizontal and vertical spacing
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));


		frame.setVisible(true);

	}

	
}
