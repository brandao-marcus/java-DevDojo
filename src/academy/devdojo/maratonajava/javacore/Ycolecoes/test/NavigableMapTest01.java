package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>(); //TreeMap ordena pela Key(chave)
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // lower: " < " vai trazer o menor valor
        // floor: " <= " vai trazer o mesmo valor ou o menor antes dele
        // higher: " > " vai trazer o maior valor
        // ceiling: " >= " vai trazer o mesmo valor ou o maior apos ele
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
