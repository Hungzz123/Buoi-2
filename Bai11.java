public class Bai11 {
    // Hàm kiểm tra xem một số có phải là số hoàn hảo hay không
    public static boolean isPerfectNumber(int num) {
        int divisorsSum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisorsSum += i;
            }
        }
        return divisorsSum == num;
    }

    // Hàm in ra các số hoàn hảo từ 1 đến n
    public static void printPerfectNumbersUpToN(int n) {
        System.out.println("Các số hoàn hảo từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Sử dụng hàm để in ra các số hoàn hảo từ 1 đến n (ví dụ n = 100)
        printPerfectNumbersUpToN(100);
    }
}