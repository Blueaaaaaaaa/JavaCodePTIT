import java.math.BigInteger;
import java.math.BigDecimal;

public class ViDuBien {
    // 3. Khai báo hằng số
    static final double PI = 3.14159;
    
    // 5. Biến toàn cục
    static int bienToanCuc = 100;

    public static void main(String[] args) {
        // 1. Kiểu dữ liệu nguyên thủy
        int soNguyen = 10;
        double soThuc = 3.14;
        boolean dungSai = true;
        char kyTu = 'A';

        // 2. Kiểu dữ liệu tham chiếu
        String chuoi = "Xin chào Java";
        int[] mangSoNguyen = {1, 2, 3, 4, 5};

        // 4. Ép kiểu
        int x = 5;
        double y = (double) x; // Ép kiểu ngầm định
        int z = (int) 3.14; // Ép kiểu tường minh

        // 6. Kiểu dữ liệu wrapper
        Integer soNguyenWrapper = Integer.valueOf(10);
        Double soThucWrapper = Double.valueOf(3.14);

        // 7. Kiểu dữ liệu enum
        NgayTrongTuan ngay = NgayTrongTuan.THU_HAI;

        // 8. Biến và kiểu dữ liệu trong vòng lặp
        for (int i = 0; i < 5; i++) {
            System.out.println("Giá trị của i: " + i);
        }

        // 9. Sử dụng var (từ Java 10)
        var ten = "Nguyễn Văn A";
        var tuoi = 25;

        // 10. Kiểu dữ liệu BigInteger và BigDecimal
        BigInteger soCucLon = new BigInteger("123456789012345678901234567890");
        BigDecimal soThapPhanChinhXac = new BigDecimal("3.141592653589793238462643383279");

        System.out.println("Các ví dụ trên minh họa các khái niệm về biến và kiểu dữ liệu trong Java.");
        
        // Gọi phương thức để minh họa biến cục bộ
        phuongThuc();
    }

    public static void phuongThuc() {
        int bienCucBo = 50; // Biến cục bộ
        System.out.println("Biến cục bộ: " + bienCucBo);
        System.out.println("Biến toàn cục: " + bienToanCuc);
    }
}

enum NgayTrongTuan {
    THU_HAI, THU_BA, THU_TU, THU_NAM, THU_SAU, THU_BAY, CHU_NHAT
}
