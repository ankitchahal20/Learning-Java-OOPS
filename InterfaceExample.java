// Interfaces

/*
    - Interfaces is like the class but with lots of restriction.
    - In the interfaces all the variables are alway public, final and static implicitly.
    - All the methods in the interfaces are public and abstract implicitly and cannot be changed.
    - We can never create the object of interface, but we can make the refernece variable of it.
    - In interfaces, there cannot be any constructor.
    - In the interfaces, we can never create a static block.
    
    - interface is the keyword which is used to declare an interface.
    
    example:
    
        interface testable {
            int x=5;
            public static final int y=2;
            
            void m1();
            public abstract void m2();
        }
        
    - implements is the keyword that is used to make the implemented class(child class) of the interface.
*/

interface Testable {
    int x=5;
    public static final int y=2;
            
    void m1();
    public abstract void m2();
}

class Test implements Testable {
    public void m1(){
        System.out.println("m1 in test class");
    }
    
    public void m2(){
        System.out.println("m2 in test class");
    }
}

class Sample{
    static void check(Testable t){
        t.m1();
        t.m2();
    }
}

class InterfaceExample{
    public static void main(String args[]){
        Sample.check(new Test());
    }
}

/*

According to the rules of method overriding in the child class, we have to implement the methods of interface with the public keyword.

Interfaces always used to achieve the run-time polymorphism that means we can never create the object of Interfaces
rather we have to store the ref id of child object in the ref variable of the interface.

D/f b/w abstract and interface class

    - abstract : abstract keyword is used to make the class abstract.
    - interface: interface keyword is used to make the interface.
    
    - abstract : abstract can have both the abstract and non-abstract type of methods.
    - interface: can only have the abstract methods.
    
    - abstract : achieveing the run-time polymorphism if abstract class have abstract methods.
    - interface: achieveing the run-time polymorphism always because the interface class alway only have the abstract methods.
    
    - abstract : implicit access specifier is "default"
    - interface: implicit access specifier is public.
    
    - abstract : abstract class can have constructor and static block.
    - interface: interface classes cannot have the constructor and static block.
    
    - abstract : Any class can extend any abstract class.
    - interface: any class can implements to more than one Interfaces.
    
- In Java, through the interfaces we prepare some standards(agreement or constract).



*/






