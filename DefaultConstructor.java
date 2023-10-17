import java.io.*;

/*

Default constructor: is also known as no-argument constructor.
A constructor with no-argument is called as the Default constructor.

*/

class Student {
    int rollno, marks; 
    
    // constructor
    Student(){
        System.out.println("constructor with no arugments is called");
        rollno = 101;
        marks =99;
    }
    
    void report(){
        System.out.println("RollNo : "+rollno);
        System.out.println("Marks  : "+marks);
    }
}

class DefaultConstructor {
    public static void main(String []args){
        Student s1=new Student(); // object creation ---> calling default constructor
        // Normal object creation invokes to the default constructor internally
        s1.report();
        Student s2=new Student();
        s2.report();
    }
}

/*

If we dont create any constructor in any class, then comppiler provides the default constructor implicitly
in the byte code of that class.
*/
