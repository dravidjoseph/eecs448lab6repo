/**
* @title DiceRoll.java
* @author Dravid Joseph
* @brief Contains code for Dice program
*
*/

//Predefined libraries for graphics
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;


public class DiceRoll{
	
	private JPanel content;
	private JButton roll;
	private JLabel label;
	private JLabel result;
	private JTextField text;
	
	
	public DiceRoll(){
		content = new JPanel();
		roll = new JButton("Roll");
		label = new JLabel("How many faces does your die have?");
		result = new JLabel("You rolled a: ");
		
		button.addActionListener(buttonListener());
		
		content.add(label);
		content.add(text);
		content.add(roll);
		content.add(result);
		
		
		
	}

	
	
	
}