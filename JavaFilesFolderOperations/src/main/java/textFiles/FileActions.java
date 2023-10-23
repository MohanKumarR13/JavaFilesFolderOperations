package textFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
//Create the File
	public static void createFile(String filePath) {
		File file = new File(filePath);
		try {
			if (file.createNewFile()) {
				System.out.println("File Created : " + file.getName());
			} else {
				System.out.println("File is Already Exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Writing Data Into File
	public static void writeFile(String filePath) {
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			fileWriter.write("Welcome");
			fileWriter.close();
			System.out.println("Successfully Wrote the File");
		} catch (IOException e) {
			System.out.println("An Error Occured....");
			e.printStackTrace();
		}
	}

//Reading the Data From File
	public static void readFile(String filePath) throws FileNotFoundException {
		try {
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("An Error Occured While Reading...");
			e.printStackTrace();
		}
	}

	// Rename the File
	public static void renameFile(String oldFilePath, String newFilePath) {
		File oldFile = new File(oldFilePath);
		File newFile = new File(newFilePath);

		if (oldFile.renameTo(newFile)) {
			System.out.println("File is Renamed");
		} else {
			System.out.println("The File Cannot be Renamed");
		}

	}

//Delete the File
	public static void deleteFile(String filePath) {
		File file = new File(filePath);
		if (file.delete()) {
			System.out.println("Deleted the File " + file.getName());
		} else {
			System.out.println("Failed to Delete the File");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		String file = "C:\\MyFolder\\Sample.txt";
		createFile(file);
		writeFile(file);
		readFile(file);
		String newFilePath = "C:\\MyFolder\\Sample1.txt";
		renameFile(file, newFilePath);
		deleteFile(newFilePath);

	}

}
