/**
* @title SafeTempConverterDriver.java
* @author Dravid Joseph
* @brief Contains code to run SafeTempConverter program
*/

//predefined library-just need the frame
import javax.swing.JFrame;

public class VotingDriver{
	
	/**
	 * @pre None
	 * @post initialize frame for program to be displayed in
	 * @return void
	 */
	
	private static void createAndDisplayGUI(){
		
		//Declare and initialize frame
		JFrame frame = new JFrame("Voting System");
		//Close program when close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Declare voting instance
		Voting voter = new Voting();
		
		//Add content to the pane
		frame.getContentPane().add(voter.getContent());
		
		//pack components into the frame
		frame.pack();
		//make the components visible
		frame.setVisible(true);
	}
	
	/**
	 * @pre Working createAndDisplayGUI()
	 * @post Driver
	 * @return void
	 */
	
	public static void main(String[] args){
		//method does heavy lifting of display
		createAndDisplayGUI();
	}
	
	
	
	
}