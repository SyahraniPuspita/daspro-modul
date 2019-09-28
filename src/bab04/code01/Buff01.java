package bab04.code01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff01 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input = ");
            String teks = reader.readLine();
            System.out.println("Output = " + teks);
        } catch (IOException e) {
            System.out.println("Error saat input data. Silahkan coba lagi.");
        }
    }
}
