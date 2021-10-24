package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLPTGT implements ChucNang {

    private List<PTGT> list;
    Scanner in = new Scanner(System.in);

    public QLPTGT() {
        list = new ArrayList<PTGT>();
        list.add(new Oto("HN324", "Toyota", 2007, 80000.54, "red", "I4", 7));
        list.add(new Oto("HN111", "Huyndai", 2019, 100000.72, "black", "V6", 4));
        list.add(new Oto("SG534", "Civic", 2015, 95000, "white", "I6", 4));
        list.add(new Oto("HN367", "Kia", 2018, 60000.65, "blue", "I4", 4));
        list.add(new Oto("HN244", "Kia", 2016, 73200.677, "pink", "I4", 4));
        list.add(new Oto("SG894", "BMW", 2019, 150000.55, "white", "V4", 4));
        list.add(new Oto("HP776", "Toyota", 2012, 89501.54, "white", "I4", 7));

        list.add(new XeMay("HN645", "Honda", 2017, 3500, "blue", 87.9));
        list.add(new XeMay("HP351", "Yamaha", 2018, 4400, "white", 100.62));
        list.add(new XeMay("SG235", "Yamaha", 2015, 3310, "green", 66.9));
        list.add(new XeMay("HP125", "Honda", 2012, 3300, "gray", 45.9));
        list.add(new XeMay("HN980", "Honda", 2014, 3200.2, "white", 43.4));

        list.add(new XeTai("HP920", "ISUZU", 2011, 45000.5, "white", 20));
        list.add(new XeTai("SG330", "HINO", 2009, 37000.53, "black", 15.5));
        list.add(new XeTai("HP117", "HUYNDAI", 2013, 55000.5, "black", 26.5));
        list.add(new XeTai("HN667", "ISUZU", 2011, 46100.4, "white", 22.3));
    }

    private PTGT tonTaiMa(String ma) {
        for (PTGT p : list) {
            if (p.getMa().equals(ma)) {
                return p;
            }
        }
        return null;
    }

    private PTGT nhap() {
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
        regex = "[A-Za-z]+";
        String hangSX;
        while (true) {
            System.out.println("Nhập hãng sản xuất");
            hangSX = in.nextLine();
            if (hangSX.matches(regex)) {
                break;
            }
            System.err.println("Nhập lại hãng sản xuất!");
        }

        regex = "\\d{4}";
        int namSX;
        while (true) {
            System.out.println("Nhập năm sản xuất");
            namSX = Integer.parseInt(in.nextLine());
            if (String.valueOf(namSX).matches(regex)) {
                break;
            }
            System.err.println("Nhập lại hãng sản xuất!");
        }
        System.out.println("Nhập giá bán");
        double gia = Double.parseDouble(in.nextLine());
        System.out.println("Nhập màu");
        String mau = in.nextLine();
        return (new PTGT(ma, hangSX, namSX, gia, mau));
    }

    @Override
    public void nhapOtO() {
        PTGT p = nhap();
        System.out.println("Nhập kiểu động cơ ô tô");
        String kieuDongCo = in.nextLine();
        System.out.println("Nhập số chỗ ngồi ô tô");
        int soChoNgoi = Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getMa(), p.getHangSX(), p.getNamSX(), p.getGia(), p.getMau(), kieuDongCo, soChoNgoi));
    }

    @Override
    public void nhapXeMay() {
        PTGT p = nhap();
        System.out.println("Nhập công suất xe máy");
        Double congSuat = Double.parseDouble(in.nextLine());
        list.add(new XeMay(p.getMa(), p.getHangSX(), p.getNamSX(), p.getGia(), p.getMau(), congSuat));
    }

    @Override
    public void nhapXeTai() {
        PTGT p = nhap();
        System.out.println("Nhập trọng tải xe tải");
        Double trongTai = Double.parseDouble(in.nextLine());
        list.add(new XeTai(p.getMa(), p.getHangSX(), p.getNamSX(), p.getGia(), p.getMau(), trongTai));
    }

    @Override
    public void InDanhSach() {
        int count = 0;
        System.out.println("Danh sách xe ô tô");
        for (PTGT p : list) {
            if (p instanceof Oto) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " ô tô");
        System.out.println("==================");

        count = 0;
        System.out.println("Danh sách xe máy");
        for (PTGT p : list) {
            if (p instanceof XeMay) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " xe máy");
        System.out.println("==================");

        count = 0;
        System.out.println("Danh sách xe tải");
        for (PTGT p : list) {
            if (p instanceof XeTai) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " xe tải");
    }

    @Override
    public void timKiemTheoMa() {
        String regex = "[A-Z]{2}\\d{3}";
        String ma;
        while (true) {
            System.out.println("Nhập mã");
            ma = in.nextLine();
            if (ma.matches(regex)) {
                break;
            }
            System.err.println("Nhập lại mã theo chuẩn!");
        }
        PTGT p = tonTaiMa(ma);
        if (p != null) {
            System.out.println("Tìm thấy phương tiện với mã " + ma);
            System.out.println(p);
        } else {
            System.out.println("Không thấy!");
        }
    }

    @Override
    public void timKiemTheoKhoangGia() {
        double st, en;
        System.out.println("Nhập giá tối thiểu");
        st = Double.parseDouble(in.nextLine());
        while (true) {
            System.out.println("Nhập giá tối đa");
            en = Double.parseDouble(in.nextLine());
            if (en >= st) {
                break;
            }
            System.err.println("Nhập lại giá lớn hơn!");
        }
        System.out.println("Các phương tiện với giá trong khoảng đã nhập:");
        for (PTGT p : list) {
            if (p.getGia() >= st && p.getGia() <= en) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void sapXepTheoGia() {
        Comparator<PTGT> sortByValue = (PTGT o1, PTGT o2) -> {
            return Double.compare(o1.getGia(), o2.getGia()); //To change body of generated lambdas, choose Tools | Templates.
        };

        Collections.sort(list, sortByValue);
    }

    @Override
    public void ThongKeSoPhuongTienTheoMau() {
        System.out.println("Thống kê số phương tiện theo màu:");
        Map<String, Long> count = list.stream().collect(Collectors.groupingBy(PTGT::getMau, Collectors.counting()));
        System.out.println(count);
    }

    @Override
    public void timKiemOtoTheoSoCho() {
        System.out.println("Nhập số chỗ ô tô cần tìm kiếm");
        int soCho = Integer.parseInt(in.nextLine());
        List<Oto> l = new ArrayList<>();
        for (PTGT p : list) {
            if (p instanceof Oto) {
                l.add((Oto) p);
            }
        }

        System.out.println("Các ô tô có số chỗ đã nhập:");
        for (Oto i : l) {
            if (i.getSoChoNgoi() == soCho) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void sua() {
        String regex = "[A-Z]{2}\\d{3}";
        String ma;
        while (true) {
            System.out.println("Nhập mã");
            ma = in.nextLine();
            if (ma.matches(regex)) {
                break;
            }
            System.err.println("Nhập lại mã theo chuẩn!");
        }
        PTGT p = tonTaiMa(ma);
        if (p != null) {
            System.out.println("Tìm thấy phương tiện với mã " + ma);
            regex = "[A-Za-z]+";
            String hangSX;
            while (true) {
                System.out.println("Nhập hãng sản xuất");
                hangSX = in.nextLine();
                if (hangSX.matches(regex)) {
                    break;
                }
                System.err.println("Nhập lại hãng sản xuất!");
            }

            regex = "\\d{4}";
            int namSX;
            while (true) {
                System.out.println("Nhập năm sản xuất");
                namSX = Integer.parseInt(in.nextLine());
                if (String.valueOf(namSX).matches(regex)) {
                    break;
                }
                System.err.println("Nhập lại hãng sản xuất!");
            }
            System.out.println("Nhập giá bán");
            double gia = Double.parseDouble(in.nextLine());
            System.out.println("Nhập màu");
            String mau = in.nextLine();
            p.setGia(gia);
            p.setHangSX(hangSX);
            p.setMau(mau);
            p.setNamSX(namSX);
        } else {
            System.out.println("Không thấy!");
        }
    }

    @Override
    public void xoa() {
        String regex = "[A-Z]{2}\\d{3}";
        String ma;
        while (true) {
            System.out.println("Nhập mã");
            ma = in.nextLine();
            if (ma.matches(regex)) {
                break;
            }
            System.err.println("Nhập lại mã theo chuẩn!");
        }
        PTGT p = tonTaiMa(ma);
        if(p!=null){
            list.remove(p);
        }else{
            System.out.println("Không thấy!");
        }
    }
}
