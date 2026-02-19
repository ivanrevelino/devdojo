package maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest03 {
    static void main(String[] args) {
        Locale localeDefault = Locale.getDefault(); //Retorna como o sistema operacional esta configurado
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOCountries();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
    }
}