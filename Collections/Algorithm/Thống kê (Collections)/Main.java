package ThongKe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<SinhVien> l = new ArrayList<SinhVien>();
        l.add(new SinhVien("B18", "VNA", Boolean.TRUE, "19/12/2001", 9.6));
        l.add(new SinhVien("B19", "ABC", Boolean.FALSE, "1/1/2013", 5.4));
        l.add(new SinhVien("B20", "NHA", Boolean.FALSE, "6/12/2005", 6.6));
        l.add(new SinhVien("B18", "VNA", Boolean.TRUE, "1/1/2001", 7.6));
        l.add(new SinhVien("B17", "VNA", Boolean.FALSE, "9/2/2001", 8.9));
        l.add(new SinhVien("B16", "VNA", Boolean.TRUE, "15/4/2003", 5.3));
        l.add(new SinhVien("B14", "VNA", Boolean.FALSE, "13/4/2004", 2.7));

        for (SinhVien s : l) {
            System.out.println(s);
        }

        // Đếm theo giới tính
        System.out.println("Đếm theo giới tính");
        Map<Boolean, Long> count = l.stream().collect(Collectors.groupingBy(
                SinhVien::getGioiTinh, Collectors.counting()
        ));
        // In Map
        for (Boolean i : count.keySet()) {
            System.out.println(((i) ? "Nam" : "Nữ") + ":" + count.get(i));
        }

        // Điểm cao nhất theo từng tháng
        System.out.println("Điểm cao nhất theo từng tháng");
        Map<Integer, SinhVien> Max = l.stream().collect(Collectors.groupingBy(
                SinhVien::getThangSinh, Collectors.collectingAndThen(Collectors.reducing(
                        (SinhVien p1, SinhVien p2) -> p1.getDiem() > p2.getDiem() ? p1 : p2),
                        Optional::get)
        ));
        for (Integer i: Max.keySet()){
            System.out.println(i + ":" + Max.get(i));
        }
    }
}
