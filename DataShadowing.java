import java.io.*;

class Test {
    int x,y;
    void m1(int x){
        x=200; //local x
        y=100; // instance variable y
        this.x=500; // instance variable x
        System.out.println("x : "+x);
        System.out.println("this.x : "+this.x);
    }
}

/*
Data shadowing is a concept that says that there can be same names of the local variable of any method
and instance variable, in that case the instance variable is shadowed by the local variable, i.e. the priority 
of local variable will be higher than the instance variable.
*/

class DataShadowing {
    public static void main(String[] args){
        Test t1;
        t1=new Test();
        t1.m1(1);
    }
}
