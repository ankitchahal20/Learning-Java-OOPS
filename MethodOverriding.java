// Method Overriding

/*

- Method Overriding can only be possible in case of inheritance.
- Method Overriding is nothing but redefining the method of parent class in class class.
- When the child class create the method with the same signature as in the parent class , then this
  is known as method Overriding.

*/

class Parent{
    void m1(int x){ // void m1(int x) this whole thing should be same in child class.
        System.out.println("m1 with int in Parent class");
    }
}

class Child extends Parent{
    void m1(int  x){
        System.out.println("m1 with int in Child class");
    }
}

class MethodOverriding {
    public static void main(String args[]){
        Child c=new Child();
        c.m1(1);
        Parent p=new Parent();
        p.m1(2);
    }
}

/*
In the reference variable of the parent class, we can store the reference id of any of its child class object.
But not vice-versa.

Parent p=new Child(); // allowed acc. to above statement.
Child p=new Parent(); // NOT allowed acc. to above statement.
*/
