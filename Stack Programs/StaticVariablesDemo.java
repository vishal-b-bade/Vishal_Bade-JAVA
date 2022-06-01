// Static Variables

class Operations{
    static int sum, sub, multi, divi;
    
    static int a=5;
    static int b=4;
    static int c=2;
    
    
    static void sum(){
        sum=a+b+c;
        System.out.println("Addition Of a,b,c Values : " + sum);
    }
        
    static void sub(){
        sub=a-b-c;
        System.out.println("Substraction Of a,b,c Values : " + sub);
    }
        
    static void multi(){
        multi=a*b*c;
        System.out.println("Multiplicatin Of a,b,c Values : " + multi);
    }    
    
    static void divi(){    
        divi=a/b/c;
        System.out.println("Division Of a,b,c Values : " + divi);
    }
    
    static void changeValues(){
        a=10;
        b=22;
        c=5;
        System.out.println(" ");
    }
}


public class StaticVariablesDemo {
    public static void main(String[] args) {
        System.out.println("Before Static value Change :");
        System.out.println("                               ");
        Operations o=new Operations();
        o.sum();
        o.sub();
        o.multi();
        o.divi();
    }
}
