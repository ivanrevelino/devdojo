package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;
import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AirCraftTest01 {

    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");

    }

     static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANce());
        AirCraft airCraft = new AirCraft("787-900");
        System.out.println(airCraft.bookseat(seat));
    }
}
