package calculator.view;

import calculator.controller.Controller;
import javax.swing.*;
import java.awt.*;

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
		zeroButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, zeroButton, 6, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, zeroButton, -5, SpringLayout.SOUTH, this);
		pointButton = new JButton(".");
		pointButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, pointButton, 4, SpringLayout.EAST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pointButton, 0, SpringLayout.SOUTH, zeroButton);
		oneButton = new JButton("1");
		oneButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, oneButton, 0, SpringLayout.WEST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, oneButton, -2, SpringLayout.NORTH, zeroButton);
		twoButton = new JButton("2");
		twoButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, twoButton, 0, SpringLayout.WEST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, twoButton, 0, SpringLayout.SOUTH, oneButton);
		threeButton = new JButton("3");
		threeButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.SOUTH, threeButton, 0, SpringLayout.SOUTH, twoButton);
		fourButton = new JButton("4");
		fourButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, fourButton, 0, SpringLayout.WEST, oneButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fourButton, -2, SpringLayout.NORTH, oneButton);
		fiveButton = new JButton("5");
		fiveButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, fiveButton, 0, SpringLayout.WEST, twoButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fiveButton, 0, SpringLayout.SOUTH, fourButton);
		sixButton = new JButton("6");
		sixButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, sixButton, 0, SpringLayout.WEST, threeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sixButton, 0, SpringLayout.SOUTH, fiveButton);
		sevenButton = new JButton("7");
		sevenButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, sevenButton, 0, SpringLayout.WEST, fourButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sevenButton, -2, SpringLayout.NORTH, fourButton);
		eightButton = new JButton("8");
		eightButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, eightButton, 0, SpringLayout.WEST, fiveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, eightButton, 0, SpringLayout.SOUTH, sevenButton);
		nineButton = new JButton("9");
		nineButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, nineButton, 0, SpringLayout.WEST, sixButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nineButton, 0, SpringLayout.SOUTH, eightButton);
		clearAllButton = new JButton("AC");
		clearAllButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, clearAllButton, 0, SpringLayout.WEST, sevenButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearAllButton, -2, SpringLayout.NORTH, sevenButton);
		clearEntryButton = new JButton("CE");
		clearEntryButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, clearEntryButton, 0, SpringLayout.WEST, eightButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearEntryButton, 0, SpringLayout.SOUTH, clearAllButton);
		deleteButton = new JButton("⌫");
		deleteButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, deleteButton, 0, SpringLayout.WEST, nineButton);
		appLayout.putConstraint(SpringLayout.SOUTH, deleteButton, 0, SpringLayout.SOUTH, clearAllButton);
		posNegButton = new JButton("+/-");
		posNegButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, posNegButton, 4, SpringLayout.EAST, pointButton);
		appLayout.putConstraint(SpringLayout.WEST, threeButton, 0, SpringLayout.WEST, posNegButton);
		appLayout.putConstraint(SpringLayout.SOUTH, posNegButton, 0, SpringLayout.SOUTH, pointButton);
		equalsButton = new JButton("=");
		equalsButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, equalsButton, 4, SpringLayout.EAST, posNegButton);
		appLayout.putConstraint(SpringLayout.SOUTH, equalsButton, 0, SpringLayout.SOUTH, posNegButton);
		addButton = new JButton("+");
		addButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, addButton, 0, SpringLayout.WEST, equalsButton);
		appLayout.putConstraint(SpringLayout.SOUTH, addButton, 0, SpringLayout.SOUTH, threeButton);
		subtractButton = new JButton("-");
		subtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, subtractButton, 0, SpringLayout.WEST, addButton);
		appLayout.putConstraint(SpringLayout.SOUTH, subtractButton, 0, SpringLayout.SOUTH, sixButton);
		multiplyButton = new JButton("x");
		multiplyButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, multiplyButton, 0, SpringLayout.WEST, subtractButton);
		appLayout.putConstraint(SpringLayout.SOUTH, multiplyButton, 0, SpringLayout.SOUTH, nineButton);
		divideButton = new JButton("÷");
		divideButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, divideButton, 0, SpringLayout.WEST, multiplyButton);
		appLayout.putConstraint(SpringLayout.SOUTH, divideButton, 0, SpringLayout.SOUTH, deleteButton);
		memClearButton = new JButton("mc");
		memClearButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, memClearButton, 0, SpringLayout.WEST, clearAllButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memClearButton, -2, SpringLayout.NORTH, clearAllButton);
		memAddButton = new JButton("m+");
		memAddButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, memAddButton, 0, SpringLayout.WEST, clearEntryButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memAddButton, 0, SpringLayout.SOUTH, memClearButton);
		memSubtractButton = new JButton("m-");
		memSubtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, memSubtractButton, 0, SpringLayout.WEST, deleteButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memSubtractButton, 0, SpringLayout.SOUTH, memAddButton);
		memRecallButton = new JButton("mr");
		memRecallButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		appLayout.putConstraint(SpringLayout.WEST, memRecallButton, 0, SpringLayout.WEST, divideButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memRecallButton, 0, SpringLayout.SOUTH, memSubtractButton);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setSize(500, 700);
		this.setBackground(new Color(0, 0, 0));
		this.add(zeroButton);
		zeroButton.setPreferredSize(new Dimension(119,80));
		this.add(pointButton);
		pointButton.setPreferredSize(new Dimension(119,80));
		this.add(oneButton);
		oneButton.setPreferredSize(new Dimension(119,80));
		this.add(twoButton);
		twoButton.setPreferredSize(new Dimension(119,80));
		this.add(threeButton);
		threeButton.setPreferredSize(new Dimension(119,80));
		this.add(fourButton);
		fourButton.setPreferredSize(new Dimension(119,80));
		this.add(fiveButton);
		fiveButton.setPreferredSize(new Dimension(119,80));
		this.add(sixButton);
		sixButton.setPreferredSize(new Dimension(119,80));
		this.add(sevenButton);
		sevenButton.setPreferredSize(new Dimension(119,80));
		this.add(eightButton);
		eightButton.setPreferredSize(new Dimension(119,80));
		this.add(nineButton);
		nineButton.setPreferredSize(new Dimension(119,80));
		this.add(clearAllButton);
		clearAllButton.setPreferredSize(new Dimension(119,80));
		this.add(clearEntryButton);
		clearEntryButton.setPreferredSize(new Dimension(119,80));
		this.add(deleteButton);
		deleteButton.setPreferredSize(new Dimension(119,80));
		this.add(posNegButton);
		posNegButton.setPreferredSize(new Dimension(119,80));
		this.add(equalsButton);
		equalsButton.setPreferredSize(new Dimension(119,80));
		this.add(addButton);
		addButton.setPreferredSize(new Dimension(119,80));
		this.add(subtractButton);
		subtractButton.setPreferredSize(new Dimension(119,80));
		this.add(multiplyButton);
		multiplyButton.setPreferredSize(new Dimension(119,80));
		this.add(divideButton);
		divideButton.setPreferredSize(new Dimension(119,80));
		this.add(memClearButton);
		memClearButton.setPreferredSize(new Dimension(119,80));
		this.add(memAddButton);
		memAddButton.setPreferredSize(new Dimension(119,80));
		this.add(memSubtractButton);
		memSubtractButton.setPreferredSize(new Dimension(119,80));
		this.add(memRecallButton);
		memRecallButton.setPreferredSize(new Dimension(119,80));
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

	}
}