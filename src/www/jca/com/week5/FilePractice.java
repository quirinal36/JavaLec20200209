package www.jca.com.week5;

public class FilePractice {

	public static void main(String[] args) {
		FileControl control = new FileControl();
		final String fileName = "test.txt";
		final String content = "hello world";
		
		control.writeFile(fileName, content);
	}

}
