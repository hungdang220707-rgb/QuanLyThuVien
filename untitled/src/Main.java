import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon = -1;

        int tongSoLuong = 0;
        double tongGiaTri = 0;
        String duLieuSach = "";

        do {
            System.out.println("\n========== MENU THƯ VIỆN ==========");
            System.out.println("1. Nhập n sách (Bài 1)");
            System.out.println("2. Tính tổng số lượng và tổng giá trị (Bài 2)");
            System.out.println("3. Tìm sách theo mã (Bài 4)");
            System.out.println("0. Thoát (Bài 3)");
            System.out.print("Chọn chức năng: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng sách (n): ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 1; i <= n; i++) {
                        System.out.println("--- Nhập sách thứ " + i + " ---");
                        System.out.print("Mã sách: ");
                        String ma = sc.nextLine();
                        System.out.print("Tên sách: ");
                        String ten = sc.nextLine();
                        System.out.print("Số lượng: ");
                        int sl = Integer.parseInt(sc.nextLine());
                        System.out.print("Giá: ");
                        double gia = Double.parseDouble(sc.nextLine());
                        tongSoLuong += sl;
                        tongGiaTri += (sl * gia);
                        duLieuSach += "Mã: " + ma + " | Tên: " + ten + " | SL: " + sl + " | Giá: " + gia + "\n";
                    }
                    break;

                case 2:
                    System.out.println("Tổng số lượng sách: " + tongSoLuong);
                    System.out.println("Tổng giá trị sách: " + tongGiaTri);
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();

                    if (duLieuSach.contains("Mã: " + maTim + " |")) {
                        System.out.println("-> TÌM THẤY! Dữ liệu khớp trong hệ thống:\n");
                        System.out.print(duLieuSach);
                    } else {
                        System.out.println("-> Không tìm thấy mã sách: " + maTim);
                    }
                    break;

                case 0:
                    System.out.println("Đang thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 0 đến 3.");
            }
        } while (chon != 0);
        sc.close();
    }
}