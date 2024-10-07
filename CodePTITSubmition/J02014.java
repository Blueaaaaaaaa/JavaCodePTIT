import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            boolean check = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long leftSum = 0;
            for (int i = 0; i < n; i++) {
                if (leftSum == sum - leftSum - a[i]) {
                    System.out.println(i+1);
                    check = true;
                    break;
                }
                leftSum += a[i];
            }
            if (!check) {
                System.out.println("-1");
            }
        }
    }
}