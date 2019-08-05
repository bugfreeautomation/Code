package ComparableBinarySearch;
/*
 * // binarySearch() in an array sorted in descending order. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
	
	public static void main(String[] args) 
    { 
        List<String> al = new ArrayList<String>(); //String array not onject array, else you will need comparable
        al.add("night"); 
        al.add("day"); 
        al.add("apple"); 
        al.add("banana"); 
        al.add("icecream");
  
        int index = Collections.binarySearch(al, "apple", Collections.reverseOrder()); 
        System.out.println("Found at index " + index); 

        
        
    } 

}
