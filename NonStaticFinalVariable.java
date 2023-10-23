// Non-Static Final Variable

/*

Non-Static Final Variable: They can be intialized either at the time of their declaration or in the init block or
in the constructor.
After one time intialization, values can never be reintitalized.

*/


class Test{
    final int x=5;
    final int y;
    final int z;
    
    
    // java init block.
    {
        y=2;
    }
    
    Test(){
        z=1;
    }
}

class NonStaticFinalVariable {
    public static void main(String args[]){
        Test t = new Test();
    }
}
