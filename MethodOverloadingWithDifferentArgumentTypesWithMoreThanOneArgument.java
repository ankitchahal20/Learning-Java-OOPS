/*

Method Overloading : When there are more than one method with the same name, but with different argument list,
this is known as the method overloading.

The return type of the method never affects to the overloading.

The argument list can be changed in the following ways,
    - by changing the no. of arguments,
    - by changing the type of arguments,
    - by changing the sequence of arguments.
    
    
ReturnType  methodName      (ArgumentList)
may or may  must be same     must be changed.
not change  
*/

class Test{
    void m1(int x, float f){
        System.out.println("m1 with int and float argument");
    }
    void m1(float y, char ch){
        System.out.println("m1 with float and char argument");
    }
}

class MethodOverloadingWithDifferentArgumentTypesWithMoreThanOneArgument {
    public static void main(String args[]){
        Test t=new Test();
        t.m1(4, 4.5f);
        t.m1(3.4f, 'a');
    }
}
