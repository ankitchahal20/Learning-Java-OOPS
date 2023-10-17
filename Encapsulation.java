import java.io.*;

/*

Encapsulation is one of the important concept of oops.

It says that the properties of the object will alway be assessed by the behaviour of that object.
That means, the data members(instance variable or properties or attributes) of an object should 
be wrapped by the behaviour of that object. 


*/

class Student {
    int rollno, marks; 
    void setRollNumber(int r){
        this.rollno=r;
    }
}

class Encapsulation {
    public static void main(String []args){
        Student s1 = new Student();
        s1.rollno=101; // Encapsulation is breaking here bcoz we are directly assessing the properties of an object.
        
        Student s2 = new Student();
        s2.setRollNumber(101); // Encapsulation is not breaking here bcoz we are assessing the properties of an object
        // using the behaviour of an object, which is totally fine.
    }
}

/*

Benefit of Encapsulation : is that the manipulation in the state of an object is alway performed in the way 
as the developer of the class of that object wants.

Enforcing the Encapsulation means that in the user class directly assessing the properties of the object is not allowed.

How do you enforce Encapsulation?
By making the data members(properties) of the object as private, we can enforce encapulation.

Class Student{
    private int rollno, marks; // could not be assessed outside of this class.
    
    void setRollNumber(int r){
        this.rollno=r;
    }
}


*/


















