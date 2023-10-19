class Employee{
    int code, tax, netSalary;
    
    void set(int code){
        this.code=code;    
    }
    
    void show(){
        System.out.println("Code "+code);
        System.out.println("Tax "+tax);
        System.out.println("NetSalary "+netSalary);
    }
}

class PartTimeEmployee extends Employee {
    int rate, noh;
    void set(int c, int r, int wh){
        this.rate=r;
        this.noh=wh;
        set(c);
    }
    
    void calc(){
        tax = rate  * noh * 10/100;
        netSalary= rate  * noh -tax;
    }
    
    void show(){
        System.out.println("No of Hours "+noh);
        System.out.println("Charges per hour "+rate);
        System.out.println("Tax "+tax);
        System.out.println("netSalary "+netSalary);
        
    }
}

class FullTimeEmployee extends Employee {
    int basic, hra, ta;
    FullTimeEmployee(int c, int basic){
        set(c);
        this.basic=basic;
    }
    
     void calc(){
       hra=basic*12/100;
       ta=basic*10/100;
       tax=(hra+ta+basic)*12/100;
       netSalary=basic+hra+ta-tax;
    }
    
    void show(){
        System.out.println("Basic "+basic);
        System.out.println("HRA "+hra);
        System.out.println("TA "+ta);
    }
}

class Company{
    public static void main(String args[]){
        PartTimeEmployee pe=new PartTimeEmployee();
        FullTimeEmployee fe=new FullTimeEmployee(102,10000);
        pe.set(101,1000,10);
        pe.calc();
        pe.show();
        
        fe.calc();
        fe.show();
        
    }
}


















