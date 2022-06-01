package LoopPrograms;
public class EnhancedForLoopDemo {
    void enhancedforloop (){
        String arr[]={"Dipak", "Prashant", "Gajanan", "Umakant"};
        
        for(String x:arr){
            System.out.println(x);
        }
        System.out.println("");
        
        System.out.println("Simple For Loop : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        EnhancedForLoopDemo efld=new EnhancedForLoopDemo();
        efld.enhancedforloop();
    }
}
