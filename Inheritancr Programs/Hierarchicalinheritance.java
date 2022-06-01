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
class Three extends One{
    public void printthree(){
        System.out.println("Three No. Of Class called is ");
    }
}
class Four extends One{
    public void printfour(){
        System.out.println("Four No. Of Class called is ");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Two t=new Two();
        Three t2=new Three();
        Four f=new Four();
        f.printone();
        t.printtwo();
        t2.printthree();
        f.printfour();
        
    }
}
