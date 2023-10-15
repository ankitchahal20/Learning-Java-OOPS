/*package whatever //do not write package name here */

import java.io.*;

/*
static method : These are also known as the class-level methods. 
To make any method static, static keyword will be placed before the return type.

class Test {
    static void m1(){
        
    }
}

1 ) static methods is invoked by the class name outside the class.

2 ) In the static method, we can never access the non-static members directly because
"static method is not invoked by the object so implicitly there is no ref id available in the static method"

3 ) we can never use the this keyword in the static menthod.

4 ) In the static menthods, we can only acess the other static member of the same class directly.

*/


class Test {
    int x;
    static int y;
    
    static void m1(){
        //x=50; // compliation error as static methods can not access the non-static members directly
        y=y+150;
    }
    
    void set(int val){
        x=val;
        y=y+val;
    }
    
    void show(){
        System.out.println("X : "+x);
        //System.out.println("Y : "+y); correct only
    }
}

class StaticMethods {
    public static void main(String []args){
        Test t1=new Test();
        Test t2=new Test();
        
        Test.m1();
        Test.m1();
        
        
        t1.set(50);
        t2.set(60);
        t1.show();
        t2.show();
        System.out.println("Value of y : "+Test.y); // accessing the static variable with class name.
    }
}

