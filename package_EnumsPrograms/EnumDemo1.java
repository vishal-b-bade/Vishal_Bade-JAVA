package package_EnumsPrograms;

enum Season implements Runnable {Winter, Spring, Summer, Fall;

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class EnumDemo1 {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        
        System.out.println("Value Of Winter is : " + Season.valueOf("Winter"));
        
        System.out.println("Index Of Winter is : " + Season.valueOf("Winter").ordinal());
        
        System.out.println("Value Of Winter is : " + Season.valueOf("Summer"));
        
        System.out.println("Index Of Winter is : " + Season.valueOf("Summer").ordinal());
    }
}
