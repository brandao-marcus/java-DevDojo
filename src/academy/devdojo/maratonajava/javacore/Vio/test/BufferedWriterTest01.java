package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo e o melhor curso do Brasil!!");
            bw.newLine(); // Baseado no sistema operacional
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

// BufferedWriter encapsula a FileWriter
// é uma classe criada para ter uma melhor performance, pois utiliza dados gravados na memória.
