/**
* @title Voting.java
* @author Dravid Joseph
* @brief Contains code to run SafeTempConverter program
*/

//predefined libraries
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;

public class Voting{
	
	//Panel items
	private JPanel content;
	private JPanel names;
	private JPanel buttons;
	
	//Labels
	private JLabel directions;
	private JLabel first;
	private JLabel last;
	private JLabel result;
	
	//Text Fields
	private JTextField firstText;
	private JTextField lastText;
	
	//Buttons
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	
	//Candidates
	private String r1 = "Tonald Drumpf";
	private String r2 = "Ced Truz";
	private String d1 = "Cillary Hlinton";
	private String d2 = "Sernie Banders";
	
	
	/**
	 * @pre None
	 * @post initialize GUI Components, listeners, and adds to panels
	 * @return None
	 */
	public Voting(){
		
		//initialize panel
		content = new JPanel(new GridLayout(0,1));
		names = new JPanel(new GridLayout(2,2));
		buttons = new JPanel(new GridLayout(2,2));
		
		//initialize labels
		directions = new JLabel("Enter your name (first and last), then select a candidate");
		first = new JLabel("First Name: ");
		last = new JLabel("Last Name: ");
		
		//initialize text fields
		firstText = new JTextField(15);
		lastText = new JTextField(15);
		
		
		//initialize buttons with candidate names
		button1 = new JButton(r1);
		button2 = new JButton(r2);
		button3 = new JButton(d1);
		button4 = new JButton(d2);
		
		//initialize result (empty to start)
		result = new JLabel("");
		
		
		//Add action listeners to buttons
		button1.addActionListener(button1Listener());
		button2.addActionListener(button2Listener());
		button3.addActionListener(button3Listener());
		button4.addActionListener(button4Listener());
		
		//add labels and text fields to name panel
		names.add(first);
		names.add(firstText);
		names.add(last);
		names.add(lastText);
		
		//add buttons to button panel
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		
		//add directions label
		content.add(directions);
		
		//add name panel and button panel
		content.add(names);
		content.add(buttons);
		
		//add result label
		content.add(result);
		
	}
	
	/**
	 * @pre None
	 * @post returns voting component for driver to use
	 * @return Component
	 */
	public Component getContent(){
		return content;
	}
	
	/**
	 * @pre None
	 * @post Listens if button 1 (Drumpf) is pressed
	 * @return ActionListener
	 */
	private ActionListener button1Listener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cast(r1);
			}
		};
		return listener;
	}
	/**
	 * @pre None
	 * @post Listens if button 2 (Truz) is pressed
	 * @return ActionListener
	 */
	private ActionListener button2Listener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cast(r2);
			}
		};
		return listener;
	}
	
	/**
	 * @pre None
	 * @post Listens if button 3 (Hlinton) is pressed
	 * @return ActionListener
	 */
	private ActionListener button3Listener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cast(d1);
			}
		};
		return listener;
	}
	
	/**
	 * @pre None
	 * @post Listens if button 4 (Banders) is pressed
	 * @return ActionListener
	 */
	private ActionListener button4Listener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cast(d2);
			}
		};
		return listener;
	}
	
	
	
	
	/**
	 * @pre Valid candidate name
	 * @post Helper method for writing a ballot
	 * @return void
	 */
	private void cast(String candidate){
		
		BufferedWriter output = null;
		
		//Get names from the text fields
		String fName = firstText.getText();
		String lName = lastText.getText();
		
		//Remove any and all whitespace (regex from w3schools)
		fName = fName.replaceAll("\\s","");
		lName = lName.replaceAll("\\s", "");
		
		//If the first name and last name are blank, don't write a ballot
		if(fName.equals("") || lName.equals("")){
			result.setText("Enter both a first name and a last name");
		}
		//otherwise, write a ballot
		else{
			//get the filename formatted
			String fileName = (lName + "_" + fName + "_ballot.txt");
			//Create the file
			File vote = new File(fileName);
			
			//If file already exists
			if(vote.exists()){
				result.setText("Already voted!");
				//Java Files don't need to be closed, so nothing needs to be done
			}
			//Write file
			else{
				try{
					//Initialize the BufferedWriter
					output = new BufferedWriter(new FileWriter(fileName));
					
					//write output and close the file
					output.write(candidate);
					output.close();
					
					//show the result on the applet
					result.setText(fName+" " + lName + " voted for "+candidate + ".");
				}
				//only executes if BufferedWriter doesn't work
				catch(Exception fileException){
					result.setText("Could not write to file");
				}
			}
			
		}
		
		
	}
	
	
}