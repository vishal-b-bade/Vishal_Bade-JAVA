package DecisionMaking;
public class MainClass {
    public static void main(String[] args) {
        
        SwitchDemo sd=new SwitchDemo();
        sd.switchday();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        MonthSwitch ms=new  MonthSwitch();
        ms.switchmonth();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        OperationSwitch os=new OperationSwitch();
        os.switchoperations();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        SwitchLeapYear sly=new SwitchLeapYear();
        sly.leapyearswitch();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        ContinueDemo cd=new ContinueDemo();
        cd.show();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        ReturnDemo rd=new ReturnDemo();
        rd.returndemo();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
    }
}
