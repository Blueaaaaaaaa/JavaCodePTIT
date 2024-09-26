import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class HaiLam {
    public static int tong(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer[] arr = new Integer[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return tong(a) - tong(b);
            }
        });
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
