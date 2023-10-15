/*package whatever //do not write package name here */

import java.io.*;

class Student{
    int rollno, marks; //instance variable
    void addmission(int r){
        rollno = r;
        System.out.println(rollno+ " student enrolled successfully");
    }
    void exam(int m){ // m is local variable
        marks = m;
    }
    void report(){
        System.out.println("RollNo : "+rollno);
        System.out.println("Marks : "+marks);
    }
}

class School {
	public static void main (String[] args) {
		Student s1; // std is called as reference varaible
		s1= new Student(); // new is the keyword used to create the object;
		s1.addmission(101);
		s1.exam(76);
		s1.report();
		
		s1= new Student(); // new is the keyword used to create the object;
		s1.report();
	}
}

/*

Output :
101 student enrolled successfully
RollNo : 101
Marks : 76
RollNo : 0
Marks : 0

At line no L28, the object created at L23 becomes unreferenced object i.e. orphan object.

In any reference varaible, we can hold the reference id od any one object at a time.

Any object whose reference id is not contained by any reference variable is known as un-referenced object.

If any object becomes the unreferenced object, then their reference id can never be objected again in the program, i.e. it becomes the garbage for the application.

IN the JVM, there is the utility known as rge garabage collector, which is responsible to destroy all the un-referenced object from the memory.
Garbage collector is invoked autmatically invoked, we can never start GC explicitly.


Stack Memory : Method Calling.
Heap Memory: Object Creation.

Within the JVM, objects are always created in the heap area and their reference id returned will be stored into the reference variable in stack.

*/
