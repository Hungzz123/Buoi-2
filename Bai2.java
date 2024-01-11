import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
    // Khai báo biến n và tổng
    int n, sum = 0;

    // Sử dụng Scanner để nhập giá trị của n từ người dùng
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập giá trị của n: ");
    n = scanner.nextInt();

    // Tính tổng từ 1 đến n bằng vòng lặp for
    for (int i = 1; i <= n; ++i) {
        sum += i;
    }

    // In kết quả tổng
    System.out.println("Tổng từ 1 đến " + n + " là: " + sum);

}
}


