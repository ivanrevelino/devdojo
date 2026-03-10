package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.dominio.Manga;
import maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        // O orElse vai retirar/extrair o object do Wrapper que e o Optional
        // Caso ele encontre vai retornar o Manga senao ele vai lancar uma excecao

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManga);

    }
}
