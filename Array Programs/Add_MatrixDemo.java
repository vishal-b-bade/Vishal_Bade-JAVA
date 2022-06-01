



public class Add_MatrixDemo {
    public static void main(String[] args) {
        int arr[][]={{2,3,4},{5,5,6},{5,9,8}};
        int add[][]=new int[3][3]; 
        
        System.out.println("First Matrix : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Second Matrix : ");
        int arr1[][]={{3,8,9},{6,8,7},{4,4,6}};
                                                                                    
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Addition of Both Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                add[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Substraction of Both Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                add[i][j]=arr[i][j]-arr1[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Multiplication of Both Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                add[i][j]=arr[i][j]*arr1[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
