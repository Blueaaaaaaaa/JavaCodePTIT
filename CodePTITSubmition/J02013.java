import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped) {
                System.out.printf("Buoc %d: ", i + 1);
                for (int x = 0; x < n; x++) {
                    System.out.print(arr[x] + " ");
                }
                System.out.println();
            } else {
                break;
            }
        }
    }
}