package FlowControlStatements;
/*
 *
       1
      2 2
     3 3 3
    4 4 4 4 
 */

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int i, j, n, x;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		int space = n-1; //3
		
		for(i = 1; i <= n; i++) 
		   {
			for(x = 1; x<=space; x++) {
				System.out.print("@");
			}
			for(j = 1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
			space--;
		}
	}

}
