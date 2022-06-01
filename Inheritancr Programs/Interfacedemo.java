
//class in Interface use implements

interface Printable{
    void print();
}

class Printing implements Printable{
    @Override
    public void print(){
        System.out.println("Printing The Java Program");
    }
}

public class Interfacedemo {
    public static void main(String[] args) {
        Printing p=new Printing();
        p.print();
        
    }
}
