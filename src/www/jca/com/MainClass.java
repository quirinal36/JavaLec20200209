package www.jca.com;
import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		//________________________1).Ű���� �Է¹ޱ�____________________________//
		String keyboardInput = JOptionPane.showInputDialog("11 ~ 99 ������ �ϳ� �Է� :");
		int num1 = Integer.parseInt(keyboardInput);						   //	57
		
		//________________________2).��ü����_________________________________//
		MathTest math = new MathTest();

		//________________________3).�Է��� ���� �ɰ���___________________________//
		int first = math.getFirst(num1);									//	5
		int last = math.getLast(num1);										//	7
		
		//________________________4).�ɰ� ���� ����______________________________//
		int multiResult = math.multi(first, last);							//	35
		int addResult = math.add(first, last);								//	12
		
		//________________________5).������ ���� �ٽ� �ɰ���________________________//
		int result = math.getFirst(multiResult) * math.getLast(addResult);	//	3 * 2
		
		//________________________6).����ϱ�_________________________________//
		System.out.println("���� ��� : "+result);
	}

}
