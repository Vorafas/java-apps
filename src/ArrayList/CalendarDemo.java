package ArrayList;

import java.lang.Thread;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) throws InterruptedException {
        Calendar calendar = new GregorianCalendar();

        Calendar mydate = Calendar.getInstance();
        mydate.setTimeInMillis(1591698930L * 1000);

        System.out.println(mydate.get(Calendar.YEAR));
        System.out.println(calendar.getTimeInMillis());
    }
}
