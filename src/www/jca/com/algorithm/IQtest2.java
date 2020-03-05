package www.jca.com.algorithm;

import javax.swing.JOptionPane;

public class IQtest2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("첫번째숫자");
		String input2 = JOptionPane.showInputDialog("두번째숫자");
		
		int numA = Integer.parseInt(input);
		int numB = Integer.parseInt(input2);
		
		int numC = numA * numB;
		int numD = numA + numB;
		
		int numE = numC % 10;
		int numF = numD / 10;
		int numG = numF + numE;
		
		System.out.println(numG);
	}

}
