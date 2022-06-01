package package_SerializationDeserializationPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) {
        EmployeeDemo ed = null;
        try {
            FileInputStream fileIn = new FileInputStream("C://java_vishal//InputOutputProgram//Employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ed = (EmployeeDemo) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;

        } catch (ClassNotFoundException c) {
            System.out.println("Employee class Not Found.");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee....");
        System.out.println("Name : " + ed.name);
        System.out.println("Address : " + ed.address);
        System.out.println("ID : " + ed.id);
        System.out.println("Ade : " + ed.age);
    }
}
