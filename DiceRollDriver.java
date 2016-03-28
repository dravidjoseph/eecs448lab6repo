/**
* @title DiceRollDriver.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*
*/

import javax.swing.JFrame;

public class DiceRollDriver{
	
	private static void createAndDisplayGUI(){
		JFrame frame = new JFrame("Dice");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DiceRoll dice = new DiceRoll();
		
		frame.getContentPane().add(dice.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
}