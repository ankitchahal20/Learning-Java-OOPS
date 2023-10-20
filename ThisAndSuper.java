class A {
    A(){
        this(5);
        System.out.println("Default constructor in class A");
    }
    
    A(int x){
        System.out.println("Parameterized constructor in class A : "+x);
    }
}

class B extends A {
    B(){
        System.out.println("Default constructor in class B");
    }
}

class C extends B {
    C(){
        this(33);
        System.out.println("Default constructor in class C");
    }
    C(int x){
        System.out.println("Parameterized constructor in class C : "+x);
    }
    
    public static void main(String []args){
        new C();
    }
}
