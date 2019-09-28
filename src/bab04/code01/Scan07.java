package bab04.code01;

import java.util.Scanner;

public class Scan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Hai Budi. \nApa kabar?");
        System.out.println("Output line 1:  " + scanner.next());
        System.out.println("Output line 2:  " + scanner.next());
        System.out.println("Output line 3:  " + scanner.next());
        System.out.println("Output line 4:  " + scanner.next());
    }
}
