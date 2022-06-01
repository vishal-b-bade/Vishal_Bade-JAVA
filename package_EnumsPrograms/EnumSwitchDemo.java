package package_EnumsPrograms;

import java.time.MonthDay;

enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thusday,
    Friday,
    Saturday,
    Sunday;
}

public class EnumSwitchDemo {

    Day day;

    public EnumSwitchDemo(Day d) {
        this.day = d;
    }

    public void dayLike() {
        switch (day) {
            case Monday:
                System.out.println("Monday is first Day of Week");
                break;

            case Tuesday:
                System.out.println("Tuesday is Second Day of Week");
                break;

            case Wednesday:
                System.out.println("Wednesday is Third Day of Week");
                break;

            case Thusday:
                System.out.println("Thusday is Fourth Day of Week");
                break;

            case Friday:
                System.out.println("Friday is Fifth Day of Week");
                break;

            case Saturday:
                System.out.println("Saturday is Sixth Day of Week");
                break;

            case Sunday:
                System.out.println("Sunday is Seventh Day of Week");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void main(String[] args) {
        String s="Friday";
        EnumSwitchDemo esd=new EnumSwitchDemo(Day.valueOf(s));
        esd.dayLike();
        
        
    }
}
