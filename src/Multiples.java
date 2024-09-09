public class Multiples {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            checkMultiple(i);
        }
    }
    private static void checkMultiple(int n) {
        boolean divby3 = n % 3 ==0;
        boolean divby5 = n % 5 == 0;

        if (divby3) {
            System.out.println(n);
            return;
        }
        if (divby5) {
            System.out.println(n);
        }
    }
}
