

/*
Inheritance : is one of the main feature of java.

Inheritance is used to achieve the resulabilty of code i.e. besides to develop each and everything as new, it is 
better to reuse already developed code.

Java language is the example of the Inheritance as it inherits the programmming syntax from the C and C++ language.


There are two uses of the inheritance in java,
    - to achieve reusability,
    - to achieve polymorphism,
    
Extends is the keyword in java which is used to prepare the inheritance betweens the classes.

*/

class Parent {
    int x,y;
    
    void setXY(int val){
        x=val;
        y=val + 100;
    }
}

class Child extends Parent {
    int a,b;
    static int c;
    void setAB(int val){
        a=val;
        b=val+100;
    }
    
    void show(){
        System.out.println("X "+x);
        System.out.println("Y "+y);
        System.out.println("A "+a);
        System.out.println("B "+b);
    }
}

class Inheritance {
    public static void main(String []args){
        Child c;
        c= new Child();
        c.setXY(100);
        c.setAB(500);
        c.show();
    }
}


/*

---------------------
|  x                |
|  y                | // inherited members
|  setXY(int)       |
|___________________|
|  a                |
|  b                |
|  SetAB(int)       |  // self members
|  Show(int)        |
|                   |
|                   |    
|___________________|

Child Class



Inheritance means child class gets the access right to access the member of the parent class.

In the object of child class, copy of non-static variables of both the class will be created.

*/






