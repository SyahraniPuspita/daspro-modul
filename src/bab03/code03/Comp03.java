package bab03.code03;

public class Comp03 {
    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        boolean hasil1 = ++x >= y;
        boolean hasil2 = x++ <= y++;
        boolean hasil3 = x-- < --y;
        boolean hasil4 = x < y;
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
    }
}
