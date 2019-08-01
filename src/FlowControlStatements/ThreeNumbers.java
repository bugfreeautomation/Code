package FlowControlStatements;

import java.util.Scanner;

/*
 * Take three numbers from the user and print the greatest number
 */

public class ThreeNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Input the 1st number: ");
		int number1 = s.nextInt();
		System.out.println("Input the 2nd number: ");
		int number2 = s.nextInt();
		System.out.println("Input the 3rd number: ");
		int number3 = s.nextInt();

		int result = findGreatestNumber(number1, number2, number3);
		System.out.println("The greatest: " + result);

	}

	private static int findGreatestNumber(int number1, int number2, int number3) {

		int result = 0;

		if (number1 > number2 && number1 > number3) {
			result = number1;
		} else if (number2 > number1 && number2 > number3) {
			result = number2;
		} else {

			result = number3;
		}

		return result;
	}

}
