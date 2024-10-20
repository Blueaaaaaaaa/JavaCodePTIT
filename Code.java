import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        while (testcase-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            for (int i = 1 ; i < s.length ; i++) {
                System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1));
                if (i != s.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(", " + s[0].toUpperCase());
        }
    }
}
