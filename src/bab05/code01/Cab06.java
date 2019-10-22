package bab05.code01;

import java.util.Scanner;

public class Cab06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kunci = (int)(Math.random() * 20);
        System.out.print("Tebak angka (0-19): ");
        int jawaban = input.nextInt();
        if( jawaban == kunci ) {
            System.out.println("Horray... anda berhasil!");
        } else if( jawaban < kunci ) {
            System.out.println("Ooppss... masih terlalu kecil!");
            System.out.println("Kunci jawaban: " + kunci);
        } else {
            System.out.println("Ooppss... masih terlalu besar!");
            System.out.println("Kunci jawaban: " + kunci);
        }
    }
}
