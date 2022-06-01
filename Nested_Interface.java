/*
 Program on Nested Interface
 */

interface Showable {
    void show();
    interface Message {
        interface Message1{
            void msg();
        }
    }
}

class Displayshow implements Showable{
    public void show (){
        System.out.println("Print Showing Method");
    }
}

public class Nested_Interface implements Showable.Message.Message1{
    public void msg(){
        System.out.println("The Nested Interface ");
    }
    public static void main(String[] args) {
        Showable.Message.Message1 message=new Nested_Interface();
        message.msg();
            System.out.println("                        ");
        Displayshow display=new Displayshow();
        display.show();
            System.out.println("------------------------");
    }
}
