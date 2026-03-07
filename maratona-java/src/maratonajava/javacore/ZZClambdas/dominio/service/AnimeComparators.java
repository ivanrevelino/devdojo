package maratonajava.javacore.ZZClambdas.dominio.service;

import maratonajava.javacore.ZZClambdas.dominio.Anime;

// Reference to an instance method of a particular object
public class AnimeComparators {
    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }
    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
}
