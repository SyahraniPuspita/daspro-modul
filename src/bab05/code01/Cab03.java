package bab05.code01;

import java.util.Scanner;

public class Cab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai: ");
        int nilai = input.nextInt();
        if( nilai > 55 ) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda gagal");
        }
    }
}
