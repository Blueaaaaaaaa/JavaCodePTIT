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
            if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
                check = false;
            }
            int sum = 0;
            for (int i = 0 ; i < s.length() ; i++) {
                sum += s.charAt(i) - '0';
            }
            if (sum % 10 != 0) {
                check = false;
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
