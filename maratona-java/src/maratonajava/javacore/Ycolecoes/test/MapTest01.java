package maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    static void main(String[] args) {
        //K representa a chave
        //V representa o valor
        // Para cada chave voce vai ter um valor associado
        Map<String, String> map = new LinkedHashMap<>();
//        Map<String, String> map = new HashMap<>();
        // vai ordernar as chaves baseadas no hash e vc vai precisar do equals e o hashCode
        // no Map voce nao pode ter chaves iguais

        //Se vc quiser manter a ordem de insersai voce usa o LinkedHashMap
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.putIfAbsent("vc2", "voce2");
        System.out.println(map);

        //Iterar sobre isso
        //navegacao via

        //para pegar todas as chaves
        for (String key : map.keySet()) { // Iterar via valor
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("__________________________");

        for (String values : map.values()) { // Iterar via valor
            System.out.println(values);
        }

        // Se eu quiser pegar os 2
        for (Map.Entry <String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
