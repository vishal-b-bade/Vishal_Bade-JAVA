package package_ThreadsPrograms;

public class OrangeSignalThread extends Thread {
    String msg = "";

    public OrangeSignalThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(msg);
                Thread.currentThread().setPriority(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
