package calculator.view;

import calculator.controller.Controller;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Controller appController;
	private Panel appPanel;

	public Frame(Controller appController)
	{
		super();
		this.appController = appController;
		appPanel = new Panel(appController);

		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(500,700);
		this.setTitle("Calculator");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
