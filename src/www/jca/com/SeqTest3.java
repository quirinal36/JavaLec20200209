package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest3 {
	
	/*
	 * 1 ���� 100 ���� ������� ������ ���� 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).Ű���� �Է¹ޱ�____________________________//
		String keyboardInput = JOptionPane.showInputDialog("2 �̻� 44���� �ڿ����� �ϳ� �Է� :");
		int num1 = Integer.parseInt(keyboardInput);						   //	20

		//________________________2).�迭 �����_______________________________// [1,1,2,3,5,8,13,21, ... ]
		int []seqType3 = sp.makeType3(num1);	
		
		//________________________3).ȭ�鿡 ����ϱ�____________________________// 
		sp.printArr(seqType3);
		
		//________________________4).�迭���� �հ� ���ϱ� _________________________//
		int sum = sp.sumOf(seqType3);
		System.out.println("sum: " + sum);
	}
}
