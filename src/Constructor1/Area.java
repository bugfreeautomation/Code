package Constructor1;
/*
 * Encapsulation with constructor and setters
 * 
 * All fields are private and not exposed
 * Validation is done
 * All implementation is confined to class Wall
 * No manipulation is done with the methods and fields of class Wall outside Wall
 */

public class Area {

	public static void main(String[] args) {

		Wall wall = new Wall(5.0, 4.0);

		Double height = wall.getHeight(); 
		Double width = wall.getWidth();
		//Double area = wall.getArea(height, width); NOT POSSIBLE TO DIRECTLY SET WIDTH N HEIGHT
		//OBJECT VALIDATION IS NEEDED FIRST
		
		Double area = wall.getArea();
		System.out.println(area);

	}

}
