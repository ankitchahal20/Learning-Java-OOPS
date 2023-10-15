/*package whatever //do not write package name here */

import java.io.*;

/*

Class Loading : is the process at runtime, according to which the JVM loads the classes (.class files)
from the secondary storage into the class area.

When the first object of any class is about to create or first time any static member is accessed by
class name(which ever is earlier), the class immediately gets loaded.

At the time of class loading all static member gets memory, i.e. static variable declaration gets executed.

At the time of class loading, the static blocks of the class also gets invoked after the static variable creation.

There can be more than one static blocks in any class & all are executed at the time of class loading 
in the sequence in which they are declared in the class.

In the static block, we can never use  "this" keyword.

In the static block, we can write any valid java statement that we can write in any method, except return statememt.

*/

class Test {
    static int x;
    int y;
    
    static{
        System.out.println("Test Class loaded successfully !!!");
        x=55;
    }
    
    void set(int val){
        y=val;
        System.out.println("set method invoked !!!");
    }
    
    void show(){
        System.out.println("Y : "+y);
        //System.out.println("Y : "+y); correct only
    }
}

class StaticBlock {
    static {
        System.out.println("StaticBlock Class loaded successfully !!!");
    }
    public static void main(String []args){
        Test t1=new Test();
    
        t1.set(50);
        t1.show();
        System.out.println("Value of x : "+Test.x); // accessing the static variable with class name.
    }
}

