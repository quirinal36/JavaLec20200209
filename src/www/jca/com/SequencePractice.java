package www.jca.com;

import java.util.Arrays;

public class SequencePractice {

	/**
	 * ��������
	 * 
	 * @param N
	 * @return
	 */
	public int[] makeSeq(int N) {
		int []arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1; 
		}
		return arr;
	}
	
	/**
	 * ��������
	 * 
	 * @param num
	 * @return
	 */
	public int[] makeType2(int num) {
		int []arr = new int[num];
		int gap = 1;
		
		arr[0] = 1;
		for(int i=1; i<num; i++) {
			arr[i] = arr[i-1] + gap;
			gap++;
		}
		return arr;
	}
	
	/**
	 * �Ǻ���ġ����
	 * 
	 * @param num
	 * @return
	 */
	public int[] makeType3(int num) {
		int []arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<num; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr;
	}
	
	/**
	 * �迭�� ȭ�鿡 ���
	 * @param array
	 */
	public void printArr(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * �迭�ȿ� �ִ� ��� ��ҵ��� �հ�
	 * 
	 * @param array
	 * @return
	 */
	public int sumOf(int[] array) {
		int result = 0;
		for(int i=0; i<array.length; i++) {
			result += array[i];
		}
		return result;
	}
}
