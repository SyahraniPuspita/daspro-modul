package bab05.code01;

import java.util.Scanner;

public class Cab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("X: ");
        int x = input.nextInt();
        System.out.println("Y: ");
        int y = input.nextInt();
        if( x > y ) {
            System.out.println("Selisih: " + (x-y));
        } else {
            System.out.println("Selisih: " + (y-x));
        }
    }
}
