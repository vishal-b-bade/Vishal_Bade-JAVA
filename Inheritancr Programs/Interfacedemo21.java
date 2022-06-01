// Interface Program on Two interfaces implement in One Class

interface Drawable{
    void draw();
}

interface Printable{
    void print();
}

class Rectangle implements Drawable, Printable{
    public void draw(){
        System.out.println("Drawing The Rectangle");
    }
    
    public void print(){
        System.out.println("Printing The Rectangle");
    }
}

class Circle implements Drawable, Printable{
    public void draw(){
        System.out.println("Drawing The Circle");
    }
    
    public void print(){
        System.out.println("Printing The Circle");
    }
}



public class Interfacedemo21 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.print();
        r.draw();
        
            System.out.println("------------------------------");
        
        Circle c=new Circle();
        c.print();
        c.draw();
    }
}
