//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 2 
// Username Generator Application Runner
//
// This program is the main entry point for the username generator.
// It prompts for a first and last name, hands the input off to the 
// generator class and prints the result.
// 
//==============================================

//import the Scanner class
import java.util.Scanner;

public class UserNameGeneratorRunner {

	public static void main(String[] args) {

		// user input scanner
		Scanner inputReader = new Scanner(System.in);

		String firstName, lastName;
		
		//our name generator is re-usable, so we just create one instance and re-use it 
		//if the user goes through the loop several times
		UserNameGenerator nameGenerator = new UserNameGenerator();
		
		while (true) {

			// get the user's first name - we'll assume everything they entered should be used
			System.out.print("Enter first name or \"quit\" to exit: ");
			firstName = inputReader.nextLine();

			//if they entered "quit" exit the program
			if (firstName.equals("quit")) {
				break;
			}
			
			// get the user's last name - we'll assume everything they entered should be used
			System.out.print("Enter last name or \"quit\" to exit: ");
			lastName = inputReader.nextLine();
			
			//if they entered "quit" exit the program
			if (lastName.equals("quit")) {
				break;
			}
			
			if (firstName.equals("") || lastName.equals("")) {
				
				//if the user just hit enter instead of typing a name, tell them to try again
				System.out.println("Please provide both a first and last name");
				
			} else {
				
				System.out.print("Generated username is: ");

				// print the generated name
				System.out.println(nameGenerator.generate(firstName,  lastName));

			}

			
			//add a blank line to break up the output in the loop
			System.out.println();
		}
		//Close the input stream
		inputReader.close();
		//and say Goodbye!
		System.out.println("Goodbye!");
	}
}