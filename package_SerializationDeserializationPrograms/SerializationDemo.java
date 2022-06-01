package package_SerializationDeserializationPrograms;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {
        EmployeeDemo ed = new EmployeeDemo();
        ed.name = "Vishal Bade";
        ed.address = "Panegaon";
        ed.id = 41114;
        ed.age = 24;

        try {
            FileOutputStream fileOut = new FileOutputStream("C://java_vishal//InputOutputProgram//Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ed);
            out.close();
            fileOut.close();
            System.out.println("Serialized Data is Saved in C://java_vishal//InputOutputProgram//Employee.ser");
        } catch (Exception i) {
            i.printStackTrace();
        }
    }

}
