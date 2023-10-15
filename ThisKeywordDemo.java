/*package whatever //do not write package name here */

import java.io.*;

class Test {
    int x;
    void set(int val){
        System.out.println("Current Object "+this);
        x=val;
    }
    void show(){
        System.out.println("Value : "+x);
    }
}


class ThisKeywordDemo {
    public static void main(String[] args){
        Test t1, t2;
        t1=new Test();
        t2=new Test();
        t1.set(55);
        t2.set(65);
        System.out.println("Id of first object : "+t1);
        System.out.println("Id of second object : "+t2);
        t1.show();
        t2.show();
    }
}

/*
1 ) this keyword in java is alway used in the non-static methods, constructors and non-static blocks.
2 ) this keyword alway denotes the current object in the non-static methods.
3 ) current object is the object in the non-static method which is responsible for the invokation of this non-static method.
4 ) each and every non-static method will alway be invoked with the object and the ref id of that object is represented by the "this" keyword.
*/
