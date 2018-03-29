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
	private JButton clearButton;
	private JButton deleteButton;
	private JButton squareButton;
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
	
	private double firstNum;
	private double secondNum;
	private double opNum;
	private double answer;
	private double memNum;
	
	private int pointCount;
	
	private boolean opStatus;
	private boolean numStatus;
	private boolean equalStatus;
	private boolean zeroFirst;
	private boolean undefinedStatus;
	
	private String stringAnswer;
	private String operation;
	
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
		clearButton = new JButton("AC");
		deleteButton = new JButton("del");
		squareButton = new JButton("X²");
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
		
		firstNum = 0.0;
		secondNum = 0.0;
		opNum = 0.0;
		answer = 0.0;
		memNum = 0.0;
		
		pointCount = 0;
		
		opStatus = false;
		numStatus = false;
		equalStatus = false;
		zeroFirst = false;
		undefinedStatus = false;
		
		stringAnswer = "";
		operation = ""; 
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setSize(500,700);
		this.setBackground(new Color(0,0,75));
		
		this.add(numDisplay);
		numDisplay.setFont(new Font("Calibri", Font.PLAIN, 45));
		numDisplay.setOpaque(true);
		numDisplay.setBackground(new Color(255,255,255));
		numDisplay.setPreferredSize(new Dimension(495,145));
		
		this.add(zeroButton);
		zeroButton.setPreferredSize(new Dimension(118,83));
		zeroButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(pointButton);
		pointButton.setPreferredSize(new Dimension(118,83));
		pointButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(oneButton);
		oneButton.setPreferredSize(new Dimension(118,83));
		oneButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(twoButton);
		twoButton.setPreferredSize(new Dimension(118,83));
		twoButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(threeButton);
		threeButton.setPreferredSize(new Dimension(118,83));
		threeButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(fourButton);
		fourButton.setPreferredSize(new Dimension(118,83));
		fourButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(fiveButton);
		fiveButton.setPreferredSize(new Dimension(118,83));
		fiveButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(sixButton);
		sixButton.setPreferredSize(new Dimension(118,83));
		sixButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(sevenButton);
		sevenButton.setPreferredSize(new Dimension(118,83));
		sevenButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(eightButton);
		eightButton.setPreferredSize(new Dimension(118,83));
		eightButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(nineButton);
		nineButton.setPreferredSize(new Dimension(118,83));
		nineButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(clearButton);
		clearButton.setPreferredSize(new Dimension(118,83));
		clearButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(squareButton);
		squareButton.setPreferredSize(new Dimension(118,83));
		squareButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(deleteButton);
		deleteButton.setPreferredSize(new Dimension(118,83));
		deleteButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(posNegButton);
		posNegButton.setPreferredSize(new Dimension(118,83));
		posNegButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(equalsButton);
		equalsButton.setPreferredSize(new Dimension(118,83));
		equalsButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(addButton);
		addButton.setPreferredSize(new Dimension(118,83));
		addButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(subtractButton);
		subtractButton.setPreferredSize(new Dimension(118,83));
		subtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(multiplyButton);
		multiplyButton.setPreferredSize(new Dimension(118,83));
		multiplyButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(divideButton);
		divideButton.setPreferredSize(new Dimension(118,83));
		divideButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memClearButton);
		memClearButton.setPreferredSize(new Dimension(118,83));
		memClearButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memAddButton);
		memAddButton.setPreferredSize(new Dimension(118,83));
		memAddButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memSubtractButton);
		memSubtractButton.setPreferredSize(new Dimension(118,83));
		memSubtractButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.add(memRecallButton);
		memRecallButton.setPreferredSize(new Dimension(118,83));
		memRecallButton.setFont(new Font("Calibri", Font.PLAIN, 30));
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, numDisplay, -1, SpringLayout.EAST, memRecallButton);
		appLayout.putConstraint(SpringLayout.WEST, numDisplay, 1, SpringLayout.WEST, memClearButton);
		appLayout.putConstraint(SpringLayout.NORTH, numDisplay, 6, SpringLayout.NORTH, this);
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
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, sevenButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -2, SpringLayout.NORTH, sevenButton);
		appLayout.putConstraint(SpringLayout.WEST, deleteButton, 0, SpringLayout.WEST, eightButton);
		appLayout.putConstraint(SpringLayout.SOUTH, deleteButton, 0, SpringLayout.SOUTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, squareButton, 0, SpringLayout.WEST, nineButton);
		appLayout.putConstraint(SpringLayout.SOUTH, squareButton, 0, SpringLayout.SOUTH, clearButton);
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
		appLayout.putConstraint(SpringLayout.SOUTH, divideButton, 0, SpringLayout.SOUTH, squareButton);
		appLayout.putConstraint(SpringLayout.WEST, memClearButton, 0, SpringLayout.WEST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memClearButton, -2, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, memAddButton, 0, SpringLayout.WEST, deleteButton);
		appLayout.putConstraint(SpringLayout.SOUTH, memAddButton, 0, SpringLayout.SOUTH, memClearButton);
		appLayout.putConstraint(SpringLayout.WEST, memSubtractButton, 0, SpringLayout.WEST, squareButton);
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
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					if (numStatus == true)
					{
						numDisplay.setText("");
						numStatus = false;
					}
					
					if (numDisplay.getText().equals(""))
					{
						combineNum("0");
						zeroFirst = true;
					}
					else if (zeroFirst == true)
					{
						//Do Nothing
					}
					else
					{
						combineNum("0");
					}
				}
			}
		});
		
		pointButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					if (numStatus == true)
					{
						numDisplay.setText("");
						numStatus = false;
					}
					
					if (numDisplay.getText().equals("") && pointCount == 0)
					{
						combineNum("0.");
						pointCount++;
						zeroFirst = false;
					}
					else if (pointCount == 0)
					{
						combineNum(".");
						pointCount++;
						zeroFirst = false;
					}
					else
					{
						//Do Nothing
					}
				}
			}
		});
		
		oneButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(1);
			}
		});
		
		twoButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(2);
			}
		});
		
		threeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(3);
			}
		});
		
		fourButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(4);
			}
		});
		
		fiveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(5);
			}
		});
		
		sixButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(6);
			}
		});
		
		sevenButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(7);
			}
		});
		
		eightButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(8);
			}
		});
		
		nineButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathButton(9);
			}
		});
		
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstNum = 0.0;
				secondNum = 0.0;
				opNum = 0.0;
				answer = 0.0;
				stringAnswer = "";
				operation = "";
				opStatus = false;
				numStatus = false;
				equalStatus = false;
				zeroFirst = false;
				undefinedStatus = false;
				pointCount = 0;
				
				numDisplay.setText("");
			}
		});
		
		deleteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					if (numDisplay.getText().equals(""))
					{
						//Do Nothing
					}
					else if (numDisplay.getText().equals("0."))
					{
						numDisplay.setText("");
						if (!numDisplay.getText().contains("."))
						{
							pointCount = 0;
						}	
					}
					else
					{
						String tempString = numDisplay.getText();
						numDisplay.setText(tempString.substring(0, tempString.length() - 1));
						if (!numDisplay.getText().contains("."))
						{
							pointCount = 0;
						}
					}
				}
			}
		});
		
		squareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					double squareNum = Double.parseDouble(numDisplay.getText());
					squareNum = squareNum * squareNum;
					String squareString = String.valueOf(squareNum);
					squareString = removePoint(squareString);
					numDisplay.setText(squareString);
				}
			}
		});
		
		posNegButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					if (zeroFirst == false && numDisplay.getText().length() > 0 && !numDisplay.getText().equals("0."))
					{
						double prevNum = Double.parseDouble(numDisplay.getText());
						prevNum = prevNum * -1;
						String newString = String.valueOf(prevNum);
						newString = removePoint(newString);
						if (newString.equals("0") || newString.equals("-0"))
						{
							//Do Nothing
						}
						else
						{
							if (!newString.contains("."))
							{
								pointCount = 0;
							}
							numDisplay.setText(newString);
						}
					}
				}
			}
		});
		
		equalsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (equalStatus == true)
				{
					secondNum = Double.parseDouble(numDisplay.getText());
					numEquals(firstNum,secondNum);
					opStatus = false;
					equalStatus = false;
				}
				else
				{
					//Do Nothing
				}
			}
		});
		
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathOperation("+");
			}
		});
		
		subtractButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathOperation("-");
			}
		});
		
		multiplyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathOperation("x");
			}
		});
		
		divideButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				mathOperation("÷");
			}
		});
		
		memClearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				memNum = 0.0;
			}
		});
		
		memAddButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					String tempString = numDisplay.getText();
					Double tempNum = Double.parseDouble(tempString);
					memNum = memNum + tempNum;
				}
			}
		});
		
		memSubtractButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					String tempString = numDisplay.getText();
					Double tempNum = Double.parseDouble(tempString);
					memNum = memNum - tempNum;
				}
			}
		});
		
		memRecallButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (undefinedStatus == true)
				{
					//Do Nothing
				}
				else
				{
					String newString = String.valueOf(memNum);
					newString = removePoint(newString);
					numDisplay.setText(newString);
				}
			}
		});
	}
	
	private void numEquals(double num1, double num2)
	{
		if (operation.equals("÷") && num2 == 0)
		{
			numDisplay.setText("Undefined");
			undefinedStatus = true;
		}
		else
		{
			switch (operation)
			{
				case "+": 	answer = num1 + num2;
							break;
				case "-": 	answer = num1 - num2;
							break;
				case "x": 	answer = num1 * num2;
							break;
				case "÷": 	answer = num1 / num2;
							break;
				case "": 	//Do Nothing
							break;
			}
			stringAnswer = String.valueOf(answer);
			stringAnswer = removePoint(stringAnswer);
			numDisplay.setText(stringAnswer);
		}
	}
	
	private void mathButton(int currentNum)
	{
		if (undefinedStatus == true)
		{
			//Do Nothing
		}
		else
		{
			if (numStatus == true)
			{
				numDisplay.setText("");
				numStatus = false;
			}
			
			if (zeroFirst == true)
			{
				numDisplay.setText("");
				combineNum(String.valueOf(currentNum));
				zeroFirst = false;
			}
			else
			{
				combineNum(String.valueOf(currentNum));
			}
		}
	}
	
	private void combineNum(String currentValue)
	{
		String combineText = "";
		
		switch (currentValue)
		{
			case "0": 	combineText = numDisplay.getText() + "0";
						numDisplay.setText(combineText);
						break;
			case ".": 	combineText = numDisplay.getText() + ".";
						numDisplay.setText(combineText);
						break;
			case "0.": 	combineText = numDisplay.getText() + "0.";
						numDisplay.setText(combineText);
						break;
			case "1": 	combineText = numDisplay.getText() + "1";
						numDisplay.setText(combineText);
						break;
			case "2": 	combineText = numDisplay.getText() + "2";
						numDisplay.setText(combineText);
						break;
			case "3": 	combineText = numDisplay.getText() + "3";
						numDisplay.setText(combineText);
						break;
			case "4": 	combineText = numDisplay.getText() + "4";
						numDisplay.setText(combineText);
						break;
			case "5": 	combineText = numDisplay.getText() + "5";
						numDisplay.setText(combineText);
						break;
			case "6": 	combineText = numDisplay.getText() + "6";
						numDisplay.setText(combineText);
						break;
			case "7": 	combineText = numDisplay.getText() + "7";
						numDisplay.setText(combineText);
						break;
			case "8": 	combineText = numDisplay.getText() + "8";
						numDisplay.setText(combineText);
						break;
			case "9": 	combineText = numDisplay.getText() + "9";
						numDisplay.setText(combineText);
						break;
		}
	}
	
	private String removePoint(String answer)
	{
		String results = "";
		int dotIndex = answer.indexOf(".");
		if ((answer.length() == dotIndex + 2 && answer.lastIndexOf("0") == answer.length() - 1))
		{
			answer = answer.substring(0, dotIndex);
		}
		else
		{
			//Do Nothing
		}
		results = answer;
		return results;
	}
	
	private void mathOperation(String mathOp)
	{
		if (undefinedStatus == true)
		{
			//Do Nothing
		}
		else
		{
			if (opStatus == false)
			{
				firstNum = Double.parseDouble(numDisplay.getText());
				operation = mathOp;
				numDisplay.setText("");
				opStatus = true;
				equalStatus = true;
				pointCount = 0;
			}
			else
			{
				opNum = Double.parseDouble(numDisplay.getText());
				numEquals(firstNum,opNum);
				operation = mathOp;
				firstNum = answer;
				numStatus = true;
				equalStatus = true;
				pointCount = 0;
			}
		}
	}
	
	private void roundNumber()
	{
		
	}
}