import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int count = 1;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < num - 1; i++){
            boolean swapped = false;
            int minn = arr[i];
            int id_swap = i;
            for (int j = i+1 ; j< num ; j++){
                if( arr[j] < minn){
                    minn = arr[j];
                    id_swap = j;
                    swapped = true;
                }
            }
            if (swapped){
                int temp = arr[i];
                arr[i] = arr[id_swap];
                arr[id_swap] = temp;
            }
            System.out.print("Buoc "+count+": ");
            for (int x: arr){
                System.out.print(x + " ");
            }
            System.out.println();
            count++;
        }
    }
}