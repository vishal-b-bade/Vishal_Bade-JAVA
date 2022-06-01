// Array Pass To the Method

import java.io.*;
import java.util.*;


public class ArrayPassToMethod {
    public static void main(String[] args) {
        int arr[]={3,4,5,7,8,9};
        sum(arr);
    }
    
    public static void sum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            System.out.println("Sum=" + sum);
        }
        System.out.println("");
        System.out.println("Sum = " + sum);
        System.out.println("");
    }
}
