// Method Overriding

/*

At the compile time, compiler alway consider the reference variable, at the time of method calling.

But for the non-private non-static methods, JRE always consider to the type of object for the method calling.

Rules for the method Overriding: In case of method Overriding, we can never provide the weaker acess to the 
overriding method in the child class.

private             weakest
default
protected
public              strongest


*/

class A{
    void m1(int x){ // void m1(int x) this whole thing should be same in child class.
        System.out.println("m1 with int in Parent class");
    }
    static void test(A ref){
        ref.m1(5);
    }
}

class B extends A{
    void m1(int  x){
        System.out.println("m1 with int in Child class");
    }
}

class MethodOverriding {
    public static void main(String args[]){
        A.test(new B());
    }
}

/*
Difference b/w method overloading and Overriding
    - overloading: argument list must be changed
    - overriding : complete signature must be same.
    
    - overloading: can be possible in the same class or in inheritance.
    - overriding : can only be possible in case of inheritance.
    
    - overloading: used to achieve the compile-time polymorphism.
    - overriding : used to achieve the run-time polymorphism.
    
    - overloading: never be dispatched dynamically i.e. selection is alway performed at the complie-time.
    - overriding : alway be dispatched dynamically i.e. selection is alway performed at the run-time by seeing the type of object.

    - overloading: is not affected by the access specifier.
    - overriding : is affected by the access specifier.
    

Note: 
    - private methods can never be overridden bcoz they can never be inherited.
    - static methods will also not be overridden.
    - The methods that can be overridden can be dispatched dynamically.

Dynamic dispatching : When the JRE invokes any method by seeing the type of object, then it is known as Dynamic method
dispatching.
*/









