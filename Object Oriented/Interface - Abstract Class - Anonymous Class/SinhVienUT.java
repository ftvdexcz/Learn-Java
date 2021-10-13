package InterfaceAndAbstractClass;

public class SinhVienUT implements DenTruong, New1{

    @Override
    public void mang() {
        System.out.println("May tinh, sach, vo, but, ...");
    }

    @Override
    public int takeMoney() {
        return 30000;
    }

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
