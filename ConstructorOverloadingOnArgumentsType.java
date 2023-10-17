import java.io.*;

/*

Constructor Overloading: When any class contains more than one constructor, then these constructor are known as
Overloaded constructor & the mechanism to create these multiple constructor is known as constructor Overloading.

All the Overloaded Constructor are created with the class name but they must have different
 - number of argument is different
 - or type of the argument is different.

*/

class ConstructorOverloadingOnArgumentsType {
    
    // constructor
    ConstructorOverloadingOnArgumentsType(float f){
        System.out.println("Flaot constructor");
    }
    
    ConstructorOverloadingOnArgumentsType(int x){
         System.out.println("Integer constructor");
    }
    
    public static void main(String []args){
        ConstructorOverloadingOnArgumentsType d1,d2;
        d1=new ConstructorOverloadingOnArgumentsType(5);
        d2=new ConstructorOverloadingOnArgumentsType(5.5f);
        
    }
}

