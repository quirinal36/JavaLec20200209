package www.jca.com;
import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		//________________________1).키보드 입력받기____________________________//
		String keyboardInput = JOptionPane.showInputDialog("11 ~ 99 숫자중 하나 입력 :");
		int num1 = Integer.parseInt(keyboardInput);						   //	57
		
		//________________________2).객체생성_________________________________//
		MathTest math = new MathTest();

		//________________________3).입력한 숫자 쪼개기___________________________//
		int first = math.getFirst(num1);									//	5
		int last = math.getLast(num1);										//	7
		
		//________________________4).쪼갠 숫자 연산______________________________//
		int multiResult = math.multi(first, last);							//	35
		int addResult = math.add(first, last);								//	12
		
		//________________________5).연산한 숫자 다시 쪼개기________________________//
		int result = math.getFirst(multiResult) * math.getLast(addResult);	//	3 * 2
		
		//________________________6).출력하기_________________________________//
		System.out.println("최종 결과 : "+result);
	}

}
