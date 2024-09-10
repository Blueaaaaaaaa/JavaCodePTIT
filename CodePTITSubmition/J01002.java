import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        while (test-- > 0) {
            long num = sc.nextInt();
            if (num <= 0) {
                System.out.println("0");
            } else {
                long sum = num * (num + 1) / 2;
                System.out.println(sum);
            }
        }
        sc.close(); // Close the scanner to avoid resource leak
    }
}