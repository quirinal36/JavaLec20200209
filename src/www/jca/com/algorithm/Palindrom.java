package www.jca.com.algorithm;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Palindrom {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("숫자입력");
		int length = input.length();
		System.out.println("length: " + length);
		
		int numA = Integer.parseInt(input);
		
		boolean result = true;
		int arr[] = new int[length];
		int i=length-1;
		while(numA > 0) {
			arr[i--] = numA % 10;
			numA /= 10;
		}
		
		System.out.println(Arrays.toString(arr));
		for(i=0; i<length/2; i++) {
			if(arr[i] != arr[length-1-i]) {
				result = false;
			}
		}
		
		System.out.println("result: " + result);
	}

}
