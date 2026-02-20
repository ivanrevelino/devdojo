Nao permite elementos duplicados dentro da Colecao.

**HashSet** => e uma colecao que permite apenas elementos unicos e esses elementos sao organizados pelo Hash. Ele nao mantem a ordem de insercao

Porque antes de inserir o Java vai checar atraves do metodo equals, por isso que e importante que vc sobrescreva o metodo equals na sua classe porque ele vai permitir que vc tenha elementos duplicados.

Se vc quiser manter a ordem de insercao ainda usando o hash Voce usa o **LinkedHashSet**

```java
    static void main(String[] args) {  
  
        Set<Manga>mangas = new LinkedHashSet<>();  
  
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9));  
        mangas.add(new Manga(1L,"Pokemon", 9.5));  
        mangas.add(new Manga(3L,"Dragon Ball Z", 3.2));  
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));  
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));  
  
        for (Manga manga : mangas) {  
            System.out.println(manga);  
        }  
    }  
}

```


Oq acontece se eu colocar 2 chaves.
Vc pode ter duas chaves diferentes com o mesmo valor