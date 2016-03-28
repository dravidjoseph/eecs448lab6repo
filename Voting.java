/**
* @title SafeTempConverterDriver.java
* @author Dravid Joseph
* @brief Contains code to run SafeTempConverter program
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;

public class Voting{
	
	private JPanel content;
	private JPanel names;
	private JPanel buttons;
	
	private JLabel directions;
	private JLabel first;
	private JLabel last;
	private JLabel result;
	
	private JTextField firstText;
	private JTextField lastText;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	private String r1 = "Tonald Drumpf";
	private String r2 = "Ced Truz";
	private String d1 = "Cillary Hlinton";
	private String d2 = "Sernie Banders";
	
	public Voting(){
		content = new JPanel(new GridLayout(0,1));
		names = new JPanel(new GridLayout(2,2));
		buttons = new JPanel(new GridLayout(2,2));
		
		directions = new JLabel("Enter your name (first and last), then select a candidate");
		first = new JLabel("First Name: ");
		last = new JLabel("Last Name: ");
		firstText = new JTextField(15);
		lastText = new JTextField(15);
		
		button1 = new JButton(r1);
		button2 = new JButton(r2);
		button3 = new JButton(d1);
		button4 = new JButton(d2);
		
		result = new JLabel("");
		
		button1.addActionListener(fcButtonListener());
		button2.addActionListener(fkButtonListener());
		button3.addActionListener(cfButtonListener());
		button4.addActionListener(ckButtonListener());
		
		names.add(first);
		names.add(firstText);
		names.add(last);
		names.add(lastText);
		
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		
		content.add(directions);
		content.add(names);
		content.add(buttons);
		content.add(result);
		
	}
	public Component getContent(){
		return content;
	}
	
	
	
	
	
	
	
}