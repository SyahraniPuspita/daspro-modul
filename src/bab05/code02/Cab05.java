package bab05.code02;

import java.util.Scanner;

public class Cab05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai [0-100] = ");
        int nilai = input.nextInt();

        if( nilai > 100 ) {
            System.out.println("Nilai tidak boleh lebih besar dari 100.");
        } else if( nilai >= 80 ) {
            System.out.println("Nilai anda A");
        } else if( nilai >= 70 ) {
            System.out.println("Nilai anda B");
        } else if( nilai >= 60 ) {
            System.out.println("Nilai anda C");
        } else if( nilai >= 50 ) {
            System.out.println("Nilai anda D");
        } else if( nilai >= 0 ) {
            System.out.println("Nilai anda E");
        } else {
            System.out.println("Nilai harus positif");
        }
    }
}
