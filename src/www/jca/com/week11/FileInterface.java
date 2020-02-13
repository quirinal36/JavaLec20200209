package www.jca.com.week11;

public interface FileInterface {
	/*
	 * 추상 메소드 4개
	 **/
	public void writeFile(String title, String content);		/* 새 파일 만들기 */
	public String readFile(String title);						/* 파일 읽기*/
	public void appendFile(String title, String content);		/* 파일 수정*/
	public boolean deleteFile(String title);					/* 파일 삭제*/
}
