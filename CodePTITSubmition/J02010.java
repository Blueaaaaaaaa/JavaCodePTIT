import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int count = 1;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < num; i++){
            boolean swapped = false;
            for (int j = i+1 ; j< num ; j++){
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        if (swapped){
            System.out.print("Buoc "+count+": ");
            for (int x: arr){
                System.out.print(x + " ");
            }
            System.out.println();
            count ++;
        }
        }
    }
}