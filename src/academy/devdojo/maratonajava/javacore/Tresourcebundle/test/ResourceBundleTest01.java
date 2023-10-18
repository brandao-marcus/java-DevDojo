package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        //fallback: quando procura um arquivo e não acha, ele vai procurando arquivos parecidos...
        //                         Locale("fr", "CA");
        //primeiro procura nesse:                messages_fr_CA.properties
        //dps procura nesse:                     messages_fr.properties
        //dps procura na lingua original do SO:  messages_en_US.properties
        //depois nesse:                          messages_en.properties
        //por fim nesse:                         messages.properties (ultimo fallback possivel. Se não achar, solta uma Exception).

        System.out.println(bundle.getString("hi"));
    }
}
