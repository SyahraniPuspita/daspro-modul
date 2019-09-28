package bab04.code01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff03 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input panjang tanah = ");
            double panjang = Double.parseDouble(reader.readLine());

            System.out.print("Input lebar tanah = ");
            double lebar = Double.parseDouble(reader.readLine());

            double luas = panjang * lebar;
            System.out.println("Output luas tanah = " + luas + "m2");
        } catch (IOException e) {
            System.out.println("Error saat input data, coba lagi.");
        }

    }
}
