package package_ThreadsPrograms;

public class SignalThreadMain extends Thread {

    public static void main(String[] args) {
        GreenSignalThread gs = new GreenSignalThread("GREEN");
        OrangeSignalThread os = new OrangeSignalThread("ORANGE");
        RedSignalThread rs = new RedSignalThread("RED");

        gs.setPriority(Thread.MAX_PRIORITY);
        os.setPriority(Thread.MIN_PRIORITY);
        rs.setPriority(Thread.NORM_PRIORITY);

        gs.start();
        gs.interrupt();
        os.start();
        os.interrupt();
        rs.start();
        rs.interrupt();

    }
}
