package bab03.code04;

public class Log04 {
    public static void main(String[] args) {
        int x = 9;
        int y = 4;
        int z = 1;
        boolean hasil1 = x >= y;
        boolean hasil2 = y != z;
        boolean hasil3 = z == x;
        System.out.println(hasil1 & hasil2);
        System.out.println(hasil2 | hasil2);
        System.out.println(hasil3 ^ hasil1);
    }
}
