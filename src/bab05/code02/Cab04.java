package bab05.code02;

import java.util.Scanner;

public class Cab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 5000000; // 5 juta
        System.out.print("Jumlah transfer (maks 5jt): ");
        int amt = input.nextInt();

        if( amt < 50000 ) {
            System.out.println("Transfer gagal. Minimal transfer Rp50.000,-");
        } else if( amt > max ) {
            System.out.println("Transfer gagal. Maksimal transfer Rp5.000.000,-");
        } else {
            System.out.println("Transfer berhasil!");
        }
    }
}
