package www.jca.com.datastructure;

public interface StackInterface<T> {
	public T top();					// 가장 위에 저장된 자료를 읽어온다.
	public void pop();				// 가장 위에 저장된 자료를 삭제한다.
	public void push(T input);		// 가장 위에 값을 밀어넣는다.
	public boolean isEmpty();		// 스택이 비어있는지 확인한다.
	public void printStack();		// 현재 스택 안에 있는 내용을 순서대로 출력한다.
	public int size();				// 스택의 길이를 확인한다.
	public void removeAll();		// 스택 안에있는 모든 내용물을 지운다.
}
