package Genericbasics;
/*
 * added in java 5
 * Therefore, when reading each element, one by one and in order, 
 * a foreach should always be chosen over an iterator, as it is more convenient and concise.
 */

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {

		ArrayList <Integer> arr = new ArrayList<Integer>();
		//arr.add("cat");
		arr.add(40);
		arr.add(50);
		arr.add(100);

		
		// look at the yellow warnings

		System.out.println("*******************************");

		print(arr);

	}

	private static void print(ArrayList<Integer> arr) {
		for (Object i : arr) {
			// no compilation error, but we get error at run time, if cat is not commented out
			// Because we are trying to convert integer to string, but cat is not a integer
              System.out.println(Integer.toString((int) i)); 

		}
	}

}
