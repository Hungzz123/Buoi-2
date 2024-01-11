import java.util.Scanner;

public class Bai3 {
    // Phương thức tính ước chung lớn nhất (GCD)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Phương thức tính bội chung nhỏ nhất (LCM)
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính và in ra ước chung lớn nhất (GCD)
        int gcd = findGCD(num1, num2);
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd);

        // Tính và in ra bội chung nhỏ nhất (LCM)
        int lcm = findLCM(num1, num2);
        System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + lcm);

        scanner.close();
    }
}
