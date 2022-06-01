package package_ThreadsPrograms;
// Vishal
public class GreenSignalThread extends Thread{
     String msg = "";

    public GreenSignalThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(msg);
                Thread.currentThread().setPriority(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void getThreadGroup(int MAX_PRIORITY) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
