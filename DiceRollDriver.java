/**
* @title DiceRollDriver.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*
*/

import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class DiceRollDriver{
	
	private static void createAndDisplayGUI(){
		JFrame frame = new JFrame("Dice");
		DiceRoll dice = new DiceRoll();
		
		frame.getContentPane().add(dice.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
}