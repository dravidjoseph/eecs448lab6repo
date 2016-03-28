/**
* @title DiceRollDriver.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*
*/

//Predefined Library-just need the frame
import javax.swing.JFrame;

public class DiceRollDriver{
	
	/**
	 * @pre None
	 * @post initialize frame for program to be displayed in
	 * @return void
	 */
	
	
	private static void createAndDisplayGUI(){
		//Declare and initialize the frame
		JFrame frame = new JFrame("Dice");
		
		//ends the program when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//declare instance of Dice program
		DiceRoll dice = new DiceRoll();
		
		//Add to content pane
		frame.getContentPane().add(dice.getContent());
		
		//Display the window, pack everything together
		frame.pack();
		
		//make it visible
		frame.setVisible(true);
	}
	
	
	/**
	 * @pre Working createAndDisplayGUI()
	 * @post Driver
	 * @return void
	 */
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
}