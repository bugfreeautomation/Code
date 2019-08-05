package ComparableBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * only reference (address in memory) is copied from al1 to al2, 
 * They will both refer to the same object. 
 */
public class MethodsOnLists {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		List<Integer> al2 = new ArrayList<>(al);
		Collections.sort(al2);

		for (Integer i : al) {
			System.out.println(i);
		}

		// we sorted al2
		// but and printed al
		// al was sorted too

		// Creating a shallow copy is pretty easy though
		System.out.println("---------------------------------------------------");

		
		List<Integer> al3 = new ArrayList<Integer>();
		al3.add(10000);
		al3.add(0);
		al3.add(2);
		al3.add(3);
		al3.add(4);

		ArrayList<Integer> newArrayList = (ArrayList<Integer>) ((ArrayList) al3).clone();

		System.out.println(newArrayList);

		Collections.sort(al3);

		for (Integer i : newArrayList) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------");

		for (Integer i : al3) {
			System.out.println(i);
		}
		System.out.println("---------------------more methods------------------------------");

		// MORE METHODS
		
		System.out.println(Collections.min(al3));
		System.out.println(Collections.max(al3));
		Collections.shuffle(al3);
		System.out.println(al3);
		//
		
		if(al.get(1)>al.get(0)){
			
			Collections.swap(al, 0, 1);
		}
		
		System.out.println(al);

		

	}

}
