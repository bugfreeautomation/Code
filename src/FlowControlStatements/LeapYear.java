package FlowControlStatements;
/*
 * Write a Java program that takes a year from user 
 * and print whether that year is a leap year or not
 */

/*
 * note: Hence, Leap year is the year whose number is perfectly divisible by 4
 *  - except for years which are both divisible by 100 and not divisible by 400
 */

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Input number: ");
		int num = s.nextInt();

		leapYear(num);

	}

	private static void leapYear(int num) {

		if (num % 4 == 0) {
			if (num % 100 == 0 && num % 400 != 0) {
				System.out.println("not a leap year");
			} else {
				System.out.println("leap year");
			}

		} else {
			System.out.println("not a leap year");
		}

	}

}