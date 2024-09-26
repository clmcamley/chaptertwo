//Exercise 2.18

public class DisplayTable {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;

        System.out.println("a   b   pow(a, b)");
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a,b));
        a ++;
        b ++;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a,b));
        a ++;
        b ++;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a,b));
        a ++;
        b ++;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a,b));
        a ++;
        b ++;
        System.out.println((int)a + "   " + (int)b + "   " + (int)Math.pow(a,b));
    }
}
