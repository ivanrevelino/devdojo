package maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 30, 12);
        LocalTime timenow = LocalTime.now();
        System.out.println(time);
        System.out.println(timenow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());


    }
}
