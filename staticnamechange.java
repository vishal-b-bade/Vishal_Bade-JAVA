// Program on Static variable


class Student{
    int roll_no;
    String name;
    static String collegename="DIEMS College, Aurangabad.";
    
    public Student (int roll_no, String name){
        this.roll_no=roll_no;
        this.name=name;
    }
    
    void display(){
        System.out.println(roll_no + " " + name + " " + collegename);
    
    }


    static void changenamecollege() {
    collegename="Deogiri Institute of Engineering And Management Studies , Aurangabad.";
        }
}


public class staticnamechange {
    public static void main(String[] args) {
        Student.changenamecollege();
        Student s1=new Student(01 , " Dipak Lodwal ,");
        Student s2=new Student(02 , " Prashant Chandge ,");
        Student s3=new Student(03 , " Umakant Kathar ,");
        Student s4=new Student(04 , " Gajanan Deshmukh ,");
        Student s5=new Student(05 , " Yogesh Shahane ,");
        
        System.out.println("--------------------------------------------------------------------------------------------|");
        s1.display();
        System.out.println("--------------------------------------------------------------------------------------------|");
        s2.display();
        System.out.println("--------------------------------------------------------------------------------------------|");
        s3.display();
        System.out.println("--------------------------------------------------------------------------------------------|");
        s4.display();
        System.out.println("--------------------------------------------------------------------------------------------|");
        s5.display();
        System.out.println("--------------------------------------------------------------------------------------------|");
    }
}
