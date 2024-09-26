import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class J01004 {
    public static int primes(int n) {
        if (n < 2){
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            if (primes(n) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
