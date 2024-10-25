import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(sc.nextInt());
        }

        int i = 0;
        while (i < sequence.size() - 1) {
            if ((sequence.get(i) + sequence.get(i + 1)) % 2 == 0) {
                sequence.remove(i);
                sequence.remove(i);
                i = Math.max(0, i - 1);
            } else {
                i++;
            }
        }

        System.out.println(sequence.size());

        sc.close();
    }
}