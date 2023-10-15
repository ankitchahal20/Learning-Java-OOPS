/*package whatever //do not write package name here */

import java.io.*;

class Test {
    int x,y,z;
    void setX(int x){
        this.x=x;
    }
    void setY(int y){
        this.y=y;
    }
    void add(){
        this.z=this.x+this.y;
    }
    
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    int getZ(){
        return this.z;
    }
}

class GetterAndSetter {
    public static void main(String []args){
        Test t1=new Test();
        t1.setX(1);
        t1.setY(3);
        t1.add();
        System.out.println("X values is : "+t1.getX());
        System.out.println("Y values is : "+t1.getY());
        System.out.println("Z values is : "+t1.getZ());
    }
}

