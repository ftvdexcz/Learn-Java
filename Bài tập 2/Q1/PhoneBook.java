package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneBook implements ChucNang{
    private List<PhoneNumber> list;
    Scanner in = new Scanner(System.in);

    public PhoneBook() {
        list = new ArrayList<PhoneNumber>();
        list.add(new PhoneNumber(24,36407515));
        list.add(new PhoneNumber(30,34873284));
        list.add(new PhoneNumber(29,58453845));
        list.add(new PhoneNumber(29,32412818));
        list.add(new PhoneNumber(25,65645211));
        list.add(new PhoneNumber(30,43274331));
        list.add(new IntlPhoneNumber(29, 23213125, 84));
        list.add(new IntlPhoneNumber(25, 32132111, 80));
        list.add(new IntlPhoneNumber(24, 57524135, 84));
        list.add(new IntlPhoneNumber(30, 84513411, 77));
        
    }
    
    private PhoneNumber tonTaiMaVung(int maVung){
        for(PhoneNumber i: list){
            if(i.getMaVung() == maVung)
                return i;
        }
        return null;
    }
        
    private PhoneNumber tonTaiMaQuocGia(int maQuocGia){
        for(PhoneNumber i: list){
            if(i instanceof IntlPhoneNumber){
                IntlPhoneNumber p = (IntlPhoneNumber) i; // downcasting
                if(p.getMaQuocGia() == maQuocGia)
                    return i;
            }  
        }
        return null;
    }
  
    @Override
    public void nhapSDT() {
        String regex = "\\d{2,3}";
        int maVung;
        while(true){
            System.out.println("Nhập mã vùng:");
            maVung = Integer.parseInt(in.nextLine()); 
            if(String.valueOf(maVung).matches(regex))
                break;
            System.err.println("Nhập lại mã vùng hợp lệ!");
        }
        
        System.out.println("Nhập số điện thoại");
        int noiVung = Integer.parseInt(in.nextLine());
        list.add(new PhoneNumber(maVung, noiVung));
    }

    @Override
    public void nhapSDTQuocTe() {
        String regex = "\\d{2,3}";
        int maVung;
        while(true){
            System.out.println("Nhập mã vùng:");
            maVung = Integer.parseInt(in.nextLine()); 
            if(String.valueOf(maVung).matches(regex))
                break;
            System.err.println("Nhập lại mã vùng hợp lệ!");
        }
        
        System.out.println("Nhập số điện thoại");
        int noiVung = Integer.parseInt(in.nextLine());
        
        int maQuocGia = Integer.parseInt(in.nextLine());
        list.add(new IntlPhoneNumber(maVung,noiVung,maQuocGia));
    }

    @Override
    public void timSDTTheoMaVung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lietKeSDT() {
        System.out.println("Danh sách số điện thoại trong nước");
        for(PhoneNumber p: list){
            if (!(p instanceof IntlPhoneNumber))
                System.out.println(p);
        }
    }

    @Override
    public void lietKeSDTQuocTe() {
        System.out.println("Danh sách số điện thoại quốc tế");
        for(PhoneNumber p: list){
            if (p instanceof IntlPhoneNumber)
                System.out.println(p);
        }
    }

    @Override
    public void tinhTongSDTTheoVung() {
        Map<Integer,Integer> count = list.stream().collect(Collectors.groupingBy(
                PhoneNumber::getMaVung, Collectors.summingInt(PhoneNumber::getNoiVung)
        ));
        System.out.println(count);
    }

    @Override
    public void timSDTTheoDuoi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapXepSDT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
