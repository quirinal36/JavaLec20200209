package www.jca.com.week9;

import www.jca.com.Dogs;

public class Hound extends Dogs {
	
	public Hound(String name) {
		super.name = name;
	}
	/**
	 * �Ѿư���
	 * 
	 * @param target : ��ǥ��
	 */
	public void chase(String target) {
		run(target);
	}
}
