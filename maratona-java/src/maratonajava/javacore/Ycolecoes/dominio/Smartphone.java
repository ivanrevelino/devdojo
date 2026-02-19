package maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Reflexivo: x.equasl(x) tem que ser true para tudo que for diferente de null
    //Simetrico: para x e y diferntes de null, se x.equals(y) == true logo, y.equals(x) == true
    //Transitividade: para x,y e z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    //Consistente
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    //se x.equals(y) == true, y.hashCode(x) == x.hashCode()
    // y.hashCode() == x.hashCode() nao necessariamente o equals de y.equals(x) tem que ser true
    // se x.equals(y) == false os seus hashCode tem que ser diferentes
    //y.hashCode() =! x.hashCode x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
