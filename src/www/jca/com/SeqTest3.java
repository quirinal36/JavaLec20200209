package www.jca.com;

import javax.swing.JOptionPane;

public class SeqTest3 {
	
	/*
	 * 1 부터 100 까지 순서대로 나열된 수열 
	 **/
	public static void main(String[] args) {
		SequencePractice sp = new SequencePractice();
		//________________________1).키보드 입력받기____________________________//
		String keyboardInput = JOptionPane.showInputDialog("2 이상 44이하 자연수중 하나 입력 :");
		int num1 = Integer.parseInt(keyboardInput);						   //	20

		//________________________2).배열 만들기_______________________________// [1,1,2,3,5,8,13,21, ... ]
		int []seqType3 = sp.makeType3(num1);	
		
		//________________________3).화면에 출력하기____________________________// 
		sp.printArr(seqType3);
		
		//________________________4).배열내부 합계 구하기 _________________________//
		int sum = sp.sumOf(seqType3);
		System.out.println("sum: " + sum);
	}
}
