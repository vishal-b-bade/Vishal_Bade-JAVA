// Java program to demon
// Push
// Pop

// Peek

import java.util.*;
import java.io.*;


class Stackpopdemo {
    static void stackpush(Stack<Integer>s){
        s.push(15);
        s.push(25);
        s.push(35);
        s.push(45);
        s.push(55);
    }
    
    static void stackpop(Stack<Integer>s){
        System.out.println("Pop Operation: ");
        Integer a=s.pop();
        Integer b=s.pop();
        Integer c=s.pop();
        Integer d=s.pop();
        Integer e=s.pop();
        
        System.out.println(a + " " + b +" " + c + " " + d + " "+ e);
        
        
    }
    
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
            stackpush(s);
            stackpop(s);
    }
    
    
}
