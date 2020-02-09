package www.jca.com.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileControl {

	public void writeFile(String title, String content) {
		File newFile = new File(title);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))){
			writer.write(content);
			System.out.println(newFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String readFile(String title) {
		StringBuilder result = new StringBuilder();
		File storedFile = new File(title);

		try(BufferedReader reader = new BufferedReader(new FileReader(storedFile))){
			String line;
			while((line = reader.readLine()) != null) {
				result.append(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		return result.toString();
	}
	public void appendFile(String title, String content) {
		File storedFile = new File(title);

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(storedFile, true))){
			writer.append(content);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public boolean deleteFile(String title) {
		boolean result = false;
		File storedFile = new File(title);

		if(storedFile.exists()) {
			result = storedFile.delete();
		}

		return result;
	}

}
