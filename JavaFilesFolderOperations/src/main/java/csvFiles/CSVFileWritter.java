package csvFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWritter {

	public static void main(String[] args) throws IOException {
		String csvFileName = System.getProperty("user.dir") + "\\data\\example.csv";
		FileWriter writer = new FileWriter(csvFileName);
		writer.append("Name,Age,Email \n");
		writer.append("John,30,john@gmail.com \n");
		writer.append("Vicky,20,vicky@gmail.com \n");
		writer.append("Robert,25,robert@gmail.com \n");
		writer.close();
		System.out.println("CSV FIle Created At :" + csvFileName);

	}

}
