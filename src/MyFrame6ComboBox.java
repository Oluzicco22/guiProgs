import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame6ComboBox extends JFrame implements ActionListener {
	
	JComboBox comboBox;
	
	MyFrame6ComboBox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"bird", "cat", "dog"};
		
		comboBox = new JComboBox(animals); //creates an editable dropdown menu of options
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("fish", 0);
		//comboBox.setSelectedIndex(0);
		//comboBox.removeItem("cat");
		//comboBox.removeItemAt(1);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); //returns the item in the list/array
//			System.out.println(comboBox.getSelectedIndex()); //returns 0 for first item in the index, 1 and 2 for the 2nd and 3rd repsectively	
		}
		
	}

}
