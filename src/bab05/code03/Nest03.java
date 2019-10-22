package bab05.code03;

import java.util.Scanner;

public class Nest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi badan (cm): ");
        int tinggi = input.nextInt();
        System.out.print("Berat badan (kg): ");
        int berat = input.nextInt();

        if( tinggi >= 165 ) {
            int ideal = tinggi - 100;
            int selisih = berat - ideal;
            if( selisih <= 5 ) {
                System.out.println("Anda lulus!");
            } else {
                System.out.println("Anda tidak lulus!");
            }
        } else {
            System.out.println("Anda terlalu pendek!");
        }
    }
}
