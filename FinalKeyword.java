// Final Keyword

/*

- Final : A final is also a modifier that can be used with the variables, methods and classess.

- Final Class : If any class is declared as final class then that class never be inherited.

-   final class A{
    
    }
    
    class B extends A { // error, final class can never be inherited.
        
    }

- Final class are totally opposite to abstract class.

- abstract class means no association and only inheritance.
- final class means only association and no inheritance.


- Final Method : As the name says, the methods are final that means they can never be redefined.
i.e. we can never override any final method in the child class.


Example :

    class A{
        final void m1(){
            System.out.println("m1 in A");
        }
    }
    
    class B extends A {
        void m1(){ // error
            
        }
    }

Note : There is no need to make the class final if the class has any final method bcoz if the class is already made as final,
then it cannot be inherited and there method cannot be overrriden.

- We can never make any method both abstract and final bcoz
    - abstract method means compulsory overriding.
    - final method means no-overriding.

Some Important Questions:

Q1) Can we make the abstract method in the final class?
Ans : no

Q2) Can we make the final method in the abstract class?
Ans : yes

    abstract class A{
        abstract void m1();
        final void m2(){
        }
    }

Q3) Can we make the final method static?
Ans : Yes, we can make but with the same signature, the static method cannot be created in the child class.

Q4) Can we make the final method private?
Ans : Yes, we can make the final method as private but there is no significance.

Q5) Can we make only the private constructor in the abstract class?
Ans Yes, we can but that abstract class not be inherited, so there is no significance.

Final Variable : If any variable is made as final then it works as constant, that means after one-time intialization, we can never change their values.

According to the types of variable, there are three types of final variable,
- static final variable,
- non-static final variable,
- local final varibale,

*/

