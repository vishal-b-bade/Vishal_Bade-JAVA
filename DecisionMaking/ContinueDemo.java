package DecisionMaking;
public class ContinueDemo {
    void show(){
        for(int i=0; i<10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i+ " ");
        }
    }
}
