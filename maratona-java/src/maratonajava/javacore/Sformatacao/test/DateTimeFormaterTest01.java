package maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20260207", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-02-07", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-02-07", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-02-07T12:08:03.5599999");
        System.out.println(parse4);

        //dd/MM/yyyy
        //

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatBr = LocalDate.now().format(formatterBR);
        System.out.println(formatBr);
    }
}
