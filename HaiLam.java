import java.util.Scanner;

public class HaiLam {
    public static boolean isFibonacci(long n) {
        long a = 0;
        long b = 1;
        if (n == a || n == b) return true;
        long c = a + b;
        while (c <= n) {
            if (c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            if (isFibonacci(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
