package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest1 {
	
	/*
	 * 1 부터 100 까지 순서대로 나열된 수열 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).키보드 입력받기____________________________//
		String keyboardInput = JOptionPane.showInputDialog("100 이하의 숫자중 하나 입력 :");
		int num1 = Integer.parseInt(keyboardInput);						   //	100

		//________________________2).배열 만들기_______________________________// [1,2,3,4, ... ,100]
		int []seqType1 = sp.makeSeq(num1);	
		
		//________________________3).화면에 출력하기____________________________// 
		sp.printArr(seqType1);
		
		//________________________4).배열내부 합계 구하기 _________________________//
		int sum = sp.sumOf(seqType1);
		System.out.println("sum: " + sum);
	}
}
