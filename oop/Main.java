import java.util.*;
import java.lang.Math;

public class Main {
   public static long Fibo(int n) {
      if (n == 1 || n == 2) {
         return 1;
      }
      long f1 = 1, f2 = 1;
      long fibo = 0;
      for (int i = 3; i <= n; i++) { 
         fibo = f1 + f2;
         f1 = f2;
         f2 = fibo;
      }
      return fibo;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCases = sc.nextInt();
      while (testCases-- > 0) {
         int n = sc.nextInt(); 
         System.out.println(Fibo(n)); 
      }
   }
}