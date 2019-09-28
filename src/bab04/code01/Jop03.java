package bab04.code01;

import javax.swing.*;

public class Jop03 {
    public static void main(String[] args) {
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Panjang tanah"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Lebar tanah"));
        double luas = panjang * lebar;
        JOptionPane.showMessageDialog(null, "Luas tanah = " + luas);
    }
}
