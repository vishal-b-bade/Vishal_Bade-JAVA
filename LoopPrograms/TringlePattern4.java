package LoopPrograms;
public class TringlePattern4 {
    public static void main(String[] args) {

        int c=4;
        int z=10;
        
        for(int i=1; i<=c; i++){
            for(int j=1; j<=i; j++){
                System.out.print(z + " ");
                z--;
            }
            System.out.println("");
        }
    }
}
