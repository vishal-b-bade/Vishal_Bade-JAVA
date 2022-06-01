package LoopPrograms;
public class SqPattern3 {
    public static void main(String[] args) {
        int r=4;
        int c=5;
        int z=1;
        
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(z + " ");
                z++;
            }
            System.out.println("");
        }
    }
}
