// Interfaces

/*
    Any interface can extends to the other interface, or any interface can extends to one or more interface.
*/

interface I1 {
    int x=5;
    void m1();
    void m2();
}

interface I2 extends I1 {
    int x=15;
    void m1();
    void m3();
}

class Test implements I2 {
    public void m1(){
        System.out.println("m1 in test class : "+x);
    }
    
    public void m2(){
        System.out.println("m2 in test class");
    }
    
    public void m3(){
        System.out.println("m3 in test class : "+I1.x);
    }
}

class ExtendingInterfaces{
    public static void main(String args[]){
        Test t = new Test();
        
        I1 i1=t;
        I2 i2=t;
        
        i1.m1(); // complier m1() method ko I1 main dekhega
        i1.m2(); // complier m2() method ko I1 main dekhega
        //i3.m3();
        
        
        i2.m1(); // complier m1() method ko I2 main dekhega
        i2.m2(); // complier m2() method ko I2 main dekhega
        i2.m3();
    }
}
