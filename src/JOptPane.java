import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptPane {

	public static void main(String[] args) {
		
		// JOptionPane =	pop up a standard dialog box that prompts users for a value
		//					or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Are you sure you want to quit?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "BEWARE OF DOGS!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "File Not Found!", "title", JOptionPane.ERROR_MESSAGE);
		
//		int answer = JOptionPane.showConfirmDialog(null, "Zicco, are you a Gooner?", "My title", JOptionPane.YES_NO_CANCEL_OPTION);
		//in the above, YES returns 0, NO returns 1, CANCEL returns 2, closing the window returns -1
		
//		String name = JOptionPane.showInputDialog("What is your name?: ");
		
		String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
		ImageIcon icon = new ImageIcon("happy.png");
		
		JOptionPane.showOptionDialog(null, 
		"You are awesome", "secret msg", 
		JOptionPane.YES_NO_CANCEL_OPTION, 
		JOptionPane.INFORMATION_MESSAGE, 
		icon, 
		responses, 
		0);
		
		
	}

}
