**TreeSet e uma classe que implementa a interface [[NavibableSet]]**

// Elas precisam que as classes que vc esta adicionando dentro dessa classe TreeSet tenham Comparable.

// TreeSet automaticamente vai fazer a organização da sua colecao baseado no método compareTo() da classe

O `TreeSet` não aceita elementos duplicados porque ele é um tipo de `Set`, e todo `Set` em Java não permite repetição. No caso do `TreeSet`, a verificação de duplicidade não acontece principalmente pelo `equals()`, mas sim pela comparação usada para ordenar os elementos. Ele usa o `compareTo()` (se a classe implementar `Comparable`) ou um `Comparator` fornecido na criação. Se essa comparação retornar 0, o `TreeSet` entende que os dois elementos são iguais e não adiciona o novo elemento.