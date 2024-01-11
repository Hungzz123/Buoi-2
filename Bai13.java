import java.util.Scanner;
public class Bai13 {

        // Hàm in ra tích lũy thừa các thừa số nguyên tố
        public static void primeFactorization(int n) {
            System.out.print("Tích lũy thừa các thừa số nguyên tố của " + n + ": ");

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào số nguyên n: ");
            int n = scanner.nextInt();

            // Gọi hàm để in ra tích lũy thừa các thừa số nguyên tố của n
            primeFactorization(n);

            scanner.close();
        }
    }