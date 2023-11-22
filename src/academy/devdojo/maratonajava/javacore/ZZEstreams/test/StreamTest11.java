package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shittara", 8.99),
                new LightNovel("Overlord", 10.99),
                new LightNovel("Violet Evergarden", 5.99),
                new LightNovel("No game no life", 2.99),
                new LightNovel("Fullmetal Alchemist", 5.99),
                new LightNovel("Kumo desuga", 1.99),
                new LightNovel("Monogatari", 4.00)
        ));
        public static void main(String[] args) {
            System.out.println(lightNovels.stream().count()); //total de lightnovels na lista
            System.out.println(lightNovels.stream().collect(Collectors.counting()));

            System.out.println("-------------------------------------------");

            lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); //lightnovel mais caro
            lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

            System.out.println("-------------------------------------------");

            lightNovels.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); //lightnovel mais barato
            lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

            System.out.println("-------------------------------------------");

            System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum()); //soma de todos os valores da lightnovels
            System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

            System.out.println("-------------------------------------------");

            lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println); //media dos precos
            System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

            System.out.println("-------------------------------------------");

            DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
            System.out.println(collect);
            //todos os codigos acima, sao resumidos no summarizing

            System.out.println("-------------------------------------------");

            String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
            System.out.println(titles);
            //imprime todos os titulos dos lightnovels numa unica string, separados pelo delimiter             ^

        }
}
