import java.util.*;
import java.io.*;
import java.math.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt(i / (double) n) * h);
            }
            System.out.println();
        }
    }
}