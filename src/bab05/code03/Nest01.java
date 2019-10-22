package bab05.code03;

import java.util.Scanner;

public class Nest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama lengkap: ");
        String nama = input.nextLine();
        System.out.print("Jenis Kelamin [L/P]: ");
        String jk = input.nextLine();
        System.out.print("Tinggi badan (cm): ");
        int tinggi = input.nextInt();

        double ideal;
        if( jk.equalsIgnoreCase("L") ) {
            ideal = tinggi - 100 - (tinggi - 100) / 10;
        } else if( jk.equalsIgnoreCase("P") ) {
            ideal = tinggi - 104;
        } else {
            ideal = 0;
        }

        System.out.println("Hai " + nama + ", berat ideal anda adalah " + ideal + "kg.");
        System.out.println();

    }
}
