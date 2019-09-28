package bab03.code04;

public class Log07 {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        boolean z = x++ == --y && x++ > y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
