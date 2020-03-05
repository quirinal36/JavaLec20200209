package www.jca.com.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack implements StackInterface<String> {
	List<String> list;
	
	public Stack() {
		this.list = new ArrayList<String>();		
	}
	
	@Override
	public String top() {
		return list.get(list.size()-1);
	}

	@Override
	public void pop() {
		list.remove(top());
	}

	@Override
	public void push(String input) {
		// TODO stack에  값을 입력한다.
		list.add(input);
	}

	@Override
	public boolean isEmpty() {
		return list.size() == 0;
	}
	public void printStack() {
		System.out.println(list.toString());
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}
}
