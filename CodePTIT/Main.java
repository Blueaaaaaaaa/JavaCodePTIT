import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt(); 
        sc.nextLine();
        while (testcase --> 0){
            Set<Integer> set1 = new TreeSet<>();
            Set<Integer> set2 = new TreeSet<>();
            int n = sc.nextInt(), m = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++){
                set1.add(sc.nextInt());
            }
            sc.nextLine();
            for (int i = 0; i < m; i++){
                set2.add(sc.nextInt());
            }
            set1.addAll(set2);
            for (int i : set1){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
