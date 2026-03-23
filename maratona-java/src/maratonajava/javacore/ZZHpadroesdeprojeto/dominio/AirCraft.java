package maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraft {

    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public AirCraft(String name) {
        this.name = name;
    }

    public boolean bookseat(String seat) {
        return availableSeats.remove(seat);
    }
}
