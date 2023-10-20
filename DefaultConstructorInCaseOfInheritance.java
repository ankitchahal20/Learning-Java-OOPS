// Constructor in case of inheritance

/*

At the time of creation of child object, the Constructor of all the parent class(in case of the multilevel inheritance)
will alway be invoked.

*/

class Parent {
    Parent(){
        System.out.println("Default Constructor of Parent class");
    }
}

class Child extends Parent{
    Child(){
        //super() added by Compiler
        System.out.println("Default Constructor of Child class");
    }
    
}

class DefaultConstructorInCaseOfInheritance {
    public static void main(String args[]){
        Child c = new Child();
    }
}

/*

- super() statement is always present in all the Constructor of child class as the first statement.
- The super() will be replaced by the complier in the Byte Code.
- super() denotes the calling of the default Constructor of the parent class.
- we can also place super statement explicitly either for the calling of default constructor or for calling the 
  parameterized constructor.
*/

