/*
 Program On Static Method Interface
 */

interface Drawable {
    void draw();
    static int cube(int x){
        return x*x*x;
        
    }
}

class Rectangle implements Drawable{
    public void draw (){
        System.out.println("Drawing The Rectangle");
    }
}



public class Static_Method_Interface {
    public static void main(String[] args) {
        Drawable d=new Rectangle();
        d.draw();
        System.out.println("                            ");
        System.out.println(Drawable.cube(10));
        System.out.println("----------------------------");
    }
}
