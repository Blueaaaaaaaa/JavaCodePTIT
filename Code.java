import java.util.*;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            boolean check = true;
            for (int i = 0; i < m; i++) {
                int num = sc.nextInt();
                if (!map.containsKey(num) || map.get(num) == 0) {
                    check = false;
                    break;
                }
                map.put(num, map.get(num) - 1);
            }
            
            System.out.println(check ? "Yes" : "No");
        }
    }
}