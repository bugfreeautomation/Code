package FlowControlStatements;
/*
1
22
333
4444

 */

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args)

	{
		int i, j, n;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		for (i = 1; i <= n; i++) 
		{
			for (j = 1; j <= i; j++) 
			{ // if u omit curly braces then only first stmt after for loop is executed
			 // so in this case doesn't matter
				System.out.print(i);
			}
			System.out.println("");

		}

	}
}