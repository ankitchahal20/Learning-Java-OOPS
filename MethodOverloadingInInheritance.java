// Method Overloading in case of Inheritance.

class Parent{
    void m1(int x){
        System.out.println("m1 with int in Parent class");
    }
}

class Child extends Parent{
    void m1(float x){
        System.out.println("m1 with float in Child class");
    }
}

class MethodOverloadingInInheritance {
    public static void main(String args[]){
        Child c=new Child();
        c.m1(1);
        c.m1(1.1f);
    }
}
