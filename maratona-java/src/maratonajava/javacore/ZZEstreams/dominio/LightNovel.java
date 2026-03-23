package maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LightNovel {

    private String title;
    private double price;
    private Categoty categoty;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, double price, Categoty categoty) {
        this.title = title;
        this.price = price;
        this.categoty = categoty;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Categoty getCategoty() {
        return categoty;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", categoty=" + categoty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
