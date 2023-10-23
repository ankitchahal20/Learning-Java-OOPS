// Abstract Method

/*

- Abstract Method : are the incomplete methods, they never have their body rather their signature
  is alway terminated by the semi-colon (;).

- example : abstract void m1();

- If in any class, there is any abstract method, then that class must be declared as the abstract class.

- But vice-versa of above point is not true, that means it is not compulsory that each and every abstract class 
  must have any abstract class.

- Abstract class without abstract method : POSSIBLE

    abstract class AbstractClass {
        abstract void m1();
        void m2(){
            System.out.println("m2 in A");
        }
    }
    
    Note : In any abstract class there can be both type of method i.e. abstract as well as non-abstract.


- Abstract Method without abstract class: NOT POSSIBLE
    
    class AbstractClass {
        abstract void m1(); // This is not possible, for abstract method to exists, class must be declared abstract
    }
    
- In the child class of the abstract class, child class must override all the abstract methods of the parent abstract class,
  otherwise the child class must be declared as abstract class.
  
- abstract method can never be private.
- abstract methods can never be static.

*/

abstract class A{
    abstract void m1();
    void m2(){
        System.out.println("m2 in A");
    }
}

class B extends A{
    void m1(){
        System.out.println("m1 in B");
    }
}

class Demo {
    static void test(A ref){ // parent class k andr child class ka object rakh rahe h yaha par.
        ref.m1(); 
    }
}

class AbstractMethod {
    public static void main(String args[]){
        //Demo.test(new A()); // compliation error, as abstract class can never be instantiated.
        Demo.test(new B());
    }
}
