package www.jca.com.gui;

public class BinaryPractice {
	
	public int[] decimalToBinary(int input) {
		int binary[] = new int[4];
		int i=0;
		while(input > 0) {
			binary[i] = input % 2;
			input /= 2;
			i++;
		}
		return binary;
	}
}
