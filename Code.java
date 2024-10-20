import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> emailCount = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] nameParts = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder email = new StringBuilder();
            
            // Add the last name (full)
            email.append(nameParts[nameParts.length - 1]);
            
            // Add initials of first and middle names
            for (int j = 0; j < nameParts.length - 1; j++) {
                email.append(nameParts[j].charAt(0));
            }
            
            String baseEmail = email.toString() + "@ptit.edu.vn";
            
            // Check if email already exists and add number if necessary
            if (emailCount.containsKey(baseEmail)) {
                int count = emailCount.get(baseEmail) + 1;
                emailCount.put(baseEmail, count);
                System.out.println(email.toString() + count + "@ptit.edu.vn");
            } else {
                emailCount.put(baseEmail, 1);
                System.out.println(baseEmail);
            }
        }
    }
}
