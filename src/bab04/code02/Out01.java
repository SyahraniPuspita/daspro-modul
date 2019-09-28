package bab04.code02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Out01 {
    public static void main(String[] args) {
        String teks = "Hai Programmer. Teks ini akan disimpan ke file.";
        Path file = Paths.get("src/bab04/code02/out01.txt");

        try {
            Files.write(file, teks.getBytes());
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file");
        }
    }
}
