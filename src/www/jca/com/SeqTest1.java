package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest1 {
	
	/*
	 * 1 ���� 100 ���� ������� ������ ���� 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).Ű���� �Է¹ޱ�____________________________//
		String keyboardInput = JOptionPane.showInputDialog("100 ������ ������ �ϳ� �Է� :");
		int num1 = Integer.parseInt(keyboardInput);						   //	100

		//________________________2).�迭 �����_______________________________// [1,2,3,4, ... ,100]
		int []seqType1 = sp.makeSeq(num1);	
		
		//________________________3).ȭ�鿡 ����ϱ�____________________________// 
		sp.printArr(seqType1);
		
		//________________________4).�迭���� �հ� ���ϱ� _________________________//
		int sum = sp.sumOf(seqType1);
		System.out.println("sum: " + sum);
	}
}
