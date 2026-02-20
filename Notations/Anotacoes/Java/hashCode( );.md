

`hashCode` é um número inteiro que representa o objeto. Cada objeto tem um hashCode. Ele serve para identificar o objeto de forma rápida, mas não garante que dois objetos diferentes tenham números diferentes. O importante é que **objetos iguais pelo `equals()` devem ter o mesmo `hashCode`**.

Regras principais entre `hashCode` e `equals`:

1. Se dois objetos são iguais pelo `equals()`, então o hashCode deve ser igual.
```
Pessoa p1 = new Pessoa("Ivan", 17);
Pessoa p2 = new Pessoa("Ivan", 17);

p1.equals(p2);      // true
p1.hashCode() == p2.hashCode(); // true
```

- Se dois objetos têm hashCode igual, não significa que são iguais pelo `equals()`. Pode acontecer coincidência (chama-se colisão).

- Objetos diferentes podem ter hashCode diferentes.

Por isso, quando você sobrescreve `equals()`, sempre sobrescreva `hashCode()` também. Exemplo:

```
package maratonajava.javacore.Ycolecoes.dominio;  
  
public class Smartphone {  
    private String serialNumber;  
    private String marca;  

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
```

