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
		appLayout.putConstraint(SpringLayout.NORTH, zeroButton, 236, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, zeroButton, 31, SpringLayout.WEST, this);
		pointButton = new JButton(".");
		appLayout.putConstraint(SpringLayout.NORTH, pointButton, 260, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pointButton, 42, SpringLayout.EAST, zeroButton);
		oneButton = new JButton("1");
		appLayout.putConstraint(SpringLayout.NORTH, oneButton, 0, SpringLayout.NORTH, zeroButton);
		appLayout.putConstraint(SpringLayout.WEST, oneButton, 17, SpringLayout.EAST, pointButton);
		twoButton = new JButton("2");
		appLayout.putConstraint(SpringLayout.WEST, twoButton, 76, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, twoButton, -39, SpringLayout.NORTH, zeroButton);
		threeButton = new JButton("3");
		appLayout.putConstraint(SpringLayout.SOUTH, threeButton, -6, SpringLayout.NORTH, twoButton);
		appLayout.putConstraint(SpringLayout.EAST, threeButton, 0, SpringLayout.EAST, pointButton);
		fourButton = new JButton("4");
		appLayout.putConstraint(SpringLayout.NORTH, fourButton, 0, SpringLayout.NORTH, threeButton);
		appLayout.putConstraint(SpringLayout.WEST, fourButton, 57, SpringLayout.EAST, threeButton);
		fiveButton = new JButton("5");
		appLayout.putConstraint(SpringLayout.SOUTH, fiveButton, -304, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, fiveButton, -68, SpringLayout.EAST, this);
		sixButton = new JButton("6");
		appLayout.putConstraint(SpringLayout.NORTH, sixButton, 51, SpringLayout.SOUTH, pointButton);
		appLayout.putConstraint(SpringLayout.EAST, sixButton, -79, SpringLayout.WEST, fiveButton);
		sevenButton = new JButton("7");
		appLayout.putConstraint(SpringLayout.NORTH, sevenButton, 62, SpringLayout.SOUTH, zeroButton);
		appLayout.putConstraint(SpringLayout.EAST, sevenButton, 0, SpringLayout.EAST, zeroButton);
		eightButton = new JButton("8");
		appLayout.putConstraint(SpringLayout.NORTH, eightButton, 82, SpringLayout.SOUTH, sevenButton);
		appLayout.putConstraint(SpringLayout.WEST, eightButton, 0, SpringLayout.WEST, twoButton);
		nineButton = new JButton("9");
		appLayout.putConstraint(SpringLayout.NORTH, nineButton, 0, SpringLayout.NORTH, eightButton);
		appLayout.putConstraint(SpringLayout.WEST, nineButton, 77, SpringLayout.EAST, eightButton);
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
		appLayout.putConstraint(SpringLayout.WEST, posNegButton, 0, SpringLayout.WEST, fiveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, posNegButton, -36, SpringLayout.NORTH, deleteButton);
		equalsButton = new JButton("=");
		appLayout.putConstraint(SpringLayout.NORTH, equalsButton, 0, SpringLayout.NORTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.WEST, equalsButton, 0, SpringLayout.WEST, this);
		addButton = new JButton("+");
		appLayout.putConstraint(SpringLayout.SOUTH, addButton, -59, SpringLayout.NORTH, fiveButton);
		appLayout.putConstraint(SpringLayout.EAST, addButton, 0, SpringLayout.EAST, fiveButton);
		subtractButton = new JButton("-");
		appLayout.putConstraint(SpringLayout.SOUTH, subtractButton, -41, SpringLayout.NORTH, addButton);
		appLayout.putConstraint(SpringLayout.EAST, subtractButton, 0, SpringLayout.EAST, fiveButton);
		multiplyButton = new JButton("x");
		appLayout.putConstraint(SpringLayout.WEST, multiplyButton, 0, SpringLayout.WEST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, multiplyButton, -6, SpringLayout.NORTH, eightButton);
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