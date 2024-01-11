import java.util.Scanner;
public class Bai5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập chiều cao của tam giác
            System.out.print("Nhập chiều cao của tam giác: ");
            int height = scanner.nextInt();

            // Vẽ tam giác
            for (int i = 1; i <= height; i++) {
                // In khoảng trắng phía trước mỗi dòng
                for (int j = i; j < height; j++) {
                    System.out.print(" ");
                }

                // In dấu '*' cho dòng đầu và dòng cuối
                // hoặc nếu đang ở dòng giữa và là cạnh bên trái hoặc cạnh bên phải
                for (int j = 1; j <= (2 * i - 1); j++) {
                    if (j == 1 || j == (2 * i - 1) || i == height) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // Xuống dòng
                System.out.println();
            }

            scanner.close();
        }
    }
