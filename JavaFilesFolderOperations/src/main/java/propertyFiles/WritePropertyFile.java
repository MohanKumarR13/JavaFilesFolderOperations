package propertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.setProperty("name", "Mohan");
		properties.setProperty("email", "mohan@gmail.com");
		properties.setProperty("age", "18");

		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";

		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		properties.store(fileOutputStream, "Sample Data in Properties File");
		fileOutputStream.close();
		System.out.println("Properties have been written into " + filePath);

	}

}
