package calculator.view;

import calculator.controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel
{
	private Controller appController;
	private SpringLayout appLayout;
	
	private JLabel numDisplay;
	
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
		
		numDisplay = new JLabel();
		
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
		this.setSize(500,700);
		this.setBackground(new Color(0,0,0));
		
		this.add(numDisplay);
		numDisplay.setFont(new Font("Calibri", Font.PLAIN, 45));
		numDisplay.setText("test");
		numDisplay.setOpaque(true);
		numDisplay.setBackground(new Color(255,255,255));
		numDisplay.setPreferredSize(new Dimension(495,150));
		
		this.add(zeroButton);
		zeroButton.setPreferredSize(new Dimension(119,83));
		zeroButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(pointButton);
		pointButton.setPreferredSize(new Dimension(119,83));
		pointButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(oneButton);
		oneButton.setPreferredSize(new Dimension(119,83));
		oneButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(twoButton);
		twoButton.setPreferredSize(new Dimension(119,83));
		twoButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(threeButton);
		threeButton.setPreferredSize(new Dimension(119,83));
		threeButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(fourButton);
		fourButton.setPreferredSize(new Dimension(119,83));
		fourButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(fiveButton);
		fiveButton.setPreferredSize(new Dimension(119,83));
		fiveButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(sixButton);
		sixButton.setPreferredSize(new Dimension(119,83));
		sixButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(sevenButton);
		sevenButton.setPreferredSize(new Dimension(119,83));
		sevenButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(eightButton);
		eightButton.setPreferredSize(new Dimension(119,83));
		eightButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(nineButton);
		nineButton.setPreferredSize(new Dimension(119,83));
		nineButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(clearAllButton);
		clearAllButton.setPreferredSize(new Dimension(119,83));
		clearAllButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(clearEntryButton);
		clearEntryButton.setPreferredSize(new Dimension(119,83));
		clearEntryButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(deleteButton);
		deleteButton.setPreferredSize(new Dimension(119,83));
		deleteButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(posNegButton);
		posNegButton.setPreferredSize(new Dimension(119,83));
		posNegButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(equalsButton);
		equalsButton.setPreferredSize(new Dimension(119,83));
		equalsButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(addButton);
		addButton.setPreferredSize(new Dimension(119,83));
		addButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(subtractButton);
		subtractButton.setPreferredSize(new Dimension(119,83));
		subtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(multiplyButton);
		multiplyButton.setPreferredSize(new Dimension(119,83));
		multiplyButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(divideButton);
		divideButton.setPreferredSize(new Dimension(119,83));
		divideButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memClearButton);
		memClearButton.setPreferredSize(new Dimension(119,83));
		memClearButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memAddButton);
		memAddButton.setPreferredSize(new Dimension(119,83));
		memAddButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memSubtractButton);
		memSubtractButton.setPreferredSize(new Dimension(119,83));
		memSubtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memRecallButton);
		memRecallButton.setPreferredSize(new Dimension(119,83));
		memRecallButton.setFont(new Font("Calibri", Font.PLAIN, 30));
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, numDisplay, -3, SpringLayout.EAST, memRecallButton);
		appLayout.putConstraint(SpringLayout.WEST, numDisplay, 3, SpringLayout.WEST, memClearButton);
		appLayout.putConstraint(SpringLayout.NORTH, numDisplay, 9, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, zeroButton, 6, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, zeroButton, -5, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pointButton, 4, SpringLayout.EAST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pointButton, 0, SpringLayout.SOUTH, zeroButton);
		appLayout.putConstraint(SpringLayout.WEST, oneButton, 0, SpringLayout.WEST, zeroButton);
		appLayout.putConstraint(SpringLayout.SOUTH, oneButton, -2, SpringLayout.NORTH, zeroButton);
		appLayout.putConstraint(SpringLayout.WEST, twoButton, 0, SpringLayout.WEST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, twoButton, 0, SpringLayout.SOUTH, oneButton);
		appLayout.putConstraint(SpringLayout.WEST, threeButton, 0, SpringLayout.WEST, posNegButton);
		appLayout.putConstraint(SpringLayout.SOUTH, threeButton, 0, SpringLayout.SOUTH, twoButton);
		appLayout.putConstraint(SpringLayout.WEST, fourButton, 0, SpringLayout.WEST, oneButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fourButton, -2, SpringLayout.NORTH, oneButton);
		appLayout.putConstraint(SpringLayout.WEST, fiveButton, 0, SpringLayout.WEST, twoButton);
		appLayout.putConstraint(SpringLayout.SOUTH, fiveButton, 0, SpringLayout.SOUTH, fourButton);
		appLayout.putConstraint(SpringLayout.WEST, sixButton, 0, SpringLayout.WEST, threeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sixButton, 0, SpringLayout.SOUTH, fiveButton);
		appLayout.putConstraint(SpringLayout.WEST, sevenButton, 0, SpringLayout.WEST, fourButton);
		appLayout.putConstraint(SpringLayout.SOUTH, sevenButton, -2, SpringLayout.NORTH, fourButton);
		appLayout.putConstraint(SpringLayout.WEST, eightButton, 0, SpringLayout.WEST, fiveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, eightButton, 0, SpringLayout.SOUTH, sevenButton);
		appLayout.putConstraint(SpringLayout.WEST, nineButton, 0, SpringLayout.WEST, sixButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nineButton, 0, SpringLayout.SOUTH, eightButton);
		appLayout.putConstraint(SpringLayout.WEST, clearAllButton, 0, SpringLayout.WEST, sevenButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearAllButton, -2, SpringLayout.NORTH, sevenButton);
		appLayout.putConstraint(SpringLayout.WEST, clearEntryButton, 0, SpringLayout.WEST, eightButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearEntryButton, 0, SpringLayout.SOUTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.WEST, deleteButton, 0, SpringLayout.WEST, nineButton);
		appLayout.putConstraint(SpringLayout.SOUTH, deleteButton, 0, SpringLayout.SOUTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.WEST, posNegButton, 4, SpringLayout.EAST, pointButton);
		appLayout.putConstraint(SpringLayout.SOUTH, posNegButton, 0, SpringLayout.SOUTH, pointButton);
		appLayout.putConstraint(SpringLayout.WEST, equalsButton, 4, SpringLayout.EAST, posNegButton);
		appLayout.putConstraint(SpringLayout.SOUTH, equalsButton, 0, SpringLayout.SOUTH, posNegButton);
		appLayout.putConstraint(SpringLayout.WEST, addButton, 0, SpringLayout.WEST, equalsButton);
		appLayout.putConstraint(SpringLayout.SOUTH, addButton, 0, SpringLayout.SOUTH, threeButton);
		appLayout.putConstraint(SpringLayout.WEST, subtractButton, 0, SpringLayout.WEST, addButton);
		appLayout.putConstraint(SpringLayout.SOUTH, subtractButton, 0, SpringLayout.SOUTH, sixButton);
		appLayout.putConstraint(SpringLayout.WEST, multiplyButton, 0, SpringLayout.WEST, subtractButton);
		appLayout.putConstraint(SpringLayout.SOUTH, multiplyButton, 0, SpringLayout.SOUTH, nineButton);
		appLayout.putConstraint(SpringLayout.WEST, divideButton, 0, SpringLayout.WEST, multiplyButton);
		appLayout.putConstraint(SpringLayout.SOUTH, divideButton, 0, SpringLayout.SOUTH, deleteButton);
		appLayout.putConstraint(SpringLayout.WEST, memClearButton, 0, SpringLayout.WEST, clearAllButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memClearButton, -2, SpringLayout.NORTH, clearAllButton);
		appLayout.putConstraint(SpringLayout.WEST, memAddButton, 0, SpringLayout.WEST, clearEntryButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memAddButton, 0, SpringLayout.SOUTH, memClearButton);
		appLayout.putConstraint(SpringLayout.WEST, memSubtractButton, 0, SpringLayout.WEST, deleteButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memSubtractButton, 0, SpringLayout.SOUTH, memAddButton);
		appLayout.putConstraint(SpringLayout.WEST, memRecallButton, 0, SpringLayout.WEST, divideButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memRecallButton, 0, SpringLayout.SOUTH, memSubtractButton);
	}

	private void setupListeners()
	{
		zeroButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String combineText = numDisplay.getText() + "0";
				numDisplay.setText(combineText);
			}
		});
		
		oneButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String combineText = numDisplay.getText() + "1";
				numDisplay.setText(combineText);
			}
		});
	}
}