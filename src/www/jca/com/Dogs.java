package www.jca.com;

public class Dogs {
	protected String name;
	private String length;
	public String age;
	protected String height;
	
	public void eat(String what) {
		System.out.println(name + " �� " + what +"��(��) �Խ��ϴ�.");
	}
	
	public void run(String forWhom) {
		System.out.println(name +" �� " + forWhom +"�Բ� �޷����ϴ�.");
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		// �˻� : length �� 0 ���� ũ��? 
		this.length = length;
	}
}