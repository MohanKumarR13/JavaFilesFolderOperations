package jsonFiles;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.google.gson.Gson;

public class ReadingDataFromJSONUsingGsonLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fileReader = new FileReader(".\\data\\employee.json");
		Gson gson = new Gson();
		// Read JSON data from the file and map to Person Class
		Person person = gson.fromJson(fileReader, Person.class);
		// Access Data
		System.out.println("First Name:" + person.getFirstName());
		System.out.println("Last Name:" + person.getLastName());

		System.out.println("Addresses.......");
		for (Address address : person.getAddress()) {
			System.out.println("Street:" + address.getStreet());
			System.out.println("City:" + address.getCity());
			System.out.println("State:" + address.getState());

		}

	}

}
