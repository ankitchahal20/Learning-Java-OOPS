// Interfaces

/*
    Any class can extends to the other class along with implements one or more interfaces.
*/

interface I1 {
    void m1();
    void m2();
}

class C1 {
    public void m1(){
        System.out.println("M1 in C1 Class");
    }
}

class Test extends C1 implements I1 {
    public void m2(){
        System.out.println("m2 in test class");
    }
    
}

class ExtendingInterfacesWithImplements{
    public static void main(String args[]){
        
        I1 ref = new Test();
        ref.m1();
        ref.m2();
        
    }
}

/*

If any class extends to other class which implements other interface as well them, 
there must be first extends and then implements keyword.
*.
