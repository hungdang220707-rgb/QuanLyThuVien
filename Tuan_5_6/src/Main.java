import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon = -1;

        // Sử dụng ArrayList theo yêu cầu tuần 6 để quản lý dữ liệu linh hoạt
        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<String> dsTenSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsGia = new ArrayList<>();

        do {
            System.out.println("\n========== MENU QUẢN LÝ THƯ VIỆN (TUẦN 6) ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa thông tin sách theo mã");
            System.out.println("6. Tính tổng số lượng sách");
            System.out.println("7. Tính tổng giá trị sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            switch (chon) {
                case 1: // Thêm sách
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập giá: ");
                    double gia = Double.parseDouble(sc.nextLine());

                    dsMaSach.add(ma);
                    dsTenSach.add(ten);
                    dsSoLuong.add(sl);
                    dsGia.add(gia);
                    System.out.println("-> Thêm sách thành công!");
                    break;

                case 2: // Hiển thị sách
                    if (dsMaSach.isEmpty()) {
                        System.out.println("-> Thư viện hiện đang trống!");
                    } else {
                        System.out.println("\n--- DANH SÁCH THƯ VIỆN ---");
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            System.out.println((i + 1) + ". Mã: " + dsMaSach.get(i)
                                    + " | Tên: " + dsTenSach.get(i)
                                    + " | Số lượng: " + dsSoLuong.get(i)
                                    + " | Giá: " + dsGia.get(i));
                        }
                    }
                    break;

                case 3: // Tìm sách theo mã
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                            System.out.println("-> TÌM THẤY:");
                            System.out.println("Mã: " + dsMaSach.get(i)
                                    + " | Tên: " + dsTenSach.get(i)
                                    + " | Số lượng: " + dsSoLuong.get(i)
                                    + " | Giá: " + dsGia.get(i));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("-> Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4: // Xóa sách theo mã
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    int indexXoa = -1;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                            indexXoa = i;
                            break;
                        }
                    }

                    if (indexXoa != -1) {
                        dsMaSach.remove(indexXoa);
                        dsTenSach.remove(indexXoa);
                        dsSoLuong.remove(indexXoa);
                        dsGia.remove(indexXoa);
                        System.out.println("-> Đã xóa thành công sách có mã: " + maXoa);
                    } else {
                        System.out.println("-> Không tìm thấy mã sách cần xóa!");
                    }
                    break;

                case 5: // Sửa thông tin sách theo mã
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = sc.nextLine();
                    int indexSua = -1;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                            indexSua = i;
                            break;
                        }
                    }

                    if (indexSua != -1) {
                        System.out.print("Nhập tên sách mới: ");
                        dsTenSach.set(indexSua, sc.nextLine());
                        System.out.print("Nhập số lượng mới: ");
                        dsSoLuong.set(indexSua, Integer.parseInt(sc.nextLine()));
                        System.out.print("Nhập giá mới: ");
                        dsGia.set(indexSua, Double.parseDouble(sc.nextLine()));
                        System.out.println("-> Cập nhật thông tin thành công!");
                    } else {
                        System.out.println("-> Không tìm thấy mã sách cần sửa!");
                    }
                    break;

                case 6: // Tính tổng số lượng
                    int tongSL = 0;
                    for (int slTemp : dsSoLuong) {
                        tongSL += slTemp;
                    }
                    System.out.println("-> Tổng số lượng sách trong thư viện: " + tongSL);
                    break;

                case 7: // Tính tổng giá trị
                    double tongGT = 0;
                    for (int i = 0; i < dsSoLuong.size(); i++) {
                        tongGT += dsSoLuong.get(i) * dsGia.get(i);
                    }
                    System.out.println("-> Tổng giá trị sách trong thư viện: " + tongGT);
                    break;

                case 0:
                    System.out.println("Đang thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 0 đến 7.");
            }
        } while (chon != 0);

        sc.close();
    }
}