// Array Object Program 
      

import java.io.*;
import java.util.*;

class Student_1 {
    int rollno, hindi, eng, mar, math, sci, total;
    double per;
    String f_name, l_name;
    
    public Student_1 (int rollno, String f_name, String l_name, int hindi, int eng, int mar, int math, int sci){
        this.rollno=rollno;
        this.f_name=f_name;
        this.l_name=l_name;
        this.hindi=hindi;
        this.eng=eng;
        this.mar=mar;
        this.math=math;
        this.sci=sci;
        this.total= hindi + eng + mar + math + sci;
        this.per=((total/500.0)*100);
    }
}

public class ArrayObjectStudent {
    public static void main(String[] args) {
        Student_1 student[];
        student=new Student_1[5];
        
        student[0]=new Student_1(1,"Vishal", "Bade",96,88,90,78,67);
        student[1]=new Student_1(2,"Dipak", "Lodwal",61,45,55,40,45);
        student[2]=new Student_1(3,"Prastant", "Chandge",55,94,67,45,64);
        student[3]=new Student_1(4,"Umakant", "Kathar",66,57,94,38,42);
        student[4]=new Student_1(5,"Yogesh", "Shahane",88,87,78,75,80);
        
        for(int i=0; i<student.length; i++){
            System.out.println("                                                          ");
            System.out.println("Student " + i + " :-   " + " Roll No. " + student[i].rollno + " : " + student[i].f_name + " " + student[i].l_name + ".");
            System.out.println("-------------------------------------------------");
            System.out.println("Marks is :- " + " in Hindi : " + student[i].hindi + " , in English : " + student[i].eng + " , in Marathi : " + student[i].mar + " , in Math : " + student[i].math + " , in Science : " + student[i].sci + ".");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Total Marks is : " + student[i].total);
            System.out.println("---------------------------");
            System.out.println("Percentage is : " + student[i].per + " %");
            System.out.println("___________________________");
            System.out.println("___________________________________________________________________________________________________");
        }
    }
}
