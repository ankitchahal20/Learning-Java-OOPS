import java.io.*;

/*

Parameterized constructor: A constructor with argument list is called as the Parameterized constructor.

*/

class Student {
    int rollno, marks; 
    
    // constructor
    Student(int rollno, int marks){
        System.out.println("constructor with arugments list is called");
        this.rollno = rollno;
        this.marks = marks;
    }
    
    void report(){
        System.out.println("RollNo : "+rollno);
        System.out.println("Marks  : "+marks);
    }
}

class ParameterizedConstructor {
    public static void main(String []args){
        Student s1=new Student(101, 99); // object creation ---> calling default constructor
        // Normal object creation invokes to the default constructor internally
        s1.report();
        Student s2=new Student(102, 87);
        s2.report();
        
    }
}

/*
if we create any constructor in our class, then Compiler does not provide the default constructor.
Student s2=new Student(); // error as no default constructor is provided by constructor.
*/
