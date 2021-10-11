package arrayObj;
import java.util.Scanner;

public class QLQuay {
    private int MAX=100;
    private TaiLieu[] list;
    private int n;
    private Scanner in = new Scanner(System.in);
    public QLQuay(){
        list=new TaiLieu[100];
        n=0;
        list[n++] = new Sach(1, "Ha noi vui tuoi", "To An An", 10000, 600);
        list[n++] = new SachIT(2, "OOP", "Nguyen Manh Son", 25000, true);
        list[n++] = new Sach(3, "Chiec luoc nga", "Nguyen Quang Sang", 35000, 200);
    }
    
    public void viet(){
        System.out.println("Danh sach sach");
        for(int i = 0; i < n; i++){
            if(list[i] instanceof Sach)
                System.out.println(list[i].toString());
        }
        System.out.println("Danh sach sach IT");
        for (int i = 0; i < n; i++) {
            if(list[i] instanceof SachIT)
                System.out.println(list[i].toString());
        }
    }
    
    public TaiLieu tontai(int m){
        for(int i = 0; i < n; i++){
            if(list[i].getMa()==m) return list[i];
        }
        return null;
    }
    
    private TaiLieu nhap(){
        int ma;
        String ten;
        String tacGia;
        double gia;
        while(true){
            System.out.println("Nhap ma");
            ma = Integer.parseInt(in.nextLine());
            if(tontai(ma)==null) break; // Nếu chưa tồn tại tài liệu có mã m thì thoát 
            System.err.println("Nhap lai");
        }
        
        System.out.println("Nhap ten");
        ten = in.nextLine();
        System.out.println("Nhap tac gia");
        tacGia = in.nextLine();
        System.out.println("Nhap gia");
        gia = Double.parseDouble(in.nextLine());
        return new TaiLieu(ma,ten,tacGia,gia);
    }
    
    public void nhapSach(){
        TaiLieu t = nhap();
        System.out.println("Nhap so trang");
        int st=Integer.parseInt(in.nextLine());
        list[n++] = new Sach(t.getMa(), t.getTen(), t.getTacGia(), t.getGia(), st);
    }
    
    public void nhapSachIT(){
        TaiLieu t = nhap();
        System.out.println("Nhap co dia hay khong (true or false)");
        boolean dia=Boolean.parseBoolean(in.nextLine());
        list[n++] = new SachIT(t.getMa(), t.getTen(), t.getTacGia(), t.getGia(), dia);
    }
    
    public void timTheoMa(){
        System.out.println("Ma can tim");
        int ma = Integer.parseInt(in.nextLine());
        TaiLieu t = tontai(ma);
        if(t==null){
            System.out.println("Tai Lieu khong ton tai");
        }else{
            System.out.println(t);
        }
    }
    
    public void timTheoTen(){
        System.out.println("Ten can tim");
        String ten = in.nextLine();
        boolean co=false;
        for (int i = 0; i < n; i++) {
            if(list[i].getTen().toLowerCase().indexOf(ten)>=0){ // trả về chỉ số của string tìm thấy trong string khác, không thấy trả về -1
                System.out.println(list[i]);
                co=true;
            } 
        }
        if(!co) System.out.println("Khong co");
    }
}
