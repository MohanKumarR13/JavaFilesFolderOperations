package jsonFiles;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingDataFromJSONUsingJacksonLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File(".\\data\\employee.json");
		// Read JSON data from the file and map to Person Class
		Person person = objectMapper.readValue(file, Person.class);
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
