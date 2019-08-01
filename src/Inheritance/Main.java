package Inheritance;

/*
 * If the super class constructor has no arguments Java automatically calls it for you.
 * If it has arguments you'll get an error.
 *  
 *  
 * When you create an instance of child class MyInheritedClass, 
 * runtime will call the constructor of Parent class MyInheritedClass 
 * first to allocate the memory for the member of parent class and 
 * then child class constructor will be invoked.
 */

public class Main {

	public static void main(String[] args) {

		Vehicle p = new Porche(1, 2, 40);

		p.changeGear();
		p.changeSpeed();

	}

}
