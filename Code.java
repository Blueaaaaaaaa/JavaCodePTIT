import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Read the adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Generate and print the adjacency list
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            List<Integer> adjacentVertices = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    adjacentVertices.add(j + 1);
                }
            }
            System.out.println(String.join(" ", adjacentVertices.stream().map(String::valueOf).toArray(String[]::new)));
        }

        sc.close();
    }
}