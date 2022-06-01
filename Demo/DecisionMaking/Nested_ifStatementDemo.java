package Demo.DecisionMaking;

public class Nested_ifStatementDemo {
    public static void main(String[] args) {
        int a=101;
        int b=122;
        int c=118;
        
        if(a>100){
            System.out.println("1.  a is greater than 100.");
            if (a<=120) {
                System.out.println("1.1   a is less than 120.");
                if (a%2==0) {
                    System.out.println("1.1.1  a is even.");
                }
                else{
                   System.out.println("1.1.1  a is odd."); 
                }
            }
            else{
                System.out.println("1.1   a is not less than 120.");
            }
        }
        else{
            System.out.println("1.  False, Because a is not greater than 100.");
        }
        
        System.out.println("");
        
        if(b>100){
            System.out.println("2.  b is greater than 100.");
            if (b<=120) {
                System.out.println("2.1   b is less than 120.");
                if (b%2==0) {
                    System.out.println("2.1.1  b is even.");
                }
                else{
                   System.out.println("2.1.1  b is odd."); 
                }
            }
            else{
                System.out.println("2.1   b is not less than 120.");
            }
        }
        else{
            System.out.println("2.  False, Because b is not greater than 100.");
        }
        
        System.out.println("");
        
        
        if(c>100){
            System.out.println("3.  c is greater than 100.");
            if (c<=120) {
                System.out.println("3.1   c is less than 120.");
                if (c%2==0) {
                    System.out.println("3.1.1  c is even.");
                }
                else{
                   System.out.println("3.1.1  c is odd."); 
                }
            }
            else{
                System.out.println("3.1   c is not less than 120.");
            }
        }
        else{
            System.out.println("3.  False, Because c is not greater than 100.");
        }
        
        System.out.println("");
    }
}
