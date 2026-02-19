package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2022-08-06");
        LocalTime localTime = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        System.out.println(localDateTime1);

    }
}
