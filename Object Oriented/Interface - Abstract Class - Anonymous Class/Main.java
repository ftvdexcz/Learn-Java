package InterfaceAndAbstractClass;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // DenTruong d = new DenTruong(); // error: interface k có constructor
        DenTruong d = new SinhVien(); // gọi được hàm tạo lớp con
        // AbstractNgoaiKhoa a = new AbstractNgoaiKhoa(); // error: abstract class cũng không tạo được đối tượng
        AbstractNgoaiKhoa a = new CauLacBo(1, "IT");
        System.out.println(a.toString());
        
        // Anonymous class 1
        DenTruong dt = new DenTruong() {
            @Override
            public void mang() {
                System.out.println("Thu 3 mang may tinh");
            }

            @Override
            public int takeMoney() {
                return 100000;
            }
        };
        dt.mang();
        dt.ngayPhuNu();
        System.out.println("So tien: " + dt.takeMoney());
        
        // Anonymous class 2 
        AbstractNgoaiKhoa aa = new AbstractNgoaiKhoa(){
            @Override
            public void truocNhapHoc() {
                
            }

            @Override
            public void tuanDau() {
                
            }
        };

        // override in abstract inheritance relationship 
        AbstractNgoaiKhoa ab = new CauLacBo();
        ab.test();
    }
}
