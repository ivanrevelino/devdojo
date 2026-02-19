package maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime(); 
        
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {System.out.println("Domingo e o primeiro dia da semana");}
        
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        
        c.add(Calendar.DAY_OF_MONTH, 2);
        //c.add(Calendar.HOUR, 2);
        System.out.println(date);
    }
}
