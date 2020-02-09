package www.jca.com;

public class MathTest {
	
	public int add(int input1, int input2) {
		int result = input1 + input2;
		return result;
	}
	
	public int minus(int input1, int input2) {
		int result = input1 - input2;
		return result;
	}
	
	public int multi(int input1, int input2) {
		int result = input1 * input2;
		return result;
	}
	
	public int pow(int input1, int input2) {
		int result = 1;
		for (int i=0; i<input2; i++) {
			result = result * input1;
		}
		return result;
	}
	
	/**
	 * 10���ڸ� ���� �����ϱ�
	 * ex) 96 -> 9
	 * 	   67 -> 6
	 * @param input 
	 * @return
	 */
	public int getFirst(int input) {
		int remain = input % 10;			// 10���� ���� ������(1���ڸ�)
		int removeLast = input - remain;	// 10���� ������������� 
		return removeLast / 10;				// 10���ڸ� ���ڰ��
	}
	
	/**
	 * 1���ڸ� ���� �����ϱ�
	 * ex) 96 -> 6
	 * 	   67 -> 7
	 * @param input
	 * @return
	 */
	public int getLast(int input) {
		return input % 10;					// 10���� ���� ������(1���ڸ�)
	}
}
