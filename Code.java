import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        while (testcase-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            for (String word : s) {
                System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
