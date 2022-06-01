package package_SerializationDeserializationPrograms;

public class EmployeeDemo implements java.io.Serializable{

    public String name;
    public String address;
    public int id;
    public int age;

    public void mailCheck (){
        System.out.println("Mailing A Check To " + " " + name + " " + address + " " + id + " " + age);
    }
}

  
