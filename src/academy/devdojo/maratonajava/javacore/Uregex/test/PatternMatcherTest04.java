package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os números
        // \D = TUDO o que não for digito
        // \s = Espaços em branco -> \t \n \f \r
        // \S = Todos os caracteres, menos os espaços em branco
        // \w = Tudo que for de a-ZA-Z, números e _
        // \W = Tudo o que não estiver incluso no \w
        // [] = Busca especifica dentro do colchete
        // ? Zero ou uma ocorrência
        // * zero ou mais ocorrências
        // + uma ou mais ocorrências
        // {n,m} de n até m
        // () agrupamento
        // | o(v|c)o -> ovo | oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
