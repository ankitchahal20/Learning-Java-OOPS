/*package whatever //do not write package name here */

import java.io.*;

/*

Annonymous Object : object without reference variable are called as Annonymous Object.

1) these are the use and throw objects.
2) creation and usuage of these object are alway in a single statement(line).

*/

class Test {
    void annonymousObject(){
        System.out.println("annonymousObject in the Test Class");
    }
}



class AnnonymousObject {
    public static void main(String []args){
        new Test().annonymousObject();
    }
}

/*
Explanation :
1) object created in the heap.
2) ref id returned
3) ref id provided to the annonymousObject() function that means annonymousObject() is invoked by the Test object.

annonymousObject() will capture the refid into the this keyword and as annonymousObject() gets completed, then the object becomes unreferenced.


Another variation.


class Test{
    static void annonymousObject(Student s1){
        s1.set(10);
        s1.exam(100);
    }
    
    public static void main(String []args){
        annonymousObject(new Student());
    }
}
*/
