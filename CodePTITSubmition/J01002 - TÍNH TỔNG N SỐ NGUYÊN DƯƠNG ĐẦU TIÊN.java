import java.util.Scanner;

public class Submition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0 ; i < test ; i++ ){
            long n = sc.nextLong();
            long tong = (n + 1)*n/2;
            System.out.println(tong);
        }
    }
}