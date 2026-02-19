package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2026, Month.JANUARY, 22);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(agora);


    }
}
