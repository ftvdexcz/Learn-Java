package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLPTGT p = new QLPTGT();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("=============== MENU ===============");
            System.out.println("1.Nhập ô tô");
            System.out.println("2.Nhập xe máy");
            System.out.println("3.Nhập xe tải");
            System.out.println("4.In danh sách các phương tiện");
            System.out.println("5.Tìm kiếm theo mã");
            System.out.println("6.Tìm kiếm theo khoảng giá");
            System.out.println("7.Sắp xếp theo giá");
            System.out.println("8.Thống kê số phương tiện theo màu");
            System.out.println("0.Exit");
            System.out.println("====================================");

            int luachon = Integer.parseInt(in.nextLine());
            System.out.println("Nhập lựa chọn (0->8)");
            switch (luachon) {
                case 1:
                    p.nhapOtO();
                    break;
                case 2:
                    p.nhapXeMay();
                    break;
                case 3:
                    p.nhapXeTai();
                    break;
                case 4:
                    p.InDanhSach();
                    break;
                case 5:
                    p.timKiemTheoMa();
                    break;
                case 6:
                    p.timKiemTheoKhoangGia();
                    break;
                case 7:
                    p.sapXepTheoGia();
                    break;
                case 8:
                    p.ThongKeSoPhuongTienTheoMau();
                    break;
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn từ 0->8!");
            }
        }
    }
}
