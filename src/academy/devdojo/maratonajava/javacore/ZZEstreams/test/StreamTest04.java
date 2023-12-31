package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Marcus Brandao", "Daisy Almeida", "Mel");
        List<String> developers = List.of("Marcus", "Gucci", "Puff");
        List<String> students = List.of("Tommy Hilfiger", "Tommyn", "Tommyzika");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("--------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}

// flatMap = usado pra retirar uma colecao/atributo de dentro de outro lugar
