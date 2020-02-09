package www.jca.com.week9;

import www.jca.com.Dogs;

public class Hound extends Dogs {
	
	public Hound(String name) {
		super.name = name;
	}
	/**
	 * 쫓아가다
	 * 
	 * @param target : 목표물
	 */
	public void chase(String target) {
		run(target);
	}
}
