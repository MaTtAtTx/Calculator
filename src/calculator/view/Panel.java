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
	
	private JButton zeroButton;
	private JButton pointButton;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton clearAllButton;
	private JButton clearEntryButton;
	private JButton deleteButton;
	private JButton posNegButton;
	private JButton equalsButton;
	private JButton addButton;
	private JButton subtractButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JButton memClearButton;
	private JButton memAddButton;
	private JButton memSubtractButton;
	private JButton memRecallButton;

	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		
		zeroButton = new JButton("0");
		pointButton = new JButton(".");
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton = new JButton("4");
		fiveButton = new JButton("5");
		sixButton = new JButton("6");
		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton = new JButton("9");
		clearAllButton = new JButton("AC");
		clearEntryButton = new JButton("CE");
		deleteButton = new JButton("⌫");
		posNegButton = new JButton("+/-");
		equalsButton = new JButton("=");
		addButton = new JButton("+");
		subtractButton = new JButton("-");
		multiplyButton = new JButton("x");
		divideButton = new JButton("÷");
		memClearButton = new JButton("mc");
		memAddButton = new JButton("m+");
		memSubtractButton = new JButton("m-");
		memRecallButton = new JButton("mr");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setSize(500, 700);
		this.setBackground(new Color(128, 60, 128));
		this.add(zeroButton);
		this.add(pointButton);
		this.add(oneButton);
		this.add(twoButton);
		this.add(threeButton);
		this.add(fourButton);
		this.add(fiveButton);
		this.add(sixButton);
		this.add(sevenButton);
		this.add(eightButton);
		this.add(nineButton);
		this.add(clearAllButton);
		this.add(clearEntryButton);
		this.add(deleteButton);
		this.add(posNegButton);
		this.add(equalsButton);
		this.add(addButton);
		this.add(subtractButton);
		this.add(multiplyButton);
		this.add(divideButton);
		this.add(memClearButton);
		this.add(memAddButton);
		this.add(memSubtractButton);
		this.add(memRecallButton);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

	}
}