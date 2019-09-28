package bab04.code01;

import javax.swing.*;

public class Jop02 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Nama Lengkap");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Umur"));
        System.out.println("Hai " + nama + ". Tak terasa umur kamu sudah " + umur + " tahun.");
    }
}
