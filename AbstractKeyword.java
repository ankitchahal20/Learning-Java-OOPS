// Abstract Keyword

/*

- Abstract is the Keyword that can be used with the class and the method.

- An abstract class can never be Instantiated which means we can never create the object of an abstract class.
- But we can make the reference variable of the abstract class.

- The purpose of the abstract class is to inherit it.

*/

abstract class A{
    void m1(){
        System.out.println("m1 in A");
    }
}

class B extends A{ // created the child class to call the m1 method of the A class.
    
}

class Demo {
    static void test(A ref){ // parent class k andr child class ka object rakh rahe h yaha par.
        ref.m1(); 
    }
}

class AbstractKeyword{
    public static void main(String args[]){
        //Demo.test(new A()); //compilation error, as an abstract class, can never be instantiated.
        Demo.test(new B());
    }
}
