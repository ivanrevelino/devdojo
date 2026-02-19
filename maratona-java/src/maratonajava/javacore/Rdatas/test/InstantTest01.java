package maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now().getEpochSecond());
        System.out.println(Instant.now().getNano());
    }
}
