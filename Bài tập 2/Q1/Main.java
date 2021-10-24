package Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("=============== MENU ===============");
            System.out.println("1.Nhập số điện thoại mới");
            System.out.println("2.Tìm số điện thoại theo mã vùng");
            System.out.println("3.Liệt kê danh sách số điện thoại");
            System.out.println("4.Tính tổng số điện thoại theo mã vùng");
            System.out.println("5.Tìm số điện thoại theo đuôi");
            System.out.println("6.Sắp xếp số điện thoại");
            System.out.println("0.Exit");
            System.out.println("====================================");
            
            int luachon = Integer.parseInt(in.nextLine());
            System.out.println("Nhập lựa chọn (0->6)");
            switch(luachon){
              case 1:
                  System.out.println("1.Nhập số điện thoại mới");
                  System.out.println("Chọn 1 để nhập sdt trong nước, 2 để nhập sdt quốc tế");
                  int c;
                  do{
                    c = Integer.parseInt(in.nextLine());
                    if(c==1)
                      p.nhapSDT();
                    else
                      p.nhapSDTQuocTe();
                  }while(c != 1 && c != 2);
                  break;
              case 2:
                  p.timSDTTheoMaVung();
                  break;
              case 3:
                  System.out.println("3.Liệt kê danh sách số điện thoại");
                  System.out.println("Chọn 1 để liệt kê sdt trong nước, 2 để liệt kê sdt quốc tế, 3 để liệt kê cả 2");
                  do{
                    c = Integer.parseInt(in.nextLine());
                    if(c==1)
                      p.lietKeSDT();
                    else if(c == 2)
                      p.lietKeSDTQuocTe();
                    else{
                        p.lietKeSDT();
                        System.out.println("=======================");
                        p.lietKeSDTQuocTe();
                    }
                  }while(c != 1 && c != 2 && c != 3);
                  break;
              case 4:
                  p.tinhTongSDTTheoVung();
                  break;
              case 5:
                  p.timSDTTheoDuoi();
                  break;
              case 6:
                  p.sapXepSDT();
                  break;
              case 0:
                  System.out.println("Exit");
                  System.exit(0);
                  break;
              default:
                  System.out.println("Chọn từ 0->6!");
            }
        }
    }
}
