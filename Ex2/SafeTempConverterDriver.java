/**
* @title SafeTempConverterDriver.java
* @author Dravid Joseph
* @brief Contains code to run SafeTempConverter program
*/

import javax.swing.JFrame;

public class SafeTempConverterDriver{
	
	/**
	 * @pre None
	 * @post initialize frame for program to be displayed in
	 * @return void
	 */
	
	
	private static void createAndDisplayGUI(){
		
		//Declare and initialize the frame
		JFrame frame = new JFrame("Safe Temperature Converter");
		
		//ends the program when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//declare instance of Dice program
		SafeTempConverter converter = new SafeTempConverter();
		
		//Add content to pane
		frame.getContentPane().add(converter.getContent());
		
		//Pack contents in frame
		frame.pack();
		
		//set result visible
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
	
	
	
}