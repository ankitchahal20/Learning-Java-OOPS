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
		
		// making more than one object of the same class
		Student s2; // std is called as reference varaible
		s2= new Student(); // new is the keyword used to create the object;
		s2.addmission(102);
		s2.exam(96);
		s2.report();
	}
}

/*

In Order to use the non-static members, we have to make the object first 
i.e. non-static members are totally belongs to the object.

Static members are known as the class members itself, so no need to create 
the object to access the static members.

Main method is alway static in the java class, so no need to create the object to 
invoke & get the output of the main method.


Reference Variable : are the variable that alway belongs to any specific class.
Reference variable are used to hold the reference id of the object.
The reference id of object is alway generated by the Java Run Time environment(JVM) by the actual 
address of the object.

In Java, each & every object alway have their different reference id(made by address).

---------------------
|  rollno           |
|  marks            |
|___________________|
|  addmission(int)  |
|  report()         |
|  exam(int)        |
|                   |
|                   |
|                   |    
|___________________|
 Class Diagram
*/
