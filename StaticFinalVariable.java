// Final Static Variable

/*

Static Final Variable: can be intialized either at the time of their declaration or in the static block.
After one time intialization, values can never be reintitalized.

*/


class Test{
    static final int x=5;
    static final int y;
    static final int z=1;
    
    
    static{
        //x=10;
        y=2;
    }
    
    static void m1(){
        //z=10;
    }
}

class StaticFinalVariable {
    public static void main(String args[]){
        Test.m1();
    }
}
