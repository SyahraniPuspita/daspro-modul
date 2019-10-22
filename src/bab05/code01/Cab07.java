package bab05.code01;

import java.util.Scanner;

public class Cab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        if( username.equals("admin") && password.equals("1234") ) {
            System.out.println("Selamat datang Admin!");
        } else {
            System.out.println("Username atau password salah!");
        }
    }
}
