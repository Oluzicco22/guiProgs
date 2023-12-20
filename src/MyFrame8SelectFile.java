import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame8SelectFile extends JFrame implements ActionListener {
	
	JButton button;
	
	MyFrame8SelectFile() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
				
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser(); //enables one to choose a file
			
			fileChooser.setCurrentDirectory(new File(".")); //creates a default directory to save or open a file
			
//			int response = fileChooser.showOpenDialog(null); //select file to open
			int response = fileChooser.showSaveDialog(null); //select file to save

			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //this prints out the exact location of file 
				System.out.println(file);
			}
			
		}
		
	}

}
