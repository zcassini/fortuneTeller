package fortuneTeller;

import java.util.*;

/**
 * @author Zac Cassini
 *
 */
public class FortuneTeller {
	public static void main(String[] args) {		
		Person person = new Person();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		person.firstName(getResponse(input));
		
		System.out.println("Enter your Last Name:");
		person.lastName(getResponse(input));
		
		System.out.println("Enter your Age:");
		try {
			person.age(Integer.parseInt(getResponse(input)));
	    } catch (NumberFormatException nfe) {
	        person.age(0);
	    }
		
		System.out.println("Enter the number of your Birth Month:");
		try {
			person.birthMonth(Integer.parseInt(getResponse(input)));
	    } catch (NumberFormatException nfe) {
	        person.birthMonth(0);
	    }
		
		System.out.println("Enter your Number of Siblings:");
		try {
			person.numberOfSiblings(Integer.parseInt(getResponse(input)));
	    } catch (NumberFormatException nfe) {
	        person.numberOfSiblings(0);
	    }
		
		System.out.println("Enter your Favorite Color:");
		person.favoriteColor(getColorResponse(input));
		
		input.close();
		
		System.out.println(person.fortune());
		

	}
	
		
	public static String getResponse(Scanner input) {
		String response = input.nextLine();
		
		if (response.toLowerCase().equals("quit")) { System.exit(0); }

		return response;
	}
	
	public static String getColorResponse(Scanner input) {
		String response = input.nextLine().toLowerCase();
		if (response.equals("quit")) { System.exit(0); }
		
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		colors.add("indigo");
		colors.add("violet");
		
		
		while (!colors.contains(response)) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			response = input.nextLine().toLowerCase();
		}
		
		return response;
	}
}
