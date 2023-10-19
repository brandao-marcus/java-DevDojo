package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os números
        // \D = TUDO o que não for digito
        // \s = Espaços em branco -> \t \n \f \r
        // \S = Todos os caracteres, menos os espaços em branco
        // \w = Tudo que for de a-ZA-Z, números e _
        // \W = Tudo o que não estiver incluso no \w
        String regex = "\\W";
       // String texto = "abaaba";
        String texto2 = "@#hh_j2 12g\tvh2\n1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
