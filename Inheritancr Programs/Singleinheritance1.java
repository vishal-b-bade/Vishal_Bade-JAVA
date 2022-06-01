// Write the Program of Employee Bonus on Single Inheritance

import java.io.*;

class Employee{
    public void printemployee(){
        System.out.println("Name of Employee :  ");
    }
}
class Bonus extends Employee{
    public void printbonus(){
        System.out.println("and Bonus is ");
    }
}

public class Singleinheritance1 {
    public static void main (String[] args){
        Bonus b=new Bonus ();
        
        b.printemployee();
        b.printbonus();   
    }
}
