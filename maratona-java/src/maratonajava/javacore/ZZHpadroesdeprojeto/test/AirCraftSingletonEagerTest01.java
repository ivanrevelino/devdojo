package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;
import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AirCraftSingletonEagerTest01 {

    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANce());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANce();
        System.out.println(aircraftSingletonEager.bookseat(seat));
    }
}
