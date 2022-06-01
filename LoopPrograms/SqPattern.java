package LoopPrograms;
public class SqPattern {
    public static void main(String[] args) {
        int r=4;
        int c=5;
        
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        int a=4;
        int b=5;
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        
        int d=4;
        int e=5;
        int z=1;
        
        for(int i=1; i<=d; i++){
            for(int j=1; j<=e; j++){
                System.out.print(z + " ");
                z++;
            }
            System.out.println("");
        }
    }
}
