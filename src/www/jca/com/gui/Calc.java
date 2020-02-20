package www.jca.com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calc extends JFrame implements ActionListener{
	char operator;			// 계산하기위한 기호
	int operand1;			// 첫번째 숫자
	
	JLabel consoleLabel;	// 계산기화면
	
	String[] btnTextArray = {
							"7","8","9","+",
							"4","5","6","-",
							"1","2","3","*",
							"!","0","<","=",
							"@","#"
							};
	
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
		consolePanel.setBackground(Color.WHITE);
		
		mainPanel.add(consolePanel, BorderLayout.NORTH);				// 출력 화면을 가장 북쪽에 배치
		
		consoleLabel = new JLabel("4");
		consoleLabel.setFont(consoleLabel.getFont().deriveFont(30f));	// 글자크기
		consolePanel.add(consoleLabel);
		
		JPanel buttonView = new JPanel(new GridLayout(5,4));			// 버튼뷰
		mainPanel.add(buttonView, BorderLayout.CENTER);					// 가운데에 배치
		
		settingButtons(buttonView);
		
		setVisible(true);
	}
	
	
	
	/**
	 * padPanel 위에 버튼을 만든다.
	 * @param padPanel
	 */
	private void settingButtons(JPanel padPanel) {
		for(String text : btnTextArray) {
			JButton btn = new JButton(text);
			btn.addActionListener(this);
			padPanel.add(btn);
		}
	}
	
	/**
	 * 클릭 되었을 때 이벤트
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭 되었어요!!");
		String labelTxt = consoleLabel.getText();			// 현재 화면에 표시되어있는 숫자
		
		String text = ((JButton)e.getSource()).getText();	// 방금 입력된 숫자 (또는 기호)
		char btnChar = text.charAt(0);						// 숫자(기호)를 char 자료형으로 치환
		System.out.println("btnChar: " + btnChar);
		int intValBtnText = (int)btnChar;					// 숫자(기호)를 char 자료형으로 치환한것을 int형으로 변환
		System.out.println("intValBtnText: " + intValBtnText);
		
		if(intValBtnText >= 48 && intValBtnText<=57) {		// 0,1,2,3,4,5,6,7,8,9 일 때
			// 숫자 클릭되었을 때
			labelTxt += text;
			
			System.out.println(text);
			
			consoleLabel.setText(labelTxt);
		} else if(intValBtnText == 61){						// "=" 눌렸을 때
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
			
			consoleLabel.setText(String.valueOf(result));	// 계산 결과를 화면에 반영
			
		}else if(intValBtnText == 60){						// "<" 눌렸을 때 : consoleLabel 에서 글자 한개 삭제하기
			if(labelTxt.length() > 0) {						// 지워야할 글자가 없을경우 실행하면 오류가 발생하기 때문에
				labelTxt = labelTxt.substring(0, labelTxt.length()-1);
				consoleLabel.setText(labelTxt);
			}
		}else if(intValBtnText == 33) {						// "!" 클릭 했을 때
			/** 
			 * TODO : 실습1: 팩토리얼 계산결과 출력하기
			 */
			operand1 = Integer.parseInt(labelTxt);
			System.out.println(operand1 + " 의 팩토리얼을 계산 해주세요.");
			consoleLabel.setText(String.valueOf(new FactorialPractice().factorial(operand1)));
		}else if(intValBtnText == 64) {						// "@" 클릭 했을 때
			/**
			 * TODO: 실습3: 10진수를 2진수로 변환하기
			 */
			operand1 = Integer.parseInt(labelTxt);
			System.out.println(operand1 +"를 2진수로 변환한 결과를 계산 해주세요.");
			consoleLabel.setText(Arrays.toString(new BinaryPractice().decimalToBinary(operand1)));
		}else if(intValBtnText == 35) {		// "#" 클릭 했을 때
			/**
			 * TODO: 실습2: 입력받은 수까지 합계를 출력
			 */
			operand1 = Integer.parseInt(labelTxt);
			System.out.println("1~" + operand1 +"까지의 합계를 계산 해주세요.");
			consoleLabel.setText(String.valueOf(new SumPractice().sumFor(operand1)));
		}else {		// 연산기호 "+", "-", "*"
			operator = btnChar;
			operand1 = Integer.parseInt(labelTxt);
			consoleLabel.setText("");
		}
		
		invalidate();
	}

}
