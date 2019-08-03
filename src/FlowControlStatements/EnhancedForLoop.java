package FlowControlStatements;
/*
 * added in java 5
 * Therefore, when reading each element, one by one and in order, 
 * a foreach should always be chosen over an iterator, as it is more convenient and concise.
 */

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("cat");
		arr.add("dog");
		arr.add("monkey");

		// Traditional
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("*******************************");

		// Enhanced FOREACH loop
		for (String i : arr) {
             // read "i" as element
			// read colon as "in"
			//for each element in arr
			
			
			System.out.println(i);
			// no need to give index, in for-each loop, it will print each element's value in the list
			
		}

	}

}
