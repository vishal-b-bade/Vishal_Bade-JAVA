package DecisionMaking;
public class OperationSwitch {
    int a=10;
    int b=20;
    int c;
    int choice=2;
    
    void switchoperations(){
        switch(choice){
            
            case 1:
                c=a+b;
                System.out.println("Addition of Both Values is = " + c);
                break;
                
            case 2:
                c=a-b;
                System.out.println("Substraction of Both Values is = " + c);
                break;
                
            case 3:
                c=a*b;
                System.out.println("Multiplication of Both Values is = " + c);
                break;
            
            case 4:
                c=a/b;
                System.out.println("Division of Both Values is = " + c);
                break;
                
            case 5:
                if(c%2==0){
                System.out.println("Even Number");
                }
                break;
                
            case 6:
                if(c%2!=0){
                System.out.println("Odd Number");
                }
                break;
                
            case 7:
                int y=2022;
                if(y%4==0){
                    System.out.println("Leap Year");
                }
                else{
                System.out.println("Not Leap Year");
                }
                break;
                
            default:
                System.out.println("Invalid Choice");
        }
    }
}
