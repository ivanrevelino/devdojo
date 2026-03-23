package maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {

    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("7870-900");


    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookseat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANce() {
        return INSTANCE;
    }
}
