import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.sql.*;
import java.util.regex.*;
import java.util.stream.*;


public class Code {
   public static int calculate(int num) {
      int count = 0;
      if (num % 2 != 0) return 0; // Nếu số lẻ thì không có ước số chia hết cho 2
      int sqrt = (int) Math.sqrt(num);
      for (int i = 1 ; i <= sqrt; i++){
         if (num % i == 0){
            int j = num / i;
            if (i % 2 == 0) count++; // Kiểm tra ước số i
            if (j != i && j % 2 == 0) count++; // Kiểm tra ước số đối ứng j
         }
      }
      return count;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int testcase = sc.nextInt();
       while (testcase-- > 0) {
           int n = sc.nextInt();
           System.out.println(calculate(n));
       }
   }
}