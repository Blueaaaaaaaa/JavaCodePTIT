import java.util.*;

public class J02007  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Số lượng bộ test
        
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt(); // Số phần tử trong dãy
            Map<Integer, Integer> count = new LinkedHashMap<>(); // Sử dụng LinkedHashMap để giữ thứ tự xuất hiện
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            
            System.out.println("Test " + t + ":");
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
        
        sc.close();
    }
}