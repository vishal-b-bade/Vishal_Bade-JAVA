package DecisionMaking;
public class SwitchLeapYear {
    int y=2022;
    
    void leapyearswitch(){
    
        if(y%4==0){
            System.out.println("Leap Year, 366 Days");
        }
        else{
            System.out.println("Not Leap Year, 365 Days");
        }
    }
}
