package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasilia,' dd 'de' MMMM 'de' yyyy.";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Brasilia, 17 de outubro de 2023."));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
