// Method Hiding

/*
Method Hiding : In case of static method, if child class has the static method with the same signature as in 
the parent class, then this is known as method hiding.

*/



class A{
    static void m1(int x){ // void m1(int x) this whole thing should be same in child class.
        System.out.println("m1 with int in Parent class");
    }
}

class B extends A{
    static  void m1(int  x){
        System.out.println("m1 with int in Child class");
    }
}

class MethodHiding {
    public static void main(String args[]){
        B.m1(1); // B ref = new B(); ref.m1(1); // ref will be converted to className.
        A.m1(1);
    }
}

/*
We can never override the non-static method with the static method and vice-versa.
We can never hide the static method with the non-static method.

*/




