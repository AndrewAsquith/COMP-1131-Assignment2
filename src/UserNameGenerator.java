//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 2 
// User Name Generator Class
//
// This class is used for the actual generation of the user name in the specified format
// currently only a single format "generate" method is provided
// 
//==============================================

//import the random number generator class
import java.util.Random;

public class UserNameGenerator {

	//internal random number generator
	private Random numberGenerator;

	//since the class can be re-used initialize the random number generator in the constructor
	//could have made the generate method static, and put this initialization there 
	//but that's not as friendly should we desire unit tests or need to refactor 
	//this class to provide more formats
	public UserNameGenerator() {
		numberGenerator = new Random();
	}

	//given a first and last name, return a string in the format of first initial
	//first 5 letters from last name and a random 2 digit number between 10 and 99
	public String generate(String firstName, String lastName) {

		//the resulting generated name
		String generatedName;

		//generate the next random number from 10-99
		int numberSuffix = numberGenerator.nextInt(90) + 10;
		
		//combine the first letter of first name, up to 5 letters of last name, and the random number
		//also upper cases the first character of the first and last names to make it look pretty
		//in case the user entered it all lower case
		generatedName = firstName.substring(0, 1).toUpperCase() 	//first initial upper cased
					+ lastName.substring(0, 1).toUpperCase() 		//first letter of last name upper cased
					+ lastName.substring(1, 
							Math.min(5,  lastName.length())) 		//up to 4 more characters of last name
					+ numberSuffix; 								//and the random number

		//return the result to the caller
		return generatedName;
	}
}