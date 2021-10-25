package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class QLGV implements ChucNang{
    List<GiangVien> list;

    public QLGV() {
        list = new ArrayList<GiangVien>();
        list.add(new GiangVienCoHuu(1600, "CN182", "Thao", "Thao123@gmail.com", "pho giao su" , "tien si", "ha noi", 43423424, 50));
        list.add(new GiangVienCoHuu(2100, "AT331", "Quynh", "Quynh323@gmail.com", "khong" , "dai hoc", "ha noi", 426412311, 41));
        list.add(new GiangVienThinhGiang("CN774", "Hoa", "Hoa@gmail.com", "khong", "thac si", "ha noi", 754754747, 15.5, "CoQuan"));
        list.add(new GiangVienThinhGiang("CN114", "THoa", "THoa@gmail.com", "khong", "thac si", "ha noi", 55232123, 21, "CoQuan"));
    }
    
    @Override
    public void nhapGVCoHuu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhapGVThinhGiang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDanhSach() {
        int count = 0;
        System.out.println("Giảng viên cơ hữu");
        for(GiangVien p:list){
            if(p instanceof GiangVienCoHuu){
                System.out.println(p);
                count++;
            }  
        }
        System.out.println("Có " + count + " giảng viên cơ hữu");
        count = 0;
        System.out.println("=======================");
        
        System.out.println("Giảng viên thỉnh giảng");
        for(GiangVien p:list){
            if(p instanceof GiangVienThinhGiang){
                count++;
                System.out.println(p);
            }
                
        }
        System.out.println("Có " + count + " giảng viên thỉnh giảng");
    }

    @Override
    public void xoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapXepHeSoLuong() {
        Comparator<GiangVien> sortHeSo = (o1, o2) -> {
            return Double.compare(o1.getHeSo(), o2.getHeSo());
        };
        
        Collections.sort(list, sortHeSo);
    }

    @Override
    public void sapXepLuongNhanDuoc() {
        Comparator<GiangVien> sortLuong = (o1, o2) -> {
            return Double.compare(o1.getLuong(), o2.getLuong());
        };
        
        Collections.sort(list, sortLuong);
    }

    @Override
    public void tongLuong() {
        
    }

    @Override
    public void luongCaoNhat() {
        Optional<GiangVien> max = list.stream().collect(Collectors.maxBy(
                Comparator.comparing(GiangVien::getLuong)));
        System.out.println(max.isPresent()?max.get():"DS rỗng");
    }
    
}
