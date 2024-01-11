import java.util.Scanner;
    public class Bai9 {
        public static void main(String[] args) {
            // Tạo một đối tượng Scanner để nhập từ bàn phím
            Scanner scanner = new Scanner(System.in);

            // Hiển thị menu lựa chọn
            System.out.println("Cuối tuần bạn muốn làm gì?");
            System.out.println("1. Đi học java");
            System.out.println("2. Đi chơi công viên ngắm gấu");
            System.out.println("3. Đi (về) nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");


            // Nhập lựa chọn từ người dùng
            System.out.print("Chọn một số từ menu: ");
            int luaChon = scanner.nextInt();

            // Sử dụng switch-case để thực hiện lựa chọn
            switch (luaChon) {
                case 1:
                    System.out.println("Bạn chọn đi học java. Thật là một ý tưởng tốt!");
                    break;
                case 2:
                    System.out.println("Bạn chọn đi chơi công viên ngắm gấu. Thật tuyệt vời!");
                    break;
                case 3:
                    System.out.println("Bạn chọn đi (về) nhà nghỉ. Chắc chắn sẽ có những trải nghiệm thú vị!");
                    break;
                case 4:
                    System.out.println("Bạn chọn Ra sông Hồng tắm tiên. Đôi khi cần có những khoảnh khắc thư giãn.");
                    break;
                case 5:
                    System.out.println("Bạn chọn Ngủ cả ngày. Hãy thử những điều mới mẻ!");
                    break;
                case 6:
                    System.out.println("Bạn chọn Thoát. Chúc bạn có một ngày mới vui vẻ, hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 6.");
            }

            // Đóng đối tượng Scanner sau khi sử dụng
            scanner.close();
        }
    }

