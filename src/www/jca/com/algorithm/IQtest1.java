package www.jca.com.algorithm;

import javax.swing.JOptionPane;

public class IQtest1 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("첫번째숫자");
		String input2 = JOptionPane.showInputDialog("두번째숫자");
		
		int numA = Integer.parseInt(input);
		int numB = Integer.parseInt(input2);
		
		int numC = numA * numB;
		int numD = numC + numA;
		
		System.out.println(numD);
	}

}
