// Ví dụ về các chức năng của String trong Java

public class StringExample {
    public static void main(String[] args) {
        // Khởi tạo chuỗi
        String str1 = "Xin chào";
        String str2 = new String("Java");

        // Độ dài chuỗi
        System.out.println("Độ dài của str1: " + str1.length());

        // Nối chuỗi
        String str3 = str1 + " " + str2;
        System.out.println("Chuỗi sau khi nối: " + str3);

        // So sánh chuỗi
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // Tìm kiếm trong chuỗi
        System.out.println("Vị trí của 'à' trong str1: " + str1.indexOf('à'));

        // Cắt chuỗi con
        System.out.println("Chuỗi con của str3: " + str3.substring(0, 8));

        // Chuyển đổi chữ hoa/thường
        System.out.println("Chữ hoa: " + str3.toUpperCase());
        System.out.println("Chữ thường: " + str3.toLowerCase());

        // Loại bỏ khoảng trắng đầu/cuối
        String str4 = "  Java String  ";
        System.out.println("Sau khi trim: " + str4.trim());

        // Thay thế ký tự/chuỗi
        System.out.println("Thay thế: " + str3.replace("Java", "Python"));

        // Kiểm tra chuỗi bắt đầu/kết thúc
        System.out.println("Bắt đầu bằng 'Xin': " + str3.startsWith("Xin"));
        System.out.println("Kết thúc bằng 'va': " + str3.endsWith("va"));

        // Chuyển đổi kiểu dữ liệu khác sang String
        int num = 123;
        String str5 = String.valueOf(num);
        System.out.println("Số sau khi chuyển đổi: " + str5);

        // Tách chuỗi thành mảng
        String str6 = "Java,Python,C++";
        String[] languages = str6.split(",");
        System.out.println("Ngôn ngữ thứ 2: " + languages[1]);

        // Kiểm tra chuỗi rỗng
        String str7 = "";
        System.out.println("Chuỗi rỗng: " + str7.isEmpty());

        // Nối chuỗi hiệu quả
        StringBuilder sb = new StringBuilder();
        sb.append("Java ").append("là ").append("tuyệt vời!");
        System.out.println("StringBuilder: " + sb.toString());
    }
}
