package bab05.code02;

import java.util.Scanner;

public class Cab02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai: ");
        int nilai = input.nextInt();

        if( nilai >= 0 ) {
            System.out.println("Angka " + nilai + " adalah positif");
        } else {
            System.out.println("Angka " + nilai + " adalah negatif");
        }

        if( nilai % 2 == 0 ) {
            System.out.println("Angka " + nilai + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + nilai + " adalah bilangan ganjil");
        }

        if( nilai % 5 == 0 ) {
            System.out.println("Angka " + nilai + " adalah kelipatan 5");
        } else {
            System.out.println("Angka " + nilai + " bukan kelipatan 5");
        }

    }
}
