// Assignment 2 
// Distance Calculator Application 
//
// This is the main entry point for the distance calculator.
// It prompts for two sets of points, calculates the distance and prints the result.
// 
//==============================================

//import the Scanner class
import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {

		// containers for user input
		String firstPoint, secondPoint, invalidInput;

		// resulting points to be used
		int x1, y1, x2, y2;

		// scanners for system.in and parsing input
		Scanner inputReader = new Scanner(System.in);
		Scanner inputParser;

		while (true) {

			// get the first set of coordinates from the user
			System.out.print("Enter the first set of coordinates (x,y) or \"quit\" to exit: ");
			firstPoint = inputReader.nextLine();

			// if they entered a variation of quit then exit
			if (firstPoint.toLowerCase().equals("quit")) {
				break;
			}

			// if there's brackets, remove them
			firstPoint = firstPoint.replace("(", "");
			firstPoint = firstPoint.replace(")", "");

			// setup a scanner to parse out the x and y
			inputParser = new Scanner(firstPoint);
			// use the comma as the delimiter so the scanner will skip it
			inputParser.useDelimiter(",");

			// if there's an integer available, use it, otherwise default to 0
			// with a message
			if (inputParser.hasNextInt()) {
				x1 = inputParser.nextInt();
			} else {
				//user may not have just hit enter, if not
				if (inputParser.hasNext()) {
					// get the invalid input to echo it back
					invalidInput = inputParser.next();
				} else {
					//otherwise set the invalid input to an empty string for the error message
					invalidInput = "";
				}

				System.out.println("Invalid x1 input (" + invalidInput + ") using 0 instead");
				x1 = 0;
			}

			// if there's an integer available, use it, otherwise default to 0
			// with a message
			if (inputParser.hasNextInt()) {
				y1 = inputParser.nextInt();
			} else {
				
				//user may not have entered more than 1 point
				if (inputParser.hasNext()) {
					// get the invalid input to echo it back
					invalidInput = inputParser.next();
				} else {
					//set the invalid input to an empty string for the error message
					invalidInput = "";
				}

				System.out.println("Invalid y1 input (" + invalidInput + ") using 0 intead");
				y1 = 0;
			}

			// get the second set of coordinates from the user
			System.out.print("Enter the second set of coordinates (x,y) or \"quit\" to exit: ");
			secondPoint = inputReader.nextLine();

			// if they entered a variation of quit then exit
			if (secondPoint.toLowerCase().equals("quit")) {
				break;
			}

			// if there's brackets, remove them
			secondPoint = secondPoint.replace("(", "");
			secondPoint = secondPoint.replace(")", "");

			// setup a scanner to parse out the x and y
			inputParser = new Scanner(secondPoint);

			// use the comma as the delimiter so the scanner will skip it
			inputParser.useDelimiter(",");

			// if there's an integer available, use it, otherwise default to 0
			// with a message
			if (inputParser.hasNextInt()) {
				x2 = inputParser.nextInt();
			} else {
				//if they entered anything
				if (inputParser.hasNext()) {
					// get the invalid input to echo it back
					invalidInput = inputParser.next();
				} else {
					//if they just hit enter - set the invalid input to an empty string for the error message
					invalidInput = "";
				}

				System.out.println("Invalid x2 input (" + invalidInput + ") using 0 instead");
				x2 = 0;
			}

			// if there's an integer available, use it, otherwise default to 0
			// with a message
			if (inputParser.hasNextInt()) {
				y2 = inputParser.nextInt();
			} else {
				//user may not have entered more than 1 point
				if (inputParser.hasNext()) {
					// get the invalid input to echo it back
					invalidInput = inputParser.next();
				} else {
					//set the invalid input to an empty string for the error message
					invalidInput = "";
				}
				System.out.println("Invalid y2 input (" + invalidInput + ") using 0 intead");
				y2 = 0;
			}

			// print the result
			System.out.print("Distance between (" + x1 + "," + y1 + ")" + " and (" + x2 + "," + y2 + ") is: ");

			// square root of ((x2-x1) squared + (y2-y1) squared))
			System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

			// put a blank line in for spacing in the loop
			System.out.println();

		}
		// close the input stream and say goodbye
		inputReader.close();
		System.out.println("Goodbye!");
	}
}