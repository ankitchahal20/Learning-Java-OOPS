// Constructor Chaining in the same class.

/*

By using the this() function, the Constructor of the same class can be invoked.

this() statement also must be placed in the first line of any Constructor, that means this() & super() cannot be
used together.

By deault, super() is there as the first line in each Constructor.

*/

class ThisInConstructor {
    
    ThisInConstructor(int x){
        System.out.println("Parameterized Constructor of Parent class " + x);
    }
    
    ThisInConstructor(){
        this(5);
        System.out.println("Default Constructor of Parent class ");
    }
    public static void main(String args[]){
        ThisInConstructor c = new ThisInConstructor();
    }
}



