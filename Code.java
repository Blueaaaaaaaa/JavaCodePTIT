import java.util.Scanner;

public class Code {
    static int n;
    static int[] a;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new int[n + 1];
            used = new boolean[n + 1];
            Try(1);
            System.out.println();
        }
    }

    static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j] && (i == 1 || Math.abs(j - a[i - 1]) != 1)) {
                a[i] = j;
                used[j] = true;
                if (i == n) {
                    in();
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }

    static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}