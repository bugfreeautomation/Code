package FlowControlStatements;

import java.util.Scanner;

/*
 * Display the message "Dear Learner", if user press 1. 
 * Otherwise, the 'while' loop terminates.
 */
public class programWhile {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Create a Scanner object
		System.out.println("Input number: ");
		int num = s.nextInt();

		while(num == 1) {
			System.out.println("Dear");
			break;
		}
		
		System.out.println("******");

	}
	

}
