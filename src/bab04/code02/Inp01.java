package bab04.code02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Inp01 {
    public static void main(String[] args) {
        Path file = Paths.get("src/bab04/code02/data01.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Output: " + scanner.nextLine());
        } catch (IOException e) {
            System.out.println("File tidak ditemukan.");
        }
    }
}
