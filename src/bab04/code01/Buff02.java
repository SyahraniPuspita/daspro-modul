package bab04.code01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff02 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input nama lengkap = ");
            String nama = reader.readLine();

            System.out.print("Input umur = ");
            int umur = Integer.parseInt(reader.readLine());

            System.out.println("Hai " + nama + ". \nSekarang sudah " + umur + " tahun ya.");
        } catch (IOException e) {
            System.out.println("Error saat melakukan input data.");
        }

    }
}
