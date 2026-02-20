## equals( );
O método`equals()`em Java é utilizado para comparar a igualdade de conteúdo entre dois objetos, retornando `true`se forem equivalentes e `false`caso contrário, substituindo a comparação de referências do operador `==`. Pertencente à classe `Object`, ele deve ser sobrescrito para personalizar a lógica de comparação baseada nos atributos da classe.

**Principais Aspectos:**

- **Comparação de Conteúdo:** Diferente de `==`, que verifica se ambos apontam para o mesmo endereço de memória, `equals()`verifica se os dados dentro dos objetos são iguais.

- **Sobrescrita (Override):** Para objetos personalizados, é essencial sobrescrever o método `equals()`(geralmente junto com `hashCode()`) para garantir que dois objetos com os mesmos dados sejam considerados iguais.

- **Classes Wrapper e String:** Classes como `String`, `Integer`, etc., já possuem o `equals()`sobrescrito para comparar valores diretamente.

- **Regras (Contrato):** A implementação deve ser reflexiva, simétrica, transitiva e consistente. 


## Uso do metodo equals( ) na pratica (Java)
//Reflexivo: x.equasl(x) tem que ser true para tudo que for diferente de null  
//Simetrico: para x e y diferntes de null, se x.equals(y) == true logo, y.equals(x) == true  
//Transitividade: para x,y e z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true  
//Consistente

```
@Override  
public boolean equals(Object obj) {  
    if (obj == null) return false;  
    if (this == obj) return true;  
    if (this.getClass() != obj.getClass()) return false;  
    Smartphone smartphone = (Smartphone) obj;  
    return serialNumber != null && serialNumber.equals(smartphone.serialNumber);  
}
```
