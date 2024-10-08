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

public class J01013 {

   static int a[] = new int[2000001];

   public static void Era() {
       for (int i = 2; i * i <= 2000000; i++)
           if (a[i] == 0)
               for (int j = i * i; j <= 2000000; j += i)
                   a[j] = i;
       for (int i = 2; i <= 2000000; i++)
           if (a[i] == 0)
               a[i] = i;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Era();
       Long s = 0L;
       int t = sc.nextInt();
       while (t-- > 0) {
           int n = sc.nextInt();
           while (n != 1) {
               s += a[n];
               n /= a[n];
           }
       }
       System.out.print(s);
   }
}