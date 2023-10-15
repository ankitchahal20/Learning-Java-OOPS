/*package whatever //do not write package name here */

import java.io.*;

class Test {
    int x;
    static int y;
    
    static void m1(){
        Test t= new Test(); //by using the new keyword
        t.x=55;
        Test.y=y+150;
        //System.out.println("X : "+x); compliation error
        System.out.println("t.X : "+t.x);
    }
    
    void set(int val){
        x=val;
        Test.y=val;
    }
    
    void show(){
        System.out.println("X : "+x);
        //System.out.println("Y : "+y); correct only
    }
}

class AccessingNonStaticMembersUsingNewKeyword {
    public static void main(String []args){
        Test t1=new Test();
    
        t1.set(50);
        
        Test.m1();
        
        
        
        t1.show();
        System.out.println("Value of y : "+Test.y); // accessing the static variable with class name.
    }
}

