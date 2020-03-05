package www.jca.com.datastructure;

import www.jca.com.algorithm.BubbleSort;

public class MainClass {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("isempty: " + stack.isEmpty());
		stack.push("그랜저");
		stack.push("아반떼");
		System.out.println("isempty: " + stack.isEmpty());
		stack.printStack();
		stack.pop();
		stack.push("소나타");
		stack.push("제네시스");
		stack.printStack();
		System.out.println(stack.top());
		
		int []arr = {8,6,4,2,9,7,3,1,5};
		BubbleSort bubble = new BubbleSort(arr);
		bubble.sort();
		
		System.out.println(bubble.print());
	}
}
