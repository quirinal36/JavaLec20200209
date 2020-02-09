package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest2 {
	
	/*
	 * 1 부터 100 까지 순서대로 나열된 수열 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).키보드 입력받기____________________________//
		String keyboardInput = JOptionPane.showInputDialog("100 이하의 숫자중 하나 입력 :");
		int num1 = Integer.parseInt(keyboardInput);						   //	50

		//________________________2).배열 만들기_______________________________// [1,2,4,7,11,16,22 ... ]
		int []seqType2 = sp.makeType2(num1);	
		
		//________________________3).화면에 출력하기____________________________// 
		sp.printArr(seqType2);
		
		//________________________4).배열내부 합계 구하기 _________________________//
		int sum = sp.sumOf(seqType2);
		System.out.println("sum: " + sum);
	}
}
