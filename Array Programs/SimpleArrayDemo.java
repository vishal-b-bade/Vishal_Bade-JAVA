// Simple Array Program



public class SimpleArrayDemo {
    public static void main(String[] args) {
        
        int[] arr; // Array Declaration
        
        arr=new int[6]; // Array Initialization
        
        // Assign Constant Values To Array 
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at Index : " + i + ":" + arr[i]);
        }
    }
}
