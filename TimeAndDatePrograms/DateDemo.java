package TimeAndDatePrograms;

import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date1=new Date();
        Date date2=new Date(888888888755L);
        Date date3=new Date(99999999999999L);

        System.out.println("Our First Date is : " + date1);
        System.out.println("Our Second Date is : " + date2);
        System.out.println("Our Third Date is : " + date3);
        
        if (date1.after(date2)) {
            System.out.println("Our First Date is after Our Second Date");
        }
        
        if (date2.before(date3)) {
            System.out.println("Our Second Date is Before Our Third Date");
        }
        
        date2.setTime(date2.getTime() + 999999999999999999L);
        System.out.println("Our Updated New Second Date is : " + date2);
        
        if (date2.before(date3)) {
            System.out.println("Our Second Date is Before Our Third Date");
        } else {
            System.out.println("Our Second Date is After Our Third Date");
        }
    }
}
