/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLGD implements ChucNang {

    private List<GiaoDich> list;
    Scanner in = new Scanner(System.in);

    public QLGD() {
        list = new ArrayList<>();
        
        list.add(new GiaoDichVang("HN123", "12/12/2001", 2000, 3, 1));
        list.add(new GiaoDichVang("DN356", "4/7/2013", 5400.5, 1, 3));
        list.add(new GiaoDichVang("SG545", "2/6/2011", 2410.65, 2, 2));
        list.add(new GiaoDichVang("HN454", "4/7/2005", 2000, 5, 1));
        list.add(new GiaoDichVang("HN873", "9/10/2020", 6700.665, 2, 3));
        
        list.add(new GiaoDichTienTe("HN546", "9/9/2015", 4456.3, 10, 20000, "USD"));
        list.add(new GiaoDichTienTe("DN532", "9/19/2016", 4676.3, 50, 0, "VN"));
        list.add(new GiaoDichTienTe("HP891", "19/9/2019", 5956.31, 27, 0, "VN"));
        list.add(new GiaoDichTienTe("HN736", "10/10/2018", 8256.34, 38, 18000, "EURO"));
        
        list.add(new GiaoDichDat("HN198", "5/6/2021", 351321.44, 1, 2));
        list.add(new GiaoDichDat("HP812", "5/12/2011", 232135.55, 1, 1));
        list.add(new GiaoDichDat("HP409", "12/5/2015", 982323.5, 1, 1));
    }

    private GiaoDich tonTaiMa(String ma) {
        for (GiaoDich p : list) {
            if (p.getMa().equals(ma)) {
                return p;
            }
        }
        return null;
    }

    private GiaoDich nhap() {
        String regex = "[A-Z]{2}\\d{3}";
        String ma;
        while (true) {
            System.out.println("Nhập mã");
            ma = in.nextLine();
            if (ma.matches(regex) && tonTaiMa(ma) == null) {
                break;
            }
            System.err.println("Nhập lại mã!");
        }
        System.out.println("Nhập ngày giao dịch");
        String ngayGiaoDich = in.nextLine();
        System.out.println("Nhập đơn giá");
        Double gia = Double.parseDouble(in.nextLine());
        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(in.nextLine());
        return (new GiaoDich(ma, ngayGiaoDich, gia, soLuong));
    }

    @Override
    public void themGDVang() {
        GiaoDich p = nhap();
        System.out.println("Nhập loại vàng");
        int loaiVang = Integer.parseInt(in.nextLine());
        list.add(new GiaoDichVang(p.getMa(), p.getNgayGiaoDich(), p.getGia(), p.getSoLuong(), loaiVang));
    }

    @Override
    public void themGDTienTe() {
        GiaoDich p = nhap();
        System.out.println("Nhập tỉ giá");
        double tiGia = Double.parseDouble(in.nextLine());
        System.out.println("Nhập loại tiền tệ");
        String loaiTien = in.nextLine();
        list.add(new GiaoDichTienTe(p.getMa(), p.getNgayGiaoDich(), p.getGia(), p.getSoLuong(), tiGia, loaiTien));
    }

    @Override
    public void themGDDat() {
        GiaoDich p = nhap();
        System.out.println("Nhập loại đất");
        int loaiDat = Integer.parseInt(in.nextLine());
        list.add(new GiaoDichDat(p.getMa(), p.getNgayGiaoDich(), p.getGia(), p.getSoLuong(), loaiDat));
    }

    @Override
    public void hienThiGD() {
        int count = 0;
        System.out.println("Danh sách giao dịch vàng");
        for (GiaoDich p : list) {
            if (p instanceof GiaoDichVang) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " giao dịch vàng");
        System.out.println("==================");

        count = 0;
        System.out.println("Danh sách giao dịch đất");
        for (GiaoDich p : list) {
            if (p instanceof GiaoDichDat) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " giao dịch đất");
        System.out.println("==================");

        count = 0;
        System.out.println("Danh sách giao dịch tiền");
        for (GiaoDich p : list) {
            if (p instanceof GiaoDichTienTe) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " giao dịch tiền");
    }

    @Override
    public void hienThiGDTheoNgay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
