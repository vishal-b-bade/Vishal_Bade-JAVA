

import java.util.*;
import java.io.*;


class Stackdemo {
    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        s.push("Welcome");
        s.push(" Fuel");
        s.push(" Organisation");
        s.push(",");
        s.push(" pune");
    
        System.out.println("Initial Stack is : " + s);
        System.out.println("The element at the stack is : " + s.peek());
    }
    
    
}
