// Multi Dimensional Array Program


public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        int arr[][]={{2,3,4},{5,5,6},{5,9,8}};
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
