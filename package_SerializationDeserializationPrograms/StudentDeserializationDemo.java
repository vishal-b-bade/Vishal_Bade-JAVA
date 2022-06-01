package package_SerializationDeserializationPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializationDemo {
    public static void main(String[] args) {
        Student s=null;
        try {
            FileInputStream fileIn=new FileInputStream("C://java_vishal//InputOutputProgram//Student.ser");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            s=(Student) in.readObject();
            in.close();
            fileIn.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            return;

        } catch (ClassNotFoundException c) {
            System.out.println("Student class Not Found.");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Student....");
        System.out.println("Roll No : " + s.rollno);
        System.out.println("First Name : " + s.fname);
        System.out.println("Last Name : " + s.lname);
        System.out.println("Address : " + s.address);
        System.out.println("Mobile No : " + s.mobileno);
        System.out.println("Percentage : " + s.percentage + " %");
    }
}
