import java.util.*;
import java.math.*;

public class J02008{
    public static long gcd(long a, long b){
        if ( b ==0 ){
            return a;
        }
        return gcd ( b , a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase --> 0){
            int num = sc.nextInt();
            long result = 1;
            for ( int i = 1 ; i <= num ; i++ ){
                result = result*i / gcd(result,i);
            }
            System.out.println(result);
        }
    }
}