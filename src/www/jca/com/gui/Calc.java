package www.jca.com.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calc extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4691869111582076256L;
	char operator;
	int operand1;
	int operand;
	
	JLabel consoleLabel;
	
	public Calc(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;
		
		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		getContentPane().add(mainPanel);
		
		JPanel consolePanel = new JPanel();
		consolePanel.setPreferredSize(new Dimension(600, 100));
		mainPanel.add(consolePanel, BorderLayout.NORTH);
		
		consoleLabel = new JLabel();
		consoleLabel.setHorizontalAlignment(JLabel.CENTER);
		consoleLabel.setFont(consoleLabel.getFont().deriveFont(50f));
		consolePanel.add(consoleLabel);
		
		JPanel padPanel = new JPanel(new GridLayout(4,4));
		mainPanel.add(padPanel, BorderLayout.CENTER);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(this);
		padPanel.add(button7, 0);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(this);
		padPanel.add(button8);
		
		JButton button9 = new JButton("9");
		padPanel.add(button9);
		button9.addActionListener(this);
		
		JButton buttonPlus = new JButton("+");
		padPanel.add(buttonPlus);
		buttonPlus.addActionListener(this);
		
		JButton button4 = new JButton("4");
		padPanel.add(button4);
		button4.addActionListener(this);
		
		JButton button5 = new JButton("5");
		padPanel.add(button5);
		button5.addActionListener(this);
		
		JButton button6 = new JButton("6");
		padPanel.add(button6);
		button6.addActionListener(this);
		
		JButton buttonMinus = new JButton("-");
		padPanel.add(buttonMinus);
		buttonMinus.addActionListener(this);
		
		JButton button1 = new JButton("1");
		padPanel.add(button1);
		button1.addActionListener(this);
		
		JButton button2 = new JButton("2");
		padPanel.add(button2);
		button2.addActionListener(this);
		
		JButton button3 = new JButton("3");
		padPanel.add(button3);
		button3.addActionListener(this);
		
		JButton buttonMulti = new JButton("*");
		padPanel.add(buttonMulti);
		buttonMulti.addActionListener(this);
		
		JButton buttonEmpty = new JButton();
		padPanel.add(buttonEmpty);
		
		JButton button0 = new JButton("0");
		padPanel.add(button0);
		button0.addActionListener(this);
		
		JButton buttonBack = new JButton("<");
		padPanel.add(buttonBack);
		buttonBack.addActionListener(this);
		
		JButton buttonEqual = new JButton("=");
		padPanel.add(buttonEqual);
		buttonEqual.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = ((JButton)e.getSource()).getText();
		char btnChar = text.charAt(0);
		int intValBtnText = (int)btnChar;
		
		String labelTxt = consoleLabel.getText();
		
		if(intValBtnText >= 48 && intValBtnText<=57) {
			// 숫자
			labelTxt += text;
			consoleLabel.setText(labelTxt);
		}else if(intValBtnText == 61){
			// 계산
			int result = 0;
			switch(operator) {
			case '+':
				result = operand1 + Integer.parseInt(labelTxt);
				break;
			case '-':
				result = operand1 - Integer.parseInt(labelTxt);
				break;
			case '*':
				result = operand1 * Integer.parseInt(labelTxt);
				break;
			}
			
			consoleLabel.setText(String.valueOf(result));
		}else if(intValBtnText == 60){
			if(labelTxt.length() > 0) {
				labelTxt = labelTxt.substring(0, labelTxt.length()-1);
				consoleLabel.setText(labelTxt);
			}
		}else {
			// 연산기호
			operator = btnChar;
			operand1 = Integer.parseInt(labelTxt);
			consoleLabel.setText("");
		}
		
		invalidate();
	}

}
