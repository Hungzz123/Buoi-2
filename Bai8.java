import java.util.Scanner;
public class Bai8 {
        public static void main(String[] args) {
            // Tạo một đối tượng Scanner để nhập từ bàn phím
            Scanner scanner = new Scanner(System.in);

            // Nhập vào số nguyên dương N
            System.out.print("Nhập vào một số nguyên dương N: ");
            int N = scanner.nextInt();

            // Kiểm tra N có nhỏ hơn 16 hay không (để tránh tràn số nguyên)
            if (N < 16) {
                // Khởi tạo biến giaiThua để lưu giá trị giai thừa, đặt giá trị ban đầu là 1
                int giaiThua = 1;

                // Tính giai thừa của N
                for (int i = 1; i <= N; i++) {
                    giaiThua *= i;
                }

                // In ra kết quả
                System.out.println(N + "! = " + giaiThua);
            } else {
                System.out.println("Vui lòng nhập số nguyên dương N nhỏ hơn hoặc bằng 15 để tránh tràn số nguyên.");
            }

            // Đóng đối tượng Scanner sau khi sử dụng
            scanner.close();
        }
    }
