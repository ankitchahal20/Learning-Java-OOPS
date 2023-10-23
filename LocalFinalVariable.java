// Local Final Variable

/*

Local Final Variable: They can be intialized either at the time of their declaration or at any other time.
After one time intialization, values can never be reintitalized.

*/


class Test{
    final int y=1;
    final int z;
    Test(){
        z=2;
    }
    static void m1(){
        final int x;
        x=5;
    }
}

class LocalFinalVariable {
    public static void main(String args[]){
        Test.m1();
        Test t=new Test();
    }
}
