package bab05.code02;

import java.util.Scanner;

public class Cab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 5000000; // 5 juta
        System.out.print("Jumlah transfer (maks 5jt): ");
        int amt = input.nextInt();
        if( amt <= max ) {
            System.out.println("Transfer berhasil: " + amt);
        } else {
            System.out.println("Transfer gagal!");
        }
    }
}
