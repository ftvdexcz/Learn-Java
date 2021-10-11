package arrayObj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLQuay q = new QLQuay();
        while(true){
            System.out.println("-----------MENU-----------");
            System.out.println("1. Nhap vao sach");
            System.out.println("2. Nhap vao sach IT");
            System.out.println("3. Danh sach sach trong quay");
            System.out.println("4. Tim theo ma");
            System.out.println("5. Tim theo ten");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            
            int luachon;
            Scanner in = new Scanner(System.in);
            System.out.println("Ban chon (0->3):");
            luachon=in.nextInt();
            switch(luachon){
                case 0:
                    System.out.println("Thoat!");
                    System.exit(0);
                case 1:
                    q.nhapSach();
                    break;
                case 2:
                    q.nhapSachIT();
                    break;
                case 3:
                    q.viet();
                    break;
                case 4:
                    q.timTheoMa();
                    break;
                case 5:
                    q.timTheoTen();
                    break;
            }
        }
    }
}
