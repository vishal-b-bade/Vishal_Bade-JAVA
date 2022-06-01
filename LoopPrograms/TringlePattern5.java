package LoopPrograms;
public class TringlePattern5 {
    public static void main(String[] args) {
        int c=5;
        int k=5;
        
        for(int i=1; i<=c; i++){
            for(int j=1; j<=k; j++){
                System.out.print(j + " ");
            }
            k--;
            System.out.println("");
        }
    }
}
