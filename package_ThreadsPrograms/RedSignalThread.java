package package_ThreadsPrograms;

public class RedSignalThread extends Thread {
    String msg = "";

    public RedSignalThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(msg);
                Thread.currentThread().setPriority(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
