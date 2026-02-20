
Então, suponhamos que você quer **organizar** uma lista de objetos de forma crescente conforme o **ID**, então você **sobrescreve** o método **compareTo()** para **organizar** conforme o **ID**.

### 1 - Voce implementa a interface Comparable<> 
Implementando essa classe, você é **obrigado** a **implementar** o método **compareTo()** para a sua classe, e aí você **define** como quer que a lista dos objetos da sua classe seja **organizada**.


```java
    public class Manga implements Comparable<Manga> {  
    private Long id;  
    private String nome;  
    private double preco;
    
    @Override  
    public int compareTo(Manga outroManga) {  
        //negativo se o this < outroManga  
        //se this == outroManga, return 0        
        //posititivo se this > outroManga        
        
        if (this.id < outroManga.getId()) {  
            return -1;  
        }  
        if (this.id.equals(outroManga.getId())) {  
            return 0;  
        } else {  
            return 1;  
        }  
    }}
```


Esse método vai **influenciar** a forma como o **Collections.sort(lista)** trabalha.
###### Agora, o **Collections.sort()** vai **trabalhar** com base na regra de **ordenação** que definimos no **compareTo()** dentro da nossa classe.

Quando você precisar **comparar** e **organizar** a lista de mangas, o Java vai usar o método **compareTo()**.

Observação de desenvolvedor: os mangas são **organizados pelo ID**.

## Dica: por padrão, as classes **Wrappers** possuem o método **compareTo()**.
No nosso caso como o id esta com o wrapper como **Long** voce pode chamar o compareTo() do Long fazendo =>

```java
    @Override  
    public int compareTo(Manga outroManga) {  
        //negativo se o this < outroManga  
        //se this == outroManga, return 0        //posititivo se this > outroManga//        if (this.id < outroManga.getId()) {  
//            return -1;  
//        }  
//        if (this.id.equals(outroManga.getId())) {  
//            return 0;  
//        } else {  
//            return 1;  
//        }  
        return this.id.compareTo(outroManga.getId());  
    }
```

Ou, se você também estiver com uma preguiça danada, você pode **envelopar** algumas coisas e fazer o método ser reduzido a linhas, como, por exemplo, **organizar com base no preço**.

```java
	private Long id;  
	private String nome;  
	private double preco;

    @Override  
    public int compareTo(Manga outroManga) {  
        //negativo se o this < outroManga  
        //se this == outroManga, return 0        
        //positivo se this > outroManga 
        return Double.compare(this.getPreco(), outroManga.getPreco());    
    }
```

