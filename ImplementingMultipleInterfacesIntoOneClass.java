// Interfaces

/*
    Any class can implement more than one interface.
*/

interface I1 {
    void m1();
}

interface I2 {
    void m1();
    void m2();
}

class Test implements I1, I2 {
    public void m1(){
        System.out.println("m1 in test class");
    }
    
    public void m2(){
        System.out.println("m2 in test class");
    }
}

class ImplementingMultipleInterfacesIntoOneClass{
    public static void main(String args[]){
        Test t = new Test();
        
        I1 i1=t;
        I2 i2=t;
        
        i1.m1(); // complier m1() method ko I1 main dekhega
        //i1.m2(); // complier m2() method ko I1 main dekhega
        
        i2.m1(); // complier m1() method ko I2 main dekhega
        i2.m2(); // complier m2() method ko I2 main dekhega
        
    }
}

/*

Variable of interfaces are always intialized at the time of their declaration, because these variables are final and static and there cannot be a static block in the interface.

*/
