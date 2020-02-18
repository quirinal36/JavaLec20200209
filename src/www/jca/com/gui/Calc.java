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
	char operator;			// 계산하기위한 기호
	int operand1;			// 첫번째 숫자
	int operand;			// 두번째 숫자
	
	JLabel consoleLabel;	// 계산기화면
	
	public Calc(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;
		
		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		getContentPane().add(mainPanel);
		
		JPanel consolePanel = new JPanel();								// 글자 출력화면
		consolePanel.setPreferredSize(new Dimension(600, 100));			// 가로, 세로 크기
		mainPanel.add(consolePanel, BorderLayout.NORTH);				// 출력 화면을 가장 북쪽에 배치
		
		consoleLabel = new JLabel();
		consoleLabel.setHorizontalAlignment(JLabel.CENTER);				// 가로 가운데정렬
		consoleLabel.setFont(consoleLabel.getFont().deriveFont(50f));	// 글자크기
		consolePanel.add(consoleLabel);
		
		JPanel buttonView = new JPanel(new GridLayout(4,4));			// 버튼뷰
		mainPanel.add(buttonView, BorderLayout.CENTER);					// 가운데에 배치
		
		settingButtons(buttonView);
		
		setVisible(true);
	}
	
	
	private void settingButtons(JPanel padPanel) {
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
		
		JButton buttonEmpty = new JButton("!");
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
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String labelTxt = consoleLabel.getText();

		String text = ((JButton)e.getSource()).getText();
		char btnChar = text.charAt(0);
		int intValBtnText = (int)btnChar;
		
		if(intValBtnText >= 48 && intValBtnText<=57) {
			// 숫자 클릭되었을 때
			labelTxt += text;
			
			System.out.println(text);
			
			consoleLabel.setText(labelTxt);
		} else if(intValBtnText == 61){		// "=" 눌렸을 때
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
		}else if(intValBtnText == 60){		// "<" 눌렸을 때 : 글자 한개 삭제하기
			if(labelTxt.length() > 0) {
				labelTxt = labelTxt.substring(0, labelTxt.length()-1);
				consoleLabel.setText(labelTxt);
			}
		}else if(intValBtnText == 33) {
			// 실습: 팩토리얼 계산결과 출력하기
		}else {	
			System.out.println("else");
			// 연산기호 "+", "-", "*"
			operator = btnChar;
			operand1 = Integer.parseInt(labelTxt);
			consoleLabel.setText("");
		}
		
		invalidate();
	}

}
