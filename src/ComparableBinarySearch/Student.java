package ComparableBinarySearch;

/*
 * 
 * If you are using the binary search method for an Object array, 
 * the elements of the array must either implement the Comparable interface
 * 
 * For any class to support natural ordering,
 * it should implement the Comparable interface and override it’s compareTo() method. 
 * It must return a negative integer, zero, or a positive integer
 * as this object is less than, 
 * equal to, 
 * or greater than the specified object.
 */
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
    public int compareTo(Student st) {
        //let's sort the student based on age in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
       // return (this.age - st.age);
		
		//also can be sorted in natural order based on string
        return this.name.compareTo(st.name); //:))
    }

	/*public int compareTo(Student st) {

		//natural ordering maintained
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}*/
}