**Comparator:** É útil quando você precisa criar ordenações personalizadas. Você pode ter uma classe com uma estratégia de ordenação padrão (implementando _Comparable_ nela) e em situações que forem necessárias **ordenar de forma diferente**, criar _n_ classes que implementam _Comparator_ para atender a esses casos que a ordenação padrão da classe não atenda. Seguindo o exemplo da classe _Pessoa_ que ordena por padrão pelo nome, pode acontecer que em uma situação específica você precise ordenar, por exemplo, _Pessoas_ por idade decrescente e pelo nome da mãe. Aí você implementa um **_Comparator_** para esta classe.

Ela também vai fazer comparações como o **Comparable** so que essa interface vai nos fazer implementar o método **compare** . 

E vc não utiliza implementando na sua classe diretamente vc (acho eu tem que criar uma classe que implemente o **Comparator<>**). 


Então você faz: 
```java
class MangaByIdComparator implements Comparator<Manga> {  
  
    @Override  
    public int compare(Manga manga1, Manga manga2) {  
        return manga1.getId().compareTo(manga2.getId());  
    }  
}
```

 E na hora de usar você usa o **Collections.sort()**  passando como paramentos a lista alvo, e uma instancia da classe **MangaByIdComparator**:
 ```java
 Collection.sort(lista, new MangaByIDComparator())
 ```
 