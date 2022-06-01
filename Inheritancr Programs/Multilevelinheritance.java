import java.io.*;
import java.util.*;

class One{
    public void printone(){
        System.out.println("One No. Of Class called is ");
    }
}
class Two extends One{
    public void printtwo(){
        System.out.println("Two No. Of Class called is ");
    }
}
class Three extends Two{
    public void printthree(){
        System.out.println("Three No. Of Class called is ");
    }
}
class Four extends Three{
    public void printfour(){
        System.out.println("Four No. Of Class called is ");
    }
}


public class Multilevelinheritance {
    public static void main(String[] args) {
        Four f=new Four();
        f.printone();
        f.printtwo();
        f.printthree();
        f.printfour();
        
    }
    
}
