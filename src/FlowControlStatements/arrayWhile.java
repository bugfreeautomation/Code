package FlowControlStatements;
/*
 * Here we are iterating and displaying array elements using while loop.
 */

public class arrayWhile {

	public static void main(String[] args) {

		
		int[] x = new int[] {22,33,44,55,66};
		
		int size = x.length;
		int i = 0;
		
		while(i<size) {
			System.out.println(x[i]);
			i++;
		}
	}

}