/**
* @title SafeTempConverterDriver.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*/

import javax.swing.JFrame;

public class SafeTempConverterDriver{
	
	private static void createAndDisplayGUI(){
		JFrame frame = new JFrame("Safe Temperature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SafeTempConverter converter = new SafeTempConverter();
		
		frame.getContentPane().add(converter.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndDisplayGUI();
	}
	
	
	
	
}