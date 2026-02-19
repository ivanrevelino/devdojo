package maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); // => Mostra a zona setada para Tokyo
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);


        //Mostra a zona usando Instant que usa Zulu time que e mais ou menos como se fosse uma data padrao +/- e a converte para o fuso horario do japao

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);


        /*
            Imagina que voce quer pegar uma data de um determinado local mas voce nao sabe a zona, entao voce pode usar o ZoneOffSet como no exeplo abaixo e conseguir a data baseada no fuso horario que nesse caso e -04:00
        */
        ZoneOffset offsetManuas = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManuas);
        System.out.println(offsetDateTime);

        /*Esse e um dos outros exemplos de como conseguir o resultado de cima*/
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManuas);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManuas);
        System.out.println(offsetDateTime3);

        //Essa aqui e para saber como esta a data de hoje mas no calendario japones
        JapaneseDate japa = JapaneseDate.from(LocalDate.now());
        System.out.println(japa);

    }
}
