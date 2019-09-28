package bab04.code01;

import java.util.Scanner;

public class Scan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input teks: ");
        String teks = scanner.nextLine();
        System.out.println("Output teks = " + teks);
    }
}
