package www.jca.com.gui;

public class SumPractice {
	public int sumFor(int input) {
		int result = 0;
		while(input > 0) {
			result += input;
			input--;
		}
		return result;
	}
}
