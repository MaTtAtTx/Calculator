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
}
