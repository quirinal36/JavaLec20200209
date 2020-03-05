package www.jca.com.algorithm;

import java.util.Arrays;

public class BubbleSort implements SortingInterface<Integer> {
	Integer[] array;
	
	public BubbleSort(int[] arr) {
		array = new Integer[arr.length];
		int i=0;
		for(Integer item: arr) {
			array[i++] = item;
		}
	}
	
	@Override
	public void sort() {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-(i+1); j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1]; 
					array[j+1] = temp;
				}
			}
			System.out.println(">>"+print());
		}
	}

	@Override
	public String print() {
		return Arrays.toString(this.array);
	}
}