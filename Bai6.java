import java.util.Scanner;
public class Bai6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập chiều dài và chiều rộng của hình chữ nhật
            System.out.print("Nhập chiều dài của hình chữ nhật: ");
            int length = scanner.nextInt();

            System.out.print("Nhập chiều rộng của hình chữ nhật: ");
            int width = scanner.nextInt();

            // Vẽ hình chữ nhật
            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= width; j++) {
                    // Kiểm tra xem có ở biên của hình chữ nhật không
                    // Nếu ở biên hoặc ở đỉnh hình chữ nhật, in dấu '*'
                    // Ngược lại, in khoảng trắng
                    if (i == 1 || i == length || j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // Xuống dòng sau khi in một dòng của hình chữ nhật
                System.out.println();
            }

            scanner.close();
        }
    }
