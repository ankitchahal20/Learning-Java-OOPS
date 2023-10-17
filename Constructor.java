import java.io.*;

/*

Constructor : are the special type of methos, that are automatically invoked when the object of the class is created.

Due to automatic invokation of the Constructor, the Constructor are used to intialize the objects.
intializing the object means to intialize the properties of the object with the real world values.

Features of the Constructor:
1. The name of the Constructor will be same as the class name.
2. Constructor do not have the return type.
3. Constructor can never be static, i.e. constructor are alway the non-static members of the class.
4. In the constructor any valid programming statement can be written except the return statement.
5. constructors can also access the private data members of the class.
6. In any class there can be more than one constructors and this process is known as constructor overloading.
7. In th constructors, we can use "this" keyword also.


*/

class Student {
    int rollno, marks; 
    
    // constructor
    Student(){
        System.out.println("constructor with no arugments is called");
    }
    
    Student(int rollno){
        this.rollno = rollno;
        System.out.println("Object Created successfully");
    }
    
    void exam(int marks){
        this.marks=marks;
    }
    
    void report(){
        System.out.println("RollNo : "+rollno);
        System.out.println("Marks  : "+marks);
    }
}

class Constructor {
    public static void main(String []args){
        Student s1=new Student();
        s1.exam(99);
        s1.report();
        Student s2 = new Student(101);
        s2.exam(98);
        s2.report();
    }
}

/*

1.1 object created & intialized with the default values.
1.2 propertry value intialized with the real world values using constructor.


*/
