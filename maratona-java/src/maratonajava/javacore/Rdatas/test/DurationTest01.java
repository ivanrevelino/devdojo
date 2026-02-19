package maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus7hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeNowMinus7hours);
        Duration d4 = Duration.ofDays(20);
        System.out.println(d1);
        System.out.println("Agora " + now);
        System.out.println("Depois " + nowAfterTwoYears);
//        System.out.println(d2);
    }
}
