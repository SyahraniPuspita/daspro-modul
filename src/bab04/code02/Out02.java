package bab04.code02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Out02 {
    public static void main(String[] args) {
        String teks = "\nSalam";
        Path file = Paths.get("src/bab04/code02/out01.txt");

        try {
            Files.write(file, teks.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file");
        }
    }
}
