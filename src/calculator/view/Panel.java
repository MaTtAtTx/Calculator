package calculator.view;

import calculator.controller.Controller;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel
{
	private Controller appController;

	private SpringLayout appLayout;

	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setSize(500, 400);
		this.setBackground(new Color(128, 60, 128));
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

	}
}