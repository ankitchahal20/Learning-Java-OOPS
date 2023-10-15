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

class Test{
    static void m1(){
        Student st=new Student(); // object created
        st.addmission(101);
        st.exam(99);
        st.report();
    }
}

class StaticFunctionDemo {
	public static void main (String[] args) {
		System.out.println("Main started");
		Test.m1(); // method calling, m1() is the static member in the Test class
		System.out.println("Main over");
	}
}

