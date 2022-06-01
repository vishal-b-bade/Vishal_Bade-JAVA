package package_SerializationDeserializationPrograms;

public class Student implements java.io.Serializable {

    public int rollno;
    public String fname;
    public String lname;
    public String address;
    public int mobileno;
    public float percentage;

    public void show() {
        System.out.println("Show : " + " " + rollno + " " + fname + " " + lname + " " + address + " " + mobileno + " " + percentage);
    }
}
