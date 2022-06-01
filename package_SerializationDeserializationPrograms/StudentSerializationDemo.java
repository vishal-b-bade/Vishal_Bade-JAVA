package package_SerializationDeserializationPrograms;

import java.io.*;

public class StudentSerializationDemo {

    public static void main(String[] args) {
        Student s = new Student();
        s.rollno = 41114;
        s.fname = "Vishal";
        s.lname = "Bade";
        s.address = "Panegaon";
        s.mobileno = 7741;
        s.percentage = 76.80f;

        try {
            FileOutputStream fileOut = new FileOutputStream("C://java_vishal//InputOutputProgram//Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.println("Student Data Saved In File :- C://java_vishal//InputOutputProgram//Student.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
