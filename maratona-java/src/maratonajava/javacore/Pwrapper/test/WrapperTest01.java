package maratonajava.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.0;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW;//Unboxing

        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("truE");
        System.out.println(verdadeiro);
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toUpperCase('c'));

    }


}
