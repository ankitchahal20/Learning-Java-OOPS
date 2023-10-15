/*package whatever //do not write package name here */

import java.io.*;

/*
static is the keyword in the java that works as the modifier.
static int y; memory for this variable will be allocated inside class and it will chnage the normal working of a variable.

1 ) static variables will be declared at the class level
class Test {
    static int x;
    // other methods and variables
}

2 ) static varibales can never be declared at the local level (inside methods)

class Test{
    void m1(){
        static int x; // compliation error
    }
}

3 ) static varibale also have their default values.

4 ) static variable is not created during the object creation of a class, i.e. static variable does not get the memory at the time of object creation.

5 ) static variable always gets the memory only when the class is loaded, i.e. only one copy of static variable is created throughtout the program.

6 ) All the objects of the class uses the single copy of static variable that means static variable is shared among all the objects of a class.

7 ) static variable always get the memory in the class area within the JVM.

*/


class Test {
    int x;
    static int y;
    
    void set(int val){
        x=val;
        y=y+val;
    }
    
    void show(){
        System.out.println("X : "+x);
        //System.out.println("Y : "+y); correct only
    }
}

class StaticVariables {
    public static void main(String []args){
        Test t1=new Test();
        Test t2=new Test();
        t1.set(2);
        t1.show();
        t2.set(4);
        t2.show();
        System.out.println("Value of y : "+Test.y); // accessing the static variable with class name.
    }
}

