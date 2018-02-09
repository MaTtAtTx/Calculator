package calculator.controller;

import calculator.view.Frame;
import javax.swing.JOptionPane;


public class Controller
{
	private Frame appFrame;
	
	public void start()
	{
		appFrame = new Frame(this);
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only integer values are valid: " + input + " is not.");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only double values are valid: " + input + " is not.");
		}
		
		return valid;
	}
}
