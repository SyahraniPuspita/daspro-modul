package bab05.code03;

import java.util.Scanner;

public class Nest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama lengkap: ");
        String nama = input.nextLine();
        System.out.print("Jenis Kelamin [L/P]: ");
        String jk = input.nextLine();
        System.out.print("Tinggi badan (cm): ");
        int tinggi = input.nextInt();
        System.out.print("Berat badan (kg): ");
        int berat = input.nextInt();

        if( jk.equals("L") ) {
            int ideal = tinggi - 100;
            int selisih = Math.abs(berat - ideal);
            if( tinggi < 170 ) {
                System.out.println("Anda terlalu pendek!");
            } else if( selisih > 6 ) {
                System.out.println("Berat badan tidak ideal.");
            } else {
                System.out.println("Anda lulus!");
            }
        } else if( jk.equals("P") ) {
            int ideal = tinggi - 110;
            int selisih = Math.abs(berat - ideal);
            if( tinggi < 165 ) {
                System.out.println("Anda terlalu pendek!");
            } else if( selisih > 5 ) {
                System.out.println("Berat badan tidak ideal.");
            } else {
                System.out.println("Anda lulus!");
            }
        } else {
            System.out.println("Maaf, anda memasukkan data yang salah.");
        }

    }
}
