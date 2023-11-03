package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**.bkp");
        matches(path1, "glob:**/*.bkp"); //mesmo resultado que o de cima.
        matches(path1, "glob:**.{bkp,txt,java}"); //virgula sem espaco no agrupamento
        matches(path2, "glob:**.{bkp,txt,java}");
        matches(path3, "glob:**.{bkp,txt,java}");
        matches(path1, "glob:**/*.???"); //3??? = letras apos o ponto .bkp true
        matches(path2, "glob:**/*.???"); // .txt true
        matches(path3, "glob:**/*.???"); // .java false (4 letras, 3"???")
        matches(path3, "glob:**/file.????");
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " +matcher.matches(path));
    }
}
