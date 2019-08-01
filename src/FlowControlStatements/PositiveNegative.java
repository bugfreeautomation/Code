package FlowControlStatements;

import java.util.Scanner;

/*
 * Write a Java program to get a number from the user 
 * and print whether it is positive or negative
 */

public class PositiveNegative {

	public static void main(String[] args) {

		String result = getInput();
		System.out.println(result);
	}

	public static String getInput() {

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter number: ");

		int number = s.nextInt();

		if (number > 0) {
			return "number is positive";
		}

		else if (number < 0) {

			return "number is negative";
		} else {
			return "number is 0";
		}

	}

}
