package bab05.code02;

import java.util.Scanner;

public class Cab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tulis nama: ");
        String nama = input.nextLine();

        System.out.print("Tulis NIM: ");
        String nim = input.nextLine();

        System.out.println("Pilih Jurusan:");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Teknik Elektro");
        System.out.println("4. Teknik Industri");
        System.out.println("5. Matematika Terapan");
        System.out.print("Pilih (1-5): ");
        int kodeJurusan = input.nextInt();

        String labelJurusan;
        if( kodeJurusan == 1 ) {
            labelJurusan = "Teknik Informatika";
        } else if( kodeJurusan == 2 ) {
            labelJurusan = "Sistem Informasi";
        } else if( kodeJurusan == 3 ) {
            labelJurusan = "Teknik Elektro";
        } else if( kodeJurusan == 4 ) {
            labelJurusan = "Teknik Industri";
        } else if( kodeJurusan == 5 ) {
            labelJurusan = "Matematika Terapan";
        } else {
            labelJurusan = "Tidak diketahui";
        }

        System.out.println();
        System.out.println("=============================================");
        System.out.println(" KARTU MAHASISWA");
        System.out.println("=============================================");
        System.out.println(" NAMA \t: " + nama.toUpperCase());
        System.out.println(" NIM \t: " + nim);
        System.out.println(" JUR \t: " + labelJurusan);
        System.out.println("=============================================");
    }
}
