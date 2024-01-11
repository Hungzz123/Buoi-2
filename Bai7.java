import java.util.Scanner;

public class Bai7{
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên dương N
        System.out.print("Nhập vào một số nguyên dương N: ");
        int N = scanner.nextInt();

        // In ra các số lẻ nhỏ hơn N bằng vòng lặp for
        System.out.println("Các số lẻ nhỏ hơn " + N + " là:");
        for (int i = 1; i < N; i += 2) {
            System.out.println(i);
        }

        // Tính tổng bình phương của các số lẻ nhỏ hơn N
        int tongBinhPhuong = 0;
        for (int i = 1; i < N; i += 2) {
            tongBinhPhuong += i * i;
        }

        // In ra tổng bình phương của các số lẻ nhỏ hơn N
        System.out.println("Tổng bình phương của các số lẻ nhỏ hơn " + N + " là: " + tongBinhPhuong);

        // Khởi tạo biến để tính tổng các số dương từ 1 đến N
        int tong = 0;

        // Đếm số lượng các số dương từ 1 đến N
        int soLuong = 0;

        // Nhập các số từ 1 đến N và tính tổng
        for (int i = 1; i <= N; i++) {
            tong += i;
            soLuong++;
        }

        // Tính trung bình cộng
        double trungBinhCong = (double) tong / soLuong;

        // In ra trung bình cộng
        System.out.println("Trung bình cộng của các số dương từ 1 đến " + N + " là: " + trungBinhCong);

        // In ra các số chẵn lớn hơn trung bình cộng
        System.out.println("Các số chẵn lớn hơn trung bình cộng là:");
        for (int i = 2; i <= N; i += 2) {
            if (i > trungBinhCong) {
                System.out.println(i);
            }
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}