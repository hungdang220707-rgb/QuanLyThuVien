import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        System.out.println("\n--- CHỌN LOẠI SÁCH ---");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
        int chonLoai = scanner.nextInt();
        String tenLoaiSach = "";
        switch (chonLoai) {
            case 1:
                tenLoaiSach = "Sách giáo khoa";
                break;
            case 2:
                tenLoaiSach = "Sách tham khảo";
                break;
            case 3:
                tenLoaiSach = "Sách chuyên ngành";
                break;
            case 4:
                tenLoaiSach = "Sách khác";
                break;
            default:
                tenLoaiSach = "Không xác định";
        }
        boolean hopLe = (donGia > 0) && (soLuong >= 0) && (namXuatBan >= 1000 && namXuatBan <= 2026);
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;
        String phanLoaiGia = "";
        if (donGia < 50000) {
            phanLoaiGia = "Sách giá thấp";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sách giá trung bình";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sách giá cao";
        } else {
            phanLoaiGia = "Sách giá đặc biệt";
        }
        String phanLoaiTonKho = "";
        if (soLuong == 0) {
            phanLoaiTonKho = "Hết sách";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sắp hết";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Còn ít";
        } else {
            phanLoaiTonKho = "Còn nhiều";
        }
        System.out.println("             THÔNG TIN NHẬP KHO               ");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Loại sách: " + tenLoaiSach);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.printf("Đơn giá: %,.2f VNĐ (%s)\n", donGia, phanLoaiGia);
        System.out.println("Số lượng: " + soLuong + " (" + phanLoaiTonKho + ")");
        System.out.printf("Thành tiền: %,.2f VNĐ\n", thanhTien);
        System.out.printf("Phí vận chuyển (5%%): %,.2f VNĐ\n", phiVanChuyen);
        System.out.printf("TỔNG TIỀN NHẬP: %,.2f VNĐ\n", tongTienNhap);
        if (hopLe) {
            System.out.println("Trạng thái: Thông tin sách HỢP LỆ.");
        } else {
            System.out.println("Trạng thái: CẢNH BÁO - Thông tin sách KHÔNG HỢP LỆ (Năm xuất bản phải từ 1000 đến 2026, đơn giá > 0, số lượng >= 0)!");
        }
        scanner.close();
    }
}