package ComparableBinarySearch;

import java.util.*;

public class Main {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(101, "Vijay", 23));

		al.add(new Student(106, "Ajay", 27));

		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		
		int index_of_jai = Collections.binarySearch(al, new Student(105, "Jai", 21));
		
		System.out.println(index_of_jai);

		for (Student st : al) {

			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
	
}