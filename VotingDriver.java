/**
* @title SafeTempConverterDriver.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*/

import javax.swing.JFrame;

public class VotingDriver{
	
	private static void createAndDisplayGUI(){
		JFrame frame = new JFrame("Voting System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Voting voter = new Voting();
		
		frame.getContentPane().add(converter.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
	
	
	
}