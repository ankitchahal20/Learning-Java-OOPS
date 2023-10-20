// Constructor in case of inheritance

/*

At the time of creation of child object, the Constructor of all the parent class(in case of the multilevel inheritance)
will alway be invoked.

*/

class Parent {
    Parent(int x){
        System.out.println("Default Constructor of Parent class "+x);
    }
}

class Child extends Parent{
    Child(){
        //super() added by Compiler
        super(5);
        System.out.println("Default Constructor of Child class");
    }
}

class ParameterizedConstructorInCaseOfInheritance {
    public static void main(String args[]){
        Child c = new Child();
    }
}


