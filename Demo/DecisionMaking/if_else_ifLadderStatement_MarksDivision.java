package Demo.DecisionMaking;
public class if_else_ifLadderStatement_MarksDivision {
    public static void main(String[] args) {
        float mark=71.5f;
        
        if(mark>=100 && mark<=75){
        System.out.println("Distinguished");
        }
        
        else if(mark>=60 && mark<=74.99){
            System.out.println("First Class");
        }
        
        else if(mark>=45 && mark<=59.99){
            System.out.println("Second Class");
        }
        
        else if(mark>=35 && mark<=44.99){
            System.out.println("Pass");
        }
        
        else if(mark<34.99){
            System.out.println("Fail");
        }
    }
}
