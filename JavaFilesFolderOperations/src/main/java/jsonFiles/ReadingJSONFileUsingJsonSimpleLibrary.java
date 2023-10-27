package jsonFiles;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class ReadingJSONFileUsingJsonSimpleLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader(".\\data\\employee.json");
		// Object object=jsonParser.parse(fileReader);//Convert Json File-->Java Object
		// JSONObject jsonObject=(JSONObject)object;//Java--> Json Object
		JSONObject jsonObject2 = (JSONObject) jsonParser.parse(fileReader);// Convert Json File Into Json Object

		String fname = (String) jsonObject2.get("firstName");
		String lname = (String) jsonObject2.get("lastName");

		System.out.println("First Name:" + fname);
		System.out.println("Last Name:" + lname);

		JSONArray addressArray = (JSONArray) jsonObject2.get("address");
		for (int i = 0; i < addressArray.size(); i++) {
			JSONObject address = (JSONObject) addressArray.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");

			System.out.println(street + "\t" + city + "\t" + state);

		}

	}

}
