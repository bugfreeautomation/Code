package FlowControlStatements;
/*
1
2 3
4 5 6
7 8 9 10 

 */

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args)

	{int k = 1;
		int i, j, n;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		for (i = 1; i <= n; i++) 
		{
			for (j = 1; j <= i; j++) 
			{
				System.out.print(k++);
				
			}
			//System.out.print(i);
			System.out.println("");

		}

	}

}
