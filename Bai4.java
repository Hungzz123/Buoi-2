import java.util.Scanner;
public class Bai4 {

        // Phương thức kiểm tra số nguyên tố
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Nếu số nhỏ hơn hoặc bằng 1, không phải là số nguyên tố
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Nếu có số nào chia hết cho nó, không phải là số nguyên tố
                }
            }

            return true; // Nếu không có số nào chia hết cho nó, là số nguyên tố
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập số từ bàn phím
            System.out.print("Nhập một số nguyên dương: ");
            int num = scanner.nextInt();

            // Kiểm tra và in kết quả
            if (isPrime(num)) {
                System.out.println(num + " là số nguyên tố.");
            } else {
                System.out.println(num + " không là số nguyên tố.");
            }

            scanner.close();
        }
    }
