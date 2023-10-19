/*

Types of Inheritance in Java:
    - Single Inheritance
    - Multilevel Inheritance
    - Multiple Inheritance
    - Herirachal Inheritance
    - Hybrid Inheritance



- Single Inheritance

Parent
  ^
  |
  |
  |
Child


- Multilevel Inheritance

GrandParent
  ^
  |
  |
  |
Parent
  ^
  |
  |
  |
Child

class PrintOutput {
    void show(){
        System.out.println("Res : "+res);
    }
}


class Add extends PrintOutput {
    int x,y,res;
    void add(){
        //
    }
    
}


class SimpleCalc extends Add{
   
}


PrintOutput
  ^
  |
  |
  |
Add
  ^
  |
  |
  |
SimpleCalc


- Multiple Inheritance.



Add                 Multiply
 ^                      ^
 |                      |
 |----------------------
            |
            |
            |
        SimpleCalculator
        
        
        
        
- Herirachal Inheritance

                add
                 ^
                 |
                 |
  ScifiCalc------|-----------SimpleCalc



- Hybrid Inheritance

PrintOutput
  ^
  |
  |
  |
Add <-----------ScifiCalc
  ^
  |
  |
  |
SimpleCalc












*/
