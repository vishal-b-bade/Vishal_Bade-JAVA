package Demo.DecisionMaking;

public class ifelseStatementDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        if(a==b){
            System.out.println("1.  A and B are Same.");
        }
        else{
            System.out.println("1.  False, Because A and B are Different.");
        }
        
        if(a!=b){
            System.out.println("2.  A and B are Not Same.");
        }
        else{
            System.out.println("2.  False, Because A and B are Same.");
        }
        
        if(a<=b){
            System.out.println("3.  A is Less Than B.");
        }
        else{
            System.out.println("3.  False, Because A is Not Less Than B.");
        }
        
        if(a>b){
            System.out.println("4.  A is Greater Than B.");
        }
        else{
            System.out.println("4.  False, Because A is Not Greater Than B.");
        }
        
        if(a>30){
            System.out.println("5.  A is Greater Than 30.");
        }
        else{
            System.out.println("5.  False, Because A is Not Greater Than 30.");
        }
        
        System.out.println("");
    }
}
