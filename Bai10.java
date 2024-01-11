import java.util.Scanner;
public class Bai10 {

        public static void main(String[] args) {
            // Tạo một đối tượng Scanner để nhập từ bàn phím
            Scanner scanner = new Scanner(System.in);

            // Nhập vào số nguyên dương N
            System.out.print("Nhập vào một số nguyên dương N: ");
            int N = scanner.nextInt();

            // Kiểm tra xem N có phải là số hoàn hảo hay không
            if (kiemTraSoHoanHao(N)) {
                System.out.println(N + " là số hoàn hảo.");
            } else {
                System.out.println(N + " không phải là số hoàn hảo.");
            }

            // Đóng đối tượng Scanner sau khi sử dụng
            scanner.close();
        }

        // Hàm kiểm tra số hoàn hảo
        public static boolean kiemTraSoHoanHao(int number) {
            int tongUoc = 0;

            // Duyệt qua các ước của số
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    tongUoc += i;
                }
            }

            // Kiểm tra xem tổng ước có bằng số ban đầu hay không
            return (tongUoc == number);
        }
    }
