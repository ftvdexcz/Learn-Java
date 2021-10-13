package InterfaceAndAbstractClass;

public class SinhVien implements DenTruong, New1{
    @Override
    public void mang() {
        System.out.println("Sach, But, Tien");
    }

    @Override
    public int takeMoney() {
        return 50000;
    }

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
