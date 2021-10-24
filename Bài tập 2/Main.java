package Q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLGD p = new QLGD();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("=============== MENU ===============");
            System.out.println("1.Nhập giao dịch vàng");
            System.out.println("2.Nhập giao dịch tiền");
            System.out.println("3.Nhập giao dịch đất");
            System.out.println("4.In danh sách các giao dịch");
            System.out.println("5.In danh sách giao dịch theo ngày");
            System.out.println("0.Exit");
            System.out.println("====================================");
            System.out.println("Nhập lựa chọn (0->5)");
            int luachon = Integer.parseInt(in.nextLine());
            switch (luachon) {
                case 1:
                    p.themGDVang();
                    break;
                case 2:
                    p.themGDTienTe();
                    break;
                case 3:
                    p.themGDDat();
                    break;
                case 4:
                    p.hienThiGD();
                    break;
                case 5:
                    p.hienThiGDTheoNgay();
                    break;
               
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn từ 0->5!");
            }
        }
    }
}

