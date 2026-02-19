package maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Locale("fr", "CA")
        //messages_fa_CA.properties
        //messages_fa_CA.properties

    }
}
