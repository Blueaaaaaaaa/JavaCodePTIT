import java.util.*;
import java.util.*;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for ( int test =  1 ; test <= testcase ; test++){
            System.out.print("Test "+ test + ": ");
            int n = sc.nextInt();
            for ( int i = 2; i * i  <=  n; i++){
                int count = 0;
                if (n % i == 0) {
                    while (n % i == 0) {
                        count++;
                        n /= i;
                    }
                    System.out.print(i + "("+ count + ") ");
                }
            }
            if (n > 1) System.out.print(n + "(1)");
            System.out.println();
       }
    }
}
