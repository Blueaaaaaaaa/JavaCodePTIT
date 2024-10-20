import java.util.*;

public class Code {
    public static String Reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        while (testcase-- > 0) {
            String s = sc.nextLine();
            boolean check = true;
            // if (s != Reverse(s)) {
            //     check = false;
            // }
            for (int i = 0 ; i < s.length() ; i++) {
                if ((s.charAt(i) - '0') % 2 != 0) {
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
