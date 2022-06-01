// Array Object Program

import java.io.*;
import java.util.*;

class Student {
    int rollno;
    String f_name, l_name;
    
    public Student (int rollno, String f_name, String l_name){
        this.rollno=rollno;
        this.f_name=f_name;
        this.l_name=l_name;
    }
}

public class ArrayObjectDemo {
    public static void main(String[] args) {
        Student student[];
        student=new Student[5];
        
        student[0]=new Student(1,"Vishal", "Bade");
        student[1]=new Student(2,"Dipak", "Lodwal");
        student[2]=new Student(3,"Prastant", "Chandge");
        student[3]=new Student(4,"Umakant", "Kathar");
        student[4]=new Student(5,"Yogesh", "Shahane");
        
        for(int i=0; i<student.length; i++){
            System.out.println("                                                          ");
            System.out.println("Element at Index : " + i + " :-      " + student[i].rollno + " " + student[i].f_name + " " + student[i].l_name);
            System.out.println("----------------------------------------------------------");
        }
    }
}
