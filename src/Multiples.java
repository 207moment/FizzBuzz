public class Multiples {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += checkMultiple(i);
        }
        System.out.println(count);
    }
    private static int checkMultiple(int n) {
        boolean divby3 = n % 3 ==0;
        boolean divby5 = n % 5 == 0;

        if (divby3 || divby5) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
