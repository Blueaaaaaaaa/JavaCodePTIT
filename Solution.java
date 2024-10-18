import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Lớp Pair kiểu Generic để ghép cặp hai số Integer (mô tả một cạnh).
 *
 * @param <T> Kiểu dữ liệu của phần tử thứ nhất.
 * @param <U> Kiểu dữ liệu của phần tử thứ hai.
 */
class Pair<T, U> {
    private T first;
    private U second;

    /**
     * Hàm khởi tạo cho lớp Pair.
     *
     * @param first  Phần tử thứ nhất.
     * @param second Phần tử thứ hai.
     */
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Lấy giá trị phần tử thứ nhất.
     *
     * @return Giá trị phần tử thứ nhất.
     */
    public T getFirst() {
        return first;
    }

    /**
     * Lấy giá trị phần tử thứ hai.
     *
     * @return Giá trị phần tử thứ hai.
     */
    public U getSecond() {
        return second;
    }

    /**
     * Ghi đè phương thức toString để hiển thị đúng định dạng (u,v).
     *
     * @return Chuỗi đại diện cho cặp (u,v).
     */
    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // Đọc dữ liệu từ tệp "GRAPH.in"
        Scanner in = new Scanner(new File("GRAPH.in"));
        int N = in.nextInt(); // Số lượng đỉnh

        List<Pair<Integer, Integer>> edges = new ArrayList<>();

        // Đọc ma trận kề và chuyển đổi thành danh sách cạnh
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = in.nextInt();
                if (j > i && val == 1) {
                    // Các đỉnh được đánh số từ 1 đến N
                    edges.add(new Pair<>(i + 1, j + 1));
                }
            }
        }
        in.close();

        // In danh sách cạnh theo định dạng yêu cầu
        for (Pair<Integer, Integer> edge : edges) {
            System.out.println(edge);
        }
    }
}

