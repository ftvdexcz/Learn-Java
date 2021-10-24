package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println("Nhập mã vùng cần tìm");
        int maVung = Integer.parseInt(in.nextLine());
        System.out.println("Nhập số điện thoại cần tìm");
        int sdt = Integer.parseInt(in.nextLine());
        System.out.println("Các số điện thoại tìm được:");
        for(PhoneNumber p: list){
            if(maVung == p.getMaVung() && sdt == p.getNoiVung()){
                System.out.println(p);
            }
        }   
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
        System.out.println("Nhập số cuối số điện thoại cần tìm");
        String en = in.nextLine();
        System.out.println("Các số điện thoại tìm được:");
        for(PhoneNumber p: list){
            String tmp = String.valueOf(p.getNoiVung());
            if(tmp.length()-en.length()>=0){
                tmp = tmp.substring(tmp.length()-en.length(), tmp.length());
                if(tmp.equals(en)) System.out.println(p);
            }
            
        }
    }

    @Override
    public void sapXepSDT() {
        Comparator<PhoneNumber> sortPhoneNumber = ((PhoneNumber o1,PhoneNumber o2) -> {
            return o1.getNoiVung()-o2.getNoiVung(); //To change body of generated lambdas, choose Tools | Templates.
        });
        Collections.sort(list, sortPhoneNumber);
    }
}
