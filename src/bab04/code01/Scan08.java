package bab04.code01;

import java.util.Scanner;

public class Scan08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input panjang tanah = ");
        double panjang = scanner.nextDouble();

        System.out.print("Input lebar tanah = ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Output luas = " + luas);;
    }
}
