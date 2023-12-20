import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame5RadBtns extends JFrame implements ActionListener {
	
	JRadioButton pizzaBtn;
	JRadioButton hamburgerBtn;
	JRadioButton hotdogBtn;
	
	ImageIcon pizzaIcon;
	ImageIcon hamIcon;
	ImageIcon hotdogIcon;
	
	MyFrame5RadBtns() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamIcon = new ImageIcon("hamburger.png");
		hotdogIcon = new ImageIcon("hot-dog.png");
		
		pizzaBtn = new JRadioButton("pizza"); //creates a radio button option
		hamburgerBtn = new JRadioButton("hamburger");
		hotdogBtn = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup(); //allows you to choose just one radio button option at a time
		group.add(pizzaBtn);
		group.add(hamburgerBtn);
		group.add(hotdogBtn);
		
		pizzaBtn.addActionListener(this);
		hamburgerBtn.addActionListener(this);
		hotdogBtn.addActionListener(this);
		
		pizzaBtn.setFocusable(false);
		pizzaBtn.setFont(new Font("Consolas",Font.PLAIN,16));
		pizzaBtn.setIcon(pizzaIcon);
		
		hamburgerBtn.setFocusable(false);
		hamburgerBtn.setFont(new Font("Consolas",Font.PLAIN,16));
		hamburgerBtn.setIcon(hamIcon);
		
		hotdogBtn.setFocusable(false);
		hotdogBtn.setFont(new Font("Consolas",Font.PLAIN,16));
		hotdogBtn.setIcon(hotdogIcon);
		
		this.add(pizzaBtn);
		this.add(hamburgerBtn);
		this.add(hotdogBtn);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaBtn) {
			System.out.println("You ordered a pizza!");
		}
		else if(e.getSource()==hamburgerBtn) {
			System.out.println("You ordered a hamburger!");
		}
		else if(e.getSource()==hotdogBtn) {
			System.out.println("You ordered hotdog!");
		}
	}

}
