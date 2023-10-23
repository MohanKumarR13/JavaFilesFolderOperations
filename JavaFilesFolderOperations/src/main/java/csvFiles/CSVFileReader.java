package csvFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReader {
	public static void usingScanner() throws FileNotFoundException {

		// Using Scanner
		File file = new File(System.getProperty("user.dir") + "\\data\\example.csv");
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(" , ");
		while (scanner.hasNext()) {
			System.out.println(scanner.next() + "\t");
		}
		scanner.close();
	}

	public static void splitmethod() throws IOException {
		// Using Java Split Method
		String csvFileName = System.getProperty("user.dir") + "\\data\\example.csv";
		FileReader reader = new FileReader(csvFileName);
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			String[] data = line.split(" , ");
			for (String value : data) {
				System.out.println(value + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		usingScanner();
		splitmethod();
	}

}
