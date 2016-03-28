/**
* @title SafeTempConverter.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*/

//Predefined Libraries
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class SafeTempConverter{

	//declare GUI components
	private JPanel content;
	
	private JPanel buttonPanel;
	
	//Buttons to convert temps
	private JButton fcButton;
	private JButton fkButton;
	private JButton cfButton;
	private JButton ckButton;
	private JButton kfButton;
	private JButton kcButton;
	
	//input temperature from user
	private JTextField text;
	
	//label and result
	private JLabel label;
	private JLabel result;
	
	/**
	 * @pre None
	 * @post initialize GUI components and any listeners.  Add to panel
	 * @return None
	 */
	public SafeTempConverter(){
		
		//Load panels
		content = new JPanel(new GridLayout(0,1));
		buttonPanel = new JPanel(new GridLayout(2,3));
		
		//Buttons
		fcButton = new JButton("F to C");
		fkButton = new JButton("F to K");
		cfButton = new JButton("C to F");
		ckButton = new JButton("C to K");
		kfButton = new JButton("K to F");
		kcButton = new JButton("K to C");
		
		//text field
		text = new JTextField(3);
		
		//Labels
		label = new JLabel("Enter a temperature to convert");
		result = new JLabel("No temperature to convert.");

		//load listeners for each button
		fcButton.addActionListener(fcButtonListener());
		fkButton.addActionListener(fkButtonListener());
		cfButton.addActionListener(cfButtonListener());
		ckButton.addActionListener(ckButtonListener());
		kfButton.addActionListener(kfButtonListener());
		kcButton.addActionListener(kcButtonListener());


		//load button panel
		buttonPanel.add(fcButton);
		buttonPanel.add(fkButton);
		buttonPanel.add(cfButton);
		buttonPanel.add(ckButton);
		buttonPanel.add(kfButton);
		buttonPanel.add(kcButton);
		
		//load content
		content.add(label);
		content.add(text);
		content.add(buttonPanel);
		content.add(result);
	}
	
	/**
	 * @pre None
	 * @post Panel containing components
	 * @return Component
	 */
	public Component getContent(){
		return content;
	}

	
	/**
	 * @pre None
	 * @post listens for button presses.  When button is pressed, Convert temp from F to C.
	 * @return ActionListener
	 */
	private ActionListener fcButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double fTemp = Double.parseDouble(input);
					double cTemp = (fTemp - 32) * (5.0/9.0);
					String newText = "Temp in C: " + String.format("%.2f",cTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}
		};
		return listener;
		
	}
	/**
	 * @pre None
	 * @post listens for button presses.  When button is pressed, .
	 * @return ActionListener
	 */
	private ActionListener fkButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double fTemp = Double.parseDouble(input);
					double kTemp = ((fTemp - 32) * (5.0/9.0))+273.15;
					String newText = "Temp in K: " + String.format("%.2f",kTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}
		};
		return listener;
	}
	private ActionListener cfButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double cTemp = Double.parseDouble(input);
					double fTemp = (cTemp * (9.0/5.0))+32;
					String newText = "Temp in F: " + String.format("%.2f",fTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}

		};
		return listener;
	}
	private ActionListener ckButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double cTemp = Double.parseDouble(input);
					double kTemp = cTemp+273.15;
					String newText = "Temp in K: " + String.format("%.2f",kTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}

		};
		return listener;
	}
	private ActionListener kfButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double kTemp = Double.parseDouble(input);
					double fTemp = (kTemp-273.15)*(9.0/5.0) + 32;
					String newText = "Temp in F: " + String.format("%.2f",fTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}

		};
		return listener;
	}
	private ActionListener kcButtonListener(){
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = text.getText();
				try{
					double kTemp = Double.parseDouble(input);
					double cTemp = kTemp-273.15;
					String newText = "Temp in C: " + String.format("%.2f",cTemp);
					
					result.setText(newText);
					System.out.println(newText);
				}
				catch(NumberFormatException num){
					result.setText("Invalid input");
				}
				
				
			}

		};
		return listener;
	}
	
}