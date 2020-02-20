package www.jca.com.gui;

public class FactorialPractice {

	public int factorial(int input) {
		int result = 1;
		while(input > 0) {
			result *= input--;
		}
		return result;
	}
}
