import java.util.Scanner;

public class HaiLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.println(sum);
    }
}
