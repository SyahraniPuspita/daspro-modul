package bab03.code04;

public class Log05 {
    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        boolean hasil1 = x++ >= y && x < y--;
        boolean hasil2 = y+++x > 18 & y---x == 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(hasil1);
        System.out.println(hasil2);
    }
}
