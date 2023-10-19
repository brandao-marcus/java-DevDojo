package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123,133,1@3,1A3 (TUDO entre 1 e 3) coringa
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1].trim()));
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
