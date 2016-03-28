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
import java.awt.GridLayout;
import java.util.Random;


public class DiceRoll{
	
	
	//Declare all GUI components
	private JPanel content;
	private JButton roll;
	private JLabel label;
	private JLabel result;
	private JTextField text;
	
	/**
	 * @pre None
	 * @post initialize GUI components and any listeners.  Add to panel
	 * @return None
	 */
	
	public DiceRoll(){
		
		//Initialization of all GUI Components
		content = new JPanel(new GridLayout(0,1));
		roll = new JButton("Roll");
		text = new JTextField(3);
		label = new JLabel("How many faces does your die have?");
		result = new JLabel("Your die doesn't exist yet");
		
		//Add listener to the Roll button
		roll.addActionListener(buttonListener());
		
		//Add GUI components to the panel
		content.add(label);
		content.add(text);
		content.add(roll);
		content.add(result);
	}
	
	/**
	 * @pre None
	 * @post Panel containing DiceRoll components
	 * @return Component
	 */
	public Component getContent(){
		return content;
	}
	
	/**
	 * @pre None
	 * @post listens for button presses.  When button is pressed, roll.
	 * @return ActionListener
	 */
	private ActionListener buttonListener(){
		//Declare listener
		ActionListener listener = new ActionListener(){
			//Declare actionPerformed method
			public void actionPerformed(ActionEvent e){
				//Store text from user locally
				String input = text.getText();
				
				//Parses string and returns value of die
				try{
					//throws exception if parseInt cannot return an int
					int sides = Integer.parseInt(input);
					//random instance declared and initialized
					Random myRand = new Random();
					
					//store value between 1 and sides, inclusive
					int randomInt = 1 + myRand.nextInt(sides);
					String rolled = "Your number is: "+ randomInt;
					
					//change text to display the rolled number
					result.setText(rolled);
				}
				catch(NumberFormatException number){
					result.setText("Enter a valid integer");
				}
				
				
			}
		};
		
		return listener;
	}
	

	
	
	
}