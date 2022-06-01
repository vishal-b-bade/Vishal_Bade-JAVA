// Write the Program of Student Subject Result on Multi Level Inheritance

class Student {
    String name;
    int roll_no , age;
    
   Student (int roll_no, String name, int age){
       this.roll_no=roll_no;
       this.name=name;
       this.age=age;
   } 
    
   void Display (){
       System.out.println("Roll No. :- " + roll_no + ", Name of Student is " + name +" And Age is " + age +".");
   }
}

class Subject extends Student{
    int sub1, sub2, sub3, sub4, sub5;
    
    Subject (int roll_no, String name, int age, int sub1, int sub2, int sub3, int sub4, int sub5 ){
        super(roll_no, name, age);
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        this.sub5=sub5;
    }
    
    void Show (){
        System.out.println("English"+ sub1);
        System.out.println("Hindi"+ sub2);
        System.out.println("Marathi"+ sub3);
        System.out.println("Math"+ sub4);
        System.out.println("Science"+ sub5);
    }
}

public class Multilevelinheritance1 {
    public static void main(String[] args) {
        Student s=new Student(41114, "Vishal Bade", 24);
        s.Display();
    }
    
}
