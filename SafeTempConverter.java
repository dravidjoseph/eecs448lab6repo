/**
* @title SafeTempConverter.java
* @author Dravid Joseph
* @brief Contains code to run Dice program
*/

public SafeTempConverter{
	
	//declare instance variables
	private JPanel content;
	
	private JPanel buttonPanel;
	
	private JButton fcButton;
	private JButton fkButton;
	private JButton cfButton;
	private JButton ckButton;
	private JButton kfButton;
	private JButton kcButton;
	
	private JTextField text;
	
	private JLabel label;
	private JLabel result;
	
	public SafeTempConverter{
		
		//Load panels
		content = newJPanel(new GridLayout(0,1));
		buttonPanel = new JPanel(new GridLayout(2,3));
		
		fcButton = new JButton("F to C");
		fkButton = new JButton("F to K");
		cfButton = new JButton("C to F");
		ckButton = new JButton("C to K");
		kfButton = new JButton("K to F");
		kcButton = new JButton("K to C");
		
		text = newJTextField(3);
		
		label = new JLabel("Enter a temperature to convert");
		result = newJLabel("No temperature to convert.");
		
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
	
	
}