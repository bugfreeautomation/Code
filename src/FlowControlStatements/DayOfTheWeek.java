package FlowControlStatements;

import java.util.Scanner;

/*
 * Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
 * and displays the name of the weekday.
 */

/*
 * notes:
 * In Java, class and instance variables assume a default value (null, 0, false) 
 * if they are not initialized manually. 
 * However, local variables don't have a default value.
 * 
 * Local variables and primitives should be initialized before use 
 * because you would know what to expect from the values. 
 * Historically, when a new variable was created it would contain random values from the memory
 */

public class DayOfTheWeek {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Input number: ");
		int num = s.nextInt();

		String result = calculateDayOfTheWeek(num);

		System.out.println("Day of the week: " + result);
	}

	private static String calculateDayOfTheWeek(int num) {
		String Day = null;

		switch (num) {

		case 1:

			Day = "Monday";
			System.out.println("Monday");
			break;
		case 2:
			Day = "Tuesday";
			System.out.println("Tuesday");
			break;
		case 3:
			Day = "Wednesday";
			System.out.println("Wednesday");
			break;
		case 4:
			Day = "Thursday";
			System.out.println("Thursday");
			break;
		case 5:
			Day = "Friday";
			System.out.println("Friday");
			break;
		case 6:
			Day = "Saturday";
			System.out.println("Saturday");
			break;
		case 7:
			Day = "Sunday";
			System.out.println("Sunday");
			break;

		}
		return Day;
	}

}