// Method Overriding



class A{
    void m1(int x){ // void m1(int x) this whole thing should be same in child class.
        System.out.println("m1 with int in Parent class");
    }
}

class B extends A{
    private void m1(int  x){
        System.out.println("m1 with int in Child class");
    }
}

class MethodOverridingAccessSpecifier {
    public static void main(String args[]){
        A a = new A();
    }
}





