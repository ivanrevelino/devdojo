O`NavigableSet`A interface `Ordered` em Java é um subtipo de ` `SortedSet`Ordered` que fornece métodos de navegação aprimorados para elementos ordenados, permitindo a travessia em ordem crescente e decrescente.

## Conceitos chave
- **Interface, não Classe** : `NavigableSet`é uma interface, portanto não pode ser instanciada diretamente. Você deve usar uma classe que a implemente, como `java.util.TreeSet`ou `java.util.concurrent.ConcurrentSkipListSet`.

- **Ordem Classificada** : Os elementos em uma lista `NavigableSet`são classificados automaticamente de acordo com sua ordem natural ou por uma ordem `Comparator`fornecida no momento da criação. 
Ou seja Elas precisam que as classes que vc esta adicionando dentro dessa da lista tenham Comparable, se não ela solta uma exceção.

Exemplo de uso: 

```java
class MangaPrecoComparator implements Comparator<Manga> {  
  
    @Override  
    public int compare(Manga o1, Manga o2) {  
        return Double.compare(o1.getPreco(), o2.getPreco());  
    }  
}


NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); 
//Ai no contrutor voce passa o comparator que e como voce quer que a lista seja organizada
//Por padrao se eu nao passar nada no contrutor ele vai organizar baseado no compareTo

mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9));  
mangas.add(new Manga(7L, "Bersek", 12.13));  
mangas.add(new Manga(1L,"Pokemon", 9.5));  
mangas.add(new Manga(3L,"Dragon Ball Z", 3.2));  
mangas.add(new Manga(2L,"Attack On Titan", 11.20));  
mangas.add(new Manga(2L,"Attack On Titan", 11.20));  
mangas.add(new Manga(5L,"Aaragon", 11.20));

for (Manga manga : mangas) {  
    System.out.println(manga);  
}

System.out.println(mangas.size());  

// ele retorna e remove o primeiro item da lista  
System.out.println(mangas.pollFirst()); 
// retorna e remove o ultimo item da lista
System.out.println(mangas.pollLast()); 
```


### Por que usar `NavigableSet`:

- **Mantém os elementos ordenados automaticamente** → você não precisa ficar ordenando manualmente.
    
- **Evita duplicados** → como todo Set, não permite repetição.
    
- **Permite navegação inteligente** → consegue achar rapidamente o maior, menor, ou “próximo maior/menor” de um elemento.
    
- **Útil em algoritmos que precisam de buscas por intervalo ou vizinhos** → tipo ranking, agendas, filas com prioridade baseada em valores, etc.
    

### Sobre o uso:

Na prática, **não é tão usado quanto HashSet ou ArrayList**, porque a maioria dos programas só precisa de coleção simples ou de HashMap/HashSet.  
Mas quando você **precisa de ordem + navegação eficiente**, ele é a escolha certa.  
Ou seja, não é “todo mundo usa todo dia”, mas **quem precisa de ordenação automática e navegação rápida adora**.