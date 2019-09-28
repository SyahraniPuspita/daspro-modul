package bab04.code02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Inp02 {
    public static void main(String[] args) {
        Path file = Paths.get("src/bab04/code02/data02.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Output line 1: " + scanner.nextLine());
            System.out.println("Output line 2: " + scanner.nextLine());
        } catch (IOException e) {
            System.out.println("File tidak ditemukan.");
        }

    }
}
