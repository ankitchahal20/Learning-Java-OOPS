/*

In the child object, the member variables of the parent class present in the super area (logical area) within the
child object.

Whenever we use the parent variable in the child class, first of all it will be searched in the outer area i.e.
(child section), if not found then it will be searched in the super area.


Super Keyword : is one which always represent parent always in child class.

super keyword is always used in the non-static method & constructor.

if in the child class any variable is accessed by the super keyword then, it always first search in the super area
by skipping the child area.

*/


class parent{
    static{
        System.out.println("Parent class loaded into memory");
    }
}

class child extends parent {
    static{
        System.out.println("Child class loaded into memory");
    }
}

class ClassLoadingInInheritance {
    static{
        System.out.println("Main class loaded into memory");
    }
    public static void main(String args[]){
        child c = new child();
        System.out.println("Welcome to main");
    }
}

/*

In case of inheritance, the parent class must be loaded before loading the child class.

*/









