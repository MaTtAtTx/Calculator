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
		appLayout = new SpringLayout();
		
		zeroButton = new JButton("0");
		appLayout.putConstraint(SpringLayout.WEST, zeroButton, 75, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, zeroButton, -75, SpringLayout.SOUTH, this);
		pointButton = new JButton(".");
		appLayout.putConstraint(SpringLayout.WEST, pointButton, 0, SpringLayout.EAST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pointButton, 0, SpringLayout.SOUTH, zeroButton);
		oneButton = new JButton("1");
		appLayout.putConstraint(SpringLayout.WEST, oneButton, 0, SpringLayout.WEST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, oneButton, 0, SpringLayout.NORTH, zeroButton);
		twoButton = new JButton("2");
		appLayout.putConstraint(SpringLayout.WEST, twoButton, 0, SpringLayout.WEST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, twoButton, 0, SpringLayout.SOUTH, oneButton);
		threeButton = new JButton("3");
		appLayout.putConstraint(SpringLayout.SOUTH, threeButton, 0, SpringLayout.SOUTH, twoButton);
		fourButton = new JButton("4");
		appLayout.putConstraint(SpringLayout.WEST, fourButton, 0, SpringLayout.WEST, oneButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fourButton, 0, SpringLayout.NORTH, oneButton);
		fiveButton = new JButton("5");
		appLayout.putConstraint(SpringLayout.WEST, fiveButton, 0, SpringLayout.WEST, twoButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fiveButton, 0, SpringLayout.SOUTH, fourButton);
		sixButton = new JButton("6");
		appLayout.putConstraint(SpringLayout.WEST, sixButton, 0, SpringLayout.WEST, threeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sixButton, 0, SpringLayout.SOUTH, fiveButton);
		sevenButton = new JButton("7");
		appLayout.putConstraint(SpringLayout.WEST, sevenButton, 0, SpringLayout.WEST, fourButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sevenButton, 0, SpringLayout.NORTH, fourButton);
		eightButton = new JButton("8");
		appLayout.putConstraint(SpringLayout.WEST, eightButton, 0, SpringLayout.WEST, fiveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, eightButton, 0, SpringLayout.SOUTH, sevenButton);
		nineButton = new JButton("9");
		appLayout.putConstraint(SpringLayout.WEST, nineButton, 0, SpringLayout.WEST, sixButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nineButton, 0, SpringLayout.SOUTH, eightButton);
		clearAllButton = new JButton("AC");
		appLayout.putConstraint(SpringLayout.NORTH, clearAllButton, 67, SpringLayout.SOUTH, nineButton);
		appLayout.putConstraint(SpringLayout.EAST, clearAllButton, 0, SpringLayout.EAST, oneButton);
		clearEntryButton = new JButton("CE");
		appLayout.putConstraint(SpringLayout.NORTH, clearEntryButton, 0, SpringLayout.NORTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.EAST, clearEntryButton, -30, SpringLayout.WEST, clearAllButton);
		deleteButton = new JButton("⌫");
		appLayout.putConstraint(SpringLayout.NORTH, deleteButton, 0, SpringLayout.NORTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.WEST, deleteButton, 0, SpringLayout.WEST, fiveButton);
		posNegButton = new JButton("+/-");
		appLayout.putConstraint(SpringLayout.WEST, threeButton, 0, SpringLayout.WEST, posNegButton);
		appLayout.putConstraint(SpringLayout.WEST, posNegButton, 0, SpringLayout.EAST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, posNegButton, 0, SpringLayout.SOUTH, pointButton);
		equalsButton = new JButton("=");
		appLayout.putConstraint(SpringLayout.WEST, equalsButton, 0, SpringLayout.EAST, posNegButton);
		appLayout.putConstraint(SpringLayout.SOUTH, equalsButton, 0, SpringLayout.SOUTH, posNegButton);
		addButton = new JButton("+");
		appLayout.putConstraint(SpringLayout.WEST, addButton, 0, SpringLayout.WEST, equalsButton);
		appLayout.putConstraint(SpringLayout.SOUTH, addButton, 0, SpringLayout.SOUTH, threeButton);
		subtractButton = new JButton("-");
		appLayout.putConstraint(SpringLayout.WEST, subtractButton, 0, SpringLayout.WEST, addButton);
		appLayout.putConstraint(SpringLayout.SOUTH, subtractButton, 0, SpringLayout.SOUTH, sixButton);
		multiplyButton = new JButton("x");
		appLayout.putConstraint(SpringLayout.WEST, multiplyButton, 0, SpringLayout.WEST, subtractButton);
		appLayout.putConstraint(SpringLayout.SOUTH, multiplyButton, 0, SpringLayout.SOUTH, nineButton);
		divideButton = new JButton("÷");
		appLayout.putConstraint(SpringLayout.WEST, divideButton, 54, SpringLayout.EAST, multiplyButton);
		appLayout.putConstraint(SpringLayout.SOUTH, divideButton, -18, SpringLayout.NORTH, nineButton);
		memClearButton = new JButton("mc");
		appLayout.putConstraint(SpringLayout.NORTH, memClearButton, 16, SpringLayout.SOUTH, threeButton);
		appLayout.putConstraint(SpringLayout.EAST, memClearButton, 0, SpringLayout.EAST, sixButton);
		memAddButton = new JButton("m+");
		appLayout.putConstraint(SpringLayout.NORTH, memAddButton, 117, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, memAddButton, 0, SpringLayout.EAST, equalsButton);
		memSubtractButton = new JButton("m-");
		appLayout.putConstraint(SpringLayout.WEST, memSubtractButton, 0, SpringLayout.WEST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memSubtractButton, -38, SpringLayout.SOUTH, this);
		memRecallButton = new JButton("mr");
		appLayout.putConstraint(SpringLayout.NORTH, memRecallButton, 54, SpringLayout.SOUTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.EAST, memRecallButton, 0, SpringLayout.EAST, fourButton);
		
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