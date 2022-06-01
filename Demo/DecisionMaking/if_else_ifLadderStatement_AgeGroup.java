package Demo.DecisionMaking;

// baby>child>Teenage>Young>Middle>Average>valid age

public class if_else_ifLadderStatement_AgeGroup {
    public static void main(String[] args) {
        int age=24;
        float age1=48.5f;
        
        
        if(age>=0 && age<=5){
            System.out.println("Age Group of A is : Baby.");
        }
        
        else if(age>=5.1 && age<=13){
            System.out.println("Age Group of A is : Child.");
        }
        
        else if(age>=13.1 && age<=18){
            System.out.println("Age Group of A is : Teenage.");
        }
        
        else if(age>=18.1 && age<=25){
            System.out.println("Age Group of A is : Young.");
        }
        
        else if(age>=25.1 && age<=49){
            System.out.println("Age Group of A is : Middle Age.");
        }
        
        else if(age>=49.1 && age<=70){
            System.out.println("Age Group of A is : Average.");
        }
        
        else if(age>70.1){
            System.out.println("Age Group of A is : Valid Age.");
        }
        
        System.out.println("");
        
        if(age1>=0 && age1<=5){
            System.out.println("Age Group of B is : Baby.");
        }
        
        else if(age1>=5.1 && age1<=13){
            System.out.println("Age Group of B is : Child.");
        }
        
        else if(age1>=13.1 && age1<=18){
            System.out.println("Age Group of B is : Teenage.");
        }
        
        else if(age1>=18.1 && age1<=25){
            System.out.println("Age Group of B is : Young.");
        }
        
        else if(age1>=25.1 && age1<=49){
            System.out.println("Age Group of B is : Middle Age.");
        }
        
        else if(age1>=49.1 && age1<=70){
            System.out.println("Age Group of B is : Average.");
        }
        
        else if(age1>70.1){
            System.out.println("Age Group of B is : Valid Age.");
        }
        
        System.out.println("");
    }
}
