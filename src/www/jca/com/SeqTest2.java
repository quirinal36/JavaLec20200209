package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest2 {
	
	/*
	 * 1 ���� 100 ���� ������� ������ ���� 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).Ű���� �Է¹ޱ�____________________________//
		String keyboardInput = JOptionPane.showInputDialog("100 ������ ������ �ϳ� �Է� :");
		int num1 = Integer.parseInt(keyboardInput);						   //	50

		//________________________2).�迭 �����_______________________________// [1,2,4,7,11,16,22 ... ]
		int []seqType2 = sp.makeType2(num1);	
		
		//________________________3).ȭ�鿡 ����ϱ�____________________________// 
		sp.printArr(seqType2);
		
		//________________________4).�迭���� �հ� ���ϱ� _________________________//
		int sum = sp.sumOf(seqType2);
		System.out.println("sum: " + sum);
	}
}
