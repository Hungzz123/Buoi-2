import java.util.Scanner;
public class Bai12 {

        // Hàm in ra dãy số Fibonacci trong khoảng từ 1 đến n
        public static void printFibonacciSeries(int n) {
            int a = 1, b = 2;

            System.out.print("Dãy số Fibonacci trong khoảng từ 1 đến " + n + ": ");
            System.out.print(a + " " + b + " ");

            while (a + b <= n) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào số nguyên n: ");
            int n = scanner.nextInt();

            // Gọi hàm để in ra dãy số Fibonacci trong khoảng từ 1 đến n
            printFibonacciSeries(n);

            scanner.close();
        }
    }
