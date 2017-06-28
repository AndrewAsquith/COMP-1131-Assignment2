// Assignment 2 
// Sphere Calculator Application 
//
// This is the main entry point for the sphere calculator.
// It prompts for the radius of a sphere, calculates the surface area and volume
// and prints the result.
// 
//==============================================

//import the formatting and scanner classes
import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Scanner;

public class SphereCalculator {

	public static void main(String[] args) {

		// user supplied radius
		double radius;

		// resulting volume and surface area
		double volume, surfaceArea;

		// user supplied non numeric input
		String nonNumericInput;

		/// input scanner
		Scanner inputReader = new Scanner(System.in);

		// volume and surface area should both be 4 decimal places
		NumberFormat formatter = new DecimalFormat("0.####");

		while (true) {

			// prompt for the radius
			System.out.print("Enter radius or \"quit\" to exit: ");

			if (inputReader.hasNextDouble()) {

				// get the user supplied value
				radius = inputReader.nextDouble();

				// clear any remaining input
				inputReader.nextLine();

				// force the use of doubles for the math with .0 or a cast
				// volume is 4/3 pi r^3
				volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);

				// surface area is 4 pi r^2
				surfaceArea = (double) 4 * Math.PI * Math.pow(radius, 2);

				// print out the results
				System.out.println("Volume of a sphere with radius " + radius + " is " + formatter.format(volume));

				System.out.println(
						"Surface area of a sphere with radius " + radius + " is " + formatter.format(surfaceArea));

			} else {
				
				// user did not supply a valid radius
				nonNumericInput = inputReader.next();
				//discard the rest of their input and advance the scanner
				inputReader.nextLine();

				if (nonNumericInput.toLowerCase().equals("quit")) {
					// if they wanted to quit, do so
					break;
				} else {
					// otherwise print input is invalid and start again
					System.out.println("\"" + nonNumericInput + "\" is invalid, please provide a number for radius");
				}
			}

			// add a blank line to break up the output in the loop
			System.out.println();
		}
		// close the input stream
		inputReader.close();
		// and say Goodbye!
		System.out.println("Goodbye!");

	}
}