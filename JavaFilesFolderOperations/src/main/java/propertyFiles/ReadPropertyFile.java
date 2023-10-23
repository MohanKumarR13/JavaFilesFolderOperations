package propertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";
		FileInputStream fileInputStream = new FileInputStream(filePath);
		properties.load(fileInputStream);
		fileInputStream.close();
//Ready Data From Properties File
		Object name = properties.get("name");
		Object email = properties.get("email");
		Object age = properties.get("age");
		System.out.println(name + " " + email + " " + " " + age);
		// Capture All the Properties Method 1
		Set<String> keys = properties.stringPropertyNames();// method1
		System.out.println(keys);

//Capture All the Properties Method 2
		Set<Object> allKeys = properties.keySet();// method2
		System.out.println(allKeys);

//Capture All the Values
		Collection<Object> values = properties.values();
		System.out.println(values);
//Read the All the Properties and their values
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " " + properties.getProperty(key));
		}
	}

}
