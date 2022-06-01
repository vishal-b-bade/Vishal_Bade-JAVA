package package_ThreadsPrograms;

public class RunMethod extends Thread {

    public void run() {
        System.out.println("Thead is Running...");
    }

    public static void main(String[] args) {
        RunMethod rm = new RunMethod();
        rm.start();
    }
}


//                   OR


//public class Run implements Runnable{
//
//    public void run() {
//        System.out.println("Thead is Running...");
//    }
//
//    public static void main(String[] args) {
//        RunMethod rm = new RunMethod();
//        Thread t=new Thread(rm);
//        t.start();
//
//    }
//}


//                   OR


//public class RunMethod implements Runnable {
//
//    public void run() {
//        System.out.println("Thead is Running...");
//    }
//
//    public static void main(String[] args) {
//        RunMethod rm = new RunMethod();
//        rm.run();
//
//    }
//}
