import java.util.Scanner;

public class J02021  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
        int count = 0;
        while (true) {
            count++;
            for (int i = 1; i <= k; i++) {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            int i = k;
            while (i > 0 && a[i] == n - k + i) {
                i--;
            }
            if (i == 0) {
                break;
            }
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
        System.out.println("\nTong cong co " + count + " to hop");
    }
}