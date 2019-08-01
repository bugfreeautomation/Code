package FlowControlStatements;

import java.util.Scanner;

public class NumberOrder {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1 = s.nextInt();
		System.out.println("Enter num2: ");
		int num2 = s.nextInt();
		System.out.println("Enter num3: ");
		int num3 = s.nextInt();
		
		
		if (num1<num2 && num2<num3) {
			System.out.println("Increasing");
		}
		else if (num1>num2 && num2>num3) {
			System.out.println("Decreasing");
			
		}
		
		else {
			System.out.println("neither");
		}

	}

}
