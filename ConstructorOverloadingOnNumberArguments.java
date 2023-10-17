import java.io.*;

/*

Constructor Overloading: When any class contains more than one constructor, then these constructor are known as
Overloaded constructor & the mechanism to create these multiple constructor is known as constructor Overloading.

All the Overloaded Constructor are created with the class name but they must have different
 - number of argument is different
 - or type of the argument is different.

*/

class Area {
    int x,y,res, type; 
    
    // constructor
    Area(int x){
        this.x = x;
        type=1;
    }
    
    Area(int x, int y){
        this.x = x;
        this.y = y;
        type=2;
    }
    
    void calculate(){
       if(type==1){
           res=x*x;
       } else if(type==2){
           res=x*y;
       }
    }
    
    void show(){
        if(type==1){
            System.out.println("Area of Square "+res);
        }
        if(type==2){
            System.out.println("Area of rectangle "+res);
        }
    }
}

class ConstructorOverloadingOnNumberArguments {
    public static void main(String []args){
        Area sq, rec;
        sq=new Area(11);
        rec=new Area(3,4);
        
        sq.calculate();
        rec.calculate();
        
        sq.show();
        rec.show();
        
    }
}
