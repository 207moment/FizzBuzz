public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        while (num != 0) {

            num = numReduce(num);
            count += 1;
        }
        System.out.println(count);
    }
    public static int numReduce(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        else {
            return n - 1;
        }
    }
}
