package www.jca.com;

public class Dogs {
	protected String name;
	private String length;
	public String age;
	protected String height;
	
	public void eat(String what) {
		System.out.println(name + " 가 " + what +"을(를) 먹습니다.");
	}
	
	public void run(String forWhom) {
		System.out.println(name +" 가 " + forWhom +"님께 달려갑니다.");
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		// 검사 : length 가 0 보다 크니? 
		this.length = length;
	}
}