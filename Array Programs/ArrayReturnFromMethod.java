// Array Return From the Method

import java.util.*;
import java.io.*;


public class ArrayReturnFromMethod {
    public static void main(String[] args) {
        int arr[]=method();
        
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
        }
    }    
        public static int[] method(){
            return new int[]{2,3,4,6,5,8,7};
        }
}