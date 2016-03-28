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
	
	public Component getContent(){
		return content;
	}
	
	private Actionlistener buttonListener(){
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String input = text.getText();
				
				try{
					int sides = Integer.parseInt(input);
				}
				
				Random myRand = new Random();
				int randomInt = 1 + myRand.nextInt(sides);
				String rolled = "Your number is: "+ randomInt;
				result.setText(rolled);
				catch(NumberFormatException e){
					result.setText("Enter a valid integer");
				}
				
				
			}
		};
		
		return listener;
	}
	

	
	
	
}