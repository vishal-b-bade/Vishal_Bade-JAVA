package LoopPrograms;
public class SqPattern2 {
    public static void main(String[] args) {
        int r=5;
        int c=4;
        
        for(int i=1; i<=c; i++){
            for(int j=1; j<=r; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
