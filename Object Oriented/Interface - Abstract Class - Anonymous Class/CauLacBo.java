package InterfaceAndAbstractClass;

public class CauLacBo extends AbstractNgoaiKhoa{

    public CauLacBo() {
    }

    public CauLacBo(int id, String name) {
        super(id, name);
    }
    
    @Override
    public void truocNhapHoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tuanDau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void test(){
        System.out.println("child");
    }
}
