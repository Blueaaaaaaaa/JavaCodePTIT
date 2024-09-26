import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class J01006 {
    public static long Fibonacci(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        if (n > 0) {
            fib[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            System.out.println(Fibonacci(n));
        }
    }
}
