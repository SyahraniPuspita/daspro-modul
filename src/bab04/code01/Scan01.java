package bab04.code01;

import java.util.Scanner;

public class Scan01 {
    public static void main(String[] args) {
        // Membuat object Scanner, membaca Standard Input
        Scanner scanner = new Scanner(System.in);

        // Ambil data dari keyboard
        String teks = scanner.nextLine();

        // Cetak data
        System.out.println("Teks : " + teks);
    }
}
