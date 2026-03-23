package maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case EUA: return new Dolar();
            case BRAZIL: return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
