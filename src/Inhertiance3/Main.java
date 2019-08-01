package Inhertiance3;

/*
 * 
 * So, think how to avoid code deduplication and make use of inheritance
 * Rect has w and l but no h
 * Cube had w, l and h
 * We made use of super class fields w and l for cube
 * 
 * Inheritance allows us to reuse of code, it improves reusability 
 * in your java application. Note: The biggest advantage of Inheritance 
 * is that the code that is already present in base class need not be 
 * rewritten in the child class.
 */

public class Main {

	public static void main(String[] args) {
	
		
		Cuboid c = new Cuboid(2, 2, 5);
		
		System.out.println(c.getVolume());
	}

}
