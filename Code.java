import java.util.*;

public class Code {
    public static boolean Check(String s) {
        for (char x : s.toCharArray()) {
            if (x != '0' && x != '1' && x != '8' && x != '9') return false;
        }
        return true;
    }

    public static String cutInHalf(String s) {
        StringBuilder result = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (x == '0' || x == '1') result.append(x);
            else if (x == '8' || x == '9') result.append('0');
        }
        return result.toString().replaceFirst("^0+(?!$)", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for (int test = 1; test <= testcase; test++) {
            String s = sc.nextLine();
            if (Check(s)) {
                String result = cutInHalf(s);
                if (result.isEmpty() || result.equals("0")) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(result);
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
