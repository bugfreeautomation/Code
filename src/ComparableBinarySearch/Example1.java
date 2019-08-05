package ComparableBinarySearch;
/*
 * Searching an int key (value = 10) in a list sorted in ascending order:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	
	public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(10); 
        al.add(20); 
  
        // 10 is present at index 3. 

        int index = Collections.binarySearch(al, 10);
        System.out.println(index);
        
       // 13 is not present. 13 would have been inserted 
        // at position 4. So the function returns (-4-1)  
        // which is -5.  
        
        index = Collections.binarySearch(al, 13);
        System.out.println(index);

        
        
    } 

}
