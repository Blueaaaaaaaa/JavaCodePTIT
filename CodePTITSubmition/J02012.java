import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            res.add(arr[i]);
            Collections.sort(res);
            System.out.printf("Buoc %d: ", i);
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}