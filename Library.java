/*package whatever //do not write package name here */

import java.io.*;

/*
Creating the book with the following properties and behaviour.
Properties : int code, price;
             boolean status;
             
Behaviour: void setBook(int c, int p);
           void issueBook()
           void returnBook()
           void report()
*/

class Book{
    int code, price;
    boolean status;
    
    void setBook(int c, int p){
        code=c;
        price=p;
        status=true;
        System.out.println(code+" book registered successfully");
    }
    
    void issueBook(){
        if(status){
            status=false;
            System.out.println("book issued successfully");
            return;
        } else {
            System.out.println("book is already issued");
        }
    }
    
    void returnBook(){
        if(!status){
            status=true;
            System.out.println("book returned successfully");
            return;
        } else {
            System.out.println("book is already available");
        }
    }
    
    void report(){
        System.out.println("code "+code);
        System.out.println("price "+price);
        if(status){
            System.out.println("book is available");
        } else {
            System.out.println("book is not available");
        }
    }
}


class Library{
    public static void main(String[] args){
        Book b = new Book();
        b.setBook(101,550);
        b.issueBook();
        b.issueBook();
        b.returnBook();
        b.returnBook();
        b.report();
        
    }
}
