import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BÀI 1: Nhập thông tin sách
        System.out.println("NHẬP THÔNG TIN SÁCH");
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ") ;
        int namXuatBan = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        //  BÀI 2: Tính thành tiền
        double thanhTien = donGia * soLuong;
        //  BÀI 3: Tính phí vận chuyển
        double phiVanChuyen = thanhTien * 0.05;
        //  BÀI 4: Tính tổng tiền nhập
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("       THÔNG TIN NHẬP KHO        ");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.printf("Đơn giá: %,.2f VNĐ\n", donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.printf("Thành tiền: %,.2f VNĐ\n", thanhTien);
        System.out.printf("Phí vận chuyển (5%%): %,.2f VNĐ\n", phiVanChuyen);
        System.out.printf("TỔNG TIỀN NHẬP: %,.2f VNĐ\n", tongTienNhap);
        scanner.close();
    }
}
