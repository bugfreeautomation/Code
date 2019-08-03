package Genericbasics;
/*
 * added in java 5
 * Therefore, when reading each element, one by one and in order, 
 * a foreach should always be chosen over an iterator, as it is more convenient and concise.
 */

import java.util.ArrayList;

public class WhyGenerics {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		arr.add("cat");
		arr.add("dog");
		arr.add("monkey");
		arr.add(100);

		
		// look at the yellow warnings

		System.out.println("*******************************");

		print(arr);

	}

	private static void print(ArrayList arr) {
		for (Object i : arr) {
			// no compilation error, but we get error at run time
			//java.lang.NumberFormatException: For input string: "cat"
			// as we are trying to convert string to integer
              System.out.println(Integer.parseInt((String) i)); 

		}
	}

}
