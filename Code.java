import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            long n = sc.nextLong();
            long res = 1;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    res = i;
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n > 1) {
                res = n;
            }
            System.out.println(res);
        }
    }
}
