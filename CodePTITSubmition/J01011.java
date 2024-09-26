import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }
}
