import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> sa = new TreeSet<>();
        TreeSet<Integer> sb = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            sa.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            sb.add(sc.nextInt());
        }
        sa.retainAll(sb);
        for (int i : sa) {
            System.out.print(i + " ");
        }
    }
}
