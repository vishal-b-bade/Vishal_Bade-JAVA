package DecisionMaking;
public class ReturnDemo {
    void returndemo(){
        boolean t=true;
        System.out.println("Before The Return ..");
        if(t){
            return;
        }
        System.out.println("This Won't Execute ..");
    }
    public static void main (String args[]){
        ReturnDemo rd=new ReturnDemo();
        rd.returndemo();
    }
}
