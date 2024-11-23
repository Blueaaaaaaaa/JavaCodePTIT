import java.util.Scanner;

class Rectangle {
    // Thuộc tính
    private double width;
    private double height;
    private String color;

    // Constructor không tham số
    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }

    // Constructor có tham số
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter và Setter cho chiều rộng
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter và Setter cho chiều dài
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter và Setter cho màu sắc
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính diện tích
    public double findArea() {
        return width * height;
    }

    // Tính chu vi
    public double findPerimeter() {
        return 2 * (width + height);
    }

    // Hàm chuẩn hóa màu sắc
    public String normalizeColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều rộng, chiều dài và màu sắc
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();

        // Kiểm tra tính hợp lệ của dữ liệu
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            // Tạo đối tượng hình chữ nhật
            Rectangle rectangle = new Rectangle(width, height, color);

            // In thông tin
            System.out.printf("%.0f %.0f %s\n",
                    rectangle.findPerimeter(),
                    rectangle.findArea(),
                    rectangle.normalizeColor());
        }
    }
}
