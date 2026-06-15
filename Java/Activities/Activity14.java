package activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Activity14 {

	public static void main(String[] args) {
		File file = new File("src/main/java/activities/sample.txt");
		try {
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File created successfully");
				String text = "This is a sample text file.";
				java.nio.file.Files.write(file.toPath(), text.getBytes(Charset.defaultCharset()));
			} else {
				System.out.println("File already exists");
			}
			
			System.out.println("File content:" + java.nio.file.Files.readString(file.toPath()));
			
			File destDir = new File("src/main/java/activities/new_sample.txt");
			java.nio.file.Files.copy(file.toPath(), destDir.toPath());
			File newFile = new File("src/main/java/activities/new_sample.txt");
			String  newFileData = java.nio.file.Files.readString(newFile.toPath());
			System.out.println("New File cpntent: " + newFileData);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
