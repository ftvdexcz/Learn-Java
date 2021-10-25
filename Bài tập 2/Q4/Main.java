package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLGV p = new QLGV();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("=============== MENU ===============");
            System.out.println("1.Nhập giảng viên cơ hữu");
            System.out.println("2.Nhập giảng viên thỉnh giảng");
            System.out.println("3.In danh sách giảng viên");
            System.out.println("4.Xóa");
            System.out.println("5.Sửa");
            System.out.println("6.Sắp xếp theo lương");
            System.out.println("7.Sắp xếp theo hệ số lương");
            System.out.println("8.Giảng viên lương cao nhất");
            System.out.println("0.Exit");
            System.out.println("====================================");
            System.out.println("Nhập lựa chọn (0->8)");
            int luachon = Integer.parseInt(in.nextLine());
            switch (luachon) {
                case 1:
                    p.nhapGVCoHuu();
                    break;
                case 2:
                    p.nhapGVThinhGiang();
                    break;
                case 3:
                    p.inDanhSach();
                    break;
                case 4:
                    p.xoa();
                    break;
                case 5:
                    p.sua();
                    break;
                case 6:
                    p.sapXepLuongNhanDuoc();
                    break;
                case 7:
                    p.sapXepHeSoLuong();
                    break;
                case 8:
                    p.luongCaoNhat();
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
