package TimeAndDatePrograms;

import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("Date is : " + date);
        
        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();
        cal1.setTime(date);
        
        System.out.println("Our Calender_1 Month is : " + cal1.get(Calendar.MONTH));
        
        System.out.println("Our Calender_1 Year is : " + cal1.get(Calendar.YEAR));
        
        System.out.println("Our Calender_2 Month is : " + cal2.get(Calendar.MONTH));
        
        System.out.println("Our Calender_2 Year is : " + cal2.get(Calendar.YEAR));
        
        cal1.add(Calendar.MONTH, 22);
        date=cal1.getTime();
        System.out.println("Our Date is : " + date);
        
        cal2.add(Calendar.MONTH, -15);
        date=cal2.getTime();
        System.out.println("Our Date is : " + date);
    }
}
